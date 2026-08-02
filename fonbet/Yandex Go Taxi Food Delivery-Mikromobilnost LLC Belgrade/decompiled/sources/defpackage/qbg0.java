package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class qbg0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ v8g0 b;

    public /* synthetic */ qbg0(v8g0 v8g0Var, int i) {
        this.a = i;
        this.b = v8g0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        v8g0 v8g0Var = this.b;
        switch (i) {
            case 0:
                n70 n70Var = (n70) obj;
                n70Var.W(new ugd0(21, n70Var, v8g0Var));
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                v8g0Var.invoke(bool);
                break;
        }
        return zy11Var;
    }
}
