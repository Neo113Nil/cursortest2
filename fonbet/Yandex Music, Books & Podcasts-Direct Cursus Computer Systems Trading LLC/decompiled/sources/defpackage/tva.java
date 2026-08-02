package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class tva {
    public static final float a = 374;
    public static final float b = 250;
    public static final float c = (float) 718.08d;
    public static final float d = 480;
    public static final float e = 64;
    public static final float f = 123;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, boolean z, e2o e2oVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        xmn r;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1287893636);
        int i2 = (oq5Var2.f(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= oq5Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(e2oVar) ? 256 : 128;
        }
        int i3 = i2 | (oq5Var2.f(yciVar) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
        } else {
            boolean booleanValue = ((Boolean) oq5Var2.j(koe.a)).booleanValue();
            kjn kjnVar = gq5.a;
            float f2 = b;
            float f3 = a;
            if (!booleanValue) {
                oq5Var2.Z(-695274953);
                yci o = d.o(yciVar, f3, f2);
                boolean z2 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
                Object K = oq5Var2.K();
                if (z2 || K == kjnVar) {
                    K = new sva(z, e2oVar, 1);
                    oq5Var2.k0(K);
                }
                w1g.j(str, null, a.a(o, (Function1) K), null, null, null, hd6.a, 0.0f, null, 0, lxe.b, oq5Var2, (i3 & 14) | 1572912, 952);
                oq5Var = oq5Var2;
                oq5Var.p(false);
                r = oq5Var.r();
                if (r == null) {
                    r.d = new pp(str, z, e2oVar, yciVar, i, 8);
                    return;
                }
                return;
            }
            oq5Var2.Z(-696238991);
            yci o2 = d.o(yciVar, f3, f2);
            boolean z3 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object K2 = oq5Var2.K();
            if (z3 || K2 == kjnVar) {
                K2 = new sva(z, e2oVar, 0);
                oq5Var2.k0(K2);
            }
            yci a2 = a.a(o2, (Function1) K2);
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            ug3.a(b.a.a(androidx.compose.foundation.a.b(xp3.u(d.m(vci.a, 160), ugo.a), d85.g, vnj.i), b2c.f), oq5Var2, 0);
            oq5Var2.p(true);
            oq5Var2.p(false);
        }
        oq5Var = oq5Var2;
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
