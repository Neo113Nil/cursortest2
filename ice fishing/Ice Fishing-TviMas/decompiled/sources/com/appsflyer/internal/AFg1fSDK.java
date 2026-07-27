package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFg1fSDK implements AFg1gSDK {
    private final AFg1dSDK getCurrencyIso4217Code;

    public AFg1fSDK(AFg1dSDK aFg1dSDK) {
        Intrinsics.checkNotNullParameter(aFg1dSDK, "");
        this.getCurrencyIso4217Code = aFg1dSDK;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final boolean AFAdRevenueData(AFg1hSDK aFg1hSDK) {
        Intrinsics.checkNotNullParameter(aFg1hSDK, "");
        if (aFg1hSDK.getGetRevenue()) {
            this.getCurrencyIso4217Code.AFAdRevenueData(aFg1hSDK);
        }
        return aFg1hSDK.getGetMediationNetwork();
    }
}
