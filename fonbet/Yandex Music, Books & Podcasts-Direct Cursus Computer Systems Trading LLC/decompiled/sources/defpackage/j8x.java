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
public abstract class j8x implements a9x {
    public static final boolean d;
    public static final pbx e;
    public static final rvf f;
    public static final Object g;
    public volatile Object a;
    public volatile b8x b;
    public volatile i8x c;

    static {
        boolean z;
        rvf e8xVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", PListParser.TAG_FALSE));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new pbx(3, j8x.class);
        Throwable th3 = null;
        try {
            e8xVar = new h8x();
            th2 = null;
            th = null;
        } catch (Error | Exception e2) {
            try {
                th = e2;
                e8xVar = new c8x(AtomicReferenceFieldUpdater.newUpdater(i8x.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i8x.class, i8x.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j8x.class, i8x.class, "c"), AtomicReferenceFieldUpdater.newUpdater(j8x.class, b8x.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j8x.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th3 = e3;
                e8xVar = new e8x();
                th = e2;
            }
            th2 = th3;
        }
        f = e8xVar;
        if (th2 != null) {
            pbx pbxVar = e;
            Logger c = pbxVar.c();
            Level level = Level.SEVERE;
            c.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            pbxVar.c().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(a9x a9xVar) {
        Object obj;
        Throwable th;
        if (a9xVar instanceof f8x) {
            Object obj2 = ((j8x) a9xVar).a;
            if (obj2 instanceof z7x) {
                z7x z7xVar = (z7x) obj2;
                if (z7xVar.a) {
                    Throwable th2 = z7xVar.b;
                    obj2 = th2 != null ? new z7x(th2, false) : z7x.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if (a9xVar instanceof j8x) {
            j8x j8xVar = (j8x) a9xVar;
            if (j8xVar instanceof f8x) {
                Object obj3 = j8xVar.a;
                if (obj3 instanceof a8x) {
                    th = ((a8x) obj3).a;
                    if (th != null) {
                        return new a8x(th);
                    }
                }
            }
            th = null;
            if (th != null) {
            }
        }
        boolean isCancelled = a9xVar.isCancelled();
        boolean z = true;
        if ((!d) && isCancelled) {
            z7x z7xVar2 = z7x.d;
            Objects.requireNonNull(z7xVar2);
            return z7xVar2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = a9xVar.get();
                        break;
                    } catch (Error e2) {
                        e = e2;
                        return new a8x(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th3) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            } catch (Error | Exception e3) {
                e = e3;
                return new a8x(e);
            } catch (CancellationException e4) {
                return !isCancelled ? new a8x(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(a9xVar)), e4)) : new z7x(e4, false);
            } catch (ExecutionException e5) {
                return isCancelled ? new z7x(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(a9xVar)), e5), false) : new a8x(e5.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return isCancelled ? new z7x(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(a9xVar))), false) : obj == null ? g : obj;
    }

    public static void h(j8x j8xVar) {
        b8x b8xVar;
        b8x b8xVar2 = null;
        while (true) {
            for (i8x T = f.T(j8xVar); T != null; T = T.b) {
                Thread thread = T.a;
                if (thread != null) {
                    T.a = null;
                    LockSupport.unpark(thread);
                }
            }
            j8xVar.d();
            b8x b8xVar3 = b8xVar2;
            b8x S = f.S(j8xVar);
            b8x b8xVar4 = b8xVar3;
            while (S != null) {
                b8x b8xVar5 = S.c;
                S.c = b8xVar4;
                b8xVar4 = S;
                S = b8xVar5;
            }
            while (b8xVar4 != null) {
                Runnable runnable = b8xVar4.a;
                b8xVar = b8xVar4.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof d8x) {
                    d8x d8xVar = (d8x) runnable;
                    j8xVar = d8xVar.a;
                    if (j8xVar.a == d8xVar) {
                        if (f.X(j8xVar, d8xVar, f(d8xVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = b8xVar4.b;
                    Objects.requireNonNull(executor);
                    i(runnable, executor);
                }
                b8xVar4 = b8xVar;
            }
            return;
            b8xVar2 = b8xVar;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", hrg.r("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object k(Object obj) {
        if (obj instanceof z7x) {
            Throwable th = ((z7x) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof a8x) {
            throw new ExecutionException(((a8x) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.a9x
    public final void b(Runnable runnable, Executor executor) {
        b8x b8xVar;
        b8x b8xVar2 = b8x.d;
        if (executor == null) {
            jj4.j("Executor was null.");
            return;
        }
        if (!isDone() && (b8xVar = this.b) != b8xVar2) {
            b8x b8xVar3 = new b8x(runnable, executor);
            do {
                b8xVar3.c = b8xVar;
                if (f.W(this, b8xVar, b8xVar3)) {
                    return;
                } else {
                    b8xVar = this.b;
                }
            } while (b8xVar != b8xVar2);
        }
        i(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (this instanceof ScheduledFuture) {
            return dfi.e(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z) {
        z7x z7xVar;
        Object obj = this.a;
        if (!(obj instanceof d8x) && !(obj == null)) {
            return false;
        }
        if (d) {
            z7xVar = new z7x(new CancellationException("Future.cancel() was called."), z);
        } else {
            z7xVar = z ? z7x.c : z7x.d;
            Objects.requireNonNull(z7xVar);
        }
        j8x j8xVar = this;
        boolean z2 = false;
        while (true) {
            if (f.X(j8xVar, obj, z7xVar)) {
                h(j8xVar);
                if (!(obj instanceof d8x)) {
                    break;
                }
                a9x a9xVar = ((d8x) obj).b;
                if (!(a9xVar instanceof f8x)) {
                    a9xVar.cancel(z);
                    break;
                }
                j8xVar = (j8x) a9xVar;
                obj = j8xVar.a;
                if (!(obj == null) && !(obj instanceof d8x)) {
                    break;
                }
                z2 = true;
            } else {
                obj = j8xVar.a;
                if (!(obj instanceof d8x)) {
                    return z2;
                }
            }
        }
    }

    public final void e(Throwable th) {
        if (f.X(this, null, new a8x(th))) {
            h(this);
        }
    }

    public final void g(StringBuilder sb) {
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
        boolean z;
        long j2;
        i8x i8xVar = i8x.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            b6e.h();
            return null;
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof d8x))) {
            return k(obj);
        }
        long j3 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i8x i8xVar2 = this.c;
            if (i8xVar2 != i8xVar) {
                i8x i8xVar3 = new i8x();
                z = true;
                while (true) {
                    rvf rvfVar = f;
                    rvfVar.U(i8xVar3, i8xVar2);
                    if (rvfVar.Y(this, i8xVar2, i8xVar3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                j(i8xVar3);
                                b6e.h();
                                return null;
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof d8x))) {
                                return k(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(i8xVar3);
                    } else {
                        long j4 = j3;
                        i8xVar2 = this.c;
                        if (i8xVar2 == i8xVar) {
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
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof d8x))) {
                return k(obj4);
            }
            if (Thread.interrupted()) {
                b6e.h();
                return null;
            }
            nanos = nanoTime - System.nanoTime();
        }
        String j8xVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j + StringUtil.SPACE + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < j2) {
            String concat = str.concat(" (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
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
        throw new TimeoutException(ouj.o(str, " for ", j8xVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof z7x;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.a != null) & (!(r0 instanceof d8x));
    }

    public final void j(i8x i8xVar) {
        i8xVar.a = null;
        while (true) {
            i8x i8xVar2 = this.c;
            if (i8xVar2 != i8x.c) {
                i8x i8xVar3 = null;
                while (i8xVar2 != null) {
                    i8x i8xVar4 = i8xVar2.b;
                    if (i8xVar2.a != null) {
                        i8xVar3 = i8xVar2;
                    } else if (i8xVar3 != null) {
                        i8xVar3.b = i8xVar4;
                        if (i8xVar3.a == null) {
                            break;
                        }
                    } else if (!f.Y(this, i8xVar2, i8xVar4)) {
                        break;
                    }
                    i8xVar2 = i8xVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r3.isEmpty() != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
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
        if (this.a instanceof z7x) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            g(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof d8x) {
                sb.append(", setFuture=[");
                a9x a9xVar = ((d8x) obj).b;
                try {
                    if (a9xVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(a9xVar);
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
                    concat = c();
                    if (concat != null) {
                    }
                    concat = null;
                } catch (Exception | StackOverflowError e4) {
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(e4.getClass()));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append("]");
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

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        i8x i8xVar = i8x.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof d8x))) {
                return k(obj2);
            }
            i8x i8xVar2 = this.c;
            if (i8xVar2 != i8xVar) {
                i8x i8xVar3 = new i8x();
                do {
                    rvf rvfVar = f;
                    rvfVar.U(i8xVar3, i8xVar2);
                    if (rvfVar.Y(this, i8xVar2, i8xVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                j(i8xVar3);
                                b6e.h();
                                return null;
                            }
                        } while (!((obj != null) & (!(obj instanceof d8x))));
                        return k(obj);
                    }
                    i8xVar2 = this.c;
                } while (i8xVar2 != i8xVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return k(obj3);
        }
        b6e.h();
        return null;
    }
}
