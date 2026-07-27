package com.anythink.core.common.n.c;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f15842a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f15843b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    private b() {
    }

    public static byte[] a(String str) {
        int i;
        char charAt;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i6 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i6];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char charAt2 = str.charAt(i12);
            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                i = charAt2 - 'A';
            } else if (charAt2 >= 'a' && charAt2 <= 'z') {
                i = charAt2 - 'G';
            } else if (charAt2 >= '0' && charAt2 <= '9') {
                i = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i10 = (i10 << 6) | ((byte) i);
            i9++;
            if (i9 % 4 == 0) {
                bArr[i11] = (byte) (i10 >> 16);
                int i13 = i11 + 2;
                bArr[i11 + 1] = (byte) (i10 >> 8);
                i11 += 3;
                bArr[i13] = (byte) i10;
            }
        }
        int i14 = i9 % 4;
        if (i14 == 1) {
            return null;
        }
        if (i14 == 2) {
            bArr[i11] = (byte) ((i10 << 12) >> 16);
            i11++;
        } else if (i14 == 3) {
            int i15 = i10 << 6;
            int i16 = i11 + 1;
            bArr[i11] = (byte) (i15 >> 16);
            i11 += 2;
            bArr[i16] = (byte) (i15 >> 8);
        }
        if (i11 == i6) {
            return bArr;
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }

    public static String b(byte[] bArr) {
        return a(bArr, f15843b);
    }

    public static String a(byte[] bArr) {
        return a(bArr, f15842a);
    }

    private static String a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            bArr3[i] = bArr2[(bArr[i6] & 255) >> 2];
            int i9 = i6 + 1;
            bArr3[i + 1] = bArr2[((bArr[i6] & 3) << 4) | ((bArr[i9] & 255) >> 4)];
            int i10 = i + 3;
            int i11 = (bArr[i9] & 15) << 2;
            int i12 = i6 + 2;
            bArr3[i + 2] = bArr2[i11 | ((bArr[i12] & 255) >> 6)];
            i += 4;
            bArr3[i10] = bArr2[bArr[i12] & com.anythink.core.common.s.a.c.f16318c];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            bArr3[i + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i + 2] = 61;
            bArr3[i + 3] = 61;
        } else if (length2 == 2) {
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i13 = (bArr[length] & 3) << 4;
            int i14 = length + 1;
            bArr3[i + 1] = bArr2[((bArr[i14] & 255) >> 4) | i13];
            bArr3[i + 2] = bArr2[(bArr[i14] & 15) << 2];
            bArr3[i + 3] = 61;
        }
        try {
            return new String(bArr3, com.anythink.basead.exoplayer.b.i);
        } catch (UnsupportedEncodingException e9) {
            throw new AssertionError(e9);
        }
    }
}
