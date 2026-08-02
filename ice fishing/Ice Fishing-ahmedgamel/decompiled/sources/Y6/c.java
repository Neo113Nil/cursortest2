package Y6;

import A3.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f3919e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f3920f;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f3921a = null;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f3922b = null;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3923c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Object f3924d = new Object();

    static {
        c cVar = new c();
        cVar.e();
        f3919e = cVar;
        c cVar2 = new c();
        cVar2.a(null);
        f3920f = cVar2;
    }

    public static c d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return f3919e;
        }
        final c cVar = new c();
        final AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final AtomicReference atomicReference = new AtomicReference();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final c cVar2 = (c) it.next();
            cVar2.f(new Runnable() { // from class: Y6.b
                @Override // java.lang.Runnable
                public final void run() {
                    Throwable th;
                    c cVar3 = c.this;
                    boolean b9 = cVar3.b();
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    AtomicReference atomicReference2 = atomicReference;
                    if (!b9) {
                        atomicBoolean2.set(true);
                        synchronized (cVar3.f3924d) {
                            th = cVar3.f3922b;
                        }
                        if (th != null) {
                            while (!atomicReference2.compareAndSet(null, th) && atomicReference2.get() == null) {
                            }
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        boolean z6 = atomicBoolean2.get();
                        c cVar4 = cVar;
                        if (z6) {
                            cVar4.a((Throwable) atomicReference2.get());
                        } else {
                            cVar4.e();
                        }
                    }
                }
            });
        }
        return cVar;
    }

    public final void a(Throwable th) {
        synchronized (this.f3924d) {
            try {
                if (this.f3921a == null) {
                    this.f3921a = Boolean.FALSE;
                    this.f3922b = th;
                    Iterator it = this.f3923c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z6;
        synchronized (this.f3924d) {
            try {
                Boolean bool = this.f3921a;
                z6 = bool != null && bool.booleanValue();
            } finally {
            }
        }
        return z6;
    }

    public final void c(long j6, TimeUnit timeUnit) {
        boolean z6;
        synchronized (this.f3924d) {
            z6 = this.f3921a != null;
        }
        if (z6) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        f(new p(8, countDownLatch));
        try {
            countDownLatch.await(j6, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void e() {
        synchronized (this.f3924d) {
            try {
                if (this.f3921a == null) {
                    this.f3921a = Boolean.TRUE;
                    Iterator it = this.f3923c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Runnable runnable) {
        boolean z6;
        synchronized (this.f3924d) {
            if (this.f3921a != null) {
                z6 = true;
            } else {
                this.f3923c.add(runnable);
                z6 = false;
            }
        }
        if (z6) {
            runnable.run();
        }
    }
}
