package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowUILibrary implements WinterFlowEventEvent {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowEventTool WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowUILibrary(WinterFlowEventTool winterFlowEventTool, Object obj, int i) {
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowTransactionManagerStrategy = winterFlowEventTool;
        this.WinterFlowRouterRouter = obj;
        this.WinterFlowUnitTestResponse = i;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        int i2 = this.WinterFlowUnitTestResponse;
        WinterFlowEventTool winterFlowEventTool = this.WinterFlowTransactionManagerStrategy;
        Object obj3 = this.WinterFlowRouterRouter;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                winterFlowEventTool.WinterFlowTransactionManagerStrategy(obj3, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(i2) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                WinterFlowHandlerWebsocket.WinterFlowHookDataSource((WinterFlowRepositoryWorker) obj3, winterFlowEventTool, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                WinterFlowHandlerWebsocket.WinterFlowCacheManagerAgent((WinterFlowRepositoryWorker[]) obj3, winterFlowEventTool, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(i2 | 1));
                break;
        }
        return winterFlowAlgorithmSession;
    }

    public /* synthetic */ WinterFlowUILibrary(Object obj, WinterFlowEventTool winterFlowEventTool, int i, int i2) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowRouterRouter = obj;
        this.WinterFlowTransactionManagerStrategy = winterFlowEventTool;
        this.WinterFlowUnitTestResponse = i;
    }
}
