package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowConsumerResponse implements WinterFlowObjectUI {
    public final /* synthetic */ WinterFlowFunctionSubsystem WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowConsumerResponse(WinterFlowFunctionSubsystem winterFlowFunctionSubsystem, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowFunctionSubsystem;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowFunctionSubsystem winterFlowFunctionSubsystem = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowFunctionSubsystem.WinterFlowResponseEngine = false;
                break;
            default:
                winterFlowFunctionSubsystem.WinterFlowResponseEngine = false;
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
