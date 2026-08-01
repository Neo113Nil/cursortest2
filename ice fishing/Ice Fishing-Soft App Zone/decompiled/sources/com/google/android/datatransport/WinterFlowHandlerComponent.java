package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHandlerComponent {
    public static final WinterFlowHandlerComponent WinterFlowCacheManagerAgent = new WinterFlowHandlerComponent(WinterFlowDecoratorUI.WinterFlowBatchUI(0), WinterFlowDecoratorUI.WinterFlowBatchUI(0));
    public final long WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;

    public WinterFlowHandlerComponent(long j, long j2) {
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowHandlerComponent)) {
            return false;
        }
        WinterFlowHandlerComponent winterFlowHandlerComponent = (WinterFlowHandlerComponent) obj;
        return WinterFlowOrchestrationPlatform.WinterFlowRouterStructure(this.WinterFlowRouterStructure, winterFlowHandlerComponent.WinterFlowRouterStructure) && WinterFlowOrchestrationPlatform.WinterFlowRouterStructure(this.WinterFlowHookDataSource, winterFlowHandlerComponent.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        WinterFlowInheritanceValidator[] winterFlowInheritanceValidatorArr = WinterFlowOrchestrationPlatform.WinterFlowHookDataSource;
        return Long.hashCode(this.WinterFlowHookDataSource) + (Long.hashCode(this.WinterFlowRouterStructure) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) WinterFlowOrchestrationPlatform.WinterFlowArrayNetwork(this.WinterFlowRouterStructure)) + ", restLine=" + ((Object) WinterFlowOrchestrationPlatform.WinterFlowArrayNetwork(this.WinterFlowHookDataSource)) + ')';
    }
}
