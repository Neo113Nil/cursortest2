package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3031c3 {

    /* renamed from: a, reason: collision with root package name */
    public final Z2 f30199a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30200b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f30201c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f30202d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30203e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f30204f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f30205g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f30206h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f30207j;

    public C3031c3(Z2 z22, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z6, long j6, int i4) {
        int length = iArr.length;
        int length2 = jArr2.length;
        AbstractC2792Sd.i(length == length2);
        AbstractC2792Sd.i(jArr.length == length2);
        int length3 = iArr2.length;
        AbstractC2792Sd.i(length3 == length2);
        this.f30199a = z22;
        this.f30201c = jArr;
        this.f30202d = iArr;
        this.f30203e = i;
        this.f30204f = jArr2;
        this.f30205g = iArr2;
        this.f30206h = iArr3;
        this.f30207j = z6;
        this.i = j6;
        this.f30200b = i4;
        if (length3 > 0) {
            int i6 = length3 - 1;
            iArr2[i6] = iArr2[i6] | 536870912;
        }
    }

    public final int a(long j6) {
        long[] jArr = this.f30204f;
        int i = 0;
        if (jArr.length > 0) {
            if (this.f30207j) {
                return AbstractC3182eu.s(jArr, j6, false);
            }
            int[] iArr = this.f30206h;
            int length = iArr.length - 1;
            int i4 = -1;
            while (i <= length) {
                int i6 = ((length - i) / 2) + i;
                if (jArr[iArr[i6]] <= j6) {
                    i = i6 + 1;
                    i4 = i6;
                } else {
                    length = i6 - 1;
                }
            }
            if (i4 != -1) {
                long j9 = jArr[iArr[i4]];
                if (j9 == j6) {
                    while (i4 > 0) {
                        int i9 = i4 - 1;
                        if (jArr[iArr[i9]] != j9) {
                            break;
                        }
                        i4 = i9;
                    }
                }
                return iArr[i4];
            }
        }
        return -1;
    }

    public final int b(long j6) {
        long[] jArr = this.f30204f;
        int i = 0;
        if (jArr.length > 0) {
            if (this.f30207j) {
                String str = AbstractC3182eu.f30782a;
                int binarySearch = Arrays.binarySearch(jArr, j6);
                if (binarySearch < 0) {
                    return ~binarySearch;
                }
                while (true) {
                    int i4 = binarySearch + 1;
                    if (i4 >= jArr.length || jArr[i4] != j6) {
                        break;
                    }
                    binarySearch = i4;
                }
                return binarySearch;
            }
            int[] iArr = this.f30206h;
            int length = iArr.length - 1;
            int i6 = -1;
            while (i <= length) {
                int i9 = ((length - i) / 2) + i;
                if (jArr[iArr[i9]] >= j6) {
                    length = i9 - 1;
                    i6 = i9;
                } else {
                    i = i9 + 1;
                }
            }
            if (i6 != -1) {
                long j9 = jArr[iArr[i6]];
                if (j9 == j6) {
                    while (i6 < iArr.length - 1) {
                        int i10 = i6 + 1;
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
}
