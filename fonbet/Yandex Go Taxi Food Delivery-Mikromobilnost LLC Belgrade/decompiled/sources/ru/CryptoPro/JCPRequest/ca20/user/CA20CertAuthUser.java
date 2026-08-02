package ru.CryptoPro.JCPRequest.ca20.user;

import defpackage.kr61;
import java.security.KeyStore;
import java.util.Map;

/* loaded from: classes4.dex */
public class CA20CertAuthUser extends CA20User {
    public final kr61 e;

    public CA20CertAuthUser(KeyStore keyStore, String str, KeyStore keyStore2, String str2) {
        this.d = str2;
        this.e = new kr61(keyStore, str, keyStore2);
    }

    public kr61 getCertAuthInfo() {
        return this.e;
    }

    @Override // ru.CryptoPro.JCPRequest.ca20.user.CA20User
    public String getUrlApiPart() {
        return "/2/api";
    }

    @Override // ru.CryptoPro.JCPRequest.ca15.user.CAUser
    public boolean isCertAuthorization() {
        return true;
    }

    @Override // ru.CryptoPro.JCPRequest.ca20.user.CA20User, ru.CryptoPro.JCPRequest.ca15.user.CAUser
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        kr61 kr61Var = this.e;
        if (kr61Var != null) {
            sb.append(", key store: " + kr61Var.a);
            sb.append(", key store password: " + kr61Var.b);
            sb.append(", trust store: " + kr61Var.c);
        }
        return sb.toString();
    }

    public CA20CertAuthUser(String str) {
        this.e = null;
        this.d = str;
    }

    public CA20CertAuthUser(KeyStore keyStore, String str, KeyStore keyStore2, Map map, String str2) {
        super(map, str2);
        this.e = new kr61(keyStore, str, keyStore2);
    }
}
