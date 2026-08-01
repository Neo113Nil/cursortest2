package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.jD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3393jD extends AbstractC3341iD {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31216a = AtomicReferenceFieldUpdater.newUpdater(C3717pD.class, Thread.class, "a");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31217b = AtomicReferenceFieldUpdater.newUpdater(C3717pD.class, C3717pD.class, "b");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31218c = AtomicReferenceFieldUpdater.newUpdater(AbstractC3771qD.class, C3717pD.class, "v");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31219d = AtomicReferenceFieldUpdater.newUpdater(AbstractC3771qD.class, C3125eD.class, "u");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31220e = AtomicReferenceFieldUpdater.newUpdater(AbstractC3771qD.class, Object.class, "n");

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final void e(C3717pD c3717pD, Thread thread) {
        f31216a.lazySet(c3717pD, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final void h(C3717pD c3717pD, C3717pD c3717pD2) {
        f31217b.lazySet(c3717pD, c3717pD2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final boolean m(AbstractC3771qD abstractC3771qD, C3717pD c3717pD, C3717pD c3717pD2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f31218c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3771qD, c3717pD, c3717pD2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3771qD) == c3717pD);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final boolean o(AbstractC3287hD abstractC3287hD, C3125eD c3125eD, C3125eD c3125eD2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f31219d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3287hD, c3125eD, c3125eD2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3287hD) == c3125eD);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final C3717pD p(AbstractC3287hD abstractC3287hD) {
        return (C3717pD) f31218c.getAndSet(abstractC3287hD, C3717pD.f33042c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final C3125eD q(AbstractC3287hD abstractC3287hD) {
        return (C3125eD) f31219d.getAndSet(abstractC3287hD, C3125eD.f29897d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final boolean r(AbstractC3771qD abstractC3771qD, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f31220e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3771qD, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3771qD) == obj);
        return false;
    }
}
