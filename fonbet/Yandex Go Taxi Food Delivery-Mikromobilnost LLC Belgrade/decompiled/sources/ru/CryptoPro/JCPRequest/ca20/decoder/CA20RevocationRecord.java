package ru.CryptoPro.JCPRequest.ca20.decoder;

import defpackage.unr0;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class CA20RevocationRecord extends CA20CertificateRequestRecord {
    public String e;

    public CA20RevocationRecord(String str, String str2, String str3, String str4, Map map) {
        super(str2, str3, str4, map);
        this.e = str;
    }

    public String getRevRequestId() {
        return this.e;
    }

    public void setRevRequestId(String str) {
        this.e = str;
    }

    @Override // ru.CryptoPro.JCPRequest.ca20.decoder.CA20CertificateRequestRecord, ru.CryptoPro.JCPRequest.ca20.status.CA20Status
    public String toString() {
        return unr0.r(new StringBuilder("revocation request id: "), this.e, Extension.FIX_SPACE, super.toString());
    }
}
