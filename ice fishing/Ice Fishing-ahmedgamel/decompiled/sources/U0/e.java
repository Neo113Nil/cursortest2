package U0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e extends t8.g {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3145b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3146c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3147d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3148e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3149f;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(5);
        this.f3145b = atomicReferenceFieldUpdater;
        this.f3146c = atomicReferenceFieldUpdater2;
        this.f3147d = atomicReferenceFieldUpdater3;
        this.f3148e = atomicReferenceFieldUpdater4;
        this.f3149f = atomicReferenceFieldUpdater5;
    }

    @Override // t8.g
    public final boolean b(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3148e;
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
            atomicReferenceFieldUpdater = this.f3149f;
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
            atomicReferenceFieldUpdater = this.f3147d;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }

    @Override // t8.g
    public final void v(h hVar, h hVar2) {
        this.f3146c.lazySet(hVar, hVar2);
    }

    @Override // t8.g
    public final void w(h hVar, Thread thread) {
        this.f3145b.lazySet(hVar, thread);
    }
}
