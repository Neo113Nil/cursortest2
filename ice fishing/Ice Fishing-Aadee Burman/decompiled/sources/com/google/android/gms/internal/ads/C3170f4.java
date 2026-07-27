package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3170f4 implements Q0 {

    /* renamed from: c, reason: collision with root package name */
    public final Cr f30031c;

    /* renamed from: d, reason: collision with root package name */
    public final C4233yr f30032d;

    /* renamed from: e, reason: collision with root package name */
    public CQ f30033e;

    /* renamed from: f, reason: collision with root package name */
    public long f30034f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30036h;
    public boolean i;

    /* renamed from: a, reason: collision with root package name */
    public final C3224g4 f30029a = new C3224g4(null, 0, com.anythink.basead.exoplayer.k.o.f8460r, true);

    /* renamed from: b, reason: collision with root package name */
    public final Cr f30030b = new Cr(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f30035g = -1;

    static {
        int i = AbstractC3043cl.f29569N;
    }

    public C3170f4() {
        Cr cr = new Cr(10);
        this.f30031c = cr;
        byte[] bArr = cr.f24252a;
        this.f30032d = new C4233yr(bArr, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        this.f30033e.getClass();
        Cr cr = this.f30030b;
        int m4 = ((K0) r02).m(cr.f24252a, 0, 2048);
        if (!this.i) {
            this.f30033e.D(new V0(com.anythink.basead.exoplayer.b.f6382b, 0L));
            this.i = true;
        }
        if (m4 == -1) {
            return -1;
        }
        cr.E(0);
        cr.C(m4);
        boolean z3 = this.f30036h;
        C3224g4 c3224g4 = this.f30029a;
        if (!z3) {
            c3224g4.f30515u = this.f30034f;
            this.f30036h = true;
        }
        c3224g4.b(cr);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f30033e = (CQ) s02;
        this.f30029a.a(s02, new F4(Integer.MIN_VALUE, 0, 1));
        ((CQ) s02).B();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f30036h = false;
        this.f30029a.c();
        this.f30034f = j9;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        Cr cr;
        K0 k02;
        int i = 0;
        while (true) {
            cr = this.f30031c;
            k02 = (K0) r02;
            k02.A(cr.f24252a, 0, 10, false);
            cr.E(0);
            if (cr.O() != 4801587) {
                break;
            }
            cr.G(3);
            int g4 = cr.g();
            i += g4 + 10;
            k02.c(g4, false);
        }
        k02.f25821y = 0;
        k02.c(i, false);
        if (this.f30035g == -1) {
            this.f30035g = i;
        }
        int i6 = 0;
        int i9 = 0;
        int i10 = i;
        do {
            k02.A(cr.f24252a, 0, 2, false);
            cr.E(0);
            if ((cr.L() & 65526) == 65520) {
                i6++;
                if (i6 >= 4 && i9 > 188) {
                    return true;
                }
                k02.A(cr.f24252a, 0, 4, false);
                C4233yr c4233yr = this.f30032d;
                c4233yr.d(14);
                int h9 = c4233yr.h(13);
                if (h9 <= 6) {
                    i10++;
                    k02.f25821y = 0;
                    k02.c(i10, false);
                } else {
                    k02.c(h9 - 6, false);
                    i9 += h9;
                }
            } else {
                i10++;
                k02.f25821y = 0;
                k02.c(i10, false);
            }
            i6 = 0;
            i9 = 0;
        } while (i10 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
