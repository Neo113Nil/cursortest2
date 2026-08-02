package com.google.zxing.common;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class BitSource {
    public int bitOffset;
    public int byteOffset;
    public final byte[] bytes;

    public BitSource(byte[] bArr, int i, int i2) {
        this.bytes = bArr;
        this.byteOffset = i;
        this.bitOffset = i2;
    }

    public int available() {
        return ((this.bytes.length - this.byteOffset) * 8) - this.bitOffset;
    }

    public int readBits(int i) {
        int i2 = 0;
        if (i < 1 || i > 32 || i > available()) {
            a$$ExternalSyntheticBUOutline0.m$3(String.valueOf(i));
            return 0;
        }
        int i3 = this.bitOffset;
        byte[] bArr = this.bytes;
        if (i3 > 0) {
            int i4 = 8 - i3;
            int min = Math.min(i, i4);
            int i5 = i4 - min;
            int i6 = this.byteOffset;
            int i7 = (((255 >> (8 - min)) << i5) & bArr[i6]) >> i5;
            i -= min;
            int i8 = this.bitOffset + min;
            this.bitOffset = i8;
            if (i8 == 8) {
                this.bitOffset = 0;
                this.byteOffset = i6 + 1;
            }
            i2 = i7;
        }
        if (i <= 0) {
            return i2;
        }
        while (i >= 8) {
            int i9 = this.byteOffset;
            i2 = (i2 << 8) | (bArr[i9] & 255);
            this.byteOffset = i9 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return i2;
        }
        int i10 = 8 - i;
        int i11 = (i2 << i) | ((((255 >> i10) << i10) & bArr[this.byteOffset]) >> i10);
        this.bitOffset += i;
        return i11;
    }

    public BitSource(byte[] bArr) {
        this.bytes = bArr;
    }
}
