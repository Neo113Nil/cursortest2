package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class by1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xiu b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ by1(xiu xiuVar, Exception exc, int i) {
        this.a = i;
        this.b = xiuVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Exception exc = this.c;
        xiu xiuVar = this.b;
        switch (i) {
            case 0:
                fy1 fy1Var = (fy1) xiuVar.c;
                int i2 = dvt.a;
                fy1Var.f(exc);
                break;
            default:
                fy1 fy1Var2 = (fy1) xiuVar.c;
                int i3 = dvt.a;
                fy1Var2.M(exc);
                break;
        }
    }
}
