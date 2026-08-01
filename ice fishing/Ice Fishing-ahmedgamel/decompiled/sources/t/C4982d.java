package t;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4982d extends com.bumptech.glide.f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f40511a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f40512b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f40513c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f40514d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f40515e;

    public C4982d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f40511a = atomicReferenceFieldUpdater;
        this.f40512b = atomicReferenceFieldUpdater2;
        this.f40513c = atomicReferenceFieldUpdater3;
        this.f40514d = atomicReferenceFieldUpdater4;
        this.f40515e = atomicReferenceFieldUpdater5;
    }

    @Override // com.bumptech.glide.f
    public final boolean c(AbstractC4985g abstractC4985g, C4981c c4981c, C4981c c4981c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f40514d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4985g, c4981c, c4981c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4985g) == c4981c);
        return false;
    }

    @Override // com.bumptech.glide.f
    public final boolean d(AbstractC4985g abstractC4985g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f40515e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4985g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4985g) == obj);
        return false;
    }

    @Override // com.bumptech.glide.f
    public final boolean e(AbstractC4985g abstractC4985g, C4984f c4984f, C4984f c4984f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f40513c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4985g, c4984f, c4984f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4985g) == c4984f);
        return false;
    }

    @Override // com.bumptech.glide.f
    public final void u(C4984f c4984f, C4984f c4984f2) {
        this.f40512b.lazySet(c4984f, c4984f2);
    }

    @Override // com.bumptech.glide.f
    public final void v(C4984f c4984f, Thread thread) {
        this.f40511a.lazySet(c4984f, thread);
    }
}
