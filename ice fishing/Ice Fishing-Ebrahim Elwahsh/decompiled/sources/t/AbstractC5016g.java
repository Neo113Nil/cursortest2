package t;

import com.google.android.gms.internal.ads.CL;
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

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5016g implements J3.a {

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f40544w = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f40545x = Logger.getLogger(AbstractC5016g.class.getName());

    /* renamed from: y, reason: collision with root package name */
    public static final com.bumptech.glide.e f40546y;

    /* renamed from: z, reason: collision with root package name */
    public static final Object f40547z;

    /* renamed from: n, reason: collision with root package name */
    public volatile Object f40548n;

    /* renamed from: u, reason: collision with root package name */
    public volatile C5012c f40549u;

    /* renamed from: v, reason: collision with root package name */
    public volatile C5015f f40550v;

    static {
        com.bumptech.glide.e c5014e;
        try {
            c5014e = new C5013d(AtomicReferenceFieldUpdater.newUpdater(C5015f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C5015f.class, C5015f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5016g.class, C5015f.class, "v"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5016g.class, C5012c.class, "u"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5016g.class, Object.class, "n"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c5014e = new C5014e(11);
        }
        f40546y = c5014e;
        if (th != null) {
            f40545x.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f40547z = new Object();
    }

    public static void d(AbstractC5016g abstractC5016g) {
        C5015f c5015f;
        C5012c c5012c;
        C5012c c5012c2;
        C5012c c5012c3;
        do {
            c5015f = abstractC5016g.f40550v;
        } while (!f40546y.g(abstractC5016g, c5015f, C5015f.f40541c));
        while (true) {
            c5012c = null;
            if (c5015f == null) {
                break;
            }
            Thread thread = c5015f.f40542a;
            if (thread != null) {
                c5015f.f40542a = null;
                LockSupport.unpark(thread);
            }
            c5015f = c5015f.f40543b;
        }
        abstractC5016g.b();
        do {
            c5012c2 = abstractC5016g.f40549u;
        } while (!f40546y.c(abstractC5016g, c5012c2, C5012c.f40533d));
        while (true) {
            c5012c3 = c5012c;
            c5012c = c5012c2;
            if (c5012c == null) {
                break;
            }
            c5012c2 = c5012c.f40536c;
            c5012c.f40536c = c5012c3;
        }
        while (c5012c3 != null) {
            C5012c c5012c4 = c5012c3.f40536c;
            e(c5012c3.f40534a, c5012c3.f40535b);
            c5012c3 = c5012c4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f40545x.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof C5010a) {
            CancellationException cancellationException = ((C5010a) obj).f40531b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C5011b) {
            throw new ExecutionException(((C5011b) obj).f40532a);
        }
        if (obj == f40547z) {
            return null;
        }
        return obj;
    }

    public static Object g(AbstractC5016g abstractC5016g) {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = abstractC5016g.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object g9 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g9 == this ? "this future" : String.valueOf(g9));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e9) {
            sb.append("FAILURE, cause=[");
            sb.append(e9.getCause());
            sb.append("]");
        }
    }

    @Override // J3.a
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        C5012c c5012c = this.f40549u;
        C5012c c5012c2 = C5012c.f40533d;
        if (c5012c != c5012c2) {
            C5012c c5012c3 = new C5012c(runnable, executor);
            do {
                c5012c3.f40536c = c5012c;
                if (f40546y.c(this, c5012c, c5012c3)) {
                    return;
                } else {
                    c5012c = this.f40549u;
                }
            } while (c5012c != c5012c2);
        }
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        Object obj = this.f40548n;
        if (obj != null) {
            return false;
        }
        if (!f40546y.e(this, obj, f40544w ? new C5010a(z8, new CancellationException("Future.cancel() was called.")) : z8 ? C5010a.f40528c : C5010a.f40529d)) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j9);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f40548n;
        if (obj != null) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C5015f c5015f = this.f40550v;
            C5015f c5015f2 = C5015f.f40541c;
            if (c5015f != c5015f2) {
                C5015f c5015f3 = new C5015f();
                do {
                    com.bumptech.glide.e eVar = f40546y;
                    eVar.y(c5015f3, c5015f);
                    if (eVar.g(this, c5015f, c5015f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(c5015f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f40548n;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(c5015f3);
                    } else {
                        c5015f = this.f40550v;
                    }
                } while (c5015f != c5015f2);
            }
            return f(this.f40548n);
        }
        while (nanos > 0) {
            Object obj3 = this.f40548n;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC5016g = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j9 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String j10 = CL.j(str, " (plus ");
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            boolean z8 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = j10 + convert + " " + lowerCase;
                if (z8) {
                    str2 = CL.j(str2, ",");
                }
                j10 = CL.j(str2, " ");
            }
            if (z8) {
                j10 = j10 + nanos2 + " nanoseconds ";
            }
            str = CL.j(j10, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(CL.j(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(CL.k(str, " for ", abstractC5016g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(C5015f c5015f) {
        c5015f.f40542a = null;
        while (true) {
            C5015f c5015f2 = this.f40550v;
            if (c5015f2 == C5015f.f40541c) {
                return;
            }
            C5015f c5015f3 = null;
            while (c5015f2 != null) {
                C5015f c5015f4 = c5015f2.f40543b;
                if (c5015f2.f40542a != null) {
                    c5015f3 = c5015f2;
                } else if (c5015f3 != null) {
                    c5015f3.f40543b = c5015f4;
                    if (c5015f3.f40542a == null) {
                        break;
                    }
                } else if (!f40546y.g(this, c5015f2, c5015f4)) {
                    break;
                }
                c5015f2 = c5015f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f40548n instanceof C5010a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f40548n != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = f40547z;
        }
        if (!f40546y.e(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!f40546y.e(this, null, new C5011b(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f40548n instanceof C5010a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e6) {
                str = "Exception thrown from implementation: " + e6.getClass();
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

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f40548n;
            if (obj2 != null) {
                return f(obj2);
            }
            C5015f c5015f = this.f40550v;
            C5015f c5015f2 = C5015f.f40541c;
            if (c5015f != c5015f2) {
                C5015f c5015f3 = new C5015f();
                do {
                    com.bumptech.glide.e eVar = f40546y;
                    eVar.y(c5015f3, c5015f);
                    if (eVar.g(this, c5015f, c5015f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f40548n;
                            } else {
                                i(c5015f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    c5015f = this.f40550v;
                } while (c5015f != c5015f2);
            }
            return f(this.f40548n);
        }
        throw new InterruptedException();
    }
}
