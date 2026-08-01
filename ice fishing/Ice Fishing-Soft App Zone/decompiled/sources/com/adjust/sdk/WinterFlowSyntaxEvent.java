package com.adjust.sdk;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxEvent implements Runnable {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ ActivityHandler WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowSyntaxEvent(ActivityHandler activityHandler, Object obj, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowUnitTestResponse = activityHandler;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityState activityState;
        ActivityState activityState2;
        AdjustConfig adjustConfig;
        AdjustConfig adjustConfig2;
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        ActivityHandler activityHandler = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityState = activityHandler.activityState;
                ((OnAdidReadListener) obj).onAdidRead(activityState.adid);
                break;
            case 1:
                activityState2 = activityHandler.activityState;
                ((OnAdidReadListener) obj).onAdidRead(activityState2.adid);
                break;
            default:
                adjustConfig = activityHandler.adjustConfig;
                if (adjustConfig.onRemoteTriggerListener != null) {
                    adjustConfig2 = activityHandler.adjustConfig;
                    adjustConfig2.onRemoteTriggerListener.onRemoteTrigger((AdjustRemoteTrigger) obj);
                    break;
                }
                break;
        }
    }
}
