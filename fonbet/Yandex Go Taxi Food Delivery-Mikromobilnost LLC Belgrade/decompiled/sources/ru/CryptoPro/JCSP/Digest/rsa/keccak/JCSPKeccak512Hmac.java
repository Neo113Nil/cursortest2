package ru.CryptoPro.JCSP.Digest.rsa.keccak;

import ru.CryptoPro.JCSP.Digest.cl_2;

/* loaded from: classes4.dex */
public final class JCSPKeccak512Hmac extends cl_2 {
    public static final String STR_NAME = "HMAC_KECCAK_512";
    public static final String STR_OID = null;
    private static final int a = 64;
    private static final int b = 32859;

    public JCSPKeccak512Hmac() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPKeccak512Hmac(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 64;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 32859;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 32859;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return STR_OID;
    }

    public JCSPKeccak512Hmac(JCSPKeccak512Hmac jCSPKeccak512Hmac) {
        super(jCSPKeccak512Hmac);
    }
}
