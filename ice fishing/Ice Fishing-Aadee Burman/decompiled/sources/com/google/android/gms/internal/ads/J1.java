package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class J1 implements Q0 {

    /* renamed from: b, reason: collision with root package name */
    public CQ f25639b;

    /* renamed from: c, reason: collision with root package name */
    public K0 f25640c;

    /* renamed from: d, reason: collision with root package name */
    public C3381j1 f25641d;

    /* renamed from: e, reason: collision with root package name */
    public U2 f25642e;

    /* renamed from: g, reason: collision with root package name */
    public int f25644g;

    /* renamed from: h, reason: collision with root package name */
    public long f25645h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final Cr f25638a = new Cr(16);

    /* renamed from: j, reason: collision with root package name */
    public long f25646j = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f25643f = 0;

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        while (true) {
            int i = this.f25643f;
            if (i == 0) {
                int i6 = this.i;
                Cr cr = this.f25638a;
                if (i6 == 0) {
                    if (!((K0) r02).z(cr.f24252a, 0, 8, true)) {
                        CQ cq = this.f25639b;
                        cq.getClass();
                        cq.B();
                        this.f25639b.D(new V0(com.anythink.basead.exoplayer.b.f6382b, 0L));
                        this.f25643f = 4;
                        return -1;
                    }
                    this.i = 8;
                    cr.E(0);
                    this.f25645h = cr.P();
                    this.f25644g = cr.b();
                }
                long j6 = this.f25645h;
                if (j6 == 1) {
                    ((K0) r02).z(cr.f24252a, 8, 8, false);
                    this.i += 8;
                    j6 = cr.j();
                    this.f25645h = j6;
                }
                if (this.f25644g == 1836086884) {
                    long j9 = ((K0) r02).f25819w;
                    this.f25646j = j9;
                    long j10 = this.i;
                    P1 p1 = new P1(0L, j9 - j10, com.anythink.basead.exoplayer.b.f6382b, j9, j6 - j10);
                    CQ cq2 = this.f25639b;
                    cq2.getClass();
                    InterfaceC3543m1 C8 = cq2.C(1024, 4);
                    C3299hP c3299hP = new C3299hP();
                    c3299hP.d("image/heic");
                    c3299hP.f30789k = new O3(p1);
                    C8.e(new DP(c3299hP));
                    this.f25643f = 2;
                } else {
                    this.f25643f = 1;
                }
            } else if (i == 1) {
                ((K0) r02).a((int) (this.f25645h - this.i), false);
                this.i = 0;
                this.f25643f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return -1;
                    }
                    if (this.f25641d == null || r02 != this.f25640c) {
                        K0 k02 = (K0) r02;
                        this.f25640c = k02;
                        this.f25641d = new C3381j1(k02, this.f25646j);
                    }
                    U2 u22 = this.f25642e;
                    u22.getClass();
                    int a9 = u22.a(this.f25641d, u02);
                    if (a9 == 1) {
                        u02.f27844n += this.f25646j;
                    }
                    return a9;
                }
                if (this.f25642e == null) {
                    this.f25642e = new U2(InterfaceC3814r3.m0, 8);
                }
                C3381j1 c3381j1 = new C3381j1((K0) r02, this.f25646j);
                this.f25641d = c3381j1;
                if (this.f25642e.d(c3381j1)) {
                    U2 u23 = this.f25642e;
                    long j11 = this.f25646j;
                    CQ cq3 = this.f25639b;
                    cq3.getClass();
                    u23.b(new C3381j1(j11, cq3, 1));
                    this.f25643f = 3;
                } else {
                    CQ cq4 = this.f25639b;
                    cq4.getClass();
                    cq4.B();
                    this.f25639b.D(new V0(com.anythink.basead.exoplayer.b.f6382b, 0L));
                    this.f25643f = 4;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f25639b = (CQ) s02;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        if (j6 != 0) {
            if (this.f25643f == 3) {
                U2 u22 = this.f25642e;
                u22.getClass();
                u22.c(j6, j9);
                return;
            }
            return;
        }
        this.f25643f = 0;
        this.i = 0;
        this.f25646j = -1L;
        if (this.f25642e != null) {
            this.f25642e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        return AbstractC3043cl.p((K0) r02, true);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
        if (this.f25642e != null) {
            this.f25642e = null;
        }
    }
}
