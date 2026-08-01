package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowViewAgent implements WinterFlowObjectArray {
    public final WinterFlowArray WinterFlowArrayNetwork;
    public WinterFlowAlgorithmHelper WinterFlowCacheManagerAgent;
    public boolean WinterFlowRouterStructure = false;
    public boolean WinterFlowHookDataSource = false;

    public WinterFlowViewAgent(WinterFlowArray winterFlowArray) {
        this.WinterFlowArrayNetwork = winterFlowArray;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectArray
    public final WinterFlowObjectArray WinterFlowCacheManagerAgent(boolean z) {
        if (this.WinterFlowRouterStructure) {
            throw new WinterFlowArrayManager("Cannot encode a second value in the ValueEncoderContext");
        }
        this.WinterFlowRouterStructure = true;
        this.WinterFlowArrayNetwork.WinterFlowHookDataSource(this.WinterFlowCacheManagerAgent, z ? 1 : 0, this.WinterFlowHookDataSource);
        return this;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectArray
    public final WinterFlowObjectArray WinterFlowHookDataSource(String str) {
        if (this.WinterFlowRouterStructure) {
            throw new WinterFlowArrayManager("Cannot encode a second value in the ValueEncoderContext");
        }
        this.WinterFlowRouterStructure = true;
        this.WinterFlowArrayNetwork.WinterFlowTransactionManagerStrategy(this.WinterFlowCacheManagerAgent, str, this.WinterFlowHookDataSource);
        return this;
    }
}
