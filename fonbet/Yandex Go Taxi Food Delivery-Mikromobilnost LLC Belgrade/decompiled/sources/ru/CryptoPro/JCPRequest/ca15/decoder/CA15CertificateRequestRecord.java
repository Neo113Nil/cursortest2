package ru.CryptoPro.JCPRequest.ca15.decoder;

import ru.CryptoPro.JCPRequest.ca15.status.CA15Status;

/* loaded from: classes4.dex */
public class CA15CertificateRequestRecord extends SimpleHTMLDecoder {
    public String b;
    public String c;
    public String d;
    public String e;
    public CA15Status f;
    public String g;

    public CA15CertificateRequestRecord(String str) {
        this.a = str;
    }

    public String getApprovalDate() {
        return this.d;
    }

    public String getCertificateRequestIdentifier() {
        return this.b;
    }

    public String getComment() {
        return this.e;
    }

    public String getPkcs10() {
        return this.g;
    }

    public String getSentDate() {
        return this.c;
    }

    public CA15Status getStatus() {
        return this.f;
    }
}
