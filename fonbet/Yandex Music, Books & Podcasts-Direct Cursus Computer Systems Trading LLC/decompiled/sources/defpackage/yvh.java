package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class yvh implements ua6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ cfg c;
    public final /* synthetic */ boh d;

    public /* synthetic */ yvh(x0 x0Var, cfg cfgVar, boh bohVar, int i) {
        this.a = i;
        this.b = x0Var;
        this.c = cfgVar;
        this.d = bohVar;
    }

    @Override // defpackage.ua6
    public final void accept(Object obj) {
        bwh bwhVar = (bwh) obj;
        switch (this.a) {
            case 0:
                x0 x0Var = this.b;
                bwhVar.K(x0Var.b, (uvh) x0Var.c, this.c, this.d);
                break;
            default:
                x0 x0Var2 = this.b;
                bwhVar.J(x0Var2.b, (uvh) x0Var2.c, this.c, this.d);
                break;
        }
    }
}
