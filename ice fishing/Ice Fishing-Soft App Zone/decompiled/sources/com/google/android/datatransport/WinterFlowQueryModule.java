package com.google.android.datatransport;

import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryModule implements WinterFlowTransactionPlatform {
    public final /* synthetic */ WinterFlowObjectSession WinterFlowArrayNetwork;
    public final /* synthetic */ Map WinterFlowCacheManagerAgent;
    public final /* synthetic */ int WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;
    public final /* synthetic */ WinterFlowRequestUtility WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowObjectSession WinterFlowVariableVersionControl;

    public WinterFlowQueryModule(int i, int i2, Map map, WinterFlowObjectSession winterFlowObjectSession, WinterFlowObjectSession winterFlowObjectSession2, WinterFlowRequestUtility winterFlowRequestUtility) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
        this.WinterFlowCacheManagerAgent = map;
        this.WinterFlowArrayNetwork = winterFlowObjectSession;
        this.WinterFlowVariableVersionControl = winterFlowObjectSession2;
        this.WinterFlowTransactionManagerStrategy = winterFlowRequestUtility;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final WinterFlowObjectSession WinterFlowArrayNetwork() {
        return this.WinterFlowArrayNetwork;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final int WinterFlowCacheManagerAgent() {
        return this.WinterFlowHookDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final void WinterFlowHookDataSource() {
        this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(this.WinterFlowTransactionManagerStrategy.WinterFlowOrchestrationSubsystem);
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final Map WinterFlowRouterStructure() {
        return this.WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final int WinterFlowVariableVersionControl() {
        return this.WinterFlowRouterStructure;
    }
}
