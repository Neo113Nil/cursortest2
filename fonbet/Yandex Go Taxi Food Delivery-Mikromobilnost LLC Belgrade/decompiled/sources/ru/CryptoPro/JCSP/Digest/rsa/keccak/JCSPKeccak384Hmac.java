package ru.CryptoPro.JCSP.Digest.rsa.keccak;

import ru.CryptoPro.JCSP.Digest.cl_2;

/* loaded from: classes4.dex */
public final class JCSPKeccak384Hmac extends cl_2 {
    public static final String STR_NAME = "HMAC_KECCAK_384";
    public static final String STR_OID = null;
    private static final int a = 48;
    private static final int b = 32858;

    public JCSPKeccak384Hmac() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPKeccak384Hmac(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 48;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 32858;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 32858;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return STR_OID;
    }

    public JCSPKeccak384Hmac(JCSPKeccak384Hmac jCSPKeccak384Hmac) {
        super(jCSPKeccak384Hmac);
    }
}
