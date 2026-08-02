package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ij7 implements ycg {
    public final /* synthetic */ int a;
    public final /* synthetic */ c80 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ ij7(c80 c80Var, Exception exc, int i) {
        this.a = i;
        this.b = c80Var;
        this.c = exc;
    }

    @Override // defpackage.ycg
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d80) obj).m0(this.b, this.c);
                break;
            case 1:
                ((d80) obj).f(this.b, this.c);
                break;
            case 2:
                ((d80) obj).O(this.b, this.c);
                break;
            default:
                ((d80) obj).e(this.b, this.c);
                break;
        }
    }
}
