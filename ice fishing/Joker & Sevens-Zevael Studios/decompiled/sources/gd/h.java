package gd;

import a0.a0;
import ac.o;
import dd.u;
import dd.w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2577b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2578c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2579d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2580e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2581f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final a0 f2582a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h() {
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = 1;
        this.f2582a = new a0(12, this);
    }

    public final void a(c cVar) {
        Object a6;
        j jVar;
        yc.g gVar = cVar.f2571g;
        d dVar = cVar.f2572h;
        while (true) {
            int andDecrement = f2581f.getAndDecrement(this);
            if (andDecrement <= 1) {
                o oVar = o.f277a;
                if (andDecrement > 0) {
                    d.f2573g.set(dVar, null);
                    gVar.A(oVar, new b(dVar, cVar, 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2579d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f2580e.getAndIncrement(this);
                f fVar = f.f2575o;
                long j3 = andIncrement / i.f2588f;
                while (true) {
                    a6 = dd.a.a(jVar2, j3, fVar);
                    if (!dd.a.d(a6)) {
                        u b2 = dd.a.b(a6);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
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
                                    jVar2 = jVar;
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    jVar2 = jVar;
                }
                j jVar3 = (j) dd.a.b(a6);
                AtomicReferenceArray atomicReferenceArray = jVar3.f2589e;
                int i10 = (int) (andIncrement % i.f2588f);
                while (!atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                    if (atomicReferenceArray.get(i10) != null) {
                        w wVar = i.f2584b;
                        w wVar2 = i.f2585c;
                        while (!atomicReferenceArray.compareAndSet(i10, wVar, wVar2)) {
                            if (atomicReferenceArray.get(i10) != wVar) {
                                break;
                            }
                        }
                        d.f2573g.set(dVar, null);
                        gVar.A(oVar, new b(dVar, cVar, 0));
                        return;
                    }
                }
                cVar.a(jVar3, i10);
                return;
            }
        }
    }

    public final void b() {
        boolean z10;
        int i10;
        Object a6;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2581f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z10 = true;
            if (andIncrement >= 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2577b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f2578c.getAndIncrement(this);
            long j3 = andIncrement2 / i.f2588f;
            g gVar = g.f2576o;
            while (true) {
                a6 = dd.a.a(jVar, j3, gVar);
                if (!dd.a.d(a6)) {
                    u b2 = dd.a.b(a6);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
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
            j jVar2 = (j) dd.a.b(a6);
            AtomicReferenceArray atomicReferenceArray = jVar2.f2589e;
            jVar2.a();
            boolean z11 = false;
            if (jVar2.f1884c <= j3) {
                int i11 = (int) (andIncrement2 % i.f2588f);
                Object andSet = atomicReferenceArray.getAndSet(i11, i.f2584b);
                if (andSet == null) {
                    int i12 = i.f2583a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            w wVar = i.f2584b;
                            w wVar2 = i.f2586d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i11, wVar, wVar2)) {
                                    z11 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i11) != wVar) {
                                    break;
                                }
                            }
                            z10 = true ^ z11;
                        } else if (atomicReferenceArray.get(i11) == i.f2585c) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                } else if (andSet != i.f2587e) {
                    if (!(andSet instanceof yc.f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    yc.f fVar = (yc.f) andSet;
                    w e10 = fVar.e(o.f277a, this.f2582a);
                    if (e10 != null) {
                        fVar.y(e10);
                    }
                }
            }
            z10 = false;
        } while (!z10);
    }
}
