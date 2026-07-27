package com.anythink.core.common.n.b.a.b;

import D.RunnableC0281a;
import com.anythink.core.common.n.b.C0545a;
import com.anythink.core.common.n.b.a.b.j;
import com.anythink.core.common.n.b.aa;
import com.anythink.core.common.n.b.ah;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f15156c = true;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f15157d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.anythink.core.common.n.b.a.c.a(aa.f15620a + " ConnectionPool", true));

    /* renamed from: b, reason: collision with root package name */
    boolean f15159b;

    /* renamed from: e, reason: collision with root package name */
    private final int f15160e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15161f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f15162g = new RunnableC0281a(14, this);

    /* renamed from: h, reason: collision with root package name */
    private final Deque<e> f15163h = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    final g f15158a = new g();

    public f(int i, TimeUnit timeUnit) {
        this.f15160e = i;
        this.f15161f = timeUnit.toNanos(5L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        while (true) {
            long a9 = a(System.nanoTime());
            if (a9 == -1) {
                return;
            }
            if (a9 > 0) {
                long j9 = a9 / 1000000;
                long j10 = a9 - (1000000 * j9);
                synchronized (this) {
                    try {
                        wait(j9, (int) j10);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public final synchronized int b() {
        return this.f15163h.size();
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<e> it = this.f15163h.iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (next.f15142e.isEmpty()) {
                        next.f15139b = true;
                        arrayList.add(next);
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.anythink.core.common.n.b.a.c.a(((e) it2.next()).b());
        }
    }

    public final synchronized int a() {
        int i;
        Iterator<e> it = this.f15163h.iterator();
        i = 0;
        while (it.hasNext()) {
            if (it.next().f15142e.isEmpty()) {
                i++;
            }
        }
        return i;
    }

    public final boolean b(e eVar) {
        if (!f15156c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (eVar.f15139b || this.f15160e == 0) {
            this.f15163h.remove(eVar);
            return true;
        }
        notifyAll();
        return false;
    }

    public final boolean a(C0545a c0545a, j jVar, List<ah> list, boolean z8) {
        if (!f15156c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (e eVar : this.f15163h) {
            if (!z8 || eVar.g()) {
                if (eVar.a(c0545a, list)) {
                    jVar.a(eVar);
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(e eVar) {
        if (!f15156c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.f15159b) {
            this.f15159b = true;
            f15157d.execute(this.f15162g);
        }
        this.f15163h.add(eVar);
    }

    private long a(long j9) {
        int size;
        synchronized (this) {
            try {
                e eVar = null;
                long j10 = Long.MIN_VALUE;
                int i = 0;
                int i4 = 0;
                for (e eVar2 : this.f15163h) {
                    List<Reference<j>> list = eVar2.f15142e;
                    int i9 = 0;
                    while (true) {
                        if (i9 < list.size()) {
                            Reference<j> reference = list.get(i9);
                            if (reference.get() == null) {
                                com.anythink.core.common.n.b.a.g.c.e().a("A connection to " + eVar2.a().a().a() + " was leaked. Did you forget to close a response body?", ((j.a) reference).f15193a);
                                list.remove(i9);
                                eVar2.f15139b = true;
                                if (list.isEmpty()) {
                                    eVar2.f15143f = j9 - this.f15161f;
                                    size = 0;
                                    break;
                                }
                            } else {
                                i9++;
                            }
                        } else {
                            size = list.size();
                            break;
                        }
                    }
                    if (size > 0) {
                        i4++;
                    } else {
                        i++;
                        long j11 = j9 - eVar2.f15143f;
                        if (j11 > j10) {
                            eVar = eVar2;
                            j10 = j11;
                        }
                    }
                }
                long j12 = this.f15161f;
                if (j10 < j12 && i <= this.f15160e) {
                    if (i > 0) {
                        return j12 - j10;
                    }
                    if (i4 > 0) {
                        return j12;
                    }
                    this.f15159b = false;
                    return -1L;
                }
                this.f15163h.remove(eVar);
                com.anythink.core.common.n.b.a.c.a(eVar.b());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int a(e eVar, long j9) {
        List<Reference<j>> list = eVar.f15142e;
        int i = 0;
        while (i < list.size()) {
            Reference<j> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                com.anythink.core.common.n.b.a.g.c.e().a("A connection to " + eVar.a().a().a() + " was leaked. Did you forget to close a response body?", ((j.a) reference).f15193a);
                list.remove(i);
                eVar.f15139b = true;
                if (list.isEmpty()) {
                    eVar.f15143f = j9 - this.f15161f;
                    return 0;
                }
            }
        }
        return list.size();
    }

    private void a(ah ahVar, IOException iOException) {
        if (ahVar.b().type() != Proxy.Type.DIRECT) {
            C0545a a9 = ahVar.a();
            a9.g().connectFailed(a9.a().a(), ahVar.b().address(), iOException);
        }
        this.f15158a.a(ahVar);
    }
}
