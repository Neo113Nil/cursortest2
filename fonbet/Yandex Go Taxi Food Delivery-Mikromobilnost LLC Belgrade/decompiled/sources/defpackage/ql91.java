package defpackage;

import com.google.android.gms.internal.play_billing.f;
import java.util.Locale;
import java.util.Objects;
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

/* loaded from: classes11.dex */
public abstract class ql91 implements wp91 {
    public static final boolean w;
    public static final c7y x;
    public static final yta1 y;
    public static final Object z;
    public volatile Object a;
    public volatile el91 b;
    public volatile ll91 c;

    static {
        boolean z2;
        yta1 hl91Var;
        Throwable th;
        Throwable th2;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        w = z2;
        x = new c7y(ql91.class);
        Throwable th3 = null;
        try {
            hl91Var = new kl91();
            th2 = null;
            th = null;
        } catch (Error | Exception e) {
            try {
                th = e;
                hl91Var = new fl91(AtomicReferenceFieldUpdater.newUpdater(ll91.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(ll91.class, ll91.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ql91.class, ll91.class, "c"), AtomicReferenceFieldUpdater.newUpdater(ql91.class, el91.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ql91.class, Object.class, "a"));
            } catch (Error | Exception e2) {
                th3 = e2;
                hl91Var = new hl91();
                th = e;
            }
            th2 = th3;
        }
        y = hl91Var;
        if (th2 != null) {
            c7y c7yVar = x;
            Logger b = c7yVar.b();
            Level level = Level.SEVERE;
            b.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            c7yVar.b().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        z = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(wp91 wp91Var) {
        Object obj;
        Throwable th;
        if (wp91Var instanceof il91) {
            Object obj2 = ((ql91) wp91Var).a;
            if (obj2 instanceof dl91) {
                dl91 dl91Var = (dl91) obj2;
                if (dl91Var.a) {
                    Throwable th2 = dl91Var.b;
                    obj2 = th2 != null ? new dl91(th2, false) : dl91.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if (wp91Var instanceof ql91) {
            ql91 ql91Var = (ql91) wp91Var;
            if (ql91Var instanceof il91) {
                Object obj3 = ql91Var.a;
                if (obj3 instanceof f) {
                    th = ((f) obj3).a;
                    if (th != null) {
                        return new f(th);
                    }
                }
            } else {
                ql91Var.getClass();
            }
            th = null;
            if (th != null) {
            }
        }
        boolean isCancelled = wp91Var.isCancelled();
        boolean z2 = true;
        if ((!w) && isCancelled) {
            dl91 dl91Var2 = dl91.d;
            Objects.requireNonNull(dl91Var2);
            return dl91Var2;
        }
        boolean z3 = false;
        while (true) {
            try {
                try {
                    obj = wp91Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z3 = z2;
                } catch (Throwable th3) {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            } catch (Error | Exception e) {
                return new f(e);
            } catch (CancellationException e2) {
                return !isCancelled ? new f(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(wp91Var)), e2)) : new dl91(e2, false);
            } catch (ExecutionException e3) {
                return isCancelled ? new dl91(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(wp91Var)), e3), false) : new f(e3.getCause());
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return isCancelled ? new dl91(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(wp91Var))), false) : obj == null ? z : obj;
    }

    public static void h(ql91 ql91Var) {
        el91 el91Var;
        el91 el91Var2 = null;
        while (true) {
            for (ll91 g = y.g(ql91Var); g != null; g = g.b) {
                Thread thread = g.a;
                if (thread != null) {
                    g.a = null;
                    LockSupport.unpark(thread);
                }
            }
            ql91Var.b();
            el91 el91Var3 = el91Var2;
            el91 f = y.f(ql91Var);
            el91 el91Var4 = el91Var3;
            while (f != null) {
                el91 el91Var5 = f.c;
                f.c = el91Var4;
                el91Var4 = f;
                f = el91Var5;
            }
            while (el91Var4 != null) {
                Runnable runnable = el91Var4.a;
                el91Var = el91Var4.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof gl91) {
                    gl91 gl91Var = (gl91) runnable;
                    ql91Var = gl91Var.a;
                    if (ql91Var.a == gl91Var) {
                        if (y.k(ql91Var, gl91Var, f(gl91Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = el91Var4.b;
                    Objects.requireNonNull(executor);
                    i(runnable, executor);
                }
                el91Var4 = el91Var;
            }
            return;
            el91Var2 = el91Var;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            x.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", b64.l("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public static final Object k(Object obj) {
        if (obj instanceof dl91) {
            Throwable th = ((dl91) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof f) {
            throw new ExecutionException(((f) obj).a);
        }
        if (obj == z) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a() {
        if (this instanceof ScheduledFuture) {
            return qv10.k(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        dl91 dl91Var;
        Object obj = this.a;
        if (!(obj instanceof gl91) && !(obj == null)) {
            return false;
        }
        if (w) {
            dl91Var = new dl91(new CancellationException("Future.cancel() was called."), z2);
        } else {
            dl91Var = z2 ? dl91.c : dl91.d;
            Objects.requireNonNull(dl91Var);
        }
        boolean z3 = false;
        while (true) {
            if (y.k(this, obj, dl91Var)) {
                h(this);
                if (!(obj instanceof gl91)) {
                    break;
                }
                wp91 wp91Var = ((gl91) obj).b;
                if (!(wp91Var instanceof il91)) {
                    wp91Var.cancel(z2);
                    break;
                }
                this = (ql91) wp91Var;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof gl91)) {
                    break;
                }
                z3 = true;
            } else {
                obj = this.a;
                if (!(obj instanceof gl91)) {
                    return z3;
                }
            }
        }
        return true;
    }

    @Override // defpackage.wp91
    public final void d(Runnable runnable, Executor executor) {
        el91 el91Var;
        el91 el91Var2 = el91.d;
        if (executor == null) {
            ny61.t("Executor was null.");
            return;
        }
        if (!isDone() && (el91Var = this.b) != el91Var2) {
            el91 el91Var3 = new el91(runnable, executor);
            do {
                el91Var3.c = el91Var;
                if (y.j(this, el91Var, el91Var3)) {
                    return;
                } else {
                    el91Var = this.b;
                }
            } while (el91Var != el91Var2);
        }
        i(runnable, executor);
    }

    public final void e(Throwable th) {
        if (y.k(this, null, new f(th))) {
            h(this);
        }
    }

    public final void g(StringBuilder sb) {
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
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z2;
        long j2;
        ll91 ll91Var = ll91.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof gl91))) {
            return k(obj);
        }
        long j3 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            ll91 ll91Var2 = this.c;
            if (ll91Var2 != ll91Var) {
                ll91 ll91Var3 = new ll91();
                z2 = true;
                while (true) {
                    yta1 yta1Var = y;
                    yta1Var.h(ll91Var3, ll91Var2);
                    if (yta1Var.l(this, ll91Var2, ll91Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                j(ll91Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof gl91))) {
                                return k(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(ll91Var3);
                    } else {
                        long j4 = j3;
                        ll91Var2 = this.c;
                        if (ll91Var2 == ll91Var) {
                            break;
                        }
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return k(obj3);
        }
        z2 = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if ((obj4 != null ? z2 : false) && (!(obj4 instanceof gl91))) {
                return k(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String ql91Var = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < j2) {
            String concat = str.concat(" (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            if (convert != j2 && nanos2 <= 1000) {
                z2 = false;
            }
            if (convert > j2) {
                String str2 = concat + convert + " " + lowerCase;
                if (z2) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z2) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(g8e.p(str, " for ", ql91Var));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof dl91;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.a != null) & (!(r2 instanceof gl91));
    }

    public final void j(ll91 ll91Var) {
        ll91Var.a = null;
        while (true) {
            ll91 ll91Var2 = this.c;
            if (ll91Var2 != ll91.c) {
                ll91 ll91Var3 = null;
                while (ll91Var2 != null) {
                    ll91 ll91Var4 = ll91Var2.b;
                    if (ll91Var2.a != null) {
                        ll91Var3 = ll91Var2;
                    } else if (ll91Var3 != null) {
                        ll91Var3.b = ll91Var4;
                        if (ll91Var3.a == null) {
                            break;
                        }
                    } else if (!y.l(this, ll91Var2, ll91Var4)) {
                        break;
                    }
                    ll91Var2 = ll91Var4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        if (r3.isEmpty() != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.a instanceof dl91) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            g(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof gl91) {
                sb.append(", setFuture=[");
                wp91 wp91Var = ((gl91) obj).b;
                try {
                    if (wp91Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(wp91Var);
                    }
                } catch (Exception | StackOverflowError e) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    concat = a();
                    if (concat != null) {
                    }
                    concat = null;
                } catch (Exception | StackOverflowError e2) {
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
                }
                if (concat != null) {
                    x4e.C(sb, ", info=[", concat, "]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                g(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        ll91 ll91Var = ll91.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof gl91))) {
                return k(obj2);
            }
            ll91 ll91Var2 = this.c;
            if (ll91Var2 != ll91Var) {
                ll91 ll91Var3 = new ll91();
                do {
                    yta1 yta1Var = y;
                    yta1Var.h(ll91Var3, ll91Var2);
                    if (yta1Var.l(this, ll91Var2, ll91Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                j(ll91Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof gl91))));
                        return k(obj);
                    }
                    ll91Var2 = this.c;
                } while (ll91Var2 != ll91Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return k(obj3);
        }
        throw new InterruptedException();
    }
}
