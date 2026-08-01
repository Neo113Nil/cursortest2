package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDESystem extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowRendererRefactoring WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowIDESystem(WinterFlowRendererRefactoring winterFlowRendererRefactoring, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = winterFlowRendererRefactoring;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        switch (this.WinterFlowSyntax) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowIDESystem(this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, 0);
            default:
                return new WinterFlowIDESystem(this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, 1);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowRendererRefactoring winterFlowRendererRefactoring = this.WinterFlowTransactionAgent;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    Float f = new Float(1.0f);
                    WinterFlowManagerService WinterFlowCompilerDataSource = WinterFlowUnitTestLibrary.WinterFlowCompilerDataSource(3500, 2, WinterFlowServerComponent.WinterFlowRouterStructure);
                    this.WinterFlowResponseEngine = 1;
                    if (WinterFlowRendererRefactoring.WinterFlowRouterStructure(winterFlowRendererRefactoring, f, WinterFlowCompilerDataSource, this) == winterFlowListenerJava) {
                        break;
                    }
                } else if (i2 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                break;
            default:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    Float f2 = new Float(1.0f);
                    WinterFlowManagerService WinterFlowCompilerDataSource2 = WinterFlowUnitTestLibrary.WinterFlowCompilerDataSource(4000, 2, WinterFlowServerComponent.WinterFlowRouterStructure);
                    this.WinterFlowResponseEngine = 1;
                    if (WinterFlowRendererRefactoring.WinterFlowRouterStructure(winterFlowRendererRefactoring, f2, WinterFlowCompilerDataSource2, this) == winterFlowListenerJava) {
                        break;
                    }
                } else if (i3 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
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
        return ((WinterFlowIDESystem) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowAdapterResponse)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
    }
}
