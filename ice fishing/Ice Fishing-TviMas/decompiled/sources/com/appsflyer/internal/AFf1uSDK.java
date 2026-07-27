package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* loaded from: classes4.dex */
public final class AFf1uSDK extends AFf1oSDK<String> {
    private final String component3;
    private final AFd1qSDK copy;
    private final AFk1wSDK copydefault;

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    public AFf1uSDK(AFd1kSDK aFd1kSDK, String str, AFk1wSDK aFk1wSDK) {
        super(AFf1zSDK.IMPRESSIONS, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, str);
        this.component3 = str;
        this.copydefault = aFk1wSDK;
        this.copy = aFd1kSDK.getMediationNetwork();
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final AFe1tSDK<String> getMediationNetwork(String str) {
        String obj;
        AFe1qSDK aFe1qSDK = ((AFf1oSDK) this).component2;
        String monetizationNetwork = this.copy.getMonetizationNetwork();
        if (AFc1sSDK.getRevenue(monetizationNetwork)) {
            obj = this.component3;
        } else {
            obj = Uri.parse(this.component3).buildUpon().appendQueryParameter("advertising_id", monetizationNetwork).build().toString();
        }
        return aFe1qSDK.getMonetizationNetwork(obj);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        super.getRevenue();
        AFe1kSDK<Result> aFe1kSDK = ((AFf1oSDK) this).component4;
        if (aFe1kSDK != 0) {
            int statusCode = aFe1kSDK.getStatusCode();
            if (statusCode == 200) {
                AFLogger.afInfoLog(new StringBuilder("Cross promotion impressions success: ").append(this.component3).toString(), false);
                return;
            }
            if (statusCode == 301 || statusCode == 302) {
                AFLogger.afInfoLog(new StringBuilder("Cross promotion redirection success: ").append(this.component3).toString(), false);
                String revenue = aFe1kSDK.getRevenue("Location");
                AFk1wSDK aFk1wSDK = this.copydefault;
                if (aFk1wSDK == null || revenue == null) {
                    return;
                }
                aFk1wSDK.getMediationNetwork = revenue;
                AFk1wSDK aFk1wSDK2 = this.copydefault;
                Context context = aFk1wSDK2.getRevenue.get();
                if (context != null) {
                    try {
                        if (aFk1wSDK2.getMediationNetwork != null) {
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFk1wSDK2.getMediationNetwork)).setFlags(268435456));
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e)), e);
                        return;
                    }
                }
                return;
            }
            AFLogger.afInfoLog(new StringBuilder("call to ").append(this.component3).append(" failed: ").append(statusCode).toString());
        }
    }
}
