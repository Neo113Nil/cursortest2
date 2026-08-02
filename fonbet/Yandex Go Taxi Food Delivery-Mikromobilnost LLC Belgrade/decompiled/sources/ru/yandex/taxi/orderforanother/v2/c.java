package ru.yandex.taxi.orderforanother.v2;

import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.b3z0;
import defpackage.bts;
import defpackage.byi;
import defpackage.bzk0;
import defpackage.c3z;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.dbb1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fsk0;
import defpackage.hbb1;
import defpackage.hh31;
import defpackage.itz0;
import defpackage.jeb1;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lrv;
import defpackage.ly3;
import defpackage.mt71;
import defpackage.nhu0;
import defpackage.nq5;
import defpackage.nz41;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.oz41;
import defpackage.pi6;
import defpackage.pl90;
import defpackage.q791;
import defpackage.qab1;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.ql90;
import defpackage.qz41;
import defpackage.r1b0;
import defpackage.scx0;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tz41;
import defpackage.unr0;
import defpackage.v0b1;
import defpackage.v441;
import defpackage.w511;
import defpackage.w791;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wp01;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.ymb1;
import defpackage.yqb1;
import defpackage.yrl;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zx40;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public abstract class c {
    public static final void a(pl90 pl90Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1421445017);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(pl90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = bzk0.c(f530Var, AppColor$Palette.Background, cyk0.a);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            o4b1.b(mt71.m(pl90Var.a, 0, btsVar), null, null, null, null, 0.0f, null, btsVar, 56, HProv.PP_SAME_MEDIA);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(pl90Var, f530Var, i, 22);
        }
    }

    public static final void b(byi byiVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(253812513);
        int i2 = (btsVar2.k(byiVar) ? 4 : 2) | i | 48;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            btsVar = btsVar2;
            jeb1.f(byiVar.a, an91.o(an91.m(c530Var, 24.0f, 0.0f, 2), 0.0f, 18.0f, 0.0f, 0.0f, 13), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar, 384, 0, 32760);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v441(i, 1, f530Var2, byiVar);
        }
    }

    public static final void c(f530 f530Var, w791 w791Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        Object obj;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-394785440);
        int i2 = i | 6 | (btsVar2.k(w791Var) ? 32 : 16) | (btsVar2.e(tlsVar) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = w791Var instanceof ql90;
            if (z) {
                obj = tz41.a;
            } else {
                if (!(w791Var instanceof pl90)) {
                    w511.b();
                    return;
                }
                obj = qz41.a;
            }
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar2);
            }
            zx40 zx40Var = (zx40) Q;
            c530 c530Var = c530.a;
            f530 s = ljs0.s(c530Var, 88.0f, 0.0f, 2);
            awk0 awk0Var = new awk0(0);
            boolean e = ((i2 & 896) == 256) | btsVar2.e(obj);
            Object Q2 = btsVar2.Q();
            if (e || Q2 == o430Var) {
                Q2 = new hh31(15, tlsVar, obj);
                btsVar2.o0(Q2);
            }
            f530 b = q791.b(s, zx40Var, null, false, null, awk0Var, (sls) Q2, 12);
            sic a = qic.a(lr20.c, x4c.H, btsVar2, 48);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            f530 a2 = lrv.a(ymb1.l(an91.k(hbb1.c(ljs0.m(c530Var, 66.0f), dbb1.a(btsVar2), false, 0.0f, null, 14), 2.0f), cyk0.a), zx40Var, fsk0.a(7, false));
            if (z) {
                btsVar2.e0(1922746283);
                f((ql90) w791Var, a2, btsVar2, (i2 >> 3) & 14);
                btsVar2.t(false);
            } else {
                if (!(w791Var instanceof pl90)) {
                    throw unr0.y(1586042630, btsVar2, false);
                }
                btsVar2.e0(1922920131);
                a((pl90) w791Var, a2, btsVar2, (i2 >> 3) & 14);
                btsVar2.t(false);
            }
            f530Var2 = c530Var;
            jeb1.f(w791Var.b(), an91.o(c530Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), AppColor$Palette.TextMinor, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar2).h.a, btsVar2, 432, 0, 16248);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new oz41(f530Var2, w791Var, tlsVar, i, 0);
        }
    }

    public static final void d(itz0 itz0Var, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1100055779);
        int i2 = i | (btsVar.k(itz0Var) ? 4 : 2) | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            yqb1.e(itz0Var.a, ljs0.u(bzk0.c(ljs0.e(ljs0.c(c530Var, 1.0f), 56.0f), AppColor$Palette.BgMinor, qke.q), x4c.E, 2), null, null, 0, 0, null, null, null, 0, 0, btsVar, 0, 2044);
            yrl.b(0, 7, btsVar, null);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v441(i, 2, f530Var2, itz0Var);
        }
    }

    public static final void e(nz41 nz41Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1908025127);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(nz41Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            sls slsVar = (sls) btsVar.m(c3z.a);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            int i4 = i3 & 896;
            boolean k = (i4 == 256) | btsVar.k(slsVar);
            Object Q2 = btsVar.Q();
            if (k || Q2 == obj) {
                Q2 = new wp01(9, oz40Var, tlsVar, slsVar);
                btsVar.o0(Q2);
            }
            int i5 = i3;
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, (sls) Q2, null, btsVar, 0, 0, 6143);
            boolean z = i4 == 256;
            Object Q3 = btsVar.Q();
            if (z || Q3 == obj) {
                Q3 = new WhoRidePaneV2Kt$WhoRidePaneV2$2$1(tlsVar, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, zy11.a);
            boolean k2 = btsVar.k(a);
            Object Q4 = btsVar.Q();
            if (k2 || Q4 == obj) {
                Q4 = new WhoRidePaneV2Kt$WhoRidePaneV2$3$1(a, oz40Var, null);
                btsVar.o0(Q4);
            }
            zpn.e(btsVar, (wls) Q4, a);
            boolean k3 = btsVar.k(slsVar);
            Object Q5 = btsVar.Q();
            if (k3 || Q5 == obj) {
                Q5 = new nq5(3, slsVar, oz40Var);
                btsVar.o0(Q5);
            }
            f530Var2 = c530.a;
            com.yandex.go.design.compose.modal.bottomsheet.c.a(f530Var2, a, qab1.c(a, null, (sls) Q5, btsVar, 0, 2), false, false, null, null, null, null, null, null, wwg.S(2016939655, true, new nhu0(7, nz41Var, tlsVar), btsVar), btsVar, (i5 >> 3) & 14, 48, 2040);
            btsVar = btsVar;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(nz41Var, f530Var2, tlsVar, i, 18);
        }
    }

    public static final void f(ql90 ql90Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1605589401);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ql90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            v0b1.a(ql90Var.a, f530Var, null, null, wwg.S(-838437065, true, new v441(3, ql90Var, f530Var), btsVar), null, null, null, 0.0f, 0, btsVar, (i2 & 112) | HProv.ALG_CLASS_DATA_ENCRYPT, 1004);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(ql90Var, f530Var, i, 21);
        }
    }
}
