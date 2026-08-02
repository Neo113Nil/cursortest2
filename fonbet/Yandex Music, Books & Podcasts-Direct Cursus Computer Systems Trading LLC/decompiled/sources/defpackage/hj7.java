package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hj7 implements ycg {
    public final /* synthetic */ int a;
    public final /* synthetic */ c80 b;
    public final /* synthetic */ int c;

    public /* synthetic */ hj7(int i, long j, c80 c80Var) {
        this.a = 0;
        this.b = c80Var;
        this.c = i;
    }

    @Override // defpackage.ycg
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d80) obj).K(this.b, this.c);
                break;
            case 1:
                d80 d80Var = (d80) obj;
                d80Var.getClass();
                d80Var.W(this.b, this.c);
                break;
            case 2:
                ((d80) obj).X(this.b, this.c);
                break;
            case 3:
                ((d80) obj).P(this.b, this.c);
                break;
            case 4:
                ((d80) obj).n0(this.b, this.c);
                break;
            case 5:
                ((d80) obj).J(this.b, this.c);
                break;
            default:
                ((d80) obj).M(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ hj7(c80 c80Var, int i, int i2) {
        this.a = i2;
        this.b = c80Var;
        this.c = i;
    }
}
