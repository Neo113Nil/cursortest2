package l;

import a.AbstractC0069a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193d extends AbstractC0069a {

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2679i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2680j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2681k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2682l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2683m;

    public C0193d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f2679i = atomicReferenceFieldUpdater;
        this.f2680j = atomicReferenceFieldUpdater2;
        this.f2681k = atomicReferenceFieldUpdater3;
        this.f2682l = atomicReferenceFieldUpdater4;
        this.f2683m = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0069a
    public final boolean c(AbstractFutureC0196g abstractFutureC0196g, C0192c c0192c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0192c c0192c2 = C0192c.f2677b;
        do {
            atomicReferenceFieldUpdater = this.f2682l;
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
            atomicReferenceFieldUpdater = this.f2683m;
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
            atomicReferenceFieldUpdater = this.f2681k;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0196g, c0195f, c0195f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0196g) == c0195f);
        return false;
    }

    @Override // a.AbstractC0069a
    public final void y(C0195f c0195f, C0195f c0195f2) {
        this.f2680j.lazySet(c0195f, c0195f2);
    }

    @Override // a.AbstractC0069a
    public final void z(C0195f c0195f, Thread thread) {
        this.f2679i.lazySet(c0195f, thread);
    }
}
