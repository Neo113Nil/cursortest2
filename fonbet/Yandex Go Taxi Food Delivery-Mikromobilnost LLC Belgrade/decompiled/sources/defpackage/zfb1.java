package defpackage;

import com.google.android.gms.internal.play_billing.q;
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

/* loaded from: classes11.dex */
public class zfb1 implements wp91 {
    public static final boolean w = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger x = Logger.getLogger(zfb1.class.getName());
    public static final yua1 y;
    public static final Object z;
    public volatile Object a;
    public volatile dga1 b;
    public volatile x7b1 c;

    static {
        yua1 i3b1Var;
        try {
            i3b1Var = new csa1(AtomicReferenceFieldUpdater.newUpdater(x7b1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(x7b1.class, x7b1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(zfb1.class, x7b1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(zfb1.class, dga1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(zfb1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            i3b1Var = new i3b1();
        }
        Throwable th2 = th;
        y = i3b1Var;
        if (th2 != null) {
            x.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        z = new Object();
    }

    public static void b(zfb1 zfb1Var) {
        x7b1 x7b1Var;
        dga1 dga1Var;
        dga1 dga1Var2;
        dga1 dga1Var3;
        do {
            x7b1Var = zfb1Var.c;
        } while (!y.h(zfb1Var, x7b1Var, x7b1.c));
        while (true) {
            dga1Var = null;
            if (x7b1Var == null) {
                break;
            }
            Thread thread = x7b1Var.a;
            if (thread != null) {
                x7b1Var.a = null;
                LockSupport.unpark(thread);
            }
            x7b1Var = x7b1Var.b;
        }
        do {
            dga1Var2 = zfb1Var.b;
        } while (!y.f(zfb1Var, dga1Var2, dga1.d));
        while (true) {
            dga1Var3 = dga1Var;
            dga1Var = dga1Var2;
            if (dga1Var == null) {
                break;
            }
            dga1Var2 = dga1Var.c;
            dga1Var.c = dga1Var3;
        }
        while (dga1Var3 != null) {
            Runnable runnable = dga1Var3.a;
            dga1 dga1Var4 = dga1Var3.c;
            f(runnable, dga1Var3.b);
            dga1Var3 = dga1Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            x.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", b64.l("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public static final Object h(Object obj) {
        if (obj instanceof dx91) {
            Throwable th = ((dx91) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof q) {
            throw new ExecutionException(((q) obj).a);
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

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!y.g(this, obj, w ? new dx91(new CancellationException("Future.cancel() was called.")) : z2 ? dx91.b : dx91.c)) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // defpackage.wp91
    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        dga1 dga1Var = this.b;
        dga1 dga1Var2 = dga1.d;
        if (dga1Var != dga1Var2) {
            dga1 dga1Var3 = new dga1(runnable, executor);
            do {
                dga1Var3.c = dga1Var;
                if (y.f(this, dga1Var, dga1Var3)) {
                    return;
                } else {
                    dga1Var = this.b;
                }
            } while (dga1Var != dga1Var2);
        }
        f(runnable, executor);
    }

    public final void e(StringBuilder sb) {
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

    public final void g(x7b1 x7b1Var) {
        x7b1Var.a = null;
        while (true) {
            x7b1 x7b1Var2 = this.c;
            if (x7b1Var2 != x7b1.c) {
                x7b1 x7b1Var3 = null;
                while (x7b1Var2 != null) {
                    x7b1 x7b1Var4 = x7b1Var2.b;
                    if (x7b1Var2.a != null) {
                        x7b1Var3 = x7b1Var2;
                    } else if (x7b1Var3 != null) {
                        x7b1Var3.b = x7b1Var4;
                        if (x7b1Var3.a == null) {
                            break;
                        }
                    } else if (!y.h(this, x7b1Var2, x7b1Var4)) {
                        break;
                    }
                    x7b1Var2 = x7b1Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        x7b1 x7b1Var = x7b1.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            x7b1 x7b1Var2 = this.c;
            if (x7b1Var2 != x7b1Var) {
                x7b1 x7b1Var3 = new x7b1();
                do {
                    yua1 yua1Var = y;
                    yua1Var.d(x7b1Var3, x7b1Var2);
                    if (yua1Var.h(this, x7b1Var2, x7b1Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(x7b1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(x7b1Var3);
                    } else {
                        x7b1Var2 = this.c;
                    }
                } while (x7b1Var2 != x7b1Var);
            }
            return h(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String zfb1Var = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z2 = true;
            if (convert != 0 && nanos2 <= 1000) {
                z2 = false;
            }
            if (convert > 0) {
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
        throw new TimeoutException(g8e.p(str, " for ", zfb1Var));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof dx91;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof dx91) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                concat = a();
            } catch (RuntimeException e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                x4e.C(sb, "PENDING, info=[", concat, "]");
            } else if (isDone()) {
                e(sb);
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
        x7b1 x7b1Var = x7b1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return h(obj2);
            }
            x7b1 x7b1Var2 = this.c;
            if (x7b1Var2 != x7b1Var) {
                x7b1 x7b1Var3 = new x7b1();
                do {
                    yua1 yua1Var = y;
                    yua1Var.d(x7b1Var3, x7b1Var2);
                    if (yua1Var.h(this, x7b1Var2, x7b1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                g(x7b1Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    x7b1Var2 = this.c;
                } while (x7b1Var2 != x7b1Var);
            }
            return h(this.a);
        }
        throw new InterruptedException();
    }
}
