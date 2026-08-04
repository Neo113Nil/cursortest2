package com.appsflyer;

import com.appsflyer.internal.AFb1jSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseHandler {
    private final AFd1qSDK AFAdRevenueData;
    public final AFe1aSDK getMediationNetwork;
    public final AFd1kSDK getRevenue;

    public interface PurchaseValidationCallback {
        void onFailure(Throwable th);

        void onResponse(ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(AFd1kSDK aFd1kSDK) {
        this.getRevenue = aFd1kSDK;
        this.AFAdRevenueData = aFd1kSDK.getMediationNetwork();
        this.getMediationNetwork = aFd1kSDK.copy();
    }

    public final boolean getCurrencyIso4217Code(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean mediationNetwork = AFb1jSDK.getMediationNetwork(map, strArr, this.AFAdRevenueData);
        if (!mediationNetwork && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return mediationNetwork;
    }
}
