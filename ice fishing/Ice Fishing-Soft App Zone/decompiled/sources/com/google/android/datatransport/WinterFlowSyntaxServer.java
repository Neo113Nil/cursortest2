package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowSyntaxServer implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowMapperManager WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowObjectSession WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowSyntaxServer(WinterFlowMapperManager winterFlowMapperManager, WinterFlowObjectSession winterFlowObjectSession, int i, int i2) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowTransactionManagerStrategy = winterFlowMapperManager;
        this.WinterFlowUnitTestResponse = winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowObjectSession winterFlowObjectSession = this.WinterFlowUnitTestResponse;
        WinterFlowMapperManager winterFlowMapperManager = this.WinterFlowTransactionManagerStrategy;
        WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowInvokerComponent.WinterFlowHookDataSource(WinterFlowConfigurationException.WinterFlowResponseEngine(1), winterFlowObjectSession, winterFlowResolverLibrary, winterFlowMapperManager);
                break;
            default:
                WinterFlowSoftwareException.WinterFlowRouterRouter(WinterFlowConfigurationException.WinterFlowResponseEngine(7), winterFlowObjectSession, winterFlowResolverLibrary, winterFlowMapperManager);
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
