package com.google.android.datatransport;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowListenerTransactionManager implements Runnable {
    public final /* synthetic */ OnPurchaseVerificationFinishedListener WinterFlowRouterRouter;
    public final /* synthetic */ ActivityHandler WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ AdjustEvent WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowListenerTransactionManager(ActivityHandler activityHandler, AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = activityHandler;
        this.WinterFlowUnitTestResponse = adjustEvent;
        this.WinterFlowRouterRouter = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener = this.WinterFlowRouterRouter;
        AdjustEvent adjustEvent = this.WinterFlowUnitTestResponse;
        ActivityHandler activityHandler = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$verifyAndTrackPlayStorePurchase$46(adjustEvent, onPurchaseVerificationFinishedListener);
                break;
            default:
                activityHandler.lambda$verifyAndTrackPlayStorePurchase$47(adjustEvent, onPurchaseVerificationFinishedListener);
                break;
        }
    }
}
