package ru.CryptoPro.JCSP.Digest.rsa.sha3;

import ru.CryptoPro.JCSP.Digest.cl_2;

/* loaded from: classes4.dex */
public final class JCSPSHA3_224Hmac extends cl_2 {
    public static final String STR_NAME = "HMAC_SHA3_224";
    public static final String STR_OID = "2.16.840.1.101.3.4.2.13";
    private static final int a = 28;
    private static final int b = 32845;

    public JCSPSHA3_224Hmac() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA3_224Hmac(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 28;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 32845;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 32845;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return "2.16.840.1.101.3.4.2.13";
    }

    public JCSPSHA3_224Hmac(JCSPSHA3_224Hmac jCSPSHA3_224Hmac) {
        super(jCSPSHA3_224Hmac);
    }
}
