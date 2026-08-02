package ru.CryptoPro.JCSP.Digest.rsa.sha3;

import ru.CryptoPro.JCSP.Digest.cl_2;

/* loaded from: classes4.dex */
public final class JCSPSHA3_256Hmac extends cl_2 {
    public static final String STR_NAME = "HMAC_SHA3_256";
    public static final String STR_OID = "2.16.840.1.101.3.4.2.14";
    private static final int a = 32;
    private static final int b = 32846;

    public JCSPSHA3_256Hmac() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA3_256Hmac(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 32;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 32846;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 32846;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return "2.16.840.1.101.3.4.2.14";
    }

    public JCSPSHA3_256Hmac(JCSPSHA3_256Hmac jCSPSHA3_256Hmac) {
        super(jCSPSHA3_256Hmac);
    }
}
