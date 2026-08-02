package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class z7c0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8c0 b;

    public /* synthetic */ z7c0(a8c0 a8c0Var, int i) {
        this.a = i;
        this.b = a8c0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a8c0 a8c0Var = this.b;
        switch (i) {
            case 0:
                a8c0Var.a.reloadDocument();
                break;
            default:
                a8c0Var.c.a();
                break;
        }
        return zy11Var;
    }
}
