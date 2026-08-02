package com.anythink.core.common.n.b.a.b;

import A3.p;
import com.anythink.core.common.n.b.C0565a;
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
    static final /* synthetic */ boolean f15785c = true;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f15786d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.anythink.core.common.n.b.a.c.a(aa.f16249a + " ConnectionPool", true));

    /* renamed from: b, reason: collision with root package name */
    boolean f15788b;

    /* renamed from: e, reason: collision with root package name */
    private final int f15789e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15790f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f15791g = new p(15, this);

    /* renamed from: h, reason: collision with root package name */
    private final Deque<e> f15792h = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    final g f15787a = new g();

    public f(int i, TimeUnit timeUnit) {
        this.f15789e = i;
        this.f15790f = timeUnit.toNanos(5L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        while (true) {
            long a9 = a(System.nanoTime());
            if (a9 == -1) {
                return;
            }
            if (a9 > 0) {
                long j6 = a9 / 1000000;
                long j9 = a9 - (1000000 * j6);
                synchronized (this) {
                    try {
                        wait(j6, (int) j9);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public final synchronized int b() {
        return this.f15792h.size();
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<e> it = this.f15792h.iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (next.f15771e.isEmpty()) {
                        next.f15768b = true;
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
        Iterator<e> it = this.f15792h.iterator();
        i = 0;
        while (it.hasNext()) {
            if (it.next().f15771e.isEmpty()) {
                i++;
            }
        }
        return i;
    }

    public final boolean b(e eVar) {
        if (!f15785c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (eVar.f15768b || this.f15789e == 0) {
            this.f15792h.remove(eVar);
            return true;
        }
        notifyAll();
        return false;
    }

    public final boolean a(C0565a c0565a, j jVar, List<ah> list, boolean z6) {
        if (!f15785c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (e eVar : this.f15792h) {
            if (!z6 || eVar.g()) {
                if (eVar.a(c0565a, list)) {
                    jVar.a(eVar);
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(e eVar) {
        if (!f15785c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.f15788b) {
            this.f15788b = true;
            f15786d.execute(this.f15791g);
        }
        this.f15792h.add(eVar);
    }

    private long a(long j6) {
        int size;
        synchronized (this) {
            try {
                e eVar = null;
                long j9 = Long.MIN_VALUE;
                int i = 0;
                int i4 = 0;
                for (e eVar2 : this.f15792h) {
                    List<Reference<j>> list = eVar2.f15771e;
                    int i6 = 0;
                    while (true) {
                        if (i6 < list.size()) {
                            Reference<j> reference = list.get(i6);
                            if (reference.get() == null) {
                                com.anythink.core.common.n.b.a.g.c.e().a("A connection to " + eVar2.a().a().a() + " was leaked. Did you forget to close a response body?", ((j.a) reference).f15822a);
                                list.remove(i6);
                                eVar2.f15768b = true;
                                if (list.isEmpty()) {
                                    eVar2.f15772f = j6 - this.f15790f;
                                    size = 0;
                                    break;
                                }
                            } else {
                                i6++;
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
                        long j10 = j6 - eVar2.f15772f;
                        if (j10 > j9) {
                            eVar = eVar2;
                            j9 = j10;
                        }
                    }
                }
                long j11 = this.f15790f;
                if (j9 < j11 && i <= this.f15789e) {
                    if (i > 0) {
                        return j11 - j9;
                    }
                    if (i4 > 0) {
                        return j11;
                    }
                    this.f15788b = false;
                    return -1L;
                }
                this.f15792h.remove(eVar);
                com.anythink.core.common.n.b.a.c.a(eVar.b());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int a(e eVar, long j6) {
        List<Reference<j>> list = eVar.f15771e;
        int i = 0;
        while (i < list.size()) {
            Reference<j> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                com.anythink.core.common.n.b.a.g.c.e().a("A connection to " + eVar.a().a().a() + " was leaked. Did you forget to close a response body?", ((j.a) reference).f15822a);
                list.remove(i);
                eVar.f15768b = true;
                if (list.isEmpty()) {
                    eVar.f15772f = j6 - this.f15790f;
                    return 0;
                }
            }
        }
        return list.size();
    }

    private void a(ah ahVar, IOException iOException) {
        if (ahVar.b().type() != Proxy.Type.DIRECT) {
            C0565a a9 = ahVar.a();
            a9.g().connectFailed(a9.a().a(), ahVar.b().address(), iOException);
        }
        this.f15787a.a(ahVar);
    }
}
