package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class vjp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k20 b;

    public /* synthetic */ vjp(k20 k20Var, int i) {
        this.a = i;
        this.b = k20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        k20 k20Var = this.b;
        switch (i) {
            case 0:
                k20Var.cancel();
                break;
            default:
                k20Var.cancel();
                break;
        }
    }
}
