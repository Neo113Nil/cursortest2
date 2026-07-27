package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class LF extends KF {

    /* renamed from: d, reason: collision with root package name */
    public final long[] f26131d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LF(MF mf) {
        super(r1, r2, r4);
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        this.f26131d = jArr3;
        C3602mu c3602mu = mf.f26316a;
        AbstractC3217fl.p(jArr, (long[]) c3602mu.f32775v, (long[]) c3602mu.f32774u);
        AbstractC3217fl.z(jArr2, (long[]) c3602mu.f32775v, (long[]) c3602mu.f32774u);
        System.arraycopy((long[]) c3602mu.f32776w, 0, jArr3, 0, 10);
        AbstractC3217fl.U(jArr4, mf.f26317b, NF.f26499b);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public final void a(long[] jArr, long[] jArr2) {
        AbstractC3217fl.U(jArr, jArr2, this.f26131d);
    }
}
