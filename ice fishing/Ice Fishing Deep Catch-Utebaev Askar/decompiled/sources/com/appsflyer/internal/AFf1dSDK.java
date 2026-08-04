package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1dSDK extends AFf1oSDK<String> {
    private final AFh1hSDK component3;

    public AFf1dSDK(AFh1hSDK aFh1hSDK, AFd1kSDK aFd1kSDK) {
        AFf1zSDK aFf1zSDK = aFh1hSDK.equals;
        AFf1zSDK aFf1zSDK2 = aFf1zSDK == null ? AFf1zSDK.CACHED_EVENT : aFf1zSDK;
        AFf1zSDK[] aFf1zSDKArr = {AFf1zSDK.RC_CDN};
        StringBuilder sb = new StringBuilder();
        sb.append(aFh1hSDK.getMonetizationNetwork);
        sb.append("-");
        sb.append(getMediationNetwork(aFh1hSDK));
        super(aFf1zSDK2, aFf1zSDKArr, aFd1kSDK, sb.toString(), aFh1hSDK.getMonetizationNetwork);
        this.component3 = aFh1hSDK;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return this.component3.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1tSDK<String> getMediationNetwork(String str) {
        String strEncodeToString = Base64.encodeToString(this.component3.getMediationNetwork(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(strEncodeToString)));
        ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(this.component3.component4, strEncodeToString);
        return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3);
    }

    private static String getMediationNetwork(AFh1hSDK aFh1hSDK) {
        try {
            return new URL(aFh1hSDK.component4).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        ResponseNetwork responseNetwork;
        AFf1zSDK aFf1zSDK = this.component3.equals;
        if (aFf1zSDK == null) {
            aFf1zSDK = AFf1zSDK.CACHED_EVENT;
        }
        return (aFf1zSDK == AFf1zSDK.ARS_VALIDATE && (responseNetwork = ((AFf1oSDK) this).component4) != null && responseNetwork.getStatusCode() == 424) || super.getMediationNetwork();
    }
}
