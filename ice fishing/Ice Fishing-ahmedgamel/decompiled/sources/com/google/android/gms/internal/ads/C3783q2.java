package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3783q2 implements InterfaceC3136e1 {

    /* renamed from: a, reason: collision with root package name */
    public final J0 f33964a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f33965b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33966c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33967d;

    public C3783q2(SparseArray sparseArray, long j6, int i, long j9, long j10) {
        int i4;
        this.f33965b = sparseArray;
        this.f33966c = j6;
        this.f33967d = i;
        List list = (List) sparseArray.get(i);
        J0 j02 = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i6 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                C3729p2 c3729p2 = (C3729p2) list.get(i9);
                jArr3[i9] = c3729p2.f33806n;
                jArr[i9] = c3729p2.f33807u;
            }
            while (true) {
                i4 = size - 1;
                if (i6 >= i4) {
                    break;
                }
                int i10 = i6 + 1;
                iArr[i6] = (int) (jArr[i10] - jArr[i6]);
                jArr2[i6] = jArr3[i10] - jArr3[i6];
                i6 = i10;
            }
            int i11 = i4;
            while (i11 > 0 && jArr3[i11] >= j6) {
                i11--;
            }
            iArr[i11] = (int) ((j9 + j10) - jArr[i11]);
            jArr2[i11] = j6 - jArr3[i11];
            if (i11 < i4) {
                AbstractC2991bG.y("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i12 = i11 + 1;
                iArr = Arrays.copyOf(iArr, i12);
                jArr = Arrays.copyOf(jArr, i12);
                jArr2 = Arrays.copyOf(jArr2, i12);
                jArr3 = Arrays.copyOf(jArr3, i12);
            }
            j02 = new J0(iArr, jArr, jArr2, jArr3);
        }
        this.f33964a = j02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final C3083d1 b(long j6) {
        J0 j02 = this.f33964a;
        if (j02 != null) {
            return j02.b(j6);
        }
        C3190f1 c3190f1 = C3190f1.f30799c;
        return new C3083d1(c3190f1, c3190f1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final long c() {
        return this.f33966c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final boolean f() {
        List list = (List) this.f33965b.get(this.f33967d);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
