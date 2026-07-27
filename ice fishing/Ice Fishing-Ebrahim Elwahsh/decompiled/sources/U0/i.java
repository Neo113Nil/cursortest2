package U0;

import com.google.android.gms.internal.ads.CL;
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
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public abstract class i implements J3.a {

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f3233w = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f3234x = Logger.getLogger(i.class.getName());

    /* renamed from: y, reason: collision with root package name */
    public static final com.bumptech.glide.e f3235y;

    /* renamed from: z, reason: collision with root package name */
    public static final Object f3236z;

    /* renamed from: n, reason: collision with root package name */
    public volatile Object f3237n;

    /* renamed from: u, reason: collision with root package name */
    public volatile d f3238u;

    /* renamed from: v, reason: collision with root package name */
    public volatile h f3239v;

    static {
        com.bumptech.glide.e gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "v"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "u"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "n"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g(5);
        }
        f3235y = gVar;
        if (th != null) {
            f3234x.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3236z = new Object();
    }

    public static void b(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f3239v;
            if (f3235y.f(iVar, hVar, h.f3230c)) {
                while (hVar != null) {
                    Thread thread = hVar.f3231a;
                    if (thread != null) {
                        hVar.f3231a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f3232b;
                }
                do {
                    dVar = iVar.f3238u;
                } while (!f3235y.b(iVar, dVar, d.f3220d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f3223c;
                    dVar3.f3223c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f3223c;
                    Runnable runnable = dVar2.f3221a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f3228n;
                        if (iVar.f3237n == fVar) {
                            if (f3235y.d(iVar, fVar, f(fVar.f3229u))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.f3222b);
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
        } catch (RuntimeException e6) {
            f3234x.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f3216b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f3219a);
        }
        if (obj == f3236z) {
            return null;
        }
        return obj;
    }

    public static Object f(J3.a aVar) {
        if (aVar instanceof i) {
            Object obj = ((i) aVar).f3237n;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar2 = (a) obj;
            return aVar2.f3215a ? aVar2.f3216b != null ? new a(false, aVar2.f3216b) : a.f3214d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f3233w) && isCancelled) {
            return a.f3214d;
        }
        try {
            Object g9 = g(aVar);
            return g9 == null ? f3236z : g9;
        } catch (CancellationException e6) {
            if (isCancelled) {
                return new a(false, e6);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e6));
        } catch (ExecutionException e9) {
            return new c(e9.getCause());
        } catch (Throwable th) {
            return new c(th);
        }
    }

    public static Object g(J3.a aVar) {
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

    public final void a(StringBuilder sb) {
        try {
            Object g9 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g9 == this ? "this future" : String.valueOf(g9));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e9) {
            sb.append("FAILURE, cause=[");
            sb.append(e9.getCause());
            sb.append("]");
        }
    }

    @Override // J3.a
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f3238u;
        d dVar2 = d.f3220d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f3223c = dVar;
                if (f3235y.b(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f3238u;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        Object obj = this.f3237n;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        a aVar = f3233w ? new a(z8, new CancellationException("Future.cancel() was called.")) : z8 ? a.f3213c : a.f3214d;
        i iVar = this;
        boolean z9 = false;
        while (true) {
            if (f3235y.d(iVar, obj, aVar)) {
                b(iVar);
                if (!(obj instanceof f)) {
                    break;
                }
                J3.a aVar2 = ((f) obj).f3229u;
                if (!(aVar2 instanceof i)) {
                    aVar2.cancel(z8);
                    break;
                }
                iVar = (i) aVar2;
                obj = iVar.f3237n;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z9 = true;
            } else {
                obj = iVar.f3237n;
                if (!(obj instanceof f)) {
                    return z9;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        boolean z8;
        long nanos = timeUnit.toNanos(j9);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3237n;
        if ((obj != null) && (!(obj instanceof f))) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f3239v;
            h hVar2 = h.f3230c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                z8 = true;
                do {
                    com.bumptech.glide.e eVar = f3235y;
                    eVar.x(hVar3, hVar);
                    if (eVar.f(this, hVar, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3237n;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(hVar3);
                    } else {
                        hVar = this.f3239v;
                    }
                } while (hVar != hVar2);
            }
            return e(this.f3237n);
        }
        z8 = true;
        while (nanos > 0) {
            Object obj3 = this.f3237n;
            if ((obj3 != null ? z8 : false) && (!(obj3 instanceof f))) {
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
        String str = "Waited " + j9 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String j10 = CL.j(str, " (plus ");
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            boolean z9 = (convert == 0 || nanos2 > 1000) ? z8 : false;
            if (convert > 0) {
                String str2 = j10 + convert + " " + lowerCase;
                if (z9) {
                    str2 = CL.j(str2, ",");
                }
                j10 = CL.j(str2, " ");
            }
            if (z9) {
                j10 = j10 + nanos2 + " nanoseconds ";
            }
            str = CL.j(j10, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(CL.j(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(CL.k(str, " for ", iVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f3237n;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            J3.a aVar = ((f) obj).f3229u;
            return AbstractC5051n.g(sb, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(h hVar) {
        hVar.f3231a = null;
        while (true) {
            h hVar2 = this.f3239v;
            if (hVar2 == h.f3230c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f3232b;
                if (hVar2.f3231a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f3232b = hVar4;
                    if (hVar3.f3231a == null) {
                        break;
                    }
                } else if (!f3235y.f(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3237n instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f3237n != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3237n instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e6) {
                str = "Exception thrown from implementation: " + e6.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
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
            Object obj2 = this.f3237n;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar = this.f3239v;
            h hVar2 = h.f3230c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    com.bumptech.glide.e eVar = f3235y;
                    eVar.x(hVar3, hVar);
                    if (eVar.f(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3237n;
                            } else {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar = this.f3239v;
                } while (hVar != hVar2);
            }
            return e(this.f3237n);
        }
        throw new InterruptedException();
    }
}
