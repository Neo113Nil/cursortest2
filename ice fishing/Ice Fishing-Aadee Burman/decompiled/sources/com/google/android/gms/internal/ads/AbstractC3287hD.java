package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.hD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3287hD extends AbstractC3771qD {
    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(N3.a aVar) {
        Throwable b9;
        if (aVar instanceof InterfaceC3179fD) {
            Object obj = ((AbstractC3287hD) aVar).f33220n;
            if (obj instanceof C2911aD) {
                C2911aD c2911aD = (C2911aD) obj;
                if (c2911aD.f29038a) {
                    RuntimeException runtimeException = c2911aD.f29039b;
                    obj = runtimeException != null ? new C2911aD(false, runtimeException) : C2911aD.f29037d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((aVar instanceof AbstractC3019cE) && (b9 = ((AbstractC3019cE) aVar).b()) != null) {
            return new C3072dD(b9);
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!AbstractC3771qD.f33218y) && isCancelled) {
            C2911aD c2911aD2 = C2911aD.f29037d;
            Objects.requireNonNull(c2911aD2);
            return c2911aD2;
        }
        try {
            try {
                Object i = i(aVar);
                if (!isCancelled) {
                    return i == null ? AbstractC3771qD.f33216w : i;
                }
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new C2911aD(false, new IllegalArgumentException(sb.toString()));
            } catch (Error e9) {
                e = e9;
                return new C3072dD(e);
            }
        } catch (Error | Exception e10) {
            e = e10;
            return new C3072dD(e);
        } catch (CancellationException e11) {
            return !isCancelled ? new C3072dD(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(aVar)), e11)) : new C2911aD(false, e11);
        } catch (ExecutionException e12) {
            return isCancelled ? new C2911aD(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(aVar)), e12)) : new C3072dD(e12.getCause());
        }
    }

    public static Object i(N3.a aVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = aVar.get();
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

    public static Object j(Object obj) {
        if (obj instanceof C2911aD) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((C2911aD) obj).f29039b);
            throw cancellationException;
        }
        if (obj instanceof C3072dD) {
            throw new ExecutionException(((C3072dD) obj).f29729a);
        }
        if (obj == AbstractC3771qD.f33216w) {
            return null;
        }
        return obj;
    }

    public static boolean k(Object obj) {
        return !(obj instanceof RunnableC2965bD);
    }

    public static void p(AbstractC3287hD abstractC3287hD, boolean z3) {
        C3125eD c3125eD = null;
        while (true) {
            abstractC3287hD.getClass();
            for (C3717pD p9 = AbstractC3771qD.f33219z.p(abstractC3287hD); p9 != null; p9 = p9.f33044b) {
                Thread thread = p9.f33043a;
                if (thread != null) {
                    p9.f33043a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z3) {
                abstractC3287hD.l();
            }
            abstractC3287hD.f();
            C3125eD c3125eD2 = c3125eD;
            C3125eD q8 = AbstractC3771qD.f33219z.q(abstractC3287hD);
            C3125eD c3125eD3 = c3125eD2;
            while (q8 != null) {
                C3125eD c3125eD4 = q8.f29900c;
                q8.f29900c = c3125eD3;
                c3125eD3 = q8;
                q8 = c3125eD4;
            }
            while (c3125eD3 != null) {
                Runnable runnable = c3125eD3.f29898a;
                c3125eD = c3125eD3.f29900c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC2965bD) {
                    RunnableC2965bD runnableC2965bD = (RunnableC2965bD) runnable;
                    abstractC3287hD = runnableC2965bD.f29245n;
                    if (abstractC3287hD.f33220n == runnableC2965bD) {
                        if (AbstractC3771qD.f33219z.r(abstractC3287hD, runnableC2965bD, h(runnableC2965bD.f29246u))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c3125eD3.f29899b;
                    Objects.requireNonNull(executor);
                    r(runnable, executor);
                }
                c3125eD3 = c3125eD;
            }
            return;
            z3 = false;
        }
    }

    public static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e9) {
            Logger a9 = AbstractC3771qD.f33217x.a();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            a9.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", com.anythink.basead.exoplayer.f.f.o(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e9);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        C3125eD c3125eD;
        C3125eD c3125eD2;
        AbstractC2772Sd.J(runnable, "Runnable was null.");
        AbstractC2772Sd.J(executor, "Executor was null.");
        if (!isDone() && (c3125eD = this.f33221u) != (c3125eD2 = C3125eD.f29897d)) {
            C3125eD c3125eD3 = new C3125eD(runnable, executor);
            do {
                c3125eD3.f29900c = c3125eD;
                if (AbstractC3771qD.f33219z.o(this, c3125eD, c3125eD3)) {
                    return;
                } else {
                    c3125eD = this.f33221u;
                }
            } while (c3125eD != c3125eD2);
        }
        r(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3019cE
    public final Throwable b() {
        if (!(this instanceof InterfaceC3179fD)) {
            return null;
        }
        Object obj = this.f33220n;
        if (obj instanceof C3072dD) {
            return ((C3072dD) obj).f29729a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cancel(boolean z3) {
        C2911aD c2911aD;
        Object obj = this.f33220n;
        if (!(obj instanceof RunnableC2965bD) && !(obj == null)) {
            return false;
        }
        if (AbstractC3771qD.f33218y) {
            c2911aD = new C2911aD(z3, new CancellationException("Future.cancel() was called."));
        } else {
            c2911aD = z3 ? C2911aD.f29036c : C2911aD.f29037d;
            Objects.requireNonNull(c2911aD);
        }
        AbstractC3287hD abstractC3287hD = this;
        boolean z6 = false;
        while (true) {
            if (AbstractC3771qD.f33219z.r(abstractC3287hD, obj, c2911aD)) {
                p(abstractC3287hD, z3);
                if (!(obj instanceof RunnableC2965bD)) {
                    break;
                }
                N3.a aVar = ((RunnableC2965bD) obj).f29246u;
                if (!(aVar instanceof InterfaceC3179fD)) {
                    aVar.cancel(z3);
                    break;
                }
                abstractC3287hD = (AbstractC3287hD) aVar;
                obj = abstractC3287hD.f33220n;
                if (!(obj == null) && !(obj instanceof RunnableC2965bD)) {
                    break;
                }
                z6 = true;
            } else {
                obj = abstractC3287hD.f33220n;
                if (k(obj)) {
                    return z6;
                }
            }
        }
    }

    public boolean d(Object obj) {
        if (obj == null) {
            obj = AbstractC3771qD.f33216w;
        }
        if (!AbstractC3771qD.f33219z.r(this, null, obj)) {
            return false;
        }
        p(this, false);
        return true;
    }

    public boolean e(Throwable th) {
        if (!AbstractC3771qD.f33219z.r(this, null, new C3072dD(th))) {
            return false;
        }
        p(this, false);
        return true;
    }

    public void f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f33220n;
        if ((obj2 != null) && k(obj2)) {
            return j(obj2);
        }
        C3717pD c3717pD = this.f33222v;
        C3717pD c3717pD2 = C3717pD.f33042c;
        if (c3717pD != c3717pD2) {
            C3717pD c3717pD3 = new C3717pD();
            do {
                AbstractC3341iD abstractC3341iD = AbstractC3771qD.f33219z;
                abstractC3341iD.h(c3717pD3, c3717pD);
                if (abstractC3341iD.m(this, c3717pD, c3717pD3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            c(c3717pD3);
                            throw new InterruptedException();
                        }
                        obj = this.f33220n;
                    } while (!((obj != null) & k(obj)));
                    return j(obj);
                }
                c3717pD = this.f33222v;
            } while (c3717pD != c3717pD2);
        }
        Object obj3 = this.f33220n;
        Objects.requireNonNull(obj3);
        return j(obj3);
    }

    public boolean isCancelled() {
        return this.f33220n instanceof C2911aD;
    }

    public boolean isDone() {
        Object obj = this.f33220n;
        return (obj != null) & k(obj);
    }

    public void l() {
    }

    public final boolean m() {
        Object obj = this.f33220n;
        return (obj instanceof C2911aD) && ((C2911aD) obj).f29038a;
    }

    public final void n(N3.a aVar) {
        C3072dD c3072dD;
        aVar.getClass();
        Object obj = this.f33220n;
        if (obj == null) {
            if (aVar.isDone()) {
                if (AbstractC3771qD.f33219z.r(this, null, h(aVar))) {
                    p(this, false);
                    return;
                }
                return;
            }
            RunnableC2965bD runnableC2965bD = new RunnableC2965bD(this, aVar);
            if (AbstractC3771qD.f33219z.r(this, null, runnableC2965bD)) {
                try {
                    aVar.a(runnableC2965bD, GD.f24952n);
                    return;
                } catch (Throwable th) {
                    try {
                        c3072dD = new C3072dD(th);
                    } catch (Error | Exception unused) {
                        c3072dD = C3072dD.f29728b;
                    }
                    AbstractC3771qD.f33219z.r(this, runnableC2965bD, c3072dD);
                    return;
                }
            }
            obj = this.f33220n;
        }
        if (obj instanceof C2911aD) {
            aVar.cancel(((C2911aD) obj).f29038a);
        }
    }

    public final void o(Future future) {
        if ((future != null) && (this.f33220n instanceof C2911aD)) {
            future.cancel(m());
        }
    }

    public final void q(StringBuilder sb) {
        try {
            Object i = i(this);
            sb.append("SUCCESS, result=[");
            if (i == null) {
                sb.append("null");
            } else if (i == this) {
                sb.append("this future");
            } else {
                sb.append(i.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(i)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e9) {
            sb.append("FAILURE, cause=[");
            sb.append(e9.getCause());
            sb.append("]");
        } catch (Exception e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public String toString() {
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
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            q(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f33220n;
            if (obj instanceof RunnableC2965bD) {
                sb.append(", setFuture=[");
                N3.a aVar = ((RunnableC2965bD) obj).f29246u;
                try {
                    if (aVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(aVar);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    concat = g();
                    if (SK.n(concat)) {
                        concat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                q(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Object get(long j6, TimeUnit timeUnit) {
        long j9;
        boolean z3;
        long nanos = timeUnit.toNanos(j6);
        if (!Thread.interrupted()) {
            Object obj = this.f33220n;
            if ((obj != null) & k(obj)) {
                return j(obj);
            }
            long j10 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C3717pD c3717pD = this.f33222v;
                C3717pD c3717pD2 = C3717pD.f33042c;
                if (c3717pD != c3717pD2) {
                    C3717pD c3717pD3 = new C3717pD();
                    z3 = true;
                    while (true) {
                        AbstractC3341iD abstractC3341iD = AbstractC3771qD.f33219z;
                        abstractC3341iD.h(c3717pD3, c3717pD);
                        if (abstractC3341iD.m(this, c3717pD, c3717pD3)) {
                            j9 = j10;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f33220n;
                                    if ((obj2 != null) & k(obj2)) {
                                        return j(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    c(c3717pD3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            c(c3717pD3);
                        } else {
                            long j11 = j10;
                            c3717pD = this.f33222v;
                            if (c3717pD == c3717pD2) {
                                break;
                            }
                            j10 = j11;
                        }
                    }
                }
                Object obj3 = this.f33220n;
                Objects.requireNonNull(obj3);
                return j(obj3);
            }
            j9 = 0;
            z3 = true;
            while (nanos > j9) {
                Object obj4 = this.f33220n;
                if ((obj4 != null ? z3 : false) & k(obj4)) {
                    return j(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC3287hD = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 8 + String.valueOf(lowerCase2).length());
            D.y.x(sb, "Waited ", j6, " ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < j9) {
                String concat = sb2.concat(" (plus ");
                long j12 = -nanos;
                long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit.toNanos(convert);
                boolean z6 = (convert == j9 || nanos2 > 1000) ? z3 : false;
                if (convert > j9) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(convert).length() + concat.length() + 1 + String.valueOf(lowerCase).length());
                    D.y.x(sb3, concat, convert, " ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z6) {
                        sb4 = sb4.concat(",");
                    }
                    concat = sb4.concat(" ");
                }
                if (z6) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(nanos2).length() + concat.length() + 13);
                    sb5.append(concat);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(sb2.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(D.y.s(new StringBuilder(sb2.length() + 5 + String.valueOf(abstractC3287hD).length()), sb2, " for ", abstractC3287hD));
        }
        throw new InterruptedException();
    }
}
