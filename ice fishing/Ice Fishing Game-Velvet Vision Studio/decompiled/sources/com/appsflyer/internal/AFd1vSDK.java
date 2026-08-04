package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFd1vSDK implements AFd1uSDK {
    private final AFc1cSDK getMonetizationNetwork;

    public AFd1vSDK(AFc1cSDK aFc1cSDK) {
        Intrinsics.checkNotNullParameter(aFc1cSDK, "");
        this.getMonetizationNetwork = aFc1cSDK;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void getMonetizationNetwork(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1tSDK(bArr, map, 2000).AFAdRevenueData()) {
            this.getMonetizationNetwork.getCurrencyIso4217Code();
        }
    }
}
