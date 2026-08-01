package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderService implements WinterFlowNodeConfiguration {
    public Object WinterFlowArrayNetwork;
    public Object WinterFlowCacheManagerAgent;
    public final WinterFlowCacheManagerVersionControl WinterFlowHookDataSource;
    public long WinterFlowRouterRouter;
    public final WinterFlowFrontendAgent WinterFlowRouterStructure;
    public WinterFlowConfigurationResponse WinterFlowSyntax;
    public WinterFlowConfigurationResponse WinterFlowTransactionManagerStrategy;
    public final WinterFlowConfigurationResponse WinterFlowUnitTestResponse;
    public WinterFlowConfigurationResponse WinterFlowVariableVersionControl;

    public WinterFlowServiceProviderService(WinterFlowModuleSingleton winterFlowModuleSingleton, WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl, Object obj, Object obj2, WinterFlowConfigurationResponse winterFlowConfigurationResponse) {
        this.WinterFlowRouterStructure = winterFlowModuleSingleton.WinterFlowRouterStructure(winterFlowCacheManagerVersionControl);
        this.WinterFlowHookDataSource = winterFlowCacheManagerVersionControl;
        this.WinterFlowCacheManagerAgent = obj2;
        this.WinterFlowArrayNetwork = obj;
        this.WinterFlowVariableVersionControl = (WinterFlowConfigurationResponse) ((WinterFlowObjectSession) winterFlowCacheManagerVersionControl.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse(obj);
        WinterFlowObjectSession winterFlowObjectSession = (WinterFlowObjectSession) winterFlowCacheManagerVersionControl.WinterFlowTransactionManagerStrategy;
        this.WinterFlowTransactionManagerStrategy = (WinterFlowConfigurationResponse) winterFlowObjectSession.WinterFlowUnitTestResponse(obj2);
        this.WinterFlowUnitTestResponse = winterFlowConfigurationResponse != null ? WinterFlowSoftwareException.WinterFlowResolverController(winterFlowConfigurationResponse) : ((WinterFlowConfigurationResponse) winterFlowObjectSession.WinterFlowUnitTestResponse(obj)).WinterFlowCacheManagerAgent();
        this.WinterFlowRouterRouter = -1L;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeConfiguration
    public final WinterFlowCacheManagerVersionControl WinterFlowArrayNetwork() {
        return this.WinterFlowHookDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeConfiguration
    public final long WinterFlowCacheManagerAgent() {
        long j = this.WinterFlowRouterRouter;
        if (j >= 0) {
            return j;
        }
        long WinterFlowVariableVersionControl = this.WinterFlowRouterStructure.WinterFlowVariableVersionControl(this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse);
        this.WinterFlowRouterRouter = WinterFlowVariableVersionControl;
        return WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeConfiguration
    public final Object WinterFlowHookDataSource(long j) {
        if (WinterFlowUnitTestResponse(j)) {
            return this.WinterFlowCacheManagerAgent;
        }
        WinterFlowConfigurationResponse WinterFlowSyntax = this.WinterFlowRouterStructure.WinterFlowSyntax(j, this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse);
        int WinterFlowHookDataSource = WinterFlowSyntax.WinterFlowHookDataSource();
        for (int i = 0; i < WinterFlowHookDataSource; i++) {
            if (Float.isNaN(WinterFlowSyntax.WinterFlowRouterStructure(i))) {
                WinterFlowInheritanceWorker.WinterFlowHookDataSource("AnimationVector cannot contain a NaN. " + WinterFlowSyntax + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return ((WinterFlowObjectSession) this.WinterFlowHookDataSource.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(WinterFlowSyntax);
    }

    public final void WinterFlowRouterRouter(Object obj) {
        if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowArrayNetwork)) {
            return;
        }
        this.WinterFlowArrayNetwork = obj;
        this.WinterFlowVariableVersionControl = (WinterFlowConfigurationResponse) ((WinterFlowObjectSession) this.WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse(obj);
        this.WinterFlowSyntax = null;
        this.WinterFlowRouterRouter = -1L;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeConfiguration
    public final boolean WinterFlowRouterStructure() {
        return this.WinterFlowRouterStructure.WinterFlowRouterStructure();
    }

    public final void WinterFlowSyntax(Object obj) {
        if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowCacheManagerAgent, obj)) {
            return;
        }
        this.WinterFlowCacheManagerAgent = obj;
        this.WinterFlowTransactionManagerStrategy = (WinterFlowConfigurationResponse) ((WinterFlowObjectSession) this.WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse(obj);
        this.WinterFlowSyntax = null;
        this.WinterFlowRouterRouter = -1L;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeConfiguration
    public final WinterFlowConfigurationResponse WinterFlowTransactionManagerStrategy(long j) {
        boolean WinterFlowUnitTestResponse = WinterFlowUnitTestResponse(j);
        WinterFlowConfigurationResponse winterFlowConfigurationResponse = this.WinterFlowUnitTestResponse;
        if (!WinterFlowUnitTestResponse) {
            return this.WinterFlowRouterStructure.WinterFlowBandwidthObject(j, this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, winterFlowConfigurationResponse);
        }
        WinterFlowConfigurationResponse winterFlowConfigurationResponse2 = this.WinterFlowSyntax;
        if (winterFlowConfigurationResponse2 != null) {
            return winterFlowConfigurationResponse2;
        }
        WinterFlowConfigurationResponse WinterFlowThreadListener = this.WinterFlowRouterStructure.WinterFlowThreadListener(this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, winterFlowConfigurationResponse);
        this.WinterFlowSyntax = WinterFlowThreadListener;
        return WinterFlowThreadListener;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeConfiguration
    public final Object WinterFlowVariableVersionControl() {
        return this.WinterFlowCacheManagerAgent;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.WinterFlowArrayNetwork + " -> " + this.WinterFlowCacheManagerAgent + ",initial velocity: " + this.WinterFlowUnitTestResponse + ", duration: " + (WinterFlowCacheManagerAgent() / 1000000) + " ms,animationSpec: " + this.WinterFlowRouterStructure;
    }
}
