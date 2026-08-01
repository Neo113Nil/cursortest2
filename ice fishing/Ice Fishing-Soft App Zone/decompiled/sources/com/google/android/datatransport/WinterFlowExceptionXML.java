package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowExceptionXML implements WinterFlowRefactoringManager {
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;
    public final float WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowExceptionXML(float f, float f2, float f3, float f4) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
        this.WinterFlowCacheManagerAgent = f3;
        this.WinterFlowArrayNetwork = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            WinterFlowThreadQueue.WinterFlowRouterStructure("Padding must be non-negative");
        }
    }

    @Override // com.google.android.datatransport.WinterFlowRefactoringManager
    public final float WinterFlowArrayNetwork(WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration) {
        return winterFlowCacheManagerConfiguration == WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl ? this.WinterFlowRouterStructure : this.WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowRefactoringManager
    public final float WinterFlowCacheManagerAgent(WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration) {
        return winterFlowCacheManagerConfiguration == WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl ? this.WinterFlowCacheManagerAgent : this.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowRefactoringManager
    public final float WinterFlowHookDataSource() {
        return this.WinterFlowHookDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowRefactoringManager
    public final float WinterFlowRouterStructure() {
        return this.WinterFlowArrayNetwork;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowExceptionXML)) {
            return false;
        }
        WinterFlowExceptionXML winterFlowExceptionXML = (WinterFlowExceptionXML) obj;
        return WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowRouterStructure, winterFlowExceptionXML.WinterFlowRouterStructure) && WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowHookDataSource, winterFlowExceptionXML.WinterFlowHookDataSource) && WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowCacheManagerAgent, winterFlowExceptionXML.WinterFlowCacheManagerAgent) && WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowArrayNetwork, winterFlowExceptionXML.WinterFlowArrayNetwork);
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowArrayNetwork) + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowCacheManagerAgent, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowHookDataSource, Float.hashCode(this.WinterFlowRouterStructure) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) WinterFlowRequestScheduler.WinterFlowCacheManagerAgent(this.WinterFlowRouterStructure)) + ", top=" + ((Object) WinterFlowRequestScheduler.WinterFlowCacheManagerAgent(this.WinterFlowHookDataSource)) + ", end=" + ((Object) WinterFlowRequestScheduler.WinterFlowCacheManagerAgent(this.WinterFlowCacheManagerAgent)) + ", bottom=" + ((Object) WinterFlowRequestScheduler.WinterFlowCacheManagerAgent(this.WinterFlowArrayNetwork)) + ')';
    }
}
