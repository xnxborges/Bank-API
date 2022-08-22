package com.eprogramar.bankapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "accounts")
public class Account {

  @Id @GeneratedValue
  Long id;
  String name;
  String document;
  String phone;

}
