package defpackage;

import android.content.Context;

/* loaded from: classes12.dex */
public final class q5g implements xvf0 {
    public final /* synthetic */ int a;
    public final dt20 b;

    public /* synthetic */ q5g(dt20 dt20Var, int i) {
        this.a = i;
        this.b = dt20Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        dt20 dt20Var = this.b;
        switch (i) {
            case 0:
                tt2 tt2Var = (tt2) dt20Var.w;
                q5z.h(tt2Var);
                return tt2Var;
            case 1:
                Context context = (Context) dt20Var.b;
                q5z.h(context);
                return context;
            default:
                atd0 atd0Var = (atd0) dt20Var.x;
                q5z.h(atd0Var);
                return atd0Var;
        }
    }
}
