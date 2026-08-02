package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3193f4 implements Q0 {

    /* renamed from: c, reason: collision with root package name */
    public final Cr f30818c;

    /* renamed from: d, reason: collision with root package name */
    public final C4256yr f30819d;

    /* renamed from: e, reason: collision with root package name */
    public FQ f30820e;

    /* renamed from: f, reason: collision with root package name */
    public long f30821f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30823h;
    public boolean i;

    /* renamed from: a, reason: collision with root package name */
    public final C3247g4 f30816a = new C3247g4(null, 0, com.anythink.basead.exoplayer.k.o.f9246r, true);

    /* renamed from: b, reason: collision with root package name */
    public final Cr f30817b = new Cr(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f30822g = -1;

    static {
        int i = AbstractC3066cl.f30354N;
    }

    public C3193f4() {
        Cr cr = new Cr(10);
        this.f30818c = cr;
        byte[] bArr = cr.f24997a;
        this.f30819d = new C4256yr(bArr, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        this.f30820e.getClass();
        Cr cr = this.f30817b;
        int r9 = ((K0) r02).r(cr.f24997a, 0, 2048);
        if (!this.i) {
            this.f30820e.D(new V0(com.anythink.basead.exoplayer.b.f7168b, 0L));
            this.i = true;
        }
        if (r9 == -1) {
            return -1;
        }
        cr.E(0);
        cr.C(r9);
        boolean z6 = this.f30823h;
        C3247g4 c3247g4 = this.f30816a;
        if (!z6) {
            c3247g4.f31281u = this.f30821f;
            this.f30823h = true;
        }
        c3247g4.b(cr);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f30820e = (FQ) s02;
        this.f30816a.a(s02, new F4(Integer.MIN_VALUE, 0, 1));
        ((FQ) s02).B();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f30823h = false;
        this.f30816a.c();
        this.f30821f = j9;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        Cr cr;
        K0 k02;
        int i = 0;
        while (true) {
            cr = this.f30818c;
            k02 = (K0) r02;
            k02.E(cr.f24997a, 0, 10, false);
            cr.E(0);
            if (cr.O() != 4801587) {
                break;
            }
            cr.G(3);
            int g9 = cr.g();
            i += g9 + 10;
            k02.d(g9, false);
        }
        k02.f26573y = 0;
        k02.d(i, false);
        if (this.f30822g == -1) {
            this.f30822g = i;
        }
        int i4 = 0;
        int i6 = 0;
        int i9 = i;
        do {
            k02.E(cr.f24997a, 0, 2, false);
            cr.E(0);
            if ((cr.L() & 65526) == 65520) {
                i4++;
                if (i4 >= 4 && i6 > 188) {
                    return true;
                }
                k02.E(cr.f24997a, 0, 4, false);
                C4256yr c4256yr = this.f30819d;
                c4256yr.d(14);
                int h3 = c4256yr.h(13);
                if (h3 <= 6) {
                    i9++;
                    k02.f26573y = 0;
                    k02.d(i9, false);
                } else {
                    k02.d(h3 - 6, false);
                    i6 += h3;
                }
            } else {
                i9++;
                k02.f26573y = 0;
                k02.d(i9, false);
            }
            i4 = 0;
            i6 = 0;
        } while (i9 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
