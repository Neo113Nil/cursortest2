package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.material.MinimumInteractiveModifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class otr extends uif implements Function2 {
    public final /* synthetic */ wn5 A;
    public final /* synthetic */ yci r;
    public final /* synthetic */ dup s;
    public final /* synthetic */ long t;
    public final /* synthetic */ float u;
    public final /* synthetic */ dd3 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ uoi x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Function0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otr(yci yciVar, dup dupVar, long j, float f, dd3 dd3Var, float f2, uoi uoiVar, boolean z, Function0 function0, wn5 wn5Var) {
        super(2);
        this.r = yciVar;
        this.s = dupVar;
        this.t = j;
        this.u = f;
        this.v = dd3Var;
        this.w = f2;
        this.x = uoiVar;
        this.y = z;
        this.z = function0;
        this.A = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Number) obj2).intValue();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
            agr agrVar = yre.a;
            yci d = a.d(q5g.t(this.r.f(MinimumInteractiveModifier.a), this.s, q5g.u(this.t, (wl7) oq5Var.j(t2b.a), this.u, oq5Var), this.v, this.w), this.x, eeo.a(0.0f, 7, 0L, false), this.y, null, null, this.z, 24);
            kfh d2 = ug3.d(b2c.b, true);
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
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                ouj.x(i, oq5Var, i, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l(0, this.A, oq5Var, true);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
