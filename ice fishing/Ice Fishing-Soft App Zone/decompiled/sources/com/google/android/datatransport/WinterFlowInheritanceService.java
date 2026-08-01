package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInheritanceService extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowAlgorithmSyntax WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowInheritanceService(WinterFlowAlgorithmSyntax winterFlowAlgorithmSyntax, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = winterFlowAlgorithmSyntax;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSyntax winterFlowAlgorithmSyntax = this.WinterFlowTransactionAgent;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowInheritanceService(winterFlowAlgorithmSyntax, winterFlowTransactionManagerLayer, 0);
            default:
                return new WinterFlowInheritanceService(winterFlowAlgorithmSyntax, winterFlowTransactionManagerLayer, 1);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSyntax winterFlowAlgorithmSyntax = this.WinterFlowTransactionAgent;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = winterFlowAlgorithmSyntax.WinterFlowVariableVersionControl;
                    this.WinterFlowResponseEngine = 1;
                    Object WinterFlowVariableVersionControl = winterFlowSyntaxTransactionManager.WinterFlowConfigurationSubsystem.WinterFlowVariableVersionControl(this);
                    if (WinterFlowVariableVersionControl != winterFlowListenerJava) {
                        WinterFlowVariableVersionControl = winterFlowAlgorithmSession;
                    }
                    if (WinterFlowVariableVersionControl == winterFlowListenerJava) {
                        break;
                    }
                } else if (i2 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                break;
            default:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager2 = winterFlowAlgorithmSyntax.WinterFlowVariableVersionControl;
                    this.WinterFlowResponseEngine = 1;
                    Object WinterFlowRouterStructure = winterFlowSyntaxTransactionManager2.WinterFlowStrategyTool.WinterFlowRouterStructure(this);
                    if (WinterFlowRouterStructure != winterFlowListenerJava) {
                        WinterFlowRouterStructure = winterFlowAlgorithmSession;
                    }
                    if (WinterFlowRouterStructure == winterFlowListenerJava) {
                        break;
                    }
                } else if (i3 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                break;
        }
        return winterFlowListenerJava;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) obj;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = (WinterFlowTransactionManagerLayer) obj2;
        switch (i) {
        }
        return ((WinterFlowInheritanceService) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowAdapterResponse)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
    }
}
