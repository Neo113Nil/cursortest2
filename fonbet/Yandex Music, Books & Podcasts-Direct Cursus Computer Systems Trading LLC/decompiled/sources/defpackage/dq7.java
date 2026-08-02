package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;
import kotlinx.coroutines.d;

/* loaded from: classes5.dex */
public final class dq7 extends d {
    public static final dq7 e;
    public lm6 d;

    static {
        int i = n8s.c;
        int i2 = n8s.d;
        long j = n8s.e;
        String str = n8s.a;
        dq7 dq7Var = new dq7();
        dq7Var.d = new lm6(j, str, i, i2);
        e = dq7Var;
    }

    @Override // kotlinx.coroutines.a
    public final void F0(CoroutineContext coroutineContext, Runnable runnable) {
        lm6.g(this.d, runnable, 6);
    }

    @Override // kotlinx.coroutines.a
    public final void G0(CoroutineContext coroutineContext, Runnable runnable) {
        lm6.g(this.d, runnable, 2);
    }

    @Override // kotlinx.coroutines.a
    public final a I0(int i) {
        q5g.B(i);
        return i >= n8s.c ? this : super.I0(i);
    }

    @Override // kotlinx.coroutines.d
    public final Executor J0() {
        return this.d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        return "Dispatchers.Default";
    }
}
