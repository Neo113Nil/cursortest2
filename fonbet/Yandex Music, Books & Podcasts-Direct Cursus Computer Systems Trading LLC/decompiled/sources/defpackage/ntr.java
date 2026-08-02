package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.material3.MinimumInteractiveModifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ntr extends uif implements Function2 {
    public final /* synthetic */ yci r;
    public final /* synthetic */ dup s;
    public final /* synthetic */ long t;
    public final /* synthetic */ float u;
    public final /* synthetic */ uoi v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Function0 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ wn5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntr(yci yciVar, dup dupVar, long j, float f, uoi uoiVar, boolean z, Function0 function0, float f2, wn5 wn5Var) {
        super(2);
        this.r = yciVar;
        this.s = dupVar;
        this.t = j;
        this.u = f;
        this.v = uoiVar;
        this.w = z;
        this.x = function0;
        this.y = f2;
        this.z = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        agr agrVar = xre.a;
        yci f = this.r.f(MinimumInteractiveModifier.a);
        long c = qtr.c(this.t, this.u, hq5Var);
        oq5 oq5Var2 = (oq5) hq5Var;
        yci d = a.d(qtr.b(((jx7) oq5Var2.j(es5.h)).n0(this.y), c, f, this.s), this.v, deo.a(0.0f, oq5Var2, 0, 7), this.w, null, null, this.x, 24);
        kfh d2 = ug3.d(b2c.b, true);
        int i = oq5Var2.P;
        androidx.compose.runtime.internal.a l = oq5Var2.l();
        yci H = vnj.H(oq5Var2, d);
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
        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var2, i, kb5Var);
        }
        g0g.U(oq5Var2, H, wp5.d);
        eta.l(0, this.z, oq5Var2, true);
        return Unit.a;
    }
}
