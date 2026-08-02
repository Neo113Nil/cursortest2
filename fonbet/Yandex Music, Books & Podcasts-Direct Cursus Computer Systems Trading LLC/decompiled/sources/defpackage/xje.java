package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xje {
    public final eqi a = new eqi(new wje[16]);
    public final x6k b = szf.g0(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final x6k d = szf.g0(Boolean.TRUE);

    public final void a(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-318043801);
        int i2 = (oq5Var.h(this) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Object K = oq5Var.K();
            Continuation continuation = null;
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(null);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                oq5Var.Z(1719883733);
                boolean h = oq5Var.h(this);
                Object K2 = oq5Var.K();
                if (h || K2 == kjnVar) {
                    K2 = new d57(aqiVar, this, continuation, 28);
                    oq5Var.k0(K2);
                }
                gld.w(oq5Var, this, (Function2) K2);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1721270456);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new y5(this, i, 14);
        }
    }
}
