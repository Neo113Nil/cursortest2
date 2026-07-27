package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFj1eSDK implements AFj1bSDK {
    @Override // com.appsflyer.internal.AFj1bSDK
    public final String getMonetizationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String format = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
