package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3009c4 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3063d4 f29425a = new C3063d4(0, 0, null, com.anythink.basead.exoplayer.k.o.f8468z);

    /* renamed from: b, reason: collision with root package name */
    public final Cr f29426b = new Cr(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f29427c;

    static {
        int i = AbstractC2772Sd.f27501K;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        Cr cr = this.f29426b;
        int m4 = ((K0) r02).m(cr.f24252a, 0, 2786);
        if (m4 == -1) {
            return -1;
        }
        cr.E(0);
        cr.C(m4);
        boolean z3 = this.f29427c;
        C3063d4 c3063d4 = this.f29425a;
        if (!z3) {
            c3063d4.f29706o = 0L;
            this.f29427c = true;
        }
        c3063d4.b(cr);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f29425a.a(s02, new F4(Integer.MIN_VALUE, 0, 1));
        CQ cq = (CQ) s02;
        cq.B();
        cq.D(new V0(com.anythink.basead.exoplayer.b.f6382b, 0L));
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f29427c = false;
        this.f29425a.c();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        K0 k02;
        int E8;
        Cr cr = new Cr(10);
        int i = 0;
        while (true) {
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
        int i6 = 0;
        int i9 = i;
        while (true) {
            k02.A(cr.f24252a, 0, 6, false);
            cr.E(0);
            if (cr.L() != 2935) {
                k02.f25821y = 0;
                i9++;
                if (i9 - i >= 8192) {
                    break;
                }
                k02.c(i9, false);
                i6 = 0;
            } else {
                i6++;
                if (i6 >= 4) {
                    return true;
                }
                byte[] bArr = cr.f24252a;
                if (bArr.length < 6) {
                    E8 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i10 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    E8 = i10 + i10;
                } else {
                    byte b9 = bArr[4];
                    E8 = AbstractC3043cl.E((b9 & 192) >> 6, b9 & com.anythink.core.common.s.a.c.f16318c);
                }
                if (E8 == -1) {
                    break;
                }
                k02.c(E8 - 6, false);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
