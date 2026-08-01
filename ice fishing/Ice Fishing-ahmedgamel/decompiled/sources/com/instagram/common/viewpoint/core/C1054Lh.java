package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1054Lh extends AbstractRunnableC1327Wc {
    public final WeakReference<C1785fp> A00;

    public C1054Lh(C1785fp c1785fp) {
        this.A00 = new WeakReference<>(c1785fp);
    }

    public C1054Lh(WeakReference<C1785fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        C1785fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
