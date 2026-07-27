package S0;

import D.M;
import D0.l;
import K0.InterfaceC0029e;
import P0.AbstractC0068a;
import P0.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f992b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f993c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f994d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f995e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f996f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final M f997a;
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
        this.f997a = new M(2, this);
    }

    public final void a(c cVar) {
        Object c2;
        f fVar;
        long j2;
        while (true) {
            int andDecrement = f996f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = t0.g.f2989a;
                l lVar = this.f997a;
                if (andDecrement > 0) {
                    cVar.e(obj, lVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f994d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f995e.getAndIncrement(this);
                f fVar2 = f.f990n;
                long j3 = andIncrement / i.f1003f;
                while (true) {
                    c2 = AbstractC0068a.c(jVar, j3, fVar2);
                    if (!AbstractC0068a.f(c2)) {
                        v d2 = AbstractC0068a.d(c2);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j2 = j3;
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
                                    fVar2 = fVar;
                                    j3 = j2;
                                }
                            }
                            if (vVar.e()) {
                                vVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    fVar2 = fVar;
                    j3 = j2;
                }
                j jVar2 = (j) AbstractC0068a.d(c2);
                int i2 = (int) (andIncrement % i.f1003f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f1004j;
                while (!atomicReferenceArray.compareAndSet(i2, null, cVar)) {
                    if (atomicReferenceArray.get(i2) != null) {
                        A.j jVar3 = i.f999b;
                        A.j jVar4 = i.f1000c;
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
        Object c2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f996f;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f992b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f993c.getAndIncrement(this);
            long j2 = andIncrement2 / i.f1003f;
            g gVar = g.f991n;
            while (true) {
                c2 = AbstractC0068a.c(jVar, j2, gVar);
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
            j jVar2 = (j) AbstractC0068a.d(c2);
            jVar2.a();
            boolean z3 = false;
            if (jVar2.f905h <= j2) {
                int i3 = (int) (andIncrement2 % i.f1003f);
                A.j jVar3 = i.f999b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f1004j;
                Object andSet = atomicReferenceArray.getAndSet(i3, jVar3);
                if (andSet == null) {
                    int i4 = i.f998a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            A.j jVar4 = i.f999b;
                            A.j jVar5 = i.f1001d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i3, jVar4, jVar5)) {
                                    z3 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i3) != jVar4) {
                                    break;
                                }
                            }
                            z2 = true ^ z3;
                        } else if (atomicReferenceArray.get(i3) == i.f1000c) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                } else if (andSet != i.f1002e) {
                    if (!(andSet instanceof InterfaceC0029e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0029e interfaceC0029e = (InterfaceC0029e) andSet;
                    A.j d3 = interfaceC0029e.d(t0.g.f2989a, this.f997a);
                    if (d3 != null) {
                        interfaceC0029e.k(d3);
                    }
                }
            }
            z2 = false;
        } while (!z2);
    }
}
