package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class gj7 implements ycg {
    public final /* synthetic */ int a;
    public final /* synthetic */ c80 b;

    public /* synthetic */ gj7(int i, long j, c80 c80Var) {
        this.a = 1;
        this.b = c80Var;
    }

    @Override // defpackage.ycg
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d80) obj).x(this.b);
                break;
            case 1:
                ((d80) obj).r(this.b);
                break;
            case 2:
                ((d80) obj).n(this.b);
                break;
            case 3:
                ((d80) obj).e0(this.b);
                break;
            case 4:
                ((d80) obj).H(this.b);
                break;
            case 5:
                ((d80) obj).o0(this.b);
                break;
            default:
                ((d80) obj).c(this.b);
                break;
        }
    }

    public /* synthetic */ gj7(c80 c80Var, int i) {
        this.a = i;
        this.b = c80Var;
    }

    public /* synthetic */ gj7(c80 c80Var, long j) {
        this.a = 0;
        this.b = c80Var;
    }
}
