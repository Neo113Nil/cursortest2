package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class jj7 implements ycg {
    public final /* synthetic */ int a;
    public final /* synthetic */ c80 b;
    public final /* synthetic */ dsc c;
    public final /* synthetic */ tg7 d;

    public /* synthetic */ jj7(c80 c80Var, dsc dscVar, tg7 tg7Var, int i) {
        this.a = i;
        this.b = c80Var;
        this.c = dscVar;
        this.d = tg7Var;
    }

    @Override // defpackage.ycg
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d80) obj).d0(this.b, this.c, this.d);
                break;
            default:
                ((d80) obj).w(this.b, this.c, this.d);
                break;
        }
    }
}
