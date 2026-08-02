package defpackage;

import android.util.Log;
import androidx.fragment.app.f0;
import androidx.fragment.app.g;
import androidx.fragment.app.y;

/* loaded from: classes.dex */
public final /* synthetic */ class rr7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ g c;

    public /* synthetic */ rr7(f0 f0Var, g gVar, int i) {
        this.a = i;
        this.b = f0Var;
        this.c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean M = y.M(2);
                f0 f0Var = this.b;
                if (M) {
                    Log.v("FragmentManager", "Transition for operation " + f0Var + " has completed");
                }
                f0Var.c(this.c);
                break;
            default:
                boolean M2 = y.M(2);
                f0 f0Var2 = this.b;
                if (M2) {
                    Log.v("FragmentManager", "Transition for operation " + f0Var2 + " has completed");
                }
                f0Var2.c(this.c);
                break;
        }
    }
}
