package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDataSourceService implements WinterFlowControllerInvoker, WinterFlowBatchCacheManager {
    public final WinterFlowCacheManagerAgent WinterFlowVariableVersionControl;

    public WinterFlowDataSourceService(WinterFlowCacheManagerAgent winterFlowCacheManagerAgent) {
        this.WinterFlowVariableVersionControl = winterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerInvoker
    public final boolean WinterFlowHookDataSource() {
        return this.WinterFlowVariableVersionControl.WinterFlowSyntax;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchCacheManager
    public final Object getValue() {
        return this.WinterFlowVariableVersionControl.WinterFlowRouterRouter.getValue();
    }
}
