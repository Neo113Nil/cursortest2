package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSchedulerManager extends WinterFlowServiceProviderTool {
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;
    public final float WinterFlowRouterRouter;
    public final float WinterFlowTransactionManagerStrategy;
    public final float WinterFlowUnitTestResponse;
    public final float WinterFlowVariableVersionControl;

    public WinterFlowSchedulerManager(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.WinterFlowCacheManagerAgent = f;
        this.WinterFlowArrayNetwork = f2;
        this.WinterFlowVariableVersionControl = f3;
        this.WinterFlowTransactionManagerStrategy = f4;
        this.WinterFlowUnitTestResponse = f5;
        this.WinterFlowRouterRouter = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowSchedulerManager)) {
            return false;
        }
        WinterFlowSchedulerManager winterFlowSchedulerManager = (WinterFlowSchedulerManager) obj;
        return Float.compare(this.WinterFlowCacheManagerAgent, winterFlowSchedulerManager.WinterFlowCacheManagerAgent) == 0 && Float.compare(this.WinterFlowArrayNetwork, winterFlowSchedulerManager.WinterFlowArrayNetwork) == 0 && Float.compare(this.WinterFlowVariableVersionControl, winterFlowSchedulerManager.WinterFlowVariableVersionControl) == 0 && Float.compare(this.WinterFlowTransactionManagerStrategy, winterFlowSchedulerManager.WinterFlowTransactionManagerStrategy) == 0 && Float.compare(this.WinterFlowUnitTestResponse, winterFlowSchedulerManager.WinterFlowUnitTestResponse) == 0 && Float.compare(this.WinterFlowRouterRouter, winterFlowSchedulerManager.WinterFlowRouterRouter) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowRouterRouter) + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowUnitTestResponse, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowTransactionManagerStrategy, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowVariableVersionControl, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowArrayNetwork, Float.hashCode(this.WinterFlowCacheManagerAgent) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", y1=");
        sb.append(this.WinterFlowArrayNetwork);
        sb.append(", x2=");
        sb.append(this.WinterFlowVariableVersionControl);
        sb.append(", y2=");
        sb.append(this.WinterFlowTransactionManagerStrategy);
        sb.append(", x3=");
        sb.append(this.WinterFlowUnitTestResponse);
        sb.append(", y3=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowRouterRouter, ')');
    }
}
