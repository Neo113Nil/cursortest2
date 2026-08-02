package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final /* synthetic */ class rf4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sf4 b;

    public /* synthetic */ rf4(sf4 sf4Var, int i) {
        this.a = i;
        this.b = sf4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        sf4 sf4Var = this.b;
        switch (i) {
            case 0:
                h0w h0wVar = sf4Var.x;
                z83.g(null, (Looper) h0wVar.c, Looper.myLooper());
                z83.f(sf4Var.w, null);
                qf4 qf4Var = (qf4) ((h3y) h0wVar.b).get();
                z83.g(null, qf4Var.a, Looper.myLooper());
                sf4Var.w = new pf4(qf4Var, sf4Var);
                break;
            default:
                z83.g(null, (Looper) sf4Var.x.c, Looper.myLooper());
                pf4 pf4Var = sf4Var.w;
                if (pf4Var != null) {
                    pf4Var.close();
                    sf4Var.w = null;
                    break;
                }
                break;
        }
    }
}
