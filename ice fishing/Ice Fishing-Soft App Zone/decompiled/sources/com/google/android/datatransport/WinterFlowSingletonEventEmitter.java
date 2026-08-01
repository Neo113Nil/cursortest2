package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowSingletonEventEmitter implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowMapperManager WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowSingletonEventEmitter(WinterFlowMapperManager winterFlowMapperManager, int i, int i2) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowTransactionManagerStrategy = winterFlowMapperManager;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowMapperManager winterFlowMapperManager = this.WinterFlowTransactionManagerStrategy;
        WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowLibrary.WinterFlowRouterStructure(winterFlowMapperManager, winterFlowResolverLibrary, WinterFlowConfigurationException.WinterFlowResponseEngine(1));
                break;
            case 1:
                WinterFlowCloudStack.WinterFlowHookDataSource(winterFlowMapperManager, winterFlowResolverLibrary, WinterFlowConfigurationException.WinterFlowResponseEngine(1));
                break;
            default:
                WinterFlowManagerRequest.WinterFlowResponseEngine(winterFlowMapperManager, winterFlowResolverLibrary, WinterFlowConfigurationException.WinterFlowResponseEngine(1));
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
