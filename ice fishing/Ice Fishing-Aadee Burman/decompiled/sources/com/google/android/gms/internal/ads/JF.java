package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class JF extends IF {

    /* renamed from: d, reason: collision with root package name */
    public final long[] f25661d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JF(C2991bm c2991bm) {
        super(r1, r2, r4);
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        this.f25661d = jArr3;
        C3481ku c3481ku = (C3481ku) c2991bm.f29323u;
        AbstractC2968bG.l(jArr, (long[]) c3481ku.f31664v, (long[]) c3481ku.f31663u);
        AbstractC2968bG.u(jArr2, (long[]) c3481ku.f31664v, (long[]) c3481ku.f31663u);
        System.arraycopy((long[]) c3481ku.f31665w, 0, jArr3, 0, 10);
        AbstractC2968bG.I(jArr4, (long[]) c2991bm.f29324v, KF.f25883b);
    }

    @Override // com.google.android.gms.internal.ads.IF
    public final void a(long[] jArr, long[] jArr2) {
        AbstractC2968bG.I(jArr, jArr2, this.f25661d);
    }
}
