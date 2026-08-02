package ru.CryptoPro.Crypto.Cipher;

/* loaded from: classes4.dex */
public class GostKuznechikMac extends GostMagmaMac {
    protected static final int KUZN_MAC_SIZE = 8;

    @Override // ru.CryptoPro.Crypto.Cipher.GostMagmaMac, ru.CryptoPro.Crypto.Cipher.GostMac, javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new GostKuznechikMac(this);
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostMagmaMac, ru.CryptoPro.Crypto.Cipher.GostMac
    public void setDefaultSize() {
        this.byteBlockSize = 16;
        this.macSize = 8;
    }
}
