package defpackage;

/* loaded from: classes5.dex */
public final class qh4 implements v7p {
    public final /* synthetic */ int a = 0;
    public final xvf0 b;
    public final peb c;

    public qh4(peb pebVar, xvf0 xvf0Var) {
        this.c = pebVar;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        peb pebVar = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new oh4((yfa) pebVar.get(), (l7x0) xvf0Var.get());
            default:
                return new oh4((l7x0) xvf0Var.get(), (yfa) pebVar.get());
        }
    }

    public qh4(xvf0 xvf0Var, peb pebVar) {
        this.b = xvf0Var;
        this.c = pebVar;
    }
}
