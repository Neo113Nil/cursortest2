package defpackage;

/* loaded from: classes7.dex */
public final /* synthetic */ class v191 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gr81 b;

    public /* synthetic */ v191(gr81 gr81Var) {
        this.b = gr81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        gr81 gr81Var = this.b;
        switch (i) {
            case 0:
                gr81Var.getClass();
                break;
            default:
                cf71 cf71Var = (cf71) gr81Var.b;
                if (cf71Var != null) {
                    cf71Var.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v191(gr81 gr81Var, rt71 rt71Var) {
        this.b = gr81Var;
    }
}
