package com.google.android.datatransport;

import android.app.Activity;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBandwidthSoftware implements WinterFlowCacheManagerInterface {
    public final /* synthetic */ Object WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowBandwidthSoftware(int i, Object obj) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowCacheManagerInterface
    public final void WinterFlowRouterStructure() {
        int i = this.WinterFlowRouterStructure;
        Object obj = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowControllerModule winterFlowControllerModule = ((WinterFlowBackendPackage) obj).WinterFlowRouterStructure;
                if (winterFlowControllerModule == null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Launcher has not been initialized");
                    break;
                } else {
                    winterFlowControllerModule.WinterFlowConcurrencyThread.WinterFlowArrayNetwork(winterFlowControllerModule.WinterFlowSingletonPlatform);
                    break;
                }
            case 1:
                WinterFlowCompilerOrchestration winterFlowCompilerOrchestration = (WinterFlowCompilerOrchestration) obj;
                winterFlowCompilerOrchestration.dismiss();
                winterFlowCompilerOrchestration.WinterFlowServerProtocol.WinterFlowTransactionManagerStrategy();
                break;
            case 2:
                ((WinterFlowThreadDatabase) obj).WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure();
                break;
            case 3:
                Activity activity = (Activity) obj;
                if (activity != null) {
                    activity.setRequestedOrientation(-1);
                    break;
                }
                break;
            case 4:
                ((WinterFlowCompilerComponent) obj).WinterFlowArrayNetwork = null;
                break;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowStrategyService winterFlowStrategyService = (WinterFlowStrategyService) obj;
                WinterFlowViewSystem winterFlowViewSystem = winterFlowStrategyService.WinterFlowCacheManagerAgent;
                if (winterFlowViewSystem != null) {
                    winterFlowViewSystem.WinterFlowRouterStructure = false;
                }
                winterFlowStrategyService.WinterFlowCacheManagerAgent = null;
                break;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                ((WinterFlowDatabaseServer) obj).WinterFlowTransactionManagerStrategy = true;
                break;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                ((WinterFlowCacheManagerMicroservice) obj).WinterFlowSoftwareProtocol(null);
                break;
            default:
                WinterFlowHandlerInvoker winterFlowHandlerInvoker = (WinterFlowHandlerInvoker) obj;
                winterFlowHandlerInvoker.WinterFlowSyntax();
                winterFlowHandlerInvoker.WinterFlowRouterStructure.WinterFlowConsumerUserManager();
                break;
        }
    }
}
