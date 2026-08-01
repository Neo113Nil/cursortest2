package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFunctionNode extends WinterFlowNodeInheritance implements WinterFlowObjectSession {
    public int WinterFlowResponseEngine;
    public Throwable WinterFlowSyntax;
    public final /* synthetic */ WinterFlowStrategyResolver WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowFunctionNode(WinterFlowStrategyResolver winterFlowStrategyResolver, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(1, winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = winterFlowStrategyResolver;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        Throwable th;
        WinterFlowValidatorBandwidth winterFlowValidatorBandwidth;
        int i = this.WinterFlowResponseEngine;
        WinterFlowStrategyResolver winterFlowStrategyResolver = this.WinterFlowTransactionAgent;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        try {
        } catch (Throwable th2) {
            WinterFlowDebugStrategy WinterFlowHookDataSource = winterFlowStrategyResolver.WinterFlowHookDataSource();
            this.WinterFlowSyntax = th2;
            this.WinterFlowResponseEngine = 2;
            Integer WinterFlowRouterStructure = WinterFlowHookDataSource.WinterFlowRouterStructure();
            if (WinterFlowRouterStructure != winterFlowListenerJava) {
                obj = WinterFlowRouterStructure;
                th = th2;
            }
        }
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            this.WinterFlowResponseEngine = 1;
            obj = winterFlowStrategyResolver.WinterFlowSyntax(true, this);
            if (obj == winterFlowListenerJava) {
                return winterFlowListenerJava;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = this.WinterFlowSyntax;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                winterFlowValidatorBandwidth = new WinterFlowDecoratorServiceProvider(th, ((Number) obj).intValue());
                return new WinterFlowServerPlatform(winterFlowValidatorBandwidth, Boolean.TRUE);
            }
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        }
        winterFlowValidatorBandwidth = (WinterFlowValidatorBandwidth) obj;
        return new WinterFlowServerPlatform(winterFlowValidatorBandwidth, Boolean.TRUE);
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        return new WinterFlowFunctionNode(this.WinterFlowTransactionAgent, (WinterFlowTransactionManagerLayer) obj).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
