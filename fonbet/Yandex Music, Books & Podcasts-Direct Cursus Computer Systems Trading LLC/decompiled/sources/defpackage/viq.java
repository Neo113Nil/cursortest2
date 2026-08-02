package defpackage;

import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class viq extends piq implements Future {
    public efo d;
    public Exception e;
    public Object f;
    public jzc g;

    @Override // defpackage.piq
    public boolean c() {
        jzc jzcVar;
        if (!super.c()) {
            return false;
        }
        synchronized (this) {
            this.e = new CancellationException();
            h();
            jzcVar = this.g;
            this.g = null;
        }
        g(jzcVar);
        return true;
    }

    @Override // defpackage.piq
    public final boolean e() {
        throw null;
    }

    @Override // defpackage.piq
    public final piq f(piq piqVar) {
        super.f(piqVar);
        return this;
    }

    public final void g(jzc jzcVar) {
        if (jzcVar != null) {
            jzcVar.s(this.e, this.f);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        synchronized (this) {
            if (!isCancelled() && !this.a) {
                if (this.d == null) {
                    efo efoVar = new efo(7, false);
                    efoVar.b = new Semaphore(0);
                    this.d = efoVar;
                }
                efo efoVar2 = this.d;
                Semaphore semaphore = (Semaphore) efoVar2.b;
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                long convert = timeUnit2.convert(j, timeUnit);
                xfs g = xfs.g(Thread.currentThread());
                efo efoVar3 = g.a;
                g.a = efoVar2;
                Semaphore semaphore2 = g.b;
                try {
                    if (!semaphore.tryAcquire()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        while (true) {
                            Runnable remove = g.remove();
                            if (remove != null) {
                                remove.run();
                            } else {
                                if (!semaphore2.tryAcquire(Math.max(1, semaphore2.availablePermits()), convert, timeUnit2)) {
                                    break;
                                }
                                if (!semaphore.tryAcquire()) {
                                    if (System.currentTimeMillis() - currentTimeMillis >= convert) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        throw new TimeoutException();
                    }
                    Exception exc = this.e;
                    if (exc == null) {
                        return this.f;
                    }
                    throw new ExecutionException(exc);
                } finally {
                    g.a = efoVar3;
                }
            }
            Exception exc2 = this.e;
            if (exc2 != null) {
                throw new ExecutionException(exc2);
            }
            return this.f;
        }
    }

    public final void h() {
        efo efoVar = this.d;
        if (efoVar != null) {
            ((Semaphore) efoVar.b).release();
            WeakHashMap weakHashMap = xfs.c;
            synchronized (weakHashMap) {
                try {
                    for (xfs xfsVar : weakHashMap.values()) {
                        if (xfsVar.a == efoVar) {
                            xfsVar.b.release();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.d = null;
        }
    }

    public viq i(jzc jzcVar) {
        jzc jzcVar2;
        synchronized (this) {
            try {
                this.g = jzcVar;
                jzcVar2 = null;
                if (!this.a) {
                    if (isCancelled()) {
                    }
                }
                jzc jzcVar3 = this.g;
                this.g = null;
                jzcVar2 = jzcVar3;
            } catch (Throwable th) {
                throw th;
            }
        }
        g(jzcVar2);
        return this;
    }

    public final void j(ws1 ws1Var) {
        ws1Var.i(new uiq(0, this));
        super.f(ws1Var);
    }

    public final boolean k(Exception exc, Object obj) {
        synchronized (this) {
            try {
                if (!super.e()) {
                    return false;
                }
                this.f = obj;
                this.e = exc;
                h();
                jzc jzcVar = this.g;
                this.g = null;
                g(jzcVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(piq piqVar) {
        super.f(piqVar);
    }

    public final void m(piq piqVar) {
        super.f(piqVar);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        synchronized (this) {
            if (!isCancelled() && !this.a) {
                if (this.d == null) {
                    efo efoVar = new efo(7, false);
                    efoVar.b = new Semaphore(0);
                    this.d = efoVar;
                }
                efo efoVar2 = this.d;
                Semaphore semaphore = (Semaphore) efoVar2.b;
                xfs g = xfs.g(Thread.currentThread());
                efo efoVar3 = g.a;
                g.a = efoVar2;
                Semaphore semaphore2 = g.b;
                try {
                    if (!semaphore.tryAcquire()) {
                        while (true) {
                            Runnable remove = g.remove();
                            if (remove == null) {
                                semaphore2.acquire(Math.max(1, semaphore2.availablePermits()));
                                if (semaphore.tryAcquire()) {
                                    break;
                                }
                            } else {
                                remove.run();
                            }
                        }
                    }
                    Exception exc = this.e;
                    if (exc == null) {
                        return this.f;
                    }
                    throw new ExecutionException(exc);
                } finally {
                    g.a = efoVar3;
                }
            }
            Exception exc2 = this.e;
            if (exc2 == null) {
                return this.f;
            }
            throw new ExecutionException(exc2);
        }
    }
}
