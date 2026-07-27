package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFi1pSDK {
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final String getMediationNetwork;
    private final boolean getMonetizationNetwork;

    public AFi1pSDK(String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFAdRevenueData = str;
        this.getMediationNetwork = str2;
        this.getCurrencyIso4217Code = str3;
        this.getMonetizationNetwork = z;
    }

    public final boolean getMediationNetwork() {
        return this.getMonetizationNetwork;
    }
}
