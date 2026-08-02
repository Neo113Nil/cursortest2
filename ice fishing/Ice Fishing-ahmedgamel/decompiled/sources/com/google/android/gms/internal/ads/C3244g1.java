package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3244g1 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f31250a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31251b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31252c;

    /* renamed from: d, reason: collision with root package name */
    public int f31253d;

    /* renamed from: e, reason: collision with root package name */
    public int f31254e;

    /* renamed from: f, reason: collision with root package name */
    public FQ f31255f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC3566m1 f31256g;

    public C3244g1(int i, int i4, String str) {
        this.f31250a = i;
        this.f31251b = i4;
        this.f31252c = str;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        int i = this.f31254e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC3566m1 interfaceC3566m1 = this.f31256g;
        interfaceC3566m1.getClass();
        int d9 = interfaceC3566m1.d(r02, 1024, true);
        if (d9 != -1) {
            this.f31253d += d9;
            return 0;
        }
        this.f31254e = 2;
        this.f31256g.c(0L, 1, this.f31253d, 0, null);
        this.f31253d = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        FQ fq = (FQ) s02;
        this.f31255f = fq;
        InterfaceC3566m1 C8 = fq.C(1024, 4);
        this.f31256g = C8;
        C3322hP c3322hP = new C3322hP();
        String str = this.f31252c;
        c3322hP.d(str);
        c3322hP.e(str);
        C8.e(new DP(c3322hP));
        this.f31255f.B();
        this.f31255f.D(new C3298h1());
        this.f31254e = 1;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        if (j6 == 0 || this.f31254e == 1) {
            this.f31254e = 1;
            this.f31253d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        int i = this.f31251b;
        int i4 = this.f31250a;
        AbstractC2792Sd.H((i4 == -1 || i == -1) ? false : true);
        Cr cr = new Cr(i);
        ((K0) r02).E(cr.f24997a, 0, i, false);
        return cr.L() == i4;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
