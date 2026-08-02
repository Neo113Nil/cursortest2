package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class sj7 implements ycg, ua6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sj7(int i, c80 c80Var, g8l g8lVar, g8l g8lVar2) {
        this.b = c80Var;
        this.a = i;
        this.c = g8lVar;
        this.d = g8lVar2;
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        x0 x0Var = (x0) this.b;
        ((bwh) obj).A(x0Var.b, (uvh) x0Var.c, (cfg) this.c, (boh) this.d, this.a);
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        c80 c80Var = (c80) this.b;
        g8l g8lVar = (g8l) this.c;
        g8l g8lVar2 = (g8l) this.d;
        d80 d80Var = (d80) obj;
        d80Var.getClass();
        d80Var.B(this.a, c80Var, g8lVar, g8lVar2);
    }

    public /* synthetic */ sj7(x0 x0Var, cfg cfgVar, boh bohVar, int i) {
        this.b = x0Var;
        this.c = cfgVar;
        this.d = bohVar;
        this.a = i;
    }
}
