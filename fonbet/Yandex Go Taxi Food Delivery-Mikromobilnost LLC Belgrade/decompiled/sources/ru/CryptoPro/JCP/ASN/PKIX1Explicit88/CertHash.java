package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;

/* loaded from: classes4.dex */
public class CertHash extends Asn1OctetString {
    public CertHash() {
    }

    public CertHash(byte[] bArr) {
        super(bArr);
    }

    public CertHash(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public CertHash(String str) throws Asn1ValueParseException {
        super(str);
    }
}
