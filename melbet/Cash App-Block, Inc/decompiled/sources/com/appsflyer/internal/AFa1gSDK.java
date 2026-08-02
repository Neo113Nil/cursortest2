package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.EmptyMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1gSDK implements AFa1lSDK {
    private final AFc1qSDK getRevenue;

    public AFa1gSDK(AFc1qSDK aFc1qSDK) {
        aFc1qSDK.getClass();
        this.getRevenue = aFc1qSDK;
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void AFAdRevenueData() {
        this.getRevenue.AFAdRevenueData("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void getMonetizationNetwork(Map<String, ? extends Object> map) {
        map.getClass();
        this.getRevenue.getRevenue("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final Map<String, Object> getRevenue() {
        if (this.getRevenue.getMonetizationNetwork("deeplink_data")) {
            try {
                String monetizationNetwork = this.getRevenue.getMonetizationNetwork("deeplink_data", (String) null);
                if (monetizationNetwork != null) {
                    return AFj1bSDK.getMonetizationNetwork(new JSONObject(monetizationNetwork));
                }
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                return emptyMap;
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        EmptyMap emptyMap2 = EmptyMap.INSTANCE;
        emptyMap2.getClass();
        return emptyMap2;
    }
}
