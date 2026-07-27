package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class AFf1tSDK extends AFf1vSDK {
    private final PurchaseHandler.PurchaseValidationCallback component3;

    @Override // com.appsflyer.internal.AFf1vSDK
    protected final boolean component4() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1tSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFd1kSDK aFd1kSDK, Map<String, ? extends Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFf1zSDK, aFf1zSDKArr, aFd1kSDK, null, map);
        Intrinsics.checkNotNullParameter(aFf1zSDK, "");
        Intrinsics.checkNotNullParameter(aFf1zSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component3 = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.getRevenue();
        Throwable component1 = component1();
        if (component1 != null && (purchaseValidationCallback2 = this.component3) != null) {
            purchaseValidationCallback2.onFailure(component1);
        }
        ResponseNetwork<String> responseNetwork = ((AFf1oSDK) this).component4;
        if (responseNetwork == null || (purchaseValidationCallback = this.component3) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    protected final String AFAdRevenueData(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("billing_library_version")) {
            Object remove = map.remove("billing_library_version");
            if (remove instanceof String) {
                return (String) remove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    protected final String getMediationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("connector_version")) {
            Object remove = map.remove("connector_version");
            if (remove instanceof String) {
                return (String) remove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public boolean getMediationNetwork() {
        if (((AFf1oSDK) this).component4 != null) {
            ResponseNetwork responseNetwork = ((AFf1oSDK) this).component4;
            Intrinsics.checkNotNull(responseNetwork);
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.getMediationNetwork();
    }
}
