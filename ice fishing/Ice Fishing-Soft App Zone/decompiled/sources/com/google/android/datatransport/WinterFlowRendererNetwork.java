package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererNetwork extends WinterFlowStackHandler {
    public final WinterFlowResolverPlatform WinterFlowRouterRouter;

    public WinterFlowRendererNetwork(WinterFlowResolverPlatform winterFlowResolverPlatform) {
        this.WinterFlowRouterRouter = winterFlowResolverPlatform;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.WinterFlowUnitTestResponse;
        this.WinterFlowUnitTestResponse = i + 2;
        Object[] objArr = this.WinterFlowVariableVersionControl;
        return new WinterFlowMapperDebug(this.WinterFlowRouterRouter, objArr[i], objArr[i + 1]);
    }
}
