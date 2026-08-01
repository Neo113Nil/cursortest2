package com.google.android.datatransport;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAdRevenue;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowAlgorithmComponent implements Runnable {
    public final /* synthetic */ ActivityHandler WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ AdjustAdRevenue WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowAlgorithmComponent(ActivityHandler activityHandler, AdjustAdRevenue adjustAdRevenue, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = activityHandler;
        this.WinterFlowUnitTestResponse = adjustAdRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        AdjustAdRevenue adjustAdRevenue = this.WinterFlowUnitTestResponse;
        ActivityHandler activityHandler = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$trackAdRevenue$41(adjustAdRevenue);
                break;
            default:
                activityHandler.lambda$trackAdRevenue$40(adjustAdRevenue);
                break;
        }
    }
}
