package ru.CryptoPro.JCPRequest.ca15.status;

/* loaded from: classes4.dex */
public class CA15UserRegisterInfoStatus extends CA15Status {
    public final String l;
    public final String m;

    public CA15UserRegisterInfoStatus(int i, String str, String str2) {
        super(i);
        this.l = str;
        this.m = str2;
    }

    public String getPassword() {
        return this.m;
    }

    public String getTokenID() {
        return this.l;
    }
}
