package com.yandex.passport.common.ui.compose.theme;

import com.yandex.passport.api.exception.l;
import defpackage.agr;
import defpackage.etn;
import defpackage.hq5;
import defpackage.hvp;
import defpackage.i95;
import defpackage.ild;
import defpackage.j95;
import defpackage.lsj;
import defpackage.oq5;
import defpackage.qzm;
import defpackage.u0v;
import defpackage.ugo;
import defpackage.wn5;
import defpackage.xmn;
import defpackage.xv7;

/* loaded from: classes4.dex */
public abstract class d {
    public static final i95 a;
    public static final i95 b;
    public static final hvp c;
    public static final agr d;
    public static final agr e;

    static {
        long j = a.a;
        long j2 = a.b;
        long j3 = a.c;
        long j4 = a.d;
        long j5 = a.e;
        long j6 = a.f;
        long j7 = a.g;
        long j8 = a.h;
        long j9 = a.i;
        long j10 = a.j;
        long j11 = a.k;
        long j12 = a.l;
        long j13 = a.m;
        long j14 = a.n;
        long j15 = a.o;
        long j16 = a.p;
        long j17 = a.q;
        long j18 = a.r;
        long j19 = a.s;
        long j20 = a.t;
        long j21 = a.u;
        long j22 = a.v;
        long j23 = a.w;
        long j24 = a.x;
        long j25 = a.y;
        long j26 = a.z;
        long j27 = a.A;
        long j28 = a.B;
        long j29 = a.C;
        a = j95.c(j, j2, j3, j4, j28, j5, j6, j7, j8, j9, j10, j11, j12, j17, j18, j19, j20, j21, j22, j26, j27, j13, j14, j15, j16, j23, j24, j25, a.D, a.G, a.H, a.I, a.F, a.E, j29, 524288, 0);
        long j30 = a.J;
        long j31 = a.K;
        long j32 = a.L;
        long j33 = a.M;
        long j34 = a.N;
        long j35 = a.O;
        long j36 = a.P;
        long j37 = a.Q;
        long j38 = a.R;
        long j39 = a.S;
        long j40 = a.T;
        long j41 = a.U;
        long j42 = a.V;
        long j43 = a.W;
        long j44 = a.X;
        long j45 = a.Y;
        long j46 = a.Z;
        long j47 = a.a0;
        long j48 = a.b0;
        long j49 = a.c0;
        long j50 = a.d0;
        long j51 = a.e0;
        long j52 = a.f0;
        long j53 = a.g0;
        long j54 = a.h0;
        long j55 = a.i0;
        long j56 = a.j0;
        long j57 = a.k0;
        long j58 = a.l0;
        b = new i95(j30, j31, j32, j33, j57, j34, j35, j36, j37, j38, j39, j40, j41, j46, j47, j48, j49, j50, j51, j30, j55, j56, j42, j43, j44, j45, j52, j53, j54, a.m0, j58, a.p0, a.q0, a.r0, a.o0, a.n0);
        c = new hvp(ugo.a(4), ugo.a(8), ugo.a(20), ugo.a(24), ugo.a(32));
        d = new agr(new l(7));
        e = new agr(new l(8));
    }

    public static final void a(boolean z, boolean z2, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1853475067);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && oq5Var.g(z)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (oq5Var.g(z2) ? 32 : 16);
        }
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                if ((i2 & 1) != 0) {
                    z = xv7.B(oq5Var);
                }
                if (i5 != 0) {
                    z2 = false;
                }
            } else {
                oq5Var.S();
            }
            oq5Var.q();
            etn.m(new qzm[]{d.a(new b(z)), e.a(new e(z2))}, ild.C(-973313467, new u0v(23, !z ? a : b, wn5Var), oq5Var), oq5Var, 56);
        }
        boolean z3 = z;
        boolean z4 = z2;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lsj(z3, z4, wn5Var, i, i2, 2);
        }
    }
}
