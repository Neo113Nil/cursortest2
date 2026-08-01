package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDEFramework implements WinterFlowHookView, WinterFlowEventProvider, WinterFlowConsumerProcess {
    public final /* synthetic */ WinterFlowHandlerPlatform WinterFlowVariableVersionControl;

    public WinterFlowIDEFramework(WinterFlowHandlerPlatform winterFlowHandlerPlatform) {
        this.WinterFlowVariableVersionControl = winterFlowHandlerPlatform;
    }

    @Override // com.google.android.datatransport.WinterFlowConsumerProcess
    public final WinterFlowEventProvider WinterFlowHookDataSource(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        return (((i < 0 || i >= 2) && i != -2) || winterFlowDataSourceHandler != WinterFlowDataSourceHandler.WinterFlowTransactionManagerStrategy) ? WinterFlowHandlerWebsocket.WinterFlowBatchUI(this, winterFlowEncryptionMicroservice, i, winterFlowDataSourceHandler) : this;
    }

    @Override // com.google.android.datatransport.WinterFlowEventProvider
    public final Object WinterFlowRouterStructure(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(winterFlowCacheInterface, winterFlowTransactionManagerLayer);
        return WinterFlowListenerJava.WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowHookView
    public final Object getValue() {
        return this.WinterFlowVariableVersionControl.getValue();
    }
}
