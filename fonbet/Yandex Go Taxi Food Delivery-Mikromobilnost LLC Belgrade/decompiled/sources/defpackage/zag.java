package defpackage;

import android.content.Context;

/* loaded from: classes12.dex */
public final class zag implements xvf0 {
    public final /* synthetic */ int a;
    public final kv1 b;

    public /* synthetic */ zag(kv1 kv1Var, int i) {
        this.a = i;
        this.b = kv1Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        kv1 kv1Var = this.b;
        switch (i) {
            case 0:
                pho phoVar = (pho) kv1Var.o;
                q5z.h(phoVar);
                return phoVar;
            case 1:
                w030 w030Var = (w030) kv1Var.p;
                q5z.h(w030Var);
                return w030Var;
            case 2:
                tj60 tj60Var = (tj60) kv1Var.h;
                q5z.h(tj60Var);
                return tj60Var;
            case 3:
                zuj0 zuj0Var = (zuj0) kv1Var.g;
                q5z.h(zuj0Var);
                return zuj0Var;
            default:
                Context context = (Context) kv1Var.i;
                q5z.h(context);
                return context;
        }
    }
}
