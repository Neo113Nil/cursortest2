package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNodeUtility implements WinterFlowInvokerMicroservice {
    public final /* synthetic */ Object WinterFlowCacheManagerAgent;
    public final /* synthetic */ WinterFlowSessionUI WinterFlowHookDataSource;
    public final WinterFlowMiddlewareFramework WinterFlowRouterStructure;

    public WinterFlowNodeUtility(WinterFlowSessionUI winterFlowSessionUI, Object obj) {
        this.WinterFlowHookDataSource = winterFlowSessionUI;
        this.WinterFlowCacheManagerAgent = obj;
        int[] iArr = WinterFlowConfigurationUtility.WinterFlowRouterStructure;
        this.WinterFlowRouterStructure = new WinterFlowMiddlewareFramework();
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerMicroservice
    public final void WinterFlowArrayNetwork(int i, long j) {
        WinterFlowSessionUI winterFlowSessionUI = this.WinterFlowHookDataSource;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) winterFlowSessionUI.WinterFlowServiceUtility.WinterFlowUnitTestResponse(this.WinterFlowCacheManagerAgent);
        if (winterFlowSchedulerStructure == null || !winterFlowSchedulerStructure.WinterFlowCacheManagerListener()) {
            return;
        }
        int i2 = ((WinterFlowDecoratorLayer) winterFlowSchedulerStructure.WinterFlowThreadListener()).WinterFlowVariableVersionControl.WinterFlowUnitTestResponse;
        if (i < 0 || i >= i2) {
            WinterFlowViewUtility.WinterFlowArrayNetwork("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (winterFlowSchedulerStructure.WinterFlowPackageIDE()) {
            WinterFlowViewUtility.WinterFlowRouterStructure("Pre-measure called on node that is not placed");
        }
        WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = winterFlowSessionUI.WinterFlowVariableVersionControl;
        winterFlowSchedulerStructure2.WinterFlowRouterAdapter = true;
        ((WinterFlowSyntaxTransactionManager) WinterFlowLibraryDecorator.WinterFlowRouterStructure(winterFlowSchedulerStructure)).WinterFlowRouterAdapter((WinterFlowSchedulerStructure) ((WinterFlowDecoratorLayer) winterFlowSchedulerStructure.WinterFlowThreadListener()).get(i), j);
        winterFlowSchedulerStructure2.WinterFlowRouterAdapter = false;
        this.WinterFlowRouterStructure.WinterFlowRouterStructure(i);
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerMicroservice
    public final void WinterFlowCacheManagerAgent(WinterFlowSessionManagerEngine winterFlowSessionManagerEngine) {
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) this.WinterFlowHookDataSource.WinterFlowServiceUtility.WinterFlowUnitTestResponse(this.WinterFlowCacheManagerAgent);
        WinterFlowUserManagerController winterFlowUserManagerController = (winterFlowSchedulerStructure == null || (winterFlowExceptionStrategy = winterFlowSchedulerStructure.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy.WinterFlowTransactionManagerStrategy;
        if (winterFlowUserManagerController == null || !winterFlowUserManagerController.WinterFlowSingletonPlatform) {
            return;
        }
        WinterFlowWorkerVersionControl.WinterFlowConcurrencyThread(winterFlowUserManagerController, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", winterFlowSessionManagerEngine);
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerMicroservice
    public final int WinterFlowHookDataSource() {
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) this.WinterFlowHookDataSource.WinterFlowServiceUtility.WinterFlowUnitTestResponse(this.WinterFlowCacheManagerAgent);
        if (winterFlowSchedulerStructure != null) {
            return ((WinterFlowDecoratorLayer) winterFlowSchedulerStructure.WinterFlowThreadListener()).WinterFlowVariableVersionControl.WinterFlowUnitTestResponse;
        }
        return 0;
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerMicroservice
    public final void WinterFlowRouterStructure() {
        this.WinterFlowHookDataSource.WinterFlowUnitTestResponse(this.WinterFlowCacheManagerAgent);
    }
}
