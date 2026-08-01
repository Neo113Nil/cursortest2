package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkBatch implements WinterFlowWorkerModule {
    public final boolean WinterFlowHookDataSource;
    public final WinterFlowInvokerConsumer WinterFlowRouterStructure;

    public WinterFlowFrameworkBatch(WinterFlowInvokerConsumer winterFlowInvokerConsumer, boolean z) {
        this.WinterFlowRouterStructure = winterFlowInvokerConsumer;
        this.WinterFlowHookDataSource = z;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerModule
    public final WinterFlowTransactionPlatform WinterFlowArrayNetwork(final WinterFlowNodeException winterFlowNodeException, final List list, long j) {
        boolean isEmpty = list.isEmpty();
        WinterFlowFrontendNode winterFlowFrontendNode = WinterFlowFrontendNode.WinterFlowVariableVersionControl;
        if (isEmpty) {
            return winterFlowNodeException.WinterFlowThreadListener(WinterFlowHandlerConsumer.WinterFlowResponseEngine(j), WinterFlowHandlerConsumer.WinterFlowSyntax(j), winterFlowFrontendNode, new WinterFlowInterfaceSoftware(6));
        }
        long j2 = this.WinterFlowHookDataSource ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final WinterFlowRuntimeVersion winterFlowRuntimeVersion = (WinterFlowRuntimeVersion) list.get(0);
            winterFlowRuntimeVersion.WinterFlowSyntax();
            final WinterFlowViewTesting WinterFlowVariableVersionControl = winterFlowRuntimeVersion.WinterFlowVariableVersionControl(j2);
            final int max = Math.max(WinterFlowHandlerConsumer.WinterFlowResponseEngine(j), WinterFlowVariableVersionControl.WinterFlowVariableVersionControl);
            final int max2 = Math.max(WinterFlowHandlerConsumer.WinterFlowSyntax(j), WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy);
            return winterFlowNodeException.WinterFlowThreadListener(max, max2, winterFlowFrontendNode, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowThreadPoolEntity
                @Override // com.google.android.datatransport.WinterFlowObjectSession
                public final Object WinterFlowUnitTestResponse(Object obj) {
                    WinterFlowLibrary.WinterFlowArrayNetwork((WinterFlowDecoratorSessionManager) obj, WinterFlowViewTesting.this, winterFlowRuntimeVersion, winterFlowNodeException.getLayoutDirection(), max, max2, this.WinterFlowRouterStructure);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
            });
        }
        final WinterFlowViewTesting[] winterFlowViewTestingArr = new WinterFlowViewTesting[list.size()];
        final WinterFlowTransactionInterface winterFlowTransactionInterface = new WinterFlowTransactionInterface();
        winterFlowTransactionInterface.WinterFlowVariableVersionControl = WinterFlowHandlerConsumer.WinterFlowResponseEngine(j);
        final WinterFlowTransactionInterface winterFlowTransactionInterface2 = new WinterFlowTransactionInterface();
        winterFlowTransactionInterface2.WinterFlowVariableVersionControl = WinterFlowHandlerConsumer.WinterFlowSyntax(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            WinterFlowRuntimeVersion winterFlowRuntimeVersion2 = (WinterFlowRuntimeVersion) list.get(i);
            winterFlowRuntimeVersion2.WinterFlowSyntax();
            WinterFlowViewTesting WinterFlowVariableVersionControl2 = winterFlowRuntimeVersion2.WinterFlowVariableVersionControl(j2);
            winterFlowViewTestingArr[i] = WinterFlowVariableVersionControl2;
            winterFlowTransactionInterface.WinterFlowVariableVersionControl = Math.max(winterFlowTransactionInterface.WinterFlowVariableVersionControl, WinterFlowVariableVersionControl2.WinterFlowVariableVersionControl);
            winterFlowTransactionInterface2.WinterFlowVariableVersionControl = Math.max(winterFlowTransactionInterface2.WinterFlowVariableVersionControl, WinterFlowVariableVersionControl2.WinterFlowTransactionManagerStrategy);
        }
        return winterFlowNodeException.WinterFlowThreadListener(winterFlowTransactionInterface.WinterFlowVariableVersionControl, winterFlowTransactionInterface2.WinterFlowVariableVersionControl, winterFlowFrontendNode, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowScriptPipeline
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager = (WinterFlowDecoratorSessionManager) obj;
                WinterFlowViewTesting[] winterFlowViewTestingArr2 = winterFlowViewTestingArr;
                int length = winterFlowViewTestingArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i2;
                    WinterFlowViewTesting winterFlowViewTesting = winterFlowViewTestingArr2[i3];
                    winterFlowViewTesting.getClass();
                    WinterFlowLibrary.WinterFlowArrayNetwork(winterFlowDecoratorSessionManager, winterFlowViewTesting, (WinterFlowRuntimeVersion) list.get(i4), winterFlowNodeException.getLayoutDirection(), winterFlowTransactionInterface.WinterFlowVariableVersionControl, winterFlowTransactionInterface2.WinterFlowVariableVersionControl, this.WinterFlowRouterStructure);
                    i3++;
                    i2 = i4 + 1;
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowFrameworkBatch)) {
            return false;
        }
        WinterFlowFrameworkBatch winterFlowFrameworkBatch = (WinterFlowFrameworkBatch) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowFrameworkBatch.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowFrameworkBatch.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.WinterFlowHookDataSource) + (this.WinterFlowRouterStructure.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.WinterFlowRouterStructure + ", propagateMinConstraints=" + this.WinterFlowHookDataSource + ')';
    }
}
