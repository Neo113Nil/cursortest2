package defpackage;

/* loaded from: classes3.dex */
public final class nzc extends psc {
    public final k3i b;
    public final /* synthetic */ pzc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzc(pzc pzcVar, vn4 vn4Var, k3i k3iVar) {
        super(vn4Var);
        vn4Var.getClass();
        k3iVar.getClass();
        this.c = pzcVar;
        this.b = k3iVar;
    }

    @Override // defpackage.qsc, defpackage.vn4
    public final void e(Object obj) {
        ssg.a(4, "GRPC.HEAD", ouj.o(this.b.b, " ---> Sending message: ", obj != null ? obj.getClass().getSimpleName() : null), null);
        if (((Boolean) ((dfw) this.c.a.a).invoke()).booleanValue()) {
            ssg.a(4, "GRPC.BODY", String.valueOf(obj), null);
        }
        super.e(obj);
    }

    @Override // defpackage.qsc, defpackage.vn4
    public final void f(bg3 bg3Var, s2i s2iVar) {
        pzc pzcVar = this.c;
        new vd(23, pzcVar, this, s2iVar).invoke();
        super.f(new ozc(pzcVar, bg3Var, this.b), s2iVar);
    }
}
