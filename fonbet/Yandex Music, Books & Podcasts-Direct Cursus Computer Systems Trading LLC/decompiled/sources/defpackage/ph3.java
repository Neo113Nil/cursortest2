package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ph3 extends xci implements ih3, qof {
    public dc6 o;
    public boolean p;

    public static final ynn S0(ph3 ph3Var, f8j f8jVar, ha0 ha0Var) {
        ynn ynnVar;
        if (ph3Var.n && ph3Var.p) {
            f8j E = bcx.E(ph3Var);
            if (!f8jVar.b1().n) {
                f8jVar = null;
            }
            if (f8jVar != null && (ynnVar = (ynn) ha0Var.invoke()) != null) {
                return ynnVar.l(E.y(f8jVar, false).f());
            }
        }
        return null;
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.qof
    public final void R(wof wofVar) {
        this.p = true;
    }

    @Override // defpackage.ih3
    public final Object z(f8j f8jVar, ha0 ha0Var, cg6 cg6Var) {
        Object Q = gld.Q(new oh3(this, f8jVar, ha0Var, new t03(2, this, f8jVar, ha0Var), (Continuation) null, 0), cg6Var);
        return Q == nm6.a ? Q : Unit.a;
    }
}
