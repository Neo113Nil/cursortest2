package N0;

import L0.AbstractC0064w;
import L0.C0048f;
import L0.C0058p;
import L0.InterfaceC0047e;
import L0.m0;
import Q0.AbstractC0068a;
import Q0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t0.C0252g;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f707g = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f708h = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f709i = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f710j = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f711k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f712l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f713m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f714n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f715o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: e, reason: collision with root package name */
    public final int f716e;

    /* renamed from: f, reason: collision with root package name */
    public final D0.l f717f;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i2, D0.l lVar) {
        this.f716e = i2;
        this.f717f = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        j jVar = d.f719a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f709i.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (u()) {
            jVar2 = d.f719a;
            E0.i.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f736s;
    }

    public static final j b(b bVar, long j2, j jVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        bVar.getClass();
        j jVar2 = d.f719a;
        c cVar = c.f718m;
        loop0: while (true) {
            c2 = AbstractC0068a.c(jVar, j2, cVar);
            if (!AbstractC0068a.f(c2)) {
                v d2 = AbstractC0068a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f711k;
                    v vVar = (v) atomicReferenceFieldUpdater.get(bVar);
                    if (vVar.f914g >= d2.f914g) {
                        break loop0;
                    }
                    if (!d2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, vVar, d2)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != vVar) {
                            if (d2.e()) {
                                d2.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean f2 = AbstractC0068a.f(c2);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f708h;
        if (f2) {
            bVar.s();
            if (jVar.f914g * d.f720b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0068a.d(c2);
        long j5 = jVar3.f914g;
        if (j5 <= j2) {
            return jVar3;
        }
        long j6 = d.f720b * j5;
        do {
            atomicLongFieldUpdater = f707g;
            j3 = atomicLongFieldUpdater.get(bVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * d.f720b >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void c(b bVar, Object obj, C0048f c0048f) {
        D0.l lVar = bVar.f717f;
        if (lVar != null) {
            AbstractC0068a.a(lVar, obj, c0048f.f657i);
        }
        c0048f.c(o.g.f(bVar.o()));
    }

    public static final int d(b bVar, j jVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        bVar.getClass();
        jVar.m(i2, obj);
        if (z2) {
            return bVar.B(jVar, i2, obj, j2, obj2, z2);
        }
        Object k2 = jVar.k(i2);
        if (k2 == null) {
            if (bVar.e(j2)) {
                if (jVar.j(i2, null, d.f722d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof m0) {
            jVar.m(i2, null);
            if (bVar.y(k2, obj)) {
                jVar.n(i2, d.f727i);
                return 0;
            }
            A.j jVar2 = d.f729k;
            if (jVar.f743j.getAndSet((i2 * 2) + 1, jVar2) != jVar2) {
                jVar.l(i2, true);
            }
            return 5;
        }
        return bVar.B(jVar, i2, obj, j2, obj2, z2);
    }

    public static void q(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f710j;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (obj instanceof InterfaceC0047e) {
            E0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0047e) obj, C0252g.f2994a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object A(j jVar, int i2, long j2, Object obj) {
        Object k2 = jVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = jVar.f743j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f707g;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f732n;
                }
                if (jVar.j(i2, k2, obj)) {
                    i();
                    return d.f731m;
                }
            }
        } else if (k2 == d.f722d && jVar.j(i2, k2, d.f727i)) {
            i();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            jVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k3 = jVar.k(i2);
            if (k3 == null || k3 == d.f723e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i2, k3, d.f726h)) {
                        i();
                        return d.f733o;
                    }
                } else {
                    if (obj == null) {
                        return d.f732n;
                    }
                    if (jVar.j(i2, k3, obj)) {
                        i();
                        return d.f731m;
                    }
                }
            } else if (k3 != d.f722d) {
                A.j jVar2 = d.f728j;
                if (k3 == jVar2) {
                    return d.f733o;
                }
                if (k3 == d.f726h) {
                    return d.f733o;
                }
                if (k3 == d.f730l) {
                    i();
                    return d.f733o;
                }
                if (k3 != d.f725g && jVar.j(i2, k3, d.f724f)) {
                    boolean z2 = k3 instanceof s;
                    if (z2) {
                        k3 = ((s) k3).f749a;
                    }
                    if (z(k3)) {
                        jVar.n(i2, d.f727i);
                        i();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        jVar.m(i2, null);
                        return obj3;
                    }
                    jVar.n(i2, jVar2);
                    jVar.h();
                    if (z2) {
                        i();
                    }
                    return d.f733o;
                }
            } else if (jVar.j(i2, k3, d.f727i)) {
                i();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                jVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int B(j jVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        while (true) {
            Object k2 = jVar.k(i2);
            if (k2 == null) {
                if (!e(j2) || z2) {
                    if (z2) {
                        if (jVar.j(i2, null, d.f728j)) {
                            jVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(i2, null, d.f722d)) {
                    return 1;
                }
            } else {
                if (k2 != d.f723e) {
                    A.j jVar2 = d.f729k;
                    if (k2 == jVar2) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f726h) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f730l) {
                        jVar.m(i2, null);
                        s();
                        return 4;
                    }
                    jVar.m(i2, null);
                    if (k2 instanceof s) {
                        k2 = ((s) k2).f749a;
                    }
                    if (y(k2, obj)) {
                        jVar.n(i2, d.f727i);
                        return 0;
                    }
                    if (jVar.f743j.getAndSet((i2 * 2) + 1, jVar2) == jVar2) {
                        return 5;
                    }
                    jVar.l(i2, true);
                    return 5;
                }
                if (jVar.j(i2, k2, d.f722d)) {
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
            atomicLongFieldUpdater = f709i;
        } while (atomicLongFieldUpdater.get(this) <= j2);
        int i2 = d.f721c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f710j;
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

    @Override // N0.q
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final boolean e(long j2) {
        return j2 < f709i.get(this) || j2 < f708h.get(this) + ((long) this.f716e);
    }

    public final boolean f(Throwable th, boolean z2) {
        boolean z3;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f707g;
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                j jVar = d.f719a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (1 << 60) + (j6 & 1152921504606846975L)));
        }
        A.j jVar2 = d.f736s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f714n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, jVar2, th)) {
                z3 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != jVar2) {
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
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f715o;
                obj = atomicReferenceFieldUpdater2.get(this);
                A.j jVar3 = obj == null ? d.f735q : d.r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, jVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                E0.s.a(1, obj);
                ((D0.l) obj).i(k());
            }
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (N0.j) ((Q0.d) Q0.d.f878f.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j g(long j2) {
        Object obj;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f713m.get(this);
        j jVar = (j) f711k.get(this);
        if (jVar.f914g > ((j) obj2).f914g) {
            obj2 = jVar;
        }
        j jVar2 = (j) f712l.get(this);
        if (jVar2.f914g > ((j) obj2).f914g) {
            obj2 = jVar2;
        }
        Q0.d dVar = (Q0.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = Q0.d.f877e.get(dVar);
            A.j jVar3 = AbstractC0068a.f870b;
            obj = null;
            if (obj3 == jVar3) {
                break;
            }
            Q0.d dVar2 = (Q0.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = Q0.d.f877e;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, jVar3)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        j jVar4 = (j) dVar;
        if (t()) {
            j jVar5 = jVar4;
            loop2: do {
                int i2 = d.f720b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (jVar5.f914g * d.f720b) + i2;
                    if (j3 < f708h.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = jVar5.k(i2);
                        if (k2 != null && k2 != d.f723e) {
                            if (k2 == d.f722d) {
                                break loop2;
                            }
                        } else {
                            if (jVar5.j(i2, k2, d.f730l)) {
                                jVar5.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (jVar5 != null);
            j3 = -1;
            if (j3 != -1) {
                h(j3);
            }
        }
        loop5: for (j jVar6 = jVar4; jVar6 != null; jVar6 = (j) ((Q0.d) Q0.d.f878f.get(jVar6))) {
            for (int i3 = d.f720b - 1; -1 < i3; i3--) {
                if ((jVar6.f914g * d.f720b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = jVar6.k(i3);
                    if (k3 != null && k3 != d.f723e) {
                        if (!(k3 instanceof s)) {
                            if (!(k3 instanceof m0)) {
                                break;
                            }
                            if (jVar6.j(i3, k3, d.f730l)) {
                                obj = AbstractC0068a.g(obj, k3);
                                jVar6.l(i3, true);
                                break;
                            }
                        } else {
                            if (jVar6.j(i3, k3, d.f730l)) {
                                obj = AbstractC0068a.g(obj, ((s) k3).f749a);
                                jVar6.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar6.j(i3, k3, d.f730l)) {
                            jVar6.h();
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
                    x((m0) arrayList.get(size), true);
                }
            } else {
                x((m0) obj, true);
            }
        }
        return jVar4;
    }

    public final void h(long j2) {
        C0058p b2;
        j jVar = (j) f712l.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f708h;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f716e + j3, f709i.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = d.f720b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (jVar.f914g != j5) {
                    j j6 = j(j5, jVar);
                    if (j6 == null) {
                        continue;
                    } else {
                        jVar = j6;
                    }
                }
                Object A2 = A(jVar, i2, j3, null);
                if (A2 != d.f733o) {
                    jVar.a();
                    D0.l lVar = this.f717f;
                    if (lVar != null && (b2 = AbstractC0068a.b(lVar, A2, null)) != null) {
                        throw b2;
                    }
                } else if (j3 < p()) {
                    jVar.a();
                }
            }
        }
    }

    public final void i() {
        Object c2;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f713m;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f709i.getAndIncrement(this);
            long j2 = andIncrement / d.f720b;
            if (p() <= andIncrement) {
                if (jVar.f914g < j2 && jVar.b() != null) {
                    v(j2, jVar);
                }
                q(this);
                return;
            }
            if (jVar.f914g != j2) {
                c cVar = c.f718m;
                while (true) {
                    c2 = AbstractC0068a.c(jVar, j2, cVar);
                    if (!AbstractC0068a.f(c2)) {
                        v d2 = AbstractC0068a.d(c2);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            if (vVar.f914g >= d2.f914g) {
                                break;
                            }
                            if (!d2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, d2)) {
                                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                    if (d2.e()) {
                                        d2.d();
                                    }
                                }
                            }
                            if (vVar.e()) {
                                vVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                j jVar2 = null;
                if (AbstractC0068a.f(c2)) {
                    s();
                    v(j2, jVar);
                    q(this);
                } else {
                    j jVar3 = (j) AbstractC0068a.d(c2);
                    long j3 = jVar3.f914g;
                    if (j3 > j2) {
                        long j4 = j3 * d.f720b;
                        if (f709i.compareAndSet(this, andIncrement + 1, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f710j;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        jVar2 = jVar3;
                    }
                }
                if (jVar2 == null) {
                    continue;
                } else {
                    jVar = jVar2;
                }
            }
            int i2 = (int) (andIncrement % d.f720b);
            Object k2 = jVar.k(i2);
            boolean z2 = k2 instanceof m0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f708h;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(i2, k2, d.f725g)) {
                while (true) {
                    Object k3 = jVar.k(i2);
                    if (!(k3 instanceof m0)) {
                        if (k3 != d.f728j) {
                            if (k3 != null) {
                                if (k3 == d.f722d || k3 == d.f726h || k3 == d.f727i || k3 == d.f729k || k3 == d.f730l) {
                                    break loop0;
                                }
                                if (k3 != d.f724f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (jVar.j(i2, k3, d.f723e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (jVar.j(i2, k3, new s((m0) k3))) {
                            break loop0;
                        }
                    } else if (jVar.j(i2, k3, d.f725g)) {
                        if (z(k3)) {
                            jVar.n(i2, d.f722d);
                            break;
                        } else {
                            jVar.n(i2, d.f728j);
                            jVar.h();
                        }
                    }
                }
            } else if (z(k2)) {
                jVar.n(i2, d.f722d);
                break;
            } else {
                jVar.n(i2, d.f728j);
                jVar.h();
                q(this);
            }
        }
        q(this);
    }

    public final j j(long j2, j jVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        j jVar2 = d.f719a;
        c cVar = c.f718m;
        loop0: while (true) {
            c2 = AbstractC0068a.c(jVar, j2, cVar);
            if (!AbstractC0068a.f(c2)) {
                v d2 = AbstractC0068a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f712l;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f914g >= d2.f914g) {
                        break loop0;
                    }
                    if (!d2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, d2)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (d2.e()) {
                                d2.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC0068a.f(c2)) {
            s();
            if (jVar.f914g * d.f720b >= p()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0068a.d(c2);
        boolean u2 = u();
        long j4 = jVar3.f914g;
        if (!u2 && j2 <= f709i.get(this) / d.f720b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f713m;
                v vVar2 = (v) atomicReferenceFieldUpdater2.get(this);
                if (vVar2.f914g >= j4 || !jVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, vVar2, jVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != vVar2) {
                        if (jVar3.e()) {
                            jVar3.d();
                        }
                    }
                }
                if (vVar2.e()) {
                    vVar2.d();
                }
            }
        }
        if (j4 <= j2) {
            return jVar3;
        }
        long j5 = d.f720b * j4;
        do {
            atomicLongFieldUpdater = f708h;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * d.f720b >= p()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public final Throwable k() {
        return (Throwable) f714n.get(this);
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
    
        r2.B();
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
    /* JADX WARN: Type inference failed for: r2v9, types: [L0.f] */
    @Override // N0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(Object obj, v0.d dVar) {
        j jVar;
        Object obj2;
        ?? r2;
        C0048f c0048f;
        C0252g c0252g;
        C0048f c0048f2;
        j jVar2;
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f711k;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f707g;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r = r(andIncrement, false);
            int i2 = d.f720b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = jVar3.f914g;
            C0252g c0252g2 = C0252g.f2994a;
            w0.a aVar = w0.a.f3076e;
            if (j5 != j4) {
                j b2 = b(this, j4, jVar3);
                if (b2 != null) {
                    jVar = b2;
                } else if (r) {
                    obj2 = w(obj, dVar);
                    if (obj2 != aVar) {
                        return c0252g2;
                    }
                }
            } else {
                jVar = jVar3;
            }
            int d2 = d(this, jVar, i3, obj, j2, null, r);
            if (d2 == 0) {
                jVar.a();
                return c0252g2;
            }
            if (d2 == 1) {
                break;
            }
            if (d2 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f708h;
                if (d2 == 3) {
                    C0048f c2 = AbstractC0064w.c(o.g.r(dVar));
                    j jVar4 = jVar;
                    try {
                        int d3 = d(this, jVar4, i3, obj, j2, c2, false);
                        try {
                            if (d3 != 0) {
                                if (d3 != 1) {
                                    if (d3 == 2) {
                                        c0048f = c2;
                                        c0252g = c0252g2;
                                        c0048f.a(jVar, i3 + i2);
                                    } else if (d3 == 4) {
                                        c0048f = c2;
                                        c0252g = c0252g2;
                                        if (j2 < atomicLongFieldUpdater2.get(this)) {
                                            jVar.a();
                                        }
                                        c(this, obj, c0048f);
                                    } else {
                                        if (d3 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar.a();
                                        j jVar5 = (j) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j6 = andIncrement2 & 1152921504606846975L;
                                            boolean r3 = r(andIncrement2, false);
                                            int i4 = d.f720b;
                                            long j7 = i4;
                                            long j8 = j6 / j7;
                                            int i5 = (int) (j6 % j7);
                                            if (jVar5.f914g != j8) {
                                                try {
                                                    j b3 = b(this, j8, jVar5);
                                                    if (b3 != null) {
                                                        c0048f2 = c2;
                                                        jVar2 = b3;
                                                    } else if (r3) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C0048f c0048f3 = c2;
                                                }
                                            } else {
                                                c0048f2 = c2;
                                                jVar2 = jVar5;
                                            }
                                            c2 = c0048f2;
                                            j jVar6 = jVar2;
                                            int d4 = d(this, jVar2, i5, obj, j6, c2, r3);
                                            if (d4 == 0) {
                                                c0048f = c2;
                                                c0252g = c0252g2;
                                                jVar6.a();
                                                break;
                                            }
                                            if (d4 == 1) {
                                                break;
                                            }
                                            if (d4 == 2) {
                                                obj3 = obj;
                                                c0048f = c2;
                                                if (r3) {
                                                    jVar6.h();
                                                } else {
                                                    c0048f.a(jVar6, i5 + i4);
                                                }
                                            } else {
                                                if (d4 == 3) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                if (d4 == 4) {
                                                    break;
                                                }
                                                if (d4 == 5) {
                                                    jVar6.a();
                                                }
                                                jVar5 = jVar6;
                                            }
                                        }
                                        c(this, obj3, c0048f);
                                        c0252g = c0252g2;
                                    }
                                    obj2 = c0048f.u();
                                    if (obj2 != aVar) {
                                        obj2 = c0252g;
                                    }
                                    if (obj2 != aVar) {
                                        return c0252g;
                                    }
                                }
                                c0048f = c2;
                                c0252g = c0252g2;
                                c0048f.c(c0252g);
                                obj2 = c0048f.u();
                                if (obj2 != aVar) {
                                }
                                if (obj2 != aVar) {
                                }
                            } else {
                                c0048f = c2;
                                c0252g = c0252g2;
                                jVar.a();
                            }
                            c0048f.c(c0252g);
                            obj2 = c0048f.u();
                            if (obj2 != aVar) {
                            }
                            if (obj2 != aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = jVar4;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = c2;
                    }
                } else if (d2 != 4) {
                    if (d2 == 5) {
                        jVar.a();
                    }
                    jVar3 = jVar;
                } else {
                    if (j2 < atomicLongFieldUpdater2.get(this)) {
                        jVar.a();
                    }
                    Object w2 = w(obj, dVar);
                    if (w2 == aVar) {
                        return w2;
                    }
                }
            } else {
                if (!r) {
                    return c0252g2;
                }
                jVar.h();
                obj2 = w(obj, dVar);
                if (obj2 != aVar) {
                    return c0252g2;
                }
            }
        }
        return obj2;
    }

    public final Throwable m() {
        Throwable k2 = k();
        return k2 == null ? new k("Channel was closed") : k2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // N0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Object obj) {
        j jVar;
        j jVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f707g;
        boolean z2 = r(atomicLongFieldUpdater.get(this), false) ? false : !e(r0 & 1152921504606846975L);
        h hVar = i.f741a;
        if (!z2) {
            J.e eVar = d.f728j;
            j jVar3 = (j) f711k.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean r = r(andIncrement, false);
                int i2 = d.f720b;
                long j3 = i2;
                long j4 = j2 / j3;
                int i3 = (int) (j2 % j3);
                if (jVar3.f914g != j4) {
                    j b2 = b(this, j4, jVar3);
                    if (b2 != null) {
                        jVar = b2;
                    } else if (r) {
                        return new g(o());
                    }
                } else {
                    jVar = jVar3;
                }
                j jVar4 = jVar;
                int d2 = d(this, jVar, i3, obj, j2, eVar, r);
                C0252g c0252g = C0252g.f2994a;
                if (d2 == 0) {
                    jVar4.a();
                    break;
                }
                if (d2 == 1) {
                    break;
                }
                if (d2 == 2) {
                    if (r) {
                        jVar4.h();
                        return new g(o());
                    }
                    m0 m0Var = eVar instanceof m0 ? (m0) eVar : null;
                    if (m0Var != null) {
                        jVar2 = jVar4;
                        m0Var.a(jVar2, i3 + i2);
                    } else {
                        jVar2 = jVar4;
                    }
                    jVar2.h();
                    return hVar;
                }
                if (d2 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (d2 == 4) {
                    if (j2 < f708h.get(this)) {
                        jVar4.a();
                    }
                    return new g(o());
                }
                if (d2 == 5) {
                    jVar4.a();
                }
                jVar3 = jVar4;
            }
        } else {
            return hVar;
        }
    }

    public final Throwable o() {
        Throwable k2 = k();
        return k2 == null ? new l("Channel was closed") : k2;
    }

    public final long p() {
        return f707g.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (N0.j) ((Q0.d) Q0.d.f878f.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f708h;
        if (i2 == 2) {
            g(j2 & 1152921504606846975L);
            if (z2) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f712l;
                    j jVar = (j) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (p() <= j3) {
                        break;
                    }
                    long j4 = d.f720b;
                    long j5 = j3 / j4;
                    if (jVar.f914g != j5 && (jVar = j(j5, jVar)) == null) {
                        if (((j) atomicReferenceFieldUpdater.get(this)).f914g < j5) {
                            break;
                        }
                    } else {
                        jVar.a();
                        int i3 = (int) (j3 % j4);
                        while (true) {
                            Object k2 = jVar.k(i3);
                            if (k2 == null || k2 == d.f723e) {
                                if (jVar.j(i3, k2, d.f726h)) {
                                    i();
                                    break;
                                }
                            } else {
                                if (k2 == d.f722d) {
                                    return false;
                                }
                                if (k2 != d.f728j && k2 != d.f730l && k2 != d.f727i && k2 != d.f726h) {
                                    if (k2 == d.f725g) {
                                        return false;
                                    }
                                    if (k2 != d.f724f && j3 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f708h.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(E0.h.e("unexpected close status: ", i2).toString());
            }
            j g2 = g(j2 & 1152921504606846975L);
            C0058p c0058p = null;
            Object obj = null;
            loop0: do {
                int i4 = d.f720b - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    long j6 = (g2.f914g * d.f720b) + i4;
                    while (true) {
                        Object k3 = g2.k(i4);
                        if (k3 == d.f727i) {
                            break loop0;
                        }
                        A.j jVar2 = d.f722d;
                        AtomicReferenceArray atomicReferenceArray = g2.f743j;
                        D0.l lVar = this.f717f;
                        if (k3 == jVar2) {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (g2.j(i4, k3, d.f730l)) {
                                if (lVar != null) {
                                    c0058p = AbstractC0068a.b(lVar, atomicReferenceArray.get(i4 * 2), c0058p);
                                }
                                g2.m(i4, null);
                                g2.h();
                            }
                        } else if (k3 == d.f723e || k3 == null) {
                            if (g2.j(i4, k3, d.f730l)) {
                                g2.h();
                                break;
                            }
                        } else if (!(k3 instanceof m0) && !(k3 instanceof s)) {
                            A.j jVar3 = d.f725g;
                            if (k3 == jVar3 || k3 == d.f724f) {
                                break loop0;
                            }
                            if (k3 != jVar3) {
                                break;
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            m0 m0Var = k3 instanceof s ? ((s) k3).f749a : (m0) k3;
                            if (g2.j(i4, k3, d.f730l)) {
                                if (lVar != null) {
                                    c0058p = AbstractC0068a.b(lVar, atomicReferenceArray.get(i4 * 2), c0058p);
                                }
                                obj = AbstractC0068a.g(obj, m0Var);
                                g2.m(i4, null);
                                g2.h();
                            }
                        }
                    }
                    i4--;
                }
            } while (g2 != null);
            if (obj != null) {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        x((m0) arrayList.get(size), false);
                    }
                } else {
                    x((m0) obj, false);
                }
            }
            if (c0058p != null) {
                throw c0058p;
            }
        }
        return true;
    }

    public final boolean s() {
        return r(f707g.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r3 = (N0.j) r3.b();
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
        int i2 = (int) (f707g.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f716e + ',');
        sb.append("data=[");
        int i3 = 0;
        List B2 = u0.e.B(f712l.get(this), f711k.get(this), f713m.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : B2) {
            if (((j) obj2) != d.f719a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((j) next).f914g;
            do {
                Object next2 = it.next();
                long j3 = ((j) next2).f914g;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j4 = f708h.get(this);
        long p2 = p();
        loop2: while (true) {
            int i4 = d.f720b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (jVar.f914g * d.f720b) + i5;
                if (j5 >= p2 && j5 >= j4) {
                    break loop2;
                }
                Object k2 = jVar.k(i5);
                Object obj3 = jVar.f743j.get(i5 * 2);
                if (k2 instanceof InterfaceC0047e) {
                    obj = (j5 >= j4 || j5 < p2) ? (j5 >= p2 || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof s) {
                    obj = "EB(" + k2 + ')';
                } else if (E0.i.a(k2, d.f724f) ? true : E0.i.a(k2, d.f725g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? true : k2.equals(d.f723e) ? true : E0.i.a(k2, d.f727i) ? true : E0.i.a(k2, d.f726h) ? true : E0.i.a(k2, d.f729k) ? true : E0.i.a(k2, d.f728j) ? true : E0.i.a(k2, d.f730l)) {
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
        if (sb.charAt(K0.h.P(sb)) == ',') {
            E0.i.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j2 = f709i.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(long j2, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f914g < j2 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f713m;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f914g >= jVar.f914g) {
                        return;
                    }
                    if (!jVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, jVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (jVar.e()) {
                                jVar.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                        return;
                    }
                    return;
                }
            }
            jVar = jVar2;
        }
    }

    public final Object w(Object obj, v0.d dVar) {
        C0058p b2;
        C0048f c0048f = new C0048f(1, o.g.r(dVar));
        c0048f.v();
        D0.l lVar = this.f717f;
        if (lVar == null || (b2 = AbstractC0068a.b(lVar, obj, null)) == null) {
            c0048f.c(o.g.f(o()));
        } else {
            o.g.a(b2, o());
            c0048f.c(o.g.f(b2));
        }
        Object u2 = c0048f.u();
        return u2 == w0.a.f3076e ? u2 : C0252g.f2994a;
    }

    public final void x(m0 m0Var, boolean z2) {
        if (m0Var instanceof InterfaceC0047e) {
            ((v0.d) m0Var).c(o.g.f(z2 ? m() : o()));
            return;
        }
        if (!(m0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + m0Var).toString());
        }
        a aVar = (a) m0Var;
        C0048f c0048f = aVar.f705f;
        E0.i.b(c0048f);
        aVar.f705f = null;
        aVar.f704e = d.f730l;
        Throwable k2 = aVar.f706g.k();
        if (k2 == null) {
            c0048f.c(Boolean.FALSE);
        } else {
            c0048f.c(o.g.f(k2));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0047e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            E0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0047e interfaceC0047e = (InterfaceC0047e) obj;
            D0.l lVar = this.f717f;
            return d.a(interfaceC0047e, obj2, lVar != null ? new Q0.q(lVar, obj2, interfaceC0047e.j()) : null);
        }
        E0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0048f c0048f = aVar.f705f;
        E0.i.b(c0048f);
        aVar.f705f = null;
        aVar.f704e = obj2;
        Boolean bool = Boolean.TRUE;
        D0.l lVar2 = aVar.f706g.f717f;
        return d.a(c0048f, bool, lVar2 != null ? new Q0.q(lVar2, obj2, c0048f.f657i) : null);
    }
}
