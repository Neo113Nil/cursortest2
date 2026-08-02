package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import androidx.work.impl.Processor$$ExternalSyntheticLambda1;
import androidx.work.impl.Schedulers$$ExternalSyntheticLambda1;
import bo.app.q4$$ExternalSyntheticLambda0;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1tSDK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import papa.internal.Perfs$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class AFj1sSDK {
    public final AFd1zSDK getCurrencyIso4217Code;
    public final CopyOnWriteArrayList<AFj1tSDK> getRevenue = new CopyOnWriteArrayList<>();

    public AFj1sSDK(AFd1zSDK aFd1zSDK) {
        this.getCurrencyIso4217Code = aFd1zSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(Runnable runnable) {
        this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new q4$$ExternalSyntheticLambda0(13, this, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void areAllFieldsValid(Runnable runnable) {
        AFj1ySDK aFj1ySDK = new AFj1ySDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1zSDK.INSTAGRAM, runnable, new AFj1sSDK$$ExternalSyntheticLambda1(this, runnable, 2));
        this.getRevenue.add(aFj1ySDK);
        aFj1ySDK.getMonetizationNetwork(this.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
        List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
        if (queryIntentContentProviders == null || queryIntentContentProviders.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
        while (it.hasNext()) {
            ProviderInfo providerInfo = it.next().providerInfo;
            if (providerInfo != null) {
                arrayList.add(new AFj1uSDK(providerInfo, runnable, aFd1zSDK));
            } else {
                AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.getRevenue.addAll(arrayList);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
        StringBuilder sb = new StringBuilder("Detected ");
        sb.append(arrayList.size());
        sb.append(" valid preinstall provider(s)");
        aFLogger.d(aFg1cSDK, sb.toString());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AFj1tSDK) it2.next()).getMonetizationNetwork(aFd1zSDK.AFInAppEventParameterName().getMonetizationNetwork);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(Runnable runnable) {
        try {
            if (getMediationNetwork(new AFh1kSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public final AFi1aSDK getCurrencyIso4217Code(Runnable runnable) {
        return new AFi1aSDK(new AFj1sSDK$$ExternalSyntheticLambda1(this, runnable, 1), this.getCurrencyIso4217Code.getMonetizationNetwork(), this.getCurrencyIso4217Code.AFAdRevenueData());
    }

    public final void getRevenue(Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
        if (aFd1zSDK.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0) > 0) {
            AFLogger.INSTANCE.d(AFg1cSDK.PREINSTALL, "Preinstall referrer will not load, the counter >= 1, ");
        } else {
            aFd1zSDK.getMonetizationNetwork().execute(new Schedulers$$ExternalSyntheticLambda1(this, context, runnable, aFd1zSDK, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFAdRevenueData() {
    }

    public final Runnable AFAdRevenueData(AFi1aSDK aFi1aSDK, Runnable runnable) {
        return new Processor$$ExternalSyntheticLambda1(5, this, aFi1aSDK, runnable);
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork("AF_PREINSTALL_DISABLED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Runnable runnable) {
        AFj1ySDK aFj1ySDK = new AFj1ySDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1zSDK.FACEBOOK_LITE, runnable, new Perfs$$ExternalSyntheticLambda0(2));
        this.getRevenue.add(aFj1ySDK);
        aFj1ySDK.getMonetizationNetwork(this.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork);
    }

    public final void getMediationNetwork(Runnable runnable) {
        this.getRevenue.add(new AFj1ySDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1zSDK.FACEBOOK, runnable, new AFj1sSDK$$ExternalSyntheticLambda1(this, runnable, 0)));
    }

    public final boolean getMediationNetwork(AFh1mSDK aFh1mSDK) {
        int revenue = this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0);
        return (!this.getCurrencyIso4217Code.component4().getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false) && revenue == 1) || (revenue == 1 && !(aFh1mSDK instanceof AFh1kSDK));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFi1aSDK aFi1aSDK, Runnable runnable) {
        AFc1qSDK component4 = this.getCurrencyIso4217Code.component4();
        int revenue = this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0);
        boolean mediationNetwork = component4.getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false);
        boolean z = aFi1aSDK.component4 == AFj1tSDK.AFa1tSDK.NOT_STARTED;
        if (revenue == 1) {
            if (z || mediationNetwork) {
                runnable.run();
            }
        }
    }

    public final boolean getMediationNetwork() {
        Iterator<AFj1tSDK> it = this.getRevenue.iterator();
        while (it.hasNext()) {
            if (it.next().component4 == AFj1tSDK.AFa1tSDK.STARTED) {
                return false;
            }
        }
        return true;
    }
}
