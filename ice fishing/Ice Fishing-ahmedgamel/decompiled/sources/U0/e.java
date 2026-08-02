package U0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e extends t8.g {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3262a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3263b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3264c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3265d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3266e;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3262a = atomicReferenceFieldUpdater;
        this.f3263b = atomicReferenceFieldUpdater2;
        this.f3264c = atomicReferenceFieldUpdater3;
        this.f3265d = atomicReferenceFieldUpdater4;
        this.f3266e = atomicReferenceFieldUpdater5;
    }

    @Override // t8.g
    public final boolean b(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3265d;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == dVar);
        return false;
    }

    @Override // t8.g
    public final boolean c(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3266e;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // t8.g
    public final boolean d(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3264c;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }

    @Override // t8.g
    public final void o(h hVar, h hVar2) {
        this.f3263b.lazySet(hVar, hVar2);
    }

    @Override // t8.g
    public final void p(h hVar, Thread thread) {
        this.f3262a.lazySet(hVar, thread);
    }
}
