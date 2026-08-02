package defpackage;

import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class k9 implements lcg {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", PListParser.TAG_FALSE));
    public static final Logger e = Logger.getLogger(k9.class.getName());
    public static final i4w f;
    public static final Object g;
    public volatile Object a;
    public volatile c9 b;
    public volatile i9 c;

    static {
        i4w g9Var;
        try {
            g9Var = new e9(AtomicReferenceFieldUpdater.newUpdater(i9.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i9.class, i9.class, "b"), AtomicReferenceFieldUpdater.newUpdater(k9.class, i9.class, "c"), AtomicReferenceFieldUpdater.newUpdater(k9.class, c9.class, "b"), AtomicReferenceFieldUpdater.newUpdater(k9.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            g9Var = new g9();
        }
        f = g9Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void e(k9 k9Var) {
        i9 i9Var;
        c9 c9Var;
        c9 c9Var2;
        c9 c9Var3;
        do {
            i9Var = k9Var.c;
        } while (!f.v(k9Var, i9Var, i9.c));
        while (true) {
            c9Var = null;
            if (i9Var == null) {
                break;
            }
            Thread thread = i9Var.a;
            if (thread != null) {
                i9Var.a = null;
                LockSupport.unpark(thread);
            }
            i9Var = i9Var.b;
        }
        k9Var.d();
        do {
            c9Var2 = k9Var.b;
        } while (!f.t(k9Var, c9Var2, c9.d));
        while (true) {
            c9Var3 = c9Var;
            c9Var = c9Var2;
            if (c9Var == null) {
                break;
            }
            c9Var2 = c9Var.c;
            c9Var.c = c9Var3;
        }
        while (c9Var3 != null) {
            c9 c9Var4 = c9Var3.c;
            f(c9Var3.a, c9Var3.b);
            c9Var3 = c9Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object g(Object obj) {
        if (obj instanceof y8) {
            Throwable th = ((y8) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof a9) {
            throw new ExecutionException(((a9) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object h(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // defpackage.lcg
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c9 c9Var = this.b;
        c9 c9Var2 = c9.d;
        if (c9Var != c9Var2) {
            c9 c9Var3 = new c9(runnable, executor);
            do {
                c9Var3.c = c9Var;
                if (f.t(this, c9Var, c9Var3)) {
                    return;
                } else {
                    c9Var = this.b;
                }
            } while (c9Var != c9Var2);
        }
        f(runnable, executor);
    }

    public final void c(StringBuilder sb) {
        try {
            Object h = h(this);
            sb.append("SUCCESS, result=[");
            sb.append(h == this ? "this future" : String.valueOf(h));
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
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj == null) {
            if (f.u(this, obj, d ? new y8(new CancellationException("Future.cancel() was called."), z) : z ? y8.c : y8.d)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        i9 i9Var = i9.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            b6e.h();
            return null;
        }
        Object obj = this.a;
        if (obj != null) {
            return g(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i9 i9Var2 = this.c;
            if (i9Var2 != i9Var) {
                i9 i9Var3 = new i9();
                do {
                    i4w i4wVar = f;
                    i4wVar.P(i9Var3, i9Var2);
                    if (i4wVar.v(this, i9Var2, i9Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                k(i9Var3);
                                b6e.h();
                                return null;
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(i9Var3);
                    } else {
                        i9Var2 = this.c;
                    }
                } while (i9Var2 != i9Var);
            }
            return g(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return g(obj3);
            }
            if (Thread.interrupted()) {
                b6e.h();
                return null;
            }
            nanos = nanoTime - System.nanoTime();
        }
        String k9Var = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        StringBuilder l = tlm.l(j, "Waited ", StringUtil.SPACE);
        l.append(timeUnit.toString().toLowerCase(locale));
        String sb = l.toString();
        if (nanos + 1000 < 0) {
            String concat = sb.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str = concat + convert + StringUtil.SPACE + lowerCase;
                if (z) {
                    str = str.concat(StringUtils.COMMA);
                }
                concat = str.concat(StringUtil.SPACE);
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            sb = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(ouj.o(sb, " for ", k9Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof y8;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final void k(i9 i9Var) {
        i9Var.a = null;
        while (true) {
            i9 i9Var2 = this.c;
            if (i9Var2 == i9.c) {
                return;
            }
            i9 i9Var3 = null;
            while (i9Var2 != null) {
                i9 i9Var4 = i9Var2.b;
                if (i9Var2.a != null) {
                    i9Var3 = i9Var2;
                } else if (i9Var3 != null) {
                    i9Var3.b = i9Var4;
                    if (i9Var3.a == null) {
                        break;
                    }
                } else if (!f.v(this, i9Var2, i9Var4)) {
                    break;
                }
                i9Var2 = i9Var4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.u(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean m(Throwable th) {
        if (!f.u(this, null, new a9(th))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof y8) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            try {
                str = i();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                c(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        i9 i9Var = i9.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return g(obj2);
            }
            i9 i9Var2 = this.c;
            if (i9Var2 != i9Var) {
                i9 i9Var3 = new i9();
                do {
                    i4w i4wVar = f;
                    i4wVar.P(i9Var3, i9Var2);
                    if (i4wVar.v(this, i9Var2, i9Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(i9Var3);
                                b6e.h();
                                return null;
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    i9Var2 = this.c;
                } while (i9Var2 != i9Var);
            }
            return g(this.a);
        }
        b6e.h();
        return null;
    }
}
