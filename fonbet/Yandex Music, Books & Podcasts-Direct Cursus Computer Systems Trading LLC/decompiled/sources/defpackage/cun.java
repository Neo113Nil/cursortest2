package defpackage;

/* loaded from: classes.dex */
public final class cun implements izg {
    public final /* synthetic */ int a;
    public final /* synthetic */ zt3 b;

    public /* synthetic */ cun(zt3 zt3Var, int i) {
        this.a = i;
        this.b = zt3Var;
    }

    @Override // defpackage.izg
    public final void onResult(Object obj) {
        int i = this.a;
        zt3 zt3Var = this.b;
        switch (i) {
            case 0:
                if (!zt3Var.y()) {
                    r7o r7oVar = z7o.b;
                    zt3Var.resumeWith(obj);
                    break;
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                if (!zt3Var.y()) {
                    r7o r7oVar2 = z7o.b;
                    th.getClass();
                    zt3Var.resumeWith(new t7o(th));
                    break;
                }
                break;
        }
    }
}
