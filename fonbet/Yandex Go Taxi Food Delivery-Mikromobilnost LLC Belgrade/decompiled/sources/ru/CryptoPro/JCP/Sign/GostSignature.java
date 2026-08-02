package ru.CryptoPro.JCP.Sign;

import ru.CryptoPro.JCP.math.BigIntr;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class GostSignature implements SignValue {
    public int a;
    public BigIntr r;
    public BigIntr s;

    public GostSignature(int[] iArr) {
        this.r = null;
        this.s = null;
        int length = iArr.length;
        this.a = length;
        int[] iArr2 = new int[length >> 1];
        int[] iArr3 = new int[length >> 1];
        Array.separate(iArr, iArr2, iArr3, length >> 1);
        this.r = new BigIntr(iArr2);
        this.s = new BigIntr(iArr3);
    }

    @Override // ru.CryptoPro.JCP.Sign.SignValue
    public void decode(byte[] bArr) {
        this.a = bArr.length >> 2;
        Array.invByteOrder(bArr);
        int[] intArray = Array.toIntArray(bArr);
        int i = this.a;
        int[] iArr = new int[i >> 1];
        System.arraycopy(intArray, 0, iArr, 0, i >> 1);
        this.r = new BigIntr(iArr);
        int i2 = this.a;
        System.arraycopy(intArray, i2 >> 1, iArr, 0, i2 >> 1);
        this.s = new BigIntr(iArr);
    }

    @Override // ru.CryptoPro.JCP.Sign.SignValue
    public byte[] encode() {
        int i = this.a << 2;
        byte[] bArr = new byte[i];
        int i2 = i >>> 1;
        System.arraycopy(this.r.toByteArray(), 0, bArr, 0, i2);
        System.arraycopy(this.s.toByteArray(), 0, bArr, i2, i2);
        return bArr;
    }

    public GostSignature(byte[] bArr) {
        this.r = null;
        this.s = null;
        decode(bArr);
    }

    public GostSignature(int i) {
        this.r = null;
        this.s = null;
        BigIntr bigIntr = BigIntr.ZERO;
        int i2 = i >>> 1;
        this.r = new BigIntr(bigIntr, i2);
        this.s = new BigIntr(bigIntr, i2);
        this.a = i;
    }
}
