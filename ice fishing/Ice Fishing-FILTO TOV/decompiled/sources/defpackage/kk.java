package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kk extends wq implements Executor {
    public static final kk AvO7iQsrTN = new kk();
    public static final ih encWxUiV2;

    static {
        nc1 nc1Var = nc1.AvO7iQsrTN;
        int i = p71.GWasM1elztuh;
        if (64 >= i) {
            i = 64;
        }
        encWxUiV2 = nc1Var.AvO7iQsrTN(o50.eUH21U3apd(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.ih
    public final void OOA6hdeuvCS(gh ghVar, Runnable runnable) {
        encWxUiV2.OOA6hdeuvCS(ghVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        OOA6hdeuvCS(vp.OOA6hdeuvCS, runnable);
    }

    @Override // defpackage.ih
    public final String toString() {
        return "Dispatchers.IO";
    }
}
