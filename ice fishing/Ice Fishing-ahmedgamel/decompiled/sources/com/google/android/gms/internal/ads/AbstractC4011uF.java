package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.uF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4011uF {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f35283a = c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

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

    public static void b(int i, int i4, int i6, int i9, int[] iArr) {
        int i10 = iArr[i] + iArr[i4];
        iArr[i] = i10;
        int i11 = i10 ^ iArr[i9];
        int i12 = (i11 >>> (-16)) | (i11 << 16);
        iArr[i9] = i12;
        int i13 = iArr[i6] + i12;
        iArr[i6] = i13;
        int i14 = iArr[i4] ^ i13;
        int i15 = (i14 >>> (-12)) | (i14 << 12);
        iArr[i4] = i15;
        int i16 = iArr[i] + i15;
        iArr[i] = i16;
        int i17 = iArr[i9] ^ i16;
        int i18 = (i17 >>> (-8)) | (i17 << 8);
        iArr[i9] = i18;
        int i19 = iArr[i6] + i18;
        iArr[i6] = i19;
        int i20 = iArr[i4] ^ i19;
        iArr[i4] = (i20 >>> (-7)) | (i20 << 7);
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
        int[] iArr4 = f35283a;
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
