package com.example.myapplication;

import static com.example.myapplication.R.id.editTextTextPersonLastName;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    EditText userName;
    EditText password;
    EditText name;
    EditText lastName;

    public LoginActivity(){}

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name=(EditText)findViewById(R.id.editTextTextPersonName);
        lastName=(EditText)findViewById(editTextTextPersonLastName);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        userName=(EditText)findViewById(R.id.edtUsername);
        password=(EditText)findViewById(R.id.edtPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(userName.getText().toString(),password.getText().toString(),name.getText().toString(),lastName.getText().toString());
            }
        });
    }
    public LoginActivity(Context context){

    }

    public String validate(String userName, String password, String name, String lastName)
    {
        if(userName.equals("admin") && password.equals("admin"))
            return "Login was successful";
        else
            return "Invalid login!";
    }
}