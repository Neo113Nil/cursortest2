package Y6;

import D.RunnableC0282a;
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
    public static final c f3975e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f3976f;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f3977a = null;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f3978b = null;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3979c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Object f3980d = new Object();

    static {
        c cVar = new c();
        cVar.e();
        f3975e = cVar;
        c cVar2 = new c();
        cVar2.a(null);
        f3976f = cVar2;
    }

    public static c d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return f3975e;
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
                        synchronized (cVar3.f3980d) {
                            th = cVar3.f3978b;
                        }
                        if (th != null) {
                            while (!atomicReference2.compareAndSet(null, th) && atomicReference2.get() == null) {
                            }
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        boolean z3 = atomicBoolean2.get();
                        c cVar4 = cVar;
                        if (z3) {
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
        synchronized (this.f3980d) {
            try {
                if (this.f3977a == null) {
                    this.f3977a = Boolean.FALSE;
                    this.f3978b = th;
                    Iterator it = this.f3979c.iterator();
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
        boolean z3;
        synchronized (this.f3980d) {
            try {
                Boolean bool = this.f3977a;
                z3 = bool != null && bool.booleanValue();
            } finally {
            }
        }
        return z3;
    }

    public final void c(long j6, TimeUnit timeUnit) {
        boolean z3;
        synchronized (this.f3980d) {
            z3 = this.f3977a != null;
        }
        if (z3) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        f(new RunnableC0282a(9, countDownLatch));
        try {
            countDownLatch.await(j6, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void e() {
        synchronized (this.f3980d) {
            try {
                if (this.f3977a == null) {
                    this.f3977a = Boolean.TRUE;
                    Iterator it = this.f3979c.iterator();
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
        boolean z3;
        synchronized (this.f3980d) {
            if (this.f3977a != null) {
                z3 = true;
            } else {
                this.f3979c.add(runnable);
                z3 = false;
            }
        }
        if (z3) {
            runnable.run();
        }
    }
}
