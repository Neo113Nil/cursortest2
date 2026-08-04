package com.gamericefishpro.space.xi;

import com.gamericefishpro.space.pi.e2;
import com.gamericefishpro.space.ui.q;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class g {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater v = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater y = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int d;
    private volatile /* synthetic */ long deqIdx$volatile;
    public final com.gamericefishpro.space.pi.g e;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g(int i2) {
        this.d = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i2, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i2, "The number of acquired permits should be in 0..").toString());
        }
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = i2;
        this.e = new com.gamericefishpro.space.pi.g(2, this);
    }

    public final boolean a(e2 e2Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = y.getAndIncrement(this);
        e eVar = e.B;
        long j = andIncrement / ((long) i.f);
        loop0: while (true) {
            objB = com.gamericefishpro.space.ui.a.b(jVar, j, eVar);
            if (!com.gamericefishpro.space.ui.a.e(objB)) {
                q qVarC = com.gamericefishpro.space.ui.a.c(objB);
                while (true) {
                    q qVar = (q) atomicReferenceFieldUpdater.get(this);
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
        j jVar2 = (j) com.gamericefishpro.space.ui.a.c(objB);
        AtomicReferenceArray atomicReferenceArray = jVar2.e;
        int i2 = (int) (andIncrement % ((long) i.f));
        while (!atomicReferenceArray.compareAndSet(i2, null, e2Var)) {
            if (atomicReferenceArray.get(i2) != null) {
                com.gamericefishpro.space.d6.a aVar = i.b;
                com.gamericefishpro.space.d6.a aVar2 = i.c;
                while (!atomicReferenceArray.compareAndSet(i2, aVar, aVar2)) {
                    if (atomicReferenceArray.get(i2) != aVar) {
                        return false;
                    }
                }
                ((com.gamericefishpro.space.pi.f) e2Var).h(Unit.a, this.e);
                return true;
            }
        }
        e2Var.a(jVar2, i2);
        return true;
    }

    public final void d() {
        int i2;
        Object objB;
        boolean z2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i3 = this.d;
            if (andIncrement >= i3) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i3));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i3).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = v.getAndIncrement(this);
            long j = andIncrement2 / ((long) i.f);
            f fVar = f.B;
            while (true) {
                objB = com.gamericefishpro.space.ui.a.b(jVar, j, fVar);
                if (!com.gamericefishpro.space.ui.a.e(objB)) {
                    q qVarC = com.gamericefishpro.space.ui.a.c(objB);
                    while (true) {
                        q qVar = (q) atomicReferenceFieldUpdater.get(this);
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
            j jVar2 = (j) com.gamericefishpro.space.ui.a.c(objB);
            AtomicReferenceArray atomicReferenceArray = jVar2.e;
            jVar2.a();
            z2 = false;
            if (jVar2.c <= j) {
                int i4 = (int) (andIncrement2 % ((long) i.f));
                Object andSet = atomicReferenceArray.getAndSet(i4, i.b);
                if (andSet == null) {
                    int i5 = i.a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            com.gamericefishpro.space.d6.a aVar = i.b;
                            com.gamericefishpro.space.d6.a aVar2 = i.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i4, aVar, aVar2)) {
                                    z2 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i4) == aVar);
                            z2 = !z2;
                            break;
                        }
                        if (atomicReferenceArray.get(i4) == i.c) {
                            z2 = true;
                            break;
                        }
                        i6++;
                    }
                } else if (andSet != i.e) {
                    if (!(andSet instanceof com.gamericefishpro.space.pi.f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    com.gamericefishpro.space.pi.f fVar2 = (com.gamericefishpro.space.pi.f) andSet;
                    com.gamericefishpro.space.d6.a aVarF = fVar2.f(Unit.a, this.e);
                    if (aVarF != null) {
                        fVar2.p(aVarF);
                        z2 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z2);
    }
}
