package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3277h3 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public CQ f30716a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC3545m3 f30717b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30718c;

    static {
        int i = AbstractC3043cl.f29569N;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0178 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0179  */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(R0 r02, U0 u02) {
        int i;
        Cr cr;
        byte[] bArr;
        this.f30716a.getClass();
        if (this.f30717b == null) {
            K0 k02 = (K0) r02;
            if (!g(k02)) {
                throw U4.a(null, "Failed to determine bitstream type");
            }
            k02.f25821y = 0;
        }
        if (!this.f30718c) {
            InterfaceC3543m1 C8 = this.f30716a.C(0, 1);
            this.f30716a.B();
            AbstractC3545m3 abstractC3545m3 = this.f30717b;
            abstractC3545m3.f31882c = this.f30716a;
            abstractC3545m3.f31881b = C8;
            abstractC3545m3.a(true);
            this.f30718c = true;
        }
        AbstractC3545m3 abstractC3545m32 = this.f30717b;
        abstractC3545m32.f31881b.getClass();
        String str = AbstractC3159eu.f29993a;
        int i6 = abstractC3545m32.f31887h;
        C3331i3 c3331i3 = abstractC3545m32.f31880a;
        if (i6 != 0) {
            if (i6 == 1) {
                ((K0) r02).a((int) abstractC3545m32.f31885f, false);
                abstractC3545m32.f31887h = 2;
                return 0;
            }
            if (i6 != 2) {
                return -1;
            }
            K0 k03 = (K0) r02;
            long h9 = abstractC3545m32.f31883d.h(k03);
            if (h9 >= 0) {
                u02.f27844n = h9;
                return 1;
            }
            if (h9 < -1) {
                abstractC3545m32.d(-(h9 + 2));
            }
            if (!abstractC3545m32.f31890l) {
                InterfaceC3113e1 mo9i = abstractC3545m32.f31883d.mo9i();
                mo9i.getClass();
                abstractC3545m32.f31882c.D(mo9i);
                InterfaceC3543m1 interfaceC3543m1 = abstractC3545m32.f31881b;
                mo9i.c();
                interfaceC3543m1.getClass();
                abstractC3545m32.f31890l = true;
            }
            if (abstractC3545m32.f31889k <= 0 && !c3331i3.a(k03)) {
                abstractC3545m32.f31887h = 3;
                return -1;
            }
            abstractC3545m32.f31889k = 0L;
            Cr cr2 = c3331i3.f30991b;
            long b9 = abstractC3545m32.b(cr2);
            if (b9 >= 0) {
                long j6 = abstractC3545m32.f31886g;
                if (j6 + b9 >= abstractC3545m32.f31884e) {
                    abstractC3545m32.f31881b.a(cr2.f24254c, cr2);
                    abstractC3545m32.f31881b.c((j6 * 1000000) / abstractC3545m32.i, 1, cr2.f24254c, 0, null);
                    abstractC3545m32.f31884e = -1L;
                }
            }
            abstractC3545m32.f31886g += b9;
            return 0;
        }
        while (true) {
            K0 k04 = (K0) r02;
            if (!c3331i3.a(k04)) {
                abstractC3545m32.f31887h = 3;
                return -1;
            }
            long j9 = k04.f25819w;
            long j10 = abstractC3545m32.f31885f;
            abstractC3545m32.f31889k = j9 - j10;
            S0.c cVar = abstractC3545m32.f31888j;
            Cr cr3 = c3331i3.f30991b;
            if (abstractC3545m32.c(cr3, j10, cVar)) {
                abstractC3545m32.f31885f = ((K0) r02).f25819w;
            } else {
                DP dp = (DP) abstractC3545m32.f31888j.f2775u;
                abstractC3545m32.i = dp.J;
                if (!abstractC3545m32.f31891m) {
                    abstractC3545m32.f31881b.e(dp);
                    abstractC3545m32.f31891m = true;
                }
                G2 g22 = (G2) abstractC3545m32.f31888j.f2776v;
                if (g22 != null) {
                    abstractC3545m32.f31883d = g22;
                } else {
                    long j11 = ((K0) r02).f25818v;
                    if (j11 != -1) {
                        C3383j3 c3383j3 = c3331i3.f30990a;
                        boolean z3 = (c3383j3.f31159a & 4) != 0;
                        long j12 = abstractC3545m32.f31885f;
                        int i9 = c3383j3.f31162d + c3383j3.f31163e;
                        long j13 = c3383j3.f31160b;
                        long j14 = i9;
                        i = 2;
                        cr = cr3;
                        abstractC3545m32.f31883d = new C3169f3(abstractC3545m32, j12, j11, j14, j13, z3);
                        abstractC3545m32.f31887h = i;
                        bArr = cr.f24252a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        cr.z(cr.f24254c, Arrays.copyOf(bArr, Math.max(65025, cr.f24254c)));
                        return 0;
                    }
                    abstractC3545m32.f31883d = new V2(17);
                }
                i = 2;
                cr = cr3;
                abstractC3545m32.f31887h = i;
                bArr = cr.f24252a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f30716a = (CQ) s02;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        AbstractC3545m3 abstractC3545m3 = this.f30717b;
        if (abstractC3545m3 != null) {
            C3331i3 c3331i3 = abstractC3545m3.f31880a;
            C3383j3 c3383j3 = c3331i3.f30990a;
            c3383j3.f31159a = 0;
            c3383j3.f31160b = 0L;
            c3383j3.f31161c = 0;
            c3383j3.f31162d = 0;
            c3383j3.f31163e = 0;
            c3331i3.f30991b.y(0);
            c3331i3.f30992c = -1;
            c3331i3.f30994e = false;
            if (j6 == 0) {
                abstractC3545m3.a(!abstractC3545m3.f31890l);
                return;
            }
            if (abstractC3545m3.f31887h != 0) {
                long j10 = (abstractC3545m3.i * j9) / 1000000;
                abstractC3545m3.f31884e = j10;
                InterfaceC3437k3 interfaceC3437k3 = abstractC3545m3.f31883d;
                String str = AbstractC3159eu.f29993a;
                interfaceC3437k3.a(j10);
                abstractC3545m3.f31887h = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        try {
            return g((K0) r02);
        } catch (U4 unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }

    public final boolean g(K0 k02) {
        C3383j3 c3383j3 = new C3383j3();
        if (c3383j3.b(k02, true) && (c3383j3.f31159a & 2) == 2) {
            int min = Math.min(c3383j3.f31163e, 8);
            Cr cr = new Cr(min);
            k02.A(cr.f24252a, 0, min, false);
            cr.E(0);
            if (cr.B() >= 5 && cr.K() == 127 && cr.P() == 1179402563) {
                this.f30717b = new C3223g3();
                return true;
            }
            cr.E(0);
            try {
                if (QC.m(1, cr, true)) {
                    this.f30717b = new C3599n3();
                    return true;
                }
            } catch (U4 unused) {
            }
            cr.E(0);
            if (C3491l3.e(cr, C3491l3.f31686o)) {
                this.f30717b = new C3491l3();
                return true;
            }
        }
        return false;
    }
}
