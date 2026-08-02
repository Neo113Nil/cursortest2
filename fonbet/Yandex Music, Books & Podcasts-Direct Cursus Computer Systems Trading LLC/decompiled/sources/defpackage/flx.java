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

/* loaded from: classes.dex */
public abstract class flx implements lcg {
    public static final boolean d;
    public static final pbx e;
    public static final w1g f;
    public static final Object g;
    public volatile Object a;
    public volatile zkx b;
    public volatile elx c;

    static {
        boolean z;
        w1g blxVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", PListParser.TAG_FALSE));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new pbx();
        Throwable th3 = null;
        try {
            blxVar = new dlx();
            th2 = null;
            th = null;
        } catch (Error | Exception e2) {
            try {
                th = e2;
                blxVar = new alx(AtomicReferenceFieldUpdater.newUpdater(elx.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(elx.class, elx.class, "b"), AtomicReferenceFieldUpdater.newUpdater(flx.class, elx.class, "c"), AtomicReferenceFieldUpdater.newUpdater(flx.class, zkx.class, "b"), AtomicReferenceFieldUpdater.newUpdater(flx.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th3 = e3;
                blxVar = new blx();
                th = e2;
            }
            th2 = th3;
        }
        f = blxVar;
        if (th2 != null) {
            pbx pbxVar = e;
            Logger c = pbxVar.c();
            Level level = Level.SEVERE;
            c.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            pbxVar.c().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    public static Object e(flx flxVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = flxVar.get();
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

    public static void g(flx flxVar) {
        for (elx N = f.N(flxVar); N != null; N = N.b) {
            Thread thread = N.a;
            if (thread != null) {
                N.a = null;
                LockSupport.unpark(thread);
            }
        }
        flxVar.d();
        zkx M = f.M(flxVar);
        zkx zkxVar = null;
        while (M != null) {
            zkx zkxVar2 = M.c;
            M.c = zkxVar;
            zkxVar = M;
            M = zkxVar2;
        }
        while (zkxVar != null) {
            Runnable runnable = zkxVar.a;
            zkx zkxVar3 = zkxVar.c;
            Objects.requireNonNull(runnable);
            Executor executor = zkxVar.b;
            Objects.requireNonNull(executor);
            h(runnable, executor);
            zkxVar = zkxVar3;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", hrg.r("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object j(Object obj) {
        if (obj instanceof xkx) {
            Throwable th = ((xkx) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof ykx) {
            throw new ExecutionException(((ykx) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.lcg
    public final void a(Runnable runnable, Executor executor) {
        zkx zkxVar;
        zkx zkxVar2 = zkx.d;
        if (executor == null) {
            jj4.j("Executor was null.");
            return;
        }
        if (!isDone() && (zkxVar = this.b) != zkxVar2) {
            zkx zkxVar3 = new zkx(runnable, executor);
            do {
                zkxVar3.c = zkxVar;
                if (f.Q(this, zkxVar, zkxVar3)) {
                    return;
                } else {
                    zkxVar = this.b;
                }
            } while (zkxVar != zkxVar2);
        }
        h(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (this instanceof ScheduledFuture) {
            return dfi.e(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        xkx xkxVar;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            xkxVar = new xkx(new CancellationException("Future.cancel() was called."), z);
        } else {
            xkxVar = z ? xkx.c : xkx.d;
            Objects.requireNonNull(xkxVar);
        }
        if (!f.R(this, obj, xkxVar)) {
            return false;
        }
        g(this);
        return true;
    }

    public final void f(StringBuilder sb) {
        try {
            Object e2 = e(this);
            sb.append("SUCCESS, result=[");
            if (e2 == null) {
                sb.append("null");
            } else if (e2 == this) {
                sb.append("this future");
            } else {
                sb.append(e2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(e2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        } catch (Exception e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        elx elxVar = elx.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            b6e.h();
            return null;
        }
        Object obj = this.a;
        if (obj != null) {
            return j(obj);
        }
        long j3 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            elx elxVar2 = this.c;
            if (elxVar2 != elxVar) {
                elx elxVar3 = new elx();
                while (true) {
                    w1g w1gVar = f;
                    w1gVar.O(elxVar3, elxVar2);
                    if (w1gVar.S(this, elxVar2, elxVar3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                i(elxVar3);
                                b6e.h();
                                return null;
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return j(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(elxVar3);
                    } else {
                        long j4 = j3;
                        elxVar2 = this.c;
                        if (elxVar2 == elxVar) {
                            break;
                        }
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return j(obj3);
        }
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if (obj4 != null) {
                return j(obj4);
            }
            if (Thread.interrupted()) {
                b6e.h();
                return null;
            }
            nanos = nanoTime - System.nanoTime();
        }
        String flxVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j + StringUtil.SPACE + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < j2) {
            String concat = str.concat(" (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z = true;
            if (convert != j2 && nanos2 <= 1000) {
                z = false;
            }
            if (convert > j2) {
                String str2 = concat + convert + StringUtil.SPACE + lowerCase;
                if (z) {
                    str2 = str2.concat(StringUtils.COMMA);
                }
                concat = str2.concat(StringUtil.SPACE);
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(ouj.o(str, " for ", flxVar));
    }

    public final void i(elx elxVar) {
        elxVar.a = null;
        while (true) {
            elx elxVar2 = this.c;
            if (elxVar2 != elx.c) {
                elx elxVar3 = null;
                while (elxVar2 != null) {
                    elx elxVar4 = elxVar2.b;
                    if (elxVar2.a != null) {
                        elxVar3 = elxVar2;
                    } else if (elxVar3 != null) {
                        elxVar3.b = elxVar4;
                        if (elxVar3.a == null) {
                            break;
                        }
                    } else if (!f.S(this, elxVar2, elxVar4)) {
                        break;
                    }
                    elxVar2 = elxVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof xkx;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r3.isEmpty() != false) goto L17;
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
        if (this.a instanceof xkx) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            f(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                concat = c();
                if (concat != null) {
                }
                concat = null;
            } catch (Exception | StackOverflowError e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                f(sb);
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
        elx elxVar = elx.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return j(obj2);
            }
            elx elxVar2 = this.c;
            if (elxVar2 != elxVar) {
                elx elxVar3 = new elx();
                do {
                    w1g w1gVar = f;
                    w1gVar.O(elxVar3, elxVar2);
                    if (w1gVar.S(this, elxVar2, elxVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(elxVar3);
                                b6e.h();
                                return null;
                            }
                        } while (obj == null);
                        return j(obj);
                    }
                    elxVar2 = this.c;
                } while (elxVar2 != elxVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return j(obj3);
        }
        b6e.h();
        return null;
    }
}
