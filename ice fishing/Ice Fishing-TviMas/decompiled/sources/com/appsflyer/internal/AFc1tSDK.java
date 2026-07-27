package com.appsflyer.internal;

import com.appsflyer.internal.AFe1aSDK.AnonymousClass2;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
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
        AFf1gSDK aFf1eSDK;
        if (this.getMonetizationNetwork.getRevenue()) {
            AFf1fSDK aFf1fSDK = new AFf1fSDK(this.getMonetizationNetwork, this.getCurrencyIso4217Code);
            aFf1fSDK.copydefault = this.getRevenue;
            aFf1eSDK = aFf1fSDK;
        } else if (this.getMonetizationNetwork instanceof AFh1nSDK) {
            aFf1eSDK = new AFf1gSDK((AFh1nSDK) this.getMonetizationNetwork, this.getCurrencyIso4217Code);
        } else {
            aFf1eSDK = new AFf1eSDK(this.getMonetizationNetwork, this.getCurrencyIso4217Code);
        }
        AFe1aSDK copy = this.getCurrencyIso4217Code.copy();
        copy.AFAdRevenueData.execute(copy.new AnonymousClass2(aFf1eSDK));
        if (aFf1eSDK.getMonetizationNetwork == AFf1zSDK.CONVERSION) {
            this.getCurrencyIso4217Code.AFInAppEventType();
            if (AFe1iSDK.getCurrencyIso4217Code() && AFb1qSDK.AFAdRevenueData(this.getCurrencyIso4217Code.values().AFAdRevenueData)) {
                AFe1aSDK copy2 = this.getCurrencyIso4217Code.copy();
                copy2.AFAdRevenueData.execute(copy2.new AnonymousClass2(new AFf1hSDK(this.getCurrencyIso4217Code, "install")));
            }
        }
    }
}
