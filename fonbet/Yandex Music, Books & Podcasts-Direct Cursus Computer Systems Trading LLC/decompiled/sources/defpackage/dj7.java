package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class dj7 implements ycg {
    public final /* synthetic */ int a;
    public final /* synthetic */ c80 b;
    public final /* synthetic */ cfg c;
    public final /* synthetic */ boh d;

    public /* synthetic */ dj7(c80 c80Var, cfg cfgVar, boh bohVar, int i) {
        this.a = 0;
        this.b = c80Var;
        this.c = cfgVar;
        this.d = bohVar;
    }

    @Override // defpackage.ycg
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d80) obj).m(this.b, this.c, this.d);
                break;
            case 1:
                ((d80) obj).D(this.b, this.c, this.d);
                break;
            default:
                ((d80) obj).Z(this.b, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ dj7(c80 c80Var, cfg cfgVar, boh bohVar, int i, byte b) {
        this.a = i;
        this.b = c80Var;
        this.c = cfgVar;
        this.d = bohVar;
    }
}
