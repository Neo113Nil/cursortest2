package ru.CryptoPro.JCPRequest.ca15.decoder;

/* loaded from: classes4.dex */
public class CA15Certificate extends SimpleHTMLDecoder {
    public byte[] b;

    public CA15Certificate(String str) {
        this.a = str;
    }

    public byte[] getDerEncodedCertificate() {
        return this.b;
    }
}
