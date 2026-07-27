package l;

import a.AbstractC0069a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193d extends AbstractC0069a {

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2671j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2672k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2673l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2674m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2675n;

    public C0193d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f2671j = atomicReferenceFieldUpdater;
        this.f2672k = atomicReferenceFieldUpdater2;
        this.f2673l = atomicReferenceFieldUpdater3;
        this.f2674m = atomicReferenceFieldUpdater4;
        this.f2675n = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0069a
    public final boolean c(AbstractFutureC0196g abstractFutureC0196g, C0192c c0192c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0192c c0192c2 = C0192c.f2669b;
        do {
            atomicReferenceFieldUpdater = this.f2674m;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0196g, c0192c, c0192c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0196g) == c0192c);
        return false;
    }

    @Override // a.AbstractC0069a
    public final boolean d(AbstractFutureC0196g abstractFutureC0196g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2675n;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0196g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0196g) == obj);
        return false;
    }

    @Override // a.AbstractC0069a
    public final boolean e(AbstractFutureC0196g abstractFutureC0196g, C0195f c0195f, C0195f c0195f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2673l;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0196g, c0195f, c0195f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0196g) == c0195f);
        return false;
    }

    @Override // a.AbstractC0069a
    public final void y(C0195f c0195f, C0195f c0195f2) {
        this.f2672k.lazySet(c0195f, c0195f2);
    }

    @Override // a.AbstractC0069a
    public final void z(C0195f c0195f, Thread thread) {
        this.f2671j.lazySet(c0195f, thread);
    }
}
