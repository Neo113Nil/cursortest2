package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import defpackage.e5b;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1jSDK implements AFa1lSDK {

    @NotNull
    private final AFc1sSDK getMonetizationNetwork;

    public AFa1jSDK(@NotNull AFc1sSDK aFc1sSDK) {
        aFc1sSDK.getClass();
        this.getMonetizationNetwork = aFc1sSDK;
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void AFAdRevenueData() {
        this.getMonetizationNetwork.getMediationNetwork("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    @NotNull
    public final Map<String, Object> getCurrencyIso4217Code() {
        if (this.getMonetizationNetwork.getCurrencyIso4217Code("deeplink_data")) {
            try {
                String AFAdRevenueData = this.getMonetizationNetwork.AFAdRevenueData("deeplink_data", (String) null);
                if (AFAdRevenueData != null) {
                    return AFj1iSDK.getRevenue(new JSONObject(AFAdRevenueData));
                }
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                return e5bVar;
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        e5b e5bVar2 = e5b.a;
        e5bVar2.getClass();
        return e5bVar2;
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void getMonetizationNetwork(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        this.getMonetizationNetwork.getRevenue("deeplink_data", new JSONObject(map).toString());
    }
}
