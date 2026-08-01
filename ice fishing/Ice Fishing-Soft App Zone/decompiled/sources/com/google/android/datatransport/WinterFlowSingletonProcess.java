package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public interface WinterFlowSingletonProcess extends WinterFlowModuleSingleton {
    long WinterFlowArrayNetwork(float f, float f2, float f3);

    float WinterFlowCacheManagerAgent(long j, float f, float f2, float f3);

    float WinterFlowHookDataSource(long j, float f, float f2, float f3);

    @Override // com.google.android.datatransport.WinterFlowModuleSingleton
    default WinterFlowFrontendAgent WinterFlowRouterStructure(WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl) {
        return new WinterFlowStackProvider(this);
    }

    default float WinterFlowVariableVersionControl(float f, float f2, float f3) {
        return WinterFlowCacheManagerAgent(WinterFlowArrayNetwork(f, f2, f3), f, f2, f3);
    }
}
