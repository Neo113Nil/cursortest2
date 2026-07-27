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

/* renamed from: com.google.android.gms.internal.ads.iD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3354iD extends AbstractC3837rD {
    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(J3.a aVar) {
        Throwable a9;
        if (aVar instanceof InterfaceC3246gD) {
            Object obj = ((AbstractC3354iD) aVar).f33992n;
            if (obj instanceof C2973bD) {
                C2973bD c2973bD = (C2973bD) obj;
                if (c2973bD.f29433a) {
                    RuntimeException runtimeException = c2973bD.f29434b;
                    obj = runtimeException != null ? new C2973bD(false, runtimeException) : C2973bD.f29432d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((aVar instanceof AbstractC3192fE) && (a9 = ((AbstractC3192fE) aVar).a()) != null) {
            return new C3136eD(a9);
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!AbstractC3837rD.f33990y) && isCancelled) {
            C2973bD c2973bD2 = C2973bD.f29432d;
            Objects.requireNonNull(c2973bD2);
            return c2973bD2;
        }
        try {
            try {
                Object i = i(aVar);
                if (!isCancelled) {
                    return i == null ? AbstractC3837rD.f33988w : i;
                }
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new C2973bD(false, new IllegalArgumentException(sb.toString()));
            } catch (Error e6) {
                e = e6;
                return new C3136eD(e);
            }
        } catch (Error | Exception e9) {
            e = e9;
            return new C3136eD(e);
        } catch (CancellationException e10) {
            return !isCancelled ? new C3136eD(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(aVar)), e10)) : new C2973bD(false, e10);
        } catch (ExecutionException e11) {
            return isCancelled ? new C2973bD(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(aVar)), e11)) : new C3136eD(e11.getCause());
        }
    }

    public static Object i(J3.a aVar) {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = aVar.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object j(Object obj) {
        if (obj instanceof C2973bD) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((C2973bD) obj).f29434b);
            throw cancellationException;
        }
        if (obj instanceof C3136eD) {
            throw new ExecutionException(((C3136eD) obj).f30335a);
        }
        if (obj == AbstractC3837rD.f33988w) {
            return null;
        }
        return obj;
    }

    public static boolean k(Object obj) {
        return !(obj instanceof RunnableC3027cD);
    }

    public static void p(AbstractC3354iD abstractC3354iD, boolean z8) {
        C3191fD c3191fD = null;
        while (true) {
            abstractC3354iD.getClass();
            for (C3784qD l9 = AbstractC3837rD.f33991z.l(abstractC3354iD); l9 != null; l9 = l9.f33671b) {
                Thread thread = l9.f33670a;
                if (thread != null) {
                    l9.f33670a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z8) {
                abstractC3354iD.l();
            }
            abstractC3354iD.f();
            C3191fD c3191fD2 = c3191fD;
            C3191fD n9 = AbstractC3837rD.f33991z.n(abstractC3354iD);
            C3191fD c3191fD3 = c3191fD2;
            while (n9 != null) {
                C3191fD c3191fD4 = n9.f30636c;
                n9.f30636c = c3191fD3;
                c3191fD3 = n9;
                n9 = c3191fD4;
            }
            while (c3191fD3 != null) {
                Runnable runnable = c3191fD3.f30634a;
                c3191fD = c3191fD3.f30636c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC3027cD) {
                    RunnableC3027cD runnableC3027cD = (RunnableC3027cD) runnable;
                    abstractC3354iD = runnableC3027cD.f29652n;
                    if (abstractC3354iD.f33992n == runnableC3027cD) {
                        if (AbstractC3837rD.f33991z.o(abstractC3354iD, runnableC3027cD, h(runnableC3027cD.f29653u))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c3191fD3.f30635b;
                    Objects.requireNonNull(executor);
                    r(runnable, executor);
                }
                c3191fD3 = c3191fD;
            }
            return;
            z8 = false;
        }
    }

    public static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e6) {
            Logger a9 = AbstractC3837rD.f33989x.a();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            a9.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", com.anythink.basead.b.c.i.q(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3192fE
    public final Throwable a() {
        if (!(this instanceof InterfaceC3246gD)) {
            return null;
        }
        Object obj = this.f33992n;
        if (obj instanceof C3136eD) {
            return ((C3136eD) obj).f30335a;
        }
        return null;
    }

    public void c(Runnable runnable, Executor executor) {
        C3191fD c3191fD;
        C3191fD c3191fD2;
        PA.X(runnable, "Runnable was null.");
        PA.X(executor, "Executor was null.");
        if (!isDone() && (c3191fD = this.f33993u) != (c3191fD2 = C3191fD.f30633d)) {
            C3191fD c3191fD3 = new C3191fD(runnable, executor);
            do {
                c3191fD3.f30636c = c3191fD;
                if (AbstractC3837rD.f33991z.k(this, c3191fD, c3191fD3)) {
                    return;
                } else {
                    c3191fD = this.f33993u;
                }
            } while (c3191fD != c3191fD2);
        }
        r(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cancel(boolean z8) {
        C2973bD c2973bD;
        Object obj = this.f33992n;
        if (!(obj instanceof RunnableC3027cD) && !(obj == null)) {
            return false;
        }
        if (AbstractC3837rD.f33990y) {
            c2973bD = new C2973bD(z8, new CancellationException("Future.cancel() was called."));
        } else {
            c2973bD = z8 ? C2973bD.f29431c : C2973bD.f29432d;
            Objects.requireNonNull(c2973bD);
        }
        AbstractC3354iD abstractC3354iD = this;
        boolean z9 = false;
        while (true) {
            if (AbstractC3837rD.f33991z.o(abstractC3354iD, obj, c2973bD)) {
                p(abstractC3354iD, z8);
                if (!(obj instanceof RunnableC3027cD)) {
                    break;
                }
                J3.a aVar = ((RunnableC3027cD) obj).f29653u;
                if (!(aVar instanceof InterfaceC3246gD)) {
                    aVar.cancel(z8);
                    break;
                }
                abstractC3354iD = (AbstractC3354iD) aVar;
                obj = abstractC3354iD.f33992n;
                if (!(obj == null) && !(obj instanceof RunnableC3027cD)) {
                    break;
                }
                z9 = true;
            } else {
                obj = abstractC3354iD.f33992n;
                if (k(obj)) {
                    return z9;
                }
            }
        }
    }

    public boolean d(Object obj) {
        if (obj == null) {
            obj = AbstractC3837rD.f33988w;
        }
        if (!AbstractC3837rD.f33991z.o(this, null, obj)) {
            return false;
        }
        p(this, false);
        return true;
    }

    public boolean e(Throwable th) {
        if (!AbstractC3837rD.f33991z.o(this, null, new C3136eD(th))) {
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
        Object obj2 = this.f33992n;
        if ((obj2 != null) && k(obj2)) {
            return j(obj2);
        }
        C3784qD c3784qD = this.f33994v;
        C3784qD c3784qD2 = C3784qD.f33669c;
        if (c3784qD != c3784qD2) {
            C3784qD c3784qD3 = new C3784qD();
            do {
                AbstractC3406jD abstractC3406jD = AbstractC3837rD.f33991z;
                abstractC3406jD.g(c3784qD3, c3784qD);
                if (abstractC3406jD.i(this, c3784qD, c3784qD3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(c3784qD3);
                            throw new InterruptedException();
                        }
                        obj = this.f33992n;
                    } while (!((obj != null) & k(obj)));
                    return j(obj);
                }
                c3784qD = this.f33994v;
            } while (c3784qD != c3784qD2);
        }
        Object obj3 = this.f33992n;
        Objects.requireNonNull(obj3);
        return j(obj3);
    }

    public boolean isCancelled() {
        return this.f33992n instanceof C2973bD;
    }

    public boolean isDone() {
        Object obj = this.f33992n;
        return (obj != null) & k(obj);
    }

    public void l() {
    }

    public final boolean m() {
        Object obj = this.f33992n;
        return (obj instanceof C2973bD) && ((C2973bD) obj).f29433a;
    }

    public final void n(J3.a aVar) {
        C3136eD c3136eD;
        aVar.getClass();
        Object obj = this.f33992n;
        if (obj == null) {
            if (aVar.isDone()) {
                if (AbstractC3837rD.f33991z.o(this, null, h(aVar))) {
                    p(this, false);
                    return;
                }
                return;
            }
            RunnableC3027cD runnableC3027cD = new RunnableC3027cD(this, aVar);
            if (AbstractC3837rD.f33991z.o(this, null, runnableC3027cD)) {
                try {
                    aVar.c(runnableC3027cD, HD.f25326n);
                    return;
                } catch (Throwable th) {
                    try {
                        c3136eD = new C3136eD(th);
                    } catch (Error | Exception unused) {
                        c3136eD = C3136eD.f30334b;
                    }
                    AbstractC3837rD.f33991z.o(this, runnableC3027cD, c3136eD);
                    return;
                }
            }
            obj = this.f33992n;
        }
        if (obj instanceof C2973bD) {
            aVar.cancel(((C2973bD) obj).f29433a);
        }
    }

    public final void o(Future future) {
        if ((future != null) && (this.f33992n instanceof C2973bD)) {
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
        } catch (ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append("]");
        } catch (Exception e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
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
            Object obj = this.f33992n;
            if (obj instanceof RunnableC3027cD) {
                sb.append(", setFuture=[");
                J3.a aVar = ((RunnableC3027cD) obj).f29653u;
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
                    if (AbstractC3217fl.q(concat)) {
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

    public Object get(long j9, TimeUnit timeUnit) {
        long j10;
        boolean z8;
        long nanos = timeUnit.toNanos(j9);
        if (!Thread.interrupted()) {
            Object obj = this.f33992n;
            if ((obj != null) & k(obj)) {
                return j(obj);
            }
            long j11 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C3784qD c3784qD = this.f33994v;
                C3784qD c3784qD2 = C3784qD.f33669c;
                if (c3784qD != c3784qD2) {
                    C3784qD c3784qD3 = new C3784qD();
                    z8 = true;
                    while (true) {
                        AbstractC3406jD abstractC3406jD = AbstractC3837rD.f33991z;
                        abstractC3406jD.g(c3784qD3, c3784qD);
                        if (abstractC3406jD.i(this, c3784qD, c3784qD3)) {
                            j10 = j11;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f33992n;
                                    if ((obj2 != null) & k(obj2)) {
                                        return j(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    b(c3784qD3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            b(c3784qD3);
                        } else {
                            long j12 = j11;
                            c3784qD = this.f33994v;
                            if (c3784qD == c3784qD2) {
                                break;
                            }
                            j11 = j12;
                        }
                    }
                }
                Object obj3 = this.f33992n;
                Objects.requireNonNull(obj3);
                return j(obj3);
            }
            j10 = 0;
            z8 = true;
            while (nanos > j10) {
                Object obj4 = this.f33992n;
                if ((obj4 != null ? z8 : false) & k(obj4)) {
                    return j(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC3354iD = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 8 + String.valueOf(lowerCase2).length());
            com.anythink.basead.b.c.i.x(sb, "Waited ", j9, " ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < j10) {
                String concat = sb2.concat(" (plus ");
                long j13 = -nanos;
                long convert = timeUnit.convert(j13, TimeUnit.NANOSECONDS);
                long nanos2 = j13 - timeUnit.toNanos(convert);
                boolean z9 = (convert == j10 || nanos2 > 1000) ? z8 : false;
                if (convert > j10) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(convert).length() + concat.length() + 1 + String.valueOf(lowerCase).length());
                    com.anythink.basead.b.c.i.x(sb3, concat, convert, " ");
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
            throw new TimeoutException(D.y.o(new StringBuilder(sb2.length() + 5 + String.valueOf(abstractC3354iD).length()), sb2, " for ", abstractC3354iD));
        }
        throw new InterruptedException();
    }
}
