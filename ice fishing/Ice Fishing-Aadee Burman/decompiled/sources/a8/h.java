package a8;

import J0.l;
import S7.C0389g;
import S7.InterfaceC0388f;
import X7.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.v;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4396b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4397c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4398d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4399e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4400f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final l f4401a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h() {
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = 1;
        this.f4401a = new l(3, this);
    }

    public final void a(c cVar) {
        Object b9;
        C0389g c0389g;
        while (true) {
            int andDecrement = f4400f.getAndDecrement(this);
            if (andDecrement <= 1) {
                v vVar = v.f41350a;
                C0389g c0389g2 = cVar.f4390n;
                d dVar = cVar.f4391u;
                if (andDecrement > 0) {
                    d.f4392g.set(dVar, null);
                    c0389g2.z(vVar, new C0448b(dVar, cVar, 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4398d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f4399e.getAndIncrement(this);
                f fVar = f.f4394v;
                long j6 = andIncrement / i.f4407f;
                while (true) {
                    b9 = X7.a.b(jVar, j6, fVar);
                    if (!X7.a.e(b9)) {
                        t c9 = X7.a.c(b9);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            c0389g = c0389g2;
                            if (tVar.f3860v >= c9.f3860v) {
                                break;
                            }
                            if (!c9.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c9)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (c9.e()) {
                                        c9.d();
                                    }
                                    c0389g2 = c0389g;
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        c0389g = c0389g2;
                        break;
                    }
                    c0389g2 = c0389g;
                }
                j jVar2 = (j) X7.a.c(b9);
                int i = (int) (andIncrement % i.f4407f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f4408x;
                while (!atomicReferenceArray.compareAndSet(i, null, cVar)) {
                    if (atomicReferenceArray.get(i) != null) {
                        D2.b bVar = i.f4403b;
                        D2.b bVar2 = i.f4404c;
                        while (!atomicReferenceArray.compareAndSet(i, bVar, bVar2)) {
                            C0389g c0389g3 = c0389g;
                            if (atomicReferenceArray.get(i) != bVar) {
                                break;
                            } else {
                                c0389g = c0389g3;
                            }
                        }
                        d.f4392g.set(dVar, null);
                        c0389g.z(vVar, new C0448b(dVar, cVar, 0));
                        return;
                    }
                }
                cVar.a(jVar2, i);
                return;
            }
        }
    }

    public final void b() {
        boolean z3;
        int i;
        Object b9;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4400f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z3 = true;
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4396b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f4397c.getAndIncrement(this);
            long j6 = andIncrement2 / i.f4407f;
            g gVar = g.f4395v;
            while (true) {
                b9 = X7.a.b(jVar, j6, gVar);
                if (!X7.a.e(b9)) {
                    t c9 = X7.a.c(b9);
                    while (true) {
                        t tVar = (t) atomicReferenceFieldUpdater.get(this);
                        if (tVar.f3860v >= c9.f3860v) {
                            break;
                        }
                        if (!c9.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c9)) {
                            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                if (c9.e()) {
                                    c9.d();
                                }
                            }
                        }
                        if (tVar.e()) {
                            tVar.d();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) X7.a.c(b9);
            jVar2.a();
            boolean z6 = false;
            if (jVar2.f3860v <= j6) {
                int i6 = (int) (andIncrement2 % i.f4407f);
                D2.b bVar = i.f4403b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f4408x;
                Object andSet = atomicReferenceArray.getAndSet(i6, bVar);
                if (andSet == null) {
                    int i9 = i.f4402a;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= i9) {
                            D2.b bVar2 = i.f4403b;
                            D2.b bVar3 = i.f4405d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i6, bVar2, bVar3)) {
                                    z6 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i6) != bVar2) {
                                    break;
                                }
                            }
                            z3 = true ^ z6;
                        } else if (atomicReferenceArray.get(i6) == i.f4404c) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                } else if (andSet != i.f4406e) {
                    if (!(andSet instanceof InterfaceC0388f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0388f interfaceC0388f = (InterfaceC0388f) andSet;
                    D2.b c10 = interfaceC0388f.c(v.f41350a, this.f4401a);
                    if (c10 != null) {
                        interfaceC0388f.f(c10);
                    }
                }
            }
            z3 = false;
        } while (!z3);
    }
}
