package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mrb implements ycg, pbh, ua6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ mrb(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((lrl) obj).u(this.b);
                break;
            default:
                ((lrl) obj).t(this.b);
                break;
        }
    }

    @Override // defpackage.pbh
    public int c(jx7 jx7Var, int i) {
        jx7Var.getClass();
        return jx7Var.L(this.b);
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((f8l) obj).H(this.b);
                break;
            default:
                ((f8l) obj).H(this.b);
                break;
        }
    }
}
