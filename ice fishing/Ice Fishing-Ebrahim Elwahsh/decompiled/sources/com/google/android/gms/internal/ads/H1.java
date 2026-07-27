package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class H1 implements O0 {

    /* renamed from: b, reason: collision with root package name */
    public PQ f25271b;

    /* renamed from: c, reason: collision with root package name */
    public J0 f25272c;

    /* renamed from: d, reason: collision with root package name */
    public C3288h1 f25273d;

    /* renamed from: e, reason: collision with root package name */
    public S2 f25274e;

    /* renamed from: g, reason: collision with root package name */
    public int f25276g;

    /* renamed from: h, reason: collision with root package name */
    public long f25277h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final Lr f25270a = new Lr(16);

    /* renamed from: j, reason: collision with root package name */
    public long f25278j = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f25275f = 0;

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        this.f25271b = (PQ) q02;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        return AbstractC3035cL.n((J0) p02, true);
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        if (j9 != 0) {
            if (this.f25275f == 3) {
                S2 s22 = this.f25274e;
                s22.getClass();
                s22.c(j9, j10);
                return;
            }
            return;
        }
        this.f25275f = 0;
        this.i = 0;
        this.f25278j = -1L;
        if (this.f25274e != null) {
            this.f25274e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final int e(P0 p02, S0 s02) {
        while (true) {
            int i = this.f25275f;
            if (i == 0) {
                int i4 = this.i;
                Lr lr = this.f25270a;
                if (i4 == 0) {
                    if (!((J0) p02).E(lr.f26233a, 0, 8, true)) {
                        PQ pq = this.f25271b;
                        pq.getClass();
                        pq.v();
                        this.f25271b.w(new T0(com.anythink.basead.exoplayer.b.f6539b, 0L));
                        this.f25275f = 4;
                        return -1;
                    }
                    this.i = 8;
                    lr.E(0);
                    this.f25277h = lr.P();
                    this.f25276g = lr.b();
                }
                long j9 = this.f25277h;
                if (j9 == 1) {
                    ((J0) p02).E(lr.f26233a, 8, 8, false);
                    this.i += 8;
                    j9 = lr.j();
                    this.f25277h = j9;
                }
                if (this.f25276g == 1836086884) {
                    long j10 = ((J0) p02).f25675w;
                    this.f25278j = j10;
                    long j11 = this.i;
                    N1 n1 = new N1(0L, j10 - j11, com.anythink.basead.exoplayer.b.f6539b, j10, j9 - j11);
                    PQ pq2 = this.f25271b;
                    pq2.getClass();
                    InterfaceC3448k1 x3 = pq2.x(1024, 4);
                    C4065vP c4065vP = new C4065vP();
                    c4065vP.d("image/heic");
                    c4065vP.f34782k = new R3(n1);
                    x3.e(new TP(c4065vP));
                    this.f25275f = 2;
                } else {
                    this.f25275f = 1;
                }
            } else if (i == 1) {
                ((J0) p02).b((int) (this.f25277h - this.i), false);
                this.i = 0;
                this.f25275f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return -1;
                    }
                    if (this.f25273d == null || p02 != this.f25272c) {
                        J0 j02 = (J0) p02;
                        this.f25272c = j02;
                        this.f25273d = new C3288h1(j02, this.f25278j);
                    }
                    S2 s22 = this.f25274e;
                    s22.getClass();
                    int e6 = s22.e(this.f25273d, s02);
                    if (e6 == 1) {
                        s02.f27467n += this.f25278j;
                    }
                    return e6;
                }
                if (this.f25274e == null) {
                    this.f25274e = new S2(InterfaceC3720p3.m0, 8);
                }
                C3288h1 c3288h1 = new C3288h1((J0) p02, this.f25278j);
                this.f25273d = c3288h1;
                if (this.f25274e.b(c3288h1)) {
                    S2 s23 = this.f25274e;
                    long j12 = this.f25278j;
                    PQ pq3 = this.f25271b;
                    pq3.getClass();
                    s23.a(new C3288h1(j12, pq3, 1));
                    this.f25275f = 3;
                } else {
                    PQ pq4 = this.f25271b;
                    pq4.getClass();
                    pq4.v();
                    this.f25271b.w(new T0(com.anythink.basead.exoplayer.b.f6539b, 0L));
                    this.f25275f = 4;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
        if (this.f25274e != null) {
            this.f25274e = null;
        }
    }
}
