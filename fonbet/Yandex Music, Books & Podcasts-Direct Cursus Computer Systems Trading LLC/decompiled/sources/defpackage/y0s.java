package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.selection.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y0s extends uif implements Function2 {
    public final /* synthetic */ yci r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ cje t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ wn5 w;
    public final /* synthetic */ wn5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0s(yci yciVar, boolean z, geo geoVar, boolean z2, Function0 function0, wn5 wn5Var, wn5 wn5Var2) {
        super(2);
        this.r = yciVar;
        this.s = z;
        this.t = geoVar;
        this.u = z2;
        this.v = function0;
        this.w = wn5Var;
        this.x = wn5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Number) obj2).intValue();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
            yci d = d.d(a.o(b.a(d.e(this.r, f1s.a), this.s, null, this.t, this.u, new meo(4), this.v), f1s.b, 0.0f, 2), 1.0f);
            nho a = lho.a(qx0.e, b2c.l, oq5Var, 54);
            int i = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                ouj.x(i, oq5Var, i, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            this.w.invoke(oq5Var, 0);
            u1g.l(oq5Var, d.l(f1s.f));
            xcs.a(ges.b(((udt) oq5Var.j(wdt.b)).k, 0L, 0L, null, null, 0L, 3, 0L, null, null, 0, 0, 16744447), this.x, oq5Var, 0);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
