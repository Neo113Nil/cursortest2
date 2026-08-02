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
public abstract class AbstractC3310hD extends AbstractC3794qD {
    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(P3.a aVar) {
        Throwable b9;
        if (aVar instanceof InterfaceC3202fD) {
            Object obj = ((AbstractC3310hD) aVar).f34004n;
            if (obj instanceof C2934aD) {
                C2934aD c2934aD = (C2934aD) obj;
                if (c2934aD.f29808a) {
                    RuntimeException runtimeException = c2934aD.f29809b;
                    obj = runtimeException != null ? new C2934aD(false, runtimeException) : C2934aD.f29807d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((aVar instanceof AbstractC3042cE) && (b9 = ((AbstractC3042cE) aVar).b()) != null) {
            return new C3095dD(b9);
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!AbstractC3794qD.f34002y) && isCancelled) {
            C2934aD c2934aD2 = C2934aD.f29807d;
            Objects.requireNonNull(c2934aD2);
            return c2934aD2;
        }
        try {
            try {
                Object i = i(aVar);
                if (!isCancelled) {
                    return i == null ? AbstractC3794qD.f34000w : i;
                }
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new C2934aD(false, new IllegalArgumentException(sb.toString()));
            } catch (Error e9) {
                e = e9;
                return new C3095dD(e);
            }
        } catch (Error | Exception e10) {
            e = e10;
            return new C3095dD(e);
        } catch (CancellationException e11) {
            return !isCancelled ? new C3095dD(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(aVar)), e11)) : new C2934aD(false, e11);
        } catch (ExecutionException e12) {
            return isCancelled ? new C2934aD(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(aVar)), e12)) : new C3095dD(e12.getCause());
        }
    }

    public static Object i(P3.a aVar) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = aVar.get();
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

    public static Object j(Object obj) {
        if (obj instanceof C2934aD) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((C2934aD) obj).f29809b);
            throw cancellationException;
        }
        if (obj instanceof C3095dD) {
            throw new ExecutionException(((C3095dD) obj).f30501a);
        }
        if (obj == AbstractC3794qD.f34000w) {
            return null;
        }
        return obj;
    }

    public static boolean k(Object obj) {
        return !(obj instanceof RunnableC2988bD);
    }

    public static void p(AbstractC3310hD abstractC3310hD, boolean z6) {
        C3148eD c3148eD = null;
        while (true) {
            abstractC3310hD.getClass();
            for (C3740pD p9 = AbstractC3794qD.f34003z.p(abstractC3310hD); p9 != null; p9 = p9.f33834b) {
                Thread thread = p9.f33833a;
                if (thread != null) {
                    p9.f33833a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z6) {
                abstractC3310hD.l();
            }
            abstractC3310hD.f();
            C3148eD c3148eD2 = c3148eD;
            C3148eD q8 = AbstractC3794qD.f34003z.q(abstractC3310hD);
            C3148eD c3148eD3 = c3148eD2;
            while (q8 != null) {
                C3148eD c3148eD4 = q8.f30692c;
                q8.f30692c = c3148eD3;
                c3148eD3 = q8;
                q8 = c3148eD4;
            }
            while (c3148eD3 != null) {
                Runnable runnable = c3148eD3.f30690a;
                c3148eD = c3148eD3.f30692c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC2988bD) {
                    RunnableC2988bD runnableC2988bD = (RunnableC2988bD) runnable;
                    abstractC3310hD = runnableC2988bD.f30033n;
                    if (abstractC3310hD.f34004n == runnableC2988bD) {
                        if (AbstractC3794qD.f34003z.r(abstractC3310hD, runnableC2988bD, h(runnableC2988bD.f30034u))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c3148eD3.f30691b;
                    Objects.requireNonNull(executor);
                    r(runnable, executor);
                }
                c3148eD3 = c3148eD;
            }
            return;
            z6 = false;
        }
    }

    public static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e9) {
            Logger a9 = AbstractC3794qD.f34001x.a();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            a9.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", com.IceFishing.LiveIceFishing.k.r(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e9);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        C3148eD c3148eD;
        C3148eD c3148eD2;
        AbstractC2792Sd.J(runnable, "Runnable was null.");
        AbstractC2792Sd.J(executor, "Executor was null.");
        if (!isDone() && (c3148eD = this.f34005u) != (c3148eD2 = C3148eD.f30689d)) {
            C3148eD c3148eD3 = new C3148eD(runnable, executor);
            do {
                c3148eD3.f30692c = c3148eD;
                if (AbstractC3794qD.f34003z.o(this, c3148eD, c3148eD3)) {
                    return;
                } else {
                    c3148eD = this.f34005u;
                }
            } while (c3148eD != c3148eD2);
        }
        r(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3042cE
    public final Throwable b() {
        if (!(this instanceof InterfaceC3202fD)) {
            return null;
        }
        Object obj = this.f34004n;
        if (obj instanceof C3095dD) {
            return ((C3095dD) obj).f30501a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cancel(boolean z6) {
        C2934aD c2934aD;
        Object obj = this.f34004n;
        if (!(obj instanceof RunnableC2988bD) && !(obj == null)) {
            return false;
        }
        if (AbstractC3794qD.f34002y) {
            c2934aD = new C2934aD(z6, new CancellationException("Future.cancel() was called."));
        } else {
            c2934aD = z6 ? C2934aD.f29806c : C2934aD.f29807d;
            Objects.requireNonNull(c2934aD);
        }
        AbstractC3310hD abstractC3310hD = this;
        boolean z9 = false;
        while (true) {
            if (AbstractC3794qD.f34003z.r(abstractC3310hD, obj, c2934aD)) {
                p(abstractC3310hD, z6);
                if (!(obj instanceof RunnableC2988bD)) {
                    break;
                }
                P3.a aVar = ((RunnableC2988bD) obj).f30034u;
                if (!(aVar instanceof InterfaceC3202fD)) {
                    aVar.cancel(z6);
                    break;
                }
                abstractC3310hD = (AbstractC3310hD) aVar;
                obj = abstractC3310hD.f34004n;
                if (!(obj == null) && !(obj instanceof RunnableC2988bD)) {
                    break;
                }
                z9 = true;
            } else {
                obj = abstractC3310hD.f34004n;
                if (k(obj)) {
                    return z9;
                }
            }
        }
    }

    public boolean d(Object obj) {
        if (obj == null) {
            obj = AbstractC3794qD.f34000w;
        }
        if (!AbstractC3794qD.f34003z.r(this, null, obj)) {
            return false;
        }
        p(this, false);
        return true;
    }

    public boolean e(Throwable th) {
        if (!AbstractC3794qD.f34003z.r(this, null, new C3095dD(th))) {
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
        Object obj2 = this.f34004n;
        if ((obj2 != null) && k(obj2)) {
            return j(obj2);
        }
        C3740pD c3740pD = this.f34006v;
        C3740pD c3740pD2 = C3740pD.f33832c;
        if (c3740pD != c3740pD2) {
            C3740pD c3740pD3 = new C3740pD();
            do {
                AbstractC3364iD abstractC3364iD = AbstractC3794qD.f34003z;
                abstractC3364iD.h(c3740pD3, c3740pD);
                if (abstractC3364iD.m(this, c3740pD, c3740pD3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            c(c3740pD3);
                            throw new InterruptedException();
                        }
                        obj = this.f34004n;
                    } while (!((obj != null) & k(obj)));
                    return j(obj);
                }
                c3740pD = this.f34006v;
            } while (c3740pD != c3740pD2);
        }
        Object obj3 = this.f34004n;
        Objects.requireNonNull(obj3);
        return j(obj3);
    }

    public boolean isCancelled() {
        return this.f34004n instanceof C2934aD;
    }

    public boolean isDone() {
        Object obj = this.f34004n;
        return (obj != null) & k(obj);
    }

    public void l() {
    }

    public final boolean m() {
        Object obj = this.f34004n;
        return (obj instanceof C2934aD) && ((C2934aD) obj).f29808a;
    }

    public final void n(P3.a aVar) {
        C3095dD c3095dD;
        aVar.getClass();
        Object obj = this.f34004n;
        if (obj == null) {
            if (aVar.isDone()) {
                if (AbstractC3794qD.f34003z.r(this, null, h(aVar))) {
                    p(this, false);
                    return;
                }
                return;
            }
            RunnableC2988bD runnableC2988bD = new RunnableC2988bD(this, aVar);
            if (AbstractC3794qD.f34003z.r(this, null, runnableC2988bD)) {
                try {
                    aVar.a(runnableC2988bD, GD.f25742n);
                    return;
                } catch (Throwable th) {
                    try {
                        c3095dD = new C3095dD(th);
                    } catch (Error | Exception unused) {
                        c3095dD = C3095dD.f30500b;
                    }
                    AbstractC3794qD.f34003z.r(this, runnableC2988bD, c3095dD);
                    return;
                }
            }
            obj = this.f34004n;
        }
        if (obj instanceof C2934aD) {
            aVar.cancel(((C2934aD) obj).f29808a);
        }
    }

    public final void o(Future future) {
        if ((future != null) && (this.f34004n instanceof C2934aD)) {
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
            Object obj = this.f34004n;
            if (obj instanceof RunnableC2988bD) {
                sb.append(", setFuture=[");
                P3.a aVar = ((RunnableC2988bD) obj).f30034u;
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
        boolean z6;
        long nanos = timeUnit.toNanos(j6);
        if (!Thread.interrupted()) {
            Object obj = this.f34004n;
            if ((obj != null) & k(obj)) {
                return j(obj);
            }
            long j10 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C3740pD c3740pD = this.f34006v;
                C3740pD c3740pD2 = C3740pD.f33832c;
                if (c3740pD != c3740pD2) {
                    C3740pD c3740pD3 = new C3740pD();
                    z6 = true;
                    while (true) {
                        AbstractC3364iD abstractC3364iD = AbstractC3794qD.f34003z;
                        abstractC3364iD.h(c3740pD3, c3740pD);
                        if (abstractC3364iD.m(this, c3740pD, c3740pD3)) {
                            j9 = j10;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f34004n;
                                    if ((obj2 != null) & k(obj2)) {
                                        return j(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    c(c3740pD3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            c(c3740pD3);
                        } else {
                            long j11 = j10;
                            c3740pD = this.f34006v;
                            if (c3740pD == c3740pD2) {
                                break;
                            }
                            j10 = j11;
                        }
                    }
                }
                Object obj3 = this.f34004n;
                Objects.requireNonNull(obj3);
                return j(obj3);
            }
            j9 = 0;
            z6 = true;
            while (nanos > j9) {
                Object obj4 = this.f34004n;
                if ((obj4 != null ? z6 : false) & k(obj4)) {
                    return j(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC3310hD = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 8 + String.valueOf(lowerCase2).length());
            com.IceFishing.LiveIceFishing.k.z(sb, "Waited ", j6, " ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < j9) {
                String concat = sb2.concat(" (plus ");
                long j12 = -nanos;
                long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit.toNanos(convert);
                boolean z9 = (convert == j9 || nanos2 > 1000) ? z6 : false;
                if (convert > j9) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(convert).length() + concat.length() + 1 + String.valueOf(lowerCase).length());
                    com.IceFishing.LiveIceFishing.k.z(sb3, concat, convert, " ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z9) {
                        sb4 = sb4.concat(",");
                    }
                    concat = sb4.concat(" ");
                }
                if (z9) {
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
            throw new TimeoutException(D.x.p(new StringBuilder(sb2.length() + 5 + String.valueOf(abstractC3310hD).length()), sb2, " for ", abstractC3310hD));
        }
        throw new InterruptedException();
    }
}
