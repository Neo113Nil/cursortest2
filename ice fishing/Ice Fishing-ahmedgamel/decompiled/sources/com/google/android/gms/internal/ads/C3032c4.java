package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3032c4 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3086d4 f30208a = new C3086d4(0, 0, null, com.anythink.basead.exoplayer.k.o.f9254z);

    /* renamed from: b, reason: collision with root package name */
    public final Cr f30209b = new Cr(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f30210c;

    static {
        int i = AbstractC2792Sd.f28293K;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        Cr cr = this.f30209b;
        int r9 = ((K0) r02).r(cr.f24997a, 0, 2786);
        if (r9 == -1) {
            return -1;
        }
        cr.E(0);
        cr.C(r9);
        boolean z6 = this.f30210c;
        C3086d4 c3086d4 = this.f30208a;
        if (!z6) {
            c3086d4.f30478o = 0L;
            this.f30210c = true;
        }
        c3086d4.b(cr);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f30208a.a(s02, new F4(Integer.MIN_VALUE, 0, 1));
        FQ fq = (FQ) s02;
        fq.B();
        fq.D(new V0(com.anythink.basead.exoplayer.b.f7168b, 0L));
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f30210c = false;
        this.f30208a.c();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        K0 k02;
        int E8;
        Cr cr = new Cr(10);
        int i = 0;
        while (true) {
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
        int i4 = 0;
        int i6 = i;
        while (true) {
            k02.E(cr.f24997a, 0, 6, false);
            cr.E(0);
            if (cr.L() != 2935) {
                k02.f26573y = 0;
                i6++;
                if (i6 - i >= 8192) {
                    break;
                }
                k02.d(i6, false);
                i4 = 0;
            } else {
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] bArr = cr.f24997a;
                if (bArr.length < 6) {
                    E8 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i9 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    E8 = i9 + i9;
                } else {
                    byte b9 = bArr[4];
                    E8 = AbstractC3066cl.E((b9 & 192) >> 6, b9 & com.anythink.core.common.s.a.c.f17105c);
                }
                if (E8 == -1) {
                    break;
                }
                k02.d(E8 - 6, false);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
