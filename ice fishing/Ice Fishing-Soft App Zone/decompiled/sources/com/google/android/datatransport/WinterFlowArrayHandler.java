package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowArrayHandler implements WinterFlowObjectUI {
    public final /* synthetic */ WinterFlowDataSourceConsumer WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowArrayHandler(WinterFlowDataSourceConsumer winterFlowDataSourceConsumer, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowDataSourceConsumer;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        WinterFlowLibraryDeployment winterFlowLibraryDeployment;
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDataSourceConsumer winterFlowDataSourceConsumer = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowModuleHandler winterFlowModuleHandler = (WinterFlowModuleHandler) WinterFlowEncryptionSubsystem.WinterFlowConcurrencyThread(winterFlowDataSourceConsumer, WinterFlowAlgorithmUserManager.WinterFlowRouterStructure);
                if (winterFlowModuleHandler == null) {
                    WinterFlowValidatorConsumer.WinterFlowRouterStructure("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + winterFlowModuleHandler);
                }
                WinterFlowModuleHandler winterFlowModuleHandler2 = winterFlowDataSourceConsumer.WinterFlowBackendCacheManager;
                winterFlowDataSourceConsumer.WinterFlowBackendCacheManager = winterFlowModuleHandler;
                if (winterFlowModuleHandler2 != null && !WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowModuleHandler, winterFlowModuleHandler2) && ((winterFlowLibraryDeployment = winterFlowDataSourceConsumer.WinterFlowArrayHelper) != null || !winterFlowDataSourceConsumer.WinterFlowUserManagerUserManager)) {
                    if (winterFlowLibraryDeployment != null) {
                        winterFlowDataSourceConsumer.WinterFlowUIPlatform(winterFlowLibraryDeployment);
                    }
                    winterFlowDataSourceConsumer.WinterFlowArrayHelper = null;
                    winterFlowDataSourceConsumer.WinterFlowRepositoryAlgorithm();
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            default:
                winterFlowDataSourceConsumer.WinterFlowResolverController.WinterFlowRouterStructure();
                return Boolean.TRUE;
        }
    }
}
