package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInheritanceEngine extends WinterFlowRuntimeBandwidth {
    public final transient int WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowRuntimeBandwidth WinterFlowSyntax;
    public final transient int WinterFlowUnitTestResponse;

    public WinterFlowInheritanceEngine(WinterFlowRuntimeBandwidth winterFlowRuntimeBandwidth, int i, int i2) {
        this.WinterFlowSyntax = winterFlowRuntimeBandwidth;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowRouterRouter = i2;
    }

    @Override // com.google.android.datatransport.WinterFlowInterfaceServer
    public final int WinterFlowArrayNetwork() {
        return this.WinterFlowSyntax.WinterFlowCacheManagerAgent() + this.WinterFlowUnitTestResponse + this.WinterFlowRouterRouter;
    }

    @Override // com.google.android.datatransport.WinterFlowInterfaceServer
    public final int WinterFlowCacheManagerAgent() {
        return this.WinterFlowSyntax.WinterFlowCacheManagerAgent() + this.WinterFlowUnitTestResponse;
    }

    @Override // com.google.android.datatransport.WinterFlowInterfaceServer
    public final Object[] WinterFlowRouterStructure() {
        return this.WinterFlowSyntax.WinterFlowRouterStructure();
    }

    @Override // com.google.android.datatransport.WinterFlowRuntimeBandwidth, java.util.List
    /* renamed from: WinterFlowUnitTestResponse, reason: merged with bridge method [inline-methods] */
    public final WinterFlowRuntimeBandwidth subList(int i, int i2) {
        WinterFlowProtocolNetwork.WinterFlowServerProtocol(i, i2, this.WinterFlowRouterRouter);
        int i3 = this.WinterFlowUnitTestResponse;
        return this.WinterFlowSyntax.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        WinterFlowProtocolNetwork.WinterFlowTransactionAgent(i, this.WinterFlowRouterRouter);
        return this.WinterFlowSyntax.get(i + this.WinterFlowUnitTestResponse);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.WinterFlowRouterRouter;
    }
}
