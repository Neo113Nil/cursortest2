package a8;

import E2.C0316m;
import J0.k;
import S7.C0393g;
import S7.InterfaceC0392f;
import X7.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.v;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4364b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4365c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4366d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4367e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4368f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final k f4369a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h() {
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = 1;
        this.f4369a = new k(3, this);
    }

    public final void a(c cVar) {
        Object b9;
        C0393g c0393g;
        while (true) {
            int andDecrement = f4368f.getAndDecrement(this);
            if (andDecrement <= 1) {
                v vVar = v.f41073a;
                C0393g c0393g2 = cVar.f4358n;
                d dVar = cVar.f4359u;
                if (andDecrement > 0) {
                    d.f4360g.set(dVar, null);
                    c0393g2.z(vVar, new C0452b(dVar, cVar, 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4366d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f4367e.getAndIncrement(this);
                f fVar = f.f4362v;
                long j6 = andIncrement / i.f4375f;
                while (true) {
                    b9 = X7.a.b(jVar, j6, fVar);
                    if (!X7.a.e(b9)) {
                        t c9 = X7.a.c(b9);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            c0393g = c0393g2;
                            if (tVar.f3815v >= c9.f3815v) {
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
                                    c0393g2 = c0393g;
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        c0393g = c0393g2;
                        break;
                    }
                    c0393g2 = c0393g;
                }
                j jVar2 = (j) X7.a.c(b9);
                int i = (int) (andIncrement % i.f4375f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f4376x;
                while (!atomicReferenceArray.compareAndSet(i, null, cVar)) {
                    if (atomicReferenceArray.get(i) != null) {
                        C0316m c0316m = i.f4371b;
                        C0316m c0316m2 = i.f4372c;
                        while (!atomicReferenceArray.compareAndSet(i, c0316m, c0316m2)) {
                            C0393g c0393g3 = c0393g;
                            if (atomicReferenceArray.get(i) != c0316m) {
                                break;
                            } else {
                                c0393g = c0393g3;
                            }
                        }
                        d.f4360g.set(dVar, null);
                        c0393g.z(vVar, new C0452b(dVar, cVar, 0));
                        return;
                    }
                }
                cVar.a(jVar2, i);
                return;
            }
        }
    }

    public final void b() {
        boolean z6;
        int i;
        Object b9;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4368f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z6 = true;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4364b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f4365c.getAndIncrement(this);
            long j6 = andIncrement2 / i.f4375f;
            g gVar = g.f4363v;
            while (true) {
                b9 = X7.a.b(jVar, j6, gVar);
                if (!X7.a.e(b9)) {
                    t c9 = X7.a.c(b9);
                    while (true) {
                        t tVar = (t) atomicReferenceFieldUpdater.get(this);
                        if (tVar.f3815v >= c9.f3815v) {
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
            boolean z9 = false;
            if (jVar2.f3815v <= j6) {
                int i4 = (int) (andIncrement2 % i.f4375f);
                C0316m c0316m = i.f4371b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f4376x;
                Object andSet = atomicReferenceArray.getAndSet(i4, c0316m);
                if (andSet == null) {
                    int i6 = i.f4370a;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= i6) {
                            C0316m c0316m2 = i.f4371b;
                            C0316m c0316m3 = i.f4373d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i4, c0316m2, c0316m3)) {
                                    z9 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i4) != c0316m2) {
                                    break;
                                }
                            }
                            z6 = true ^ z9;
                        } else if (atomicReferenceArray.get(i4) == i.f4372c) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                } else if (andSet != i.f4374e) {
                    if (!(andSet instanceof InterfaceC0392f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0392f interfaceC0392f = (InterfaceC0392f) andSet;
                    C0316m c10 = interfaceC0392f.c(v.f41073a, this.f4369a);
                    if (c10 != null) {
                        interfaceC0392f.f(c10);
                    }
                }
            }
            z6 = false;
        } while (!z6);
    }
}
