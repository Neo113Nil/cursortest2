package defpackage;

/* loaded from: classes15.dex */
public final class qh9 implements v7p {
    public final /* synthetic */ int a;
    public final br10 b;
    public final br10 c;
    public final xvf0 d;

    public /* synthetic */ qh9(br10 br10Var, br10 br10Var2, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = br10Var;
        this.c = br10Var2;
        this.d = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        br10 br10Var = this.c;
        br10 br10Var2 = this.b;
        switch (i) {
            case 0:
                return new ph9((meb) br10Var2.get(), (x8b) br10Var.get(), (ikw0) xvf0Var.get());
            default:
                return new z8b((meb) br10Var2.get(), (x8b) br10Var.get(), (ph9) xvf0Var.get());
        }
    }
}
