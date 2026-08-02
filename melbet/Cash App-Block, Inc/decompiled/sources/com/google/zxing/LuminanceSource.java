package com.google.zxing;

/* loaded from: classes4.dex */
public abstract class LuminanceSource {
    public final int height;
    public final int width;

    public LuminanceSource(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int i, byte[] bArr);

    public final String toString() {
        int i = this.width;
        byte[] bArr = new byte[i];
        int i2 = this.height;
        StringBuilder sb = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            bArr = getRow(i3, bArr);
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4] & 255;
                sb.append(i5 < 64 ? '#' : i5 < 128 ? '+' : i5 < 192 ? '.' : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
