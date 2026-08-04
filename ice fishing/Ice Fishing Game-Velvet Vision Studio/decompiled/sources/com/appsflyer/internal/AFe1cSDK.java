package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFe1cSDK extends AFe1hSDK {
    public AFe1cSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.PURCHASE_VALIDATE, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, map, purchaseValidationCallback);
        this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    public final AFd1hSDK<String> getRevenue(Map<String, Object> map, String str, String str2) {
        AFd1nSDK aFd1nSDK = ((AFe1fSDK) this).component4;
        return (AFd1hSDK) AFd1nSDK.getMediationNetwork(new Object[]{aFd1nSDK, map, str, str2}, -1130573825, 1130573827, System.identityHashCode(aFd1nSDK));
    }
}
