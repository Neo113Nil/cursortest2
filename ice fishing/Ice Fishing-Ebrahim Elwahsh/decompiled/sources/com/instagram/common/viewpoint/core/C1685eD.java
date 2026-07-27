package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: com.facebook.ads.redexgen.X.eD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1685eD extends AbstractRunnableC1326Wc {
    public final /* synthetic */ C1835ge A00;

    public C1685eD(C1835ge c1835ge) {
        this.A00 = c1835ge;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
