package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.jD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3416jD extends AbstractC3364iD {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f32003a = AtomicReferenceFieldUpdater.newUpdater(C3740pD.class, Thread.class, "a");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f32004b = AtomicReferenceFieldUpdater.newUpdater(C3740pD.class, C3740pD.class, "b");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f32005c = AtomicReferenceFieldUpdater.newUpdater(AbstractC3794qD.class, C3740pD.class, "v");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f32006d = AtomicReferenceFieldUpdater.newUpdater(AbstractC3794qD.class, C3148eD.class, "u");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f32007e = AtomicReferenceFieldUpdater.newUpdater(AbstractC3794qD.class, Object.class, "n");

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final void e(C3740pD c3740pD, Thread thread) {
        f32003a.lazySet(c3740pD, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final void h(C3740pD c3740pD, C3740pD c3740pD2) {
        f32004b.lazySet(c3740pD, c3740pD2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final boolean m(AbstractC3794qD abstractC3794qD, C3740pD c3740pD, C3740pD c3740pD2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f32005c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3794qD, c3740pD, c3740pD2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3794qD) == c3740pD);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final boolean o(AbstractC3310hD abstractC3310hD, C3148eD c3148eD, C3148eD c3148eD2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f32006d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3310hD, c3148eD, c3148eD2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3310hD) == c3148eD);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final C3740pD p(AbstractC3310hD abstractC3310hD) {
        return (C3740pD) f32005c.getAndSet(abstractC3310hD, C3740pD.f33832c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final C3148eD q(AbstractC3310hD abstractC3310hD) {
        return (C3148eD) f32006d.getAndSet(abstractC3310hD, C3148eD.f30689d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final boolean r(AbstractC3794qD abstractC3794qD, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f32007e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3794qD, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3794qD) == obj);
        return false;
    }
}
