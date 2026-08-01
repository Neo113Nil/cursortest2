package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowExceptionEventEmitter extends WinterFlowServiceProviderTool {
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;
    public final float WinterFlowRouterRouter;
    public final float WinterFlowSyntax;
    public final boolean WinterFlowTransactionManagerStrategy;
    public final boolean WinterFlowUnitTestResponse;
    public final float WinterFlowVariableVersionControl;

    public WinterFlowExceptionEventEmitter(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.WinterFlowCacheManagerAgent = f;
        this.WinterFlowArrayNetwork = f2;
        this.WinterFlowVariableVersionControl = f3;
        this.WinterFlowTransactionManagerStrategy = z;
        this.WinterFlowUnitTestResponse = z2;
        this.WinterFlowRouterRouter = f4;
        this.WinterFlowSyntax = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowExceptionEventEmitter)) {
            return false;
        }
        WinterFlowExceptionEventEmitter winterFlowExceptionEventEmitter = (WinterFlowExceptionEventEmitter) obj;
        return Float.compare(this.WinterFlowCacheManagerAgent, winterFlowExceptionEventEmitter.WinterFlowCacheManagerAgent) == 0 && Float.compare(this.WinterFlowArrayNetwork, winterFlowExceptionEventEmitter.WinterFlowArrayNetwork) == 0 && Float.compare(this.WinterFlowVariableVersionControl, winterFlowExceptionEventEmitter.WinterFlowVariableVersionControl) == 0 && this.WinterFlowTransactionManagerStrategy == winterFlowExceptionEventEmitter.WinterFlowTransactionManagerStrategy && this.WinterFlowUnitTestResponse == winterFlowExceptionEventEmitter.WinterFlowUnitTestResponse && Float.compare(this.WinterFlowRouterRouter, winterFlowExceptionEventEmitter.WinterFlowRouterRouter) == 0 && Float.compare(this.WinterFlowSyntax, winterFlowExceptionEventEmitter.WinterFlowSyntax) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowSyntax) + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowRouterRouter, WinterFlowSingletonMapper.WinterFlowRouterStructure(WinterFlowSingletonMapper.WinterFlowRouterStructure(WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowVariableVersionControl, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowArrayNetwork, Float.hashCode(this.WinterFlowCacheManagerAgent) * 31, 31), 31), 31, this.WinterFlowTransactionManagerStrategy), 31, this.WinterFlowUnitTestResponse), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.WinterFlowArrayNetwork);
        sb.append(", theta=");
        sb.append(this.WinterFlowVariableVersionControl);
        sb.append(", isMoreThanHalf=");
        sb.append(this.WinterFlowTransactionManagerStrategy);
        sb.append(", isPositiveArc=");
        sb.append(this.WinterFlowUnitTestResponse);
        sb.append(", arcStartX=");
        sb.append(this.WinterFlowRouterRouter);
        sb.append(", arcStartY=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowSyntax, ')');
    }
}
