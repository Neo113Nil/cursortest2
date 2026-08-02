package defpackage;

import androidx.compose.runtime.internal.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class ug3 {
    public static final tpi a = c(true);
    public static final tpi b = c(false);
    public static final wg3 c = new wg3(b2c.b, false);
    public static final r30 d = r30.g;

    public static final void a(yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-211209833);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            int i3 = oq5Var.P;
            yci H = vnj.H(oq5Var, yciVar);
            a l = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            g0g.U(oq5Var, H, wp5.d);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tg3(yciVar, i, 0);
        }
    }

    public static final void b(jsk jskVar, ksk kskVar, ffh ffhVar, xof xofVar, int i, int i2, g40 g40Var) {
        g40 g40Var2;
        Object n = ffhVar.n();
        qg3 qg3Var = n instanceof qg3 ? (qg3) n : null;
        jsk.f(jskVar, kskVar, ((qg3Var == null || (g40Var2 = qg3Var.o) == null) ? g40Var : g40Var2).a((kskVar.a << 32) | (kskVar.b & 4294967295L), (i << 32) | (i2 & 4294967295L), xofVar));
    }

    public static final tpi c(boolean z) {
        tpi tpiVar = new tpi(9);
        iz2 iz2Var = b2c.b;
        tpiVar.m(iz2Var, new wg3(iz2Var, z));
        iz2 iz2Var2 = b2c.c;
        tpiVar.m(iz2Var2, new wg3(iz2Var2, z));
        iz2 iz2Var3 = b2c.d;
        tpiVar.m(iz2Var3, new wg3(iz2Var3, z));
        iz2 iz2Var4 = b2c.e;
        tpiVar.m(iz2Var4, new wg3(iz2Var4, z));
        iz2 iz2Var5 = b2c.f;
        tpiVar.m(iz2Var5, new wg3(iz2Var5, z));
        iz2 iz2Var6 = b2c.g;
        tpiVar.m(iz2Var6, new wg3(iz2Var6, z));
        iz2 iz2Var7 = b2c.h;
        tpiVar.m(iz2Var7, new wg3(iz2Var7, z));
        iz2 iz2Var8 = b2c.i;
        tpiVar.m(iz2Var8, new wg3(iz2Var8, z));
        iz2 iz2Var9 = b2c.j;
        tpiVar.m(iz2Var9, new wg3(iz2Var9, z));
        return tpiVar;
    }

    public static final kfh d(g40 g40Var, boolean z) {
        kfh kfhVar = (kfh) (z ? a : b).g(g40Var);
        return kfhVar == null ? new wg3(g40Var, z) : kfhVar;
    }

    public static final wg3 e(g40 g40Var, boolean z, hq5 hq5Var, int i) {
        if (Intrinsics.d(g40Var, b2c.b) && !z) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(-1709785313);
            oq5Var.p(false);
            return c;
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.Z(-1709737635);
        boolean z2 = true;
        boolean z3 = (((i & 14) ^ 6) > 4 && oq5Var2.f(g40Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !oq5Var2.g(z)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object K = oq5Var2.K();
        if (z4 || K == gq5.a) {
            K = new wg3(g40Var, z);
            oq5Var2.k0(K);
        }
        wg3 wg3Var = (wg3) K;
        oq5Var2.p(false);
        return wg3Var;
    }
}
