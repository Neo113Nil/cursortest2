package com.google.android.datatransport;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustPlayStorePurchase;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowPipelineSoftware implements Runnable {
    public final /* synthetic */ OnPurchaseVerificationFinishedListener WinterFlowRouterRouter;
    public final /* synthetic */ ActivityHandler WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ AdjustPlayStorePurchase WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowPipelineSoftware(ActivityHandler activityHandler, AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = activityHandler;
        this.WinterFlowUnitTestResponse = adjustPlayStorePurchase;
        this.WinterFlowRouterRouter = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener = this.WinterFlowRouterRouter;
        AdjustPlayStorePurchase adjustPlayStorePurchase = this.WinterFlowUnitTestResponse;
        ActivityHandler activityHandler = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$verifyPlayStorePurchase$44(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
                break;
            default:
                activityHandler.lambda$verifyPlayStorePurchase$45(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
                break;
        }
    }
}
