package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConcurrencyMiddleware extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public /* synthetic */ Object WinterFlowResponseEngine;
    public final /* synthetic */ int WinterFlowSyntax;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowConcurrencyMiddleware(int i, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i2) {
        super(i, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i2;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        switch (this.WinterFlowSyntax) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowConcurrencyMiddleware winterFlowConcurrencyMiddleware = new WinterFlowConcurrencyMiddleware(2, winterFlowTransactionManagerLayer, 0);
                winterFlowConcurrencyMiddleware.WinterFlowResponseEngine = obj;
                return winterFlowConcurrencyMiddleware;
            case 1:
                WinterFlowConcurrencyMiddleware winterFlowConcurrencyMiddleware2 = new WinterFlowConcurrencyMiddleware(2, winterFlowTransactionManagerLayer, 1);
                winterFlowConcurrencyMiddleware2.WinterFlowResponseEngine = obj;
                return winterFlowConcurrencyMiddleware2;
            default:
                WinterFlowConcurrencyMiddleware winterFlowConcurrencyMiddleware3 = new WinterFlowConcurrencyMiddleware(2, winterFlowTransactionManagerLayer, 2);
                winterFlowConcurrencyMiddleware3.WinterFlowResponseEngine = obj;
                return winterFlowConcurrencyMiddleware3;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        switch (this.WinterFlowSyntax) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                return Boolean.valueOf(!(((WinterFlowValidatorBandwidth) this.WinterFlowResponseEngine) instanceof WinterFlowArrayTool));
            case 1:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                return Boolean.valueOf(((WinterFlowUserManagerSystem) this.WinterFlowResponseEngine) == WinterFlowUserManagerSystem.WinterFlowVariableVersionControl);
            default:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                return Boolean.valueOf(((WinterFlowTransactionManagerXML) this.WinterFlowResponseEngine) != WinterFlowTransactionManagerXML.WinterFlowVariableVersionControl);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowConcurrencyMiddleware) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowValidatorBandwidth) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 1:
                return ((WinterFlowConcurrencyMiddleware) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowUserManagerSystem) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return ((WinterFlowConcurrencyMiddleware) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowTransactionManagerXML) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }
}
