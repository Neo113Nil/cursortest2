package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRepositoryObject implements WinterFlowWorkerModule, WinterFlowLibraryLayer {
    public final WinterFlowConfigurationPipeline WinterFlowHookDataSource;
    public final WinterFlowTransactionDecorator WinterFlowRouterStructure;

    public WinterFlowRepositoryObject(WinterFlowTransactionDecorator winterFlowTransactionDecorator, WinterFlowConfigurationPipeline winterFlowConfigurationPipeline) {
        this.WinterFlowRouterStructure = winterFlowTransactionDecorator;
        this.WinterFlowHookDataSource = winterFlowConfigurationPipeline;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerModule
    public final WinterFlowTransactionPlatform WinterFlowArrayNetwork(WinterFlowNodeException winterFlowNodeException, List list, long j) {
        return WinterFlowDecoratorUI.WinterFlowRouterAdapter(this, WinterFlowHandlerConsumer.WinterFlowSyntax(j), WinterFlowHandlerConsumer.WinterFlowResponseEngine(j), WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j), WinterFlowHandlerConsumer.WinterFlowRouterRouter(j), winterFlowNodeException.WinterFlowUserManagerUserManager(this.WinterFlowRouterStructure.WinterFlowRouterStructure()), winterFlowNodeException, list, new WinterFlowViewTesting[list.size()], list.size());
    }

    @Override // com.google.android.datatransport.WinterFlowLibraryLayer
    public final long WinterFlowCacheManagerAgent(int i, int i2, int i3, boolean z) {
        return !z ? WinterFlowServiceOrchestration.WinterFlowRouterStructure(0, i3, i, i2) : WinterFlowCacheRuntime.WinterFlowBatchUI(0, i3, i, i2);
    }

    @Override // com.google.android.datatransport.WinterFlowLibraryLayer
    public final int WinterFlowHookDataSource(WinterFlowViewTesting winterFlowViewTesting) {
        return winterFlowViewTesting.WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowLibraryLayer
    public final void WinterFlowRouterStructure(int i, WinterFlowNodeException winterFlowNodeException, int[] iArr, int[] iArr2) {
        this.WinterFlowRouterStructure.WinterFlowRouterRouter(i, winterFlowNodeException, iArr, iArr2);
    }

    @Override // com.google.android.datatransport.WinterFlowLibraryLayer
    public final WinterFlowTransactionPlatform WinterFlowTransactionManagerStrategy(final WinterFlowViewTesting[] winterFlowViewTestingArr, final WinterFlowNodeException winterFlowNodeException, final int[] iArr, int i, final int i2) {
        return winterFlowNodeException.WinterFlowThreadListener(i2, i, WinterFlowFrontendNode.WinterFlowVariableVersionControl, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowAPIUserManager
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager = (WinterFlowDecoratorSessionManager) obj;
                WinterFlowViewTesting[] winterFlowViewTestingArr2 = winterFlowViewTestingArr;
                int length = winterFlowViewTestingArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    WinterFlowViewTesting winterFlowViewTesting = winterFlowViewTestingArr2[i3];
                    int i5 = i4 + 1;
                    winterFlowViewTesting.getClass();
                    Object WinterFlowSyntax = winterFlowViewTesting.WinterFlowSyntax();
                    WinterFlowInvokerRepository winterFlowInvokerRepository = WinterFlowSyntax instanceof WinterFlowInvokerRepository ? (WinterFlowInvokerRepository) WinterFlowSyntax : null;
                    WinterFlowCacheManagerConfiguration layoutDirection = winterFlowNodeException.getLayoutDirection();
                    WinterFlowInheritanceProxy winterFlowInheritanceProxy = winterFlowInvokerRepository != null ? winterFlowInvokerRepository.WinterFlowCacheManagerAgent : null;
                    int i6 = i2;
                    WinterFlowDecoratorSessionManager.WinterFlowSyntax(winterFlowDecoratorSessionManager, winterFlowViewTesting, winterFlowInheritanceProxy != null ? winterFlowInheritanceProxy.WinterFlowRouterStructure.WinterFlowRouterStructure(winterFlowViewTesting.WinterFlowVariableVersionControl, i6, layoutDirection) : this.WinterFlowHookDataSource.WinterFlowRouterStructure(winterFlowViewTesting.WinterFlowVariableVersionControl, i6, layoutDirection), iArr[i4]);
                    i3++;
                    i4 = i5;
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            }
        });
    }

    @Override // com.google.android.datatransport.WinterFlowLibraryLayer
    public final int WinterFlowVariableVersionControl(WinterFlowViewTesting winterFlowViewTesting) {
        return winterFlowViewTesting.WinterFlowTransactionManagerStrategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowRepositoryObject)) {
            return false;
        }
        WinterFlowRepositoryObject winterFlowRepositoryObject = (WinterFlowRepositoryObject) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowRepositoryObject.WinterFlowRouterStructure) && this.WinterFlowHookDataSource.equals(winterFlowRepositoryObject.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowHookDataSource.WinterFlowRouterStructure) + (this.WinterFlowRouterStructure.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.WinterFlowRouterStructure + ", horizontalAlignment=" + this.WinterFlowHookDataSource + ')';
    }
}
