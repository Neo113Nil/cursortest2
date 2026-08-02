package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class JF extends IF {

    /* renamed from: d, reason: collision with root package name */
    public final long[] f26414d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JF(C3067cm c3067cm) {
        super(r1, r2, r4);
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        this.f26414d = jArr3;
        C3504ku c3504ku = (C3504ku) c3067cm.f30365u;
        AbstractC2991bG.l(jArr, (long[]) c3504ku.f32446v, (long[]) c3504ku.f32445u);
        AbstractC2991bG.u(jArr2, (long[]) c3504ku.f32446v, (long[]) c3504ku.f32445u);
        System.arraycopy((long[]) c3504ku.f32447w, 0, jArr3, 0, 10);
        AbstractC2991bG.I(jArr4, (long[]) c3067cm.f30366v, KF.f26635b);
    }

    @Override // com.google.android.gms.internal.ads.IF
    public final void a(long[] jArr, long[] jArr2) {
        AbstractC2991bG.I(jArr, jArr2, this.f26414d);
    }
}
