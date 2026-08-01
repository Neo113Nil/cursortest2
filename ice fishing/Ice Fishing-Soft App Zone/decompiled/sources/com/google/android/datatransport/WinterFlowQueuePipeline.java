package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueuePipeline extends WinterFlowDeserializationNetwork {
    public final WinterFlowObjectSession WinterFlowHookDataSource;
    public final boolean WinterFlowRouterStructure;

    public WinterFlowQueuePipeline(WinterFlowObjectSession winterFlowObjectSession, boolean z) {
        this.WinterFlowRouterStructure = z;
        this.WinterFlowHookDataSource = winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowInheritanceTesting winterFlowInheritanceTesting = new WinterFlowInheritanceTesting();
        winterFlowInheritanceTesting.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowInheritanceTesting.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        return winterFlowInheritanceTesting;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowInheritanceTesting winterFlowInheritanceTesting = (WinterFlowInheritanceTesting) winterFlowUserManagerController;
        winterFlowInheritanceTesting.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowInheritanceTesting.WinterFlowBatchUI = this.WinterFlowHookDataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowQueuePipeline)) {
            return false;
        }
        WinterFlowQueuePipeline winterFlowQueuePipeline = (WinterFlowQueuePipeline) obj;
        return this.WinterFlowRouterStructure == winterFlowQueuePipeline.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowQueuePipeline.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.hashCode() + (Boolean.hashCode(this.WinterFlowRouterStructure) * 31);
    }
}
