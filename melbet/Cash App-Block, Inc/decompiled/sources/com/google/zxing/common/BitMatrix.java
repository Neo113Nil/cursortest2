package com.google.zxing.common;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class BitMatrix implements Cloneable {
    public int[] bits;
    public int height;
    public int rowSize;
    public int width;

    public BitMatrix(int i, int i2) {
        if (i < 1 || i2 < 1) {
            a$$ExternalSyntheticBUOutline0.m$3("Both dimensions must be greater than 0");
            throw null;
        }
        this.width = i;
        this.height = i2;
        int i3 = (i + 31) / 32;
        this.rowSize = i3;
        this.bits = new int[i3 * i2];
    }

    public final Object clone() {
        int i = this.width;
        int i2 = this.height;
        int i3 = this.rowSize;
        int[] iArr = (int[]) this.bits.clone();
        BitMatrix bitMatrix = new BitMatrix();
        bitMatrix.width = i;
        bitMatrix.height = i2;
        bitMatrix.rowSize = i3;
        bitMatrix.bits = iArr;
        return bitMatrix;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bitMatrix = (BitMatrix) obj;
        return this.width == bitMatrix.width && this.height == bitMatrix.height && this.rowSize == bitMatrix.rowSize && Arrays.equals(this.bits, bitMatrix.bits);
    }

    public final void flip(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.rowSize);
        int[] iArr = this.bits;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public final boolean get(int i, int i2) {
        return ((this.bits[(i / 32) + (i2 * this.rowSize)] >>> (i & 31)) & 1) != 0;
    }

    public final int hashCode() {
        int i = this.width;
        return Arrays.hashCode(this.bits) + ((((Fragment$5$$ExternalSyntheticOutline0.m$1(i, 31, i, 31) + this.height) * 31) + this.rowSize) * 31);
    }

    public final void set(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.rowSize);
        int[] iArr = this.bits;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public final void setRegion(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Left and top must be nonnegative");
            return;
        }
        if (i4 < 1 || i3 < 1) {
            a$$ExternalSyntheticBUOutline0.m$3("Height and width must be at least 1");
            return;
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.height || i5 > this.width) {
            a$$ExternalSyntheticBUOutline0.m$3("The region must fit inside the matrix");
            return;
        }
        while (i2 < i6) {
            int i7 = this.rowSize * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.bits;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final String toString() {
        int i = this.height;
        int i2 = this.width;
        StringBuilder sb = new StringBuilder((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(get(i4, i3) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
