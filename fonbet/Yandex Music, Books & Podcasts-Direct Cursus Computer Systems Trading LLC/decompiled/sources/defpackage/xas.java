package defpackage;

import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xas extends uif implements pyc {
    public final /* synthetic */ float r;
    public final /* synthetic */ hs7 s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Function2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xas(float f, hs7 hs7Var, boolean z, Function2 function2) {
        super(3);
        this.r = f;
        this.s = hs7Var;
        this.t = z;
        this.u = function2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yci yciVar = (yci) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(yciVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            yci z = xv.z(yciVar, this.r);
            kfh d = ug3.d(b2c.b, false);
            int i = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, z);
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
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                ouj.x(i, oq5Var, i, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(264799724);
            hs7 hs7Var = this.s;
            aqi o0 = szf.o0(new d85(this.t ? hs7Var.t : hs7Var.u), oq5Var);
            oq5Var.p(false);
            cbs.b(((d85) o0.getValue()).a, ((udt) oq5Var.j(wdt.b)).g, this.u, oq5Var, 0, 4);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
