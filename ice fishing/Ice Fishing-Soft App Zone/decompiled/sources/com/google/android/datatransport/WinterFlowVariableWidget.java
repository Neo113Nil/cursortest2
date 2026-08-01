package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVariableWidget extends WinterFlowNodeInheritance implements WinterFlowControllerScript {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ int WinterFlowSyntax = 1;
    public /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowVariableWidget(WinterFlowStrategyResolver winterFlowStrategyResolver, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(3, winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = winterFlowStrategyResolver;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerScript
    public final Object WinterFlowArrayNetwork(Object obj, Object obj2, Object obj3) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowVariableWidget((WinterFlowStrategyResolver) this.WinterFlowTransactionAgent, (WinterFlowTransactionManagerLayer) obj3).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                ((Boolean) obj2).getClass();
                WinterFlowVariableWidget winterFlowVariableWidget = new WinterFlowVariableWidget(3, (WinterFlowTransactionManagerLayer) obj3);
                winterFlowVariableWidget.WinterFlowTransactionAgent = (WinterFlowVersionNetwork) obj;
                return winterFlowVariableWidget.WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowStrategyResolver winterFlowStrategyResolver = (WinterFlowStrategyResolver) this.WinterFlowTransactionAgent;
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowStrategyResolver.WinterFlowRouterStructure(this) == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i2 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            default:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 != 0) {
                    if (i3 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return obj;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowVersionNetwork winterFlowVersionNetwork = (WinterFlowVersionNetwork) this.WinterFlowTransactionAgent;
                this.WinterFlowResponseEngine = 1;
                winterFlowVersionNetwork.getClass();
                Object WinterFlowRouterStructure = WinterFlowVersionNetwork.WinterFlowRouterStructure(winterFlowVersionNetwork, this);
                return WinterFlowRouterStructure == winterFlowListenerJava ? winterFlowListenerJava : WinterFlowRouterStructure;
        }
    }

    public /* synthetic */ WinterFlowVariableWidget(int i, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(i, winterFlowTransactionManagerLayer);
    }
}
