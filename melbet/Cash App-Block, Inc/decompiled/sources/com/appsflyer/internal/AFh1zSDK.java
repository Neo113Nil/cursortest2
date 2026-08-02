package com.appsflyer.internal;

import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class AFh1zSDK extends AFh1ySDK {
    private final AFd1zSDK getMediationNetwork;

    public AFh1zSDK(AFd1zSDK aFd1zSDK) {
        aFd1zSDK.getClass();
        this.getMediationNetwork = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        if (z3) {
            if (StringsKt.isBlank(str)) {
                str = "missing label";
            }
            this.getMediationNetwork.afErrorLogForExcManagerOnly().getMonetizationNetwork(th, withTag$SDK_prodRelease(str, aFg1cSDK));
        }
    }
}
