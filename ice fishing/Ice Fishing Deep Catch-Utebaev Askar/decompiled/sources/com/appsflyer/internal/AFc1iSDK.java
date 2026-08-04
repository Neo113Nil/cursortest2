package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1iSDK implements AFc1hSDK {
    private final AFd1rSDK getCurrencyIso4217Code;

    public AFc1iSDK(AFd1rSDK aFd1rSDK) {
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        this.getCurrencyIso4217Code = aFd1rSDK;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    public final void AFAdRevenueData(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getCurrencyIso4217Code.AFAdRevenueData("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    public final void getCurrencyIso4217Code() {
        this.getCurrencyIso4217Code.AFAdRevenueData("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    public final Map<String, Object> getMonetizationNetwork() {
        if (this.getCurrencyIso4217Code.getMonetizationNetwork("deeplink_data")) {
            try {
                String monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork("deeplink_data", (String) null);
                return monetizationNetwork == null ? d0.c() : AFj1dSDK.AFAdRevenueData(new JSONObject(monetizationNetwork));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        return d0.c();
    }
}
