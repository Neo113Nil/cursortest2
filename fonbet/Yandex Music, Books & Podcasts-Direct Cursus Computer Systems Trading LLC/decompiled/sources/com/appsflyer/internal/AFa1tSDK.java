package com.appsflyer.internal;

import com.appsflyer.internal.AFe1sSDK.AnonymousClass3;
import com.appsflyer.internal.AFe1vSDK;
import com.appsflyer.internal.AFe1zSDK;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFa1tSDK implements Runnable {
    private final Map<String, Object> AFAdRevenueData;

    @NotNull
    private final AFc1fSDK getMonetizationNetwork;

    @NotNull
    private final AFh1tSDK getRevenue;

    public AFa1tSDK(@NotNull AFc1fSDK aFc1fSDK, @NotNull AFh1tSDK aFh1tSDK, Map<String, ? extends Object> map) {
        aFc1fSDK.getClass();
        aFh1tSDK.getClass();
        this.getMonetizationNetwork = aFc1fSDK;
        this.getRevenue = aFh1tSDK;
        this.AFAdRevenueData = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFf1tSDK aFf1tSDK;
        if (this.getRevenue.AFAdRevenueData()) {
            AFf1rSDK aFf1rSDK = new AFf1rSDK(this.getRevenue, this.getMonetizationNetwork);
            aFf1rSDK.copy = this.AFAdRevenueData;
            aFf1tSDK = aFf1rSDK;
        } else {
            aFf1tSDK = this.getRevenue instanceof AFh1pSDK ? new AFf1xSDK((AFh1pSDK) this.getRevenue, this.getMonetizationNetwork) : new AFf1tSDK(this.getRevenue, this.getMonetizationNetwork);
        }
        AFe1sSDK equals = this.getMonetizationNetwork.equals();
        equals.getRevenue.execute(equals.new AnonymousClass3(aFf1tSDK));
        this.getMonetizationNetwork.AFInAppEventType();
        if (AFe1ySDK.getRevenue()) {
            AFe1vSDK currencyIso4217Code = this.getMonetizationNetwork.getCurrencyIso4217Code();
            AFh1tSDK aFh1tSDK = this.getRevenue;
            aFh1tSDK.getClass();
            if (AFj1nSDK.getMediationNetwork(currencyIso4217Code.getMonetizationNetwork.getMonetizationNetwork)) {
                AFe1zSDK.Companion companion = AFe1zSDK.INSTANCE;
                AFe1zSDK AFAdRevenueData = AFe1zSDK.Companion.AFAdRevenueData(aFh1tSDK);
                if (AFAdRevenueData == null) {
                    return;
                }
                currencyIso4217Code.getCurrencyIso4217Code(AFAdRevenueData, AFe1vSDK.AnonymousClass1.getMediationNetwork);
            }
        }
    }
}
