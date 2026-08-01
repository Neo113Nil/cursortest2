package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAdapterProtocol {
    public static int WinterFlowResponseEngine;
    public static final WinterFlowThreadPoolProcess WinterFlowTransactionAgent = new WinterFlowThreadPoolProcess(12);
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;
    public final float WinterFlowHookDataSource;
    public final boolean WinterFlowRouterRouter;
    public final float WinterFlowRouterStructure;
    public final int WinterFlowSyntax;
    public final long WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final WinterFlowRequestTool WinterFlowVariableVersionControl;

    public WinterFlowAdapterProtocol(float f, float f2, float f3, float f4, WinterFlowRequestTool winterFlowRequestTool, long j, int i, boolean z) {
        int i2;
        synchronized (WinterFlowTransactionAgent) {
            i2 = WinterFlowResponseEngine;
            WinterFlowResponseEngine = i2 + 1;
        }
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
        this.WinterFlowCacheManagerAgent = f3;
        this.WinterFlowArrayNetwork = f4;
        this.WinterFlowVariableVersionControl = winterFlowRequestTool;
        this.WinterFlowTransactionManagerStrategy = j;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowRouterRouter = z;
        this.WinterFlowSyntax = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowAdapterProtocol)) {
            return false;
        }
        WinterFlowAdapterProtocol winterFlowAdapterProtocol = (WinterFlowAdapterProtocol) obj;
        if (!WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowRouterStructure, winterFlowAdapterProtocol.WinterFlowRouterStructure) || !WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowHookDataSource, winterFlowAdapterProtocol.WinterFlowHookDataSource) || this.WinterFlowCacheManagerAgent != winterFlowAdapterProtocol.WinterFlowCacheManagerAgent || this.WinterFlowArrayNetwork != winterFlowAdapterProtocol.WinterFlowArrayNetwork || !this.WinterFlowVariableVersionControl.equals(winterFlowAdapterProtocol.WinterFlowVariableVersionControl)) {
            return false;
        }
        long j = winterFlowAdapterProtocol.WinterFlowTransactionManagerStrategy;
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return WinterFlowUnitTestSoftware.WinterFlowRouterStructure(this.WinterFlowTransactionManagerStrategy, j) && this.WinterFlowUnitTestResponse == winterFlowAdapterProtocol.WinterFlowUnitTestResponse && this.WinterFlowRouterRouter == winterFlowAdapterProtocol.WinterFlowRouterRouter;
    }

    public final int hashCode() {
        int hashCode = (this.WinterFlowVariableVersionControl.hashCode() + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowArrayNetwork, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowCacheManagerAgent, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowHookDataSource, Float.hashCode(this.WinterFlowRouterStructure) * 31, 31), 31), 31)) * 31;
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return Boolean.hashCode(this.WinterFlowRouterRouter) + WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowUnitTestResponse, WinterFlowResolverBackend.WinterFlowVariableVersionControl(hashCode, 31, this.WinterFlowTransactionManagerStrategy), 31);
    }
}
