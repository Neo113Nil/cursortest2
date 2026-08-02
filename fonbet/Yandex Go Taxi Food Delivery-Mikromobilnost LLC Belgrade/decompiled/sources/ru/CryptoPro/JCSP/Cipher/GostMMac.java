package ru.CryptoPro.JCSP.Cipher;

/* loaded from: classes4.dex */
public final class GostMMac extends GostMac {
    public static final int MAC_SIZE = 8;

    public GostMMac() {
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostMac
    public int a() {
        return 32828;
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostMac, javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new GostMMac(this);
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostMac, javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 8;
    }

    private GostMMac(GostMMac gostMMac) throws CloneNotSupportedException {
        super(gostMMac);
    }
}
