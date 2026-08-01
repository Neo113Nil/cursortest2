package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3760q2 implements InterfaceC3113e1 {

    /* renamed from: a, reason: collision with root package name */
    public final J0 f33180a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f33181b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33182c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33183d;

    public C3760q2(SparseArray sparseArray, long j6, int i, long j9, long j10) {
        int i6;
        this.f33181b = sparseArray;
        this.f33182c = j6;
        this.f33183d = i;
        List list = (List) sparseArray.get(i);
        J0 j02 = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                C3706p2 c3706p2 = (C3706p2) list.get(i10);
                jArr3[i10] = c3706p2.f33016n;
                jArr[i10] = c3706p2.f33017u;
            }
            while (true) {
                i6 = size - 1;
                if (i9 >= i6) {
                    break;
                }
                int i11 = i9 + 1;
                iArr[i9] = (int) (jArr[i11] - jArr[i9]);
                jArr2[i9] = jArr3[i11] - jArr3[i9];
                i9 = i11;
            }
            int i12 = i6;
            while (i12 > 0 && jArr3[i12] >= j6) {
                i12--;
            }
            iArr[i12] = (int) ((j9 + j10) - jArr[i12]);
            jArr2[i12] = j6 - jArr3[i12];
            if (i12 < i6) {
                AbstractC2968bG.y("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i13 = i12 + 1;
                iArr = Arrays.copyOf(iArr, i13);
                jArr = Arrays.copyOf(jArr, i13);
                jArr2 = Arrays.copyOf(jArr2, i13);
                jArr3 = Arrays.copyOf(jArr3, i13);
            }
            j02 = new J0(iArr, jArr, jArr2, jArr3);
        }
        this.f33180a = j02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final C3060d1 b(long j6) {
        J0 j02 = this.f33180a;
        if (j02 != null) {
            return j02.b(j6);
        }
        C3167f1 c3167f1 = C3167f1.f30012c;
        return new C3060d1(c3167f1, c3167f1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final long c() {
        return this.f33182c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean f() {
        List list = (List) this.f33181b.get(this.f33183d);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
