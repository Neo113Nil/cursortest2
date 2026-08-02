package defpackage;

/* loaded from: classes3.dex */
public final class hb1 implements ib1 {
    public final oa1 a;
    public final q0d b;
    public final fkn c;

    public hb1(ybf ybfVar, oa1 oa1Var, r0d r0dVar) {
        this.a = oa1Var;
        this.b = r0dVar;
        this.c = ((nb1) ybfVar.getValue()).m;
    }

    @Override // defpackage.ib1
    public final vdr getState() {
        return this.c;
    }

    @Override // defpackage.ib1
    public final q0d k() {
        return this.b;
    }

    @Override // defpackage.ib1
    public final p7a o(m7a m7aVar) {
        m7aVar.getClass();
        return new q7a(m7aVar, new ix6(5, this));
    }

    @Override // defpackage.ib1
    public final x7g u(r7g r7gVar, mm6 mm6Var) {
        mm6Var.getClass();
        return new x7g(r7gVar, new kc(16, this, r7gVar));
    }
}
