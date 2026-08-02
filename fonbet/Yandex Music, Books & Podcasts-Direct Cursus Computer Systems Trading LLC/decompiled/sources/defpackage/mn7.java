package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlinx.coroutines.a;
import kotlinx.coroutines.d;

/* loaded from: classes5.dex */
public final class mn7 extends d implements Executor {
    public static final mn7 d = new mn7();
    public static final a e;

    static {
        wkt wktVar = wkt.d;
        int i = f0s.a;
        if (64 >= i) {
            i = 64;
        }
        e = wktVar.I0(hag.A(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // kotlinx.coroutines.a
    public final void F0(CoroutineContext coroutineContext, Runnable runnable) {
        e.F0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.a
    public final void G0(CoroutineContext coroutineContext, Runnable runnable) {
        e.G0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.a
    public final a I0(int i) {
        return wkt.d.I0(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        F0(g.a, runnable);
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.d
    public final Executor J0() {
        return this;
    }
}
