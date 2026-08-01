package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDEVariable {
    public final boolean WinterFlowCacheManagerAgent;
    public final long WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;

    public WinterFlowIDEVariable(long j, long j2, boolean z) {
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = j2;
        this.WinterFlowCacheManagerAgent = z;
    }

    public final WinterFlowIDEVariable WinterFlowRouterStructure(WinterFlowIDEVariable winterFlowIDEVariable) {
        return new WinterFlowIDEVariable(WinterFlowHandlerResolver.WinterFlowVariableVersionControl(this.WinterFlowRouterStructure, winterFlowIDEVariable.WinterFlowRouterStructure), Math.max(this.WinterFlowHookDataSource, winterFlowIDEVariable.WinterFlowHookDataSource), this.WinterFlowCacheManagerAgent);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowIDEVariable)) {
            return false;
        }
        WinterFlowIDEVariable winterFlowIDEVariable = (WinterFlowIDEVariable) obj;
        return WinterFlowHandlerResolver.WinterFlowHookDataSource(this.WinterFlowRouterStructure, winterFlowIDEVariable.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowIDEVariable.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowIDEVariable.WinterFlowCacheManagerAgent;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.WinterFlowCacheManagerAgent) + WinterFlowResolverBackend.WinterFlowVariableVersionControl(Long.hashCode(this.WinterFlowRouterStructure) * 31, 31, this.WinterFlowHookDataSource);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) WinterFlowHandlerResolver.WinterFlowUnitTestResponse(this.WinterFlowRouterStructure)) + ", timeMillis=" + this.WinterFlowHookDataSource + ", shouldApplyImmediately=" + this.WinterFlowCacheManagerAgent + ')';
    }
}
