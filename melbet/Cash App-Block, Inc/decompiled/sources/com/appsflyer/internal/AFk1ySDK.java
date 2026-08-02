package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;

/* loaded from: classes.dex */
public final class AFk1ySDK implements AFk1zSDK {
    @Override // com.appsflyer.internal.AFk1zSDK
    public final String getMediationNetwork(String str) {
        str.getClass();
        return String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName());
    }
}
