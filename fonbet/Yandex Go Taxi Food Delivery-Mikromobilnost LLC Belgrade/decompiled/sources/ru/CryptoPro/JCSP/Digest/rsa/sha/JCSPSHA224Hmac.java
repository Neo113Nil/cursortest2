package ru.CryptoPro.JCSP.Digest.rsa.sha;

import ru.CryptoPro.JCSP.Digest.cl_2;

/* loaded from: classes4.dex */
public final class JCSPSHA224Hmac extends cl_2 {
    public static final String STR_NAME = "HMAC_SHA224";
    public static final String STR_OID = "1.2.840.113549.2.8";
    private static final int a = 28;
    private static final int b = 33053;

    public JCSPSHA224Hmac() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA224Hmac(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 28;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 33053;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 33053;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return "1.2.840.113549.2.8";
    }

    public JCSPSHA224Hmac(JCSPSHA224Hmac jCSPSHA224Hmac) {
        super(jCSPSHA224Hmac);
    }
}
