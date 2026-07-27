package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.yD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4215yD extends AbstractC4161xD {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f35332a = AtomicReferenceFieldUpdater.newUpdater(AD.class, Set.class, "A");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f35333b = AtomicIntegerFieldUpdater.newUpdater(AD.class, "B");

    @Override // com.google.android.gms.internal.ads.AbstractC4161xD
    public final void c(AbstractC4107wD abstractC4107wD, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f35332a;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4107wD, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4107wD) == null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4161xD
    public final int g(AbstractC4107wD abstractC4107wD) {
        return f35333b.decrementAndGet(abstractC4107wD);
    }
}
