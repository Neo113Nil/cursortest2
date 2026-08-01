package com.google.android.datatransport;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowGatewayClass extends WinterFlowBandwidthFunction implements WinterFlowFrameworkAgent, WinterFlowInvokerPlatform {
    public final WinterFlowWorkerThreadPool WinterFlowRouterRouter;

    public WinterFlowGatewayClass(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, WinterFlowWorkerThreadPool winterFlowWorkerThreadPool) {
        super(winterFlowEncryptionMicroservice, true);
        this.WinterFlowRouterRouter = winterFlowWorkerThreadPool;
    }

    @Override // com.google.android.datatransport.WinterFlowBandwidthFunction
    public final void WinterFlowArrayFramework(Object obj) {
        this.WinterFlowRouterRouter.WinterFlowCacheManagerAgent(null, false);
    }

    @Override // com.google.android.datatransport.WinterFlowControllerTransaction, com.google.android.datatransport.WinterFlowConsumerBandwidth
    public final void WinterFlowArrayNetwork(CancellationException cancellationException) {
        Object WinterFlowTestingNode = WinterFlowTestingNode();
        if (WinterFlowTestingNode instanceof WinterFlowSessionManagerSessionManager) {
            return;
        }
        if ((WinterFlowTestingNode instanceof WinterFlowViewBandwidth) && ((WinterFlowViewBandwidth) WinterFlowTestingNode).WinterFlowVariableVersionControl()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new WinterFlowQueryComponent(WinterFlowArrayHelper(), null, this);
        }
        WinterFlowBackendCacheManager(cancellationException);
    }

    @Override // com.google.android.datatransport.WinterFlowControllerTransaction
    public final void WinterFlowBackendCacheManager(CancellationException cancellationException) {
        this.WinterFlowRouterRouter.WinterFlowCacheManagerAgent(cancellationException, true);
        WinterFlowResolverController(cancellationException);
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerPlatform
    public final Object WinterFlowRouterStructure(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        return this.WinterFlowRouterRouter.WinterFlowRouterStructure(winterFlowTransactionManagerLayer, obj);
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerPlatform
    public final Object WinterFlowUnitTestResponse(Object obj) {
        return this.WinterFlowRouterRouter.WinterFlowUnitTestResponse(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowFrameworkAgent
    public final Object WinterFlowVariableVersionControl(WinterFlowNodeInheritance winterFlowNodeInheritance) {
        return this.WinterFlowRouterRouter.WinterFlowVariableVersionControl(winterFlowNodeInheritance);
    }

    @Override // com.google.android.datatransport.WinterFlowBandwidthFunction
    public final void WinterFlowVersionControlModule(Throwable th, boolean z) {
        if (this.WinterFlowRouterRouter.WinterFlowCacheManagerAgent(th, false) || z) {
            return;
        }
        WinterFlowSoftwareException.WinterFlowSoftwareProtocol(this.WinterFlowUnitTestResponse, th);
    }

    @Override // com.google.android.datatransport.WinterFlowFrameworkAgent
    public final WinterFlowThreadPoolServiceProvider iterator() {
        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this.WinterFlowRouterRouter;
        winterFlowWorkerThreadPool.getClass();
        return new WinterFlowThreadPoolServiceProvider(winterFlowWorkerThreadPool);
    }
}
