package defpackage;

/* loaded from: classes7.dex */
public final /* synthetic */ class rc81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc81 b;
    public final /* synthetic */ sf81 c;
    public final /* synthetic */ nl81 w;
    public final /* synthetic */ pil0 x;

    public /* synthetic */ rc81(sc81 sc81Var, sf81 sf81Var, nl81 nl81Var, pil0 pil0Var, int i) {
        this.a = i;
        this.b = sc81Var;
        this.c = sf81Var;
        this.w = nl81Var;
        this.x = pil0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        pil0 pil0Var = this.x;
        nl81 nl81Var = this.w;
        sf81 sf81Var = this.c;
        sc81 sc81Var = this.b;
        switch (i) {
            case 0:
                sf81Var.c(sc81Var.a, sc81Var.b, nl81Var, pil0Var);
                break;
            case 1:
                sf81Var.m(sc81Var.a, sc81Var.b, nl81Var, pil0Var);
                break;
            default:
                sf81Var.k(sc81Var.a, sc81Var.b, nl81Var, pil0Var);
                break;
        }
    }
}
