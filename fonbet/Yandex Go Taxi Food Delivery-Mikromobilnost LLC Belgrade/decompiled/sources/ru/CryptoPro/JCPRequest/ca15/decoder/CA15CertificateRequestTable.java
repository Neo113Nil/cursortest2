package ru.CryptoPro.JCPRequest.ca15.decoder;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class CA15CertificateRequestTable extends SimpleHTMLDecoder {
    public final HashMap b = new HashMap();

    public CA15CertificateRequestTable(String str) {
        this.a = str;
    }

    public Map getCertificateRequestMap() {
        return this.b;
    }
}
