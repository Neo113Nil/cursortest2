package ru.CryptoPro.JCPRequest.ca20.status;

/* loaded from: classes4.dex */
public class CA20UserRegisterInfoStatus extends CA20Status {
    public String b;
    public String c;
    public String d;

    public CA20UserRegisterInfoStatus(String str, String str2, String str3, String str4) {
        super(str4);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public String getPassword() {
        return this.c;
    }

    public String getReqRequestId() {
        return this.d;
    }

    public String getTokenID() {
        return this.b;
    }

    public void setPassword(String str) {
        this.c = str;
    }

    public void setRegRequestId(String str) {
        this.d = str;
    }

    public void setTokenID(String str) {
        this.b = str;
    }

    @Override // ru.CryptoPro.JCPRequest.ca20.status.CA20Status
    public String toString() {
        return "token id: " + this.b + ", password: " + this.c + ", registration request id: " + this.d + ", status: " + this.a;
    }
}
