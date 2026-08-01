package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRepositoryWorker {
    public final boolean WinterFlowArrayNetwork;
    public final WinterFlowSessionManagerProcess WinterFlowCacheManagerAgent;
    public final boolean WinterFlowHookDataSource;
    public final WinterFlowProtocolEntity WinterFlowRouterStructure;
    public boolean WinterFlowTransactionManagerStrategy = true;
    public final Object WinterFlowVariableVersionControl;

    public WinterFlowRepositoryWorker(WinterFlowProtocolEntity winterFlowProtocolEntity, Object obj, boolean z, WinterFlowSessionManagerProcess winterFlowSessionManagerProcess, boolean z2) {
        this.WinterFlowRouterStructure = winterFlowProtocolEntity;
        this.WinterFlowHookDataSource = z;
        this.WinterFlowCacheManagerAgent = winterFlowSessionManagerProcess;
        this.WinterFlowArrayNetwork = z2;
        this.WinterFlowVariableVersionControl = obj;
    }

    public final Object WinterFlowRouterStructure() {
        if (this.WinterFlowHookDataSource) {
            return null;
        }
        Object obj = this.WinterFlowVariableVersionControl;
        if (obj != null) {
            return obj;
        }
        WinterFlowSessionManagerEntity.WinterFlowHookDataSource("Unexpected form of a provided value");
        throw new WinterFlowServerSystem();
    }
}
