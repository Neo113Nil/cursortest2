package ru.CryptoPro.JCSP.Digest.rsa.sha3;

import ru.CryptoPro.JCSP.Digest.cl_2;

/* loaded from: classes4.dex */
public final class JCSPSHA3_512Hmac extends cl_2 {
    public static final String STR_NAME = "HMAC_SHA3_512";
    public static final String STR_OID = "2.16.840.1.101.3.4.2.16";
    private static final int a = 64;
    private static final int b = 32848;

    public JCSPSHA3_512Hmac() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA3_512Hmac(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 64;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 32848;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 32848;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return "2.16.840.1.101.3.4.2.16";
    }

    public JCSPSHA3_512Hmac(JCSPSHA3_512Hmac jCSPSHA3_512Hmac) {
        super(jCSPSHA3_512Hmac);
    }
}
