package bo.app;

import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class g5 implements Callable {
    public final /* synthetic */ l5 a;

    public g5(l5 l5Var) {
        this.a = l5Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.a) {
            try {
                l5 l5Var = this.a;
                if (l5Var.i == null) {
                    return null;
                }
                while (l5Var.h > l5Var.f) {
                    l5Var.d((String) ((Map.Entry) l5Var.j.entrySet().iterator().next()).getKey());
                }
                l5 l5Var2 = this.a;
                int i = l5Var2.k;
                if (i >= 2000 && i >= l5Var2.j.size()) {
                    this.a.d();
                    this.a.k = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
