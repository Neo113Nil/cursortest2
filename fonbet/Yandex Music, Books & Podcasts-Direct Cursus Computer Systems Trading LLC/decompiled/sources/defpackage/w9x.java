package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class w9x extends w8x implements RunnableFuture {
    public volatile zat h;

    public w9x(Callable callable) {
        this.h = new zat(this, callable);
    }

    @Override // defpackage.j8x
    public final String c() {
        zat zatVar = this.h;
        return zatVar != null ? hrg.q("task=[", zatVar.toString(), "]") : super.c();
    }

    @Override // defpackage.j8x
    public final void d() {
        zat zatVar;
        Object obj = this.a;
        if ((obj instanceof z7x) && ((z7x) obj).a && (zatVar = this.h) != null) {
            q qVar = zat.g;
            q qVar2 = zat.f;
            Runnable runnable = (Runnable) zatVar.get();
            if (runnable instanceof Thread) {
                z8x z8xVar = new z8x(zatVar);
                z8xVar.setExclusiveOwnerThread(Thread.currentThread());
                if (zatVar.compareAndSet(runnable, z8xVar)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) zatVar.getAndSet(qVar2)) == qVar) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) zatVar.getAndSet(qVar2)) == qVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zat zatVar = this.h;
        if (zatVar != null) {
            zatVar.run();
        }
        this.h = null;
    }
}
