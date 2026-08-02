package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3300h3 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public FQ f31482a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC3568m3 f31483b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31484c;

    static {
        int i = AbstractC3066cl.f30354N;
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
        this.f31482a.getClass();
        if (this.f31483b == null) {
            K0 k02 = (K0) r02;
            if (!g(k02)) {
                throw U4.a(null, "Failed to determine bitstream type");
            }
            k02.f26573y = 0;
        }
        if (!this.f31484c) {
            InterfaceC3566m1 C8 = this.f31482a.C(0, 1);
            this.f31482a.B();
            AbstractC3568m3 abstractC3568m3 = this.f31483b;
            abstractC3568m3.f32662c = this.f31482a;
            abstractC3568m3.f32661b = C8;
            abstractC3568m3.a(true);
            this.f31484c = true;
        }
        AbstractC3568m3 abstractC3568m32 = this.f31483b;
        abstractC3568m32.f32661b.getClass();
        String str = AbstractC3182eu.f30782a;
        int i4 = abstractC3568m32.f32667h;
        C3354i3 c3354i3 = abstractC3568m32.f32660a;
        if (i4 != 0) {
            if (i4 == 1) {
                ((K0) r02).a((int) abstractC3568m32.f32665f, false);
                abstractC3568m32.f32667h = 2;
                return 0;
            }
            if (i4 != 2) {
                return -1;
            }
            K0 k03 = (K0) r02;
            long h3 = abstractC3568m32.f32663d.h(k03);
            if (h3 >= 0) {
                u02.f28641n = h3;
                return 1;
            }
            if (h3 < -1) {
                abstractC3568m32.d(-(h3 + 2));
            }
            if (!abstractC3568m32.f32670l) {
                InterfaceC3136e1 mo8i = abstractC3568m32.f32663d.mo8i();
                mo8i.getClass();
                abstractC3568m32.f32662c.D(mo8i);
                InterfaceC3566m1 interfaceC3566m1 = abstractC3568m32.f32661b;
                mo8i.c();
                interfaceC3566m1.getClass();
                abstractC3568m32.f32670l = true;
            }
            if (abstractC3568m32.f32669k <= 0 && !c3354i3.a(k03)) {
                abstractC3568m32.f32667h = 3;
                return -1;
            }
            abstractC3568m32.f32669k = 0L;
            Cr cr2 = c3354i3.f31764b;
            long b9 = abstractC3568m32.b(cr2);
            if (b9 >= 0) {
                long j6 = abstractC3568m32.f32666g;
                if (j6 + b9 >= abstractC3568m32.f32664e) {
                    abstractC3568m32.f32661b.a(cr2.f24999c, cr2);
                    abstractC3568m32.f32661b.c((j6 * 1000000) / abstractC3568m32.i, 1, cr2.f24999c, 0, null);
                    abstractC3568m32.f32664e = -1L;
                }
            }
            abstractC3568m32.f32666g += b9;
            return 0;
        }
        while (true) {
            K0 k04 = (K0) r02;
            if (!c3354i3.a(k04)) {
                abstractC3568m32.f32667h = 3;
                return -1;
            }
            long j9 = k04.f26571w;
            long j10 = abstractC3568m32.f32665f;
            abstractC3568m32.f32669k = j9 - j10;
            S0.c cVar = abstractC3568m32.f32668j;
            Cr cr3 = c3354i3.f31764b;
            if (abstractC3568m32.c(cr3, j10, cVar)) {
                abstractC3568m32.f32665f = ((K0) r02).f26571w;
            } else {
                DP dp = (DP) abstractC3568m32.f32668j.f2902u;
                abstractC3568m32.i = dp.J;
                if (!abstractC3568m32.f32671m) {
                    abstractC3568m32.f32661b.e(dp);
                    abstractC3568m32.f32671m = true;
                }
                G2 g22 = (G2) abstractC3568m32.f32668j.f2903v;
                if (g22 != null) {
                    abstractC3568m32.f32663d = g22;
                } else {
                    long j11 = ((K0) r02).f26570v;
                    if (j11 != -1) {
                        C3406j3 c3406j3 = c3354i3.f31763a;
                        boolean z6 = (c3406j3.f31946a & 4) != 0;
                        long j12 = abstractC3568m32.f32665f;
                        int i6 = c3406j3.f31949d + c3406j3.f31950e;
                        long j13 = c3406j3.f31947b;
                        long j14 = i6;
                        i = 2;
                        cr = cr3;
                        abstractC3568m32.f32663d = new C3192f3(abstractC3568m32, j12, j11, j14, j13, z6);
                        abstractC3568m32.f32667h = i;
                        bArr = cr.f24997a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        cr.z(cr.f24999c, Arrays.copyOf(bArr, Math.max(65025, cr.f24999c)));
                        return 0;
                    }
                    abstractC3568m32.f32663d = new V2(17);
                }
                i = 2;
                cr = cr3;
                abstractC3568m32.f32667h = i;
                bArr = cr.f24997a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f31482a = (FQ) s02;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        AbstractC3568m3 abstractC3568m3 = this.f31483b;
        if (abstractC3568m3 != null) {
            C3354i3 c3354i3 = abstractC3568m3.f32660a;
            C3406j3 c3406j3 = c3354i3.f31763a;
            c3406j3.f31946a = 0;
            c3406j3.f31947b = 0L;
            c3406j3.f31948c = 0;
            c3406j3.f31949d = 0;
            c3406j3.f31950e = 0;
            c3354i3.f31764b.y(0);
            c3354i3.f31765c = -1;
            c3354i3.f31767e = false;
            if (j6 == 0) {
                abstractC3568m3.a(!abstractC3568m3.f32670l);
                return;
            }
            if (abstractC3568m3.f32667h != 0) {
                long j10 = (abstractC3568m3.i * j9) / 1000000;
                abstractC3568m3.f32664e = j10;
                InterfaceC3460k3 interfaceC3460k3 = abstractC3568m3.f32663d;
                String str = AbstractC3182eu.f30782a;
                interfaceC3460k3.a(j10);
                abstractC3568m3.f32667h = 2;
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
        C3406j3 c3406j3 = new C3406j3();
        if (c3406j3.b(k02, true) && (c3406j3.f31946a & 2) == 2) {
            int min = Math.min(c3406j3.f31950e, 8);
            Cr cr = new Cr(min);
            k02.E(cr.f24997a, 0, min, false);
            cr.E(0);
            if (cr.B() >= 5 && cr.K() == 127 && cr.P() == 1179402563) {
                this.f31483b = new C3246g3();
                return true;
            }
            cr.E(0);
            try {
                if (QC.m(1, cr, true)) {
                    this.f31483b = new C3622n3();
                    return true;
                }
            } catch (U4 unused) {
            }
            cr.E(0);
            if (C3514l3.e(cr, C3514l3.f32466o)) {
                this.f31483b = new C3514l3();
                return true;
            }
        }
        return false;
    }
}
