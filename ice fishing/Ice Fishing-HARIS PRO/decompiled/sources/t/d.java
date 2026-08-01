package t;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends h0.f {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4347g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4348h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4349k;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f4347g = atomicReferenceFieldUpdater;
        this.f4348h = atomicReferenceFieldUpdater2;
        this.i = atomicReferenceFieldUpdater3;
        this.j = atomicReferenceFieldUpdater4;
        this.f4349k = atomicReferenceFieldUpdater5;
    }

    @Override // h0.f
    public final boolean c(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f4345b;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // h0.f
    public final boolean d(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4349k;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // h0.f
    public final boolean e(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // h0.f
    public final void x(f fVar, f fVar2) {
        this.f4348h.lazySet(fVar, fVar2);
    }

    @Override // h0.f
    public final void y(f fVar, Thread thread) {
        this.f4347g.lazySet(fVar, thread);
    }
}
