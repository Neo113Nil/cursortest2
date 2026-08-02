package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class vib1 {
    public static final void a(ola olaVar, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1973118046);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(olaVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            oeb1.c(btsVar, ljs0.e(c530Var, 24.0f));
            d(olaVar.c, btsVar, 0);
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
            c(olaVar.h, tlsVar, btsVar, i3 & 112);
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
            w691.b(olaVar.f, btsVar, 0);
            oeb1.c(btsVar, ljs0.e(c530Var, 24.0f));
            nla nlaVar = olaVar.g;
            tib1.e(nlaVar.a, nlaVar.b, null, btsVar, 0);
            ly3.B(c530Var, 24.0f, btsVar, true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(olaVar, tlsVar, f530Var2, i, 9);
        }
    }

    public static final void b(ibp0 ibp0Var, k510 k510Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1716523768);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(k510Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean l = jl40.l(k510Var, i510.a);
            c530 c530Var = c530.a;
            if (l) {
                btsVar.e0(311903875);
                nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
            } else {
                if (!(k510Var instanceof j510)) {
                    throw unr0.y(311902622, btsVar, false);
                }
                btsVar.e0(311906307);
                nvi0 nvi0Var = ((j510) k510Var).a;
                ctq ctqVar = new ctq(24, ibp0Var);
                ywy ywyVar = (ywy) ffb1.f(nvi0Var, btsVar, 0).getValue();
                if (jl40.l(ywyVar, wwy.a)) {
                    btsVar.e0(-576192361);
                    nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
                } else if (ywyVar instanceof xwy) {
                    btsVar.e0(-576123541);
                    ctqVar.invoke(((xwy) ywyVar).a, btsVar, 0);
                    btsVar.t(false);
                } else {
                    if (!jl40.l(ywyVar, vwy.a)) {
                        throw unr0.y(1505431128, btsVar, false);
                    }
                    btsVar.e0(-576049575);
                    nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
                }
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(ibp0Var, k510Var, i, 11);
        }
    }

    public static final void c(List list, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(989008846);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 m = an91.m(ljs0.c(c530.a, 1.0f), 16.0f, 0.0f, 2);
            int i4 = 6;
            sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            btsVar.e0(-2075890169);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                nga ngaVar = (nga) it.next();
                boolean k = ((i2 & 112) == 32) | btsVar.k(ngaVar);
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    Q = new n8a(i4, tlsVar, ngaVar);
                    btsVar.o0(Q);
                }
                uib1.a(ngaVar, (sls) Q, null, btsVar, 0);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i7a(list, tlsVar, i, i3);
        }
    }

    public static final void d(CharSequence charSequence, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1471336323);
        int i2 = i | (btsVar2.k(charSequence) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            qgy.b(charSequence, null, an91.m(c530.a, 16.0f, 0.0f, 2), AppColor$Palette.Text, 0L, 0L, new sjy0(3), 0L, 2, 2, 0, xya1.b(btsVar2).e, null, btsVar, (i2 & 14) | 805309824, 6, 10610);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 5, charSequence);
        }
    }
}
