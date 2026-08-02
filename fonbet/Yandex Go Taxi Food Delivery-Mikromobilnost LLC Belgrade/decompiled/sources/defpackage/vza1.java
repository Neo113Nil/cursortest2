package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes5.dex */
public abstract class vza1 {
    public static au2 a;

    public static final void a(vdu vduVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        String str;
        c530 c530Var;
        float f;
        boolean z;
        String str2 = vduVar.b;
        String str3 = vduVar.a;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2120298770);
        int i2 = i | (btsVar2.k(vduVar) ? 4 : 2) | 48;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var2 = c530.a;
            f530 o = an91.o(c530Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d = b.d(btsVar2, o);
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
            qje.W(btsVar2, d.f, a2);
            qje.W(btsVar2, d.e, o2);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            if (str3.length() > 0) {
                btsVar2.e0(1669991646);
                str = str2;
                c530Var = c530Var2;
                f = 16.0f;
                z = false;
                jeb1.f(str3, an91.m(ljs0.c(c530Var2, 1.0f), 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.b(btsVar2).d, btsVar2, 48, 0, 16380);
                btsVar = btsVar2;
                btsVar.t(false);
            } else {
                str = str2;
                btsVar = btsVar2;
                c530Var = c530Var2;
                f = 16.0f;
                z = false;
                btsVar.e0(1670182110);
                btsVar.t(false);
            }
            if (str.length() > 0) {
                tse0.s(btsVar, 1670237972, c530Var, 4.0f, btsVar);
                bts btsVar3 = btsVar;
                jeb1.f(str, an91.m(ljs0.c(c530Var, 1.0f), f, 0.0f, 2), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar3, 432, 0, 16376);
                btsVar = btsVar3;
                btsVar.t(z);
            } else {
                btsVar.e0(1670524350);
                btsVar.t(z);
            }
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(vduVar, f530Var2, i, 20);
        }
    }

    public static final void b(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(367510656);
        int i2 = (btsVar.k(str) ? 4 : 2) | i;
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            kbd.a.getClass();
            ydb1.a(null, kbd.c, wwg.S(-1963708911, true, new jk30(str, 18), btsVar), null, null, null, null, false, btsVar, 432, 249);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qpm0(str, i, i3);
        }
    }

    public static final au2 c() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("ArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.k(7.8f, 11.0f);
        uq90Var.i(5.6f, -5.6f);
        uq90Var.h(12.0f, 4.0f);
        uq90Var.i(-8.0f, 8.0f);
        uq90Var.i(8.0f, 8.0f);
        uq90Var.i(1.4f, -1.4f);
        uq90Var.h(7.8f, 13.0f);
        uq90Var.f(20.0f);
        uq90Var.p(-2.0f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }
}
