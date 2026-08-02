package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mtr extends uif implements Function2 {
    public final /* synthetic */ yci r;
    public final /* synthetic */ dup s;
    public final /* synthetic */ long t;
    public final /* synthetic */ float u;
    public final /* synthetic */ dd3 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ Function2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtr(yci yciVar, dup dupVar, long j, float f, dd3 dd3Var, float f2, Function2 function2) {
        super(2);
        this.r = yciVar;
        this.s = dupVar;
        this.t = j;
        this.u = f;
        this.v = dd3Var;
        this.w = f2;
        this.x = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        yci f;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Number) obj2).intValue();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
            f = nfp.b(q5g.t(this.r, this.s, q5g.u(this.t, (wl7) oq5Var.j(t2b.a), this.u, oq5Var), this.v, this.w), false, dpo.z0).f(new SuspendPointerInputElement(Unit.a, null, null, new dur(new db(2, 15, null)), 6));
            kfh d = ug3.d(b2c.b, true);
            int i = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, f);
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
            this.x.invoke(oq5Var, 0);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
