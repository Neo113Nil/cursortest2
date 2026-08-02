package ru.CryptoPro.JCSP.Sign;

import ru.CryptoPro.JCP.Sign.SignValue;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class GostSignature implements SignValue {
    private byte[] a;

    public GostSignature() {
        this.a = null;
    }

    @Override // ru.CryptoPro.JCP.Sign.SignValue
    public void decode(byte[] bArr) {
        byte[] bArr2 = this.a;
        if (bArr2 != null) {
            Array.clear(bArr2);
        }
        byte[] bArr3 = new byte[bArr.length];
        this.a = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
    }

    @Override // ru.CryptoPro.JCP.Sign.SignValue
    public byte[] encode() {
        return this.a;
    }

    public GostSignature(byte[] bArr) {
        this.a = bArr;
    }
}
