package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverUnitTest implements WinterFlowArrayMiddleware {
    public final Object WinterFlowHookDataSource;
    public final Object WinterFlowRouterStructure;

    public WinterFlowResolverUnitTest(Object obj, Object obj2) {
        this.WinterFlowRouterStructure = obj;
        this.WinterFlowHookDataSource = obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowArrayMiddleware
    public final Object WinterFlowCacheManagerAgent() {
        return this.WinterFlowHookDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowArrayMiddleware
    public final Object WinterFlowRouterStructure() {
        return this.WinterFlowRouterStructure;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowArrayMiddleware)) {
            return false;
        }
        WinterFlowArrayMiddleware winterFlowArrayMiddleware = (WinterFlowArrayMiddleware) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowArrayMiddleware.WinterFlowRouterStructure()) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowArrayMiddleware.WinterFlowCacheManagerAgent());
    }

    public final int hashCode() {
        Object obj = this.WinterFlowRouterStructure;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.WinterFlowHookDataSource;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
