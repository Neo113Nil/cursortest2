package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x extends p0 {
    public final /* synthetic */ y A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar) {
        super(yVar);
        this.A = yVar;
    }

    @Override // x1.o0
    public final int W(v1.k kVar) {
        int c3 = f.c(this, kVar);
        this.f8146z.h(c3, kVar);
        return c3;
    }

    @Override // v1.d0
    public final v1.j0 e(long j3) {
        S(j3);
        new s2.a(j3);
        y yVar = this.A;
        w wVar = yVar.T;
        f1 f1Var = yVar.f8034v;
        pc.j.b(f1Var);
        p0 z02 = f1Var.z0();
        pc.j.b(z02);
        p0.q0(this, wVar.e(this, z02, j3));
        return this;
    }
}
