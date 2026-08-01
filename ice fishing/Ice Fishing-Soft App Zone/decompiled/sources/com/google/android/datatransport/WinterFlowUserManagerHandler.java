package com.google.android.datatransport;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowUserManagerHandler {
    public static final ViewGroup.LayoutParams WinterFlowRouterStructure = new ViewGroup.LayoutParams(-2, -2);

    public static void WinterFlowRouterStructure(ComponentActivity componentActivity, WinterFlowEventTool winterFlowEventTool) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        WinterFlowNodeMiddleware winterFlowNodeMiddleware = childAt instanceof WinterFlowNodeMiddleware ? (WinterFlowNodeMiddleware) childAt : null;
        if (winterFlowNodeMiddleware != null) {
            winterFlowNodeMiddleware.setParentCompositionContext(null);
            winterFlowNodeMiddleware.setContent(winterFlowEventTool);
            return;
        }
        WinterFlowNodeMiddleware winterFlowNodeMiddleware2 = new WinterFlowNodeMiddleware(componentActivity);
        winterFlowNodeMiddleware2.setParentCompositionContext(null);
        winterFlowNodeMiddleware2.setContent(winterFlowEventTool);
        View decorView = componentActivity.getWindow().getDecorView();
        if (WinterFlowHookProcessor.WinterFlowTransactionAgent(decorView) == null) {
            decorView.setTag(com.icewinter.flow.winter.icecatch.R.id.view_tree_lifecycle_owner, componentActivity);
        }
        if (WinterFlowWorkerVersionControl.WinterFlowArrayNetwork(decorView) == null) {
            decorView.setTag(com.icewinter.flow.winter.icecatch.R.id.view_tree_view_model_store_owner, componentActivity);
        }
        if (WinterFlowNodeVersion.WinterFlowServerProtocol(decorView) == null) {
            decorView.setTag(com.icewinter.flow.winter.icecatch.R.id.view_tree_saved_state_registry_owner, componentActivity);
        }
        componentActivity.setContentView(winterFlowNodeMiddleware2, WinterFlowRouterStructure);
    }
}
