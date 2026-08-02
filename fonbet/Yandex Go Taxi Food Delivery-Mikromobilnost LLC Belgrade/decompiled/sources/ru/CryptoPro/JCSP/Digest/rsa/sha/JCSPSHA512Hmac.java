package ru.CryptoPro.JCSP.Digest.rsa.sha;

import ru.CryptoPro.JCSP.Digest.cl_2;

/* loaded from: classes4.dex */
public final class JCSPSHA512Hmac extends cl_2 {
    public static final String STR_NAME = "HMAC_SHA512";
    public static final String STR_OID = "1.2.840.113549.2.11";
    private static final int a = 64;
    private static final int b = 32782;

    public JCSPSHA512Hmac() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA512Hmac(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 64;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 32782;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 32782;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return "1.2.840.113549.2.11";
    }

    public JCSPSHA512Hmac(JCSPSHA512Hmac jCSPSHA512Hmac) {
        super(jCSPSHA512Hmac);
    }
}
