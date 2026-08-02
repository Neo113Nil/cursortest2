package ru.CryptoPro.JCSP.Digest;

/* loaded from: classes4.dex */
public final class JCSPGostHMAC2012_512 extends GostHMAC {
    public static final String STR_NAME = "HMAC_GOSTR3411_2012_512";
    public static final String STR_OID = "1.2.643.7.1.1.4.2";
    private static final int a = 64;
    private static final int b = 32821;

    public JCSPGostHMAC2012_512() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPGostHMAC2012_512(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 64;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 32821;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 32802;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return "1.2.643.7.1.1.4.2";
    }

    public JCSPGostHMAC2012_512(JCSPGostHMAC2012_512 jCSPGostHMAC2012_512) {
        super(jCSPGostHMAC2012_512);
    }
}
