package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class lj7 implements ycg {
    public final /* synthetic */ int a;
    public final /* synthetic */ c80 b;
    public final /* synthetic */ String c;

    public /* synthetic */ lj7(c80 c80Var, String str, int i) {
        this.a = i;
        this.b = c80Var;
        this.c = str;
    }

    @Override // defpackage.ycg
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d80) obj).I(this.b, this.c);
                break;
            default:
                ((d80) obj).T(this.b, this.c);
                break;
        }
    }
}
