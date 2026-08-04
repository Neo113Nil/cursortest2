package com.gamericefishpro.space.w6;

import com.gamericefishpro.space.t0.y0;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements com.gamericefishpro.space.va.b {
    public static final boolean v = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger w = Logger.getLogger(h.class.getName());
    public static final com.gamericefishpro.space.d9.h y;
    public static final Object z;
    public volatile Object d;
    public volatile c e;
    public volatile g i;

    static {
        com.gamericefishpro.space.d9.h fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, com.gamericefishpro.space.jf.a.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "i"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "e"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        y = fVar;
        if (th != null) {
            w.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        z = new Object();
    }

    public static void c(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.i;
            if (y.o(hVar, gVar, g.c)) {
                while (gVar != null) {
                    Thread thread = gVar.a;
                    if (thread != null) {
                        gVar.a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.b;
                }
                do {
                    cVar = hVar.e;
                } while (!y.m(hVar, cVar, c.d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.c;
                    cVar3.c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.c;
                    Runnable runnable = cVar2.a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.d;
                        if (hVar.d == eVar) {
                            if (y.n(hVar, eVar, f(eVar.e))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, cVar2.b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            w.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th = ((a) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).a);
        }
        if (obj == z) {
            return null;
        }
        return obj;
    }

    public static Object f(com.gamericefishpro.space.va.b bVar) {
        Object obj;
        if (bVar instanceof h) {
            Object obj2 = ((h) bVar).d;
            if (!(obj2 instanceof a)) {
                return obj2;
            }
            a aVar = (a) obj2;
            if (aVar.a) {
                return aVar.b != null ? new a(aVar.b, false) : a.d;
            }
            return obj2;
        }
        boolean zIsCancelled = bVar.isCancelled();
        boolean z2 = true;
        if ((!v) && zIsCancelled) {
            return a.d;
        }
        boolean z3 = false;
        while (true) {
            try {
                try {
                    obj = bVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z3 = z2;
                } catch (Throwable th) {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e) {
                if (zIsCancelled) {
                    return new a(e, false);
                }
                return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e));
            } catch (ExecutionException e2) {
                return new b(e2.getCause());
            } catch (Throwable th2) {
                return new b(th2);
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? z : obj;
    }

    @Override // com.gamericefishpro.space.va.b
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.e;
        c cVar2 = c.d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.c = cVar;
                if (y.m(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.e;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        a aVar;
        Object obj = this.d;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        if (v) {
            aVar = new a(new CancellationException("Future.cancel() was called."), z2);
        } else {
            aVar = z2 ? a.c : a.d;
        }
        h hVar = this;
        boolean z3 = false;
        while (true) {
            if (y.n(hVar, obj, aVar)) {
                c(hVar);
                if (!(obj instanceof e)) {
                    break;
                }
                com.gamericefishpro.space.va.b bVar = ((e) obj).e;
                if (!(bVar instanceof h)) {
                    bVar.cancel(z2);
                    break;
                }
                hVar = (h) bVar;
                obj = hVar.d;
                if (!(obj == null) && !(obj instanceof e)) {
                    break;
                }
                z3 = true;
            } else {
                obj = hVar.d;
                if (!(obj instanceof e)) {
                    return z3;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.d;
        if (obj instanceof e) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            com.gamericefishpro.space.va.b bVar = ((e) obj).e;
            return y0.j(sb, bVar == this ? "this future" : String.valueOf(bVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z2;
        g gVar = g.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.d;
        if ((obj != null) && (!(obj instanceof e))) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                z2 = true;
                while (true) {
                    com.gamericefishpro.space.d9.h hVar = y;
                    hVar.G(gVar3, gVar2);
                    if (hVar.o(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.d;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(gVar3);
                        break;
                    }
                    gVar2 = this.i;
                    if (gVar2 == gVar) {
                    }
                }
            }
            return e(this.d);
        }
        z2 = true;
        while (nanos > 0) {
            Object obj3 = this.d;
            if ((obj3 != null ? z2 : false) && (!(obj3 instanceof e))) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strH = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strH2 = com.gamericefishpro.space.m5.a.h(strH, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z3 = (jConvert == 0 || nanos2 > 1000) ? z2 : false;
            if (jConvert > 0) {
                String strH3 = strH2 + jConvert + " " + lowerCase;
                if (z3) {
                    strH3 = com.gamericefishpro.space.m5.a.h(strH3, ",");
                }
                strH2 = com.gamericefishpro.space.m5.a.h(strH3, " ");
            }
            if (z3) {
                strH2 = strH2 + nanos2 + " nanoseconds ";
            }
            strH = com.gamericefishpro.space.m5.a.h(strH2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(com.gamericefishpro.space.m5.a.h(strH, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strH + " for " + string);
    }

    public final void h(g gVar) {
        gVar.a = null;
        while (true) {
            g gVar2 = this.i;
            if (gVar2 == g.c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.b;
                if (gVar2.a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.b = gVar4;
                    if (gVar3.a == null) {
                    }
                } else if (!y.o(this, gVar2, gVar4)) {
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.d;
        return (!(obj instanceof e)) & (obj != null);
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.d instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e) {
                strG = "Exception thrown from implementation: " + e.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strG);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        g gVar = g.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.d;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return e(obj2);
            }
            g gVar2 = this.i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    com.gamericefishpro.space.d9.h hVar = y;
                    hVar.G(gVar3, gVar2);
                    if (hVar.o(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.d;
                            } else {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return e(obj);
                    }
                    gVar2 = this.i;
                } while (gVar2 != gVar);
            }
            return e(this.d);
        }
        throw new InterruptedException();
    }
}
