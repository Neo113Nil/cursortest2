package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class u7l0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wls b;
    public final /* synthetic */ x7l0 c;

    public /* synthetic */ u7l0(wls wlsVar, x7l0 x7l0Var, int i) {
        this.a = i;
        this.b = wlsVar;
        this.c = x7l0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        x7l0 x7l0Var = this.c;
        wls wlsVar = this.b;
        switch (i) {
            case 0:
                wlsVar.invoke(Integer.valueOf(x7l0Var.c), x7l0Var.l.d);
                break;
            default:
                wlsVar.invoke(dyq.a, Integer.valueOf(x7l0Var.c));
                break;
        }
        return zy11Var;
    }
}
