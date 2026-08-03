package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r extends p0 {
    @Override // x1.o0
    public final int W(v1.k kVar) {
        t0 t0Var = this.f8141u.f8033u.J.f8104q;
        pc.j.b(t0Var);
        h0 h0Var = t0Var.f8177w;
        k0 k0Var = t0Var.f8166l;
        if (k0Var.f8091d == c0.f7981h) {
            h0Var.f8070d = true;
            if (h0Var.f8068b) {
                k0Var.f8093f = true;
                k0Var.f8094g = true;
            }
        } else {
            h0Var.f8071e = true;
        }
        r rVar = t0Var.k().U;
        if (rVar != null) {
            rVar.f8126q = true;
        }
        t0Var.r();
        r rVar2 = t0Var.k().U;
        if (rVar2 != null) {
            rVar2.f8126q = false;
        }
        Integer num = (Integer) h0Var.f8073g.get(kVar);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f8146z.h(intValue, kVar);
        return intValue;
    }

    @Override // v1.d0
    public final v1.j0 e(long j3) {
        S(j3);
        f1 f1Var = this.f8141u;
        o0.e w3 = f1Var.f8033u.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            t0 t0Var = ((g0) objArr[i11]).J.f8104q;
            pc.j.b(t0Var);
            t0Var.f8170p = e0.f8021i;
        }
        g0 g0Var = f1Var.f8033u;
        p0.q0(this, g0Var.A.a(this, g0Var.l(), j3));
        return this;
    }

    @Override // x1.p0
    public final void r0() {
        t0 t0Var = this.f8141u.f8033u.J.f8104q;
        pc.j.b(t0Var);
        t0Var.a0();
    }
}
