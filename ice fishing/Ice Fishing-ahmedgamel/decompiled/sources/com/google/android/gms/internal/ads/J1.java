package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class J1 implements Q0 {

    /* renamed from: b, reason: collision with root package name */
    public FQ f26392b;

    /* renamed from: c, reason: collision with root package name */
    public K0 f26393c;

    /* renamed from: d, reason: collision with root package name */
    public C3404j1 f26394d;

    /* renamed from: e, reason: collision with root package name */
    public U2 f26395e;

    /* renamed from: g, reason: collision with root package name */
    public int f26397g;

    /* renamed from: h, reason: collision with root package name */
    public long f26398h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final Cr f26391a = new Cr(16);

    /* renamed from: j, reason: collision with root package name */
    public long f26399j = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f26396f = 0;

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        while (true) {
            int i = this.f26396f;
            if (i == 0) {
                int i4 = this.i;
                Cr cr = this.f26391a;
                if (i4 == 0) {
                    if (!((K0) r02).A(cr.f24997a, 0, 8, true)) {
                        FQ fq = this.f26392b;
                        fq.getClass();
                        fq.B();
                        this.f26392b.D(new V0(com.anythink.basead.exoplayer.b.f7168b, 0L));
                        this.f26396f = 4;
                        return -1;
                    }
                    this.i = 8;
                    cr.E(0);
                    this.f26398h = cr.P();
                    this.f26397g = cr.b();
                }
                long j6 = this.f26398h;
                if (j6 == 1) {
                    ((K0) r02).A(cr.f24997a, 8, 8, false);
                    this.i += 8;
                    j6 = cr.j();
                    this.f26398h = j6;
                }
                if (this.f26397g == 1836086884) {
                    long j9 = ((K0) r02).f26571w;
                    this.f26399j = j9;
                    long j10 = this.i;
                    P1 p1 = new P1(0L, j9 - j10, com.anythink.basead.exoplayer.b.f7168b, j9, j6 - j10);
                    FQ fq2 = this.f26392b;
                    fq2.getClass();
                    InterfaceC3566m1 C8 = fq2.C(1024, 4);
                    C3322hP c3322hP = new C3322hP();
                    c3322hP.d("image/heic");
                    c3322hP.f31555k = new O3(p1);
                    C8.e(new DP(c3322hP));
                    this.f26396f = 2;
                } else {
                    this.f26396f = 1;
                }
            } else if (i == 1) {
                ((K0) r02).a((int) (this.f26398h - this.i), false);
                this.i = 0;
                this.f26396f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return -1;
                    }
                    if (this.f26394d == null || r02 != this.f26393c) {
                        K0 k02 = (K0) r02;
                        this.f26393c = k02;
                        this.f26394d = new C3404j1(k02, this.f26399j);
                    }
                    U2 u22 = this.f26395e;
                    u22.getClass();
                    int a9 = u22.a(this.f26394d, u02);
                    if (a9 == 1) {
                        u02.f28641n += this.f26399j;
                    }
                    return a9;
                }
                if (this.f26395e == null) {
                    this.f26395e = new U2(InterfaceC3837r3.f34276h0, 8);
                }
                C3404j1 c3404j1 = new C3404j1((K0) r02, this.f26399j);
                this.f26394d = c3404j1;
                if (this.f26395e.d(c3404j1)) {
                    U2 u23 = this.f26395e;
                    long j11 = this.f26399j;
                    FQ fq3 = this.f26392b;
                    fq3.getClass();
                    u23.b(new C3404j1(j11, fq3, 1));
                    this.f26396f = 3;
                } else {
                    FQ fq4 = this.f26392b;
                    fq4.getClass();
                    fq4.B();
                    this.f26392b.D(new V0(com.anythink.basead.exoplayer.b.f7168b, 0L));
                    this.f26396f = 4;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f26392b = (FQ) s02;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        if (j6 != 0) {
            if (this.f26396f == 3) {
                U2 u22 = this.f26395e;
                u22.getClass();
                u22.c(j6, j9);
                return;
            }
            return;
        }
        this.f26396f = 0;
        this.i = 0;
        this.f26399j = -1L;
        if (this.f26395e != null) {
            this.f26395e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        return AbstractC3066cl.p((K0) r02, true);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
        if (this.f26395e != null) {
            this.f26395e = null;
        }
    }
}
