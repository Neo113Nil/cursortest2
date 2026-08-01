package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryJSON {
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;
    public final float WinterFlowHookDataSource;
    public final long WinterFlowRouterRouter;
    public final float WinterFlowRouterStructure;
    public final long WinterFlowTransactionManagerStrategy;
    public final long WinterFlowUnitTestResponse;
    public final long WinterFlowVariableVersionControl;

    static {
        WinterFlowFrameworkMechanism.WinterFlowRouterStructure(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public WinterFlowQueryJSON(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
        this.WinterFlowCacheManagerAgent = f3;
        this.WinterFlowArrayNetwork = f4;
        this.WinterFlowVariableVersionControl = j;
        this.WinterFlowTransactionManagerStrategy = j2;
        this.WinterFlowUnitTestResponse = j3;
        this.WinterFlowRouterRouter = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowQueryJSON)) {
            return false;
        }
        WinterFlowQueryJSON winterFlowQueryJSON = (WinterFlowQueryJSON) obj;
        return Float.compare(this.WinterFlowRouterStructure, winterFlowQueryJSON.WinterFlowRouterStructure) == 0 && Float.compare(this.WinterFlowHookDataSource, winterFlowQueryJSON.WinterFlowHookDataSource) == 0 && Float.compare(this.WinterFlowCacheManagerAgent, winterFlowQueryJSON.WinterFlowCacheManagerAgent) == 0 && Float.compare(this.WinterFlowArrayNetwork, winterFlowQueryJSON.WinterFlowArrayNetwork) == 0 && WinterFlowCloudStack.WinterFlowSingletonPlatform(this.WinterFlowVariableVersionControl, winterFlowQueryJSON.WinterFlowVariableVersionControl) && WinterFlowCloudStack.WinterFlowSingletonPlatform(this.WinterFlowTransactionManagerStrategy, winterFlowQueryJSON.WinterFlowTransactionManagerStrategy) && WinterFlowCloudStack.WinterFlowSingletonPlatform(this.WinterFlowUnitTestResponse, winterFlowQueryJSON.WinterFlowUnitTestResponse) && WinterFlowCloudStack.WinterFlowSingletonPlatform(this.WinterFlowRouterRouter, winterFlowQueryJSON.WinterFlowRouterRouter);
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowRouterRouter) + WinterFlowResolverBackend.WinterFlowVariableVersionControl(WinterFlowResolverBackend.WinterFlowVariableVersionControl(WinterFlowResolverBackend.WinterFlowVariableVersionControl(WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowArrayNetwork, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowCacheManagerAgent, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowHookDataSource, Float.hashCode(this.WinterFlowRouterStructure) * 31, 31), 31), 31), 31, this.WinterFlowVariableVersionControl), 31, this.WinterFlowTransactionManagerStrategy), 31, this.WinterFlowUnitTestResponse);
    }

    public final String toString() {
        String str = WinterFlowQuerySyntax.WinterFlowSoftwareEngine(this.WinterFlowRouterStructure) + ", " + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(this.WinterFlowHookDataSource) + ", " + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(this.WinterFlowCacheManagerAgent) + ", " + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(this.WinterFlowArrayNetwork);
        long j = this.WinterFlowVariableVersionControl;
        long j2 = this.WinterFlowTransactionManagerStrategy;
        boolean WinterFlowSingletonPlatform = WinterFlowCloudStack.WinterFlowSingletonPlatform(j, j2);
        long j3 = this.WinterFlowUnitTestResponse;
        long j4 = this.WinterFlowRouterRouter;
        if (!WinterFlowSingletonPlatform || !WinterFlowCloudStack.WinterFlowSingletonPlatform(j2, j3) || !WinterFlowCloudStack.WinterFlowSingletonPlatform(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) WinterFlowCloudStack.WinterFlowConfiguration(j)) + ", topRight=" + ((Object) WinterFlowCloudStack.WinterFlowConfiguration(j2)) + ", bottomRight=" + ((Object) WinterFlowCloudStack.WinterFlowConfiguration(j3)) + ", bottomLeft=" + ((Object) WinterFlowCloudStack.WinterFlowConfiguration(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(Float.intBitsToFloat(i)) + ", y=" + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(Float.intBitsToFloat(i2)) + ')';
    }
}
