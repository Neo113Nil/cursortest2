package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class u51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j61 b;

    public /* synthetic */ u51(j61 j61Var, int i) {
        this.a = i;
        this.b = j61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.showProgress();
                break;
            default:
                this.b.showProgress();
                break;
        }
    }
}
