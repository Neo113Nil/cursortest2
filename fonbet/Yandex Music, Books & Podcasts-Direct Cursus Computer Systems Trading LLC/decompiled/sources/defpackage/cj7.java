package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class cj7 implements ycg {
    public final /* synthetic */ int a;
    public final /* synthetic */ c80 b;
    public final /* synthetic */ ig7 c;

    public /* synthetic */ cj7(c80 c80Var, ig7 ig7Var, int i) {
        this.a = i;
        this.b = c80Var;
        this.c = ig7Var;
    }

    @Override // defpackage.ycg
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d80) obj).A(this.b, this.c);
                break;
            case 1:
                ((d80) obj).R(this.b, this.c);
                break;
            case 2:
                ((d80) obj).k0(this.b, this.c);
                break;
            default:
                ((d80) obj).V(this.b, this.c);
                break;
        }
    }
}
