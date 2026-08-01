package com.google.android.datatransport;

import android.view.WindowInsets;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWidgetNode extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ WinterFlowSchedulerStructure WinterFlowRouterRouter;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowServiceProviderController WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowWidgetNode(WinterFlowServiceProviderController winterFlowServiceProviderController, WinterFlowSchedulerStructure winterFlowSchedulerStructure, int i) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowServiceProviderController;
        this.WinterFlowRouterRouter = winterFlowSchedulerStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        WindowInsets WinterFlowHookDataSource;
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = this.WinterFlowRouterRouter;
        WinterFlowServiceProviderController winterFlowServiceProviderController = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowListenerService winterFlowListenerService = (WinterFlowListenerService) obj;
                WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = winterFlowListenerService instanceof WinterFlowSyntaxTransactionManager ? (WinterFlowSyntaxTransactionManager) winterFlowListenerService : null;
                if (winterFlowSyntaxTransactionManager != null) {
                    winterFlowSyntaxTransactionManager.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(winterFlowServiceProviderController, winterFlowSchedulerStructure);
                    winterFlowSyntaxTransactionManager.getAndroidViewsHandler$ui().addView(winterFlowServiceProviderController);
                    winterFlowSyntaxTransactionManager.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(winterFlowSchedulerStructure, winterFlowServiceProviderController);
                    winterFlowServiceProviderController.setImportantForAccessibility(1);
                    WinterFlowIDEComponent.WinterFlowHookDataSource(winterFlowServiceProviderController, new WinterFlowServerHelper(winterFlowSyntaxTransactionManager, winterFlowSchedulerStructure, winterFlowSyntaxTransactionManager));
                }
                if (winterFlowServiceProviderController.getView().getParent() != winterFlowServiceProviderController) {
                    winterFlowServiceProviderController.addView(winterFlowServiceProviderController.getView());
                    break;
                }
                break;
            case 1:
                WinterFlowQuerySyntax.WinterFlowRouterAdapter(winterFlowServiceProviderController, winterFlowSchedulerStructure);
                break;
            default:
                WinterFlowQuerySyntax.WinterFlowRouterAdapter(winterFlowServiceProviderController, winterFlowSchedulerStructure);
                ((WinterFlowSyntaxTransactionManager) winterFlowServiceProviderController.WinterFlowUnitTestResponse).WinterFlowTestingNode = true;
                int[] iArr = winterFlowServiceProviderController.WinterFlowSingletonPlatform;
                int i2 = iArr[0];
                int i3 = iArr[1];
                winterFlowServiceProviderController.getView().getLocationOnScreen(iArr);
                long j = winterFlowServiceProviderController.WinterFlowVariableBandwidth;
                long WinterFlowCacheManagerListener = ((WinterFlowAlgorithmHandler) obj).WinterFlowCacheManagerListener();
                winterFlowServiceProviderController.WinterFlowVariableBandwidth = WinterFlowCacheManagerListener;
                WinterFlowWebsocketInterface winterFlowWebsocketInterface = winterFlowServiceProviderController.WinterFlowBatchUI;
                if (winterFlowWebsocketInterface != null && ((i2 != iArr[0] || i3 != iArr[1] || !WinterFlowJavaEntity.WinterFlowRouterStructure(j, WinterFlowCacheManagerListener)) && (WinterFlowHookDataSource = winterFlowServiceProviderController.WinterFlowTransactionManagerStrategy(winterFlowWebsocketInterface).WinterFlowHookDataSource()) != null)) {
                    winterFlowServiceProviderController.getView().dispatchApplyWindowInsets(WinterFlowHookDataSource);
                    break;
                }
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
