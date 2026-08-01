package com.google.android.datatransport;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustDeeplink;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowXMLValidator implements Runnable {
    public final /* synthetic */ long WinterFlowRouterRouter;
    public final /* synthetic */ ActivityHandler WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ AdjustDeeplink WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowXMLValidator(ActivityHandler activityHandler, AdjustDeeplink adjustDeeplink, long j, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = activityHandler;
        this.WinterFlowUnitTestResponse = adjustDeeplink;
        this.WinterFlowRouterRouter = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        long j = this.WinterFlowRouterRouter;
        AdjustDeeplink adjustDeeplink = this.WinterFlowUnitTestResponse;
        ActivityHandler activityHandler = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$processDeeplink$13(adjustDeeplink, j);
                break;
            case 1:
                activityHandler.lambda$processDeeplink$12(adjustDeeplink, j);
                break;
            case 2:
                activityHandler.lambda$processAndResolveDeeplink$14(adjustDeeplink, j);
                break;
            default:
                activityHandler.lambda$processAndResolveDeeplink$15(adjustDeeplink, j);
                break;
        }
    }
}
