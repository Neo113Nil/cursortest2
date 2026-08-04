package com.gamericefishpro.space.ri;

import com.gamericefishpro.space.ei.e0;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.e2;
import com.gamericefishpro.space.t0.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class e implements i {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater v = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater w = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater z = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");

    public e(int i2) {
        this.d = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(y0.f(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        m mVar = g.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = v.get(this);
        m mVar2 = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar2;
        this.receiveSegment$volatile = mVar2;
        if (y()) {
            mVar2 = g.a;
            Intrinsics.c(mVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar2;
        this._closeCause$volatile = g.s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object B(e eVar, com.gamericefishpro.space.vh.c cVar) {
        c cVar2;
        m mVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i2 = cVar2.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.i = i2 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(eVar, cVar);
            }
        } else {
            cVar2 = new c(eVar, cVar);
        }
        c cVar3 = cVar2;
        Object obj = cVar3.d;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i3 = cVar3.i;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            return ((l) obj).a;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        m mVar2 = (m) z.get(eVar);
        while (!eVar.w()) {
            long andIncrement = i.getAndIncrement(eVar);
            long j = g.b;
            long j2 = andIncrement / j;
            int i4 = (int) (andIncrement % j);
            if (mVar2.c != j2) {
                m mVarP = eVar.p(j2, mVar2);
                if (mVarP == null) {
                    continue;
                } else {
                    mVar = mVarP;
                }
            } else {
                mVar = mVar2;
            }
            e eVar2 = eVar;
            Object objG = eVar2.G(mVar, i4, andIncrement, null);
            if (objG == g.m) {
                throw new IllegalStateException("unexpected");
            }
            if (objG != g.o) {
                if (objG != g.n) {
                    mVar.a();
                    return objG;
                }
                cVar3.i = 1;
                Object objC = eVar2.C(mVar, i4, andIncrement, cVar3);
                return objC == aVar ? aVar : objC;
            }
            if (andIncrement < eVar2.t()) {
                mVar.a();
            }
            eVar = eVar2;
            mVar2 = mVar;
        }
        return new j(eVar.q());
    }

    public static boolean F(Object obj) {
        if (obj instanceof com.gamericefishpro.space.pi.f) {
            return g.a((com.gamericefishpro.space.pi.f) obj, Unit.a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final m b(e eVar, long j, m mVar) {
        Object objB;
        e eVar2;
        m mVar2 = g.a;
        f fVar = f.B;
        loop0: while (true) {
            objB = com.gamericefishpro.space.ui.a.b(mVar, j, fVar);
            if (!com.gamericefishpro.space.ui.a.e(objB)) {
                com.gamericefishpro.space.ui.q qVarC = com.gamericefishpro.space.ui.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
                    com.gamericefishpro.space.ui.q qVar = (com.gamericefishpro.space.ui.q) atomicReferenceFieldUpdater.get(eVar);
                    if (qVar.c >= qVarC.c) {
                        break loop0;
                    }
                    if (!qVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(eVar, qVar, qVarC)) {
                            if (!qVar.e()) {
                                break loop0;
                            }
                            qVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(eVar) == qVar);
                    if (qVarC.e()) {
                        qVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = com.gamericefishpro.space.ui.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if (zE) {
            eVar.m();
            if (mVar.c * ((long) g.b) < atomicLongFieldUpdater.get(eVar)) {
                mVar.a();
                return null;
            }
        } else {
            m mVar3 = (m) com.gamericefishpro.space.ui.a.c(objB);
            long j2 = mVar3.c;
            if (j2 <= j) {
                return mVar3;
            }
            long j3 = ((long) g.b) * j2;
            while (true) {
                long j4 = e.get(eVar);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    eVar2 = eVar;
                    break;
                }
                eVar2 = eVar;
                if (e.compareAndSet(eVar2, j4, (((long) ((int) (j4 >> 60))) << 60) + j5)) {
                    break;
                }
                eVar = eVar2;
            }
            if (j2 * ((long) g.b) < atomicLongFieldUpdater.get(eVar2)) {
                mVar3.a();
            }
        }
        return null;
    }

    public static final void f(e eVar, Object obj, com.gamericefishpro.space.pi.h hVar) {
        Throwable thS = eVar.s();
        com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
        hVar.resumeWith(com.gamericefishpro.space.wa.b.q(thS));
    }

    public static final int h(e eVar, m mVar, int i2, Object obj, long j, Object obj2, boolean z2) {
        mVar.m(i2, obj);
        if (z2) {
            return eVar.H(mVar, i2, obj, j, obj2, z2);
        }
        Object objK = mVar.k(i2);
        if (objK == null) {
            if (eVar.i(j)) {
                if (mVar.j(i2, null, g.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof e2) {
            mVar.m(i2, null);
            if (eVar.E(objK, obj)) {
                mVar.n(i2, g.i);
                return 0;
            }
            com.gamericefishpro.space.d6.a aVar = g.k;
            if (mVar.f.getAndSet((i2 * 2) + 1, aVar) == aVar) {
                return 5;
            }
            mVar.l(i2, true);
            return 5;
        }
        return eVar.H(mVar, i2, obj, j, obj2, z2);
    }

    public static void u(e eVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = w;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object A(com.gamericefishpro.space.th.a frame, Object obj) {
        com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        Throwable thS = s();
        com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
        hVar.resumeWith(com.gamericefishpro.space.wa.b.q(thS));
        Object objR = hVar.r();
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR == aVar ? objR : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object C(m mVar, int i2, long j, com.gamericefishpro.space.vh.c cVar) {
        d frame;
        l lVar;
        m mVarP;
        if (cVar instanceof d) {
            frame = (d) cVar;
            int i3 = frame.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                frame.i = i3 - Integer.MIN_VALUE;
            } else {
                frame = new d(this, cVar);
            }
        } else {
            frame = new d(this, cVar);
        }
        Object objR = frame.d;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i4 = frame.i;
        if (i4 == 0) {
            com.gamericefishpro.space.wa.b.P(objR);
            frame.i = 1;
            com.gamericefishpro.space.pi.h hVarO = a0.o(com.gamericefishpro.space.uh.f.b(frame));
            try {
                r rVar = new r(hVarO);
                Object objG = G(mVar, i2, j, rVar);
                if (objG != g.m) {
                    if (objG == g.o) {
                        if (j < t()) {
                            mVar.a();
                        }
                        m mVar2 = (m) z.get(this);
                        while (true) {
                            if (w()) {
                                com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                                hVarO.resumeWith(new l(new j(q())));
                                break;
                            }
                            long andIncrement = i.getAndIncrement(this);
                            long j2 = g.b;
                            long j3 = andIncrement / j2;
                            int i5 = (int) (andIncrement % j2);
                            if (mVar2.c != j3) {
                                mVarP = p(j3, mVar2);
                                if (mVarP == null) {
                                }
                            } else {
                                mVarP = mVar2;
                            }
                            Object objG2 = G(mVarP, i5, andIncrement, rVar);
                            if (objG2 == g.m) {
                                rVar.a(mVarP, i5);
                                break;
                            }
                            if (objG2 == g.o) {
                                if (andIncrement < t()) {
                                    mVarP.a();
                                }
                                mVar2 = mVarP;
                            } else {
                                if (objG2 == g.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                mVarP.a();
                                lVar = new l(objG2);
                            }
                        }
                    } else {
                        mVar.a();
                        lVar = new l(objG);
                    }
                    hVarO.h(lVar, null);
                    break;
                }
                rVar.a(mVar, i2);
                objR = hVarO.r();
                if (objR == com.gamericefishpro.space.uh.a.d) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objR == aVar) {
                    return aVar;
                }
            } catch (Throwable th) {
                hVarO.A();
                throw th;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objR);
        }
        return ((l) objR).a;
    }

    public final void D(e2 e2Var, boolean z2) {
        if (e2Var instanceof com.gamericefishpro.space.pi.f) {
            com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) e2Var;
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            aVar.resumeWith(com.gamericefishpro.space.wa.b.q(z2 ? r() : s()));
            return;
        }
        if (e2Var instanceof r) {
            com.gamericefishpro.space.pi.h hVar = ((r) e2Var).d;
            com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
            hVar.resumeWith(new l(new j(q())));
            return;
        }
        if (!(e2Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + e2Var).toString());
        }
        b bVar = (b) e2Var;
        com.gamericefishpro.space.pi.h hVar2 = bVar.e;
        Intrinsics.b(hVar2);
        bVar.e = null;
        bVar.d = g.l;
        Throwable thQ = bVar.i.q();
        if (thQ == null) {
            com.gamericefishpro.space.oh.n nVar3 = com.gamericefishpro.space.oh.p.d;
            hVar2.resumeWith(Boolean.FALSE);
        } else {
            com.gamericefishpro.space.oh.n nVar4 = com.gamericefishpro.space.oh.p.d;
            hVar2.resumeWith(com.gamericefishpro.space.wa.b.q(thQ));
        }
    }

    public final boolean E(Object obj, Object obj2) {
        if (obj instanceof r) {
            return g.a(((r) obj).d, new l(obj2), null);
        }
        if (!(obj instanceof b)) {
            if (obj instanceof com.gamericefishpro.space.pi.f) {
                return g.a((com.gamericefishpro.space.pi.f) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        b bVar = (b) obj;
        com.gamericefishpro.space.pi.h hVar = bVar.e;
        Intrinsics.b(hVar);
        bVar.e = null;
        bVar.d = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.i.getClass();
        return g.a(hVar, bool, null);
    }

    public final Object G(m mVar, int i2, long j, Object obj) {
        Object objK = mVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = mVar.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (objK == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.n;
                }
                if (mVar.j(i2, objK, obj)) {
                    o();
                    return g.m;
                }
            }
        } else if (objK == g.d && mVar.j(i2, objK, g.i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            mVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object objK2 = mVar.k(i2);
            if (objK2 == null || objK2 == g.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (mVar.j(i2, objK2, g.h)) {
                        o();
                        return g.o;
                    }
                } else {
                    if (obj == null) {
                        return g.n;
                    }
                    if (mVar.j(i2, objK2, obj)) {
                        o();
                        return g.m;
                    }
                }
            } else if (objK2 != g.d) {
                com.gamericefishpro.space.d6.a aVar = g.j;
                if (objK2 == aVar) {
                    return g.o;
                }
                if (objK2 == g.h) {
                    return g.o;
                }
                if (objK2 == g.l) {
                    o();
                    return g.o;
                }
                if (objK2 != g.g && mVar.j(i2, objK2, g.f)) {
                    boolean z2 = objK2 instanceof u;
                    if (z2) {
                        objK2 = ((u) objK2).a;
                    }
                    if (F(objK2)) {
                        mVar.n(i2, g.i);
                        o();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        mVar.m(i2, null);
                        return obj3;
                    }
                    mVar.n(i2, aVar);
                    mVar.h();
                    if (z2) {
                        o();
                    }
                    return g.o;
                }
            } else if (mVar.j(i2, objK2, g.i)) {
                o();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                mVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int H(m mVar, int i2, Object obj, long j, Object obj2, boolean z2) {
        while (true) {
            Object objK = mVar.k(i2);
            if (objK == null) {
                if (!i(j) || z2) {
                    if (z2) {
                        if (mVar.j(i2, null, g.j)) {
                            mVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.j(i2, null, g.d)) {
                    break;
                }
            } else {
                if (objK != g.e) {
                    com.gamericefishpro.space.d6.a aVar = g.k;
                    if (objK == aVar) {
                        mVar.m(i2, null);
                        return 5;
                    }
                    if (objK == g.h) {
                        mVar.m(i2, null);
                        return 5;
                    }
                    if (objK == g.l) {
                        mVar.m(i2, null);
                        m();
                        return 4;
                    }
                    mVar.m(i2, null);
                    if (objK instanceof u) {
                        objK = ((u) objK).a;
                    }
                    if (E(objK, obj)) {
                        mVar.n(i2, g.i);
                        return 0;
                    }
                    if (mVar.f.getAndSet((i2 * 2) + 1, aVar) != aVar) {
                        mVar.l(i2, true);
                    }
                    return 5;
                }
                if (mVar.j(i2, objK, g.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void I(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        e eVar = this;
        if (eVar.y()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = v;
            if (atomicLongFieldUpdater.get(eVar) > j) {
                break;
            } else {
                eVar = this;
            }
        }
        int i2 = g.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = w;
            if (i3 < i2) {
                long j2 = atomicLongFieldUpdater.get(eVar);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(eVar)) && j2 == atomicLongFieldUpdater.get(eVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        eVar = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(eVar);
                    long j5 = atomicLongFieldUpdater2.get(eVar);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z2 = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(eVar)) {
                        break;
                    }
                    if (z2) {
                        eVar = this;
                    } else {
                        eVar = this;
                        atomicLongFieldUpdater2.compareAndSet(eVar, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        eVar = this;
                    }
                }
            }
        }
    }

    @Override // com.gamericefishpro.space.ri.s
    public final Object a(com.gamericefishpro.space.th.a frame) throws Throwable {
        m mVar;
        Throwable th;
        m mVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
        m mVar3 = (m) atomicReferenceFieldUpdater.get(this);
        while (!w()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = g.b;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (mVar3.c != j2) {
                m mVarP = p(j2, mVar3);
                if (mVarP == null) {
                    continue;
                } else {
                    mVar = mVarP;
                }
            } else {
                mVar = mVar3;
            }
            Object objG = G(mVar, i2, andIncrement, null);
            com.gamericefishpro.space.d6.a aVar = g.m;
            if (objG == aVar) {
                throw new IllegalStateException("unexpected");
            }
            com.gamericefishpro.space.d6.a aVar2 = g.o;
            if (objG == aVar2) {
                if (andIncrement < t()) {
                    mVar.a();
                }
                mVar3 = mVar;
            } else {
                if (objG != g.n) {
                    mVar.a();
                    return objG;
                }
                com.gamericefishpro.space.pi.h hVarO = a0.o(com.gamericefishpro.space.uh.f.b(frame));
                e eVar = this;
                try {
                    Object objG2 = eVar.G(mVar, i2, andIncrement, hVarO);
                    if (objG2 == aVar) {
                        hVarO.a(mVar, i2);
                    } else if (objG2 == aVar2) {
                        if (andIncrement < t()) {
                            mVar.a();
                        }
                        m mVar4 = (m) atomicReferenceFieldUpdater.get(this);
                        while (true) {
                            if (w()) {
                                com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                                hVarO.resumeWith(com.gamericefishpro.space.wa.b.q(r()));
                                break;
                            }
                            com.gamericefishpro.space.pi.h hVar = hVarO;
                            try {
                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                long j3 = g.b;
                                long j4 = andIncrement2 / j3;
                                int i3 = (int) (andIncrement2 % j3);
                                if (mVar4.c != j4) {
                                    try {
                                        m mVarP2 = p(j4, mVar4);
                                        if (mVarP2 == null) {
                                            hVarO = hVar;
                                        } else {
                                            mVar2 = mVarP2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        hVarO = hVar;
                                        hVarO.A();
                                        throw th;
                                    }
                                } else {
                                    mVar2 = mVar4;
                                }
                                Object objG3 = eVar.G(mVar2, i3, andIncrement2, hVar);
                                m mVar5 = mVar2;
                                hVarO = hVar;
                                if (objG3 == g.m) {
                                    hVarO.a(mVar5, i3);
                                    break;
                                }
                                if (objG3 != g.o) {
                                    if (objG3 == g.n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    mVar5.a();
                                    hVarO.h(objG3, null);
                                    break;
                                }
                                if (andIncrement2 < t()) {
                                    mVar5.a();
                                }
                                eVar = this;
                                mVar4 = mVar5;
                            } catch (Throwable th3) {
                                th = th3;
                                hVarO = hVar;
                                th = th;
                                hVarO.A();
                                throw th;
                            }
                        }
                    } else {
                        mVar.a();
                        hVarO.h(objG2, null);
                    }
                    Object objR = hVarO.r();
                    if (objR == com.gamericefishpro.space.uh.a.d) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    return objR;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thR = r();
        int i4 = com.gamericefishpro.space.ui.r.a;
        throw thR;
    }

    @Override // com.gamericefishpro.space.ri.s
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        j(cancellationException, true);
    }

    /* JADX WARN: Code duplicated, block: B:93:0x016e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0178  */
    /* JADX WARN: Code duplicated, block: B:98:0x017c A[RETURN] */
    @Override // com.gamericefishpro.space.ri.t
    public Object d(com.gamericefishpro.space.th.a frame, Object obj) throws Throwable {
        Object objR;
        com.gamericefishpro.space.uh.a aVar;
        Object obj2;
        e eVar;
        m mVar;
        boolean z2;
        e eVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
        m mVar2 = (m) atomicReferenceFieldUpdater.get(eVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(eVar2);
            long j = andIncrement & 1152921504606846975L;
            boolean zV = eVar2.v(false, andIncrement);
            int i2 = g.b;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            if (mVar2.c != j3) {
                m mVarB = b(eVar2, j3, mVar2);
                if (mVarB != null) {
                    mVar2 = mVarB;
                } else if (zV) {
                    Object objA = A(frame, obj);
                    if (objA != com.gamericefishpro.space.uh.a.d) {
                        break;
                    }
                    return objA;
                }
            }
            int iH = h(eVar2, mVar2, i3, obj, j, null, zV);
            if (iH == 0) {
                mVar2.a();
            } else {
                if (iH == 1) {
                    break;
                }
                if (iH != 2) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = i;
                    if (iH == 3) {
                        com.gamericefishpro.space.pi.h hVarO = a0.o(com.gamericefishpro.space.uh.f.b(frame));
                        Object obj3 = obj;
                        try {
                            int iH2 = h(eVar2, mVar2, i3, obj3, j, hVarO, false);
                            try {
                                if (iH2 == 0) {
                                    mVar2.a();
                                    com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                                } else if (iH2 != 1) {
                                    if (iH2 != 2) {
                                        if (iH2 != 4) {
                                            String str = "unexpected";
                                            if (iH2 != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            mVar2.a();
                                            m mVar3 = (m) atomicReferenceFieldUpdater.get(eVar2);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(eVar2);
                                                long j4 = andIncrement2 & 1152921504606846975L;
                                                boolean zV2 = eVar2.v(false, andIncrement2);
                                                int i4 = g.b;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater;
                                                long j5 = i4;
                                                str = str;
                                                long j6 = j4 / j5;
                                                int i5 = (int) (j4 % j5);
                                                if (mVar3.c != j6) {
                                                    m mVarB2 = b(eVar2, j6, mVar3);
                                                    if (mVarB2 != null) {
                                                        z2 = zV2;
                                                        mVar = mVarB2;
                                                    } else if (zV2) {
                                                        f(eVar2, obj3, hVarO);
                                                    }
                                                } else {
                                                    mVar = mVar3;
                                                    z2 = zV2;
                                                }
                                                int iH3 = h(eVar2, mVar, i5, obj3, j4, hVarO, z2);
                                                Object obj4 = obj3;
                                                eVar = eVar2;
                                                m mVar4 = mVar;
                                                obj2 = obj4;
                                                if (iH3 == 0) {
                                                    mVar4.a();
                                                    com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
                                                } else if (iH3 == 1) {
                                                    com.gamericefishpro.space.oh.n nVar3 = com.gamericefishpro.space.oh.p.d;
                                                } else if (iH3 != 2) {
                                                    if (iH3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iH3 != 4) {
                                                        if (iH3 == 5) {
                                                            mVar4.a();
                                                        }
                                                        mVar3 = mVar4;
                                                        eVar2 = eVar;
                                                        obj3 = obj2;
                                                    } else if (j4 < atomicLongFieldUpdater2.get(eVar)) {
                                                        mVar4.a();
                                                    }
                                                } else if (z2) {
                                                    mVar4.h();
                                                } else {
                                                    hVarO.a(mVar4, i5 + i4);
                                                }
                                            }
                                            hVarO.A();
                                            throw th;
                                        }
                                        obj2 = obj3;
                                        eVar = eVar2;
                                        if (j < atomicLongFieldUpdater2.get(eVar)) {
                                            mVar2.a();
                                        }
                                        f(eVar, obj2, hVarO);
                                    } else {
                                        hVarO.a(mVar2, i3 + i2);
                                    }
                                    objR = hVarO.r();
                                    aVar = com.gamericefishpro.space.uh.a.d;
                                    if (objR == aVar) {
                                        Intrinsics.checkNotNullParameter(frame, "frame");
                                    }
                                    if (objR != aVar) {
                                        objR = Unit.a;
                                    }
                                    if (objR == aVar) {
                                        return objR;
                                    }
                                } else {
                                    com.gamericefishpro.space.oh.n nVar4 = com.gamericefishpro.space.oh.p.d;
                                }
                                hVarO.resumeWith(Unit.a);
                                objR = hVarO.r();
                                aVar = com.gamericefishpro.space.uh.a.d;
                                if (objR == aVar) {
                                    Intrinsics.checkNotNullParameter(frame, "frame");
                                }
                                if (objR != aVar) {
                                    objR = Unit.a;
                                }
                                if (objR == aVar) {
                                    return objR;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        if (iH == 4) {
                            if (j < atomicLongFieldUpdater2.get(eVar2)) {
                                mVar2.a();
                            }
                            Object objA2 = A(frame, obj);
                            if (objA2 != com.gamericefishpro.space.uh.a.d) {
                                break;
                            }
                            return objA2;
                        }
                        if (iH == 5) {
                            mVar2.a();
                        }
                    }
                } else if (zV) {
                    mVar2.h();
                    Object objA3 = A(frame, obj);
                    if (objA3 == com.gamericefishpro.space.uh.a.d) {
                        return objA3;
                    }
                }
            }
            return Unit.a;
        }
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.ri.s
    public final Object e(com.gamericefishpro.space.ti.o oVar) {
        return B(this, oVar);
    }

    @Override // com.gamericefishpro.space.ri.s
    public final Object g() {
        m mVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = e.get(this);
        if (v(true, j2)) {
            return new j(q());
        }
        long j3 = j2 & 1152921504606846975L;
        k kVar = l.b;
        if (j >= j3) {
            return kVar;
        }
        Object obj = g.k;
        m mVar2 = (m) z.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = g.b;
            long j5 = andIncrement / j4;
            int i2 = (int) (andIncrement % j4);
            if (mVar2.c != j5) {
                m mVarP = p(j5, mVar2);
                if (mVarP == null) {
                    continue;
                } else {
                    mVar = mVarP;
                }
            } else {
                mVar = mVar2;
            }
            Object objG = G(mVar, i2, andIncrement, obj);
            m mVar3 = mVar;
            if (objG == g.m) {
                e2 e2Var = obj instanceof e2 ? (e2) obj : null;
                if (e2Var != null) {
                    e2Var.a(mVar3, i2);
                }
                I(andIncrement);
                mVar3.h();
                return kVar;
            }
            if (objG != g.o) {
                if (objG == g.n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar3.a();
                return objG;
            }
            if (andIncrement < t()) {
                mVar3.a();
            }
            mVar2 = mVar3;
        }
        return new j(q());
    }

    public final boolean i(long j) {
        return j < v.get(this) || j < i.get(this) + ((long) this.d);
    }

    @Override // com.gamericefishpro.space.ri.s
    public final b iterator() {
        return new b(this);
    }

    public final boolean j(Throwable th, boolean z2) {
        e eVar;
        boolean z3;
        long j;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (!z2) {
            eVar = this;
            break;
        }
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if (((int) (j5 >> 60)) != 0) {
                eVar = this;
                break;
            }
            m mVar = g.a;
            eVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(eVar, j5, (j5 & 1152921504606846975L) + (((long) 1) << 60)));
        com.gamericefishpro.space.d6.a aVar = g.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, th)) {
                z3 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != aVar) {
                z3 = false;
                break;
            }
        }
        if (z2) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j4, (((long) 3) << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j >> 60);
                if (i2 == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    j3 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j, (j3 << 60) + j2));
        }
        m();
        if (z3) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C;
                obj = atomicReferenceFieldUpdater2.get(this);
                com.gamericefishpro.space.d6.a aVar2 = obj == null ? g.q : g.r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, aVar2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                e0.c(1, obj);
                ((Function1) obj).invoke(q());
                return z3;
            }
        }
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x007c A[SYNTHETIC] */
    @Override // com.gamericefishpro.space.ri.t
    public Object k(Object obj) {
        int iH;
        e2 e2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        long j = atomicLongFieldUpdater.get(this);
        boolean z2 = false;
        long j2 = 1152921504606846975L;
        boolean z3 = v(false, j) ? false : !i(j & 1152921504606846975L);
        k kVar = l.b;
        if (z3) {
            return kVar;
        }
        com.gamericefishpro.space.s4.o oVar = g.j;
        m mVar = (m) y.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zV = v(z2, andIncrement);
            int i2 = g.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (mVar.c == j5) {
                iH = h(this, mVar, i3, obj, j3, oVar, zV);
                if (iH != 0) {
                    mVar.a();
                    return Unit.a;
                }
                if (iH != 1) {
                    return Unit.a;
                }
                if (iH != 2) {
                    if (zV) {
                        mVar.h();
                        return new j(s());
                    }
                    if (oVar instanceof e2) {
                        e2Var = (e2) oVar;
                    } else {
                        e2Var = null;
                    }
                    if (e2Var != null) {
                        e2Var.a(mVar, i3 + i2);
                    }
                    mVar.h();
                    return kVar;
                }
                if (iH != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iH != 4) {
                    if (j3 < i.get(this)) {
                        mVar.a();
                    }
                    return new j(s());
                }
                if (iH == 5) {
                    mVar.a();
                }
                z2 = false;
            } else {
                m mVarB = b(this, j5, mVar);
                if (mVarB != null) {
                    mVar = mVarB;
                    iH = h(this, mVar, i3, obj, j3, oVar, zV);
                    if (iH != 0) {
                        mVar.a();
                        return Unit.a;
                    }
                    if (iH != 1) {
                        return Unit.a;
                    }
                    if (iH != 2) {
                        if (zV) {
                            mVar.h();
                            return new j(s());
                        }
                        if (oVar instanceof e2) {
                            e2Var = (e2) oVar;
                        } else {
                            e2Var = null;
                        }
                        if (e2Var != null) {
                            e2Var.a(mVar, i3 + i2);
                        }
                        mVar.h();
                        return kVar;
                    }
                    if (iH != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iH != 4) {
                        if (j3 < i.get(this)) {
                            mVar.a();
                        }
                        return new j(s());
                    }
                    if (iH == 5) {
                        mVar.a();
                    }
                    z2 = false;
                } else {
                    if (zV) {
                        return new j(s());
                    }
                    z2 = false;
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    public final m l(long j) {
        Object objF;
        long j2;
        Object obj = A.get(this);
        m mVar = (m) y.get(this);
        if (mVar.c > ((m) obj).c) {
            obj = mVar;
        }
        m mVar2 = (m) z.get(this);
        if (mVar2.c > ((m) obj).c) {
            obj = mVar2;
        }
        com.gamericefishpro.space.ui.b bVar = (com.gamericefishpro.space.ui.b) obj;
        loop0: while (true) {
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = com.gamericefishpro.space.ui.b.a;
            Object obj2 = atomicReferenceFieldUpdater.get(bVar);
            com.gamericefishpro.space.d6.a aVar = com.gamericefishpro.space.ui.a.a;
            objF = null;
            if (obj2 == aVar) {
                break;
            }
            com.gamericefishpro.space.ui.b bVar2 = (com.gamericefishpro.space.ui.b) obj2;
            if (bVar2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, aVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(bVar) == null);
            } else {
                bVar = bVar2;
            }
        }
        m mVar3 = (m) bVar;
        if (x()) {
            m mVar4 = mVar3;
            loop2: while (true) {
                int i2 = g.b - 1;
                while (true) {
                    if (-1 < i2) {
                        j2 = (mVar4.c * ((long) g.b)) + ((long) i2);
                        if (j2 >= i.get(this)) {
                            while (true) {
                                Object objK = mVar4.k(i2);
                                if (objK != null && objK != g.e) {
                                    if (objK != g.d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (mVar4.j(i2, objK, g.l)) {
                                    mVar4.h();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        mVar4 = (m) ((com.gamericefishpro.space.ui.b) com.gamericefishpro.space.ui.b.b.get(mVar4));
                        if (mVar4 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                n(j2);
            }
        }
        loop5: for (m mVar5 = mVar3; mVar5 != null; mVar5 = (m) ((com.gamericefishpro.space.ui.b) com.gamericefishpro.space.ui.b.b.get(mVar5))) {
            for (int i3 = g.b - 1; -1 < i3; i3--) {
                if ((mVar5.c * ((long) g.b)) + ((long) i3) < j) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = mVar5.k(i3);
                    if (objK2 != null && objK2 != g.e) {
                        if (!(objK2 instanceof u)) {
                            if (!(objK2 instanceof e2)) {
                                break;
                            }
                            if (mVar5.j(i3, objK2, g.l)) {
                                objF = com.gamericefishpro.space.ui.a.f(objF, objK2);
                                mVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (mVar5.j(i3, objK2, g.l)) {
                                objF = com.gamericefishpro.space.ui.a.f(objF, ((u) objK2).a);
                                mVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (mVar5.j(i3, objK2, g.l)) {
                            mVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objF != null) {
            if (!(objF instanceof ArrayList)) {
                D((e2) objF, true);
                return mVar3;
            }
            ArrayList arrayList = (ArrayList) objF;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                D((e2) arrayList.get(size), true);
            }
        }
        return mVar3;
    }

    public final void m() {
        v(false, e.get(this));
    }

    public final void n(long j) {
        m mVar = (m) z.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.d) + j2, v.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = g.b;
                long j4 = j2 / j3;
                int i2 = (int) (j2 % j3);
                if (mVar.c != j4) {
                    m mVarP = p(j4, mVar);
                    if (mVarP != null) {
                        mVar = mVarP;
                    }
                }
                m mVar2 = mVar;
                if (G(mVar2, i2, j2, null) != g.o || j2 < t()) {
                    mVar2.a();
                }
                mVar = mVar2;
            }
        }
    }

    public final void o() {
        Object objB;
        if (y()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        m mVar = (m) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = v.getAndIncrement(this);
            long j = andIncrement / ((long) g.b);
            if (t() <= andIncrement) {
                if (mVar.c < j && mVar.b() != null) {
                    z(j, mVar);
                }
                u(this);
                return;
            }
            if (mVar.c != j) {
                f fVar = f.B;
                while (true) {
                    objB = com.gamericefishpro.space.ui.a.b(mVar, j, fVar);
                    if (!com.gamericefishpro.space.ui.a.e(objB)) {
                        com.gamericefishpro.space.ui.q qVarC = com.gamericefishpro.space.ui.a.c(objB);
                        while (true) {
                            com.gamericefishpro.space.ui.q qVar = (com.gamericefishpro.space.ui.q) atomicReferenceFieldUpdater.get(this);
                            if (qVar.c >= qVarC.c) {
                                break;
                            }
                            if (!qVarC.i()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, qVarC)) {
                                    if (!qVar.e()) {
                                        break;
                                    }
                                    qVar.d();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == qVar);
                            if (qVarC.e()) {
                                qVarC.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                m mVar2 = null;
                if (com.gamericefishpro.space.ui.a.e(objB)) {
                    m();
                    z(j, mVar);
                    u(this);
                } else {
                    m mVar3 = (m) com.gamericefishpro.space.ui.a.c(objB);
                    long j2 = mVar3.c;
                    if (j2 > j) {
                        long j3 = j2 * ((long) g.b);
                        if (v.compareAndSet(this, 1 + andIncrement, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = w;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & 4611686018427387904L) != 0) {
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
            int i2 = (int) (andIncrement % ((long) g.b));
            Object objK = mVar.k(i2);
            boolean z2 = objK instanceof e2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = i;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !mVar.j(i2, objK, g.g)) {
                while (true) {
                    Object objK2 = mVar.k(i2);
                    if (objK2 instanceof e2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (mVar.j(i2, objK2, new u((e2) objK2))) {
                                u(this);
                                return;
                            }
                        } else if (mVar.j(i2, objK2, g.g)) {
                            if (!F(objK2)) {
                                mVar.n(i2, g.j);
                                mVar.h();
                                break;
                            } else {
                                mVar.n(i2, g.d);
                                u(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == g.j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (mVar.j(i2, objK2, g.e)) {
                                u(this);
                                return;
                            }
                        } else if (objK2 == g.d || objK2 == g.h || objK2 == g.i || objK2 == g.k || objK2 == g.l) {
                            u(this);
                            return;
                        } else if (objK2 != g.f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objK2).toString());
                        }
                    }
                }
                u(this);
            } else if (F(objK)) {
                mVar.n(i2, g.d);
                u(this);
                return;
            } else {
                mVar.n(i2, g.j);
                mVar.h();
                u(this);
            }
        }
    }

    public final m p(long j, m mVar) {
        Object objB;
        long j2;
        m mVar2 = g.a;
        f fVar = f.B;
        loop0: while (true) {
            objB = com.gamericefishpro.space.ui.a.b(mVar, j, fVar);
            if (!com.gamericefishpro.space.ui.a.e(objB)) {
                com.gamericefishpro.space.ui.q qVarC = com.gamericefishpro.space.ui.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
                    com.gamericefishpro.space.ui.q qVar = (com.gamericefishpro.space.ui.q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.c >= qVarC.c) {
                        break loop0;
                    }
                    if (!qVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, qVarC)) {
                            if (!qVar.e()) {
                                break loop0;
                            }
                            qVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == qVar);
                    if (qVarC.e()) {
                        qVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        if (com.gamericefishpro.space.ui.a.e(objB)) {
            m();
            if (mVar.c * ((long) g.b) < t()) {
                mVar.a();
                return null;
            }
        } else {
            m mVar3 = (m) com.gamericefishpro.space.ui.a.c(objB);
            long j3 = mVar3.c;
            if (!y() && j <= v.get(this) / ((long) g.b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A;
                    com.gamericefishpro.space.ui.q qVar2 = (com.gamericefishpro.space.ui.q) atomicReferenceFieldUpdater2.get(this);
                    if (qVar2.c >= j3 || !mVar3.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, qVar2, mVar3)) {
                            if (!qVar2.e()) {
                                break loop3;
                            }
                            qVar2.d();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == qVar2);
                    if (mVar3.e()) {
                        mVar3.d();
                    }
                }
            }
            if (j3 <= j) {
                return mVar3;
            }
            long j4 = j3 * ((long) g.b);
            do {
                j2 = i.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!i.compareAndSet(this, j2, j4));
            if (j3 * ((long) g.b) < t()) {
                mVar3.a();
            }
        }
        return null;
    }

    public final Throwable q() {
        return (Throwable) B.get(this);
    }

    public final Throwable r() {
        Throwable thQ = q();
        return thQ == null ? new n("Channel was closed") : thQ;
    }

    public final Throwable s() {
        Throwable thQ = q();
        return thQ == null ? new com.gamericefishpro.space.r9.b("Channel was closed") : thQ;
    }

    public final long t() {
        return e.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (e.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.d + ',');
        sb.append("data=[");
        int i3 = 0;
        boolean z2 = true;
        List listF = x.f(z.get(this), y.get(this), A.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((m) obj) != g.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((m) next).c;
            do {
                Object next2 = it.next();
                long j2 = ((m) next2).c;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        m mVar = (m) next;
        long j3 = i.get(this);
        long jT = t();
        loop2: while (true) {
            int i4 = g.b;
            int i5 = i3;
            while (i5 < i4) {
                long j4 = (mVar.c * ((long) g.b)) + ((long) i5);
                if (j4 >= jT && j4 >= j3) {
                    break loop2;
                }
                Object objK = mVar.k(i5);
                boolean z3 = z2;
                Object obj2 = mVar.f.get(i5 * 2);
                if (objK instanceof com.gamericefishpro.space.pi.f) {
                    string = (j4 >= j3 || j4 < jT) ? (j4 >= jT || j4 < j3) ? "cont" : "send" : "receive";
                } else if (objK instanceof r) {
                    string = "receiveCatching";
                } else if (objK instanceof u) {
                    string = "EB(" + objK + ')';
                } else if (Intrinsics.a(objK, g.f) || Intrinsics.a(objK, g.g)) {
                    string = "resuming_sender";
                } else {
                    if (objK != null && !objK.equals(g.e) && !objK.equals(g.i) && !objK.equals(g.h) && !objK.equals(g.k) && !objK.equals(g.j) && !objK.equals(g.l)) {
                        string = objK.toString();
                    }
                    i5++;
                    z2 = z3;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i5++;
                z2 = z3;
            }
            boolean z4 = z2;
            mVar = (m) mVar.b();
            if (mVar == null) {
                break;
            }
            z2 = z4;
            i3 = 0;
        }
        if (kotlin.text.g.q(sb) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean v(boolean z2, long j) {
        int i2 = (int) (j >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            if (i2 == 2) {
                l(1152921504606846975L & j);
                if (z2) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
                        m mVarP = (m) atomicReferenceFieldUpdater.get(this);
                        long j2 = atomicLongFieldUpdater.get(this);
                        if (t() <= j2) {
                            break;
                        }
                        long j3 = g.b;
                        long j4 = j2 / j3;
                        if (mVarP.c != j4 && (mVarP = p(j4, mVarP)) == null) {
                            if (((m) atomicReferenceFieldUpdater.get(this)).c < j4) {
                                break;
                            }
                        } else {
                            mVarP.a();
                            int i3 = (int) (j2 % j3);
                            while (true) {
                                Object objK = mVarP.k(i3);
                                if (objK != null && objK != g.e) {
                                    if (objK != g.d && (objK == g.j || objK == g.l || objK == g.i || objK == g.h || (objK != g.g && (objK == g.f || j2 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (mVarP.j(i3, objK, g.h)) {
                                    o();
                                    break;
                                }
                            }
                            i.compareAndSet(this, j2, j2 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(com.gamericefishpro.space.m5.a.g(i2, "unexpected close status: ").toString());
                }
                m mVarL = l(1152921504606846975L & j);
                Object objF = null;
                loop0: do {
                    for (int i4 = g.b - 1; -1 < i4; i4--) {
                        long j5 = (mVarL.c * ((long) g.b)) + ((long) i4);
                        while (true) {
                            Object objK2 = mVarL.k(i4);
                            if (objK2 == g.i) {
                                break loop0;
                            }
                            if (objK2 != g.d) {
                                if (objK2 != g.e && objK2 != null) {
                                    if (!(objK2 instanceof e2) && !(objK2 instanceof u)) {
                                        com.gamericefishpro.space.d6.a aVar = g.g;
                                        if (objK2 == aVar || objK2 == g.f) {
                                            break loop0;
                                        }
                                        if (objK2 != aVar) {
                                            break;
                                        }
                                    } else {
                                        if (j5 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        e2 e2Var = objK2 instanceof u ? ((u) objK2).a : (e2) objK2;
                                        if (mVarL.j(i4, objK2, g.l)) {
                                            objF = com.gamericefishpro.space.ui.a.f(objF, e2Var);
                                            mVarL.m(i4, null);
                                            mVarL.h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (mVarL.j(i4, objK2, g.l)) {
                                        mVarL.h();
                                        break;
                                    }
                                }
                            } else {
                                if (j5 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (mVarL.j(i4, objK2, g.l)) {
                                    mVarL.m(i4, null);
                                    mVarL.h();
                                    break;
                                }
                            }
                        }
                    }
                    mVarL = (m) ((com.gamericefishpro.space.ui.b) com.gamericefishpro.space.ui.b.b.get(mVarL));
                } while (mVarL != null);
                if (objF != null) {
                    if (objF instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objF;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            D((e2) arrayList.get(size), false);
                        }
                    } else {
                        D((e2) objF, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean w() {
        return v(true, e.get(this));
    }

    public boolean x() {
        return false;
    }

    public final boolean y() {
        long j = v.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final void z(long j, m mVar) {
        m mVar2;
        m mVar3;
        while (mVar.c < j && (mVar3 = (m) mVar.b()) != null) {
            mVar = mVar3;
        }
        while (true) {
            if (!mVar.c() || (mVar2 = (m) mVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
                    com.gamericefishpro.space.ui.q qVar = (com.gamericefishpro.space.ui.q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.c >= mVar.c) {
                        return;
                    }
                    if (!mVar.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, mVar)) {
                            if (qVar.e()) {
                                qVar.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == qVar);
                    if (mVar.e()) {
                        mVar.d();
                    }
                }
            } else {
                mVar = mVar2;
            }
        }
    }
}
