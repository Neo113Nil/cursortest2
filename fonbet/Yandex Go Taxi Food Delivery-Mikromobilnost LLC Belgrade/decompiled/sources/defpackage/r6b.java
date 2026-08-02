package defpackage;

/* loaded from: classes15.dex */
public final class r6b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j18 b;

    public /* synthetic */ r6b(j18 j18Var, int i) {
        this.a = i;
        this.b = j18Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        j18 j18Var = this.b;
        switch (i) {
            case 0:
                j18Var.resumeWith(zy11Var);
                break;
            case 1:
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(zy11Var);
                    break;
                }
                break;
            case 2:
                i6u.a(j18Var);
                break;
            case 3:
                j18Var.resumeWith(Boolean.FALSE);
                break;
            case 4:
                j18Var.resumeWith(Boolean.TRUE);
                break;
            case 5:
                j18Var.resumeWith(zy11Var);
                break;
            case 6:
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(new iyj0(zy11Var));
                    break;
                }
                break;
            case 7:
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(new myj0(zy11Var));
                    break;
                }
                break;
            default:
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(zy11Var);
                    break;
                }
                break;
        }
    }
}
