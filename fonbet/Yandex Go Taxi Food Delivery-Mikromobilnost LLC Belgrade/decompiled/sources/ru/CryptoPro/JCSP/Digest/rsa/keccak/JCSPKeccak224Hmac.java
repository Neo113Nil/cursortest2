package ru.CryptoPro.JCSP.Digest.rsa.keccak;

import ru.CryptoPro.JCSP.Digest.cl_2;

/* loaded from: classes4.dex */
public final class JCSPKeccak224Hmac extends cl_2 {
    public static final String STR_NAME = "HMAC_KECCAK_224";
    public static final String STR_OID = null;
    private static final int a = 28;
    private static final int b = 32856;

    public JCSPKeccak224Hmac() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPKeccak224Hmac(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 28;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 32856;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 32856;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return STR_OID;
    }

    public JCSPKeccak224Hmac(JCSPKeccak224Hmac jCSPKeccak224Hmac) {
        super(jCSPKeccak224Hmac);
    }
}
