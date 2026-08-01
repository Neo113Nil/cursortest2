package t;

import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
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
public abstract class AbstractC4985g implements N3.a {

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f40519w = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f40520x = Logger.getLogger(AbstractC4985g.class.getName());

    /* renamed from: y, reason: collision with root package name */
    public static final com.bumptech.glide.f f40521y;

    /* renamed from: z, reason: collision with root package name */
    public static final Object f40522z;

    /* renamed from: n, reason: collision with root package name */
    public volatile Object f40523n;

    /* renamed from: u, reason: collision with root package name */
    public volatile C4981c f40524u;

    /* renamed from: v, reason: collision with root package name */
    public volatile C4984f f40525v;

    static {
        com.bumptech.glide.f c4983e;
        try {
            c4983e = new C4982d(AtomicReferenceFieldUpdater.newUpdater(C4984f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C4984f.class, C4984f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4985g.class, C4984f.class, "v"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4985g.class, C4981c.class, "u"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4985g.class, Object.class, "n"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c4983e = new C4983e();
        }
        f40521y = c4983e;
        if (th != null) {
            f40520x.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f40522z = new Object();
    }

    public static void d(AbstractC4985g abstractC4985g) {
        C4984f c4984f;
        C4981c c4981c;
        C4981c c4981c2;
        C4981c c4981c3;
        do {
            c4984f = abstractC4985g.f40525v;
        } while (!f40521y.e(abstractC4985g, c4984f, C4984f.f40516c));
        while (true) {
            c4981c = null;
            if (c4984f == null) {
                break;
            }
            Thread thread = c4984f.f40517a;
            if (thread != null) {
                c4984f.f40517a = null;
                LockSupport.unpark(thread);
            }
            c4984f = c4984f.f40518b;
        }
        abstractC4985g.c();
        do {
            c4981c2 = abstractC4985g.f40524u;
        } while (!f40521y.c(abstractC4985g, c4981c2, C4981c.f40507d));
        while (true) {
            c4981c3 = c4981c;
            c4981c = c4981c2;
            if (c4981c == null) {
                break;
            }
            c4981c2 = c4981c.f40510c;
            c4981c.f40510c = c4981c3;
        }
        while (c4981c3 != null) {
            C4981c c4981c4 = c4981c3.f40510c;
            e(c4981c3.f40508a, c4981c3.f40509b);
            c4981c3 = c4981c4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e9) {
            f40520x.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e9);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof C4979a) {
            CancellationException cancellationException = ((C4979a) obj).f40505b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C4980b) {
            throw new ExecutionException(((C4980b) obj).f40506a);
        }
        if (obj == f40522z) {
            return null;
        }
        return obj;
    }

    public static Object g(AbstractC4985g abstractC4985g) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = abstractC4985g.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // N3.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        C4981c c4981c = this.f40524u;
        C4981c c4981c2 = C4981c.f40507d;
        if (c4981c != c4981c2) {
            C4981c c4981c3 = new C4981c(runnable, executor);
            do {
                c4981c3.f40510c = c4981c;
                if (f40521y.c(this, c4981c, c4981c3)) {
                    return;
                } else {
                    c4981c = this.f40524u;
                }
            } while (c4981c != c4981c2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g4 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g4 == this ? "this future" : String.valueOf(g4));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f40523n;
        if (obj != null) {
            return false;
        }
        if (!f40521y.d(this, obj, f40519w ? new C4979a(z3, new CancellationException("Future.cancel() was called.")) : z3 ? C4979a.f40502c : C4979a.f40503d)) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j6);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f40523n;
        if (obj != null) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C4984f c4984f = this.f40525v;
            C4984f c4984f2 = C4984f.f40516c;
            if (c4984f != c4984f2) {
                C4984f c4984f3 = new C4984f();
                do {
                    com.bumptech.glide.f fVar = f40521y;
                    fVar.u(c4984f3, c4984f);
                    if (fVar.e(this, c4984f, c4984f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(c4984f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f40523n;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(c4984f3);
                    } else {
                        c4984f = this.f40525v;
                    }
                } while (c4984f != c4984f2);
            }
            return f(this.f40523n);
        }
        while (nanos > 0) {
            Object obj3 = this.f40523n;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC4985g = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j6 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String f3 = AbstractC4404f.f(str, " (plus ");
            long j9 = -nanos;
            long convert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
            long nanos2 = j9 - timeUnit.toNanos(convert);
            boolean z3 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = f3 + convert + " " + lowerCase;
                if (z3) {
                    str2 = AbstractC4404f.f(str2, ",");
                }
                f3 = AbstractC4404f.f(str2, " ");
            }
            if (z3) {
                f3 = f3 + nanos2 + " nanoseconds ";
            }
            str = AbstractC4404f.f(f3, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC4404f.f(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC4404f.g(str, " for ", abstractC4985g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(C4984f c4984f) {
        c4984f.f40517a = null;
        while (true) {
            C4984f c4984f2 = this.f40525v;
            if (c4984f2 == C4984f.f40516c) {
                return;
            }
            C4984f c4984f3 = null;
            while (c4984f2 != null) {
                C4984f c4984f4 = c4984f2.f40518b;
                if (c4984f2.f40517a != null) {
                    c4984f3 = c4984f2;
                } else if (c4984f3 != null) {
                    c4984f3.f40518b = c4984f4;
                    if (c4984f3.f40517a == null) {
                        break;
                    }
                } else if (!f40521y.e(this, c4984f2, c4984f4)) {
                    break;
                }
                c4984f2 = c4984f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f40523n instanceof C4979a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f40523n != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = f40522z;
        }
        if (!f40521y.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!f40521y.d(this, null, new C4980b(th))) {
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
        if (this.f40523n instanceof C4979a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e9) {
                str = "Exception thrown from implementation: " + e9.getClass();
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
        if (!Thread.interrupted()) {
            Object obj2 = this.f40523n;
            if (obj2 != null) {
                return f(obj2);
            }
            C4984f c4984f = this.f40525v;
            C4984f c4984f2 = C4984f.f40516c;
            if (c4984f != c4984f2) {
                C4984f c4984f3 = new C4984f();
                do {
                    com.bumptech.glide.f fVar = f40521y;
                    fVar.u(c4984f3, c4984f);
                    if (fVar.e(this, c4984f, c4984f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f40523n;
                            } else {
                                i(c4984f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    c4984f = this.f40525v;
                } while (c4984f != c4984f2);
            }
            return f(this.f40523n);
        }
        throw new InterruptedException();
    }
}
