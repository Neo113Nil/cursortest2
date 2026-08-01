package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProtocolModule extends WinterFlowThreadDebug {
    public static final WinterFlowProtocolModule WinterFlowArrayNetwork;
    public static final WinterFlowProtocolModule WinterFlowTransactionManagerStrategy;
    public static final WinterFlowProtocolModule WinterFlowUnitTestResponse;
    public static final WinterFlowProtocolModule WinterFlowVariableVersionControl;
    public final /* synthetic */ int WinterFlowCacheManagerAgent;

    static {
        int i = 1;
        WinterFlowArrayNetwork = new WinterFlowProtocolModule(i, 2, 0);
        int i2 = 1;
        WinterFlowVariableVersionControl = new WinterFlowProtocolModule(i2, i2, 1);
        WinterFlowTransactionManagerStrategy = new WinterFlowProtocolModule(i, 2, 2);
        int i3 = 1;
        WinterFlowUnitTestResponse = new WinterFlowProtocolModule(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowProtocolModule(int i, int i2, int i3) {
        super(i, i2);
        this.WinterFlowCacheManagerAgent = i3;
    }

    @Override // com.google.android.datatransport.WinterFlowThreadDebug
    public WinterFlowDatabaseSchemaHandler WinterFlowHookDataSource(WinterFlowProviderEntity winterFlowProviderEntity) {
        switch (this.WinterFlowCacheManagerAgent) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (WinterFlowDatabaseSchemaHandler) winterFlowProviderEntity.WinterFlowCacheManagerAgent(1);
            case 1:
                return (WinterFlowDatabaseSchemaHandler) winterFlowProviderEntity.WinterFlowCacheManagerAgent(0);
            default:
                return super.WinterFlowHookDataSource(winterFlowProviderEntity);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowThreadDebug
    public final void WinterFlowRouterStructure(WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowProcessorConsumer winterFlowProcessorConsumer, WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowValidator winterFlowValidator, WinterFlowListenerUtility winterFlowListenerUtility) {
        switch (this.WinterFlowCacheManagerAgent) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object WinterFlowRouterStructure = ((WinterFlowObjectUI) winterFlowProviderEntity.WinterFlowCacheManagerAgent(0)).WinterFlowRouterStructure();
                WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler = (WinterFlowDatabaseSchemaHandler) winterFlowProviderEntity.WinterFlowCacheManagerAgent(1);
                int WinterFlowHookDataSource = winterFlowProviderEntity.WinterFlowHookDataSource(0);
                winterFlowDatabaseSchemaHandler.getClass();
                winterFlowServiceProviderListener.WinterFlowConfiguration(winterFlowServiceProviderListener.WinterFlowCacheManagerAgent(winterFlowDatabaseSchemaHandler), WinterFlowRouterStructure);
                winterFlowProcessorConsumer.WinterFlowTransactionManagerStrategy(WinterFlowHookDataSource, WinterFlowRouterStructure);
                winterFlowProcessorConsumer.WinterFlowCacheManagerAgent(WinterFlowRouterStructure);
                break;
            case 1:
                WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler2 = (WinterFlowDatabaseSchemaHandler) winterFlowProviderEntity.WinterFlowCacheManagerAgent(0);
                int WinterFlowHookDataSource2 = winterFlowProviderEntity.WinterFlowHookDataSource(0);
                winterFlowProcessorConsumer.WinterFlowServiceUtility();
                winterFlowDatabaseSchemaHandler2.getClass();
                winterFlowProcessorConsumer.WinterFlowHookDataSource(WinterFlowHookDataSource2, winterFlowServiceProviderListener.WinterFlowCompilerVariable(winterFlowServiceProviderListener.WinterFlowCacheManagerAgent(winterFlowDatabaseSchemaHandler2)));
                break;
            case 2:
                Object WinterFlowCacheManagerAgent = winterFlowProviderEntity.WinterFlowCacheManagerAgent(0);
                WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler3 = (WinterFlowDatabaseSchemaHandler) winterFlowProviderEntity.WinterFlowCacheManagerAgent(1);
                int WinterFlowHookDataSource3 = winterFlowProviderEntity.WinterFlowHookDataSource(0);
                if (WinterFlowCacheManagerAgent instanceof WinterFlowFrontendHandler) {
                    WinterFlowFrontendHandler winterFlowFrontendHandler = (WinterFlowFrontendHandler) WinterFlowCacheManagerAgent;
                    winterFlowValidator.WinterFlowVariableVersionControl.WinterFlowHookDataSource(winterFlowFrontendHandler);
                    winterFlowValidator.WinterFlowArrayNetwork.WinterFlowRouterStructure(winterFlowFrontendHandler);
                }
                Object WinterFlowSoftwareEngine = winterFlowServiceProviderListener.WinterFlowSoftwareEngine(winterFlowServiceProviderListener.WinterFlowCacheManagerAgent(winterFlowDatabaseSchemaHandler3), WinterFlowHookDataSource3, WinterFlowCacheManagerAgent);
                if (!(WinterFlowSoftwareEngine instanceof WinterFlowFrontendHandler)) {
                    if (WinterFlowSoftwareEngine instanceof WinterFlowStackEngine) {
                        ((WinterFlowStackEngine) WinterFlowSoftwareEngine).WinterFlowCacheManagerAgent();
                        break;
                    }
                } else {
                    winterFlowValidator.WinterFlowVariableVersionControl((WinterFlowFrontendHandler) WinterFlowSoftwareEngine);
                    break;
                }
                break;
            default:
                Object WinterFlowCacheManagerAgent2 = winterFlowProviderEntity.WinterFlowCacheManagerAgent(0);
                int WinterFlowHookDataSource4 = winterFlowProviderEntity.WinterFlowHookDataSource(0);
                if (WinterFlowCacheManagerAgent2 instanceof WinterFlowFrontendHandler) {
                    WinterFlowFrontendHandler winterFlowFrontendHandler2 = (WinterFlowFrontendHandler) WinterFlowCacheManagerAgent2;
                    winterFlowValidator.WinterFlowVariableVersionControl.WinterFlowHookDataSource(winterFlowFrontendHandler2);
                    winterFlowValidator.WinterFlowArrayNetwork.WinterFlowRouterStructure(winterFlowFrontendHandler2);
                }
                Object WinterFlowSoftwareEngine2 = winterFlowServiceProviderListener.WinterFlowSoftwareEngine(winterFlowServiceProviderListener.WinterFlowBatchUI, WinterFlowHookDataSource4, WinterFlowCacheManagerAgent2);
                if (!(WinterFlowSoftwareEngine2 instanceof WinterFlowFrontendHandler)) {
                    if (WinterFlowSoftwareEngine2 instanceof WinterFlowStackEngine) {
                        ((WinterFlowStackEngine) WinterFlowSoftwareEngine2).WinterFlowCacheManagerAgent();
                        break;
                    }
                } else {
                    winterFlowValidator.WinterFlowVariableVersionControl((WinterFlowFrontendHandler) WinterFlowSoftwareEngine2);
                    break;
                }
                break;
        }
    }
}
