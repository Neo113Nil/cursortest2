package com.google.android.datatransport;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDataSourceResolver extends WinterFlowSchedulerSession {
    public WinterFlowEventEvent WinterFlowArrayNetwork;
    public final WinterFlowAdapterResponse WinterFlowCacheManagerAgent;
    public WinterFlowPipelineObject WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public WinterFlowWorkerThreadPool WinterFlowVariableVersionControl;

    public WinterFlowDataSourceResolver(WinterFlowAdapterResponse winterFlowAdapterResponse, WinterFlowProviderHook winterFlowProviderHook) {
        super(winterFlowProviderHook);
        this.WinterFlowCacheManagerAgent = winterFlowAdapterResponse;
        this.WinterFlowArrayNetwork = new WinterFlowOrchestrationTesting(2, null, 1);
    }

    public final void WinterFlowResponseEngine(boolean z) {
        WinterFlowPipelineObject winterFlowPipelineObject;
        if (!z && super.WinterFlowArrayNetwork() && (winterFlowPipelineObject = this.WinterFlowTransactionManagerStrategy) != null && !winterFlowPipelineObject.WinterFlowHookDataSource()) {
            WinterFlowVariableVersionControl();
        }
        ((WinterFlowQueueComponent) this.WinterFlowRouterStructure).WinterFlowArrayNetwork(z);
        ((WinterFlowVariableProcess) this.WinterFlowHookDataSource).WinterFlowTransactionManagerStrategy(z);
    }

    @Override // com.google.android.datatransport.WinterFlowSchedulerSession
    public final void WinterFlowRouterRouter() {
        WinterFlowVariableVersionControl();
        if (super.WinterFlowArrayNetwork()) {
            this.WinterFlowUnitTestResponse = true;
            this.WinterFlowVariableVersionControl = WinterFlowHandlerWebsocket.WinterFlowRouterStructure(-2, 4, WinterFlowDataSourceHandler.WinterFlowVariableVersionControl);
            this.WinterFlowTransactionManagerStrategy = WinterFlowCacheRuntime.WinterFlowStrategyTool(this.WinterFlowCacheManagerAgent, null, new WinterFlowModuleStack(this, null, 6), 3);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowSchedulerSession
    public final void WinterFlowTransactionManagerStrategy() {
        if (this.WinterFlowVariableVersionControl != null && !this.WinterFlowUnitTestResponse) {
            WinterFlowVariableVersionControl();
        }
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        if (this.WinterFlowVariableVersionControl == null) {
            this.WinterFlowUnitTestResponse = false;
            this.WinterFlowVariableVersionControl = WinterFlowHandlerWebsocket.WinterFlowRouterStructure(-2, 4, WinterFlowDataSourceHandler.WinterFlowVariableVersionControl);
            this.WinterFlowTransactionManagerStrategy = WinterFlowCacheRuntime.WinterFlowStrategyTool(this.WinterFlowCacheManagerAgent, null, new WinterFlowModuleStack(this, winterFlowTransactionManagerLayer, 6), 3);
        }
        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this.WinterFlowVariableVersionControl;
        if (winterFlowWorkerThreadPool != null) {
            winterFlowWorkerThreadPool.WinterFlowCacheManagerAgent(null, false);
        }
        this.WinterFlowUnitTestResponse = false;
    }

    @Override // com.google.android.datatransport.WinterFlowSchedulerSession
    public final void WinterFlowUnitTestResponse(WinterFlowPipelineEvent winterFlowPipelineEvent) {
        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this.WinterFlowVariableVersionControl;
        if (winterFlowWorkerThreadPool != null) {
            winterFlowWorkerThreadPool.WinterFlowUnitTestResponse(winterFlowPipelineEvent);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowSchedulerSession
    public final void WinterFlowVariableVersionControl() {
        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this.WinterFlowVariableVersionControl;
        if (winterFlowWorkerThreadPool != null) {
            winterFlowWorkerThreadPool.WinterFlowCacheManagerAgent(new CancellationException("onBack cancelled"), true);
        }
        WinterFlowPipelineObject winterFlowPipelineObject = this.WinterFlowTransactionManagerStrategy;
        if (winterFlowPipelineObject != null) {
            winterFlowPipelineObject.WinterFlowArrayNetwork(null);
        }
        this.WinterFlowVariableVersionControl = null;
        this.WinterFlowTransactionManagerStrategy = null;
        this.WinterFlowUnitTestResponse = false;
    }
}
