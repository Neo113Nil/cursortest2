package ad;

import bc.a0;
import dd.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yc.b2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class e implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f293h = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f294i = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f295j = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f296k = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f297l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f298m = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f299n = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f300o = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f301p = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final int f302g;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public e(int i10) {
        this.f302g = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(a4.d.h("Invalid channel capacity: ", i10, ", should be >=0").toString());
        }
        m mVar = g.f304a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f295j.get(this);
        m mVar2 = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar2;
        this.receiveSegment$volatile = mVar2;
        if (y()) {
            mVar2 = g.f304a;
            pc.j.c(mVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar2;
        this._closeCause$volatile = g.f322s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object B(e eVar, hc.c cVar) {
        c cVar2;
        int i10;
        m mVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f289i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f289i = i11 - Integer.MIN_VALUE;
                c cVar3 = cVar2;
                Object obj = cVar3.f287g;
                i10 = cVar3.f289i;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return ((l) obj).f328a;
                }
                v6.a.W(obj);
                m mVar2 = (m) f298m.get(eVar);
                while (!eVar.w()) {
                    long andIncrement = f294i.getAndIncrement(eVar);
                    long j3 = g.f305b;
                    long j6 = andIncrement / j3;
                    int i12 = (int) (andIncrement % j3);
                    if (mVar2.f1884c != j6) {
                        m m10 = eVar.m(j6, mVar2);
                        if (m10 == null) {
                            continue;
                        } else {
                            mVar = m10;
                        }
                    } else {
                        mVar = mVar2;
                    }
                    e eVar2 = eVar;
                    Object G = eVar2.G(mVar, i12, andIncrement, null);
                    if (G == g.f316m) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (G != g.f318o) {
                        if (G != g.f317n) {
                            mVar.a();
                            return G;
                        }
                        cVar3.f289i = 1;
                        Object C = eVar2.C(mVar, i12, andIncrement, cVar3);
                        gc.a aVar = gc.a.f2559g;
                        return C == aVar ? aVar : C;
                    }
                    if (andIncrement < eVar2.r()) {
                        mVar.a();
                    }
                    mVar2 = mVar;
                    eVar = eVar2;
                }
                return new j(eVar.n());
            }
        }
        cVar2 = new c(eVar, cVar);
        c cVar32 = cVar2;
        Object obj2 = cVar32.f287g;
        i10 = cVar32.f289i;
        if (i10 == 0) {
        }
    }

    public static boolean F(Object obj) {
        if (obj instanceof yc.f) {
            return g.a((yc.f) obj, ac.o.f277a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final m b(e eVar, long j3, m mVar) {
        Object a6;
        e eVar2;
        m mVar2 = g.f304a;
        f fVar = f.f303o;
        loop0: while (true) {
            a6 = dd.a.a(mVar, j3, fVar);
            if (!dd.a.d(a6)) {
                dd.u b2 = dd.a.b(a6);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f297l;
                    dd.u uVar = (dd.u) atomicReferenceFieldUpdater.get(eVar);
                    if (uVar.f1884c >= b2.f1884c) {
                        break loop0;
                    }
                    if (!b2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, uVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != uVar) {
                            if (b2.e()) {
                                b2.d();
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
        boolean d10 = dd.a.d(a6);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f294i;
        if (d10) {
            eVar.j();
            if (mVar.f1884c * g.f305b < atomicLongFieldUpdater.get(eVar)) {
                mVar.a();
                return null;
            }
        } else {
            m mVar3 = (m) dd.a.b(a6);
            long j6 = mVar3.f1884c;
            if (j6 <= j3) {
                return mVar3;
            }
            long j10 = g.f305b * j6;
            while (true) {
                long j11 = f293h.get(eVar);
                long j12 = 1152921504606846975L & j11;
                if (j12 >= j10) {
                    eVar2 = eVar;
                    break;
                }
                eVar2 = eVar;
                if (f293h.compareAndSet(eVar2, j11, (((int) (j11 >> 60)) << 60) + j12)) {
                    break;
                }
                eVar = eVar2;
            }
            if (j6 * g.f305b < atomicLongFieldUpdater.get(eVar2)) {
                mVar3.a();
            }
        }
        return null;
    }

    public static final void d(e eVar, Object obj, yc.g gVar) {
        gVar.resumeWith(v6.a.s(eVar.q()));
    }

    public static final int e(e eVar, m mVar, int i10, Object obj, long j3, Object obj2, boolean z10) {
        mVar.m(i10, obj);
        if (z10) {
            return eVar.H(mVar, i10, obj, j3, obj2, z10);
        }
        Object k3 = mVar.k(i10);
        if (k3 == null) {
            if (eVar.f(j3)) {
                if (mVar.j(i10, null, g.f307d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.j(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (k3 instanceof b2) {
            mVar.m(i10, null);
            if (eVar.E(k3, obj)) {
                mVar.n(i10, g.f312i);
                return 0;
            }
            w wVar = g.f314k;
            if (mVar.f330f.getAndSet((i10 * 2) + 1, wVar) == wVar) {
                return 5;
            }
            mVar.l(i10, true);
            return 5;
        }
        return eVar.H(mVar, i10, obj, j3, obj2, z10);
    }

    public static void u(e eVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f296k;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object A(fc.d dVar, Object obj) {
        yc.g gVar = new yc.g(1, a0.w(dVar));
        gVar.q();
        gVar.resumeWith(v6.a.s(q()));
        Object p8 = gVar.p();
        return p8 == gc.a.f2559g ? p8 : ac.o.f277a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(m mVar, int i10, long j3, hc.c cVar) {
        d dVar;
        int i11;
        m mVar2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f292i;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f292i = i12 - Integer.MIN_VALUE;
                Object obj = dVar.f290g;
                i11 = dVar.f292i;
                if (i11 != 0) {
                    v6.a.W(obj);
                    dVar.f292i = 1;
                    yc.g l10 = yc.a0.l(a0.w(dVar));
                    try {
                        s sVar = new s(l10);
                        Object G = G(mVar, i10, j3, sVar);
                        if (G == g.f316m) {
                            sVar.a(mVar, i10);
                        } else if (G == g.f318o) {
                            if (j3 < r()) {
                                mVar.a();
                            }
                            m mVar3 = (m) f298m.get(this);
                            while (true) {
                                if (w()) {
                                    l10.resumeWith(new l(new j(n())));
                                    break;
                                }
                                long andIncrement = f294i.getAndIncrement(this);
                                long j6 = g.f305b;
                                long j10 = andIncrement / j6;
                                int i13 = (int) (andIncrement % j6);
                                if (mVar3.f1884c != j10) {
                                    m m10 = m(j10, mVar3);
                                    if (m10 != null) {
                                        mVar2 = m10;
                                    }
                                } else {
                                    mVar2 = mVar3;
                                }
                                Object G2 = G(mVar2, i13, andIncrement, sVar);
                                m mVar4 = mVar2;
                                if (G2 == g.f316m) {
                                    sVar.a(mVar4, i13);
                                    break;
                                }
                                if (G2 == g.f318o) {
                                    if (andIncrement < r()) {
                                        mVar4.a();
                                    }
                                    mVar3 = mVar4;
                                } else {
                                    if (G2 == g.f317n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    mVar4.a();
                                    l10.A(new l(G2), null);
                                }
                            }
                        } else {
                            mVar.a();
                            l10.A(new l(G), null);
                        }
                        obj = l10.p();
                        gc.a aVar = gc.a.f2559g;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        l10.z();
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ((l) obj).f328a;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f290g;
        i11 = dVar.f292i;
        if (i11 != 0) {
        }
        return ((l) obj2).f328a;
    }

    public final void D(b2 b2Var, boolean z10) {
        if (b2Var instanceof yc.f) {
            ((fc.d) b2Var).resumeWith(v6.a.s(z10 ? o() : q()));
            return;
        }
        if (b2Var instanceof s) {
            ((s) b2Var).f334g.resumeWith(new l(new j(n())));
            return;
        }
        if (!(b2Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + b2Var).toString());
        }
        b bVar = (b) b2Var;
        yc.g gVar = bVar.f285h;
        pc.j.b(gVar);
        bVar.f285h = null;
        bVar.f284g = g.f315l;
        Throwable n7 = bVar.f286i.n();
        if (n7 == null) {
            gVar.resumeWith(Boolean.FALSE);
        } else {
            gVar.resumeWith(v6.a.s(n7));
        }
    }

    public final boolean E(Object obj, Object obj2) {
        if (obj instanceof s) {
            return g.a(((s) obj).f334g, new l(obj2), null);
        }
        if (!(obj instanceof b)) {
            if (obj instanceof yc.f) {
                return g.a((yc.f) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        b bVar = (b) obj;
        yc.g gVar = bVar.f285h;
        pc.j.b(gVar);
        bVar.f285h = null;
        bVar.f284g = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f286i.getClass();
        return g.a(gVar, bool, null);
    }

    public final Object G(m mVar, int i10, long j3, Object obj) {
        Object k3 = mVar.k(i10);
        AtomicReferenceArray atomicReferenceArray = mVar.f330f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f293h;
        if (k3 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f317n;
                }
                if (mVar.j(i10, k3, obj)) {
                    l();
                    return g.f316m;
                }
            }
        } else if (k3 == g.f307d && mVar.j(i10, k3, g.f312i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            mVar.m(i10, null);
            return obj2;
        }
        while (true) {
            Object k10 = mVar.k(i10);
            if (k10 == null || k10 == g.f308e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (mVar.j(i10, k10, g.f311h)) {
                        l();
                        return g.f318o;
                    }
                } else {
                    if (obj == null) {
                        return g.f317n;
                    }
                    if (mVar.j(i10, k10, obj)) {
                        l();
                        return g.f316m;
                    }
                }
            } else if (k10 != g.f307d) {
                w wVar = g.f313j;
                if (k10 == wVar) {
                    return g.f318o;
                }
                if (k10 == g.f311h) {
                    return g.f318o;
                }
                if (k10 == g.f315l) {
                    l();
                    return g.f318o;
                }
                if (k10 != g.f310g && mVar.j(i10, k10, g.f309f)) {
                    boolean z10 = k10 instanceof v;
                    if (z10) {
                        k10 = ((v) k10).f335a;
                    }
                    if (F(k10)) {
                        mVar.n(i10, g.f312i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        mVar.m(i10, null);
                        return obj3;
                    }
                    mVar.n(i10, wVar);
                    mVar.h();
                    if (z10) {
                        l();
                    }
                    return g.f318o;
                }
            } else if (mVar.j(i10, k10, g.f312i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                mVar.m(i10, null);
                return obj4;
            }
        }
    }

    public final int H(m mVar, int i10, Object obj, long j3, Object obj2, boolean z10) {
        while (true) {
            Object k3 = mVar.k(i10);
            if (k3 == null) {
                if (!f(j3) || z10) {
                    if (z10) {
                        if (mVar.j(i10, null, g.f313j)) {
                            mVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.j(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.j(i10, null, g.f307d)) {
                    break;
                }
            } else {
                if (k3 != g.f308e) {
                    w wVar = g.f314k;
                    if (k3 == wVar) {
                        mVar.m(i10, null);
                        return 5;
                    }
                    if (k3 == g.f311h) {
                        mVar.m(i10, null);
                        return 5;
                    }
                    if (k3 == g.f315l) {
                        mVar.m(i10, null);
                        j();
                        return 4;
                    }
                    mVar.m(i10, null);
                    if (k3 instanceof v) {
                        k3 = ((v) k3).f335a;
                    }
                    if (E(k3, obj)) {
                        mVar.n(i10, g.f312i);
                        return 0;
                    }
                    if (mVar.f330f.getAndSet((i10 * 2) + 1, wVar) != wVar) {
                        mVar.l(i10, true);
                    }
                    return 5;
                }
                if (mVar.j(i10, k3, g.f307d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void I(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        e eVar = this;
        if (eVar.y()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f295j;
            if (atomicLongFieldUpdater.get(eVar) > j3) {
                break;
            } else {
                eVar = this;
            }
        }
        int i10 = g.f306c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f296k;
            if (i11 < i10) {
                long j6 = atomicLongFieldUpdater.get(eVar);
                if (j6 == (4611686018427387903L & atomicLongFieldUpdater2.get(eVar)) && j6 == atomicLongFieldUpdater.get(eVar)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                while (true) {
                    long j10 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j10, (j10 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        eVar = this;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(eVar);
                    long j12 = atomicLongFieldUpdater2.get(eVar);
                    long j13 = j12 & 4611686018427387903L;
                    boolean z10 = (j12 & 4611686018427387904L) != 0;
                    if (j11 == j13 && j11 == atomicLongFieldUpdater.get(eVar)) {
                        break;
                    }
                    if (z10) {
                        eVar = this;
                    } else {
                        eVar = this;
                        atomicLongFieldUpdater2.compareAndSet(eVar, j12, 4611686018427387904L + j13);
                    }
                }
                while (true) {
                    long j14 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j14, j14 & 4611686018427387903L)) {
                        return;
                    } else {
                        eVar = this;
                    }
                }
            }
        }
    }

    @Override // ad.t
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163 A[RETURN] */
    @Override // ad.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(fc.d dVar, Object obj) {
        Object p8;
        Object obj2;
        e eVar;
        m mVar;
        int i10;
        e eVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f297l;
        m mVar2 = (m) atomicReferenceFieldUpdater.get(eVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f293h;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(eVar2);
            long j3 = andIncrement & 1152921504606846975L;
            boolean v10 = eVar2.v(false, andIncrement);
            int i11 = g.f305b;
            long j6 = i11;
            long j10 = j3 / j6;
            int i12 = (int) (j3 % j6);
            long j11 = mVar2.f1884c;
            gc.a aVar = gc.a.f2559g;
            ac.o oVar = ac.o.f277a;
            if (j11 != j10) {
                m b2 = b(eVar2, j10, mVar2);
                if (b2 != null) {
                    mVar2 = b2;
                } else if (v10) {
                    Object A = A(dVar, obj);
                    if (A == aVar) {
                        return A;
                    }
                }
            }
            int e10 = e(eVar2, mVar2, i12, obj, j3, null, v10);
            if (e10 == 0) {
                mVar2.a();
                return oVar;
            }
            if (e10 == 1) {
                break;
            }
            if (e10 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f294i;
                if (e10 == 3) {
                    yc.g l10 = yc.a0.l(a0.w(dVar));
                    Object obj3 = obj;
                    try {
                        int e11 = e(eVar2, mVar2, i12, obj3, j3, l10, false);
                        try {
                            if (e11 != 0) {
                                if (e11 == 1) {
                                    l10.resumeWith(oVar);
                                } else if (e11 != 2) {
                                    if (e11 != 4) {
                                        String str = "unexpected";
                                        if (e11 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar2.a();
                                        m mVar3 = (m) atomicReferenceFieldUpdater.get(eVar2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(eVar2);
                                            long j12 = andIncrement2 & 1152921504606846975L;
                                            boolean v11 = eVar2.v(false, andIncrement2);
                                            int i13 = g.f305b;
                                            long j13 = i13;
                                            String str2 = str;
                                            long j14 = j12 / j13;
                                            int i14 = (int) (j12 % j13);
                                            if (mVar3.f1884c != j14) {
                                                m b10 = b(eVar2, j14, mVar3);
                                                if (b10 != null) {
                                                    i10 = i13;
                                                    mVar = b10;
                                                } else {
                                                    if (v11) {
                                                        break;
                                                    }
                                                    str = str2;
                                                }
                                            } else {
                                                mVar = mVar3;
                                                i10 = i13;
                                            }
                                            int e12 = e(eVar2, mVar, i14, obj3, j12, l10, v11);
                                            Object obj4 = obj3;
                                            eVar = eVar2;
                                            m mVar4 = mVar;
                                            obj2 = obj4;
                                            if (e12 == 0) {
                                                mVar4.a();
                                                break;
                                            }
                                            if (e12 == 1) {
                                                break;
                                            }
                                            if (e12 != 2) {
                                                if (e12 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (e12 != 4) {
                                                    if (e12 == 5) {
                                                        mVar4.a();
                                                    }
                                                    mVar3 = mVar4;
                                                    eVar2 = eVar;
                                                    str = str2;
                                                    obj3 = obj2;
                                                } else if (j12 < atomicLongFieldUpdater2.get(eVar)) {
                                                    mVar4.a();
                                                }
                                            } else if (v11) {
                                                mVar4.h();
                                            } else {
                                                l10.a(mVar4, i14 + i10);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        eVar = eVar2;
                                        if (j3 < atomicLongFieldUpdater2.get(eVar)) {
                                            mVar2.a();
                                        }
                                    }
                                    d(eVar, obj2, l10);
                                } else {
                                    l10.a(mVar2, i12 + i11);
                                }
                                p8 = l10.p();
                                if (p8 != aVar) {
                                    p8 = oVar;
                                }
                                if (p8 != aVar) {
                                    return p8;
                                }
                            } else {
                                mVar2.a();
                            }
                            l10.resumeWith(oVar);
                            p8 = l10.p();
                            if (p8 != aVar) {
                            }
                            if (p8 != aVar) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            l10.z();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (e10 == 4) {
                    if (j3 < atomicLongFieldUpdater2.get(eVar2)) {
                        mVar2.a();
                    }
                    Object A2 = A(dVar, obj);
                    if (A2 == aVar) {
                        return A2;
                    }
                } else if (e10 == 5) {
                    mVar2.a();
                }
            } else if (v10) {
                mVar2.h();
                Object A3 = A(dVar, obj);
                if (A3 == aVar) {
                    return A3;
                }
            }
        }
    }

    public final boolean f(long j3) {
        return j3 < f295j.get(this) || j3 < f294i.get(this) + ((long) this.f302g);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Throwable th, boolean z10) {
        e eVar;
        w wVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z11;
        long j3;
        long j6;
        long j10;
        Object obj;
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f293h;
        if (z10) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
                if (((int) (j12 >> 60)) == 0) {
                    m mVar = g.f304a;
                    eVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j12, (j12 & 1152921504606846975L) + (1 << 60)));
            wVar = g.f322s;
            while (true) {
                atomicReferenceFieldUpdater = f300o;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, wVar, th)) {
                    z11 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != wVar) {
                    z11 = false;
                    break;
                }
            }
            if (z10) {
                do {
                    j3 = atomicLongFieldUpdater.get(this);
                    int i10 = (int) (j3 >> 60);
                    if (i10 == 0) {
                        j6 = j3 & 1152921504606846975L;
                        j10 = 2;
                    } else {
                        if (i10 != 1) {
                            break;
                        }
                        j6 = j3 & 1152921504606846975L;
                        j10 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(eVar, j3, (j10 << 60) + j6));
            } else {
                do {
                    j11 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(eVar, j11, (3 << 60) + (j11 & 1152921504606846975L)));
            }
            j();
            if (z11) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f301p;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    w wVar2 = obj == null ? g.f320q : g.f321r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, wVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    pc.v.c(1, obj);
                    ((oc.c) obj).invoke(n());
                    return z11;
                }
            }
            return z11;
        }
        eVar = this;
        wVar = g.f322s;
        while (true) {
            atomicReferenceFieldUpdater = f300o;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, wVar, th)) {
            }
        }
        if (z10) {
        }
        j();
        if (z11) {
        }
        return z11;
    }

    @Override // ad.t
    public final Object h(fc.d dVar) {
        m mVar;
        Throwable th;
        m mVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f298m;
        m mVar3 = (m) atomicReferenceFieldUpdater.get(this);
        while (!w()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f294i;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = g.f305b;
            long j6 = andIncrement / j3;
            int i10 = (int) (andIncrement % j3);
            if (mVar3.f1884c != j6) {
                m m10 = m(j6, mVar3);
                if (m10 == null) {
                    continue;
                } else {
                    mVar = m10;
                }
            } else {
                mVar = mVar3;
            }
            Object G = G(mVar, i10, andIncrement, null);
            w wVar = g.f316m;
            if (G == wVar) {
                throw new IllegalStateException("unexpected");
            }
            w wVar2 = g.f318o;
            if (G == wVar2) {
                if (andIncrement < r()) {
                    mVar.a();
                }
                mVar3 = mVar;
            } else {
                if (G != g.f317n) {
                    mVar.a();
                    return G;
                }
                yc.g l10 = yc.a0.l(a0.w(dVar));
                e eVar = this;
                try {
                    Object G2 = eVar.G(mVar, i10, andIncrement, l10);
                    if (G2 == wVar) {
                        l10.a(mVar, i10);
                    } else {
                        if (G2 == wVar2) {
                            if (andIncrement < r()) {
                                mVar.a();
                            }
                            m mVar4 = (m) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (w()) {
                                    l10.resumeWith(v6.a.s(o()));
                                    break;
                                }
                                yc.g gVar = l10;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j10 = g.f305b;
                                    long j11 = andIncrement2 / j10;
                                    int i11 = (int) (andIncrement2 % j10);
                                    if (mVar4.f1884c != j11) {
                                        try {
                                            m m11 = m(j11, mVar4);
                                            if (m11 == null) {
                                                l10 = gVar;
                                            } else {
                                                mVar2 = m11;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            l10 = gVar;
                                            l10.z();
                                            throw th;
                                        }
                                    } else {
                                        mVar2 = mVar4;
                                    }
                                    G2 = eVar.G(mVar2, i11, andIncrement2, gVar);
                                    m mVar5 = mVar2;
                                    l10 = gVar;
                                    if (G2 == g.f316m) {
                                        l10.a(mVar5, i11);
                                        break;
                                    }
                                    if (G2 == g.f318o) {
                                        if (andIncrement2 < r()) {
                                            mVar5.a();
                                        }
                                        eVar = this;
                                        mVar4 = mVar5;
                                    } else {
                                        if (G2 == g.f317n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    l10 = gVar;
                                    th = th;
                                    l10.z();
                                    throw th;
                                }
                            }
                        } else {
                            mVar.a();
                        }
                        l10.A(G2, null);
                    }
                    return l10.p();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable o7 = o();
        int i12 = dd.v.f1885a;
        throw o7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (ad.m) ((dd.d) dd.d.f1850b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m i(long j3) {
        Object obj;
        long j6;
        Object obj2 = f299n.get(this);
        m mVar = (m) f297l.get(this);
        if (mVar.f1884c > ((m) obj2).f1884c) {
            obj2 = mVar;
        }
        m mVar2 = (m) f298m.get(this);
        if (mVar2.f1884c > ((m) obj2).f1884c) {
            obj2 = mVar2;
        }
        dd.d dVar = (dd.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dd.d.f1849a;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            w wVar = dd.a.f1840b;
            obj = null;
            if (obj3 == wVar) {
                break;
            }
            dd.d dVar2 = (dd.d) obj3;
            if (dVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, wVar)) {
                    if (atomicReferenceFieldUpdater.get(dVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            dVar = dVar2;
        }
        m mVar3 = (m) dVar;
        if (x()) {
            m mVar4 = mVar3;
            loop2: do {
                int i10 = g.f305b - 1;
                while (true) {
                    if (-1 >= i10) {
                        break;
                    }
                    j6 = (mVar4.f1884c * g.f305b) + i10;
                    if (j6 < f294i.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k3 = mVar4.k(i10);
                        if (k3 != null && k3 != g.f308e) {
                            if (k3 == g.f307d) {
                                break loop2;
                            }
                        } else {
                            if (mVar4.j(i10, k3, g.f315l)) {
                                mVar4.h();
                                break;
                            }
                        }
                    }
                    i10--;
                }
            } while (mVar4 != null);
            j6 = -1;
            if (j6 != -1) {
                k(j6);
            }
        }
        loop5: for (m mVar5 = mVar3; mVar5 != null; mVar5 = (m) ((dd.d) dd.d.f1850b.get(mVar5))) {
            for (int i11 = g.f305b - 1; -1 < i11; i11--) {
                if ((mVar5.f1884c * g.f305b) + i11 < j3) {
                    break loop5;
                }
                while (true) {
                    Object k10 = mVar5.k(i11);
                    if (k10 != null && k10 != g.f308e) {
                        if (!(k10 instanceof v)) {
                            if (!(k10 instanceof b2)) {
                                break;
                            }
                            if (mVar5.j(i11, k10, g.f315l)) {
                                obj = dd.a.e(obj, k10);
                                mVar5.l(i11, true);
                                break;
                            }
                        } else {
                            if (mVar5.j(i11, k10, g.f315l)) {
                                obj = dd.a.e(obj, ((v) k10).f335a);
                                mVar5.l(i11, true);
                                break;
                            }
                        }
                    } else {
                        if (mVar5.j(i11, k10, g.f315l)) {
                            mVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                D((b2) obj, true);
                return mVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                D((b2) arrayList.get(size), true);
            }
        }
        return mVar3;
    }

    public final void j() {
        v(false, f293h.get(this));
    }

    public final void k(long j3) {
        m mVar = (m) f298m.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f294i;
            long j6 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f302g + j6, f295j.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j6, 1 + j6)) {
                long j10 = g.f305b;
                long j11 = j6 / j10;
                int i10 = (int) (j6 % j10);
                if (mVar.f1884c != j11) {
                    m m10 = m(j11, mVar);
                    if (m10 != null) {
                        mVar = m10;
                    }
                }
                m mVar2 = mVar;
                if (G(mVar2, i10, j6, null) != g.f318o) {
                    mVar2.a();
                } else if (j6 < r()) {
                    mVar2.a();
                }
                mVar = mVar2;
            }
        }
    }

    public final void l() {
        Object a6;
        if (y()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f299n;
        m mVar = (m) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f295j.getAndIncrement(this);
            long j3 = andIncrement / g.f305b;
            if (r() <= andIncrement) {
                if (mVar.f1884c < j3 && mVar.b() != null) {
                    z(j3, mVar);
                }
                u(this);
                return;
            }
            if (mVar.f1884c != j3) {
                f fVar = f.f303o;
                while (true) {
                    a6 = dd.a.a(mVar, j3, fVar);
                    if (!dd.a.d(a6)) {
                        dd.u b2 = dd.a.b(a6);
                        while (true) {
                            dd.u uVar = (dd.u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f1884c >= b2.f1884c) {
                                break;
                            }
                            if (!b2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, b2)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (b2.e()) {
                                        b2.d();
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
                m mVar2 = null;
                if (dd.a.d(a6)) {
                    j();
                    z(j3, mVar);
                    u(this);
                } else {
                    m mVar3 = (m) dd.a.b(a6);
                    long j6 = mVar3.f1884c;
                    if (j6 > j3) {
                        long j10 = j6 * g.f305b;
                        if (f295j.compareAndSet(this, 1 + andIncrement, j10)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f296k;
                            if ((atomicLongFieldUpdater.addAndGet(this, j10 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            u(this);
                        }
                    } else {
                        mVar2 = mVar3;
                    }
                }
                if (mVar2 == null) {
                    continue;
                } else {
                    mVar = mVar2;
                }
            }
            int i10 = (int) (andIncrement % g.f305b);
            Object k3 = mVar.k(i10);
            boolean z10 = k3 instanceof b2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f294i;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !mVar.j(i10, k3, g.f310g)) {
                while (true) {
                    Object k10 = mVar.k(i10);
                    if (!(k10 instanceof b2)) {
                        if (k10 != g.f313j) {
                            if (k10 != null) {
                                if (k10 == g.f307d || k10 == g.f311h || k10 == g.f312i || k10 == g.f314k || k10 == g.f315l) {
                                    break loop0;
                                }
                                if (k10 != g.f309f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k10).toString());
                                }
                            } else if (mVar.j(i10, k10, g.f308e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (mVar.j(i10, k10, new v((b2) k10))) {
                            break loop0;
                        }
                    } else if (mVar.j(i10, k10, g.f310g)) {
                        if (F(k10)) {
                            mVar.n(i10, g.f307d);
                            break;
                        } else {
                            mVar.n(i10, g.f313j);
                            mVar.h();
                        }
                    }
                }
            } else if (F(k3)) {
                mVar.n(i10, g.f307d);
                break;
            } else {
                mVar.n(i10, g.f313j);
                mVar.h();
                u(this);
            }
        }
        u(this);
    }

    public final m m(long j3, m mVar) {
        Object a6;
        long j6;
        m mVar2 = g.f304a;
        f fVar = f.f303o;
        loop0: while (true) {
            a6 = dd.a.a(mVar, j3, fVar);
            if (!dd.a.d(a6)) {
                dd.u b2 = dd.a.b(a6);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f298m;
                    dd.u uVar = (dd.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f1884c >= b2.f1884c) {
                        break loop0;
                    }
                    if (!b2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (b2.e()) {
                                b2.d();
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
        if (dd.a.d(a6)) {
            j();
            if (mVar.f1884c * g.f305b < r()) {
                mVar.a();
                return null;
            }
        } else {
            m mVar3 = (m) dd.a.b(a6);
            long j10 = mVar3.f1884c;
            if (!y() && j3 <= f295j.get(this) / g.f305b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f299n;
                    dd.u uVar2 = (dd.u) atomicReferenceFieldUpdater2.get(this);
                    if (uVar2.f1884c >= j10 || !mVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, mVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                            if (mVar3.e()) {
                                mVar3.d();
                            }
                        }
                    }
                    if (uVar2.e()) {
                        uVar2.d();
                    }
                }
            }
            if (j10 <= j3) {
                return mVar3;
            }
            long j11 = j10 * g.f305b;
            do {
                j6 = f294i.get(this);
                if (j6 >= j11) {
                    break;
                }
            } while (!f294i.compareAndSet(this, j6, j11));
            if (j10 * g.f305b < r()) {
                mVar3.a();
            }
        }
        return null;
    }

    public final Throwable n() {
        return (Throwable) f300o.get(this);
    }

    public final Throwable o() {
        Throwable n7 = n();
        return n7 == null ? new n("Channel was closed") : n7;
    }

    @Override // ad.t
    public final Object p() {
        m mVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f294i;
        long j3 = atomicLongFieldUpdater.get(this);
        long j6 = f293h.get(this);
        if (v(true, j6)) {
            return new j(n());
        }
        long j10 = j6 & 1152921504606846975L;
        k kVar = l.f327b;
        if (j3 >= j10) {
            return kVar;
        }
        Object obj = g.f314k;
        m mVar2 = (m) f298m.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = g.f305b;
            long j12 = andIncrement / j11;
            int i10 = (int) (andIncrement % j11);
            if (mVar2.f1884c != j12) {
                m m10 = m(j12, mVar2);
                if (m10 == null) {
                    continue;
                } else {
                    mVar = m10;
                }
            } else {
                mVar = mVar2;
            }
            Object G = G(mVar, i10, andIncrement, obj);
            m mVar3 = mVar;
            if (G == g.f316m) {
                b2 b2Var = obj instanceof b2 ? (b2) obj : null;
                if (b2Var != null) {
                    b2Var.a(mVar3, i10);
                }
                I(andIncrement);
                mVar3.h();
                return kVar;
            }
            if (G != g.f318o) {
                if (G == g.f317n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar3.a();
                return G;
            }
            if (andIncrement < r()) {
                mVar3.a();
            }
            mVar2 = mVar3;
        }
        return new j(n());
    }

    public final Throwable q() {
        Throwable n7 = n();
        return n7 == null ? new o("Channel was closed") : n7;
    }

    public final long r() {
        return f293h.get(this) & 1152921504606846975L;
    }

    @Override // ad.u
    public Object s(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f293h;
        boolean z10 = false;
        long j3 = 1152921504606846975L;
        boolean z11 = v(false, atomicLongFieldUpdater.get(this)) ? false : !f(r1 & 1152921504606846975L);
        k kVar = l.f327b;
        if (z11) {
            return kVar;
        }
        h4.f fVar = g.f313j;
        m mVar = (m) f297l.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j6 = andIncrement & j3;
            boolean v10 = v(z10, andIncrement);
            int i10 = g.f305b;
            long j10 = i10;
            long j11 = j6 / j10;
            int i11 = (int) (j6 % j10);
            if (mVar.f1884c != j11) {
                m b2 = b(this, j11, mVar);
                if (b2 != null) {
                    mVar = b2;
                } else {
                    if (v10) {
                        return new j(q());
                    }
                    z10 = false;
                    j3 = 1152921504606846975L;
                }
            }
            int e10 = e(this, mVar, i11, obj, j6, fVar, v10);
            ac.o oVar = ac.o.f277a;
            if (e10 == 0) {
                mVar.a();
                return oVar;
            }
            if (e10 == 1) {
                return oVar;
            }
            if (e10 == 2) {
                if (v10) {
                    mVar.h();
                    return new j(q());
                }
                b2 b2Var = fVar instanceof b2 ? (b2) fVar : null;
                if (b2Var != null) {
                    b2Var.a(mVar, i11 + i10);
                }
                mVar.h();
                return kVar;
            }
            if (e10 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (e10 == 4) {
                if (j6 < f294i.get(this)) {
                    mVar.a();
                }
                return new j(q());
            }
            if (e10 == 5) {
                mVar.a();
            }
            z10 = false;
            j3 = 1152921504606846975L;
        }
    }

    @Override // ad.t
    public final Object t(cd.p pVar) {
        return B(this, pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b2, code lost:
    
        r16 = r7;
        r3 = (ad.m) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bb, code lost:
    
        if (r3 != null) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z10;
        String obj;
        StringBuilder sb = new StringBuilder();
        int i10 = (int) (f293h.get(this) >> 60);
        if (i10 == 2) {
            sb.append("closed,");
        } else if (i10 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f302g + ',');
        sb.append("data=[");
        int i11 = 0;
        boolean z11 = true;
        List L = bc.n.L(f298m.get(this), f297l.get(this), f299n.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : L) {
            if (((m) obj2) != g.f304a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j3 = ((m) next).f1884c;
            do {
                Object next2 = it.next();
                long j6 = ((m) next2).f1884c;
                if (j3 > j6) {
                    next = next2;
                    j3 = j6;
                }
            } while (it.hasNext());
        }
        m mVar = (m) next;
        long j10 = f294i.get(this);
        long r5 = r();
        loop2: while (true) {
            int i12 = g.f305b;
            int i13 = i11;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                long j11 = (mVar.f1884c * g.f305b) + i13;
                if (j11 >= r5 && j11 >= j10) {
                    break loop2;
                }
                Object k3 = mVar.k(i13);
                boolean z12 = z11;
                Object obj3 = mVar.f330f.get(i13 * 2);
                if (k3 instanceof yc.f) {
                    obj = (j11 >= j10 || j11 < r5) ? (j11 >= r5 || j11 < j10) ? "cont" : "send" : "receive";
                } else if (k3 instanceof s) {
                    obj = "receiveCatching";
                } else if (k3 instanceof v) {
                    obj = "EB(" + k3 + ')';
                } else if (pc.j.a(k3, g.f309f) ? z12 : pc.j.a(k3, g.f310g)) {
                    obj = "resuming_sender";
                } else if (k3 == null ? z12 : k3.equals(g.f308e) ? z12 : pc.j.a(k3, g.f312i) ? z12 : pc.j.a(k3, g.f311h) ? z12 : pc.j.a(k3, g.f314k) ? z12 : pc.j.a(k3, g.f313j) ? z12 : pc.j.a(k3, g.f315l)) {
                    i13++;
                    z11 = z12;
                } else {
                    obj = k3.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i13++;
                z11 = z12;
            }
            z11 = z10;
            i11 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(xc.h.p(sb)) == ',') {
            pc.j.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (ad.m) ((dd.d) dd.d.f1850b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(boolean z10, long j3) {
        int i10 = (int) (j3 >> 60);
        if (i10 != 0 && i10 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f294i;
            if (i10 == 2) {
                i(1152921504606846975L & j3);
                if (z10) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f298m;
                        m mVar = (m) atomicReferenceFieldUpdater.get(this);
                        long j6 = atomicLongFieldUpdater.get(this);
                        if (r() <= j6) {
                            break;
                        }
                        long j10 = g.f305b;
                        long j11 = j6 / j10;
                        if (mVar.f1884c != j11 && (mVar = m(j11, mVar)) == null) {
                            if (((m) atomicReferenceFieldUpdater.get(this)).f1884c < j11) {
                                break;
                            }
                        } else {
                            mVar.a();
                            int i11 = (int) (j6 % j10);
                            while (true) {
                                Object k3 = mVar.k(i11);
                                if (k3 == null || k3 == g.f308e) {
                                    if (mVar.j(i11, k3, g.f311h)) {
                                        l();
                                        break;
                                    }
                                } else {
                                    if (k3 == g.f307d) {
                                        break;
                                    }
                                    if (k3 != g.f313j) {
                                        if (k3 != g.f315l) {
                                            if (k3 != g.f312i) {
                                                if (k3 != g.f311h) {
                                                    if (k3 == g.f310g) {
                                                        break;
                                                    }
                                                    if (k3 != g.f309f && j6 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f294i.compareAndSet(this, j6, j6 + 1);
                        }
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException(a4.d.g("unexpected close status: ", i10).toString());
                }
                m i12 = i(1152921504606846975L & j3);
                Object obj = null;
                loop0: do {
                    int i13 = g.f305b - 1;
                    while (true) {
                        if (-1 >= i13) {
                            break;
                        }
                        long j12 = (i12.f1884c * g.f305b) + i13;
                        while (true) {
                            Object k10 = i12.k(i13);
                            if (k10 == g.f312i) {
                                break loop0;
                            }
                            if (k10 == g.f307d) {
                                if (j12 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (i12.j(i13, k10, g.f315l)) {
                                    i12.m(i13, null);
                                    i12.h();
                                    break;
                                }
                            } else if (k10 != g.f308e && k10 != null) {
                                if (!(k10 instanceof b2) && !(k10 instanceof v)) {
                                    w wVar = g.f310g;
                                    if (k10 == wVar || k10 == g.f309f) {
                                        break loop0;
                                    }
                                    if (k10 != wVar) {
                                        break;
                                    }
                                } else {
                                    if (j12 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    b2 b2Var = k10 instanceof v ? ((v) k10).f335a : (b2) k10;
                                    if (i12.j(i13, k10, g.f315l)) {
                                        obj = dd.a.e(obj, b2Var);
                                        i12.m(i13, null);
                                        i12.h();
                                        break;
                                    }
                                }
                            } else if (i12.j(i13, k10, g.f315l)) {
                                i12.h();
                                break;
                            }
                        }
                        i13--;
                    }
                } while (i12 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            D((b2) arrayList.get(size), false);
                        }
                    } else {
                        D((b2) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean w() {
        return v(true, f293h.get(this));
    }

    public boolean x() {
        return false;
    }

    public final boolean y() {
        long j3 = f295j.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(long j3, m mVar) {
        m mVar2;
        m mVar3;
        while (mVar.f1884c < j3 && (mVar3 = (m) mVar.b()) != null) {
            mVar = mVar3;
        }
        while (true) {
            if (!mVar.c() || (mVar2 = (m) mVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f299n;
                    dd.u uVar = (dd.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f1884c >= mVar.f1884c) {
                        return;
                    }
                    if (!mVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, mVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (mVar.e()) {
                                mVar.d();
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
            mVar = mVar2;
        }
    }
}
