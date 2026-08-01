package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class O2 implements InterfaceC3113e1 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f26581a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f26582b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26583c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26584d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26585e;

    public /* synthetic */ O2(SparseArray sparseArray, SparseArray sparseArray2, long j6, long j9, int i) {
        this.f26581a = sparseArray;
        this.f26582b = sparseArray2;
        this.f26583c = j6;
        this.f26584d = j9;
        this.f26585e = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final C3060d1 b(long j6) {
        SparseArray sparseArray = this.f26581a;
        int i = this.f26585e;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.f26582b;
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
            C3167f1 c3167f1 = new C3167f1(0L, this.f26584d);
            return new C3060d1(c3167f1, c3167f1);
        }
        int s9 = AbstractC3159eu.s(jArr, j6, true);
        C3167f1 c3167f12 = new C3167f1(jArr[s9], jArr2[s9]);
        return new C3060d1(c3167f12, c3167f12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final long c() {
        return this.f26583c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean f() {
        return true;
    }
}
