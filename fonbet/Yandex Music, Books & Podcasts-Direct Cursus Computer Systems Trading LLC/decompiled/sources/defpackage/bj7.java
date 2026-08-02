package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bj7 implements ycg {
    public final /* synthetic */ int a;
    public final /* synthetic */ c80 b;
    public final /* synthetic */ boh c;

    public /* synthetic */ bj7(c80 c80Var, boh bohVar, int i) {
        this.a = i;
        this.b = c80Var;
        this.c = bohVar;
    }

    @Override // defpackage.ycg
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d80) obj).c0(this.b, this.c);
                break;
            default:
                ((d80) obj).o(this.b, this.c);
                break;
        }
    }
}
