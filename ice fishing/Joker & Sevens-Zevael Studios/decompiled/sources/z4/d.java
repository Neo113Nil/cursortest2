package z4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends u5.d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9115a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9116b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9117c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9118d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9119e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f9115a = atomicReferenceFieldUpdater;
        this.f9116b = atomicReferenceFieldUpdater2;
        this.f9117c = atomicReferenceFieldUpdater3;
        this.f9118d = atomicReferenceFieldUpdater4;
        this.f9119e = atomicReferenceFieldUpdater5;
    }

    @Override // u5.d
    public final boolean b(h hVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f9118d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == cVar);
        return false;
    }

    @Override // u5.d
    public final boolean c(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f9119e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // u5.d
    public final boolean d(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f9117c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override // u5.d
    public final void h(g gVar, g gVar2) {
        this.f9116b.lazySet(gVar, gVar2);
    }

    @Override // u5.d
    public final void i(g gVar, Thread thread) {
        this.f9115a.lazySet(gVar, thread);
    }
}
