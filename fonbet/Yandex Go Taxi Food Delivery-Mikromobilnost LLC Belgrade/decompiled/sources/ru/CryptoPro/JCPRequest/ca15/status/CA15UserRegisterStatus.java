package ru.CryptoPro.JCPRequest.ca15.status;

/* loaded from: classes4.dex */
public class CA15UserRegisterStatus extends CA15Status {
    public final String l;

    public CA15UserRegisterStatus(int i, String str) {
        super(i);
        this.l = str;
    }

    public String getRegistrationId() {
        return this.l;
    }
}
