package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class x7i0 implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ oz40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ yx40 w;
    public final /* synthetic */ tls x;

    public /* synthetic */ x7i0(int i, tls tlsVar, oz40 oz40Var, yx40 yx40Var) {
        this.c = i;
        this.x = tlsVar;
        this.b = oz40Var;
        this.w = yx40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.x;
        yx40 yx40Var = this.w;
        int i2 = this.c;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                oz40Var.setValue(Boolean.TRUE);
                yx40Var.setIntValue(i2);
                tlsVar.invoke(Integer.valueOf(i2));
                break;
            default:
                oz40Var.setValue(Boolean.TRUE);
                int i3 = i2 + 1;
                yx40Var.setIntValue(i3);
                tlsVar.invoke(Integer.valueOf(i3));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ x7i0(oz40 oz40Var, int i, yx40 yx40Var, tls tlsVar) {
        this.b = oz40Var;
        this.c = i;
        this.w = yx40Var;
        this.x = tlsVar;
    }
}
