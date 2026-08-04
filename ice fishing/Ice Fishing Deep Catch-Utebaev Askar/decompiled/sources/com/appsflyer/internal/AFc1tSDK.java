package com.appsflyer.internal;

import com.appsflyer.internal.AFe1aSDK.AnonymousClass2;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1tSDK implements Runnable {
    private final AFd1kSDK getCurrencyIso4217Code;
    private final AFa1oSDK getMonetizationNetwork;
    private final Map<String, Object> getRevenue;

    public AFc1tSDK(AFd1kSDK aFd1kSDK, AFa1oSDK aFa1oSDK, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        this.getCurrencyIso4217Code = aFd1kSDK;
        this.getMonetizationNetwork = aFa1oSDK;
        this.getRevenue = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFe1eSDK aFf1gSDK;
        if (this.getMonetizationNetwork.getRevenue()) {
            AFf1fSDK aFf1fSDK = new AFf1fSDK(this.getMonetizationNetwork, this.getCurrencyIso4217Code);
            aFf1fSDK.copydefault = this.getRevenue;
            aFf1gSDK = aFf1fSDK;
        } else {
            aFf1gSDK = this.getMonetizationNetwork instanceof AFh1nSDK ? new AFf1gSDK((AFh1nSDK) this.getMonetizationNetwork, this.getCurrencyIso4217Code) : new AFf1eSDK(this.getMonetizationNetwork, this.getCurrencyIso4217Code);
        }
        AFe1aSDK aFe1aSDKCopy = this.getCurrencyIso4217Code.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new AnonymousClass2(aFf1gSDK));
        if (aFf1gSDK.getMonetizationNetwork == AFf1zSDK.CONVERSION) {
            this.getCurrencyIso4217Code.AFInAppEventType();
            if (AFe1iSDK.getCurrencyIso4217Code() && AFb1qSDK.AFAdRevenueData(this.getCurrencyIso4217Code.values().AFAdRevenueData)) {
                AFe1aSDK aFe1aSDKCopy2 = this.getCurrencyIso4217Code.copy();
                aFe1aSDKCopy2.AFAdRevenueData.execute(aFe1aSDKCopy2.new AnonymousClass2(new AFf1hSDK(this.getCurrencyIso4217Code, "install")));
            }
        }
    }
}
