package v2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u.l0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends l0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7193a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7194b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7195c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7196d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7197e;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f7193a = atomicReferenceFieldUpdater;
        this.f7194b = atomicReferenceFieldUpdater2;
        this.f7195c = atomicReferenceFieldUpdater3;
        this.f7196d = atomicReferenceFieldUpdater4;
        this.f7197e = atomicReferenceFieldUpdater5;
    }

    @Override // u.l0
    public final boolean f(h hVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7196d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    @Override // u.l0
    public final boolean g(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7197e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // u.l0
    public final boolean h(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7195c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override // u.l0
    public final void n(g gVar, g gVar2) {
        this.f7194b.lazySet(gVar, gVar2);
    }

    @Override // u.l0
    public final void o(g gVar, Thread thread) {
        this.f7193a.lazySet(gVar, thread);
    }
}
