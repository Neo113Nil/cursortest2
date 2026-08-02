package defpackage;

import android.app.Activity;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class qz5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tz5 b;
    public final /* synthetic */ yci c;

    public /* synthetic */ qz5(tz5 tz5Var, yci yciVar) {
        this.a = 1;
        this.b = tz5Var;
        this.c = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(49);
                nt0.j(this.b, this.c, (hq5) obj, R);
                break;
            case 1:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                oq5Var2.Z(-2130726254);
                tz5 tz5Var = this.b;
                nmj nmjVar = (nmj) tz5Var.k.getValue();
                Activity activity = tz5Var.a.b;
                boolean h = oq5Var2.h(tz5Var);
                Object K = oq5Var2.K();
                Object obj3 = gq5.a;
                if (h || K == obj3) {
                    K = new ti1(4, tz5Var);
                    oq5Var2.k0(K);
                }
                jmj b = nmjVar.b((dmj) K, activity, tz5Var.i, 1, oq5Var2, 36352);
                oq5Var2.p(false);
                ivf.g(b, d.x(bfg.Q(d.c(a.l(this.c, ghh.C(zs4.g(hq5Var), ogp.A(hq5Var))), 1.0f), bfg.C(hq5Var), false, 14), b2c.f, 2), true, null, hq5Var, 384, 8);
                boolean h2 = oq5Var2.h(tz5Var);
                Object K2 = oq5Var2.K();
                if (h2 || K2 == obj3) {
                    Object e65Var = new e65(0, tz5Var, tz5.class, "onBackClick", "onBackClick()V", 0, 18);
                    oq5Var2.k0(e65Var);
                    K2 = e65Var;
                }
                t7g.h(gut.p1(vci.a), (Function0) ((h9f) K2), null, null, oq5Var2, 0, 12);
            case 2:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                tt0.e(this.b, this.c, (hq5) obj, R2);
                break;
            default:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(1);
                vq1.e(this.b, this.c, (hq5) obj, R3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qz5(tz5 tz5Var, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = tz5Var;
        this.c = yciVar;
    }
}
