package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ay1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xiu b;
    public final /* synthetic */ z9 c;

    public /* synthetic */ ay1(xiu xiuVar, z9 z9Var, int i) {
        this.a = i;
        this.b = xiuVar;
        this.c = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        z9 z9Var = this.c;
        xiu xiuVar = this.b;
        switch (i) {
            case 0:
                fy1 fy1Var = (fy1) xiuVar.c;
                int i2 = dvt.a;
                fy1Var.r(z9Var);
                break;
            default:
                fy1 fy1Var2 = (fy1) xiuVar.c;
                int i3 = dvt.a;
                fy1Var2.s(z9Var);
                break;
        }
    }
}
