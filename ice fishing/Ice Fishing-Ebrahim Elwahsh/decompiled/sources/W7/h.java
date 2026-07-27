package W7;

import J0.l;
import O7.C0382g;
import O7.InterfaceC0381f;
import T7.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q7.v;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3507b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3508c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3509d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3510e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3511f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final l f3512a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h() {
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = 1;
        this.f3512a = new l(2, this);
    }

    public final void a(c cVar) {
        Object b9;
        C0382g c0382g;
        while (true) {
            int andDecrement = f3511f.getAndDecrement(this);
            if (andDecrement <= 1) {
                v vVar = v.f40183a;
                C0382g c0382g2 = cVar.f3501n;
                d dVar = cVar.f3502u;
                if (andDecrement > 0) {
                    d.f3503g.set(dVar, null);
                    c0382g2.z(vVar, new b(dVar, cVar, 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3509d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f3510e.getAndIncrement(this);
                f fVar = f.f3505v;
                long j9 = andIncrement / i.f3518f;
                while (true) {
                    b9 = T7.a.b(jVar, j9, fVar);
                    if (!T7.a.e(b9)) {
                        t c4 = T7.a.c(b9);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            c0382g = c0382g2;
                            if (tVar.f3166v >= c4.f3166v) {
                                break;
                            }
                            if (!c4.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c4)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (c4.e()) {
                                        c4.d();
                                    }
                                    c0382g2 = c0382g;
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        c0382g = c0382g2;
                        break;
                    }
                    c0382g2 = c0382g;
                }
                j jVar2 = (j) T7.a.c(b9);
                int i = (int) (andIncrement % i.f3518f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f3519x;
                while (!atomicReferenceArray.compareAndSet(i, null, cVar)) {
                    if (atomicReferenceArray.get(i) != null) {
                        T7.v vVar2 = i.f3514b;
                        T7.v vVar3 = i.f3515c;
                        while (!atomicReferenceArray.compareAndSet(i, vVar2, vVar3)) {
                            C0382g c0382g3 = c0382g;
                            if (atomicReferenceArray.get(i) != vVar2) {
                                break;
                            } else {
                                c0382g = c0382g3;
                            }
                        }
                        d.f3503g.set(dVar, null);
                        c0382g.z(vVar, new b(dVar, cVar, 0));
                        return;
                    }
                }
                cVar.a(jVar2, i);
                return;
            }
        }
    }

    public final void b() {
        boolean z8;
        int i;
        Object b9;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3511f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z8 = true;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3507b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f3508c.getAndIncrement(this);
            long j9 = andIncrement2 / i.f3518f;
            g gVar = g.f3506v;
            while (true) {
                b9 = T7.a.b(jVar, j9, gVar);
                if (!T7.a.e(b9)) {
                    t c4 = T7.a.c(b9);
                    while (true) {
                        t tVar = (t) atomicReferenceFieldUpdater.get(this);
                        if (tVar.f3166v >= c4.f3166v) {
                            break;
                        }
                        if (!c4.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c4)) {
                            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                if (c4.e()) {
                                    c4.d();
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
            j jVar2 = (j) T7.a.c(b9);
            jVar2.a();
            boolean z9 = false;
            if (jVar2.f3166v <= j9) {
                int i4 = (int) (andIncrement2 % i.f3518f);
                T7.v vVar = i.f3514b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f3519x;
                Object andSet = atomicReferenceArray.getAndSet(i4, vVar);
                if (andSet == null) {
                    int i9 = i.f3513a;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= i9) {
                            T7.v vVar2 = i.f3514b;
                            T7.v vVar3 = i.f3516d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i4, vVar2, vVar3)) {
                                    z9 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i4) != vVar2) {
                                    break;
                                }
                            }
                            z8 = true ^ z9;
                        } else if (atomicReferenceArray.get(i4) == i.f3515c) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                } else if (andSet != i.f3517e) {
                    if (!(andSet instanceof InterfaceC0381f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0381f interfaceC0381f = (InterfaceC0381f) andSet;
                    T7.v d2 = interfaceC0381f.d(v.f40183a, this.f3512a);
                    if (d2 != null) {
                        interfaceC0381f.f(d2);
                    }
                }
            }
            z8 = false;
        } while (!z8);
    }
}
