package N1;

import L1.C0003d;
import L1.C0011l;
import L1.InterfaceC0002c;
import L1.d0;
import Q1.o;
import Q1.s;
import Q1.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f714c = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f715d = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f716f = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f717g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f718h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    public final int f719a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.l f720b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    static {
        AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    }

    public b(int i2, C1.l lVar) {
        this.f719a = i2;
        this.f720b = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        h hVar = d.f721a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = e.get(this);
        h hVar2 = new h(0L, null, this, 3);
        this.sendSegment = hVar2;
        this.receiveSegment = hVar2;
        if (n()) {
            hVar2 = d.f721a;
            D1.i.c(hVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = hVar2;
        this._closeCause = d.f734q;
    }

    public static final h a(b bVar, long j2, h hVar) {
        Object b2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        bVar.getClass();
        h hVar2 = d.f721a;
        c cVar = c.i;
        loop0: while (true) {
            b2 = Q1.a.b(j2, hVar);
            if (!Q1.a.e(b2)) {
                s c2 = Q1.a.c(b2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f717g;
                    s sVar = (s) atomicReferenceFieldUpdater.get(bVar);
                    if (sVar.f970c >= c2.f970c) {
                        break loop0;
                    }
                    if (!c2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, sVar, c2)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != sVar) {
                            if (c2.e()) {
                                c2.d();
                            }
                        }
                    }
                    if (sVar.e()) {
                        sVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean e2 = Q1.a.e(b2);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f715d;
        if (e2) {
            bVar.e();
            if (hVar.f970c * d.f722b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            hVar.a();
            return null;
        }
        h hVar3 = (h) Q1.a.c(b2);
        long j5 = hVar3.f970c;
        if (j5 <= j2) {
            return hVar3;
        }
        long j6 = d.f722b * j5;
        do {
            atomicLongFieldUpdater = f714c;
            j3 = atomicLongFieldUpdater.get(bVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
            h hVar4 = d.f721a;
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * d.f722b >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        hVar3.a();
        return null;
    }

    public static final int b(b bVar, h hVar, int i2, Object obj, long j2, u uVar, boolean z2) {
        bVar.getClass();
        hVar.m(i2, obj);
        if (z2) {
            return bVar.u(hVar, i2, obj, j2, uVar, z2);
        }
        Object k2 = hVar.k(i2);
        if (k2 == null) {
            if (bVar.c(j2)) {
                if (hVar.j(null, i2, d.f724d)) {
                    return 1;
                }
            } else {
                if (uVar == null) {
                    return 3;
                }
                if (hVar.j(null, i2, uVar)) {
                    return 2;
                }
            }
        } else if (k2 instanceof d0) {
            hVar.m(i2, null);
            if (bVar.q(k2, obj)) {
                hVar.n(i2, d.i);
                return 0;
            }
            u uVar2 = d.f728k;
            if (hVar.f737f.getAndSet((i2 * 2) + 1, uVar2) != uVar2) {
                hVar.l(i2, true);
            }
            return 5;
        }
        return bVar.u(hVar, i2, obj, j2, uVar, z2);
    }

    public static void k(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f716f;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean r(Object obj) {
        if (obj instanceof InterfaceC0002c) {
            D1.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0002c) obj, t1.i.f4388c, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final boolean c(long j2) {
        return j2 < e.get(this) || j2 < f715d.get(this) + ((long) this.f719a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (N1.h) ((Q1.d) Q1.d.f941b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h d(long j2) {
        Object obj;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = i.get(this);
        h hVar = (h) f717g.get(this);
        if (hVar.f970c > ((h) obj2).f970c) {
            obj2 = hVar;
        }
        h hVar2 = (h) f718h.get(this);
        if (hVar2.f970c > ((h) obj2).f970c) {
            obj2 = hVar2;
        }
        Q1.d dVar = (Q1.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = Q1.d.f940a.get(dVar);
            u uVar = Q1.a.f934b;
            obj = null;
            if (obj3 == uVar) {
                break;
            }
            Q1.d dVar2 = (Q1.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = Q1.d.f940a;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, uVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        h hVar3 = (h) dVar;
        if (m()) {
            h hVar4 = hVar3;
            loop2: do {
                int i2 = d.f722b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (hVar4.f970c * d.f722b) + i2;
                    if (j3 < f715d.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = hVar4.k(i2);
                        if (k2 != null && k2 != d.e) {
                            if (k2 == d.f724d) {
                                break loop2;
                            }
                        } else {
                            if (hVar4.j(k2, i2, d.f729l)) {
                                hVar4.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (hVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                f(j3);
            }
        }
        loop5: for (h hVar5 = hVar3; hVar5 != null; hVar5 = (h) ((Q1.d) Q1.d.f941b.get(hVar5))) {
            for (int i3 = d.f722b - 1; -1 < i3; i3--) {
                if ((hVar5.f970c * d.f722b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = hVar5.k(i3);
                    if (k3 != null && k3 != d.e) {
                        if (!(k3 instanceof l)) {
                            if (!(k3 instanceof d0)) {
                                break;
                            }
                            if (hVar5.j(k3, i3, d.f729l)) {
                                obj = Q1.a.f(obj, k3);
                                hVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (hVar5.j(k3, i3, d.f729l)) {
                                obj = Q1.a.f(obj, ((l) k3).f739a);
                                hVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (hVar5.j(k3, i3, d.f729l)) {
                            hVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    p((d0) arrayList.get(size), true);
                }
            } else {
                p((d0) obj, true);
            }
        }
        return hVar3;
    }

    public final void e() {
        l(f714c.get(this), false);
    }

    public final void f(long j2) {
        C0011l a2;
        h hVar = (h) f718h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f715d;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f719a + j3, e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = d.f722b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (hVar.f970c != j5) {
                    h h2 = h(j5, hVar);
                    if (h2 == null) {
                        continue;
                    } else {
                        hVar = h2;
                    }
                }
                Object t2 = t(hVar, i2, j3, null);
                if (t2 != d.f732o) {
                    hVar.a();
                    C1.l lVar = this.f720b;
                    if (lVar != null && (a2 = Q1.a.a(lVar, t2, null)) != null) {
                        throw a2;
                    }
                } else if (j3 < j()) {
                    hVar.a();
                }
            }
        }
    }

    public final void g() {
        Object b2;
        if (n()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        h hVar = (h) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = e.getAndIncrement(this);
            long j2 = andIncrement / d.f722b;
            if (j() <= andIncrement) {
                if (hVar.f970c < j2 && hVar.b() != null) {
                    o(j2, hVar);
                }
                k(this);
                return;
            }
            if (hVar.f970c != j2) {
                c cVar = c.i;
                while (true) {
                    b2 = Q1.a.b(j2, hVar);
                    if (!Q1.a.e(b2)) {
                        s c2 = Q1.a.c(b2);
                        while (true) {
                            s sVar = (s) atomicReferenceFieldUpdater.get(this);
                            if (sVar.f970c >= c2.f970c) {
                                break;
                            }
                            if (!c2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c2)) {
                                if (atomicReferenceFieldUpdater.get(this) != sVar) {
                                    if (c2.e()) {
                                        c2.d();
                                    }
                                }
                            }
                            if (sVar.e()) {
                                sVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                h hVar2 = null;
                if (Q1.a.e(b2)) {
                    e();
                    o(j2, hVar);
                    k(this);
                } else {
                    h hVar3 = (h) Q1.a.c(b2);
                    long j3 = hVar3.f970c;
                    if (j3 > j2) {
                        long j4 = j3 * d.f722b;
                        if (e.compareAndSet(this, andIncrement + 1, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f716f;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            k(this);
                        }
                    } else {
                        hVar2 = hVar3;
                    }
                }
                if (hVar2 == null) {
                    continue;
                } else {
                    hVar = hVar2;
                }
            }
            int i2 = (int) (andIncrement % d.f722b);
            Object k2 = hVar.k(i2);
            boolean z2 = k2 instanceof d0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f715d;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !hVar.j(k2, i2, d.f726g)) {
                while (true) {
                    Object k3 = hVar.k(i2);
                    if (!(k3 instanceof d0)) {
                        if (k3 != d.j) {
                            if (k3 != null) {
                                if (k3 == d.f724d || k3 == d.f727h || k3 == d.i || k3 == d.f728k || k3 == d.f729l) {
                                    break loop0;
                                }
                                if (k3 != d.f725f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (hVar.j(k3, i2, d.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (hVar.j(k3, i2, new l((d0) k3))) {
                            break loop0;
                        }
                    } else if (hVar.j(k3, i2, d.f726g)) {
                        if (r(k3)) {
                            hVar.n(i2, d.f724d);
                            break;
                        } else {
                            hVar.n(i2, d.j);
                            hVar.h();
                        }
                    }
                }
            } else if (r(k2)) {
                hVar.n(i2, d.f724d);
                break;
            } else {
                hVar.n(i2, d.j);
                hVar.h();
                k(this);
            }
        }
        k(this);
    }

    public final h h(long j2, h hVar) {
        Object b2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        h hVar2 = d.f721a;
        c cVar = c.i;
        loop0: while (true) {
            b2 = Q1.a.b(j2, hVar);
            if (!Q1.a.e(b2)) {
                s c2 = Q1.a.c(b2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f718h;
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f970c >= c2.f970c) {
                        break loop0;
                    }
                    if (!c2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c2)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (c2.e()) {
                                c2.d();
                            }
                        }
                    }
                    if (sVar.e()) {
                        sVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (Q1.a.e(b2)) {
            e();
            if (hVar.f970c * d.f722b >= j()) {
                return null;
            }
            hVar.a();
            return null;
        }
        h hVar3 = (h) Q1.a.c(b2);
        boolean n2 = n();
        long j4 = hVar3.f970c;
        if (!n2 && j2 <= e.get(this) / d.f722b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
                s sVar2 = (s) atomicReferenceFieldUpdater2.get(this);
                if (sVar2.f970c >= j4 || !hVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, hVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != sVar2) {
                        if (hVar3.e()) {
                            hVar3.d();
                        }
                    }
                }
                if (sVar2.e()) {
                    sVar2.d();
                }
            }
        }
        if (j4 <= j2) {
            return hVar3;
        }
        long j5 = d.f722b * j4;
        do {
            atomicLongFieldUpdater = f715d;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * d.f722b >= j()) {
            return null;
        }
        hVar3.a();
        return null;
    }

    public final Throwable i() {
        Throwable th = (Throwable) j.get(this);
        return th == null ? new j("Channel was closed") : th;
    }

    public final long j() {
        return f714c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (N1.h) ((Q1.d) Q1.d.f941b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f715d;
        if (i2 == 2) {
            d(j2 & 1152921504606846975L);
            if (z2) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f718h;
                    h hVar = (h) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (j() <= j3) {
                        break;
                    }
                    long j4 = d.f722b;
                    long j5 = j3 / j4;
                    if (hVar.f970c != j5 && (hVar = h(j5, hVar)) == null) {
                        if (((h) atomicReferenceFieldUpdater.get(this)).f970c < j5) {
                            break;
                        }
                    } else {
                        hVar.a();
                        int i3 = (int) (j3 % j4);
                        while (true) {
                            Object k2 = hVar.k(i3);
                            if (k2 == null || k2 == d.e) {
                                if (hVar.j(k2, i3, d.f727h)) {
                                    g();
                                    break;
                                }
                            } else {
                                if (k2 == d.f724d) {
                                    return false;
                                }
                                if (k2 != d.j && k2 != d.f729l && k2 != d.i && k2 != d.f727h) {
                                    if (k2 == d.f726g) {
                                        return false;
                                    }
                                    if (k2 != d.f725f && j3 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f715d.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(D1.h.e("unexpected close status: ", i2).toString());
            }
            h d2 = d(j2 & 1152921504606846975L);
            C0011l c0011l = null;
            Object obj = null;
            loop0: do {
                int i4 = d.f722b - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    long j6 = (d2.f970c * d.f722b) + i4;
                    while (true) {
                        Object k3 = d2.k(i4);
                        if (k3 == d.i) {
                            break loop0;
                        }
                        u uVar = d.f724d;
                        AtomicReferenceArray atomicReferenceArray = d2.f737f;
                        C1.l lVar = this.f720b;
                        if (k3 == uVar) {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (d2.j(k3, i4, d.f729l)) {
                                if (lVar != null) {
                                    c0011l = Q1.a.a(lVar, atomicReferenceArray.get(i4 * 2), c0011l);
                                }
                                d2.m(i4, null);
                                d2.h();
                            }
                        } else if (k3 == d.e || k3 == null) {
                            if (d2.j(k3, i4, d.f729l)) {
                                d2.h();
                                break;
                            }
                        } else if (!(k3 instanceof d0) && !(k3 instanceof l)) {
                            u uVar2 = d.f726g;
                            if (k3 == uVar2 || k3 == d.f725f) {
                                break loop0;
                            }
                            if (k3 != uVar2) {
                                break;
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            d0 d0Var = k3 instanceof l ? ((l) k3).f739a : (d0) k3;
                            if (d2.j(k3, i4, d.f729l)) {
                                if (lVar != null) {
                                    c0011l = Q1.a.a(lVar, atomicReferenceArray.get(i4 * 2), c0011l);
                                }
                                obj = Q1.a.f(obj, d0Var);
                                d2.m(i4, null);
                                d2.h();
                            }
                        }
                    }
                    i4--;
                }
            } while (d2 != null);
            if (obj != null) {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        p((d0) arrayList.get(size), false);
                    }
                } else {
                    p((d0) obj, false);
                }
            }
            if (c0011l != null) {
                throw c0011l;
            }
        }
        return true;
    }

    public boolean m() {
        return false;
    }

    public final boolean n() {
        long j2 = e.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(long j2, h hVar) {
        h hVar2;
        h hVar3;
        while (hVar.f970c < j2 && (hVar3 = (h) hVar.b()) != null) {
            hVar = hVar3;
        }
        while (true) {
            if (!hVar.c() || (hVar2 = (h) hVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f970c >= hVar.f970c) {
                        return;
                    }
                    if (!hVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, hVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (hVar.e()) {
                                hVar.d();
                            }
                        }
                    }
                    if (sVar.e()) {
                        sVar.d();
                        return;
                    }
                    return;
                }
            }
            hVar = hVar2;
        }
    }

    public final void p(d0 d0Var, boolean z2) {
        Throwable i2;
        boolean z3 = d0Var instanceof InterfaceC0002c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        if (z3) {
            v1.d dVar = (v1.d) d0Var;
            if (z2) {
                i2 = (Throwable) atomicReferenceFieldUpdater.get(this);
                if (i2 == null) {
                    i2 = new i("Channel was closed");
                }
            } else {
                i2 = i();
            }
            dVar.b(new t1.e(i2));
            return;
        }
        if (!(d0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + d0Var).toString());
        }
        a aVar = (a) d0Var;
        C0003d c0003d = aVar.f712b;
        D1.i.b(c0003d);
        aVar.f712b = null;
        aVar.f711a = d.f729l;
        Throwable th = (Throwable) atomicReferenceFieldUpdater.get(aVar.f713c);
        if (th == null) {
            c0003d.b(Boolean.FALSE);
        } else {
            c0003d.b(new t1.e(th));
        }
    }

    public final boolean q(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0002c)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            D1.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0002c interfaceC0002c = (InterfaceC0002c) obj;
            C1.l lVar = this.f720b;
            return d.a(interfaceC0002c, obj2, lVar != null ? new o(lVar, obj2, ((C0003d) interfaceC0002c).e, 0) : null);
        }
        D1.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0003d c0003d = aVar.f712b;
        D1.i.b(c0003d);
        aVar.f712b = null;
        aVar.f711a = obj2;
        Boolean bool = Boolean.TRUE;
        C1.l lVar2 = aVar.f713c.f720b;
        return d.a(c0003d, bool, lVar2 != null ? new o(lVar2, obj2, c0003d.e, 0) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(Object obj) {
        h hVar;
        h hVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f714c;
        boolean z2 = l(atomicLongFieldUpdater.get(this), false) ? false : !c(r0 & 1152921504606846975L);
        f fVar = g.f736a;
        if (!z2) {
            u uVar = d.j;
            h hVar3 = (h) f717g.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean l2 = l(andIncrement, false);
                int i2 = d.f722b;
                long j3 = i2;
                long j4 = j2 / j3;
                int i3 = (int) (j2 % j3);
                if (hVar3.f970c != j4) {
                    h a2 = a(this, j4, hVar3);
                    if (a2 != null) {
                        hVar = a2;
                    } else if (l2) {
                        return new e(i());
                    }
                } else {
                    hVar = hVar3;
                }
                h hVar4 = hVar;
                int b2 = b(this, hVar, i3, obj, j2, uVar, l2);
                t1.i iVar = t1.i.f4388c;
                if (b2 == 0) {
                    hVar4.a();
                    break;
                }
                if (b2 == 1) {
                    break;
                }
                if (b2 == 2) {
                    if (l2) {
                        hVar4.h();
                        return new e(i());
                    }
                    d0 d0Var = uVar instanceof d0 ? (d0) uVar : null;
                    if (d0Var != null) {
                        hVar2 = hVar4;
                        d0Var.a(hVar2, i3 + i2);
                    } else {
                        hVar2 = hVar4;
                    }
                    hVar2.h();
                    return fVar;
                }
                if (b2 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (b2 == 4) {
                    if (j2 < f715d.get(this)) {
                        hVar4.a();
                    }
                    return new e(i());
                }
                if (b2 == 5) {
                    hVar4.a();
                }
                hVar3 = hVar4;
            }
        } else {
            return fVar;
        }
    }

    public final Object t(h hVar, int i2, long j2, a aVar) {
        Object k2 = hVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = hVar.f737f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f714c;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (aVar == null) {
                    return d.f731n;
                }
                if (hVar.j(k2, i2, aVar)) {
                    g();
                    return d.f730m;
                }
            }
        } else if (k2 == d.f724d && hVar.j(k2, i2, d.i)) {
            g();
            Object obj = atomicReferenceArray.get(i2 * 2);
            hVar.m(i2, null);
            return obj;
        }
        while (true) {
            Object k3 = hVar.k(i2);
            if (k3 == null || k3 == d.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (hVar.j(k3, i2, d.f727h)) {
                        g();
                        return d.f732o;
                    }
                } else {
                    if (aVar == null) {
                        return d.f731n;
                    }
                    if (hVar.j(k3, i2, aVar)) {
                        g();
                        return d.f730m;
                    }
                }
            } else {
                if (k3 != d.f724d) {
                    u uVar = d.j;
                    if (k3 != uVar && k3 != d.f727h) {
                        if (k3 == d.f729l) {
                            g();
                            return d.f732o;
                        }
                        if (k3 != d.f726g && hVar.j(k3, i2, d.f725f)) {
                            boolean z2 = k3 instanceof l;
                            if (z2) {
                                k3 = ((l) k3).f739a;
                            }
                            if (r(k3)) {
                                hVar.n(i2, d.i);
                                g();
                                Object obj2 = atomicReferenceArray.get(i2 * 2);
                                hVar.m(i2, null);
                                return obj2;
                            }
                            hVar.n(i2, uVar);
                            hVar.h();
                            if (z2) {
                                g();
                            }
                            return d.f732o;
                        }
                    }
                    return d.f732o;
                }
                if (hVar.j(k3, i2, d.i)) {
                    g();
                    Object obj3 = atomicReferenceArray.get(i2 * 2);
                    hVar.m(i2, null);
                    return obj3;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r3 = (N1.h) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a1, code lost:
    
        if (r3 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f714c.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f719a + ',');
        sb.append("data=[");
        int i3 = 0;
        List F2 = u1.h.F(f718h.get(this), f717g.get(this), i.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : F2) {
            if (((h) obj2) != d.f721a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((h) next).f970c;
            do {
                Object next2 = it.next();
                long j3 = ((h) next2).f970c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        h hVar = (h) next;
        long j4 = f715d.get(this);
        long j5 = j();
        loop2: while (true) {
            int i4 = d.f722b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j6 = (hVar.f970c * d.f722b) + i5;
                if (j6 >= j5 && j6 >= j4) {
                    break loop2;
                }
                Object k2 = hVar.k(i5);
                Object obj3 = hVar.f737f.get(i5 * 2);
                if (k2 instanceof InterfaceC0002c) {
                    obj = (j6 >= j4 || j6 < j5) ? (j6 >= j5 || j6 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof l) {
                    obj = "EB(" + k2 + ')';
                } else if (D1.i.a(k2, d.f725f) ? true : D1.i.a(k2, d.f726g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? true : k2.equals(d.e) ? true : D1.i.a(k2, d.i) ? true : D1.i.a(k2, d.f727h) ? true : D1.i.a(k2, d.f728k) ? true : D1.i.a(k2, d.j) ? true : D1.i.a(k2, d.f729l)) {
                    i5++;
                } else {
                    obj = k2.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i5++;
            }
            i3 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(K1.d.h0(sb)) == ',') {
            D1.i.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final int u(h hVar, int i2, Object obj, long j2, u uVar, boolean z2) {
        while (true) {
            Object k2 = hVar.k(i2);
            if (k2 == null) {
                if (!c(j2) || z2) {
                    if (z2) {
                        if (hVar.j(null, i2, d.j)) {
                            hVar.h();
                            return 4;
                        }
                    } else {
                        if (uVar == null) {
                            return 3;
                        }
                        if (hVar.j(null, i2, uVar)) {
                            return 2;
                        }
                    }
                } else if (hVar.j(null, i2, d.f724d)) {
                    return 1;
                }
            } else {
                if (k2 != d.e) {
                    u uVar2 = d.f728k;
                    if (k2 == uVar2) {
                        hVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f727h) {
                        hVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f729l) {
                        hVar.m(i2, null);
                        e();
                        return 4;
                    }
                    hVar.m(i2, null);
                    if (k2 instanceof l) {
                        k2 = ((l) k2).f739a;
                    }
                    if (q(k2, obj)) {
                        hVar.n(i2, d.i);
                        return 0;
                    }
                    if (hVar.f737f.getAndSet((i2 * 2) + 1, uVar2) == uVar2) {
                        return 5;
                    }
                    hVar.l(i2, true);
                    return 5;
                }
                if (hVar.j(k2, i2, d.f724d)) {
                    return 1;
                }
            }
        }
    }
}
