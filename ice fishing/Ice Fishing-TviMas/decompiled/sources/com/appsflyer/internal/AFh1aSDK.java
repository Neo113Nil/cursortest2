package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* loaded from: classes4.dex */
public final class AFh1aSDK extends AFh1gSDK {
    public AFh1aSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFa1oSDK
    public final AFa1oSDK getRevenue(String str) {
        return super.getRevenue(AFAdRevenueData(str));
    }

    @Override // com.appsflyer.internal.AFa1oSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        return AFf1zSDK.PURCHASE_VALIDATE;
    }
}
