package ru.CryptoPro.JCSP.Digest.rsa.sha;

import ru.CryptoPro.JCSP.Digest.cl_2;

/* loaded from: classes4.dex */
public final class JCSPSHA256Hmac extends cl_2 {
    public static final String STR_NAME = "HMAC_SHA256";
    public static final String STR_OID = "1.2.840.113549.2.9";
    private static final int a = 32;
    private static final int b = 32780;

    public JCSPSHA256Hmac() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA256Hmac(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 32;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 32780;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 32780;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return "1.2.840.113549.2.9";
    }

    public JCSPSHA256Hmac(JCSPSHA256Hmac jCSPSHA256Hmac) {
        super(jCSPSHA256Hmac);
    }
}
