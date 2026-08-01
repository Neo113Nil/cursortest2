package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionTool extends WinterFlowFrameworkController implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowAPIVersionControl WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowDeploymentEngine WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowCompilerCloud WinterFlowServerProtocol;
    public final /* synthetic */ WinterFlowXMLArray WinterFlowSyntax;
    public final /* synthetic */ WinterFlowDeploymentEngine WinterFlowTransactionAgent;
    public int WinterFlowTransactionManagerStrategy;
    public /* synthetic */ Object WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowSessionTool(WinterFlowDeploymentEngine winterFlowDeploymentEngine, WinterFlowXMLArray winterFlowXMLArray, WinterFlowAPIVersionControl winterFlowAPIVersionControl, WinterFlowDeploymentEngine winterFlowDeploymentEngine2, WinterFlowCompilerCloud winterFlowCompilerCloud, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowRouterRouter = winterFlowDeploymentEngine;
        this.WinterFlowSyntax = winterFlowXMLArray;
        this.WinterFlowResponseEngine = winterFlowAPIVersionControl;
        this.WinterFlowTransactionAgent = winterFlowDeploymentEngine2;
        this.WinterFlowServerProtocol = winterFlowCompilerCloud;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowSessionTool winterFlowSessionTool = new WinterFlowSessionTool(this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, winterFlowTransactionManagerLayer);
        winterFlowSessionTool.WinterFlowUnitTestResponse = obj;
        return winterFlowSessionTool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (com.google.android.datatransport.WinterFlowSessionParser.WinterFlowCacheManagerAgent(r5, (com.google.android.datatransport.WinterFlowObjectSystem) r14, r13.WinterFlowRouterRouter, r13.WinterFlowSyntax, r13.WinterFlowResponseEngine, r13.WinterFlowTransactionAgent, r13.WinterFlowServerProtocol, r13) == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r14 == r4) goto L16;
     */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowRouterRefactoring winterFlowRouterRefactoring;
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            winterFlowRouterRefactoring = (WinterFlowRouterRefactoring) this.WinterFlowUnitTestResponse;
            this.WinterFlowUnitTestResponse = winterFlowRouterRefactoring;
            this.WinterFlowTransactionManagerStrategy = 1;
            obj = WinterFlowMicroserviceWidget.WinterFlowRouterStructure(winterFlowRouterRefactoring, WinterFlowJSONSerializer.WinterFlowVariableVersionControl, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            winterFlowRouterRefactoring = (WinterFlowRouterRefactoring) this.WinterFlowUnitTestResponse;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        }
        WinterFlowRouterRefactoring winterFlowRouterRefactoring2 = winterFlowRouterRefactoring;
        this.WinterFlowUnitTestResponse = null;
        this.WinterFlowTransactionManagerStrategy = 2;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowSessionTool) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowRouterRefactoring) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
