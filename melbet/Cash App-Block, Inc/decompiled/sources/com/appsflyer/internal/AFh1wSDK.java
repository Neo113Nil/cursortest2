package com.appsflyer.internal;

import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;

/* loaded from: classes.dex */
public final class AFh1wSDK extends AFh1ySDK {
    private final boolean getCurrencyIso4217Code;
    private final AFd1zSDK getMediationNetwork;

    public AFh1wSDK(AFd1zSDK aFd1zSDK) {
        aFd1zSDK.getClass();
        this.getMediationNetwork = aFd1zSDK;
        this.getCurrencyIso4217Code = true;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.getMediationNetwork.copy().getMonetizationNetwork("D", getMediationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        if (z4) {
            this.getMediationNetwork.copy().getMonetizationNetwork("E", getMediationNetwork(str, aFg1cSDK));
        }
        if (z4) {
            this.getMediationNetwork.copy().getRevenue(th);
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        aFg1cSDK.getClass();
        str.getClass();
        this.getMediationNetwork.copy().getMonetizationNetwork("F", getMediationNetwork(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final boolean getShouldExtendMsg() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.getMediationNetwork.copy().getMonetizationNetwork("I", getMediationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.getMediationNetwork.copy().getMonetizationNetwork(GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY, getMediationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.getMediationNetwork.copy().getMonetizationNetwork("W", getMediationNetwork(str, aFg1cSDK));
        }
    }
}
