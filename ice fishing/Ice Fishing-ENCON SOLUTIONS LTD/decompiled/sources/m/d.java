package m;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public final class d extends AbstractC1050a {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8144c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8145d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8146e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8147f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8148g;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f8144c = atomicReferenceFieldUpdater;
        this.f8145d = atomicReferenceFieldUpdater2;
        this.f8146e = atomicReferenceFieldUpdater3;
        this.f8147f = atomicReferenceFieldUpdater4;
        this.f8148g = atomicReferenceFieldUpdater5;
    }

    @Override // u0.AbstractC1050a
    public final boolean c(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f8142b;
        do {
            atomicReferenceFieldUpdater = this.f8147f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // u0.AbstractC1050a
    public final boolean d(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8148g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // u0.AbstractC1050a
    public final boolean e(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8146e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // u0.AbstractC1050a
    public final void v(f fVar, f fVar2) {
        this.f8145d.lazySet(fVar, fVar2);
    }

    @Override // u0.AbstractC1050a
    public final void w(f fVar, Thread thread) {
        this.f8144c.lazySet(fVar, thread);
    }
}
