package defpackage;

import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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

/* loaded from: classes3.dex */
public abstract class v6 implements lcg {
    public static final boolean d;
    public static final pbx e;
    public static final qwp f;
    public static final Object g;
    public volatile Object a;
    public volatile j6 b;
    public volatile u6 c;

    static {
        boolean z;
        Throwable th;
        qwp m6Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", PListParser.TAG_FALSE));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new pbx(2, v6.class);
        Throwable th2 = null;
        try {
            m6Var = new t6();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                m6Var = new k6(AtomicReferenceFieldUpdater.newUpdater(u6.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(u6.class, u6.class, "b"), AtomicReferenceFieldUpdater.newUpdater(v6.class, u6.class, "c"), AtomicReferenceFieldUpdater.newUpdater(v6.class, j6.class, "b"), AtomicReferenceFieldUpdater.newUpdater(v6.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th2 = e3;
                m6Var = new m6();
            }
        }
        f = m6Var;
        if (th2 != null) {
            pbx pbxVar = e;
            Logger a = pbxVar.a();
            Level level = Level.SEVERE;
            a.log(level, "UnsafeAtomicHelper is broken!", th);
            pbxVar.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    public static void f(v6 v6Var, boolean z) {
        j6 j6Var = null;
        while (true) {
            for (u6 M = f.M(v6Var); M != null; M = M.b) {
                Thread thread = M.a;
                if (thread != null) {
                    M.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            v6Var.d();
            j6 j6Var2 = j6Var;
            j6 L = f.L(v6Var);
            j6 j6Var3 = j6Var2;
            while (L != null) {
                j6 j6Var4 = L.c;
                L.c = j6Var3;
                j6Var3 = L;
                L = j6Var4;
            }
            while (j6Var3 != null) {
                j6Var = j6Var3.c;
                Runnable runnable = j6Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof l6) {
                    l6 l6Var = (l6) runnable;
                    v6Var = l6Var.a;
                    if (v6Var.a == l6Var) {
                        if (f.B(v6Var, l6Var, i(l6Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = j6Var3.b;
                    Objects.requireNonNull(executor);
                    g(runnable, executor);
                }
                j6Var3 = j6Var;
            }
            return;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object h(Object obj) {
        if (obj instanceof g6) {
            Throwable th = ((g6) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof i6) {
            throw new ExecutionException(((i6) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object i(lcg lcgVar) {
        Object obj;
        Throwable th;
        if (lcgVar instanceof n6) {
            Object obj2 = ((v6) lcgVar).a;
            if (obj2 instanceof g6) {
                g6 g6Var = (g6) obj2;
                if (g6Var.a) {
                    obj2 = g6Var.b != null ? new g6(g6Var.b, false) : g6.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if (lcgVar instanceof v6) {
            v6 v6Var = (v6) lcgVar;
            if (v6Var instanceof n6) {
                Object obj3 = v6Var.a;
                if (obj3 instanceof i6) {
                    th = ((i6) obj3).a;
                    if (th != null) {
                        return new i6(th);
                    }
                }
            }
            th = null;
            if (th != null) {
            }
        }
        boolean isCancelled = lcgVar.isCancelled();
        boolean z = true;
        if ((!d) && isCancelled) {
            g6 g6Var2 = g6.d;
            Objects.requireNonNull(g6Var2);
            return g6Var2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = lcgVar.get();
                        break;
                    } catch (Error e2) {
                        e = e2;
                        return new i6(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e3) {
                e = e3;
                return new i6(e);
            } catch (CancellationException e4) {
                if (isCancelled) {
                    return new g6(e4, false);
                }
                return new i6(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + lcgVar, e4));
            } catch (ExecutionException e5) {
                if (!isCancelled) {
                    return new i6(e5.getCause());
                }
                return new g6(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + lcgVar, e5), false);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? g : obj;
        }
        return new g6(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + lcgVar), false);
    }

    @Override // defpackage.lcg
    public void a(Runnable runnable, Executor executor) {
        j6 j6Var;
        j6 j6Var2 = j6.d;
        o2g.O(executor, "Executor was null.");
        if (!isDone() && (j6Var = this.b) != j6Var2) {
            j6 j6Var3 = new j6(runnable, executor);
            do {
                j6Var3.c = j6Var;
                if (f.A(this, j6Var, j6Var3)) {
                    return;
                } else {
                    j6Var = this.b;
                }
            } while (j6Var != j6Var2);
        }
        g(runnable, executor);
    }

    public final void c(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            } catch (Exception e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        e(sb, obj);
        sb.append("]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cancel(boolean z) {
        g6 g6Var;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof l6)) {
            return false;
        }
        if (d) {
            g6Var = new g6(new CancellationException("Future.cancel() was called."), z);
        } else {
            g6Var = z ? g6.c : g6.d;
            Objects.requireNonNull(g6Var);
        }
        v6 v6Var = this;
        boolean z2 = false;
        while (true) {
            if (f.B(v6Var, obj, g6Var)) {
                f(v6Var, z);
                if (!(obj instanceof l6)) {
                    break;
                }
                lcg lcgVar = ((l6) obj).b;
                if (!(lcgVar instanceof n6)) {
                    lcgVar.cancel(z);
                    break;
                }
                v6Var = (v6) lcgVar;
                obj = v6Var.a;
                if (!(obj == null) && !(obj instanceof l6)) {
                    break;
                }
                z2 = true;
            } else {
                obj = v6Var.a;
                if (!(obj instanceof l6)) {
                    return z2;
                }
            }
        }
    }

    public final void e(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        u6 u6Var = u6.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            b6e.h();
            return null;
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof l6))) {
            return h(obj);
        }
        long j3 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            u6 u6Var2 = this.c;
            if (u6Var2 != u6Var) {
                u6 u6Var3 = new u6();
                z = true;
                while (true) {
                    qwp qwpVar = f;
                    qwpVar.k0(u6Var3, u6Var2);
                    if (qwpVar.C(this, u6Var2, u6Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(u6Var3);
                                b6e.h();
                                return null;
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof l6))) {
                                return h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(u6Var3);
                    } else {
                        long j4 = j3;
                        u6Var2 = this.c;
                        if (u6Var2 == u6Var) {
                            break;
                        }
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof l6))) {
                return h(obj4);
            }
            if (Thread.interrupted()) {
                b6e.h();
                return null;
            }
            nanos = nanoTime - System.nanoTime();
        }
        String v6Var = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        StringBuilder l = tlm.l(j, "Waited ", StringUtil.SPACE);
        l.append(timeUnit.toString().toLowerCase(locale));
        String sb = l.toString();
        if (nanos + 1000 < j2) {
            String concat = sb.concat(" (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z2 = (convert == j2 || nanos2 > 1000) ? z : false;
            if (convert > j2) {
                String str = concat + convert + StringUtil.SPACE + lowerCase;
                if (z2) {
                    str = str.concat(StringUtils.COMMA);
                }
                concat = str.concat(StringUtil.SPACE);
            }
            if (z2) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            sb = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(ouj.o(sb, " for ", v6Var));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof g6;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof l6)) & (this.a != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(u6 u6Var) {
        u6Var.a = null;
        while (true) {
            u6 u6Var2 = this.c;
            if (u6Var2 == u6.c) {
                return;
            }
            u6 u6Var3 = null;
            while (u6Var2 != null) {
                u6 u6Var4 = u6Var2.b;
                if (u6Var2.a != null) {
                    u6Var3 = u6Var2;
                } else if (u6Var3 != null) {
                    u6Var3.b = u6Var4;
                    if (u6Var3.a == null) {
                        break;
                    }
                } else if (!f.C(this, u6Var2, u6Var4)) {
                    break;
                }
                u6Var2 = u6Var4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.B(this, null, obj)) {
            return false;
        }
        f(this, false);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!f.B(this, null, new i6(th))) {
            return false;
        }
        f(this, false);
        return true;
    }

    public boolean n(lcg lcgVar) {
        i6 i6Var;
        lcgVar.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (lcgVar.isDone()) {
                if (f.B(this, null, i(lcgVar))) {
                    f(this, false);
                    return true;
                }
                return false;
            }
            l6 l6Var = new l6(this, lcgVar);
            if (f.B(this, null, l6Var)) {
                try {
                    lcgVar.a(l6Var, e48.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        i6Var = new i6(th);
                    } catch (Error | Exception unused) {
                        i6Var = i6.b;
                    }
                    f.B(this, l6Var, i6Var);
                    return true;
                }
            }
            obj = this.a;
        }
        if (obj instanceof g6) {
            lcgVar.cancel(((g6) obj).a);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof l6) {
                sb.append(", setFuture=[");
                lcg lcgVar = ((l6) obj).b;
                try {
                    if (lcgVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(lcgVar);
                    }
                } catch (Exception e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                    sb.append("]");
                    if (isDone()) {
                    }
                    sb.append("]");
                    return sb.toString();
                } catch (StackOverflowError e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                    sb.append("]");
                    if (isDone()) {
                    }
                    sb.append("]");
                    return sb.toString();
                }
                sb.append("]");
            } else {
                try {
                    str = j();
                    if (ywf.G(str)) {
                        str = null;
                    }
                } catch (Exception | StackOverflowError e4) {
                    str = "Exception thrown from implementation: " + e4.getClass();
                }
                if (str != null) {
                    sb.append(", info=[");
                    sb.append(str);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                c(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        u6 u6Var = u6.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof l6))) {
                return h(obj2);
            }
            u6 u6Var2 = this.c;
            if (u6Var2 != u6Var) {
                u6 u6Var3 = new u6();
                do {
                    qwp qwpVar = f;
                    qwpVar.k0(u6Var3, u6Var2);
                    if (qwpVar.C(this, u6Var2, u6Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(u6Var3);
                                b6e.h();
                                return null;
                            }
                        } while (!((obj != null) & (!(obj instanceof l6))));
                        return h(obj);
                    }
                    u6Var2 = this.c;
                } while (u6Var2 != u6Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        b6e.h();
        return null;
    }
}
