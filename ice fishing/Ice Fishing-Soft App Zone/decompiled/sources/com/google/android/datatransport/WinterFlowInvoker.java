package com.google.android.datatransport;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAttributionReadListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInvoker implements Runnable {
    public final /* synthetic */ OnAttributionReadListener WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ ActivityHandler WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowInvoker(ActivityHandler activityHandler, OnAttributionReadListener onAttributionReadListener, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowUnitTestResponse = activityHandler;
        this.WinterFlowTransactionManagerStrategy = onAttributionReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustAttribution adjustAttribution;
        AdjustAttribution adjustAttribution2;
        int i = this.WinterFlowVariableVersionControl;
        ActivityHandler activityHandler = this.WinterFlowUnitTestResponse;
        OnAttributionReadListener onAttributionReadListener = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                adjustAttribution = activityHandler.attribution;
                onAttributionReadListener.onAttributionRead(adjustAttribution);
                break;
            default:
                adjustAttribution2 = activityHandler.attribution;
                onAttributionReadListener.onAttributionRead(adjustAttribution2);
                break;
        }
    }
}
