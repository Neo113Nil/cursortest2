package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class rlx extends flx implements RunnableFuture {
    public volatile zat h;

    public rlx(Callable callable) {
        this.h = new zat(this, callable);
    }

    @Override // defpackage.flx
    public final String c() {
        zat zatVar = this.h;
        return zatVar != null ? hrg.q("task=[", zatVar.toString(), "]") : super.c();
    }

    @Override // defpackage.flx
    public final void d() {
        zat zatVar;
        Object obj = this.a;
        if ((obj instanceof xkx) && ((xkx) obj).a && (zatVar = this.h) != null) {
            q qVar = zat.i;
            q qVar2 = zat.h;
            Runnable runnable = (Runnable) zatVar.get();
            if (runnable instanceof Thread) {
                mlx mlxVar = new mlx(zatVar);
                mlxVar.setExclusiveOwnerThread(Thread.currentThread());
                if (zatVar.compareAndSet(runnable, mlxVar)) {
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
