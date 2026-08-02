package t;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4981d extends com.bumptech.glide.f {
    public final AtomicReferenceFieldUpdater i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f40565j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f40566k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f40567l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f40568m;

    public C4981d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.i = atomicReferenceFieldUpdater;
        this.f40565j = atomicReferenceFieldUpdater2;
        this.f40566k = atomicReferenceFieldUpdater3;
        this.f40567l = atomicReferenceFieldUpdater4;
        this.f40568m = atomicReferenceFieldUpdater5;
    }

    @Override // com.bumptech.glide.f
    public final boolean c(AbstractC4984g abstractC4984g, C4980c c4980c, C4980c c4980c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f40567l;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4984g, c4980c, c4980c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4984g) == c4980c);
        return false;
    }

    @Override // com.bumptech.glide.f
    public final boolean d(AbstractC4984g abstractC4984g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f40568m;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4984g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4984g) == obj);
        return false;
    }

    @Override // com.bumptech.glide.f
    public final boolean e(AbstractC4984g abstractC4984g, C4983f c4983f, C4983f c4983f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f40566k;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4984g, c4983f, c4983f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4984g) == c4983f);
        return false;
    }

    @Override // com.bumptech.glide.f
    public final void q(C4983f c4983f, C4983f c4983f2) {
        this.f40565j.lazySet(c4983f, c4983f2);
    }

    @Override // com.bumptech.glide.f
    public final void r(C4983f c4983f, Thread thread) {
        this.i.lazySet(c4983f, thread);
    }
}
