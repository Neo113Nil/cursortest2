package com.anythink.basead.exoplayer.k;

import android.util.Pair;
import java.util.ArrayList;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    private static final int f9157b = 15;

    /* renamed from: d, reason: collision with root package name */
    private static final int f9159d = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f9161f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f9162g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f9163h = 22;
    private static final int i = 29;

    /* renamed from: j, reason: collision with root package name */
    private static final int f9164j = 31;

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f9156a = {0, 0, 0, 1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f9158c = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f9160e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

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
        int i4 = f9160e[c10];
        a.a(i4 != -1);
        return Pair.create(Integer.valueOf(c9), Integer.valueOf(i4));
    }

    private static byte[] b(int i4, int i6) {
        return new byte[]{(byte) (((i4 >> 1) & 7) | 16), (byte) (((i4 << 7) & 128) | ((i6 << 3) & 120))};
    }

    private static int c(r rVar) {
        int c9 = rVar.c(4);
        if (c9 == 15) {
            return rVar.c(24);
        }
        a.a(c9 < 13);
        return f9158c[c9];
    }

    private static byte[][] b(byte[] bArr) {
        if (!b(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        do {
            arrayList.add(Integer.valueOf(i4));
            i4 = a(bArr, i4 + f9156a.length);
        } while (i4 != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i6 = 0;
        while (i6 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i6)).intValue();
            int intValue2 = (i6 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i6 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i6] = bArr3;
            i6++;
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
        int i4 = f9160e[c10];
        a.a(i4 != -1);
        return Pair.create(Integer.valueOf(c9), Integer.valueOf(i4));
    }

    private static boolean b(byte[] bArr, int i4) {
        if (bArr.length - i4 <= f9156a.length) {
            return false;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr2 = f9156a;
            if (i6 >= bArr2.length) {
                return true;
            }
            if (bArr[i4 + i6] != bArr2[i6]) {
                return false;
            }
            i6++;
        }
    }

    private static int b(r rVar) {
        int c9 = rVar.c(5);
        return c9 == 31 ? rVar.c(6) + 32 : c9;
    }

    private static byte[] a(int i4, int i6) {
        int i9 = -1;
        int i10 = 0;
        while (true) {
            int[] iArr = f9158c;
            if (i10 >= iArr.length) {
                break;
            }
            if (i4 == iArr[i10]) {
                i9 = i10;
            }
            i10++;
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr2 = f9160e;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i6 == iArr2[i12]) {
                i11 = i12;
            }
            i12++;
        }
        if (i4 != -1 && i11 != -1) {
            return new byte[]{(byte) (((i9 >> 1) & 7) | 16), (byte) (((i9 << 7) & 128) | ((i11 << 3) & 120))};
        }
        throw new IllegalArgumentException(AbstractC5128c.c(i4, i6, "Invalid sample rate or number of channels: ", ", "));
    }

    public static byte[] a(byte[] bArr, int i4, int i6) {
        byte[] bArr2 = f9156a;
        byte[] bArr3 = new byte[bArr2.length + i6];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i4, bArr3, bArr2.length, i6);
        return bArr3;
    }

    private static int a(byte[] bArr, int i4) {
        int length = bArr.length - f9156a.length;
        while (i4 <= length) {
            if (b(bArr, i4)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    private static void a(r rVar, int i4, int i6) {
        rVar.b(1);
        if (rVar.d()) {
            rVar.b(14);
        }
        boolean d9 = rVar.d();
        if (i6 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i4 == 6 || i4 == 20) {
            rVar.b(3);
        }
        if (d9) {
            if (i4 == 22) {
                rVar.b(16);
            }
            if (i4 == 17 || i4 == 19 || i4 == 20 || i4 == 23) {
                rVar.b(3);
            }
            rVar.b(1);
        }
    }
}
