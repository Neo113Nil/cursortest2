package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.lvl.AppsFlyerLVL;

/* loaded from: classes4.dex */
public final class AFg1uSDK {

    interface AFa1vSDK {
        void AFAdRevenueData(String str, String str2);

        void getCurrencyIso4217Code(String str, Exception exc);
    }

    public final boolean getMediationNetwork(long j, Context context, final AFa1vSDK aFa1vSDK) {
        try {
            AppsFlyerLVL.checkLicense(j, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFg1uSDK.4
                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1vSDK.AFAdRevenueData(str, str2);
                    } else if (str2 == null) {
                        aFa1vSDK.getCurrencyIso4217Code("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1vSDK.getCurrencyIso4217Code("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }

                public final void onLvlFailure(Exception exc) {
                    aFa1vSDK.getCurrencyIso4217Code("onLvlFailure with exception", exc);
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
