package com.gamericefishpro.space.wi;

import com.gamericefishpro.space.pi.t;
import com.gamericefishpro.space.pi.v0;
import com.gamericefishpro.space.ui.s;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends v0 implements Executor {
    public static final d i = new d();
    public static final t v;

    static {
        l lVar = l.i;
        int i2 = s.a;
        if (64 >= i2) {
            i2 = 64;
        }
        v = lVar.S(com.gamericefishpro.space.ui.a.k("kotlinx.coroutines.io.parallelism", i2, 12));
    }

    @Override // com.gamericefishpro.space.pi.t
    public final void P(CoroutineContext coroutineContext, Runnable runnable) {
        v.P(coroutineContext, runnable);
    }

    @Override // com.gamericefishpro.space.pi.t
    public final void Q(CoroutineContext coroutineContext, Runnable runnable) {
        v.Q(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        P(kotlin.coroutines.g.d, runnable);
    }

    @Override // com.gamericefishpro.space.pi.t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
