package j0;

import m0.x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0.e0 f3456a = new m0.e0(k.f3396r);

    public static final void a(h2.h0 h0Var, u0.d dVar, m0.r rVar, int i10) {
        rVar.Z(-460300127);
        int i11 = (rVar.f(h0Var) ? 4 : 2) | i10 | (rVar.h(dVar) ? 32 : 16);
        if ((i11 & 19) == 18 && rVar.B()) {
            rVar.S();
        } else {
            m0.e0 e0Var = f3456a;
            m0.z.a(e0Var.a(((h2.h0) rVar.j(e0Var)).c(h0Var)), dVar, rVar, (i11 & 112) | 8);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new a1.f(h0Var, dVar, i10, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, y0.n nVar, long j3, long j6, long j10, r2.k kVar, long j11, int i10, boolean z10, int i11, int i12, h2.h0 h0Var, m0.r rVar, int i13, int i14) {
        int i15;
        y0.n nVar2;
        int i16;
        int i17;
        r2.k kVar2;
        int i18;
        long j12;
        y0.n nVar3;
        long j13;
        long j14;
        int i19;
        boolean z11;
        int i20;
        int i21;
        long j15;
        long b2;
        boolean z12;
        int i22;
        int i23;
        boolean z13;
        int i24;
        y0.n nVar4;
        long j16;
        long j17;
        long j18;
        r2.k kVar3;
        long j19;
        x1 s10;
        rVar.Z(-2055108902);
        char c3 = 2;
        if ((i13 & 6) == 0) {
            i15 = i13 | (rVar.f(str) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            nVar2 = nVar;
            i15 |= rVar.f(nVar2) ? 32 : 16;
            i16 = 115043712 | i15;
            i17 = i14 & 512;
            if (i17 == 0) {
                i16 = 920350080 | i15;
            } else if ((i13 & 805306368) == 0) {
                kVar2 = kVar;
                i16 |= rVar.f(kVar2) ? 536870912 : 268435456;
                i18 = i14 & 1024;
                if (i18 != 0) {
                    c3 = 6;
                    j12 = j11;
                } else {
                    j12 = j11;
                    if (rVar.e(j12)) {
                        c3 = 4;
                    }
                }
                int i26 = c3 | 28080 | (rVar.f(h0Var) ? 1048576 : 524288);
                if ((306783379 & i16) != 306783378 && (i26 & 599187) == 599186 && rVar.B()) {
                    rVar.S();
                    j16 = j3;
                    z13 = z10;
                    i24 = i11;
                    i22 = i12;
                    kVar3 = kVar2;
                    nVar4 = nVar2;
                    j18 = j12;
                    j19 = j6;
                    j17 = j10;
                    i23 = i10;
                } else {
                    rVar.U();
                    if ((i13 & 1) != 0 || rVar.z()) {
                        nVar3 = i25 != 0 ? y0.k.f8442a : nVar2;
                        j13 = f1.q.f2283h;
                        j14 = s2.n.f6401c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i18 != 0) {
                            j12 = j14;
                        }
                        i19 = 1;
                        z11 = true;
                        i20 = 1;
                        i21 = Integer.MAX_VALUE;
                        j15 = j14;
                    } else {
                        rVar.S();
                        j14 = j6;
                        j15 = j10;
                        i19 = i10;
                        z11 = z10;
                        i21 = i11;
                        i20 = i12;
                        nVar3 = nVar2;
                        j13 = j3;
                    }
                    rVar.r();
                    rVar.X(-1827892941);
                    if (j13 != 16) {
                        b2 = j13;
                        z12 = false;
                    } else {
                        rVar.X(-1827892168);
                        b2 = h0Var.b();
                        if (b2 == 16) {
                            b2 = ((f1.q) rVar.j(n.f3409a)).f2285a;
                        }
                        z12 = false;
                        rVar.q(false);
                    }
                    rVar.q(z12);
                    y0.n nVar5 = nVar3;
                    int i27 = i19;
                    boolean z14 = z11;
                    int i28 = i21;
                    int i29 = i20;
                    v6.a.b(str, nVar5, h2.h0.d(h0Var, b2, j14, j15, kVar2 != null ? kVar2.f6031a : Integer.MIN_VALUE, j12, 16609104), i27, z14, i28, i29, rVar, (i16 & 126) | 14380032);
                    i22 = i29;
                    i23 = i27;
                    long j20 = j14;
                    z13 = z14;
                    i24 = i28;
                    nVar4 = nVar3;
                    j16 = j13;
                    j17 = j15;
                    j18 = j12;
                    kVar3 = kVar2;
                    j19 = j20;
                }
                s10 = rVar.s();
                if (s10 != null) {
                    s10.f4809d = new q0(str, nVar4, j16, j19, j17, kVar3, j18, i23, z13, i24, i22, h0Var, i13, i14);
                    return;
                }
                return;
            }
            kVar2 = kVar;
            i18 = i14 & 1024;
            if (i18 != 0) {
            }
            int i262 = c3 | 28080 | (rVar.f(h0Var) ? 1048576 : 524288);
            if ((306783379 & i16) != 306783378) {
            }
            rVar.U();
            if ((i13 & 1) != 0) {
            }
            if (i25 != 0) {
            }
            j13 = f1.q.f2283h;
            j14 = s2.n.f6401c;
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            i19 = 1;
            z11 = true;
            i20 = 1;
            i21 = Integer.MAX_VALUE;
            j15 = j14;
            rVar.r();
            rVar.X(-1827892941);
            if (j13 != 16) {
            }
            rVar.q(z12);
            y0.n nVar52 = nVar3;
            int i272 = i19;
            boolean z142 = z11;
            int i282 = i21;
            int i292 = i20;
            v6.a.b(str, nVar52, h2.h0.d(h0Var, b2, j14, j15, kVar2 != null ? kVar2.f6031a : Integer.MIN_VALUE, j12, 16609104), i272, z142, i282, i292, rVar, (i16 & 126) | 14380032);
            i22 = i292;
            i23 = i272;
            long j202 = j14;
            z13 = z142;
            i24 = i282;
            nVar4 = nVar3;
            j16 = j13;
            j17 = j15;
            j18 = j12;
            kVar3 = kVar2;
            j19 = j202;
            s10 = rVar.s();
            if (s10 != null) {
            }
        }
        nVar2 = nVar;
        i16 = 115043712 | i15;
        i17 = i14 & 512;
        if (i17 == 0) {
        }
        kVar2 = kVar;
        i18 = i14 & 1024;
        if (i18 != 0) {
        }
        int i2622 = c3 | 28080 | (rVar.f(h0Var) ? 1048576 : 524288);
        if ((306783379 & i16) != 306783378) {
        }
        rVar.U();
        if ((i13 & 1) != 0) {
        }
        if (i25 != 0) {
        }
        j13 = f1.q.f2283h;
        j14 = s2.n.f6401c;
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        i19 = 1;
        z11 = true;
        i20 = 1;
        i21 = Integer.MAX_VALUE;
        j15 = j14;
        rVar.r();
        rVar.X(-1827892941);
        if (j13 != 16) {
        }
        rVar.q(z12);
        y0.n nVar522 = nVar3;
        int i2722 = i19;
        boolean z1422 = z11;
        int i2822 = i21;
        int i2922 = i20;
        v6.a.b(str, nVar522, h2.h0.d(h0Var, b2, j14, j15, kVar2 != null ? kVar2.f6031a : Integer.MIN_VALUE, j12, 16609104), i2722, z1422, i2822, i2922, rVar, (i16 & 126) | 14380032);
        i22 = i2922;
        i23 = i2722;
        long j2022 = j14;
        z13 = z1422;
        i24 = i2822;
        nVar4 = nVar3;
        j16 = j13;
        j17 = j15;
        j18 = j12;
        kVar3 = kVar2;
        j19 = j2022;
        s10 = rVar.s();
        if (s10 != null) {
        }
    }
}
