package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes4.dex */
public final class AFf1dSDK extends AFf1oSDK<String> {
    private final AFh1hSDK component3;

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final AFe1tSDK<String> getMediationNetwork(String str) {
        String encodeToString = Base64.encodeToString(this.component3.getMediationNetwork(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(this.component3.component4, encodeToString);
        return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        AFf1zSDK aFf1zSDK;
        AFh1hSDK aFh1hSDK = this.component3;
        if (aFh1hSDK.equals != null) {
            aFf1zSDK = aFh1hSDK.equals;
        } else {
            aFf1zSDK = AFf1zSDK.CACHED_EVENT;
        }
        return (aFf1zSDK == AFf1zSDK.ARS_VALIDATE && ((AFf1oSDK) this).component4 != null && ((AFf1oSDK) this).component4.getStatusCode() == 424) || super.getMediationNetwork();
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final AppsFlyerRequestListener areAllFieldsValid() {
        return this.component3.getMediationNetwork;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFf1dSDK(AFh1hSDK aFh1hSDK, AFd1kSDK aFd1kSDK) {
        super(r0, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, new StringBuilder().append(aFh1hSDK.getMonetizationNetwork).append("-").append(getMediationNetwork(aFh1hSDK)).toString(), aFh1hSDK.getMonetizationNetwork);
        AFf1zSDK aFf1zSDK;
        if (aFh1hSDK.equals != null) {
            aFf1zSDK = aFh1hSDK.equals;
        } else {
            aFf1zSDK = AFf1zSDK.CACHED_EVENT;
        }
        this.component3 = aFh1hSDK;
    }

    private static String getMediationNetwork(AFh1hSDK aFh1hSDK) {
        try {
            return new URL(aFh1hSDK.component4).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }
}
