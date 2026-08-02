package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1ValueParseException;

/* loaded from: classes4.dex */
public class SubjectKeyIdentifier extends KeyIdentifier {
    public SubjectKeyIdentifier() {
    }

    public SubjectKeyIdentifier(byte[] bArr) {
        super(bArr);
    }

    public SubjectKeyIdentifier(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public SubjectKeyIdentifier(String str) throws Asn1ValueParseException {
        super(str);
    }
}
