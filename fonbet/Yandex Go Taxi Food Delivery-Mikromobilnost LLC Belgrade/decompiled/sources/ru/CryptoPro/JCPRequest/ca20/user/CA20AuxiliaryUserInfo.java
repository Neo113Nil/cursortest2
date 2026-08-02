package ru.CryptoPro.JCPRequest.ca20.user;

/* loaded from: classes4.dex */
public class CA20AuxiliaryUserInfo {
    public String a;
    public String b;
    public String c;
    public String d;

    public CA20AuxiliaryUserInfo(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public String getComment() {
        return this.a;
    }

    public String getDescription() {
        return this.b;
    }

    public String getEMail() {
        return this.c;
    }

    public String getKeyPhrase() {
        return this.d;
    }

    public void setComment(String str) {
        this.a = str;
    }

    public void setDescription(String str) {
        this.b = str;
    }

    public void setEMail(String str) {
        this.c = str;
    }

    public void setKeyPhrase(String str) {
        this.d = str;
    }

    public String toString() {
        return "comment: " + this.a + ", description: " + this.b + ", email: " + this.c + ", key phrase: " + this.d;
    }
}
