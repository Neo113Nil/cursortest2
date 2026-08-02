package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BigInteger;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class CertificateSerialNumber extends Asn1BigInteger {
    public CertificateSerialNumber() {
    }

    public CertificateSerialNumber(BigInteger bigInteger) {
        super(bigInteger);
    }

    public CertificateSerialNumber(String str) {
        super(str);
    }

    public CertificateSerialNumber(String str, int i) {
        super(str, i);
    }
}
