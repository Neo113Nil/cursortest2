package ru.CryptoPro.JCPRequest.ca15.decoder;

/* loaded from: classes4.dex */
public class CA15CertificateRequestIdentifier extends SimpleHTMLDecoder {
    public String b;

    public CA15CertificateRequestIdentifier(String str) {
        this.a = str;
    }

    public String getCertificateRequestIdentifier() {
        return this.b;
    }
}
