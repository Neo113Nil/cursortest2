package t;

import com.google.android.gms.internal.ads.Wv;
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
public abstract class AbstractC4984g implements P3.a {

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f40572w = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f40573x = Logger.getLogger(AbstractC4984g.class.getName());

    /* renamed from: y, reason: collision with root package name */
    public static final com.bumptech.glide.f f40574y;

    /* renamed from: z, reason: collision with root package name */
    public static final Object f40575z;

    /* renamed from: n, reason: collision with root package name */
    public volatile Object f40576n;

    /* renamed from: u, reason: collision with root package name */
    public volatile C4980c f40577u;

    /* renamed from: v, reason: collision with root package name */
    public volatile C4983f f40578v;

    static {
        com.bumptech.glide.f c4982e;
        try {
            c4982e = new C4981d(AtomicReferenceFieldUpdater.newUpdater(C4983f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C4983f.class, C4983f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4984g.class, C4983f.class, "v"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4984g.class, C4980c.class, "u"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4984g.class, Object.class, "n"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c4982e = new C4982e();
        }
        f40574y = c4982e;
        if (th != null) {
            f40573x.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f40575z = new Object();
    }

    public static void d(AbstractC4984g abstractC4984g) {
        C4983f c4983f;
        C4980c c4980c;
        C4980c c4980c2;
        C4980c c4980c3;
        do {
            c4983f = abstractC4984g.f40578v;
        } while (!f40574y.e(abstractC4984g, c4983f, C4983f.f40569c));
        while (true) {
            c4980c = null;
            if (c4983f == null) {
                break;
            }
            Thread thread = c4983f.f40570a;
            if (thread != null) {
                c4983f.f40570a = null;
                LockSupport.unpark(thread);
            }
            c4983f = c4983f.f40571b;
        }
        abstractC4984g.c();
        do {
            c4980c2 = abstractC4984g.f40577u;
        } while (!f40574y.c(abstractC4984g, c4980c2, C4980c.f40561d));
        while (true) {
            c4980c3 = c4980c;
            c4980c = c4980c2;
            if (c4980c == null) {
                break;
            }
            c4980c2 = c4980c.f40564c;
            c4980c.f40564c = c4980c3;
        }
        while (c4980c3 != null) {
            C4980c c4980c4 = c4980c3.f40564c;
            e(c4980c3.f40562a, c4980c3.f40563b);
            c4980c3 = c4980c4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e9) {
            f40573x.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e9);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof C4978a) {
            CancellationException cancellationException = ((C4978a) obj).f40559b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C4979b) {
            throw new ExecutionException(((C4979b) obj).f40560a);
        }
        if (obj == f40575z) {
            return null;
        }
        return obj;
    }

    public static Object g(AbstractC4984g abstractC4984g) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = abstractC4984g.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // P3.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        C4980c c4980c = this.f40577u;
        C4980c c4980c2 = C4980c.f40561d;
        if (c4980c != c4980c2) {
            C4980c c4980c3 = new C4980c(runnable, executor);
            do {
                c4980c3.f40564c = c4980c;
                if (f40574y.c(this, c4980c, c4980c3)) {
                    return;
                } else {
                    c4980c = this.f40577u;
                }
            } while (c4980c != c4980c2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g9 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g9 == this ? "this future" : String.valueOf(g9));
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
    public final boolean cancel(boolean z6) {
        Object obj = this.f40576n;
        if (obj != null) {
            return false;
        }
        if (!f40574y.d(this, obj, f40572w ? new C4978a(z6, new CancellationException("Future.cancel() was called.")) : z6 ? C4978a.f40556c : C4978a.f40557d)) {
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
        Object obj = this.f40576n;
        if (obj != null) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C4983f c4983f = this.f40578v;
            C4983f c4983f2 = C4983f.f40569c;
            if (c4983f != c4983f2) {
                C4983f c4983f3 = new C4983f();
                do {
                    com.bumptech.glide.f fVar = f40574y;
                    fVar.q(c4983f3, c4983f);
                    if (fVar.e(this, c4983f, c4983f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(c4983f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f40576n;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(c4983f3);
                    } else {
                        c4983f = this.f40578v;
                    }
                } while (c4983f != c4983f2);
            }
            return f(this.f40576n);
        }
        while (nanos > 0) {
            Object obj3 = this.f40576n;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC4984g = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j6 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String g9 = Wv.g(str, " (plus ");
            long j9 = -nanos;
            long convert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
            long nanos2 = j9 - timeUnit.toNanos(convert);
            boolean z6 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = g9 + convert + " " + lowerCase;
                if (z6) {
                    str2 = Wv.g(str2, ",");
                }
                g9 = Wv.g(str2, " ");
            }
            if (z6) {
                g9 = g9 + nanos2 + " nanoseconds ";
            }
            str = Wv.g(g9, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(Wv.g(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(Wv.h(str, " for ", abstractC4984g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(C4983f c4983f) {
        c4983f.f40570a = null;
        while (true) {
            C4983f c4983f2 = this.f40578v;
            if (c4983f2 == C4983f.f40569c) {
                return;
            }
            C4983f c4983f3 = null;
            while (c4983f2 != null) {
                C4983f c4983f4 = c4983f2.f40571b;
                if (c4983f2.f40570a != null) {
                    c4983f3 = c4983f2;
                } else if (c4983f3 != null) {
                    c4983f3.f40571b = c4983f4;
                    if (c4983f3.f40570a == null) {
                        break;
                    }
                } else if (!f40574y.e(this, c4983f2, c4983f4)) {
                    break;
                }
                c4983f2 = c4983f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f40576n instanceof C4978a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f40576n != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = f40575z;
        }
        if (!f40574y.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!f40574y.d(this, null, new C4979b(th))) {
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
        if (this.f40576n instanceof C4978a) {
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
            Object obj2 = this.f40576n;
            if (obj2 != null) {
                return f(obj2);
            }
            C4983f c4983f = this.f40578v;
            C4983f c4983f2 = C4983f.f40569c;
            if (c4983f != c4983f2) {
                C4983f c4983f3 = new C4983f();
                do {
                    com.bumptech.glide.f fVar = f40574y;
                    fVar.q(c4983f3, c4983f);
                    if (fVar.e(this, c4983f, c4983f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f40576n;
                            } else {
                                i(c4983f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    c4983f = this.f40578v;
                } while (c4983f != c4983f2);
            }
            return f(this.f40576n);
        }
        throw new InterruptedException();
    }
}
