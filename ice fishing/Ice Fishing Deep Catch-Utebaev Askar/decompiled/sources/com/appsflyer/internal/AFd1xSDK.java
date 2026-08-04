package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1xSDK implements AFd1wSDK {
    private AFd1uSDK AFAdRevenueData;
    private final AFc1kSDK getCurrencyIso4217Code;
    private final ScheduledExecutorService getMediationNetwork;
    private final AFi1mSDK getMonetizationNetwork;
    private final Executor getRevenue;

    public AFd1xSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFc1kSDK aFc1kSDK, AFi1mSDK aFi1mSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFi1mSDK, "");
        this.getRevenue = executor;
        this.getMediationNetwork = scheduledExecutorService;
        this.getCurrencyIso4217Code = aFc1kSDK;
        this.getMonetizationNetwork = aFi1mSDK;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final void AFAdRevenueData() {
        AFd1wSDK.AFa1tSDK aFa1tSDK;
        AFd1uSDK aFd1uSDK = this.AFAdRevenueData;
        if (aFd1uSDK == null || (aFa1tSDK = aFd1uSDK.getRevenue) == null) {
            return;
        }
        aFa1tSDK.getRevenue();
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final boolean getMediationNetwork() {
        return this.AFAdRevenueData != null;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final void getRevenue(Context context, AFd1wSDK.AFa1tSDK aFa1tSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1tSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.AFAdRevenueData != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.c(applicationContext, "");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
        this.AFAdRevenueData = null;
        AFd1uSDK aFd1uSDK = new AFd1uSDK(this.getRevenue, this.getMediationNetwork, this.getCurrencyIso4217Code, this.getMonetizationNetwork, aFa1tSDK);
        this.AFAdRevenueData = aFd1uSDK;
        if (context instanceof Activity) {
            aFd1uSDK.onActivityResumed((Activity) context);
        }
        Application applicationF_ = AFb1qSDK.f_(context);
        if (applicationF_ != null) {
            applicationF_.registerActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
    }
}
