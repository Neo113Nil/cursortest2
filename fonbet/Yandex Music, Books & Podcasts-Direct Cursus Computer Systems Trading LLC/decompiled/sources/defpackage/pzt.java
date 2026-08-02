package defpackage;

/* loaded from: classes.dex */
public final class pzt extends w4k {
    public final x6k e = szf.g0(new nmq(0));
    public final x6k f = szf.g0(Boolean.FALSE);
    public final yyt g;
    public final u6k h;
    public float i;
    public m85 j;
    public int k;

    public pzt(nqd nqdVar) {
        yyt yytVar = new yyt(nqdVar);
        yytVar.f = new ncs(9, this);
        this.g = yytVar;
        this.h = new u6k(0);
        this.i = 1.0f;
        this.k = -1;
    }

    @Override // defpackage.w4k
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.w4k
    public final void c(m85 m85Var) {
        this.j = m85Var;
    }

    @Override // defpackage.w4k
    public final long i() {
        return ((nmq) this.e.getValue()).a;
    }

    @Override // defpackage.w4k
    public final void j(jpa jpaVar) {
        m85 m85Var = this.j;
        yyt yytVar = this.g;
        if (m85Var == null) {
            m85Var = (m85) yytVar.g.getValue();
        }
        if (((Boolean) this.f.getValue()).booleanValue() && jpaVar.getLayoutDirection() == xof.b) {
            long y0 = jpaVar.y0();
            nsh q0 = jpaVar.q0();
            long B = q0.B();
            q0.s().r();
            try {
                ((xzi) q0.b).f0(-1.0f, 1.0f, y0);
                yytVar.e(jpaVar, this.i, m85Var);
            } finally {
                vz1.A(q0, B);
            }
        } else {
            yytVar.e(jpaVar, this.i, m85Var);
        }
        this.k = this.h.h();
    }
}
