package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xa extends jg implements Executor {
    public static final n9 VgvYg0wo;
    public static final xa wxUZMvaN = new xa();

    static {
        ye0 ye0Var = ye0.wxUZMvaN;
        int i = eb0.qoPGr6Ce;
        if (64 >= i) {
            i = 64;
        }
        VgvYg0wo = ye0Var.WYNAV5pd(g50.k3x7lurq("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // defpackage.n9
    public final void FySoLYna(l9 l9Var, Runnable runnable) {
        VgvYg0wo.FySoLYna(l9Var, runnable);
    }

    @Override // defpackage.n9
    public final void RXQxj5Oe(l9 l9Var, Runnable runnable) {
        VgvYg0wo.RXQxj5Oe(l9Var, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        RXQxj5Oe(uf.NCTxEWno, runnable);
    }

    @Override // defpackage.n9
    public final String toString() {
        return "Dispatchers.IO";
    }
}
