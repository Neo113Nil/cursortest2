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

/* loaded from: classes.dex */
public class tjx implements a9x {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", PListParser.TAG_FALSE));
    public static final Logger e = Logger.getLogger(tjx.class.getName());
    public static final uwf f;
    public static final Object g;
    public volatile Object a;
    public volatile pex b;
    public volatile fix c;

    static {
        uwf ahxVar;
        try {
            ahxVar = new ufx(AtomicReferenceFieldUpdater.newUpdater(fix.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(fix.class, fix.class, "b"), AtomicReferenceFieldUpdater.newUpdater(tjx.class, fix.class, "c"), AtomicReferenceFieldUpdater.newUpdater(tjx.class, pex.class, "b"), AtomicReferenceFieldUpdater.newUpdater(tjx.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            ahxVar = new ahx();
        }
        Throwable th2 = th;
        f = ahxVar;
        if (th2 != null) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    public static void d(tjx tjxVar) {
        fix fixVar;
        pex pexVar;
        pex pexVar2;
        pex pexVar3;
        do {
            fixVar = tjxVar.c;
        } while (!f.S(tjxVar, fixVar, fix.c));
        while (true) {
            pexVar = null;
            if (fixVar == null) {
                break;
            }
            Thread thread = fixVar.a;
            if (thread != null) {
                fixVar.a = null;
                LockSupport.unpark(thread);
            }
            fixVar = fixVar.b;
        }
        do {
            pexVar2 = tjxVar.b;
        } while (!f.Q(tjxVar, pexVar2, pex.d));
        while (true) {
            pexVar3 = pexVar;
            pexVar = pexVar2;
            if (pexVar == null) {
                break;
            }
            pexVar2 = pexVar.c;
            pexVar.c = pexVar3;
        }
        while (pexVar3 != null) {
            Runnable runnable = pexVar3.a;
            pex pexVar4 = pexVar3.c;
            f(runnable, pexVar3.b);
            pexVar3 = pexVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", hrg.r("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object h(Object obj) {
        if (obj instanceof rax) {
            Throwable th = ((rax) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof odx) {
            throw new ExecutionException(((odx) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.a9x
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        pex pexVar = this.b;
        pex pexVar2 = pex.d;
        if (pexVar != pexVar2) {
            pex pexVar3 = new pex(runnable, executor);
            do {
                pexVar3.c = pexVar;
                if (f.Q(this, pexVar, pexVar3)) {
                    return;
                } else {
                    pexVar = this.b;
                }
            } while (pexVar != pexVar2);
        }
        f(runnable, executor);
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
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!f.R(this, obj, d ? new rax(new CancellationException("Future.cancel() was called.")) : z ? rax.b : rax.c)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb) {
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
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void g(fix fixVar) {
        fixVar.a = null;
        while (true) {
            fix fixVar2 = this.c;
            if (fixVar2 != fix.c) {
                fix fixVar3 = null;
                while (fixVar2 != null) {
                    fix fixVar4 = fixVar2.b;
                    if (fixVar2.a != null) {
                        fixVar3 = fixVar2;
                    } else if (fixVar3 != null) {
                        fixVar3.b = fixVar4;
                        if (fixVar3.a == null) {
                            break;
                        }
                    } else if (!f.S(this, fixVar2, fixVar4)) {
                        break;
                    }
                    fixVar2 = fixVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        fix fixVar = fix.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            b6e.h();
            return null;
        }
        Object obj = this.a;
        if (obj != null) {
            return h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            fix fixVar2 = this.c;
            if (fixVar2 != fixVar) {
                fix fixVar3 = new fix();
                do {
                    uwf uwfVar = f;
                    uwfVar.O(fixVar3, fixVar2);
                    if (uwfVar.S(this, fixVar2, fixVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(fixVar3);
                                b6e.h();
                                return null;
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(fixVar3);
                    } else {
                        fixVar2 = this.c;
                    }
                } while (fixVar2 != fixVar);
            }
            return h(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                b6e.h();
                return null;
            }
            nanos = nanoTime - System.nanoTime();
        }
        String tjxVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + StringUtil.SPACE + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = true;
            if (convert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (convert > 0) {
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
        throw new TimeoutException(ouj.o(str, " for ", tjxVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof rax;
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
        if (this.a instanceof rax) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                concat = c();
            } catch (RuntimeException e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
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
        fix fixVar = fix.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return h(obj2);
            }
            fix fixVar2 = this.c;
            if (fixVar2 != fixVar) {
                fix fixVar3 = new fix();
                do {
                    uwf uwfVar = f;
                    uwfVar.O(fixVar3, fixVar2);
                    if (uwfVar.S(this, fixVar2, fixVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                g(fixVar3);
                                b6e.h();
                                return null;
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    fixVar2 = this.c;
                } while (fixVar2 != fixVar);
            }
            return h(this.a);
        }
        b6e.h();
        return null;
    }
}
