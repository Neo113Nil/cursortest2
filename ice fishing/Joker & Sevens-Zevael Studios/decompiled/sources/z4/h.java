package z4;

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

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h implements h7.a {

    /* renamed from: j, reason: collision with root package name */
    public static final boolean f9125j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f9126k = Logger.getLogger(h.class.getName());

    /* renamed from: l, reason: collision with root package name */
    public static final u5.d f9127l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f9128m;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f9129g;

    /* renamed from: h, reason: collision with root package name */
    public volatile c f9130h;

    /* renamed from: i, reason: collision with root package name */
    public volatile g f9131i;

    static {
        u5.d fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, ka.a.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "i"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "h"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "g"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f9127l = fVar;
        if (th != null) {
            f9126k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f9128m = new Object();
    }

    public static void c(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f9131i;
            if (f9127l.d(hVar, gVar, g.f9122c)) {
                while (gVar != null) {
                    Thread thread = gVar.f9123a;
                    if (thread != null) {
                        gVar.f9123a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f9124b;
                }
                do {
                    cVar = hVar.f9130h;
                } while (!f9127l.b(hVar, cVar, c.f9111d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f9114c;
                    cVar3.f9114c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f9114c;
                    Runnable runnable = cVar2.f9112a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f9120g;
                        if (hVar.f9129g == eVar) {
                            if (f9127l.c(hVar, eVar, f(eVar.f9121h))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, cVar2.f9113b);
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
        } catch (RuntimeException e10) {
            f9126k.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f9108b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f9110a);
        }
        if (obj == f9128m) {
            return null;
        }
        return obj;
    }

    public static Object f(h7.a aVar) {
        Object obj;
        if (aVar instanceof h) {
            Object obj2 = ((h) aVar).f9129g;
            if (!(obj2 instanceof a)) {
                return obj2;
            }
            a aVar2 = (a) obj2;
            return aVar2.f9107a ? aVar2.f9108b != null ? new a(aVar2.f9108b, false) : a.f9106d : obj2;
        }
        boolean isCancelled = aVar.isCancelled();
        boolean z10 = true;
        if ((!f9125j) && isCancelled) {
            return a.f9106d;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = aVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = z10;
                } catch (Throwable th) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e10) {
                if (isCancelled) {
                    return new a(e10, false);
                }
                return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
            } catch (ExecutionException e11) {
                return new b(e11.getCause());
            } catch (Throwable th2) {
                return new b(th2);
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f9128m : obj;
    }

    @Override // h7.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f9130h;
        c cVar2 = c.f9111d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f9114c = cVar;
                if (f9127l.b(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f9130h;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e10.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb.append("FAILURE, cause=[");
                sb.append(e11.getCause());
                sb.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f9129g;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        a aVar = f9125j ? new a(new CancellationException("Future.cancel() was called."), z10) : z10 ? a.f9105c : a.f9106d;
        h hVar = this;
        boolean z11 = false;
        while (true) {
            if (f9127l.c(hVar, obj, aVar)) {
                c(hVar);
                if (!(obj instanceof e)) {
                    break;
                }
                h7.a aVar2 = ((e) obj).f9121h;
                if (!(aVar2 instanceof h)) {
                    aVar2.cancel(z10);
                    break;
                }
                hVar = (h) aVar2;
                obj = hVar.f9129g;
                if (!(obj == null) && !(obj instanceof e)) {
                    break;
                }
                z11 = true;
            } else {
                obj = hVar.f9129g;
                if (!(obj instanceof e)) {
                    return z11;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f9129g;
        if (obj instanceof e) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            h7.a aVar = ((e) obj).f9121h;
            sb.append(aVar == this ? "this future" : String.valueOf(aVar));
            sb.append("]");
            return sb.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        boolean z10;
        g gVar = g.f9122c;
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f9129g;
        if ((obj != null) && (!(obj instanceof e))) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f9131i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                z10 = true;
                do {
                    u5.d dVar = f9127l;
                    dVar.h(gVar3, gVar2);
                    if (dVar.d(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f9129g;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(gVar3);
                    } else {
                        gVar2 = this.f9131i;
                    }
                } while (gVar2 != gVar);
            }
            return e(this.f9129g);
        }
        z10 = true;
        while (nanos > 0) {
            Object obj3 = this.f9129g;
            if ((obj3 != null ? z10 : false) && (!(obj3 instanceof e))) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String hVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String i10 = a4.d.i(str, " (plus ");
            long j6 = -nanos;
            long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(convert);
            boolean z11 = (convert == 0 || nanos2 > 1000) ? z10 : false;
            if (convert > 0) {
                String str2 = i10 + convert + " " + lowerCase;
                if (z11) {
                    str2 = a4.d.i(str2, ",");
                }
                i10 = a4.d.i(str2, " ");
            }
            if (z11) {
                i10 = i10 + nanos2 + " nanoseconds ";
            }
            str = a4.d.i(i10, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(a4.d.i(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + hVar);
    }

    public final void h(g gVar) {
        gVar.f9123a = null;
        while (true) {
            g gVar2 = this.f9131i;
            if (gVar2 == g.f9122c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f9124b;
                if (gVar2.f9123a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f9124b = gVar4;
                    if (gVar3.f9123a == null) {
                        break;
                    }
                } else if (!f9127l.d(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9129g instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f9129g != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f9129g instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = g();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
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
    public final Object get() {
        Object obj;
        g gVar = g.f9122c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f9129g;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return e(obj2);
            }
            g gVar2 = this.f9131i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    u5.d dVar = f9127l;
                    dVar.h(gVar3, gVar2);
                    if (dVar.d(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f9129g;
                            } else {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return e(obj);
                    }
                    gVar2 = this.f9131i;
                } while (gVar2 != gVar);
            }
            return e(this.f9129g);
        }
        throw new InterruptedException();
    }
}
