package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class acu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dxr b;
    public final /* synthetic */ ig7 c;

    public /* synthetic */ acu(dxr dxrVar, ig7 ig7Var, int i) {
        this.a = i;
        this.b = dxrVar;
        this.c = ig7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dxr dxrVar = this.b;
                ig7 ig7Var = this.c;
                ccu ccuVar = (ccu) dxrVar.b;
                int i = dvt.a;
                ccuVar.F(ig7Var);
                break;
            default:
                dxr dxrVar2 = this.b;
                ig7 ig7Var2 = this.c;
                synchronized (ig7Var2) {
                }
                ccu ccuVar2 = (ccu) dxrVar2.b;
                int i2 = dvt.a;
                ccuVar2.A(ig7Var2);
                break;
        }
    }
}
