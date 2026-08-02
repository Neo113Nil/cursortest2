package ru.CryptoPro.JCPRequest.ca15.status;

/* loaded from: classes4.dex */
public class CA15RequestStatus extends CA15Status {
    public final String l;

    public CA15RequestStatus(int i, String str) {
        super(i);
        this.l = str;
    }

    public String getRequestIdentifier() {
        return this.l;
    }
}
