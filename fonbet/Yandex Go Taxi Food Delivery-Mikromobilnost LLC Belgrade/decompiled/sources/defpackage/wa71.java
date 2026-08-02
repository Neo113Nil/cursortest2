package defpackage;

/* loaded from: classes7.dex */
public final /* synthetic */ class wa71 implements ov71 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ty71 b;

    public /* synthetic */ wa71(wc71 wc71Var, ty71 ty71Var) {
        this.b = ty71Var;
    }

    @Override // defpackage.ov71
    public final void invoke(Object obj) {
        int i = this.a;
        ty71 ty71Var = this.b;
        switch (i) {
            case 0:
                ((ub81) obj).i(ty71Var);
                break;
            default:
                b171 b171Var = (b171) obj;
                o3 o3Var = b171Var.n;
                if (o3Var != null) {
                    qd81 qd81Var = (qd81) o3Var.w;
                    if (qd81Var.K == -1) {
                        da81 da81Var = new da81(qd81Var);
                        da81Var.p = ty71Var.a;
                        da81Var.q = ty71Var.b;
                        b171Var.n = new o3(new qd81(da81Var), o3Var.b, (String) o3Var.c, 20);
                    }
                }
                int i2 = ty71Var.a;
                break;
        }
    }

    public /* synthetic */ wa71(ty71 ty71Var) {
        this.b = ty71Var;
    }
}
