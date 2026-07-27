package M0;

import K0.AbstractC0046w;
import K0.C0030f;
import K0.C0040p;
import K0.InterfaceC0029e;
import K0.m0;
import P0.AbstractC0068a;
import P0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f699h = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f700i = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f701j = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f702k = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f703l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f704m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f705n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f706o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f707p = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: f, reason: collision with root package name */
    public final int f708f;

    /* renamed from: g, reason: collision with root package name */
    public final D0.l f709g;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i2, D0.l lVar) {
        this.f708f = i2;
        this.f709g = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        j jVar = d.f711a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f701j.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (u()) {
            jVar2 = d.f711a;
            E0.i.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f728s;
    }

    public static final j b(b bVar, long j2, j jVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        bVar.getClass();
        j jVar2 = d.f711a;
        c cVar = c.f710n;
        loop0: while (true) {
            c2 = AbstractC0068a.c(jVar, j2, cVar);
            if (!AbstractC0068a.f(c2)) {
                v d2 = AbstractC0068a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f703l;
                    v vVar = (v) atomicReferenceFieldUpdater.get(bVar);
                    if (vVar.f905h >= d2.f905h) {
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
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f700i;
        if (f2) {
            bVar.s();
            if (jVar.f905h * d.f712b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0068a.d(c2);
        long j5 = jVar3.f905h;
        if (j5 <= j2) {
            return jVar3;
        }
        long j6 = d.f712b * j5;
        do {
            atomicLongFieldUpdater = f699h;
            j3 = atomicLongFieldUpdater.get(bVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * d.f712b >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void c(b bVar, Object obj, C0030f c0030f) {
        D0.l lVar = bVar.f709g;
        if (lVar != null) {
            AbstractC0068a.a(lVar, obj, c0030f.f509j);
        }
        c0030f.c(o.g.f(bVar.o()));
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
                if (jVar.j(i2, null, d.f714d)) {
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
                jVar.n(i2, d.f719i);
                return 0;
            }
            A.j jVar2 = d.f721k;
            if (jVar.f735k.getAndSet((i2 * 2) + 1, jVar2) != jVar2) {
                jVar.l(i2, true);
            }
            return 5;
        }
        return bVar.B(jVar, i2, obj, j2, obj2, z2);
    }

    public static void q(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f702k;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (obj instanceof InterfaceC0029e) {
            E0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0029e) obj, t0.g.f2989a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object A(j jVar, int i2, long j2, Object obj) {
        Object k2 = jVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = jVar.f735k;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f699h;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f724n;
                }
                if (jVar.j(i2, k2, obj)) {
                    i();
                    return d.f723m;
                }
            }
        } else if (k2 == d.f714d && jVar.j(i2, k2, d.f719i)) {
            i();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            jVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k3 = jVar.k(i2);
            if (k3 == null || k3 == d.f715e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i2, k3, d.f718h)) {
                        i();
                        return d.f725o;
                    }
                } else {
                    if (obj == null) {
                        return d.f724n;
                    }
                    if (jVar.j(i2, k3, obj)) {
                        i();
                        return d.f723m;
                    }
                }
            } else if (k3 != d.f714d) {
                A.j jVar2 = d.f720j;
                if (k3 == jVar2) {
                    return d.f725o;
                }
                if (k3 == d.f718h) {
                    return d.f725o;
                }
                if (k3 == d.f722l) {
                    i();
                    return d.f725o;
                }
                if (k3 != d.f717g && jVar.j(i2, k3, d.f716f)) {
                    boolean z2 = k3 instanceof s;
                    if (z2) {
                        k3 = ((s) k3).f741a;
                    }
                    if (z(k3)) {
                        jVar.n(i2, d.f719i);
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
                    return d.f725o;
                }
            } else if (jVar.j(i2, k3, d.f719i)) {
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
                        if (jVar.j(i2, null, d.f720j)) {
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
                } else if (jVar.j(i2, null, d.f714d)) {
                    return 1;
                }
            } else {
                if (k2 != d.f715e) {
                    A.j jVar2 = d.f721k;
                    if (k2 == jVar2) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f718h) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f722l) {
                        jVar.m(i2, null);
                        s();
                        return 4;
                    }
                    jVar.m(i2, null);
                    if (k2 instanceof s) {
                        k2 = ((s) k2).f741a;
                    }
                    if (y(k2, obj)) {
                        jVar.n(i2, d.f719i);
                        return 0;
                    }
                    if (jVar.f735k.getAndSet((i2 * 2) + 1, jVar2) == jVar2) {
                        return 5;
                    }
                    jVar.l(i2, true);
                    return 5;
                }
                if (jVar.j(i2, k2, d.f714d)) {
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
            atomicLongFieldUpdater = f701j;
        } while (atomicLongFieldUpdater.get(this) <= j2);
        int i2 = d.f713c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f702k;
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

    @Override // M0.q
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final boolean e(long j2) {
        return j2 < f701j.get(this) || j2 < f700i.get(this) + ((long) this.f708f);
    }

    public final boolean f(Throwable th, boolean z2) {
        boolean z3;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f699h;
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                j jVar = d.f711a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (1 << 60) + (j6 & 1152921504606846975L)));
        }
        A.j jVar2 = d.f728s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f706o;
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
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f707p;
                obj = atomicReferenceFieldUpdater2.get(this);
                A.j jVar3 = obj == null ? d.f727q : d.r;
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
    
        r1 = (M0.j) ((P0.d) P0.d.f869g.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j g(long j2) {
        Object obj;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f705n.get(this);
        j jVar = (j) f703l.get(this);
        if (jVar.f905h > ((j) obj2).f905h) {
            obj2 = jVar;
        }
        j jVar2 = (j) f704m.get(this);
        if (jVar2.f905h > ((j) obj2).f905h) {
            obj2 = jVar2;
        }
        P0.d dVar = (P0.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = P0.d.f868f.get(dVar);
            A.j jVar3 = AbstractC0068a.f861b;
            obj = null;
            if (obj3 == jVar3) {
                break;
            }
            P0.d dVar2 = (P0.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = P0.d.f868f;
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
                int i2 = d.f712b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (jVar5.f905h * d.f712b) + i2;
                    if (j3 < f700i.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = jVar5.k(i2);
                        if (k2 != null && k2 != d.f715e) {
                            if (k2 == d.f714d) {
                                break loop2;
                            }
                        } else {
                            if (jVar5.j(i2, k2, d.f722l)) {
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
        loop5: for (j jVar6 = jVar4; jVar6 != null; jVar6 = (j) ((P0.d) P0.d.f869g.get(jVar6))) {
            for (int i3 = d.f712b - 1; -1 < i3; i3--) {
                if ((jVar6.f905h * d.f712b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = jVar6.k(i3);
                    if (k3 != null && k3 != d.f715e) {
                        if (!(k3 instanceof s)) {
                            if (!(k3 instanceof m0)) {
                                break;
                            }
                            if (jVar6.j(i3, k3, d.f722l)) {
                                obj = AbstractC0068a.g(obj, k3);
                                jVar6.l(i3, true);
                                break;
                            }
                        } else {
                            if (jVar6.j(i3, k3, d.f722l)) {
                                obj = AbstractC0068a.g(obj, ((s) k3).f741a);
                                jVar6.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar6.j(i3, k3, d.f722l)) {
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
        C0040p b2;
        j jVar = (j) f704m.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f700i;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f708f + j3, f701j.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = d.f712b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (jVar.f905h != j5) {
                    j j6 = j(j5, jVar);
                    if (j6 == null) {
                        continue;
                    } else {
                        jVar = j6;
                    }
                }
                Object A2 = A(jVar, i2, j3, null);
                if (A2 != d.f725o) {
                    jVar.a();
                    D0.l lVar = this.f709g;
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
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f705n;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f701j.getAndIncrement(this);
            long j2 = andIncrement / d.f712b;
            if (p() <= andIncrement) {
                if (jVar.f905h < j2 && jVar.b() != null) {
                    v(j2, jVar);
                }
                q(this);
                return;
            }
            if (jVar.f905h != j2) {
                c cVar = c.f710n;
                while (true) {
                    c2 = AbstractC0068a.c(jVar, j2, cVar);
                    if (!AbstractC0068a.f(c2)) {
                        v d2 = AbstractC0068a.d(c2);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            if (vVar.f905h >= d2.f905h) {
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
                    long j3 = jVar3.f905h;
                    if (j3 > j2) {
                        long j4 = j3 * d.f712b;
                        if (f701j.compareAndSet(this, andIncrement + 1, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f702k;
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
            int i2 = (int) (andIncrement % d.f712b);
            Object k2 = jVar.k(i2);
            boolean z2 = k2 instanceof m0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f700i;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(i2, k2, d.f717g)) {
                while (true) {
                    Object k3 = jVar.k(i2);
                    if (!(k3 instanceof m0)) {
                        if (k3 != d.f720j) {
                            if (k3 != null) {
                                if (k3 == d.f714d || k3 == d.f718h || k3 == d.f719i || k3 == d.f721k || k3 == d.f722l) {
                                    break loop0;
                                }
                                if (k3 != d.f716f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (jVar.j(i2, k3, d.f715e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (jVar.j(i2, k3, new s((m0) k3))) {
                            break loop0;
                        }
                    } else if (jVar.j(i2, k3, d.f717g)) {
                        if (z(k3)) {
                            jVar.n(i2, d.f714d);
                            break;
                        } else {
                            jVar.n(i2, d.f720j);
                            jVar.h();
                        }
                    }
                }
            } else if (z(k2)) {
                jVar.n(i2, d.f714d);
                break;
            } else {
                jVar.n(i2, d.f720j);
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
        j jVar2 = d.f711a;
        c cVar = c.f710n;
        loop0: while (true) {
            c2 = AbstractC0068a.c(jVar, j2, cVar);
            if (!AbstractC0068a.f(c2)) {
                v d2 = AbstractC0068a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f704m;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f905h >= d2.f905h) {
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
            if (jVar.f905h * d.f712b >= p()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0068a.d(c2);
        boolean u2 = u();
        long j4 = jVar3.f905h;
        if (!u2 && j2 <= f701j.get(this) / d.f712b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f705n;
                v vVar2 = (v) atomicReferenceFieldUpdater2.get(this);
                if (vVar2.f905h >= j4 || !jVar3.i()) {
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
        long j5 = d.f712b * j4;
        do {
            atomicLongFieldUpdater = f700i;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * d.f712b >= p()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public final Throwable k() {
        return (Throwable) f706o.get(this);
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
    /* JADX WARN: Type inference failed for: r2v9, types: [K0.f] */
    @Override // M0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(Object obj, v0.d dVar) {
        j jVar;
        Object obj2;
        ?? r2;
        C0030f c0030f;
        t0.g gVar;
        C0030f c0030f2;
        j jVar2;
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f703l;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f699h;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r = r(andIncrement, false);
            int i2 = d.f712b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = jVar3.f905h;
            t0.g gVar2 = t0.g.f2989a;
            w0.a aVar = w0.a.f3071f;
            if (j5 != j4) {
                j b2 = b(this, j4, jVar3);
                if (b2 != null) {
                    jVar = b2;
                } else if (r) {
                    obj2 = w(obj, dVar);
                    if (obj2 != aVar) {
                        return gVar2;
                    }
                }
            } else {
                jVar = jVar3;
            }
            int d2 = d(this, jVar, i3, obj, j2, null, r);
            if (d2 == 0) {
                jVar.a();
                return gVar2;
            }
            if (d2 == 1) {
                break;
            }
            if (d2 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f700i;
                if (d2 == 3) {
                    C0030f c2 = AbstractC0046w.c(o.g.u(dVar));
                    j jVar4 = jVar;
                    try {
                        int d3 = d(this, jVar4, i3, obj, j2, c2, false);
                        try {
                            if (d3 != 0) {
                                if (d3 != 1) {
                                    if (d3 == 2) {
                                        c0030f = c2;
                                        gVar = gVar2;
                                        c0030f.a(jVar, i3 + i2);
                                    } else if (d3 == 4) {
                                        c0030f = c2;
                                        gVar = gVar2;
                                        if (j2 < atomicLongFieldUpdater2.get(this)) {
                                            jVar.a();
                                        }
                                        c(this, obj, c0030f);
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
                                            int i4 = d.f712b;
                                            long j7 = i4;
                                            long j8 = j6 / j7;
                                            int i5 = (int) (j6 % j7);
                                            if (jVar5.f905h != j8) {
                                                try {
                                                    j b3 = b(this, j8, jVar5);
                                                    if (b3 != null) {
                                                        c0030f2 = c2;
                                                        jVar2 = b3;
                                                    } else if (r3) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C0030f c0030f3 = c2;
                                                }
                                            } else {
                                                c0030f2 = c2;
                                                jVar2 = jVar5;
                                            }
                                            c2 = c0030f2;
                                            j jVar6 = jVar2;
                                            int d4 = d(this, jVar2, i5, obj, j6, c2, r3);
                                            if (d4 == 0) {
                                                c0030f = c2;
                                                gVar = gVar2;
                                                jVar6.a();
                                                break;
                                            }
                                            if (d4 == 1) {
                                                break;
                                            }
                                            if (d4 == 2) {
                                                obj3 = obj;
                                                c0030f = c2;
                                                if (r3) {
                                                    jVar6.h();
                                                } else {
                                                    c0030f.a(jVar6, i5 + i4);
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
                                        c(this, obj3, c0030f);
                                        gVar = gVar2;
                                    }
                                    obj2 = c0030f.u();
                                    if (obj2 != aVar) {
                                        obj2 = gVar;
                                    }
                                    if (obj2 != aVar) {
                                        return gVar;
                                    }
                                }
                                c0030f = c2;
                                gVar = gVar2;
                                c0030f.c(gVar);
                                obj2 = c0030f.u();
                                if (obj2 != aVar) {
                                }
                                if (obj2 != aVar) {
                                }
                            } else {
                                c0030f = c2;
                                gVar = gVar2;
                                jVar.a();
                            }
                            c0030f.c(gVar);
                            obj2 = c0030f.u();
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
                    return gVar2;
                }
                jVar.h();
                obj2 = w(obj, dVar);
                if (obj2 != aVar) {
                    return gVar2;
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
    @Override // M0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Object obj) {
        j jVar;
        j jVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f699h;
        boolean z2 = r(atomicLongFieldUpdater.get(this), false) ? false : !e(r0 & 1152921504606846975L);
        h hVar = i.f733a;
        if (!z2) {
            J.e eVar = d.f720j;
            j jVar3 = (j) f703l.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean r = r(andIncrement, false);
                int i2 = d.f712b;
                long j3 = i2;
                long j4 = j2 / j3;
                int i3 = (int) (j2 % j3);
                if (jVar3.f905h != j4) {
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
                t0.g gVar = t0.g.f2989a;
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
                    if (j2 < f700i.get(this)) {
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
        return f699h.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (M0.j) ((P0.d) P0.d.f869g.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f700i;
        if (i2 == 2) {
            g(j2 & 1152921504606846975L);
            if (z2) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f704m;
                    j jVar = (j) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (p() <= j3) {
                        break;
                    }
                    long j4 = d.f712b;
                    long j5 = j3 / j4;
                    if (jVar.f905h != j5 && (jVar = j(j5, jVar)) == null) {
                        if (((j) atomicReferenceFieldUpdater.get(this)).f905h < j5) {
                            break;
                        }
                    } else {
                        jVar.a();
                        int i3 = (int) (j3 % j4);
                        while (true) {
                            Object k2 = jVar.k(i3);
                            if (k2 == null || k2 == d.f715e) {
                                if (jVar.j(i3, k2, d.f718h)) {
                                    i();
                                    break;
                                }
                            } else {
                                if (k2 == d.f714d) {
                                    return false;
                                }
                                if (k2 != d.f720j && k2 != d.f722l && k2 != d.f719i && k2 != d.f718h) {
                                    if (k2 == d.f717g) {
                                        return false;
                                    }
                                    if (k2 != d.f716f && j3 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f700i.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(E0.h.e("unexpected close status: ", i2).toString());
            }
            j g2 = g(j2 & 1152921504606846975L);
            C0040p c0040p = null;
            Object obj = null;
            loop0: do {
                int i4 = d.f712b - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    long j6 = (g2.f905h * d.f712b) + i4;
                    while (true) {
                        Object k3 = g2.k(i4);
                        if (k3 == d.f719i) {
                            break loop0;
                        }
                        A.j jVar2 = d.f714d;
                        AtomicReferenceArray atomicReferenceArray = g2.f735k;
                        D0.l lVar = this.f709g;
                        if (k3 == jVar2) {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (g2.j(i4, k3, d.f722l)) {
                                if (lVar != null) {
                                    c0040p = AbstractC0068a.b(lVar, atomicReferenceArray.get(i4 * 2), c0040p);
                                }
                                g2.m(i4, null);
                                g2.h();
                            }
                        } else if (k3 == d.f715e || k3 == null) {
                            if (g2.j(i4, k3, d.f722l)) {
                                g2.h();
                                break;
                            }
                        } else if (!(k3 instanceof m0) && !(k3 instanceof s)) {
                            A.j jVar3 = d.f717g;
                            if (k3 == jVar3 || k3 == d.f716f) {
                                break loop0;
                            }
                            if (k3 != jVar3) {
                                break;
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            m0 m0Var = k3 instanceof s ? ((s) k3).f741a : (m0) k3;
                            if (g2.j(i4, k3, d.f722l)) {
                                if (lVar != null) {
                                    c0040p = AbstractC0068a.b(lVar, atomicReferenceArray.get(i4 * 2), c0040p);
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
            if (c0040p != null) {
                throw c0040p;
            }
        }
        return true;
    }

    public final boolean s() {
        return r(f699h.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r3 = (M0.j) r3.b();
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
        int i2 = (int) (f699h.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f708f + ',');
        sb.append("data=[");
        int i3 = 0;
        List D2 = u0.e.D(f704m.get(this), f703l.get(this), f705n.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : D2) {
            if (((j) obj2) != d.f711a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((j) next).f905h;
            do {
                Object next2 = it.next();
                long j3 = ((j) next2).f905h;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j4 = f700i.get(this);
        long p2 = p();
        loop2: while (true) {
            int i4 = d.f712b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (jVar.f905h * d.f712b) + i5;
                if (j5 >= p2 && j5 >= j4) {
                    break loop2;
                }
                Object k2 = jVar.k(i5);
                Object obj3 = jVar.f735k.get(i5 * 2);
                if (k2 instanceof InterfaceC0029e) {
                    obj = (j5 >= j4 || j5 < p2) ? (j5 >= p2 || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof s) {
                    obj = "EB(" + k2 + ')';
                } else if (E0.i.a(k2, d.f716f) ? true : E0.i.a(k2, d.f717g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? true : k2.equals(d.f715e) ? true : E0.i.a(k2, d.f719i) ? true : E0.i.a(k2, d.f718h) ? true : E0.i.a(k2, d.f721k) ? true : E0.i.a(k2, d.f720j) ? true : E0.i.a(k2, d.f722l)) {
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
        if (sb.charAt(J0.h.P(sb)) == ',') {
            E0.i.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j2 = f701j.get(this);
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
        while (jVar.f905h < j2 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f705n;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f905h >= jVar.f905h) {
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
        C0040p b2;
        C0030f c0030f = new C0030f(1, o.g.u(dVar));
        c0030f.v();
        D0.l lVar = this.f709g;
        if (lVar == null || (b2 = AbstractC0068a.b(lVar, obj, null)) == null) {
            c0030f.c(o.g.f(o()));
        } else {
            o.g.a(b2, o());
            c0030f.c(o.g.f(b2));
        }
        Object u2 = c0030f.u();
        return u2 == w0.a.f3071f ? u2 : t0.g.f2989a;
    }

    public final void x(m0 m0Var, boolean z2) {
        if (m0Var instanceof InterfaceC0029e) {
            ((v0.d) m0Var).c(o.g.f(z2 ? m() : o()));
            return;
        }
        if (!(m0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + m0Var).toString());
        }
        a aVar = (a) m0Var;
        C0030f c0030f = aVar.f697g;
        E0.i.b(c0030f);
        aVar.f697g = null;
        aVar.f696f = d.f722l;
        Throwable k2 = aVar.f698h.k();
        if (k2 == null) {
            c0030f.c(Boolean.FALSE);
        } else {
            c0030f.c(o.g.f(k2));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0029e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            E0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0029e interfaceC0029e = (InterfaceC0029e) obj;
            D0.l lVar = this.f709g;
            return d.a(interfaceC0029e, obj2, lVar != null ? new P0.q(lVar, obj2, interfaceC0029e.j()) : null);
        }
        E0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0030f c0030f = aVar.f697g;
        E0.i.b(c0030f);
        aVar.f697g = null;
        aVar.f696f = obj2;
        Boolean bool = Boolean.TRUE;
        D0.l lVar2 = aVar.f698h.f709g;
        return d.a(c0030f, bool, lVar2 != null ? new P0.q(lVar2, obj2, c0030f.f509j) : null);
    }
}
