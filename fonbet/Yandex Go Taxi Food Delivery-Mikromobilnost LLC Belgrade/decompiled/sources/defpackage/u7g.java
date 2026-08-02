package defpackage;

import android.content.Context;

/* loaded from: classes13.dex */
public final class u7g implements xvf0 {
    public final /* synthetic */ int a;
    public final fcj0 b;

    public /* synthetic */ u7g(fcj0 fcj0Var, int i) {
        this.a = i;
        this.b = fcj0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        fcj0 fcj0Var = this.b;
        switch (i) {
            case 0:
                Context context = (Context) fcj0Var.a;
                q5z.h(context);
                return context;
            case 1:
                ah00 ah00Var = (ah00) fcj0Var.c;
                q5z.h(ah00Var);
                return ah00Var;
            case 2:
                zuj0 zuj0Var = (zuj0) fcj0Var.b;
                q5z.h(zuj0Var);
                return zuj0Var;
            case 3:
                return (r400) fcj0Var.d;
            default:
                j741 j741Var = (j741) ((yvf0) fcj0Var.e).get();
                q5z.h(j741Var);
                return j741Var;
        }
    }
}
