package ru.CryptoPro.JCPRequest.ca20.status;

/* loaded from: classes4.dex */
public class CA20RequestStatus extends CA20Status {
    public String b;

    public CA20RequestStatus(String str, String str2) {
        super(str2);
        this.b = str;
    }

    public String getCertRequestId() {
        return this.b;
    }

    public void setCertRequestId(String str) {
        this.b = str;
    }

    @Override // ru.CryptoPro.JCPRequest.ca20.status.CA20Status
    public String toString() {
        return "certificate request id: " + this.b + ", status: " + this.a;
    }
}
