package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowMicroserviceRequest implements WinterFlowObjectSession {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowMicroserviceRequest(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        Object obj2 = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowRuntimeEngine winterFlowRuntimeEngine = (WinterFlowRuntimeEngine) obj;
                ((WinterFlowEventEvent) obj2).WinterFlowVariableVersionControl(winterFlowRuntimeEngine.WinterFlowVariableVersionControl.getValue(), ((WinterFlowObjectSession) WinterFlowEncryptionSubsystem.WinterFlowRouterAdapter.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(winterFlowRuntimeEngine.WinterFlowTransactionManagerStrategy));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            default:
                return new WinterFlowBandwidthSoftware(8, (WinterFlowHandlerInvoker) obj2);
        }
    }
}
