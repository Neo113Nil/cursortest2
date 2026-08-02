package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class ts4 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;
    public final /* synthetic */ sls c;

    public /* synthetic */ ts4(int i, sls slsVar, sls slsVar2) {
        this.a = i;
        this.b = slsVar;
        this.c = slsVar2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.c;
        sls slsVar2 = this.b;
        switch (i) {
            case 0:
                slsVar2.invoke();
                return new ws4(0, slsVar);
            case 1:
                slsVar2.invoke();
                return new ws4(1, slsVar);
            case 2:
                lly0 lly0Var = (lly0) obj;
                slsVar2.invoke();
                if (slsVar != null ? ((Boolean) slsVar.invoke()).booleanValue() : true) {
                    lly0Var.close();
                }
                return zy11Var;
            case 3:
                lly0 lly0Var2 = (lly0) obj;
                slsVar2.invoke();
                if (slsVar != null ? ((Boolean) slsVar.invoke()).booleanValue() : true) {
                    lly0Var2.close();
                }
                return zy11Var;
            default:
                slsVar2.invoke();
                return new ws4(3, slsVar);
        }
    }
}
