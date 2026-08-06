package C1;

import A1.AbstractC0022x;
import A1.C0005f;
import A1.C0015p;
import A1.InterfaceC0004e;
import A1.n0;
import F.InterfaceC0033i;
import h1.C0239i;
import i1.AbstractC0253j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m1.EnumC0985a;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f150c = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f151d = AtomicLongFieldUpdater.newUpdater(c.class, "receivers");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f152e = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f153f = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f154g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f155h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f156i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f157j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f158k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    public final int f159a;

    /* renamed from: b, reason: collision with root package name */
    public final t1.l f160b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public c(int i2, t1.l lVar) {
        this.f159a = i2;
        this.f160b = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(a.g(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.f162a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f152e.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment = kVar2;
        this.receiveSegment = kVar2;
        if (u()) {
            kVar2 = e.f162a;
            kotlin.jvm.internal.i.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = kVar2;
        this._closeCause = e.f180s;
    }

    public static final k b(c cVar, long j2, k kVar) {
        Object b2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        cVar.getClass();
        k kVar2 = e.f162a;
        d dVar = d.f161a;
        loop0: while (true) {
            b2 = F1.a.b(kVar, j2, dVar);
            if (!F1.a.e(b2)) {
                F1.u c2 = F1.a.c(b2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f154g;
                    F1.u uVar = (F1.u) atomicReferenceFieldUpdater.get(cVar);
                    if (uVar.f631c >= c2.f631c) {
                        break loop0;
                    }
                    if (!c2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, uVar, c2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != uVar) {
                            if (c2.e()) {
                                c2.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean e2 = F1.a.e(b2);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f151d;
        if (e2) {
            cVar.s();
            if (kVar.f631c * e.f163b >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) F1.a.c(b2);
        long j5 = kVar3.f631c;
        if (j5 <= j2) {
            return kVar3;
        }
        long j6 = e.f163b * j5;
        do {
            atomicLongFieldUpdater = f150c;
            j3 = atomicLongFieldUpdater.get(cVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * e.f163b >= atomicLongFieldUpdater2.get(cVar)) {
            return null;
        }
        kVar3.a();
        return null;
    }

    public static final void c(c cVar, Object obj, C0005f c0005f) {
        C0015p a2;
        t1.l lVar = cVar.f160b;
        if (lVar != null && (a2 = F1.a.a(lVar, obj, null)) != null) {
            AbstractC0022x.d(a2, c0005f.f48e);
        }
        c0005f.i(R1.l.h(cVar.o()));
    }

    public static final int d(c cVar, k kVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        cVar.getClass();
        kVar.m(i2, obj);
        if (z2) {
            return cVar.B(kVar, i2, obj, j2, obj2, z2);
        }
        Object k2 = kVar.k(i2);
        if (k2 == null) {
            if (cVar.e(j2)) {
                if (kVar.j(i2, null, e.f165d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof n0) {
            kVar.m(i2, null);
            if (cVar.y(k2, obj)) {
                kVar.n(i2, e.f170i);
                return 0;
            }
            C.j jVar = e.f172k;
            if (kVar.f187f.getAndSet((i2 * 2) + 1, jVar) != jVar) {
                kVar.l(i2, true);
            }
            return 5;
        }
        return cVar.B(kVar, i2, obj, j2, obj2, z2);
    }

    public static void q(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f153f;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (obj instanceof InterfaceC0004e) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return e.a((InterfaceC0004e) obj, C0239i.f3393a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object A(k kVar, int i2, long j2, Object obj) {
        Object k2 = kVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = kVar.f187f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f150c;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f175n;
                }
                if (kVar.j(i2, k2, obj)) {
                    k();
                    return e.f174m;
                }
            }
        } else if (k2 == e.f165d && kVar.j(i2, k2, e.f170i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            kVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k3 = kVar.k(i2);
            if (k3 == null || k3 == e.f166e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i2, k3, e.f169h)) {
                        k();
                        return e.f176o;
                    }
                } else {
                    if (obj == null) {
                        return e.f175n;
                    }
                    if (kVar.j(i2, k3, obj)) {
                        k();
                        return e.f174m;
                    }
                }
            } else if (k3 != e.f165d) {
                C.j jVar = e.f171j;
                if (k3 == jVar) {
                    return e.f176o;
                }
                if (k3 == e.f169h) {
                    return e.f176o;
                }
                if (k3 == e.f173l) {
                    k();
                    return e.f176o;
                }
                if (k3 != e.f168g && kVar.j(i2, k3, e.f167f)) {
                    boolean z2 = k3 instanceof u;
                    if (z2) {
                        k3 = ((u) k3).f196a;
                    }
                    if (z(k3)) {
                        kVar.n(i2, e.f170i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        kVar.m(i2, null);
                        return obj3;
                    }
                    kVar.n(i2, jVar);
                    kVar.h();
                    if (z2) {
                        k();
                    }
                    return e.f176o;
                }
            } else if (kVar.j(i2, k3, e.f170i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                kVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int B(k kVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        while (true) {
            Object k2 = kVar.k(i2);
            if (k2 == null) {
                if (!e(j2) || z2) {
                    if (z2) {
                        if (kVar.j(i2, null, e.f171j)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(i2, null, e.f165d)) {
                    return 1;
                }
            } else {
                if (k2 != e.f166e) {
                    C.j jVar = e.f172k;
                    if (k2 == jVar) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == e.f169h) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == e.f173l) {
                        kVar.m(i2, null);
                        s();
                        return 4;
                    }
                    kVar.m(i2, null);
                    if (k2 instanceof u) {
                        k2 = ((u) k2).f196a;
                    }
                    if (y(k2, obj)) {
                        kVar.n(i2, e.f170i);
                        return 0;
                    }
                    if (kVar.f187f.getAndSet((i2 * 2) + 1, jVar) == jVar) {
                        return 5;
                    }
                    kVar.l(i2, true);
                    return 5;
                }
                if (kVar.j(i2, k2, e.f165d)) {
                    return 1;
                }
            }
        }
    }

    public final void C(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        if (u()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f152e;
        } while (atomicLongFieldUpdater.get(this) <= j2);
        int i2 = e.f164c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f153f;
            if (i3 >= i2) {
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, 4611686018427387904L + (j3 & 4611686018427387903L)));
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(this);
                    long j6 = atomicLongFieldUpdater2.get(this);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z2 = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z2) {
                        atomicLongFieldUpdater2.compareAndSet(this, j6, j7 + 4611686018427387904L);
                    }
                }
                do {
                    j4 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, j4 & 4611686018427387903L));
                return;
            }
            long j8 = atomicLongFieldUpdater.get(this);
            if (j8 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j8 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // C1.s
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final boolean e(long j2) {
        return j2 < f152e.get(this) || j2 < f151d.get(this) + ((long) this.f159a);
    }

    public final boolean f(Throwable th, boolean z2) {
        boolean z3;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f150c;
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                k kVar = e.f162a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (1 << 60) + (j6 & 1152921504606846975L)));
        }
        C.j jVar = e.f180s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f157j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, jVar, th)) {
                z3 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != jVar) {
                z3 = false;
                break;
            }
        }
        if (z2) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (3 << 60) + (j5 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = j2 & 1152921504606846975L;
                    j4 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j2 & 1152921504606846975L;
                    j4 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j2, (j4 << 60) + j3));
        }
        s();
        if (z3) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f158k;
                obj = atomicReferenceFieldUpdater2.get(this);
                C.j jVar2 = obj == null ? e.f178q : e.f179r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, jVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                kotlin.jvm.internal.s.a(1, obj);
                ((t1.l) obj).invoke(m());
            }
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // C1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(Object obj) {
        k kVar;
        k kVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f150c;
        boolean z2 = r(atomicLongFieldUpdater.get(this), false) ? false : !e(r0 & 1152921504606846975L);
        i iVar = j.f185a;
        if (!z2) {
            InterfaceC0033i interfaceC0033i = e.f171j;
            k kVar3 = (k) f154g.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean r2 = r(andIncrement, false);
                int i2 = e.f163b;
                long j3 = i2;
                long j4 = j2 / j3;
                int i3 = (int) (j2 % j3);
                if (kVar3.f631c != j4) {
                    k b2 = b(this, j4, kVar3);
                    if (b2 != null) {
                        kVar = b2;
                    } else if (r2) {
                        return new h(o());
                    }
                } else {
                    kVar = kVar3;
                }
                k kVar4 = kVar;
                int d2 = d(this, kVar, i3, obj, j2, interfaceC0033i, r2);
                C0239i c0239i = C0239i.f3393a;
                if (d2 == 0) {
                    kVar4.a();
                    break;
                }
                if (d2 == 1) {
                    break;
                }
                if (d2 == 2) {
                    if (r2) {
                        kVar4.h();
                        return new h(o());
                    }
                    n0 n0Var = interfaceC0033i instanceof n0 ? (n0) interfaceC0033i : null;
                    if (n0Var != null) {
                        kVar2 = kVar4;
                        n0Var.a(kVar2, i3 + i2);
                    } else {
                        kVar2 = kVar4;
                    }
                    kVar2.h();
                    return iVar;
                }
                if (d2 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (d2 == 4) {
                    if (j2 < f151d.get(this)) {
                        kVar4.a();
                    }
                    return new h(o());
                }
                if (d2 == 5) {
                    kVar4.a();
                }
                kVar3 = kVar4;
            }
        } else {
            return iVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (C1.k) ((F1.d) F1.d.f598b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k h(long j2) {
        Object obj;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f156i.get(this);
        k kVar = (k) f154g.get(this);
        if (kVar.f631c > ((k) obj2).f631c) {
            obj2 = kVar;
        }
        k kVar2 = (k) f155h.get(this);
        if (kVar2.f631c > ((k) obj2).f631c) {
            obj2 = kVar2;
        }
        F1.d dVar = (F1.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = F1.d.f597a.get(dVar);
            C.j jVar = F1.a.f590b;
            obj = null;
            if (obj3 == jVar) {
                break;
            }
            F1.d dVar2 = (F1.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = F1.d.f597a;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, jVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        k kVar3 = (k) dVar;
        if (t()) {
            k kVar4 = kVar3;
            loop2: do {
                int i2 = e.f163b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (kVar4.f631c * e.f163b) + i2;
                    if (j3 < f151d.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = kVar4.k(i2);
                        if (k2 != null && k2 != e.f166e) {
                            if (k2 == e.f165d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(i2, k2, e.f173l)) {
                                kVar4.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (kVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                i(j3);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((F1.d) F1.d.f598b.get(kVar5))) {
            for (int i3 = e.f163b - 1; -1 < i3; i3--) {
                if ((kVar5.f631c * e.f163b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = kVar5.k(i3);
                    if (k3 != null && k3 != e.f166e) {
                        if (!(k3 instanceof u)) {
                            if (!(k3 instanceof n0)) {
                                break;
                            }
                            if (kVar5.j(i3, k3, e.f173l)) {
                                obj = F1.a.f(obj, k3);
                                kVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i3, k3, e.f173l)) {
                                obj = F1.a.f(obj, ((u) k3).f196a);
                                kVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i3, k3, e.f173l)) {
                            kVar5.h();
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
                    x((n0) arrayList.get(size), true);
                }
            } else {
                x((n0) obj, true);
            }
        }
        return kVar3;
    }

    public final void i(long j2) {
        C0015p a2;
        k kVar = (k) f155h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f151d;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f159a + j3, f152e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = e.f163b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (kVar.f631c != j5) {
                    k l2 = l(j5, kVar);
                    if (l2 == null) {
                        continue;
                    } else {
                        kVar = l2;
                    }
                }
                Object A2 = A(kVar, i2, j3, null);
                if (A2 != e.f176o) {
                    kVar.a();
                    t1.l lVar = this.f160b;
                    if (lVar != null && (a2 = F1.a.a(lVar, A2, null)) != null) {
                        throw a2;
                    }
                } else if (j3 < p()) {
                    kVar.a();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        c(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c8, code lost:
    
        r2.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014c, code lost:
    
        if (r24 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014e, code lost:
    
        r19.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0151, code lost:
    
        r1 = r27;
        r2 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [A1.f] */
    @Override // C1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(Object obj, l1.d dVar) {
        k kVar;
        Object obj2;
        ?? r2;
        C0005f c0005f;
        C0239i c0239i;
        C0005f c0005f2;
        k kVar2;
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f154g;
        k kVar3 = (k) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f150c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r3 = r(andIncrement, false);
            int i2 = e.f163b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = kVar3.f631c;
            C0239i c0239i2 = C0239i.f3393a;
            EnumC0985a enumC0985a = EnumC0985a.f8194a;
            if (j5 != j4) {
                k b2 = b(this, j4, kVar3);
                if (b2 != null) {
                    kVar = b2;
                } else if (r3) {
                    obj2 = w(obj, dVar);
                    if (obj2 != enumC0985a) {
                        return c0239i2;
                    }
                }
            } else {
                kVar = kVar3;
            }
            int d2 = d(this, kVar, i3, obj, j2, null, r3);
            if (d2 == 0) {
                kVar.a();
                return c0239i2;
            }
            if (d2 == 1) {
                break;
            }
            if (d2 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f151d;
                if (d2 == 3) {
                    C0005f c2 = AbstractC0022x.c(R1.d.t(dVar));
                    k kVar4 = kVar;
                    try {
                        int d3 = d(this, kVar4, i3, obj, j2, c2, false);
                        try {
                            if (d3 != 0) {
                                if (d3 != 1) {
                                    if (d3 == 2) {
                                        c0005f = c2;
                                        c0239i = c0239i2;
                                        c0005f.a(kVar, i3 + i2);
                                    } else if (d3 == 4) {
                                        c0005f = c2;
                                        c0239i = c0239i2;
                                        if (j2 < atomicLongFieldUpdater2.get(this)) {
                                            kVar.a();
                                        }
                                        c(this, obj, c0005f);
                                    } else {
                                        if (d3 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar.a();
                                        k kVar5 = (k) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j6 = andIncrement2 & 1152921504606846975L;
                                            boolean r4 = r(andIncrement2, false);
                                            int i4 = e.f163b;
                                            long j7 = i4;
                                            long j8 = j6 / j7;
                                            int i5 = (int) (j6 % j7);
                                            if (kVar5.f631c != j8) {
                                                try {
                                                    k b3 = b(this, j8, kVar5);
                                                    if (b3 != null) {
                                                        c0005f2 = c2;
                                                        kVar2 = b3;
                                                    } else if (r4) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C0005f c0005f3 = c2;
                                                }
                                            } else {
                                                c0005f2 = c2;
                                                kVar2 = kVar5;
                                            }
                                            c2 = c0005f2;
                                            k kVar6 = kVar2;
                                            int d4 = d(this, kVar2, i5, obj, j6, c2, r4);
                                            if (d4 == 0) {
                                                c0005f = c2;
                                                c0239i = c0239i2;
                                                kVar6.a();
                                                break;
                                            }
                                            if (d4 == 1) {
                                                break;
                                            }
                                            if (d4 == 2) {
                                                obj3 = obj;
                                                c0005f = c2;
                                                if (r4) {
                                                    kVar6.h();
                                                } else {
                                                    c0005f.a(kVar6, i5 + i4);
                                                }
                                            } else {
                                                if (d4 == 3) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                if (d4 == 4) {
                                                    break;
                                                }
                                                if (d4 == 5) {
                                                    kVar6.a();
                                                }
                                                kVar5 = kVar6;
                                            }
                                        }
                                        c(this, obj3, c0005f);
                                        c0239i = c0239i2;
                                    }
                                    obj2 = c0005f.t();
                                    if (obj2 != enumC0985a) {
                                        obj2 = c0239i;
                                    }
                                    if (obj2 != enumC0985a) {
                                        return c0239i;
                                    }
                                }
                                c0005f = c2;
                                c0239i = c0239i2;
                                c0005f.i(c0239i);
                                obj2 = c0005f.t();
                                if (obj2 != enumC0985a) {
                                }
                                if (obj2 != enumC0985a) {
                                }
                            } else {
                                c0005f = c2;
                                c0239i = c0239i2;
                                kVar.a();
                            }
                            c0005f.i(c0239i);
                            obj2 = c0005f.t();
                            if (obj2 != enumC0985a) {
                            }
                            if (obj2 != enumC0985a) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = kVar4;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = c2;
                    }
                } else if (d2 != 4) {
                    if (d2 == 5) {
                        kVar.a();
                    }
                    kVar3 = kVar;
                } else {
                    if (j2 < atomicLongFieldUpdater2.get(this)) {
                        kVar.a();
                    }
                    Object w2 = w(obj, dVar);
                    if (w2 == enumC0985a) {
                        return w2;
                    }
                }
            } else {
                if (!r3) {
                    return c0239i2;
                }
                kVar.h();
                obj2 = w(obj, dVar);
                if (obj2 != enumC0985a) {
                    return c0239i2;
                }
            }
        }
        return obj2;
    }

    public final void k() {
        Object b2;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f156i;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f152e.getAndIncrement(this);
            long j2 = andIncrement / e.f163b;
            if (p() <= andIncrement) {
                if (kVar.f631c < j2 && kVar.b() != null) {
                    v(j2, kVar);
                }
                q(this);
                return;
            }
            if (kVar.f631c != j2) {
                d dVar = d.f161a;
                while (true) {
                    b2 = F1.a.b(kVar, j2, dVar);
                    if (!F1.a.e(b2)) {
                        F1.u c2 = F1.a.c(b2);
                        while (true) {
                            F1.u uVar = (F1.u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f631c >= c2.f631c) {
                                break;
                            }
                            if (!c2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c2)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (c2.e()) {
                                        c2.d();
                                    }
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (F1.a.e(b2)) {
                    s();
                    v(j2, kVar);
                    q(this);
                } else {
                    k kVar3 = (k) F1.a.c(b2);
                    long j3 = kVar3.f631c;
                    if (j3 > j2) {
                        long j4 = j3 * e.f163b;
                        if (f152e.compareAndSet(this, andIncrement + 1, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f153f;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int i2 = (int) (andIncrement % e.f163b);
            Object k2 = kVar.k(i2);
            boolean z2 = k2 instanceof n0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f151d;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i2, k2, e.f168g)) {
                while (true) {
                    Object k3 = kVar.k(i2);
                    if (!(k3 instanceof n0)) {
                        if (k3 != e.f171j) {
                            if (k3 != null) {
                                if (k3 == e.f165d || k3 == e.f169h || k3 == e.f170i || k3 == e.f172k || k3 == e.f173l) {
                                    break loop0;
                                }
                                if (k3 != e.f167f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (kVar.j(i2, k3, e.f166e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(i2, k3, new u((n0) k3))) {
                            break loop0;
                        }
                    } else if (kVar.j(i2, k3, e.f168g)) {
                        if (z(k3)) {
                            kVar.n(i2, e.f165d);
                            break;
                        } else {
                            kVar.n(i2, e.f171j);
                            kVar.h();
                        }
                    }
                }
            } else if (z(k2)) {
                kVar.n(i2, e.f165d);
                break;
            } else {
                kVar.n(i2, e.f171j);
                kVar.h();
                q(this);
            }
        }
        q(this);
    }

    public final k l(long j2, k kVar) {
        Object b2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        k kVar2 = e.f162a;
        d dVar = d.f161a;
        loop0: while (true) {
            b2 = F1.a.b(kVar, j2, dVar);
            if (!F1.a.e(b2)) {
                F1.u c2 = F1.a.c(b2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f155h;
                    F1.u uVar = (F1.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f631c >= c2.f631c) {
                        break loop0;
                    }
                    if (!c2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c2)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (c2.e()) {
                                c2.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (F1.a.e(b2)) {
            s();
            if (kVar.f631c * e.f163b >= p()) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) F1.a.c(b2);
        boolean u2 = u();
        long j4 = kVar3.f631c;
        if (!u2 && j2 <= f152e.get(this) / e.f163b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f156i;
                F1.u uVar2 = (F1.u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f631c >= j4 || !kVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, kVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                        if (kVar3.e()) {
                            kVar3.d();
                        }
                    }
                }
                if (uVar2.e()) {
                    uVar2.d();
                }
            }
        }
        if (j4 <= j2) {
            return kVar3;
        }
        long j5 = e.f163b * j4;
        do {
            atomicLongFieldUpdater = f151d;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * e.f163b >= p()) {
            return null;
        }
        kVar3.a();
        return null;
    }

    public final Throwable m() {
        return (Throwable) f157j.get(this);
    }

    public final Throwable n() {
        Throwable m2 = m();
        return m2 == null ? new l("Channel was closed") : m2;
    }

    public final Throwable o() {
        Throwable m2 = m();
        return m2 == null ? new m("Channel was closed") : m2;
    }

    public final long p() {
        return f150c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (C1.k) ((F1.d) F1.d.f598b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f151d;
        if (i2 == 2) {
            h(j2 & 1152921504606846975L);
            if (z2) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f155h;
                    k kVar = (k) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (p() <= j3) {
                        break;
                    }
                    long j4 = e.f163b;
                    long j5 = j3 / j4;
                    if (kVar.f631c != j5 && (kVar = l(j5, kVar)) == null) {
                        if (((k) atomicReferenceFieldUpdater.get(this)).f631c < j5) {
                            break;
                        }
                    } else {
                        kVar.a();
                        int i3 = (int) (j3 % j4);
                        while (true) {
                            Object k2 = kVar.k(i3);
                            if (k2 == null || k2 == e.f166e) {
                                if (kVar.j(i3, k2, e.f169h)) {
                                    k();
                                    break;
                                }
                            } else {
                                if (k2 == e.f165d) {
                                    return false;
                                }
                                if (k2 != e.f171j && k2 != e.f173l && k2 != e.f170i && k2 != e.f169h) {
                                    if (k2 == e.f168g) {
                                        return false;
                                    }
                                    if (k2 != e.f167f && j3 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f151d.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(a.f(i2, "unexpected close status: ").toString());
            }
            k h2 = h(j2 & 1152921504606846975L);
            C0015p c0015p = null;
            Object obj = null;
            loop0: do {
                int i4 = e.f163b - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    long j6 = (h2.f631c * e.f163b) + i4;
                    while (true) {
                        Object k3 = h2.k(i4);
                        if (k3 == e.f170i) {
                            break loop0;
                        }
                        C.j jVar = e.f165d;
                        AtomicReferenceArray atomicReferenceArray = h2.f187f;
                        t1.l lVar = this.f160b;
                        if (k3 == jVar) {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (h2.j(i4, k3, e.f173l)) {
                                if (lVar != null) {
                                    c0015p = F1.a.a(lVar, atomicReferenceArray.get(i4 * 2), c0015p);
                                }
                                h2.m(i4, null);
                                h2.h();
                            }
                        } else if (k3 == e.f166e || k3 == null) {
                            if (h2.j(i4, k3, e.f173l)) {
                                h2.h();
                                break;
                            }
                        } else if (!(k3 instanceof n0) && !(k3 instanceof u)) {
                            C.j jVar2 = e.f168g;
                            if (k3 == jVar2 || k3 == e.f167f) {
                                break loop0;
                            }
                            if (k3 != jVar2) {
                                break;
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            n0 n0Var = k3 instanceof u ? ((u) k3).f196a : (n0) k3;
                            if (h2.j(i4, k3, e.f173l)) {
                                if (lVar != null) {
                                    c0015p = F1.a.a(lVar, atomicReferenceArray.get(i4 * 2), c0015p);
                                }
                                obj = F1.a.f(obj, n0Var);
                                h2.m(i4, null);
                                h2.h();
                            }
                        }
                    }
                    i4--;
                }
            } while (h2 != null);
            if (obj != null) {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        x((n0) arrayList.get(size), false);
                    }
                } else {
                    x((n0) obj, false);
                }
            }
            if (c0015p != null) {
                throw c0015p;
            }
        }
        return true;
    }

    public final boolean s() {
        return r(f150c.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r3 = (C1.k) r3.b();
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
        int i2 = (int) (f150c.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f159a + ',');
        sb.append("data=[");
        int i3 = 0;
        List B2 = AbstractC0253j.B(f155h.get(this), f154g.get(this), f156i.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : B2) {
            if (((k) obj2) != e.f162a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((k) next).f631c;
            do {
                Object next2 = it.next();
                long j3 = ((k) next2).f631c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j4 = f151d.get(this);
        long p2 = p();
        loop2: while (true) {
            int i4 = e.f163b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (kVar.f631c * e.f163b) + i5;
                if (j5 >= p2 && j5 >= j4) {
                    break loop2;
                }
                Object k2 = kVar.k(i5);
                Object obj3 = kVar.f187f.get(i5 * 2);
                if (k2 instanceof InterfaceC0004e) {
                    obj = (j5 >= j4 || j5 < p2) ? (j5 >= p2 || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof u) {
                    obj = "EB(" + k2 + ')';
                } else if (kotlin.jvm.internal.i.a(k2, e.f167f) ? true : kotlin.jvm.internal.i.a(k2, e.f168g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? true : k2.equals(e.f166e) ? true : kotlin.jvm.internal.i.a(k2, e.f170i) ? true : kotlin.jvm.internal.i.a(k2, e.f169h) ? true : kotlin.jvm.internal.i.a(k2, e.f172k) ? true : kotlin.jvm.internal.i.a(k2, e.f171j) ? true : kotlin.jvm.internal.i.a(k2, e.f173l)) {
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
        if (sb.charAt(z1.g.V(sb)) == ',') {
            kotlin.jvm.internal.i.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j2 = f152e.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(long j2, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f631c < j2 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f156i;
                    F1.u uVar = (F1.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f631c >= kVar.f631c) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (kVar.e()) {
                                kVar.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                        return;
                    }
                    return;
                }
            }
            kVar = kVar2;
        }
    }

    public final Object w(Object obj, l1.d dVar) {
        C0015p a2;
        C0005f c0005f = new C0005f(1, R1.d.t(dVar));
        c0005f.u();
        t1.l lVar = this.f160b;
        if (lVar == null || (a2 = F1.a.a(lVar, obj, null)) == null) {
            c0005f.i(R1.l.h(o()));
        } else {
            AbstractC1050a.a(a2, o());
            c0005f.i(R1.l.h(a2));
        }
        Object t = c0005f.t();
        return t == EnumC0985a.f8194a ? t : C0239i.f3393a;
    }

    public final void x(n0 n0Var, boolean z2) {
        if (n0Var instanceof InterfaceC0004e) {
            ((l1.d) n0Var).i(R1.l.h(z2 ? n() : o()));
            return;
        }
        if (!(n0Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + n0Var).toString());
        }
        b bVar = (b) n0Var;
        C0005f c0005f = bVar.f148b;
        kotlin.jvm.internal.i.b(c0005f);
        bVar.f148b = null;
        bVar.f147a = e.f173l;
        Throwable m2 = bVar.f149c.m();
        if (m2 == null) {
            c0005f.i(Boolean.FALSE);
        } else {
            c0005f.i(R1.l.h(m2));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof InterfaceC0004e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0004e interfaceC0004e = (InterfaceC0004e) obj;
            t1.l lVar = this.f160b;
            return e.a(interfaceC0004e, obj2, lVar != null ? new F1.p(lVar, obj2, interfaceC0004e.getContext()) : null);
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        C0005f c0005f = bVar.f148b;
        kotlin.jvm.internal.i.b(c0005f);
        bVar.f148b = null;
        bVar.f147a = obj2;
        Boolean bool = Boolean.TRUE;
        t1.l lVar2 = bVar.f149c.f160b;
        return e.a(c0005f, bool, lVar2 != null ? new F1.p(lVar2, obj2, c0005f.f48e) : null);
    }
}
