package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3073d4 implements O0 {

    /* renamed from: c, reason: collision with root package name */
    public final Lr f29782c;

    /* renamed from: d, reason: collision with root package name */
    public final Er f29783d;

    /* renamed from: e, reason: collision with root package name */
    public PQ f29784e;

    /* renamed from: f, reason: collision with root package name */
    public long f29785f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29787h;
    public boolean i;

    /* renamed from: a, reason: collision with root package name */
    public final C3127e4 f29780a = new C3127e4(null, 0, com.anythink.basead.exoplayer.k.o.f8617r, true);

    /* renamed from: b, reason: collision with root package name */
    public final Lr f29781b = new Lr(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f29786g = -1;

    static {
        int i = AbstractC3035cL.J;
    }

    public C3073d4() {
        Lr lr = new Lr(10);
        this.f29782c = lr;
        byte[] bArr = lr.f26233a;
        this.f29783d = new Er(bArr, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        this.f29784e = (PQ) q02;
        this.f29780a.e(q02, new D4(Integer.MIN_VALUE, 0, 1));
        ((PQ) q02).v();
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        Lr lr;
        J0 j02;
        int i = 0;
        while (true) {
            lr = this.f29782c;
            j02 = (J0) p02;
            j02.I(lr.f26233a, 0, 10, false);
            lr.E(0);
            if (lr.O() != 4801587) {
                break;
            }
            lr.G(3);
            int g9 = lr.g();
            i += g9 + 10;
            j02.d(g9, false);
        }
        j02.f25677y = 0;
        j02.d(i, false);
        if (this.f29786g == -1) {
            this.f29786g = i;
        }
        int i4 = 0;
        int i9 = 0;
        int i10 = i;
        do {
            j02.I(lr.f26233a, 0, 2, false);
            lr.E(0);
            if ((lr.L() & 65526) == 65520) {
                i4++;
                if (i4 >= 4 && i9 > 188) {
                    return true;
                }
                j02.I(lr.f26233a, 0, 4, false);
                Er er = this.f29783d;
                er.d(14);
                int h9 = er.h(13);
                if (h9 <= 6) {
                    i10++;
                    j02.f25677y = 0;
                    j02.d(i10, false);
                } else {
                    j02.d(h9 - 6, false);
                    i9 += h9;
                }
            } else {
                i10++;
                j02.f25677y = 0;
                j02.d(i10, false);
            }
            i4 = 0;
            i9 = 0;
        } while (i10 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        this.f29787h = false;
        this.f29780a.a();
        this.f29785f = j10;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final int e(P0 p02, S0 s02) {
        this.f29784e.getClass();
        Lr lr = this.f29781b;
        int z8 = ((J0) p02).z(lr.f26233a, 0, 2048);
        if (!this.i) {
            this.f29784e.w(new T0(com.anythink.basead.exoplayer.b.f6539b, 0L));
            this.i = true;
        }
        if (z8 == -1) {
            return -1;
        }
        lr.E(0);
        lr.C(z8);
        boolean z9 = this.f29787h;
        C3127e4 c3127e4 = this.f29780a;
        if (!z9) {
            c3127e4.f30302u = this.f29785f;
            this.f29787h = true;
        }
        c3127e4.c(lr);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }
}
