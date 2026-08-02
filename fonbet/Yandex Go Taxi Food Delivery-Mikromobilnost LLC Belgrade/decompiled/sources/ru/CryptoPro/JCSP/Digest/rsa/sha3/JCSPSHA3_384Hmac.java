package ru.CryptoPro.JCSP.Digest.rsa.sha3;

import ru.CryptoPro.JCSP.Digest.cl_2;

/* loaded from: classes4.dex */
public final class JCSPSHA3_384Hmac extends cl_2 {
    public static final String STR_NAME = "HMAC_SHA3_384";
    public static final String STR_OID = "2.16.840.1.101.3.4.2.15";
    private static final int a = 48;
    private static final int b = 32847;

    public JCSPSHA3_384Hmac() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA3_384Hmac(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 48;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 32847;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 32847;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return "2.16.840.1.101.3.4.2.15";
    }

    public JCSPSHA3_384Hmac(JCSPSHA3_384Hmac jCSPSHA3_384Hmac) {
        super(jCSPSHA3_384Hmac);
    }
}
