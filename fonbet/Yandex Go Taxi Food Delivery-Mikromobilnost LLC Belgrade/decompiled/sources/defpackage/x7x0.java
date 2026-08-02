package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class x7x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7x0 b;

    public /* synthetic */ x7x0(z7x0 z7x0Var, int i) {
        this.a = i;
        this.b = z7x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        z7x0 z7x0Var = this.b;
        switch (i) {
            case 0:
                z7x0Var.c();
                break;
            default:
                z7x0Var.w = null;
                z7x0Var.c();
                break;
        }
    }
}
