package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final /* synthetic */ class tti0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uti0 b;

    public /* synthetic */ tti0(uti0 uti0Var, int i) {
        this.a = i;
        this.b = uti0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        uti0 uti0Var = this.b;
        switch (i) {
            case 0:
                z83.g(null, (Looper) uti0Var.x.b, Looper.myLooper());
                pti0 pti0Var = uti0Var.w;
                if (pti0Var != null) {
                    pti0Var.close();
                    uti0Var.w = null;
                    break;
                }
                break;
            default:
                sti0 sti0Var = uti0Var.c;
                if (sti0Var != null) {
                    sti0Var.f();
                    break;
                }
                break;
        }
    }
}
