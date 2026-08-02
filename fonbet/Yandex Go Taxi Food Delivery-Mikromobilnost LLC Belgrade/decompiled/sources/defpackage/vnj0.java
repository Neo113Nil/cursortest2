package defpackage;

/* loaded from: classes14.dex */
public final class vnj0 implements v7p {
    public final /* synthetic */ int a = 0;
    public final xvf0 b;
    public final u0g c;

    public vnj0(u0g u0gVar, x0g x0gVar) {
        this.c = u0gVar;
        this.b = x0gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        u0g u0gVar = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new unj0((rqo) u0gVar.get(), (k7x0) xvf0Var.get());
            default:
                return new oxs0((rqo) u0gVar.get(), (zuj0) xvf0Var.get());
        }
    }

    public vnj0(w0g w0gVar, u0g u0gVar) {
        this.b = w0gVar;
        this.c = u0gVar;
    }
}
