package l;

import a.AbstractC0069a;
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

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractFutureC0196g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2687d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f2688e = Logger.getLogger(AbstractFutureC0196g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0069a f2689f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2690g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2691a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0192c f2692b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0195f f2693c;

    static {
        AbstractC0069a c0194e;
        try {
            c0194e = new C0193d(AtomicReferenceFieldUpdater.newUpdater(C0195f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0195f.class, C0195f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0196g.class, C0195f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0196g.class, C0192c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0196g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0194e = new C0194e();
        }
        f2689f = c0194e;
        if (th != null) {
            f2688e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2690g = new Object();
    }

    public static void b(AbstractFutureC0196g abstractFutureC0196g) {
        C0195f c0195f;
        C0192c c0192c;
        do {
            c0195f = abstractFutureC0196g.f2693c;
        } while (!f2689f.e(abstractFutureC0196g, c0195f, C0195f.f2684c));
        while (c0195f != null) {
            Thread thread = c0195f.f2685a;
            if (thread != null) {
                c0195f.f2685a = null;
                LockSupport.unpark(thread);
            }
            c0195f = c0195f.f2686b;
        }
        do {
            c0192c = abstractFutureC0196g.f2692b;
        } while (!f2689f.c(abstractFutureC0196g, c0192c));
        C0192c c0192c2 = null;
        while (c0192c != null) {
            C0192c c0192c3 = c0192c.f2678a;
            c0192c.f2678a = c0192c2;
            c0192c2 = c0192c;
            c0192c = c0192c3;
        }
        while (c0192c2 != null) {
            c0192c2 = c0192c2.f2678a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f2688e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0190a) {
            CancellationException cancellationException = ((C0190a) obj).f2676a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0191b) {
            ((AbstractC0191b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f2690g) {
            return null;
        }
        return obj;
    }

    public static Object d(AbstractFutureC0196g abstractFutureC0196g) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = abstractFutureC0196g.get();
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
        Object obj = this.f2691a;
        if (obj != null) {
            return false;
        }
        if (!f2689f.d(this, obj, f2687d ? new C0190a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C0190a.f2674b : C0190a.f2675c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(C0195f c0195f) {
        c0195f.f2685a = null;
        while (true) {
            C0195f c0195f2 = this.f2693c;
            if (c0195f2 == C0195f.f2684c) {
                return;
            }
            C0195f c0195f3 = null;
            while (c0195f2 != null) {
                C0195f c0195f4 = c0195f2.f2686b;
                if (c0195f2.f2685a != null) {
                    c0195f3 = c0195f2;
                } else if (c0195f3 != null) {
                    c0195f3.f2686b = c0195f4;
                    if (c0195f3.f2685a == null) {
                        break;
                    }
                } else if (!f2689f.e(this, c0195f2, c0195f4)) {
                    break;
                }
                c0195f2 = c0195f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f2691a;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0195f c0195f = this.f2693c;
            C0195f c0195f2 = C0195f.f2684c;
            if (c0195f != c0195f2) {
                C0195f c0195f3 = new C0195f();
                do {
                    AbstractC0069a abstractC0069a = f2689f;
                    abstractC0069a.y(c0195f3, c0195f);
                    if (abstractC0069a.e(this, c0195f, c0195f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(c0195f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2691a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(c0195f3);
                    } else {
                        c0195f = this.f2693c;
                    }
                } while (c0195f != c0195f2);
            }
            return c(this.f2691a);
        }
        while (nanos > 0) {
            Object obj3 = this.f2691a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFutureC0196g = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z2) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z2) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + abstractFutureC0196g);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2691a instanceof C0190a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2691a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f2691a instanceof C0190a) {
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
            Object obj2 = this.f2691a;
            if (obj2 != null) {
                return c(obj2);
            }
            C0195f c0195f = this.f2693c;
            C0195f c0195f2 = C0195f.f2684c;
            if (c0195f != c0195f2) {
                C0195f c0195f3 = new C0195f();
                do {
                    AbstractC0069a abstractC0069a = f2689f;
                    abstractC0069a.y(c0195f3, c0195f);
                    if (abstractC0069a.e(this, c0195f, c0195f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2691a;
                            } else {
                                e(c0195f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    c0195f = this.f2693c;
                } while (c0195f != c0195f2);
            }
            return c(this.f2691a);
        }
        throw new InterruptedException();
    }
}
