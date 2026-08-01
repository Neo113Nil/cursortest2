package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowArrayFunction extends WinterFlowWorkerThreadPool {
    public final WinterFlowDataSourceHandler WinterFlowBatchUI;

    public WinterFlowArrayFunction(int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        super(i);
        this.WinterFlowBatchUI = winterFlowDataSourceHandler;
        if (winterFlowDataSourceHandler == WinterFlowDataSourceHandler.WinterFlowVariableVersionControl) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterAdapter("This implementation does not support suspension for senders, use ", WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowWorkerThreadPool.class).WinterFlowCacheManagerAgent(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowVariableVersionControl(i, " was specified", "Buffered channel capacity must be at least 1, but ");
        throw null;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerThreadPool
    public final boolean WinterFlowMapperProtocol() {
        return this.WinterFlowBatchUI == WinterFlowDataSourceHandler.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerThreadPool, com.google.android.datatransport.WinterFlowInvokerPlatform
    public final Object WinterFlowRouterStructure(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        if (WinterFlowSoftwareEngine(obj, true) instanceof WinterFlowCloudHandler) {
            throw WinterFlowOrchestrationSubsystem();
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowSoftwareEngine(Object obj, boolean z) {
        WinterFlowDataSourceHandler winterFlowDataSourceHandler = this.WinterFlowBatchUI;
        WinterFlowDataSourceHandler winterFlowDataSourceHandler2 = WinterFlowDataSourceHandler.WinterFlowUnitTestResponse;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        if (winterFlowDataSourceHandler == winterFlowDataSourceHandler2) {
            Object WinterFlowUnitTestResponse = super.WinterFlowUnitTestResponse(obj);
            return (!(WinterFlowUnitTestResponse instanceof WinterFlowGatewayParser) || (WinterFlowUnitTestResponse instanceof WinterFlowCloudHandler)) ? WinterFlowUnitTestResponse : winterFlowAlgorithmSession;
        }
        Object obj2 = WinterFlowNodeServiceProvider.WinterFlowArrayNetwork;
        WinterFlowJSONEngine winterFlowJSONEngine = (WinterFlowJSONEngine) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowWorkerThreadPool.WinterFlowSingletonPlatform);
        while (true) {
            long andIncrement = WinterFlowWorkerThreadPool.WinterFlowTransactionManagerStrategy.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean WinterFlowBatchUI = WinterFlowBatchUI(andIncrement, false);
            int i = WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (winterFlowJSONEngine.WinterFlowArrayNetwork != j3) {
                WinterFlowJSONEngine WinterFlowTransactionAgent = WinterFlowTransactionAgent(j3, winterFlowJSONEngine);
                if (WinterFlowTransactionAgent != null) {
                    winterFlowJSONEngine = WinterFlowTransactionAgent;
                } else if (WinterFlowBatchUI) {
                    return new WinterFlowCloudHandler(WinterFlowOrchestrationSubsystem());
                }
            }
            int WinterFlowPackageIDE = WinterFlowPackageIDE(winterFlowJSONEngine, i2, obj, j, obj2, WinterFlowBatchUI);
            if (WinterFlowPackageIDE == 0) {
                winterFlowJSONEngine.WinterFlowRouterStructure();
                return winterFlowAlgorithmSession;
            }
            if (WinterFlowPackageIDE == 1) {
                break;
            }
            if (WinterFlowPackageIDE != 2) {
                if (WinterFlowPackageIDE == 3) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("unexpected");
                    return null;
                }
                if (WinterFlowPackageIDE == 4) {
                    if (j < WinterFlowBandwidthObject()) {
                        winterFlowJSONEngine.WinterFlowRouterStructure();
                    }
                    return new WinterFlowCloudHandler(WinterFlowOrchestrationSubsystem());
                }
                if (WinterFlowPackageIDE == 5) {
                    winterFlowJSONEngine.WinterFlowRouterStructure();
                }
            } else {
                if (WinterFlowBatchUI) {
                    winterFlowJSONEngine.WinterFlowRouterRouter();
                    return new WinterFlowCloudHandler(WinterFlowOrchestrationSubsystem());
                }
                WinterFlowTransactionIDE winterFlowTransactionIDE = obj2 instanceof WinterFlowTransactionIDE ? (WinterFlowTransactionIDE) obj2 : null;
                if (winterFlowTransactionIDE != null) {
                    winterFlowTransactionIDE.WinterFlowRouterStructure(winterFlowJSONEngine, i2 + i);
                }
                WinterFlowRouterRouter((winterFlowJSONEngine.WinterFlowArrayNetwork * j2) + i2);
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerThreadPool, com.google.android.datatransport.WinterFlowInvokerPlatform
    public final Object WinterFlowUnitTestResponse(Object obj) {
        return WinterFlowSoftwareEngine(obj, false);
    }
}
