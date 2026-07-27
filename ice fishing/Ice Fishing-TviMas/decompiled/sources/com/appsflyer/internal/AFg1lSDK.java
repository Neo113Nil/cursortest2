package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* loaded from: classes4.dex */
public final class AFg1lSDK extends AFa1oSDK {
    @Override // com.appsflyer.internal.AFa1oSDK
    public final boolean areAllFieldsValid() {
        return false;
    }

    public AFg1lSDK(Context context) {
        super("Register", new StringBuilder().append(String.format(AFg1jSDK.getMediationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName())).append(context.getPackageName()).toString(), Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFa1oSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        return AFf1zSDK.REGISTER;
    }
}
