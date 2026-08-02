package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.xD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4171xD extends AbstractC4117wD {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f35746b = AtomicReferenceFieldUpdater.newUpdater(AbstractC4279zD.class, Set.class, "A");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f35747c = AtomicIntegerFieldUpdater.newUpdater(AbstractC4279zD.class, "B");

    @Override // com.google.android.gms.internal.ads.AbstractC4117wD
    public final void b(AbstractC4063vD abstractC4063vD, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f35746b;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4063vD, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4063vD) == null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4117wD
    public final int e(AbstractC4063vD abstractC4063vD) {
        return f35747c.decrementAndGet(abstractC4063vD);
    }
}
