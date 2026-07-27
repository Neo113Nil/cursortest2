package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3008c3 {

    /* renamed from: a, reason: collision with root package name */
    public final Z2 f29416a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29417b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f29418c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f29419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29420e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f29421f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f29422g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f29423h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f29424j;

    public C3008c3(Z2 z22, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z3, long j6, int i6) {
        int length = iArr.length;
        int length2 = jArr2.length;
        AbstractC2772Sd.i(length == length2);
        AbstractC2772Sd.i(jArr.length == length2);
        int length3 = iArr2.length;
        AbstractC2772Sd.i(length3 == length2);
        this.f29416a = z22;
        this.f29418c = jArr;
        this.f29419d = iArr;
        this.f29420e = i;
        this.f29421f = jArr2;
        this.f29422g = iArr2;
        this.f29423h = iArr3;
        this.f29424j = z3;
        this.i = j6;
        this.f29417b = i6;
        if (length3 > 0) {
            int i9 = length3 - 1;
            iArr2[i9] = iArr2[i9] | 536870912;
        }
    }

    public final int a(long j6) {
        long[] jArr = this.f29421f;
        int i = 0;
        if (jArr.length > 0) {
            if (this.f29424j) {
                return AbstractC3159eu.s(jArr, j6, false);
            }
            int[] iArr = this.f29423h;
            int length = iArr.length - 1;
            int i6 = -1;
            while (i <= length) {
                int i9 = ((length - i) / 2) + i;
                if (jArr[iArr[i9]] <= j6) {
                    i = i9 + 1;
                    i6 = i9;
                } else {
                    length = i9 - 1;
                }
            }
            if (i6 != -1) {
                long j9 = jArr[iArr[i6]];
                if (j9 == j6) {
                    while (i6 > 0) {
                        int i10 = i6 - 1;
                        if (jArr[iArr[i10]] != j9) {
                            break;
                        }
                        i6 = i10;
                    }
                }
                return iArr[i6];
            }
        }
        return -1;
    }

    public final int b(long j6) {
        long[] jArr = this.f29421f;
        int i = 0;
        if (jArr.length > 0) {
            if (this.f29424j) {
                String str = AbstractC3159eu.f29993a;
                int binarySearch = Arrays.binarySearch(jArr, j6);
                if (binarySearch < 0) {
                    return ~binarySearch;
                }
                while (true) {
                    int i6 = binarySearch + 1;
                    if (i6 >= jArr.length || jArr[i6] != j6) {
                        break;
                    }
                    binarySearch = i6;
                }
                return binarySearch;
            }
            int[] iArr = this.f29423h;
            int length = iArr.length - 1;
            int i9 = -1;
            while (i <= length) {
                int i10 = ((length - i) / 2) + i;
                if (jArr[iArr[i10]] >= j6) {
                    length = i10 - 1;
                    i9 = i10;
                } else {
                    i = i10 + 1;
                }
            }
            if (i9 != -1) {
                long j9 = jArr[iArr[i9]];
                if (j9 == j6) {
                    while (i9 < iArr.length - 1) {
                        int i11 = i9 + 1;
                        if (jArr[iArr[i11]] != j9) {
                            break;
                        }
                        i9 = i11;
                    }
                }
                return iArr[i9];
            }
        }
        return -1;
    }
}
