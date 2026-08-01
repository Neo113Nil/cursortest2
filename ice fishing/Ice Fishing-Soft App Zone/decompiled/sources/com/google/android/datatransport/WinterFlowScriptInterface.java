package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowScriptInterface implements WinterFlowEventProvider {
    public final WinterFlowEventProvider WinterFlowVariableVersionControl;

    public WinterFlowScriptInterface(WinterFlowEventProvider winterFlowEventProvider) {
        this.WinterFlowVariableVersionControl = winterFlowEventProvider;
    }

    @Override // com.google.android.datatransport.WinterFlowEventProvider
    public final Object WinterFlowRouterStructure(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowBandwidthCache winterFlowBandwidthCache = new WinterFlowBandwidthCache();
        winterFlowBandwidthCache.WinterFlowVariableVersionControl = WinterFlowEncryptionSubsystem.WinterFlowServerProtocol;
        Object WinterFlowRouterStructure = this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(new WinterFlowEncryptionEngine(this, winterFlowBandwidthCache, winterFlowCacheInterface), winterFlowTransactionManagerLayer);
        return WinterFlowRouterStructure == WinterFlowListenerJava.WinterFlowVariableVersionControl ? WinterFlowRouterStructure : WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
