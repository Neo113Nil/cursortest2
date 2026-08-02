package defpackage;

import android.content.Context;

/* loaded from: classes5.dex */
public final class y6g implements xvf0 {
    public final /* synthetic */ int a;
    public final fcj0 b;

    public /* synthetic */ y6g(fcj0 fcj0Var, int i) {
        this.a = i;
        this.b = fcj0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        fcj0 fcj0Var = this.b;
        switch (i) {
            case 0:
                return (jwh) fcj0Var.e;
            case 1:
                Context context = (Context) fcj0Var.a;
                q5z.h(context);
                return context;
            case 2:
                yuj0 yuj0Var = (yuj0) fcj0Var.d;
                q5z.h(yuj0Var);
                return yuj0Var;
            case 3:
                return (qcp0) fcj0Var.b;
            default:
                return (hwy0) fcj0Var.c;
        }
    }
}
