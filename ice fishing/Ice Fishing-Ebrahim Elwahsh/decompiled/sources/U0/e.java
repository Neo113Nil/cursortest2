package U0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e extends com.bumptech.glide.e {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3224g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3225h;
    public final AtomicReferenceFieldUpdater i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3226j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3227k;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(5);
        this.f3224g = atomicReferenceFieldUpdater;
        this.f3225h = atomicReferenceFieldUpdater2;
        this.i = atomicReferenceFieldUpdater3;
        this.f3226j = atomicReferenceFieldUpdater4;
        this.f3227k = atomicReferenceFieldUpdater5;
    }

    @Override // com.bumptech.glide.e
    public final boolean b(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3226j;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == dVar);
        return false;
    }

    @Override // com.bumptech.glide.e
    public final boolean d(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3227k;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // com.bumptech.glide.e
    public final boolean f(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }

    @Override // com.bumptech.glide.e
    public final void x(h hVar, h hVar2) {
        this.f3225h.lazySet(hVar, hVar2);
    }

    @Override // com.bumptech.glide.e
    public final void z(h hVar, Thread thread) {
        this.f3224g.lazySet(hVar, thread);
    }
}
