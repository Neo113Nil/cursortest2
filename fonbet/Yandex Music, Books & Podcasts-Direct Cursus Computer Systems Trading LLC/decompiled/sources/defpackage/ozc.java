package defpackage;

/* loaded from: classes3.dex */
public final class ozc extends bg3 {
    public final bg3 t;
    public final k3i u;
    public final /* synthetic */ pzc v;

    public ozc(pzc pzcVar, bg3 bg3Var, k3i k3iVar) {
        k3iVar.getClass();
        this.v = pzcVar;
        this.t = bg3Var;
        this.u = k3iVar;
    }

    @Override // defpackage.bg3
    public final void Q(sgr sgrVar, s2i s2iVar) {
        sgrVar.getClass();
        s2iVar.getClass();
        new ye(this.v, this, sgrVar, s2iVar, 18).invoke();
        this.t.Q(sgrVar, s2iVar);
    }

    @Override // defpackage.bg3
    public final void R(s2i s2iVar) {
        new vd(24, this.v, this, s2iVar).invoke();
        this.t.R(s2iVar);
    }

    @Override // defpackage.bg3
    public final void S(Object obj) {
        ssg.a(4, "GRPC.HEAD", ouj.o(this.u.b, " <--- Received message: ", obj != null ? obj.getClass().getSimpleName() : null), null);
        if (((Boolean) ((dfw) this.v.a.a).invoke()).booleanValue()) {
            ssg.a(4, "GRPC.BODY", String.valueOf(obj), null);
        }
        this.t.S(obj);
    }

    @Override // defpackage.bg3
    public final void T() {
        this.t.T();
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.t, "delegate");
        return Y.toString();
    }
}
