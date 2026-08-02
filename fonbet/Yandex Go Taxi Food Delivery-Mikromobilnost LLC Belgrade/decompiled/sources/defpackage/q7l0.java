package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class q7l0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;
    public final /* synthetic */ oz40 c;

    public /* synthetic */ q7l0(int i, sls slsVar, oz40 oz40Var) {
        this.a = i;
        this.b = slsVar;
        this.c = oz40Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.c;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                oz40Var.setValue(bool);
                if (booleanValue && slsVar != null) {
                    slsVar.invoke();
                    break;
                }
                break;
            default:
                oz40Var.setValue(Boolean.TRUE);
                slsVar.invoke();
                break;
        }
        return zy11Var;
    }
}
