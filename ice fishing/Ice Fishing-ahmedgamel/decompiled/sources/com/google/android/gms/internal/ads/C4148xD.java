package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.xD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4148xD extends AbstractC4094wD {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f34965b = AtomicReferenceFieldUpdater.newUpdater(AbstractC4256zD.class, Set.class, "A");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f34966c = AtomicIntegerFieldUpdater.newUpdater(AbstractC4256zD.class, "B");

    @Override // com.google.android.gms.internal.ads.AbstractC4094wD
    public final void b(AbstractC4040vD abstractC4040vD, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f34965b;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4040vD, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4040vD) == null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4094wD
    public final int e(AbstractC4040vD abstractC4040vD) {
        return f34966c.decrementAndGet(abstractC4040vD);
    }
}
