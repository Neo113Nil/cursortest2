package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.uF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3988uF {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f34509a = c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void a(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            b(0, 4, 8, 12, iArr);
            b(1, 5, 9, 13, iArr);
            b(2, 6, 10, 14, iArr);
            b(3, 7, 11, 15, iArr);
            b(0, 5, 10, 15, iArr);
            b(1, 6, 11, 12, iArr);
            b(2, 7, 8, 13, iArr);
            b(3, 4, 9, 14, iArr);
        }
    }

    public static void b(int i, int i6, int i9, int i10, int[] iArr) {
        int i11 = iArr[i] + iArr[i6];
        iArr[i] = i11;
        int i12 = i11 ^ iArr[i10];
        int i13 = (i12 >>> (-16)) | (i12 << 16);
        iArr[i10] = i13;
        int i14 = iArr[i9] + i13;
        iArr[i9] = i14;
        int i15 = iArr[i6] ^ i14;
        int i16 = (i15 >>> (-12)) | (i15 << 12);
        iArr[i6] = i16;
        int i17 = iArr[i] + i16;
        iArr[i] = i17;
        int i18 = iArr[i10] ^ i17;
        int i19 = (i18 >>> (-8)) | (i18 << 8);
        iArr[i10] = i19;
        int i20 = iArr[i9] + i19;
        iArr[i9] = i20;
        int i21 = iArr[i6] ^ i20;
        iArr[i6] = (i21 >>> (-7)) | (i21 << 7);
    }

    public static int[] c(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    public static int[] d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        int[] iArr4 = f34509a;
        int length = iArr4.length;
        System.arraycopy(iArr4, 0, iArr3, 0, length);
        System.arraycopy(iArr, 0, iArr3, length, 8);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        a(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }
}
