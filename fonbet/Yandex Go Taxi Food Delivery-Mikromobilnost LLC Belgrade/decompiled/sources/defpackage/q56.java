package defpackage;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes9.dex */
public final class q56 extends c7 {
    public final Thread y;
    public final fgo z;

    public q56(fse fseVar, Thread thread, fgo fgoVar) {
        super(fseVar, true);
        this.y = thread;
        this.z = fgoVar;
    }

    @Override // kotlinx.coroutines.c
    public final void p(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.y;
        if (jl40.l(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
