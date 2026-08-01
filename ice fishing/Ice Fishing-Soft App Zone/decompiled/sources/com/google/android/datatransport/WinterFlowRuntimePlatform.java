package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRuntimePlatform extends WinterFlowUserManagerController implements WinterFlowAlgorithmEntity {
    public static final WinterFlowAlgorithmDebug WinterFlowBatchUI = new WinterFlowAlgorithmDebug(11);
    public final WinterFlowAdapterModule WinterFlowVariableBandwidth;

    public WinterFlowRuntimePlatform(WinterFlowAdapterModule winterFlowAdapterModule) {
        this.WinterFlowVariableBandwidth = winterFlowAdapterModule;
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmEntity
    public final Object WinterFlowResponseEngine() {
        return WinterFlowBatchUI;
    }
}
