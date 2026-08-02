package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: com.facebook.ads.redexgen.X.eD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1706eD extends AbstractRunnableC1347Wc {
    public final /* synthetic */ C1856ge A00;

    public C1706eD(C1856ge c1856ge) {
        this.A00 = c1856ge;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
