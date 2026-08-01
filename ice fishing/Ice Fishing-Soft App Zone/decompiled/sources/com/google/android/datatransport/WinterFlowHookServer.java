package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHookServer extends WinterFlowDeserializationNetwork {
    public final boolean WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowHookServer(float f, boolean z) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = z;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowCacheMechanism winterFlowCacheMechanism = new WinterFlowCacheMechanism();
        winterFlowCacheMechanism.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowCacheMechanism.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        return winterFlowCacheMechanism;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowCacheMechanism winterFlowCacheMechanism = (WinterFlowCacheMechanism) winterFlowUserManagerController;
        winterFlowCacheMechanism.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowCacheMechanism.WinterFlowBatchUI = this.WinterFlowHookDataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WinterFlowHookServer winterFlowHookServer = obj instanceof WinterFlowHookServer ? (WinterFlowHookServer) obj : null;
        return winterFlowHookServer != null && this.WinterFlowRouterStructure == winterFlowHookServer.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowHookServer.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.WinterFlowHookDataSource) + (Float.hashCode(this.WinterFlowRouterStructure) * 31);
    }
}
