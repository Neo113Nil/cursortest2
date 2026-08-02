package ru.CryptoPro.JCSP.Cipher;

/* loaded from: classes4.dex */
public final class GostKMac extends GostMac {
    public static final int MAC_SIZE = 16;

    public GostKMac() {
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostMac
    public int a() {
        return 32829;
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostMac, javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new GostKMac(this);
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostMac, javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 16;
    }

    private GostKMac(GostKMac gostKMac) throws CloneNotSupportedException {
        super(gostKMac);
    }
}
