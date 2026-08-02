package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j73 extends a6 {
    public final Thread d;
    public final rib e;

    public j73(CoroutineContext coroutineContext, Thread thread, rib ribVar) {
        super(coroutineContext, true, true);
        this.d = thread;
        this.e = ribVar;
    }

    @Override // defpackage.h3f
    public final void p(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (Intrinsics.d(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
