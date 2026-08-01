package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionUserManager {
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;
    public final float WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;
    public final long WinterFlowVariableVersionControl;

    public WinterFlowSessionUserManager(int i, float f, float f2, float f3, long j) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = f;
        this.WinterFlowCacheManagerAgent = f2;
        this.WinterFlowArrayNetwork = f3;
        this.WinterFlowVariableVersionControl = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && WinterFlowSessionUserManager.class == obj.getClass()) {
            WinterFlowSessionUserManager winterFlowSessionUserManager = (WinterFlowSessionUserManager) obj;
            return this.WinterFlowCacheManagerAgent == winterFlowSessionUserManager.WinterFlowCacheManagerAgent && this.WinterFlowArrayNetwork == winterFlowSessionUserManager.WinterFlowArrayNetwork && this.WinterFlowHookDataSource == winterFlowSessionUserManager.WinterFlowHookDataSource && this.WinterFlowRouterStructure == winterFlowSessionUserManager.WinterFlowRouterStructure && this.WinterFlowVariableVersionControl == winterFlowSessionUserManager.WinterFlowVariableVersionControl;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowVariableVersionControl) + WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowRouterStructure, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowHookDataSource, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowArrayNetwork, Float.hashCode(this.WinterFlowCacheManagerAgent) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.WinterFlowCacheManagerAgent + ", touchY=" + this.WinterFlowArrayNetwork + ", progress=" + this.WinterFlowHookDataSource + ", swipeEdge=" + this.WinterFlowRouterStructure + ", frameTimeMillis=" + this.WinterFlowVariableVersionControl + ')';
    }
}
