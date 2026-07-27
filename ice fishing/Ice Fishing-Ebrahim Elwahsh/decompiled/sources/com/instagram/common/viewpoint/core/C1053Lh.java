package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1053Lh extends AbstractRunnableC1326Wc {
    public final WeakReference<C1784fp> A00;

    public C1053Lh(C1784fp c1784fp) {
        this.A00 = new WeakReference<>(c1784fp);
    }

    public C1053Lh(WeakReference<C1784fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        C1784fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
