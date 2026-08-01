package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowController extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ WinterFlowBandwidthTransaction WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowDeploymentWidget WinterFlowRouterRouter;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowTransactionAgent;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowDeploymentWidget WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowController(WinterFlowDeploymentWidget winterFlowDeploymentWidget, WinterFlowDeploymentWidget winterFlowDeploymentWidget2, Object obj, int i, WinterFlowBandwidthTransaction winterFlowBandwidthTransaction, int i2) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = winterFlowDeploymentWidget;
        this.WinterFlowRouterRouter = winterFlowDeploymentWidget2;
        this.WinterFlowTransactionAgent = obj;
        this.WinterFlowSyntax = i;
        this.WinterFlowResponseEngine = winterFlowBandwidthTransaction;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowBandwidthTransaction winterFlowBandwidthTransaction = this.WinterFlowResponseEngine;
        int i2 = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowTransactionAgent;
        WinterFlowDeploymentWidget winterFlowDeploymentWidget = this.WinterFlowRouterRouter;
        WinterFlowDeploymentWidget winterFlowDeploymentWidget2 = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowThreadSystem winterFlowThreadSystem = (WinterFlowThreadSystem) obj;
                if (winterFlowDeploymentWidget2 != ((WinterFlowHookMechanism) ((WinterFlowSyntaxTransactionManager) WinterFlowCloudStack.WinterFlowTestingNode(winterFlowDeploymentWidget)).getFocusOwner()).WinterFlowTransactionManagerStrategy()) {
                    return Boolean.TRUE;
                }
                boolean WinterFlowCacheTool = WinterFlowCacheRuntime.WinterFlowCacheTool(winterFlowDeploymentWidget, (WinterFlowDeploymentWidget) obj2, i2, winterFlowBandwidthTransaction);
                Boolean valueOf = Boolean.valueOf(WinterFlowCacheTool);
                if (WinterFlowCacheTool || !winterFlowThreadSystem.WinterFlowRouterStructure()) {
                    return valueOf;
                }
                return null;
            default:
                WinterFlowThreadSystem winterFlowThreadSystem2 = (WinterFlowThreadSystem) obj;
                if (winterFlowDeploymentWidget2 != ((WinterFlowHookMechanism) ((WinterFlowSyntaxTransactionManager) WinterFlowCloudStack.WinterFlowTestingNode(winterFlowDeploymentWidget)).getFocusOwner()).WinterFlowTransactionManagerStrategy()) {
                    return Boolean.TRUE;
                }
                boolean WinterFlowVariableBandwidth = WinterFlowProviderRouter.WinterFlowVariableBandwidth(i2, winterFlowBandwidthTransaction, winterFlowDeploymentWidget, (WinterFlowVersionParser) obj2);
                Boolean valueOf2 = Boolean.valueOf(WinterFlowVariableBandwidth);
                if (WinterFlowVariableBandwidth || !winterFlowThreadSystem2.WinterFlowRouterStructure()) {
                    return valueOf2;
                }
                return null;
        }
    }
}
