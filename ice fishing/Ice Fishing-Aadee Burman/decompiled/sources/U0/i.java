package U0;

import com.icefishing.icefishinglive2.AbstractC4404f;
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
public abstract class i implements N3.a {

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f3155w = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f3156x = Logger.getLogger(i.class.getName());

    /* renamed from: y, reason: collision with root package name */
    public static final t8.g f3157y;

    /* renamed from: z, reason: collision with root package name */
    public static final Object f3158z;

    /* renamed from: n, reason: collision with root package name */
    public volatile Object f3159n;

    /* renamed from: u, reason: collision with root package name */
    public volatile d f3160u;

    /* renamed from: v, reason: collision with root package name */
    public volatile h f3161v;

    static {
        t8.g gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "v"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "u"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "n"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g(5);
        }
        f3157y = gVar;
        if (th != null) {
            f3156x.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3158z = new Object();
    }

    public static void c(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f3161v;
            if (f3157y.d(iVar, hVar, h.f3152c)) {
                while (hVar != null) {
                    Thread thread = hVar.f3153a;
                    if (thread != null) {
                        hVar.f3153a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f3154b;
                }
                do {
                    dVar = iVar.f3160u;
                } while (!f3157y.b(iVar, dVar, d.f3141d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f3144c;
                    dVar3.f3144c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f3144c;
                    Runnable runnable = dVar2.f3142a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f3150n;
                        if (iVar.f3159n == fVar) {
                            if (f3157y.c(iVar, fVar, f(fVar.f3151u))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.f3143b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e9) {
            f3156x.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e9);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f3137b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f3140a);
        }
        if (obj == f3158z) {
            return null;
        }
        return obj;
    }

    public static Object f(N3.a aVar) {
        if (aVar instanceof i) {
            Object obj = ((i) aVar).f3159n;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar2 = (a) obj;
            return aVar2.f3136a ? aVar2.f3137b != null ? new a(false, aVar2.f3137b) : a.f3135d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f3155w) && isCancelled) {
            return a.f3135d;
        }
        try {
            Object g4 = g(aVar);
            return g4 == null ? f3158z : g4;
        } catch (CancellationException e9) {
            if (isCancelled) {
                return new a(false, e9);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e9));
        } catch (ExecutionException e10) {
            return new c(e10.getCause());
        } catch (Throwable th) {
            return new c(th);
        }
    }

    public static Object g(N3.a aVar) {
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

    @Override // N3.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f3160u;
        d dVar2 = d.f3141d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f3144c = dVar;
                if (f3157y.b(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f3160u;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g4 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g4 == this ? "this future" : String.valueOf(g4));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f3159n;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        a aVar = f3155w ? new a(z3, new CancellationException("Future.cancel() was called.")) : z3 ? a.f3134c : a.f3135d;
        i iVar = this;
        boolean z6 = false;
        while (true) {
            if (f3157y.c(iVar, obj, aVar)) {
                c(iVar);
                if (!(obj instanceof f)) {
                    break;
                }
                N3.a aVar2 = ((f) obj).f3151u;
                if (!(aVar2 instanceof i)) {
                    aVar2.cancel(z3);
                    break;
                }
                iVar = (i) aVar2;
                obj = iVar.f3159n;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z6 = true;
            } else {
                obj = iVar.f3159n;
                if (!(obj instanceof f)) {
                    return z6;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        boolean z3;
        long nanos = timeUnit.toNanos(j6);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3159n;
        if ((obj != null) && (!(obj instanceof f))) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f3161v;
            h hVar2 = h.f3152c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                z3 = true;
                do {
                    t8.g gVar = f3157y;
                    gVar.v(hVar3, hVar);
                    if (gVar.d(this, hVar, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3159n;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(hVar3);
                    } else {
                        hVar = this.f3161v;
                    }
                } while (hVar != hVar2);
            }
            return e(this.f3159n);
        }
        z3 = true;
        while (nanos > 0) {
            Object obj3 = this.f3159n;
            if ((obj3 != null ? z3 : false) && (!(obj3 instanceof f))) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String iVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j6 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String f3 = AbstractC4404f.f(str, " (plus ");
            long j9 = -nanos;
            long convert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
            long nanos2 = j9 - timeUnit.toNanos(convert);
            boolean z6 = (convert == 0 || nanos2 > 1000) ? z3 : false;
            if (convert > 0) {
                String str2 = f3 + convert + " " + lowerCase;
                if (z6) {
                    str2 = AbstractC4404f.f(str2, ",");
                }
                f3 = AbstractC4404f.f(str2, " ");
            }
            if (z6) {
                f3 = f3 + nanos2 + " nanoseconds ";
            }
            str = AbstractC4404f.f(f3, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC4404f.f(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC4404f.g(str, " for ", iVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f3159n;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            N3.a aVar = ((f) obj).f3151u;
            return u1.h.g(sb, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(h hVar) {
        hVar.f3153a = null;
        while (true) {
            h hVar2 = this.f3161v;
            if (hVar2 == h.f3152c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f3154b;
                if (hVar2.f3153a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f3154b = hVar4;
                    if (hVar3.f3153a == null) {
                        break;
                    }
                } else if (!f3157y.d(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3159n instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f3159n != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3159n instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e9) {
                str = "Exception thrown from implementation: " + e9.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
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
        if (!Thread.interrupted()) {
            Object obj2 = this.f3159n;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar = this.f3161v;
            h hVar2 = h.f3152c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    t8.g gVar = f3157y;
                    gVar.v(hVar3, hVar);
                    if (gVar.d(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3159n;
                            } else {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar = this.f3161v;
                } while (hVar != hVar2);
            }
            return e(this.f3159n);
        }
        throw new InterruptedException();
    }
}
