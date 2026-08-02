package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class zv41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw41 b;

    public /* synthetic */ zv41(bw41 bw41Var, int i) {
        this.a = i;
        this.b = bw41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        bw41 bw41Var = this.b;
        switch (i) {
            case 0:
                bw41Var.c.invoke();
                break;
            default:
                bw41Var.a();
                break;
        }
    }
}
