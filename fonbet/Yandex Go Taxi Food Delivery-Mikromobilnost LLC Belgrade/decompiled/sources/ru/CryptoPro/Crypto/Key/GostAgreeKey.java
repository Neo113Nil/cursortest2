package ru.CryptoPro.Crypto.Key;

import ru.CryptoPro.JCP.Key.SecretKeyInterface;

/* loaded from: classes4.dex */
public class GostAgreeKey extends GostSecretKey {
    private byte[] a;

    public GostAgreeKey(SecretKeyInterface secretKeyInterface, byte[] bArr) {
        super(secretKeyInterface);
        this.a = bArr;
    }

    public byte[] getIV() {
        return this.a;
    }

    public void setIV(byte[] bArr) {
        this.a = bArr;
    }
}
