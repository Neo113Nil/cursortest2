package ru.CryptoPro.JCSP.Digest;

/* loaded from: classes4.dex */
public final class JCSPGostHMAC2012_256 extends GostHMAC {
    public static final String STR_NAME = "HMAC_GOSTR3411_2012_256";
    public static final String STR_OID = "1.2.643.7.1.1.4.1";
    private static final int a = 32;
    private static final int b = 32820;

    public JCSPGostHMAC2012_256() {
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPGostHMAC2012_256(this);
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 32;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getAlgId() {
        return 32820;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public int getHashAlgId() {
        return 32801;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public String getStrOID() {
        return "1.2.643.7.1.1.4.1";
    }

    public JCSPGostHMAC2012_256(JCSPGostHMAC2012_256 jCSPGostHMAC2012_256) {
        super(jCSPGostHMAC2012_256);
    }
}
