package ru.CryptoPro.JCSP.Digest.rsa.sha;

import ru.CryptoPro.JCSP.Digest.cl_2;

/* loaded from: classes4.dex */
public final class JCSPSHA1Hmac extends cl_2 {
    public static final String STR_NAME = "HMAC_SHA1";
    public static final String STR_OID = "1.2.840.113549.2.7";
    private static final int a = 20;
    private static final int b = 32772;

    public JCSPSHA1Hmac() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA1Hmac(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 20;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 32772;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 32772;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return "1.2.840.113549.2.7";
    }

    public JCSPSHA1Hmac(JCSPSHA1Hmac jCSPSHA1Hmac) {
        super(jCSPSHA1Hmac);
    }
}
