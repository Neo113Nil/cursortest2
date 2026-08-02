package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* renamed from: com.facebook.ads.redexgen.X.Rn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1231Rn implements BidderTokenProviderApi {
    public final C1257So A00 = new C1257So();

    public final C1257So A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C1233Rp.A09(context));
    }
}
