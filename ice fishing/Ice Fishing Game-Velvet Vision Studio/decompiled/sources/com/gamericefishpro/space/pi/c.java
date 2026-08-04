package com.gamericefishpro.space.pi;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public final Thread v;
    public final u0 w;

    public c(CoroutineContext coroutineContext, Thread thread, u0 u0Var) {
        super(coroutineContext, true);
        this.v = thread;
        this.w = u0Var;
    }

    @Override // com.gamericefishpro.space.pi.l1
    public final void m(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.v;
        if (Intrinsics.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
