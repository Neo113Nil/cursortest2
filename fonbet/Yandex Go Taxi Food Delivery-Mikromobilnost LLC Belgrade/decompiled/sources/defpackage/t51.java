package defpackage;

/* loaded from: classes12.dex */
public final class t51 implements v7p {
    public final /* synthetic */ int a;
    public final r51 b;
    public final xvf0 c;

    public /* synthetic */ t51(r51 r51Var, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = r51Var;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        r51 r51Var = this.b;
        switch (i) {
            case 0:
                e51 e51Var = (e51) xvf0Var.get();
                r51Var.getClass();
                return new ryh(13, e51Var);
            default:
                e51 e51Var2 = (e51) xvf0Var.get();
                b5v0 b5v0Var = r51Var.c;
                return b5v0Var == null ? new g191(e51Var2) : b5v0Var;
        }
    }
}
