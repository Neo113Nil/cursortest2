package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxNode implements WinterFlowModuleHandler {
    public final long WinterFlowHookDataSource;
    public final boolean WinterFlowRouterStructure;

    public WinterFlowSyntaxNode(long j, boolean z) {
        this.WinterFlowRouterStructure = z;
        this.WinterFlowHookDataSource = j;
    }

    @Override // com.google.android.datatransport.WinterFlowModuleHandler
    public final WinterFlowLibraryDeployment WinterFlowRouterStructure(WinterFlowJSONDecorator winterFlowJSONDecorator) {
        return new WinterFlowUISoftware(winterFlowJSONDecorator, this.WinterFlowRouterStructure, new WinterFlowJSONDecorator(20, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowSyntaxNode)) {
            return false;
        }
        WinterFlowSyntaxNode winterFlowSyntaxNode = (WinterFlowSyntaxNode) obj;
        if (this.WinterFlowRouterStructure != winterFlowSyntaxNode.WinterFlowRouterStructure || !WinterFlowRequestScheduler.WinterFlowHookDataSource(Float.NaN, Float.NaN)) {
            return false;
        }
        long j = winterFlowSyntaxNode.WinterFlowHookDataSource;
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return WinterFlowUnitTestSoftware.WinterFlowRouterStructure(this.WinterFlowHookDataSource, j);
    }

    public final int hashCode() {
        int WinterFlowCacheManagerAgent = WinterFlowResolverBackend.WinterFlowCacheManagerAgent(Float.NaN, Boolean.hashCode(this.WinterFlowRouterStructure) * 31, 961);
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return Long.hashCode(this.WinterFlowHookDataSource) + WinterFlowCacheManagerAgent;
    }
}
