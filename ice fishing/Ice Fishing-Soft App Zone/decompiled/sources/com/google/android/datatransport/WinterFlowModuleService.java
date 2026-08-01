package com.google.android.datatransport;

import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModuleService implements WinterFlowWorkerModule {
    public final /* synthetic */ WinterFlowSchedulerStructure WinterFlowHookDataSource;
    public final /* synthetic */ WinterFlowServiceProviderController WinterFlowRouterStructure;

    public WinterFlowModuleService(WinterFlowServiceProviderController winterFlowServiceProviderController, WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        this.WinterFlowRouterStructure = winterFlowServiceProviderController;
        this.WinterFlowHookDataSource = winterFlowSchedulerStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerModule
    public final WinterFlowTransactionPlatform WinterFlowArrayNetwork(WinterFlowNodeException winterFlowNodeException, List list, long j) {
        WinterFlowServiceProviderController winterFlowServiceProviderController = this.WinterFlowRouterStructure;
        int childCount = winterFlowServiceProviderController.getChildCount();
        WinterFlowFrontendNode winterFlowFrontendNode = WinterFlowFrontendNode.WinterFlowVariableVersionControl;
        if (childCount == 0) {
            return winterFlowNodeException.WinterFlowThreadListener(WinterFlowHandlerConsumer.WinterFlowResponseEngine(j), WinterFlowHandlerConsumer.WinterFlowSyntax(j), winterFlowFrontendNode, WinterFlowServiceProviderBatch.WinterFlowThreadListener);
        }
        if (WinterFlowHandlerConsumer.WinterFlowResponseEngine(j) != 0) {
            winterFlowServiceProviderController.getChildAt(0).setMinimumWidth(WinterFlowHandlerConsumer.WinterFlowResponseEngine(j));
        }
        if (WinterFlowHandlerConsumer.WinterFlowSyntax(j) != 0) {
            winterFlowServiceProviderController.getChildAt(0).setMinimumHeight(WinterFlowHandlerConsumer.WinterFlowSyntax(j));
        }
        int WinterFlowResponseEngine = WinterFlowHandlerConsumer.WinterFlowResponseEngine(j);
        int WinterFlowRouterRouter = WinterFlowHandlerConsumer.WinterFlowRouterRouter(j);
        ViewGroup.LayoutParams layoutParams = winterFlowServiceProviderController.getLayoutParams();
        layoutParams.getClass();
        int WinterFlowUnitTestResponse = WinterFlowRouterLayer.WinterFlowUnitTestResponse(WinterFlowResponseEngine, WinterFlowRouterRouter, layoutParams.width);
        int WinterFlowSyntax = WinterFlowHandlerConsumer.WinterFlowSyntax(j);
        int WinterFlowUnitTestResponse2 = WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j);
        ViewGroup.LayoutParams layoutParams2 = winterFlowServiceProviderController.getLayoutParams();
        layoutParams2.getClass();
        winterFlowServiceProviderController.measure(WinterFlowUnitTestResponse, WinterFlowRouterLayer.WinterFlowUnitTestResponse(WinterFlowSyntax, WinterFlowUnitTestResponse2, layoutParams2.height));
        return winterFlowNodeException.WinterFlowThreadListener(winterFlowServiceProviderController.getMeasuredWidth(), winterFlowServiceProviderController.getMeasuredHeight(), winterFlowFrontendNode, new WinterFlowWidgetNode(winterFlowServiceProviderController, this.WinterFlowHookDataSource, 1));
    }
}
