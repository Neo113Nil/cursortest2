package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponsePlatform extends WinterFlowDebugFramework implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowSyntaxTransactionManager WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowEventTool WinterFlowSyntax;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy = 0;
    public final /* synthetic */ WinterFlowTransactionManagerEncryption WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowResponsePlatform(WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager, WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption, WinterFlowEventTool winterFlowEventTool) {
        super(2);
        this.WinterFlowRouterRouter = winterFlowSyntaxTransactionManager;
        this.WinterFlowUnitTestResponse = winterFlowTransactionManagerEncryption;
        this.WinterFlowSyntax = winterFlowEventTool;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowEventTool winterFlowEventTool = this.WinterFlowSyntax;
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = this.WinterFlowRouterRouter;
        WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj;
                int intValue = ((Number) obj2).intValue();
                if (!winterFlowResolverLibrary.WinterFlowFrontendBackend(intValue & 1, (intValue & 3) != 2)) {
                    winterFlowResolverLibrary.WinterFlowQueueService();
                    break;
                } else {
                    winterFlowResolverLibrary.WinterFlowCompilerDataSource(866651995);
                    WinterFlowBackendTransactionManager.WinterFlowRouterStructure(winterFlowSyntaxTransactionManager, winterFlowTransactionManagerEncryption.WinterFlowTransactionAgent, winterFlowEventTool, winterFlowResolverLibrary, 0);
                    winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                    break;
                }
            default:
                ((Number) obj2).intValue();
                winterFlowTransactionManagerEncryption.WinterFlowRouterStructure(winterFlowSyntaxTransactionManager, winterFlowEventTool, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(1));
                break;
        }
        return winterFlowAlgorithmSession;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowResponsePlatform(WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption, WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager, WinterFlowEventTool winterFlowEventTool, int i) {
        super(2);
        this.WinterFlowUnitTestResponse = winterFlowTransactionManagerEncryption;
        this.WinterFlowRouterRouter = winterFlowSyntaxTransactionManager;
        this.WinterFlowSyntax = winterFlowEventTool;
    }
}
