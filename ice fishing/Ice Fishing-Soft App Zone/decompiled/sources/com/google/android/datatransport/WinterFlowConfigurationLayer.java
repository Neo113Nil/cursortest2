package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConfigurationLayer implements WinterFlowUserManagerNetwork {
    public final WinterFlowRendererNode WinterFlowRouterRouter = new WinterFlowRendererNode(new WinterFlowAPISystem(12, this));
    public final String WinterFlowTransactionManagerStrategy;
    public final WinterFlowEventEvent WinterFlowUnitTestResponse;
    public final WinterFlowViewInterface WinterFlowVariableVersionControl;

    public WinterFlowConfigurationLayer(WinterFlowViewInterface winterFlowViewInterface, String str, WinterFlowEventEvent winterFlowEventEvent) {
        this.WinterFlowVariableVersionControl = winterFlowViewInterface;
        this.WinterFlowTransactionManagerStrategy = str;
        this.WinterFlowUnitTestResponse = winterFlowEventEvent;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerNetwork
    public final Object WinterFlowVariableBandwidth(boolean z, WinterFlowEventEvent winterFlowEventEvent, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowCacheEngine winterFlowCacheEngine = (WinterFlowCacheEngine) winterFlowOrchestrationCompiler.getContext().WinterFlowConsumerUserManager(WinterFlowCacheEngine.WinterFlowTransactionManagerStrategy);
        WinterFlowHookPlatform winterFlowHookPlatform = winterFlowCacheEngine != null ? winterFlowCacheEngine.WinterFlowVariableVersionControl : null;
        if (winterFlowHookPlatform != null) {
            return winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowHookPlatform, winterFlowOrchestrationCompiler);
        }
        WinterFlowHookPlatform winterFlowHookPlatform2 = new WinterFlowHookPlatform(this.WinterFlowUnitTestResponse, (WinterFlowDeserializationHandler) this.WinterFlowRouterRouter.getValue());
        return WinterFlowCacheRuntime.WinterFlowModuleAgent(new WinterFlowCacheEngine(winterFlowHookPlatform2), new WinterFlowModuleStack(winterFlowEventEvent, winterFlowHookPlatform2, null, 21), winterFlowOrchestrationCompiler);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        WinterFlowRendererNode winterFlowRendererNode = this.WinterFlowRouterRouter;
        if (winterFlowRendererNode.WinterFlowTransactionManagerStrategy != WinterFlowCacheUtility.WinterFlowCompilerHandler) {
            ((WinterFlowDeserializationHandler) winterFlowRendererNode.getValue()).close();
        }
    }
}
