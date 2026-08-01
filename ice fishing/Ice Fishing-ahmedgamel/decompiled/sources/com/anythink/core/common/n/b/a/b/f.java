package com.anythink.core.common.n.b.a.b;

import D.RunnableC0282a;
import com.anythink.core.common.n.b.C0546a;
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
    static final /* synthetic */ boolean f14998c = true;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f14999d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.anythink.core.common.n.b.a.c.a(aa.f15462a + " ConnectionPool", true));

    /* renamed from: b, reason: collision with root package name */
    boolean f15001b;

    /* renamed from: e, reason: collision with root package name */
    private final int f15002e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15003f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f15004g = new RunnableC0282a(14, this);

    /* renamed from: h, reason: collision with root package name */
    private final Deque<e> f15005h = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    final g f15000a = new g();

    public f(int i, TimeUnit timeUnit) {
        this.f15002e = i;
        this.f15003f = timeUnit.toNanos(5L);
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
        return this.f15005h.size();
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<e> it = this.f15005h.iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (next.f14984e.isEmpty()) {
                        next.f14981b = true;
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
        Iterator<e> it = this.f15005h.iterator();
        i = 0;
        while (it.hasNext()) {
            if (it.next().f14984e.isEmpty()) {
                i++;
            }
        }
        return i;
    }

    public final boolean b(e eVar) {
        if (!f14998c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (eVar.f14981b || this.f15002e == 0) {
            this.f15005h.remove(eVar);
            return true;
        }
        notifyAll();
        return false;
    }

    public final boolean a(C0546a c0546a, j jVar, List<ah> list, boolean z3) {
        if (!f14998c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (e eVar : this.f15005h) {
            if (!z3 || eVar.g()) {
                if (eVar.a(c0546a, list)) {
                    jVar.a(eVar);
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(e eVar) {
        if (!f14998c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.f15001b) {
            this.f15001b = true;
            f14999d.execute(this.f15004g);
        }
        this.f15005h.add(eVar);
    }

    private long a(long j6) {
        int size;
        synchronized (this) {
            try {
                e eVar = null;
                long j9 = Long.MIN_VALUE;
                int i = 0;
                int i6 = 0;
                for (e eVar2 : this.f15005h) {
                    List<Reference<j>> list = eVar2.f14984e;
                    int i9 = 0;
                    while (true) {
                        if (i9 < list.size()) {
                            Reference<j> reference = list.get(i9);
                            if (reference.get() == null) {
                                com.anythink.core.common.n.b.a.g.c.e().a("A connection to " + eVar2.a().a().a() + " was leaked. Did you forget to close a response body?", ((j.a) reference).f15035a);
                                list.remove(i9);
                                eVar2.f14981b = true;
                                if (list.isEmpty()) {
                                    eVar2.f14985f = j6 - this.f15003f;
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
                        i6++;
                    } else {
                        i++;
                        long j10 = j6 - eVar2.f14985f;
                        if (j10 > j9) {
                            eVar = eVar2;
                            j9 = j10;
                        }
                    }
                }
                long j11 = this.f15003f;
                if (j9 < j11 && i <= this.f15002e) {
                    if (i > 0) {
                        return j11 - j9;
                    }
                    if (i6 > 0) {
                        return j11;
                    }
                    this.f15001b = false;
                    return -1L;
                }
                this.f15005h.remove(eVar);
                com.anythink.core.common.n.b.a.c.a(eVar.b());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int a(e eVar, long j6) {
        List<Reference<j>> list = eVar.f14984e;
        int i = 0;
        while (i < list.size()) {
            Reference<j> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                com.anythink.core.common.n.b.a.g.c.e().a("A connection to " + eVar.a().a().a() + " was leaked. Did you forget to close a response body?", ((j.a) reference).f15035a);
                list.remove(i);
                eVar.f14981b = true;
                if (list.isEmpty()) {
                    eVar.f14985f = j6 - this.f15003f;
                    return 0;
                }
            }
        }
        return list.size();
    }

    private void a(ah ahVar, IOException iOException) {
        if (ahVar.b().type() != Proxy.Type.DIRECT) {
            C0546a a9 = ahVar.a();
            a9.g().connectFailed(a9.a().a(), ahVar.b().address(), iOException);
        }
        this.f15000a.a(ahVar);
    }
}
