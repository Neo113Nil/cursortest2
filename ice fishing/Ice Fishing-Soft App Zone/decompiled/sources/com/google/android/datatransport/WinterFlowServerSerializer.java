package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServerSerializer extends WinterFlowConfigurationSession {
    public static final /* synthetic */ AtomicIntegerFieldUpdater WinterFlowResponseEngine = AtomicIntegerFieldUpdater.newUpdater(WinterFlowServerSerializer.class, "consumed$volatile");
    public final WinterFlowFrameworkAgent WinterFlowRouterRouter;
    public final boolean WinterFlowSyntax;
    private volatile /* synthetic */ int consumed$volatile;

    public /* synthetic */ WinterFlowServerSerializer(WinterFlowFrameworkAgent winterFlowFrameworkAgent, boolean z) {
        this(winterFlowFrameworkAgent, z, WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl, -3, WinterFlowDataSourceHandler.WinterFlowVariableVersionControl);
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationSession
    public final Object WinterFlowArrayNetwork(WinterFlowGatewayClass winterFlowGatewayClass, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        Object WinterFlowBatchUI = WinterFlowInvokerComponent.WinterFlowBatchUI(new WinterFlowProcessorLoader(winterFlowGatewayClass), this.WinterFlowRouterRouter, this.WinterFlowSyntax, winterFlowTransactionManagerLayer);
        return WinterFlowBatchUI == WinterFlowListenerJava.WinterFlowVariableVersionControl ? WinterFlowBatchUI : WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationSession
    public final String WinterFlowCacheManagerAgent() {
        return "channel=" + this.WinterFlowRouterRouter;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationSession, com.google.android.datatransport.WinterFlowEventProvider
    public final Object WinterFlowRouterStructure(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i == -3) {
            boolean z = this.WinterFlowSyntax;
            if (z && WinterFlowResponseEngine.getAndSet(this, 1) != 0) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object WinterFlowBatchUI = WinterFlowInvokerComponent.WinterFlowBatchUI(winterFlowCacheInterface, this.WinterFlowRouterRouter, z, winterFlowTransactionManagerLayer);
            if (WinterFlowBatchUI == winterFlowListenerJava) {
                return WinterFlowBatchUI;
            }
        } else {
            Object WinterFlowRouterStructure = super.WinterFlowRouterStructure(winterFlowCacheInterface, winterFlowTransactionManagerLayer);
            if (WinterFlowRouterStructure == winterFlowListenerJava) {
                return WinterFlowRouterStructure;
            }
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationSession
    public final WinterFlowEventProvider WinterFlowTransactionManagerStrategy() {
        return new WinterFlowServerSerializer(this.WinterFlowRouterRouter, this.WinterFlowSyntax);
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationSession
    public final WinterFlowFrameworkAgent WinterFlowUnitTestResponse(WinterFlowAdapterResponse winterFlowAdapterResponse) {
        if (!this.WinterFlowSyntax || WinterFlowResponseEngine.getAndSet(this, 1) == 0) {
            return this.WinterFlowTransactionManagerStrategy == -3 ? this.WinterFlowRouterRouter : super.WinterFlowUnitTestResponse(winterFlowAdapterResponse);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationSession
    public final WinterFlowConfigurationSession WinterFlowVariableVersionControl(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        return new WinterFlowServerSerializer(this.WinterFlowRouterRouter, this.WinterFlowSyntax, winterFlowEncryptionMicroservice, i, winterFlowDataSourceHandler);
    }

    public WinterFlowServerSerializer(WinterFlowFrameworkAgent winterFlowFrameworkAgent, boolean z, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        super(winterFlowEncryptionMicroservice, i, winterFlowDataSourceHandler);
        this.WinterFlowRouterRouter = winterFlowFrameworkAgent;
        this.WinterFlowSyntax = z;
        this.consumed$volatile = 0;
    }
}
