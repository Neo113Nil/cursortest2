package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1aSDK;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.Unit;

/* loaded from: classes.dex */
final class AFb1iSDK implements Application.ActivityLifecycleCallbacks {
    private final AFi1oSDK AFAdRevenueData;
    private final Runnable areAllFieldsValid;
    private ScheduledFuture<?> component4;
    private final ScheduledExecutorService getCurrencyIso4217Code;
    private volatile boolean getMediationNetwork;
    private final AFa1mSDK getMonetizationNetwork;
    final AFb1aSDK.AFa1tSDK getRevenue;

    public AFb1iSDK(ScheduledExecutorService scheduledExecutorService, AFa1mSDK aFa1mSDK, AFi1oSDK aFi1oSDK, AFb1aSDK.AFa1tSDK aFa1tSDK) {
        scheduledExecutorService.getClass();
        aFa1mSDK.getClass();
        aFi1oSDK.getClass();
        aFa1tSDK.getClass();
        this.getCurrencyIso4217Code = scheduledExecutorService;
        this.getMonetizationNetwork = aFa1mSDK;
        this.AFAdRevenueData = aFi1oSDK;
        this.getRevenue = aFa1tSDK;
        this.areAllFieldsValid = new AFb1iSDK$$ExternalSyntheticLambda0(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFb1iSDK aFb1iSDK) {
        Object failure;
        aFb1iSDK.getClass();
        aFb1iSDK.getMediationNetwork = false;
        try {
            Result.Companion companion = Result.Companion;
            aFb1iSDK.getRevenue.getMediationNetwork();
            failure = Unit.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", m4120exceptionOrNullimpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFb1iSDK aFb1iSDK, AFh1qSDK aFh1qSDK) {
        Object failure;
        aFb1iSDK.getClass();
        aFh1qSDK.getClass();
        try {
            Result.Companion companion = Result.Companion;
            aFb1iSDK.getRevenue.getRevenue(aFh1qSDK);
            failure = Unit.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            AFLogger.afErrorLog("Listener thrown an exception: ", m4120exceptionOrNullimpl, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        AFa1mSDK aFa1mSDK = this.getMonetizationNetwork;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1mSDK.AFAdRevenueData) {
            aFa1mSDK.AFAdRevenueData = intent;
        }
        this.AFAdRevenueData.getMonetizationNetwork(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        if (this.getMediationNetwork) {
            ScheduledExecutorService scheduledExecutorService = this.getCurrencyIso4217Code;
            Runnable runnable = this.areAllFieldsValid;
            AFb1aSDK.Companion companion = AFb1aSDK.INSTANCE;
            this.component4 = scheduledExecutorService.schedule(runnable, AFb1aSDK.Companion.getMediationNetwork(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        if (!this.getMediationNetwork) {
            this.getMediationNetwork = true;
            this.getCurrencyIso4217Code.execute(new AFb1iSDK$$ExternalSyntheticLambda1(0, this, new AFh1qSDK(activity, this.AFAdRevenueData)));
        } else {
            ScheduledFuture<?> scheduledFuture = this.component4;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
