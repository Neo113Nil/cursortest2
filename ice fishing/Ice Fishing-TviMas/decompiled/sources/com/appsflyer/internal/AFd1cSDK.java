package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFd1cSDK implements AFd1bSDK {
    private final AFd1hSDK getMediationNetwork;

    public AFd1cSDK(AFd1hSDK aFd1hSDK) {
        Intrinsics.checkNotNullParameter(aFd1hSDK, "");
        this.getMediationNetwork = aFd1hSDK;
    }

    @Override // com.appsflyer.internal.AFd1bSDK
    public final void getMediationNetwork(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1aSDK(bArr, map, 2000).AFAdRevenueData()) {
            this.getMediationNetwork.AFAdRevenueData();
        }
    }
}
