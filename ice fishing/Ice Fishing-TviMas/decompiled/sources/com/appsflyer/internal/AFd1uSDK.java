package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1wSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
final class AFd1uSDK implements Application.ActivityLifecycleCallbacks {
    private final AFi1mSDK AFAdRevenueData;
    private boolean component2;
    private boolean component3;
    private final Executor getCurrencyIso4217Code;
    private final ScheduledExecutorService getMediationNetwork;
    private final AFc1kSDK getMonetizationNetwork;
    final AFd1wSDK.AFa1tSDK getRevenue;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    public AFd1uSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFc1kSDK aFc1kSDK, AFi1mSDK aFi1mSDK, AFd1wSDK.AFa1tSDK aFa1tSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFi1mSDK, "");
        Intrinsics.checkNotNullParameter(aFa1tSDK, "");
        this.getCurrencyIso4217Code = executor;
        this.getMediationNetwork = scheduledExecutorService;
        this.getMonetizationNetwork = aFc1kSDK;
        this.AFAdRevenueData = aFi1mSDK;
        this.getRevenue = aFa1tSDK;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final AFh1mSDK aFh1mSDK = new AFh1mSDK(activity, this.AFAdRevenueData);
        this.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1uSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFd1uSDK.getRevenue(AFd1uSDK.this, aFh1mSDK);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1uSDK aFd1uSDK, AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        if (!aFd1uSDK.component2) {
            try {
                aFd1uSDK.getRevenue.getMonetizationNetwork(aFh1mSDK);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
            }
        }
        aFd1uSDK.component3 = false;
        aFd1uSDK.component2 = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1uSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFd1uSDK.getMonetizationNetwork(AFd1uSDK.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(final AFd1uSDK aFd1uSDK) {
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        aFd1uSDK.component3 = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFd1uSDK.getMediationNetwork;
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFd1uSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.AFAdRevenueData(AFd1uSDK.this);
                }
            };
            AFd1wSDK.Companion companion = AFd1wSDK.INSTANCE;
            scheduledExecutorService.schedule(runnable, AFd1wSDK.Companion.getCurrencyIso4217Code(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1uSDK aFd1uSDK) {
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        if (aFd1uSDK.component2 && aFd1uSDK.component3) {
            aFd1uSDK.component2 = false;
            try {
                aFd1uSDK.getRevenue.getRevenue();
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFc1kSDK aFc1kSDK = this.getMonetizationNetwork;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFc1kSDK.getRevenue) {
            aFc1kSDK.getRevenue = intent;
        }
        this.AFAdRevenueData.AFAdRevenueData(activity);
    }
}
