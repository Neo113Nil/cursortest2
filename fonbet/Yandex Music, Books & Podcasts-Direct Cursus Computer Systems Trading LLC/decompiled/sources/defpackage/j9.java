package defpackage;

import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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

/* loaded from: classes5.dex */
public abstract class j9 implements lcg {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", PListParser.TAG_FALSE));
    public static final Logger e = Logger.getLogger(j9.class.getName());
    public static final leu f;
    public static final Object g;
    public volatile Object a;
    public volatile b9 b;
    public volatile h9 c;

    static {
        leu f9Var;
        try {
            f9Var = new d9(AtomicReferenceFieldUpdater.newUpdater(h9.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h9.class, h9.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j9.class, h9.class, "c"), AtomicReferenceFieldUpdater.newUpdater(j9.class, b9.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j9.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            f9Var = new f9();
        }
        f = f9Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void d(j9 j9Var) {
        h9 h9Var;
        b9 b9Var;
        b9 b9Var2;
        b9 b9Var3;
        do {
            h9Var = j9Var.c;
        } while (!f.J(j9Var, h9Var, h9.c));
        while (true) {
            b9Var = null;
            if (h9Var == null) {
                break;
            }
            Thread thread = h9Var.a;
            if (thread != null) {
                h9Var.a = null;
                LockSupport.unpark(thread);
            }
            h9Var = h9Var.b;
        }
        do {
            b9Var2 = j9Var.b;
        } while (!f.H(j9Var, b9Var2, b9.d));
        while (true) {
            b9Var3 = b9Var;
            b9Var = b9Var2;
            if (b9Var == null) {
                break;
            }
            b9Var2 = b9Var.c;
            b9Var.c = b9Var3;
        }
        while (b9Var3 != null) {
            b9 b9Var4 = b9Var3.c;
            e(b9Var3.a, b9Var3.b);
            b9Var3 = b9Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof x8) {
            Throwable th = ((x8) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof z8) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object g(j9 j9Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = j9Var.get();
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
        b9 b9Var = this.b;
        b9 b9Var2 = b9.d;
        if (b9Var != b9Var2) {
            b9 b9Var3 = new b9(runnable, executor);
            do {
                b9Var3.c = b9Var;
                if (f.H(this, b9Var, b9Var3)) {
                    return;
                } else {
                    b9Var = this.b;
                }
            } while (b9Var != b9Var2);
        }
        e(runnable, executor);
    }

    public final void c(StringBuilder sb) {
        try {
            Object g2 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g2 == this ? "this future" : String.valueOf(g2));
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
        if (obj != null) {
            return false;
        }
        if (!f.I(this, obj, d ? new x8(new CancellationException("Future.cancel() was called."), z) : z ? x8.b : x8.c)) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        h9 h9Var = h9.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            b6e.h();
            return null;
        }
        Object obj = this.a;
        if (obj != null) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h9 h9Var2 = this.c;
            if (h9Var2 != h9Var) {
                h9 h9Var3 = new h9();
                do {
                    leu leuVar = f;
                    leuVar.V(h9Var3, h9Var2);
                    if (leuVar.J(this, h9Var2, h9Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(h9Var3);
                                b6e.h();
                                return null;
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(h9Var3);
                    } else {
                        h9Var2 = this.c;
                    }
                } while (h9Var2 != h9Var);
            }
            return f(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                b6e.h();
                return null;
            }
            nanos = nanoTime - System.nanoTime();
        }
        String j9Var = toString();
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
        throw new TimeoutException(ouj.o(sb, " for ", j9Var));
    }

    public final void h(h9 h9Var) {
        h9Var.a = null;
        while (true) {
            h9 h9Var2 = this.c;
            if (h9Var2 == h9.c) {
                return;
            }
            h9 h9Var3 = null;
            while (h9Var2 != null) {
                h9 h9Var4 = h9Var2.b;
                if (h9Var2.a != null) {
                    h9Var3 = h9Var2;
                } else if (h9Var3 != null) {
                    h9Var3.b = h9Var4;
                    if (h9Var3.a == null) {
                        break;
                    }
                } else if (!f.J(this, h9Var2, h9Var4)) {
                    break;
                }
                h9Var2 = h9Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof x8;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof x8) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
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
                c(sb);
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
        h9 h9Var = h9.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return f(obj2);
            }
            h9 h9Var2 = this.c;
            if (h9Var2 != h9Var) {
                h9 h9Var3 = new h9();
                do {
                    leu leuVar = f;
                    leuVar.V(h9Var3, h9Var2);
                    if (leuVar.J(this, h9Var2, h9Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                h(h9Var3);
                                b6e.h();
                                return null;
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    h9Var2 = this.c;
                } while (h9Var2 != h9Var);
            }
            return f(this.a);
        }
        b6e.h();
        return null;
    }
}
