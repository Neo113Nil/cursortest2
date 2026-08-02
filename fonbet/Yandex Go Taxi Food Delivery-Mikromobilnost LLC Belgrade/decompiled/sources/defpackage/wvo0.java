package defpackage;

/* loaded from: classes6.dex */
public final class wvo0 implements pzr0, rxr0 {
    public final y50 a;
    public final tls b;
    public final sls c;
    public final sls d;
    public final sls e;
    public final sls f;
    public final sls g;
    public final sls h;
    public final sls i;
    public final wls j;

    public wvo0(y50 y50Var, tls tlsVar, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, sls slsVar5, sls slsVar6, sls slsVar7, wls wlsVar) {
        this.a = y50Var;
        this.b = tlsVar;
        this.c = slsVar;
        this.d = slsVar2;
        this.e = slsVar3;
        this.f = slsVar4;
        this.g = slsVar5;
        this.h = slsVar6;
        this.i = slsVar7;
        this.j = wlsVar;
    }

    @Override // defpackage.pzr0, defpackage.rxr0
    public final g18 b(qxr0 qxr0Var) {
        boolean z = qxr0Var instanceof mwr0;
        dai daiVar = g18.u1;
        if (z) {
            ((a60) this.a).c(((mwr0) qxr0Var).a, v770.j);
            return daiVar;
        }
        if (qxr0Var instanceof gxr0) {
            this.b.invoke(((gxr0) qxr0Var).a);
            return daiVar;
        }
        if (qxr0Var instanceof dxr0) {
            this.d.invoke();
            return daiVar;
        }
        if (qxr0Var instanceof ixr0) {
            if (jl40.l(((ixr0) qxr0Var).a, "scooters")) {
                this.c.invoke();
            }
            return daiVar;
        }
        if (qxr0Var instanceof cxr0) {
            this.e.invoke();
            return daiVar;
        }
        if (qxr0Var instanceof bxr0) {
            this.f.invoke();
            return daiVar;
        }
        if (qxr0Var instanceof exr0) {
            this.g.invoke();
            return daiVar;
        }
        if (qxr0Var instanceof zwr0) {
            this.h.invoke();
            return daiVar;
        }
        if (qxr0Var instanceof axr0) {
            this.i.invoke();
            return daiVar;
        }
        if (!(qxr0Var instanceof kwr0)) {
            if (!(qxr0Var instanceof kxr0)) {
                super.b(qxr0Var);
            }
            return daiVar;
        }
        kwr0 kwr0Var = (kwr0) qxr0Var;
        this.j.invoke(kwr0Var.a, kwr0Var.b);
        return daiVar;
    }

    @Override // defpackage.pzr0
    public final y700 d() {
        return null;
    }
}
