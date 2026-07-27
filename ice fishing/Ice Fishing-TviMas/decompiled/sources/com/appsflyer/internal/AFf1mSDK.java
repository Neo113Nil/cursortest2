package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass2;
import com.facebook.internal.ServerProtocol;

/* loaded from: classes4.dex */
public final class AFf1mSDK extends AFe1eSDK<Boolean> {
    private static volatile boolean component1 = false;
    private Boolean areAllFieldsValid;
    private final AFb1uSDK component2;
    private final AFd1kSDK component3;
    private final AFe1aSDK component4;

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 30000L;
    }

    public AFf1mSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.LOAD_CACHE, new AFf1zSDK[0], "LoadCachedRequests");
        this.component2 = aFd1kSDK.valueOf();
        this.component4 = aFd1kSDK.copy();
        this.component3 = aFd1kSDK;
    }

    public static boolean component4() {
        return component1;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() throws Exception {
        for (AFb1kSDK aFb1kSDK : this.component2.getMediationNetwork()) {
            AFLogger.INSTANCE.i(AFh1vSDK.CACHE, new StringBuilder("resending request: ").append(aFb1kSDK.AFAdRevenueData).toString());
            try {
                AFh1hSDK aFh1hSDK = new AFh1hSDK(getMonetizationNetwork(aFb1kSDK), aFb1kSDK.getMonetizationNetwork(), aFb1kSDK.getRevenue, aFb1kSDK.getCurrencyIso4217Code);
                AFe1aSDK aFe1aSDK = this.component4;
                aFe1aSDK.AFAdRevenueData.execute(aFe1aSDK.new AnonymousClass2(new AFf1dSDK(aFh1hSDK, this.component3)));
            } catch (Exception e) {
                AFLogger.INSTANCE.e(AFh1vSDK.QUEUE, "Failed to resend cached request", e);
            }
        }
        this.areAllFieldsValid = Boolean.TRUE;
        component1 = true;
        return AFe1cSDK.SUCCESS;
    }

    private static String getMonetizationNetwork(AFb1kSDK aFb1kSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long parseLong = Long.parseLong(aFb1kSDK.getRevenue, 10);
        String str = aFb1kSDK.AFAdRevenueData;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE).appendQueryParameter("timeincache", String.valueOf((currentTimeMillis - parseLong) / 1000)).toString();
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e);
            return str;
        }
    }
}
