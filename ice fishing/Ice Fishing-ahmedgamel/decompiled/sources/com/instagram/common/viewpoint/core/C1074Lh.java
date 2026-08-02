package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1074Lh extends AbstractRunnableC1347Wc {
    public final WeakReference<C1805fp> A00;

    public C1074Lh(C1805fp c1805fp) {
        this.A00 = new WeakReference<>(c1805fp);
    }

    public C1074Lh(WeakReference<C1805fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        C1805fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
