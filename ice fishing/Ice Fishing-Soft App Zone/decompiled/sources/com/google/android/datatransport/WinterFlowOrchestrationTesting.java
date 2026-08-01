package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowOrchestrationTesting extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ int WinterFlowSyntax;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowOrchestrationTesting(int i, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i2) {
        super(i, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i2;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        switch (this.WinterFlowSyntax) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowOrchestrationTesting(2, winterFlowTransactionManagerLayer, 0);
            case 1:
                return new WinterFlowOrchestrationTesting(2, winterFlowTransactionManagerLayer, 1);
            default:
                return new WinterFlowOrchestrationTesting(2, winterFlowTransactionManagerLayer, 2);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                break;
            case 1:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                break;
            default:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                break;
        }
        return winterFlowAlgorithmSession;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                ((WinterFlowOrchestrationTesting) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowEventProvider) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                break;
            default:
                ((WinterFlowOrchestrationTesting) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowCacheInterface) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
