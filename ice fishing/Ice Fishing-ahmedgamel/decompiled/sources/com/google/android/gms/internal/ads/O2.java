package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class O2 implements InterfaceC3136e1 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f27363a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f27364b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27365c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27366d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27367e;

    public /* synthetic */ O2(SparseArray sparseArray, SparseArray sparseArray2, long j6, long j9, int i) {
        this.f27363a = sparseArray;
        this.f27364b = sparseArray2;
        this.f27365c = j6;
        this.f27366d = j9;
        this.f27367e = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final C3083d1 b(long j6) {
        SparseArray sparseArray = this.f27363a;
        int i = this.f27367e;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.f27364b;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i);
            jArr2 = (long[]) sparseArray2.get(i);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j6 < jArr[0]) {
            C3190f1 c3190f1 = new C3190f1(0L, this.f27366d);
            return new C3083d1(c3190f1, c3190f1);
        }
        int s9 = AbstractC3182eu.s(jArr, j6, true);
        C3190f1 c3190f12 = new C3190f1(jArr[s9], jArr2[s9]);
        return new C3083d1(c3190f12, c3190f12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final long c() {
        return this.f27365c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final boolean f() {
        return true;
    }
}
