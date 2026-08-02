package U0;

import com.google.android.gms.internal.ads.Wv;
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
public abstract class i implements P3.a {

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f3272w = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f3273x = Logger.getLogger(i.class.getName());

    /* renamed from: y, reason: collision with root package name */
    public static final t8.g f3274y;

    /* renamed from: z, reason: collision with root package name */
    public static final Object f3275z;

    /* renamed from: n, reason: collision with root package name */
    public volatile Object f3276n;

    /* renamed from: u, reason: collision with root package name */
    public volatile d f3277u;

    /* renamed from: v, reason: collision with root package name */
    public volatile h f3278v;

    static {
        t8.g gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "v"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "u"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "n"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f3274y = gVar;
        if (th != null) {
            f3273x.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3275z = new Object();
    }

    public static void c(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f3278v;
            if (f3274y.d(iVar, hVar, h.f3269c)) {
                while (hVar != null) {
                    Thread thread = hVar.f3270a;
                    if (thread != null) {
                        hVar.f3270a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f3271b;
                }
                do {
                    dVar = iVar.f3277u;
                } while (!f3274y.b(iVar, dVar, d.f3258d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f3261c;
                    dVar3.f3261c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f3261c;
                    Runnable runnable = dVar2.f3259a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f3267n;
                        if (iVar.f3276n == fVar) {
                            if (f3274y.c(iVar, fVar, f(fVar.f3268u))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.f3260b);
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
            f3273x.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e9);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f3254b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f3257a);
        }
        if (obj == f3275z) {
            return null;
        }
        return obj;
    }

    public static Object f(P3.a aVar) {
        if (aVar instanceof i) {
            Object obj = ((i) aVar).f3276n;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar2 = (a) obj;
            return aVar2.f3253a ? aVar2.f3254b != null ? new a(false, aVar2.f3254b) : a.f3252d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f3272w) && isCancelled) {
            return a.f3252d;
        }
        try {
            Object g9 = g(aVar);
            return g9 == null ? f3275z : g9;
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

    public static Object g(P3.a aVar) {
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

    @Override // P3.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f3277u;
        d dVar2 = d.f3258d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f3261c = dVar;
                if (f3274y.b(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f3277u;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g9 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g9 == this ? "this future" : String.valueOf(g9));
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
    public final boolean cancel(boolean z6) {
        Object obj = this.f3276n;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        a aVar = f3272w ? new a(z6, new CancellationException("Future.cancel() was called.")) : z6 ? a.f3251c : a.f3252d;
        i iVar = this;
        boolean z9 = false;
        while (true) {
            if (f3274y.c(iVar, obj, aVar)) {
                c(iVar);
                if (!(obj instanceof f)) {
                    break;
                }
                P3.a aVar2 = ((f) obj).f3268u;
                if (!(aVar2 instanceof i)) {
                    aVar2.cancel(z6);
                    break;
                }
                iVar = (i) aVar2;
                obj = iVar.f3276n;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z9 = true;
            } else {
                obj = iVar.f3276n;
                if (!(obj instanceof f)) {
                    return z9;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        boolean z6;
        long nanos = timeUnit.toNanos(j6);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3276n;
        if ((obj != null) && (!(obj instanceof f))) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f3278v;
            h hVar2 = h.f3269c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                z6 = true;
                do {
                    t8.g gVar = f3274y;
                    gVar.o(hVar3, hVar);
                    if (gVar.d(this, hVar, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3276n;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(hVar3);
                    } else {
                        hVar = this.f3278v;
                    }
                } while (hVar != hVar2);
            }
            return e(this.f3276n);
        }
        z6 = true;
        while (nanos > 0) {
            Object obj3 = this.f3276n;
            if ((obj3 != null ? z6 : false) && (!(obj3 instanceof f))) {
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
            String g9 = Wv.g(str, " (plus ");
            long j9 = -nanos;
            long convert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
            long nanos2 = j9 - timeUnit.toNanos(convert);
            boolean z9 = (convert == 0 || nanos2 > 1000) ? z6 : false;
            if (convert > 0) {
                String str2 = g9 + convert + " " + lowerCase;
                if (z9) {
                    str2 = Wv.g(str2, ",");
                }
                g9 = Wv.g(str2, " ");
            }
            if (z9) {
                g9 = g9 + nanos2 + " nanoseconds ";
            }
            str = Wv.g(g9, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(Wv.g(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(Wv.h(str, " for ", iVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f3276n;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            P3.a aVar = ((f) obj).f3268u;
            return Wv.i(sb, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(h hVar) {
        hVar.f3270a = null;
        while (true) {
            h hVar2 = this.f3278v;
            if (hVar2 == h.f3269c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f3271b;
                if (hVar2.f3270a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f3271b = hVar4;
                    if (hVar3.f3270a == null) {
                        break;
                    }
                } else if (!f3274y.d(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3276n instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f3276n != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3276n instanceof a) {
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
            Object obj2 = this.f3276n;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar = this.f3278v;
            h hVar2 = h.f3269c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    t8.g gVar = f3274y;
                    gVar.o(hVar3, hVar);
                    if (gVar.d(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3276n;
                            } else {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar = this.f3278v;
                } while (hVar != hVar2);
            }
            return e(this.f3276n);
        }
        throw new InterruptedException();
    }
}
