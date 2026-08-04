package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1nSDK extends AFf1tSDK {
    public AFf1nSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.PURCHASE_VALIDATE, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, map, purchaseValidationCallback);
        this.getCurrencyIso4217Code.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    public final AFe1tSDK<String> AFAdRevenueData(Map<String, Object> map, String str, String str2) {
        return ((AFf1oSDK) this).component2.getMediationNetwork(map, str, str2);
    }
}
