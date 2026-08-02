package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class x7h implements mo4 {
    public static final l2i E;
    public static final l2i F;
    public static final sgr G;
    public static final Random H;
    public final /* synthetic */ k3i A;
    public final /* synthetic */ ks3 B;
    public final /* synthetic */ we6 C;
    public final /* synthetic */ u76 D;
    public final k3i a;
    public final Executor b;
    public final vq6 c;
    public final ScheduledExecutorService d;
    public final s2i e;
    public final tbo f;
    public final zwd g;
    public final boolean h;
    public final Object i;
    public final gao j;
    public final long k;
    public final long l;
    public final mao m;
    public final joe n;
    public volatile iao o;
    public final AtomicBoolean p;
    public final AtomicInteger q;
    public final AtomicInteger r;
    public sfm s;
    public long t;
    public oo4 u;
    public r0o v;
    public r0o w;
    public long x;
    public sgr y;
    public boolean z;

    static {
        rwd rwdVar = s2i.d;
        BitSet bitSet = o2i.d;
        E = new l2i("grpc-previous-rpc-attempts", rwdVar);
        F = new l2i("grpc-retry-pushback-ms", rwdVar);
        G = sgr.f.i("Stream thrown away because RetriableStream committed");
        H = new Random();
    }

    public x7h(u76 u76Var, k3i k3iVar, s2i s2iVar, ks3 ks3Var, tbo tboVar, zwd zwdVar, we6 we6Var) {
        this.D = u76Var;
        this.A = k3iVar;
        this.B = ks3Var;
        this.C = we6Var;
        j8h j8hVar = (j8h) u76Var.a;
        gao gaoVar = j8hVar.T;
        long j = j8hVar.U;
        long j2 = j8hVar.V;
        Executor executor = ks3Var.b;
        executor = executor == null ? j8hVar.h : executor;
        ScheduledExecutorService scheduledExecutorService = j8hVar.f.a.d;
        mao maoVar = (mao) u76Var.b;
        this.c = new vq6(new y9o());
        this.i = new Object();
        this.n = new joe(0);
        this.o = new iao(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.p = new AtomicBoolean();
        this.q = new AtomicInteger();
        this.r = new AtomicInteger();
        this.a = k3iVar;
        this.j = gaoVar;
        this.k = j;
        this.l = j2;
        this.b = executor;
        this.d = scheduledExecutorService;
        this.e = s2iVar;
        this.f = tboVar;
        if (tboVar != null) {
            this.x = tboVar.b;
        }
        this.g = zwdVar;
        o2g.J("Should not provide both retryPolicy and hedgingPolicy", tboVar == null || zwdVar == null);
        this.h = zwdVar != null;
        this.m = maoVar;
    }

    public static void b(x7h x7hVar, Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            x7hVar.h();
            return;
        }
        synchronized (x7hVar.i) {
            try {
                r0o r0oVar = x7hVar.w;
                if (r0oVar == null) {
                    return;
                }
                r0oVar.b = true;
                Future future = (Future) r0oVar.d;
                r0o r0oVar2 = new r0o(x7hVar.i);
                x7hVar.w = r0oVar2;
                if (future != null) {
                    future.cancel(false);
                }
                r0oVar2.d(x7hVar.d.schedule(new e8h(12, x7hVar, r0oVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bjr
    public final void E(rym rymVar) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.mo4
    public final void M(int i) {
        e(new bao(i, 0));
    }

    @Override // defpackage.bjr
    public final void X() {
        e(new aao(2));
    }

    @Override // defpackage.bjr
    public final void a() {
        iao iaoVar = this.o;
        if (iaoVar.a) {
            iaoVar.f.a.a();
        } else {
            e(new aao(3));
        }
    }

    @Override // defpackage.mo4
    public final void a0(ch7 ch7Var) {
        e(new z9o(2, ch7Var));
    }

    public final lr1 c(lao laoVar) {
        List list;
        boolean z;
        Collection collection;
        Future future;
        Future future2;
        synchronized (this.i) {
            try {
                if (this.o.f != null) {
                    return null;
                }
                Collection collection2 = this.o.c;
                iao iaoVar = this.o;
                o2g.U("Already committed", iaoVar.f == null);
                List list2 = iaoVar.b;
                if (iaoVar.c.contains(laoVar)) {
                    list = null;
                    collection = Collections.singleton(laoVar);
                    z = true;
                } else {
                    list = list2;
                    z = false;
                    collection = Collections.EMPTY_LIST;
                }
                this.o = new iao(list, collection, iaoVar.d, laoVar, iaoVar.g, z, iaoVar.h, iaoVar.e);
                ((AtomicLong) this.j.a).addAndGet(-this.t);
                r0o r0oVar = this.v;
                if (r0oVar != null) {
                    r0oVar.b = true;
                    Future future3 = (Future) r0oVar.d;
                    this.v = null;
                    future = future3;
                } else {
                    future = null;
                }
                r0o r0oVar2 = this.w;
                if (r0oVar2 != null) {
                    r0oVar2.b = true;
                    Future future4 = (Future) r0oVar2.d;
                    this.w = null;
                    future2 = future4;
                } else {
                    future2 = null;
                }
                return new lr1(this, collection2, laoVar, future, future2, 7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final lao d(int i, boolean z) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.r;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        lao laoVar = new lao(i);
        dao daoVar = new dao(new fao(this, laoVar));
        s2i s2iVar = new s2i();
        s2iVar.e(this.e);
        if (i > 0) {
            s2iVar.g(E, String.valueOf(i));
        }
        ks3 ks3Var = this.B;
        ks3Var.getClass();
        List list = ks3Var.d;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(daoVar);
        eps b = ks3.b(ks3Var);
        b.d = Collections.unmodifiableList(arrayList);
        ks3 ks3Var2 = new ks3(b);
        qo4[] c = xqd.c(ks3Var2, s2iVar, i, z);
        k3i k3iVar = this.A;
        ro4 h = this.D.h(new dsk(k3iVar, s2iVar, ks3Var2));
        we6 we6Var = this.C;
        we6 b2 = we6Var.b();
        try {
            mo4 f = h.f(k3iVar, s2iVar, ks3Var2, c);
            we6Var.D(b2);
            laoVar.a = f;
            return laoVar;
        } catch (Throwable th) {
            we6Var.D(b2);
            throw th;
        }
    }

    public final void e(eao eaoVar) {
        Collection collection;
        synchronized (this.i) {
            try {
                if (!this.o.a) {
                    this.o.b.add(eaoVar);
                }
                collection = this.o.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eaoVar.a((lao) it.next());
        }
    }

    @Override // defpackage.mo4
    public final void f(sgr sgrVar) {
        lao laoVar;
        lao laoVar2 = new lao(0);
        laoVar2.a = new lej();
        lr1 c = c(laoVar2);
        Object obj = this.i;
        if (c != null) {
            synchronized (obj) {
                this.o = this.o.e(laoVar2);
            }
            c.run();
            j(sgrVar, no4.a, new s2i());
            return;
        }
        synchronized (obj) {
            try {
                if (this.o.c.contains(this.o.f)) {
                    laoVar = this.o.f;
                } else {
                    this.y = sgrVar;
                    laoVar = null;
                }
                iao iaoVar = this.o;
                this.o = new iao(iaoVar.b, iaoVar.c, iaoVar.d, iaoVar.f, true, iaoVar.a, iaoVar.h, iaoVar.e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (laoVar != null) {
            laoVar.a.f(sgrVar);
        }
    }

    @Override // defpackage.bjr
    public final void flush() {
        iao iaoVar = this.o;
        if (iaoVar.a) {
            iaoVar.f.a.flush();
        } else {
            e(new aao(0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r8.c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r9.a.v0(new defpackage.jtc(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r0 = r9.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r8.o.f != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r9 = r8.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        r0.f(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        r9 = defpackage.x7h.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        r4 = (defpackage.eao) r0.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if ((r4 instanceof defpackage.hao) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        r4 = r8.o;
        r5 = r4.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
    
        if (r4.g == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(lao laoVar) {
        int min;
        int i = 0;
        dsd dsdVar = null;
        boolean z = false;
        ArrayList arrayList = null;
        while (true) {
            synchronized (this.i) {
                try {
                    iao iaoVar = this.o;
                    lao laoVar2 = iaoVar.f;
                    if (laoVar2 == null || laoVar2 == laoVar) {
                        if (!iaoVar.g) {
                            if (i == iaoVar.b.size()) {
                                this.o = iaoVar.e(laoVar);
                                if (!p()) {
                                    return;
                                } else {
                                    dsdVar = new dsd(26, this);
                                }
                            } else {
                                if (laoVar.b) {
                                    return;
                                }
                                min = Math.min(i + 128, iaoVar.b.size());
                                if (arrayList == null) {
                                    arrayList = new ArrayList(iaoVar.b.subList(i, min));
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(iaoVar.b.subList(i, min));
                                }
                            }
                        }
                    }
                } finally {
                }
            }
            i = min;
        }
    }

    public final void h() {
        Future future;
        synchronized (this.i) {
            try {
                r0o r0oVar = this.w;
                future = null;
                if (r0oVar != null) {
                    r0oVar.b = true;
                    Future future2 = (Future) r0oVar.d;
                    this.w = null;
                    future = future2;
                }
                iao iaoVar = this.o;
                if (!iaoVar.h) {
                    iaoVar = new iao(iaoVar.b, iaoVar.c, iaoVar.d, iaoVar.f, iaoVar.g, iaoVar.a, true, iaoVar.e);
                }
                this.o = iaoVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    @Override // defpackage.mo4
    public final void h0(ce7 ce7Var) {
        e(new z9o(1, ce7Var));
    }

    public final boolean i(iao iaoVar) {
        return iaoVar.f == null && iaoVar.e < this.g.a && !iaoVar.h;
    }

    public final void j(sgr sgrVar, no4 no4Var, s2i s2iVar) {
        this.s = new sfm(sgrVar, no4Var, s2iVar);
        if (this.r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.c.execute(new t5(this, sgrVar, no4Var, s2iVar, 9));
        }
    }

    public final void k(Object obj) {
        iao iaoVar = this.o;
        if (!iaoVar.a) {
            e(new cao(this, obj));
            return;
        }
        mo4 mo4Var = iaoVar.f.a;
        sym symVar = this.a.d;
        symVar.getClass();
        mo4Var.E(new rym((vzh) obj, symVar.a));
    }

    @Override // defpackage.mo4
    public final void l(int i) {
        e(new bao(i, 1));
    }

    @Override // defpackage.mo4
    public final void l0() {
        e(new aao(1));
    }

    @Override // defpackage.bjr
    public final boolean p() {
        Iterator it = this.o.c.iterator();
        while (it.hasNext()) {
            if (((lao) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bjr
    public final void r(nq4 nq4Var) {
        e(new z9o(0, nq4Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        if ((r3.d.get() > r3.b) != false) goto L35;
     */
    @Override // defpackage.mo4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(oo4 oo4Var) {
        sgr sgrVar;
        r0o r0oVar;
        this.u = oo4Var;
        g06 g06Var = ((j8h) this.D.a).E;
        synchronized (g06Var.a) {
            try {
                sgrVar = (sgr) g06Var.c;
                r0oVar = null;
                if (sgrVar == null) {
                    ((HashSet) g06Var.b).add(this);
                    sgrVar = null;
                }
            } finally {
            }
        }
        if (sgrVar != null) {
            f(sgrVar);
            return;
        }
        synchronized (this.i) {
            this.o.b.add(new hao(this));
        }
        lao d = d(0, false);
        if (d == null) {
            return;
        }
        if (this.h) {
            synchronized (this.i) {
                try {
                    this.o = this.o.a(d);
                    if (i(this.o)) {
                        mao maoVar = this.m;
                        if (maoVar != null) {
                        }
                        r0oVar = new r0o(this.i);
                        this.w = r0oVar;
                    }
                } finally {
                }
            }
            if (r0oVar != null) {
                r0oVar.d(this.d.schedule(new e8h(12, this, r0oVar), this.g.b, TimeUnit.NANOSECONDS));
            }
        }
        g(d);
    }

    @Override // defpackage.mo4
    public final void y0(joe joeVar) {
        iao iaoVar;
        synchronized (this.i) {
            joeVar.f(this.n, "closed");
            iaoVar = this.o;
        }
        if (iaoVar.f != null) {
            joe joeVar2 = new joe(0);
            iaoVar.f.a.y0(joeVar2);
            joeVar.f(joeVar2, "committed");
            return;
        }
        joe joeVar3 = new joe(0);
        for (lao laoVar : iaoVar.c) {
            joe joeVar4 = new joe(0);
            laoVar.a.y0(joeVar4);
            joeVar3.b.add(String.valueOf(joeVar4));
        }
        joeVar.f(joeVar3, "open");
    }
}
