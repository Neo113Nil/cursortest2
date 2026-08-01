package t;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4353d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final h0.f f4354f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f4355g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f4356a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f4357b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f4358c;

    static {
        h0.f eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f4354f = eVar;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4355g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f4358c;
        } while (!f4354f.e(gVar, fVar, f.f4350c));
        while (fVar != null) {
            Thread thread = fVar.f4351a;
            if (thread != null) {
                fVar.f4351a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f4352b;
        }
        do {
            cVar = gVar.f4357b;
        } while (!f4354f.c(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f4346a;
            cVar.f4346a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f4346a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0347a) {
            CancellationException cancellationException = ((C0347a) obj).f4344a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0348b) {
            ((AbstractC0348b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f4355g) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d2 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d2 == this ? "this future" : String.valueOf(d2));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f4356a;
        if (obj != null) {
            return false;
        }
        if (!f4354f.d(this, obj, f4353d ? new C0347a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C0347a.f4342b : C0347a.f4343c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f4351a = null;
        while (true) {
            f fVar2 = this.f4358c;
            if (fVar2 == f.f4350c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f4352b;
                if (fVar2.f4351a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f4352b = fVar4;
                    if (fVar3.f4351a == null) {
                        break;
                    }
                } else if (!f4354f.e(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4356a;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f4358c;
            f fVar2 = f.f4350c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    h0.f fVar4 = f4354f;
                    fVar4.x(fVar3, fVar);
                    if (fVar4.e(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4356a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar = this.f4358c;
                    }
                } while (fVar != fVar2);
            }
            return c(this.f4356a);
        }
        while (nanos > 0) {
            Object obj3 = this.f4356a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String gVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String f2 = D1.h.f(str, " (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = f2 + convert + " " + lowerCase;
                if (z2) {
                    str2 = D1.h.f(str2, ",");
                }
                f2 = D1.h.f(str2, " ");
            }
            if (z2) {
                f2 = f2 + nanos2 + " nanoseconds ";
            }
            str = D1.h.f(f2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(D1.h.f(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + gVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4356a instanceof C0347a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f4356a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4356a instanceof C0347a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
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
        if (!Thread.interrupted()) {
            Object obj2 = this.f4356a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f4358c;
            f fVar2 = f.f4350c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    h0.f fVar4 = f4354f;
                    fVar4.x(fVar3, fVar);
                    if (fVar4.e(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4356a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f4358c;
                } while (fVar != fVar2);
            }
            return c(this.f4356a);
        }
        throw new InterruptedException();
    }
}
