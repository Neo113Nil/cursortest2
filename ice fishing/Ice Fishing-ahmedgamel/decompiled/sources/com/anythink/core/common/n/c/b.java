package com.anythink.core.common.n.c;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f16629a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f16630b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    private b() {
    }

    public static byte[] a(String str) {
        int i;
        char charAt;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i4 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i4];
        int i6 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt2 = str.charAt(i11);
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
            i9 = (i9 << 6) | ((byte) i);
            i6++;
            if (i6 % 4 == 0) {
                bArr[i10] = (byte) (i9 >> 16);
                int i12 = i10 + 2;
                bArr[i10 + 1] = (byte) (i9 >> 8);
                i10 += 3;
                bArr[i12] = (byte) i9;
            }
        }
        int i13 = i6 % 4;
        if (i13 == 1) {
            return null;
        }
        if (i13 == 2) {
            bArr[i10] = (byte) ((i9 << 12) >> 16);
            i10++;
        } else if (i13 == 3) {
            int i14 = i9 << 6;
            int i15 = i10 + 1;
            bArr[i10] = (byte) (i14 >> 16);
            i10 += 2;
            bArr[i15] = (byte) (i14 >> 8);
        }
        if (i10 == i4) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public static String b(byte[] bArr) {
        return a(bArr, f16630b);
    }

    public static String a(byte[] bArr) {
        return a(bArr, f16629a);
    }

    private static String a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            bArr3[i] = bArr2[(bArr[i4] & 255) >> 2];
            int i6 = i4 + 1;
            bArr3[i + 1] = bArr2[((bArr[i4] & 3) << 4) | ((bArr[i6] & 255) >> 4)];
            int i9 = i + 3;
            int i10 = (bArr[i6] & 15) << 2;
            int i11 = i4 + 2;
            bArr3[i + 2] = bArr2[i10 | ((bArr[i11] & 255) >> 6)];
            i += 4;
            bArr3[i9] = bArr2[bArr[i11] & com.anythink.core.common.s.a.c.f17105c];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            bArr3[i + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i + 2] = 61;
            bArr3[i + 3] = 61;
        } else if (length2 == 2) {
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i12 = (bArr[length] & 3) << 4;
            int i13 = length + 1;
            bArr3[i + 1] = bArr2[((bArr[i13] & 255) >> 4) | i12];
            bArr3[i + 2] = bArr2[(bArr[i13] & 15) << 2];
            bArr3[i + 3] = 61;
        }
        try {
            return new String(bArr3, com.anythink.basead.exoplayer.b.i);
        } catch (UnsupportedEncodingException e9) {
            throw new AssertionError(e9);
        }
    }
}
