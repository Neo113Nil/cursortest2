package com.anythink.basead.exoplayer.k;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    private static final int f8371b = 15;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8373d = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8375f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8376g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f8377h = 22;
    private static final int i = 29;

    /* renamed from: j, reason: collision with root package name */
    private static final int f8378j = 31;

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f8370a = {0, 0, 0, 1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f8372c = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f8374e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private d() {
    }

    public static Pair<Integer, Integer> a(byte[] bArr) {
        r rVar = new r(bArr);
        int b9 = b(rVar);
        int c9 = c(rVar);
        int c10 = rVar.c(4);
        if (b9 == 5 || b9 == 29) {
            c9 = c(rVar);
            if (b(rVar) == 22) {
                c10 = rVar.c(4);
            }
        }
        int i6 = f8374e[c10];
        a.a(i6 != -1);
        return Pair.create(Integer.valueOf(c9), Integer.valueOf(i6));
    }

    private static byte[] b(int i6, int i9) {
        return new byte[]{(byte) (((i6 >> 1) & 7) | 16), (byte) (((i6 << 7) & 128) | ((i9 << 3) & 120))};
    }

    private static int c(r rVar) {
        int c9 = rVar.c(4);
        if (c9 == 15) {
            return rVar.c(24);
        }
        a.a(c9 < 13);
        return f8372c[c9];
    }

    private static byte[][] b(byte[] bArr) {
        if (!b(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        do {
            arrayList.add(Integer.valueOf(i6));
            i6 = a(bArr, i6 + f8370a.length);
        } while (i6 != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i9 = 0;
        while (i9 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i9)).intValue();
            int intValue2 = (i9 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i9 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i9] = bArr3;
            i9++;
        }
        return bArr2;
    }

    private static Pair<Integer, Integer> a(r rVar) {
        int b9 = b(rVar);
        int c9 = c(rVar);
        int c10 = rVar.c(4);
        if (b9 == 5 || b9 == 29) {
            c9 = c(rVar);
            if (b(rVar) == 22) {
                c10 = rVar.c(4);
            }
        }
        int i6 = f8374e[c10];
        a.a(i6 != -1);
        return Pair.create(Integer.valueOf(c9), Integer.valueOf(i6));
    }

    private static boolean b(byte[] bArr, int i6) {
        if (bArr.length - i6 <= f8370a.length) {
            return false;
        }
        int i9 = 0;
        while (true) {
            byte[] bArr2 = f8370a;
            if (i9 >= bArr2.length) {
                return true;
            }
            if (bArr[i6 + i9] != bArr2[i9]) {
                return false;
            }
            i9++;
        }
    }

    private static int b(r rVar) {
        int c9 = rVar.c(5);
        return c9 == 31 ? rVar.c(6) + 32 : c9;
    }

    private static byte[] a(int i6, int i9) {
        int i10 = -1;
        int i11 = 0;
        while (true) {
            int[] iArr = f8372c;
            if (i11 >= iArr.length) {
                break;
            }
            if (i6 == iArr[i11]) {
                i10 = i11;
            }
            i11++;
        }
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int[] iArr2 = f8374e;
            if (i13 >= iArr2.length) {
                break;
            }
            if (i9 == iArr2[i13]) {
                i12 = i13;
            }
            i13++;
        }
        if (i6 != -1 && i12 != -1) {
            return new byte[]{(byte) (((i10 >> 1) & 7) | 16), (byte) (((i10 << 7) & 128) | ((i12 << 3) & 120))};
        }
        throw new IllegalArgumentException(u1.h.c(i6, i9, "Invalid sample rate or number of channels: ", ", "));
    }

    public static byte[] a(byte[] bArr, int i6, int i9) {
        byte[] bArr2 = f8370a;
        byte[] bArr3 = new byte[bArr2.length + i9];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i6, bArr3, bArr2.length, i9);
        return bArr3;
    }

    private static int a(byte[] bArr, int i6) {
        int length = bArr.length - f8370a.length;
        while (i6 <= length) {
            if (b(bArr, i6)) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    private static void a(r rVar, int i6, int i9) {
        rVar.b(1);
        if (rVar.d()) {
            rVar.b(14);
        }
        boolean d2 = rVar.d();
        if (i9 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i6 == 6 || i6 == 20) {
            rVar.b(3);
        }
        if (d2) {
            if (i6 == 22) {
                rVar.b(16);
            }
            if (i6 == 17 || i6 == 19 || i6 == 20 || i6 == 23) {
                rVar.b(3);
            }
            rVar.b(1);
        }
    }
}
