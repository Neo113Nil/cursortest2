package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: com.facebook.ads.redexgen.X.eD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1686eD extends AbstractRunnableC1327Wc {
    public final /* synthetic */ C1836ge A00;

    public C1686eD(C1836ge c1836ge) {
        this.A00 = c1836ge;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
