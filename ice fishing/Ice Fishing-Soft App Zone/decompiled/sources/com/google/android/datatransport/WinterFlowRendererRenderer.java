package com.google.android.datatransport;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowRendererRenderer {
    public boolean WinterFlowHookDataSource;
    public WinterFlowAdapterUI WinterFlowRouterStructure;

    public void WinterFlowArrayNetwork(List list, WinterFlowQueueView winterFlowQueueView) {
        WinterFlowServiceProviderHandler winterFlowServiceProviderHandler = new WinterFlowServiceProviderHandler(new WinterFlowThreadPoolView(new WinterFlowProcessorFramework(new WinterFlowServiceValidator(0, list), new WinterFlowCompilerCloud(17, this, winterFlowQueueView), 1), new WinterFlowSessionManagerAgent(19), 0));
        while (winterFlowServiceProviderHandler.hasNext()) {
            WinterFlowHookDataSource().WinterFlowTransactionManagerStrategy((WinterFlowLibrarySessionManager) winterFlowServiceProviderHandler.next());
        }
    }

    public final WinterFlowAdapterUI WinterFlowHookDataSource() {
        WinterFlowAdapterUI winterFlowAdapterUI = this.WinterFlowRouterStructure;
        if (winterFlowAdapterUI != null) {
            return winterFlowAdapterUI;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public abstract WinterFlowServerLayer WinterFlowRouterStructure();

    public boolean WinterFlowTransactionManagerStrategy() {
        return true;
    }

    public void WinterFlowVariableVersionControl(WinterFlowLibrarySessionManager winterFlowLibrarySessionManager, boolean z) {
        List list = (List) WinterFlowHookDataSource().WinterFlowVariableVersionControl.WinterFlowVariableVersionControl.getValue();
        if (!list.contains(winterFlowLibrarySessionManager)) {
            WinterFlowEventEmitterOrchestration.WinterFlowConcurrencyThread("popBackStack was called with ", winterFlowLibrarySessionManager, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        WinterFlowLibrarySessionManager winterFlowLibrarySessionManager2 = null;
        while (WinterFlowTransactionManagerStrategy()) {
            winterFlowLibrarySessionManager2 = (WinterFlowLibrarySessionManager) listIterator.previous();
            if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowLibrarySessionManager2, winterFlowLibrarySessionManager)) {
                break;
            }
        }
        if (winterFlowLibrarySessionManager2 != null) {
            WinterFlowHookDataSource().WinterFlowArrayNetwork(winterFlowLibrarySessionManager2, z);
        }
    }

    public WinterFlowServerLayer WinterFlowCacheManagerAgent(WinterFlowServerLayer winterFlowServerLayer) {
        return winterFlowServerLayer;
    }
}
