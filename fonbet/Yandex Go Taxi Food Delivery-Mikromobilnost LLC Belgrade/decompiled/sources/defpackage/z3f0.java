package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class z3f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4f0 b;
    public final /* synthetic */ a4f0 c;

    public /* synthetic */ z3f0(b4f0 b4f0Var, a4f0 a4f0Var, int i) {
        this.a = i;
        this.b = b4f0Var;
        this.c = a4f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a4f0 a4f0Var = this.c;
        b4f0 b4f0Var = this.b;
        switch (i) {
            case 0:
                b4f0Var.d.b(a4f0Var);
                a4f0Var.a();
                break;
            default:
                b4f0Var.d.d(a4f0Var);
                break;
        }
    }
}
