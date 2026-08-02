package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class xx1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xiu b;
    public final /* synthetic */ ig7 c;

    public /* synthetic */ xx1(xiu xiuVar, ig7 ig7Var, int i) {
        this.a = i;
        this.b = xiuVar;
        this.c = ig7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xiu xiuVar = this.b;
                ig7 ig7Var = this.c;
                fy1 fy1Var = (fy1) xiuVar.c;
                int i = dvt.a;
                fy1Var.P(ig7Var);
                break;
            default:
                xiu xiuVar2 = this.b;
                ig7 ig7Var2 = this.c;
                synchronized (ig7Var2) {
                }
                fy1 fy1Var2 = (fy1) xiuVar2.c;
                int i2 = dvt.a;
                fy1Var2.J(ig7Var2);
                break;
        }
    }
}
