package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class vf10 implements c9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf10 b;
    public final /* synthetic */ uwy c;
    public final /* synthetic */ he10 w;

    public /* synthetic */ vf10(xf10 xf10Var, uwy uwyVar, he10 he10Var, int i) {
        this.a = i;
        this.b = xf10Var;
        this.c = uwyVar;
        this.w = he10Var;
    }

    @Override // defpackage.c9e
    public final void accept(Object obj) {
        int i = this.a;
        he10 he10Var = this.w;
        uwy uwyVar = this.c;
        xf10 xf10Var = this.b;
        yf10 yf10Var = (yf10) obj;
        switch (i) {
            case 0:
                yf10Var.onLoadCompleted(xf10Var.a, xf10Var.b, uwyVar, he10Var);
                break;
            default:
                yf10Var.onLoadCanceled(xf10Var.a, xf10Var.b, uwyVar, he10Var);
                break;
        }
    }
}
