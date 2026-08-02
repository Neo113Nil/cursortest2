package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public final class abt extends wnc implements RunnableFuture {
    public volatile zat h;

    public abt(Callable callable) {
        this.h = new zat(this, callable);
    }

    @Override // defpackage.v6
    public final void d() {
        zat zatVar;
        Object obj = this.a;
        if ((obj instanceof g6) && ((g6) obj).a && (zatVar = this.h) != null) {
            q qVar = zat.e;
            q qVar2 = zat.d;
            Runnable runnable = (Runnable) zatVar.get();
            if (runnable instanceof Thread) {
                cxe cxeVar = new cxe(zatVar);
                cxe.a(cxeVar, Thread.currentThread());
                if (zatVar.compareAndSet(runnable, cxeVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) zatVar.getAndSet(qVar2)) == qVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.h = null;
    }

    @Override // defpackage.v6
    public final String j() {
        zat zatVar = this.h;
        if (zatVar == null) {
            return super.j();
        }
        return "task=[" + zatVar + "]";
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
