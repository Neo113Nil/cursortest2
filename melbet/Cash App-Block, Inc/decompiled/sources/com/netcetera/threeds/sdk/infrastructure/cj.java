package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes5.dex */
public class cj {
    private static int ThreeDS2ServiceInitializationCallback = 0;
    private static int getSDKInfo = 1;
    private final com.netcetera.threeds.sdk.api.ui.ProgressView ThreeDS2Service;
    private final fx ThreeDS2ServiceInstance;
    private final mj<Activity> createTransaction;
    private final setMaxLines get;
    private final Activity getWarnings;
    private final ju initialize;

    public cj(ju juVar, Activity activity, setMaxLines setmaxlines, fx fxVar, com.netcetera.threeds.sdk.api.ui.ProgressView progressView, mj<Activity> mjVar) {
        this.initialize = juVar;
        this.getWarnings = activity;
        this.get = setmaxlines;
        this.ThreeDS2ServiceInstance = fxVar;
        this.ThreeDS2Service = progressView;
        this.createTransaction = mjVar;
    }

    public forEach get(merge mergeVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        ci ciVar = (ci) ci.get(new Object[]{this.initialize, this.get, this.ThreeDS2ServiceInstance, this.ThreeDS2Service}, 802731800, -802731800, (int) System.currentTimeMillis());
        this.createTransaction.ThreeDS2ServiceInstance(this.getWarnings, ciVar);
        cg cgVar = new cg(mergeVar, ciVar, handler);
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 29) % 128;
        return cgVar;
    }
}
