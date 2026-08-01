package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowThreadDebug {
    public final int WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowThreadDebug(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public WinterFlowDatabaseSchemaHandler WinterFlowHookDataSource(WinterFlowProviderEntity winterFlowProviderEntity) {
        return null;
    }

    public abstract void WinterFlowRouterStructure(WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowProcessorConsumer winterFlowProcessorConsumer, WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowValidator winterFlowValidator, WinterFlowListenerUtility winterFlowListenerUtility);

    public final String toString() {
        String WinterFlowCacheManagerAgent = WinterFlowListenerProtocol.WinterFlowRouterStructure(getClass()).WinterFlowCacheManagerAgent();
        return WinterFlowCacheManagerAgent == null ? "" : WinterFlowCacheManagerAgent;
    }

    public WinterFlowThreadDebug(int i, int i2) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
    }
}
