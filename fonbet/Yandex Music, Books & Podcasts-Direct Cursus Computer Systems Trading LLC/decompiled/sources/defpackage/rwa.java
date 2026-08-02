package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class rwa {
    public static final float f;
    public static final float g;
    public static final float i;
    public static final float j;
    public static final float a = 123;
    public static final float b = 14;
    public static final float c = 64;
    public static final float d = 188;
    public static final float e = 24;
    public static final float h = 8;

    static {
        float f2 = 20;
        f = f2;
        g = f2;
        float f3 = 12;
        i = f3;
        j = f3;
    }

    public static final void a(iwa iwaVar, e2o e2oVar, Function2 function2, Function1 function1, yci yciVar, hq5 hq5Var, int i2) {
        e2oVar.getClass();
        function2.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1774109938);
        int i3 = i2 | (oq5Var.f(iwaVar) ? 4 : 2) | (oq5Var.f(e2oVar) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128) | (oq5Var.h(function1) ? 2048 : 1024);
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = k5r.h(-1, oq5Var);
            }
            u6k u6kVar = (u6k) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = k5r.h(-1, oq5Var);
            }
            u6k u6kVar2 = (u6k) K2;
            cma cmaVar = new cma(irv.e(oq5Var));
            cma cmaVar2 = new cma(b);
            if (cmaVar.compareTo(cmaVar2) < 0) {
                cmaVar = cmaVar2;
            }
            two C = bfg.C(oq5Var);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object K3 = oq5Var.K();
            if (z || K3 == kjnVar) {
                K3 = new xva(e2oVar, weo.Q(0.0f, 0.0f, null, 7));
                oq5Var.k0(K3);
            }
            yci d2 = d.d(yciVar, 1.0f);
            float f2 = a;
            float f3 = cmaVar.a;
            yci o = a.o(bfg.Q(androidx.compose.ui.input.nestedscroll.a.a(xp3.u(a.q(d2, 0.0f, f2, 0.0f, f3, 5), ugo.a(hva.a)), (xva) K3, null), C, e2oVar.a(), 12), g, 0.0f, 2);
            boolean c2 = ((i3 & 14) == 4) | (i4 == 32) | oq5Var.c(f3) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object K4 = oq5Var.K();
            if (c2 || K4 == kjnVar) {
                mz4 mz4Var = new mz4(iwaVar, e2oVar, f3, function2, function1, u6kVar, u6kVar2);
                oq5Var.k0(mz4Var);
                K4 = mz4Var;
            }
            u2x.p(o, (Function2) K4, oq5Var, 0, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(iwaVar, e2oVar, function2, function1, yciVar, i2, 16);
        }
    }
}
