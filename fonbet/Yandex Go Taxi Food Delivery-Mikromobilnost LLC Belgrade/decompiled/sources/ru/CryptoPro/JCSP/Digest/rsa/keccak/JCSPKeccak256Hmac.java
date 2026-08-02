package ru.CryptoPro.JCSP.Digest.rsa.keccak;

import ru.CryptoPro.JCSP.Digest.cl_2;

/* loaded from: classes4.dex */
public final class JCSPKeccak256Hmac extends cl_2 {
    public static final String STR_NAME = "HMAC_KECCAK_256";
    public static final String STR_OID = null;
    private static final int a = 32;
    private static final int b = 32857;

    public JCSPKeccak256Hmac() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPKeccak256Hmac(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 32;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 32857;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 32857;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return STR_OID;
    }

    public JCSPKeccak256Hmac(JCSPKeccak256Hmac jCSPKeccak256Hmac) {
        super(jCSPKeccak256Hmac);
    }
}
