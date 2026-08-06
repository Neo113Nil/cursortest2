package I1;

import A1.InterfaceC0004e;
import C1.p;
import F1.u;
import h1.C0239i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t1.l;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f733b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f734c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f735d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f736e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f737f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final p f738a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i2) {
        if (i2 < 0 || i2 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1 - i2;
        this.f738a = new p(2, this);
    }

    public final void a(c cVar) {
        Object b2;
        f fVar;
        long j2;
        while (true) {
            int andDecrement = f737f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = C0239i.f3393a;
                l lVar = this.f738a;
                if (andDecrement > 0) {
                    cVar.e(obj, lVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f735d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f736e.getAndIncrement(this);
                f fVar2 = f.f731a;
                long j3 = andIncrement / i.f744f;
                while (true) {
                    b2 = F1.a.b(jVar, j3, fVar2);
                    if (!F1.a.e(b2)) {
                        u c2 = F1.a.c(b2);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j2 = j3;
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
                                    fVar2 = fVar;
                                    j3 = j2;
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    fVar2 = fVar;
                    j3 = j2;
                }
                j jVar2 = (j) F1.a.c(b2);
                int i2 = (int) (andIncrement % i.f744f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f745e;
                while (!atomicReferenceArray.compareAndSet(i2, null, cVar)) {
                    if (atomicReferenceArray.get(i2) != null) {
                        C.j jVar3 = i.f740b;
                        C.j jVar4 = i.f741c;
                        while (!atomicReferenceArray.compareAndSet(i2, jVar3, jVar4)) {
                            if (atomicReferenceArray.get(i2) != jVar3) {
                                break;
                            }
                        }
                        cVar.e(obj, lVar);
                        return;
                    }
                }
                cVar.a(jVar2, i2);
                return;
            }
        }
    }

    public final void b() {
        boolean z2;
        int i2;
        Object b2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f737f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z2 = true;
            if (andIncrement >= 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f733b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f734c.getAndIncrement(this);
            long j2 = andIncrement2 / i.f744f;
            g gVar = g.f732a;
            while (true) {
                b2 = F1.a.b(jVar, j2, gVar);
                if (!F1.a.e(b2)) {
                    u c2 = F1.a.c(b2);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
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
            j jVar2 = (j) F1.a.c(b2);
            jVar2.a();
            boolean z3 = false;
            if (jVar2.f631c <= j2) {
                int i3 = (int) (andIncrement2 % i.f744f);
                C.j jVar3 = i.f740b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f745e;
                Object andSet = atomicReferenceArray.getAndSet(i3, jVar3);
                if (andSet == null) {
                    int i4 = i.f739a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            C.j jVar4 = i.f740b;
                            C.j jVar5 = i.f742d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i3, jVar4, jVar5)) {
                                    z3 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i3) != jVar4) {
                                    break;
                                }
                            }
                            z2 = true ^ z3;
                        } else if (atomicReferenceArray.get(i3) == i.f741c) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                } else if (andSet != i.f743e) {
                    if (!(andSet instanceof InterfaceC0004e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0004e interfaceC0004e = (InterfaceC0004e) andSet;
                    C.j d2 = interfaceC0004e.d(C0239i.f3393a, this.f738a);
                    if (d2 != null) {
                        interfaceC0004e.n(d2);
                    }
                }
            }
            z2 = false;
        } while (!z2);
    }
}
