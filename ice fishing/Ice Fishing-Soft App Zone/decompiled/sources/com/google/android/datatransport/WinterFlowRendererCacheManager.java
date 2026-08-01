package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererCacheManager implements WinterFlowWorkerModule, WinterFlowLibraryLayer {
    public final WinterFlowProviderPackage WinterFlowHookDataSource;
    public final WinterFlowFunctionCacheManager WinterFlowRouterStructure;

    public WinterFlowRendererCacheManager(WinterFlowFunctionCacheManager winterFlowFunctionCacheManager, WinterFlowProviderPackage winterFlowProviderPackage) {
        this.WinterFlowRouterStructure = winterFlowFunctionCacheManager;
        this.WinterFlowHookDataSource = winterFlowProviderPackage;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerModule
    public final WinterFlowTransactionPlatform WinterFlowArrayNetwork(WinterFlowNodeException winterFlowNodeException, List list, long j) {
        return WinterFlowDecoratorUI.WinterFlowRouterAdapter(this, WinterFlowHandlerConsumer.WinterFlowResponseEngine(j), WinterFlowHandlerConsumer.WinterFlowSyntax(j), WinterFlowHandlerConsumer.WinterFlowRouterRouter(j), WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j), winterFlowNodeException.WinterFlowUserManagerUserManager(this.WinterFlowRouterStructure.WinterFlowRouterStructure()), winterFlowNodeException, list, new WinterFlowViewTesting[list.size()], list.size());
    }

    @Override // com.google.android.datatransport.WinterFlowLibraryLayer
    public final long WinterFlowCacheManagerAgent(int i, int i2, int i3, boolean z) {
        return !z ? WinterFlowServiceOrchestration.WinterFlowRouterStructure(i, i2, 0, i3) : WinterFlowCacheRuntime.WinterFlowRouterAdapter(i, i2, 0, i3);
    }

    @Override // com.google.android.datatransport.WinterFlowLibraryLayer
    public final int WinterFlowHookDataSource(WinterFlowViewTesting winterFlowViewTesting) {
        return winterFlowViewTesting.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowLibraryLayer
    public final void WinterFlowRouterStructure(int i, WinterFlowNodeException winterFlowNodeException, int[] iArr, int[] iArr2) {
        this.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy(winterFlowNodeException, i, iArr, winterFlowNodeException.getLayoutDirection(), iArr2);
    }

    @Override // com.google.android.datatransport.WinterFlowLibraryLayer
    public final WinterFlowTransactionPlatform WinterFlowTransactionManagerStrategy(WinterFlowViewTesting[] winterFlowViewTestingArr, WinterFlowNodeException winterFlowNodeException, int[] iArr, int i, int i2) {
        return winterFlowNodeException.WinterFlowThreadListener(i, i2, WinterFlowFrontendNode.WinterFlowVariableVersionControl, new WinterFlowLoaderEngine(winterFlowViewTestingArr, this, i2, iArr));
    }

    @Override // com.google.android.datatransport.WinterFlowLibraryLayer
    public final int WinterFlowVariableVersionControl(WinterFlowViewTesting winterFlowViewTesting) {
        return winterFlowViewTesting.WinterFlowVariableVersionControl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowRendererCacheManager)) {
            return false;
        }
        WinterFlowRendererCacheManager winterFlowRendererCacheManager = (WinterFlowRendererCacheManager) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowRendererCacheManager.WinterFlowRouterStructure) && this.WinterFlowHookDataSource.equals(winterFlowRendererCacheManager.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowHookDataSource.WinterFlowRouterStructure) + (this.WinterFlowRouterStructure.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.WinterFlowRouterStructure + ", verticalAlignment=" + this.WinterFlowHookDataSource + ')';
    }
}
