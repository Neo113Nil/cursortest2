package defpackage;

import ru.yandex.taxi.communications.stories.domain.a;

/* loaded from: classes14.dex */
public final class rmw implements pzr0, rxr0 {
    public final y50 a;
    public final yvf0 b;
    public final zuj0 c;
    public final oep0 d;
    public final gau e;

    public rmw(y50 y50Var, yvf0 yvf0Var, zuj0 zuj0Var, oep0 oep0Var, gau gauVar) {
        this.a = y50Var;
        this.b = yvf0Var;
        this.c = zuj0Var;
        this.d = oep0Var;
        this.e = gauVar;
    }

    @Override // defpackage.pzr0, defpackage.rxr0
    public final g18 b(qxr0 qxr0Var) {
        boolean z = qxr0Var instanceof mwr0;
        dai daiVar = g18.u1;
        if (z) {
            ((a60) this.a).c(((mwr0) qxr0Var).a, v770.j);
            return daiVar;
        }
        if (!(qxr0Var instanceof gxr0)) {
            if (!(qxr0Var instanceof nxr0)) {
                super.b(qxr0Var);
                return daiVar;
            }
            this.e.invoke(((nxr0) qxr0Var).a);
            return daiVar;
        }
        gxr0 gxr0Var = (gxr0) qxr0Var;
        String str = gxr0Var.a;
        sls slsVar = gxr0Var.b;
        ((pep0) this.d).f(new uva(6, (a) this.b.get(), slsVar), new npu0((x3) new mpu0(str), "intercity", Float.valueOf(((avj0) this.c).b(psg0.shortcuts_corners_round)), false, 120), hxx.a);
        return daiVar;
    }

    @Override // defpackage.pzr0
    public final y700 d() {
        return null;
    }
}
