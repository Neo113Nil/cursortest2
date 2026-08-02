package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;

/* loaded from: classes10.dex */
public final /* synthetic */ class rkh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iot0 b;
    public final /* synthetic */ f c;

    public /* synthetic */ rkh(iot0 iot0Var, f fVar, int i) {
        this.a = i;
        this.b = iot0Var;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        f fVar = this.c;
        iot0 iot0Var = this.b;
        switch (i) {
            case 0:
                if (FragmentManager.O(2)) {
                    iot0Var.toString();
                }
                iot0Var.c(fVar);
                break;
            default:
                if (FragmentManager.O(2)) {
                    iot0Var.toString();
                }
                iot0Var.c(fVar);
                break;
        }
    }
}
