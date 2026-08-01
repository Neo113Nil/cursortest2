package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRuntimeProtocol implements WinterFlowServiceWebsocket, WinterFlowEventProvider, WinterFlowConsumerProcess {
    public final /* synthetic */ WinterFlowCacheManagerNode WinterFlowVariableVersionControl;

    public WinterFlowRuntimeProtocol(WinterFlowCacheManagerNode winterFlowCacheManagerNode) {
        this.WinterFlowVariableVersionControl = winterFlowCacheManagerNode;
    }

    @Override // com.google.android.datatransport.WinterFlowConsumerProcess
    public final WinterFlowEventProvider WinterFlowHookDataSource(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        return WinterFlowHandlerWebsocket.WinterFlowBatchUI(this, winterFlowEncryptionMicroservice, i, winterFlowDataSourceHandler);
    }

    @Override // com.google.android.datatransport.WinterFlowEventProvider
    public final Object WinterFlowRouterStructure(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(winterFlowCacheInterface, winterFlowTransactionManagerLayer);
        return WinterFlowListenerJava.WinterFlowVariableVersionControl;
    }
}
