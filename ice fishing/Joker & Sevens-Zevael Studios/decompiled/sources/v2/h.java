package v2;

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
import u.l0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h implements h7.a {

    /* renamed from: j, reason: collision with root package name */
    public static final boolean f7201j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f7202k = Logger.getLogger(h.class.getName());

    /* renamed from: l, reason: collision with root package name */
    public static final l0 f7203l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f7204m;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f7205g;

    /* renamed from: h, reason: collision with root package name */
    public volatile d f7206h;

    /* renamed from: i, reason: collision with root package name */
    public volatile g f7207i;

    static {
        l0 fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, ka.a.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "i"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "h"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "g"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f7203l = fVar;
        if (th != null) {
            f7202k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7204m = new Object();
    }

    public static void d(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f7207i;
        } while (!f7203l.h(hVar, gVar, g.f7198c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f7199a;
            if (thread != null) {
                gVar.f7199a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f7200b;
        }
        hVar.c();
        do {
            dVar2 = hVar.f7206h;
        } while (!f7203l.f(hVar, dVar2, d.f7189d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f7192c;
            dVar.f7192c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f7192c;
            e(dVar3.f7190a, dVar3.f7191b);
            dVar3 = dVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f7202k.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f7186b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f7188a);
        }
        if (obj == f7204m) {
            return null;
        }
        return obj;
    }

    public static Object g(h hVar) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // h7.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f7206h;
        d dVar2 = d.f7189d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f7192c = dVar;
                if (f7203l.f(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f7206h;
                }
            } while (dVar != dVar2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g8 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g8 == this ? "this future" : String.valueOf(g8));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f7205g;
        if (obj == null) {
            if (f7203l.g(this, obj, f7201j ? new a(new CancellationException("Future.cancel() was called."), z10) : z10 ? a.f7183c : a.f7184d)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        g gVar = g.f7198c;
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f7205g;
        if (obj != null) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f7207i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    l0 l0Var = f7203l;
                    l0Var.n(gVar3, gVar2);
                    if (l0Var.h(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f7205g;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(gVar3);
                    } else {
                        gVar2 = this.f7207i;
                    }
                } while (gVar2 != gVar);
            }
            return f(this.f7205g);
        }
        while (nanos > 0) {
            Object obj3 = this.f7205g;
            if (obj3 != null) {
                return f(obj3);
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
            boolean z10 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = i10 + convert + " " + lowerCase;
                if (z10) {
                    str2 = a4.d.i(str2, ",");
                }
                i10 = a4.d.i(str2, " ");
            }
            if (z10) {
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
        gVar.f7199a = null;
        while (true) {
            g gVar2 = this.f7207i;
            if (gVar2 == g.f7198c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f7200b;
                if (gVar2.f7199a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f7200b = gVar4;
                    if (gVar3.f7199a == null) {
                        break;
                    }
                } else if (!f7203l.h(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7205g instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7205g != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f7205g instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
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

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        g gVar = g.f7198c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7205g;
            if (obj2 != null) {
                return f(obj2);
            }
            g gVar2 = this.f7207i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    l0 l0Var = f7203l;
                    l0Var.n(gVar3, gVar2);
                    if (l0Var.h(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7205g;
                            } else {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    gVar2 = this.f7207i;
                } while (gVar2 != gVar);
            }
            return f(this.f7205g);
        }
        throw new InterruptedException();
    }
}
