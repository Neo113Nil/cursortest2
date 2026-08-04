package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1lSDK extends AFa1oSDK {
    public AFg1lSDK(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFg1jSDK.getMediationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()));
        sb.append(context.getPackageName());
        super("Register", sb.toString(), Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFa1oSDK
    public final boolean areAllFieldsValid() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1oSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        return AFf1zSDK.REGISTER;
    }
}
