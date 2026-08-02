package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class yuz0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;

    public /* synthetic */ yuz0(int i, oz40 oz40Var) {
        this.a = i;
        this.b = oz40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                oz40Var.setValue(Boolean.TRUE);
                break;
            default:
                oz40Var.setValue(Boolean.FALSE);
                break;
        }
        return zy11Var;
    }
}
