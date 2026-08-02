package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ltr extends uif implements Function2 {
    public final /* synthetic */ yci r;
    public final /* synthetic */ dup s;
    public final /* synthetic */ long t;
    public final /* synthetic */ float u;
    public final /* synthetic */ float v;
    public final /* synthetic */ wn5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltr(yci yciVar, dup dupVar, long j, float f, float f2, wn5 wn5Var) {
        super(2);
        this.r = yciVar;
        this.s = dupVar;
        this.t = j;
        this.u = f;
        this.v = f2;
        this.w = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        yci f;
        hq5 hq5Var = (hq5) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        long c = qtr.c(this.t, this.u, hq5Var);
        oq5 oq5Var2 = (oq5) hq5Var;
        f = nfp.b(qtr.b(((jx7) oq5Var2.j(es5.h)).n0(this.v), c, this.r, this.s), false, dpo.A0).f(new SuspendPointerInputElement(Unit.a, null, null, new dur(new db(2, 16, null)), 6));
        kfh d = ug3.d(b2c.b, true);
        int i = oq5Var2.P;
        a l = oq5Var2.l();
        yci H = vnj.H(oq5Var2, f);
        xp5.T.getClass();
        grb grbVar = wp5.b;
        oq5Var2.d0();
        if (oq5Var2.O) {
            oq5Var2.k(grbVar);
        } else {
            oq5Var2.n0();
        }
        g0g.U(oq5Var2, d, wp5.f);
        g0g.U(oq5Var2, l, wp5.e);
        kb5 kb5Var = wp5.g;
        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var2, i, kb5Var);
        }
        g0g.U(oq5Var2, H, wp5.d);
        eta.l(0, this.w, oq5Var2, true);
        return Unit.a;
    }
}
