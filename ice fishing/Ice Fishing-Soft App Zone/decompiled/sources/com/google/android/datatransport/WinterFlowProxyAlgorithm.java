package com.google.android.datatransport;

import android.os.Parcelable;
import android.util.SparseArray;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxyAlgorithm extends WinterFlowDebugFramework implements WinterFlowObjectUI {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowServiceProviderController WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowProxyAlgorithm(WinterFlowServiceProviderController winterFlowServiceProviderController, int i) {
        super(0);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowServiceProviderController;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        WinterFlowServiceProviderTransactionManager snapshotObserver;
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowServiceProviderController winterFlowServiceProviderController = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowServiceProviderController.getLayoutNode().WinterFlowEventEmitterController();
                break;
            case 1:
                if (winterFlowServiceProviderController.WinterFlowSyntax && winterFlowServiceProviderController.isAttachedToWindow() && winterFlowServiceProviderController.getView().getParent() == winterFlowServiceProviderController) {
                    snapshotObserver = winterFlowServiceProviderController.getSnapshotObserver();
                    snapshotObserver.WinterFlowRouterStructure.WinterFlowCacheManagerAgent(winterFlowServiceProviderController, WinterFlowServiceProviderBatch.WinterFlowServerProtocol, winterFlowServiceProviderController.getUpdate());
                    break;
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                winterFlowServiceProviderController.WinterFlowStrategyTool.saveHierarchyState(sparseArray);
                break;
            case 3:
                winterFlowServiceProviderController.getReleaseBlock().WinterFlowUnitTestResponse(winterFlowServiceProviderController.WinterFlowStrategyTool);
                winterFlowServiceProviderController.WinterFlowRouterRouter();
                break;
            case 4:
                winterFlowServiceProviderController.getResetBlock().WinterFlowUnitTestResponse(winterFlowServiceProviderController.WinterFlowStrategyTool);
                break;
            default:
                winterFlowServiceProviderController.getUpdateBlock().WinterFlowUnitTestResponse(winterFlowServiceProviderController.WinterFlowStrategyTool);
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
