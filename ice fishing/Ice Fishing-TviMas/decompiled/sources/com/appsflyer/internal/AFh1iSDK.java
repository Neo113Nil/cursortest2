package com.appsflyer.internal;

/* loaded from: classes4.dex */
public final class AFh1iSDK extends AFa1oSDK {
    @Override // com.appsflyer.internal.AFa1oSDK
    public final boolean component3() {
        return true;
    }

    @Override // com.appsflyer.internal.AFa1oSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        if (this.component1 == 1) {
            return AFf1zSDK.CONVERSION;
        }
        return AFf1zSDK.LAUNCH;
    }
}
