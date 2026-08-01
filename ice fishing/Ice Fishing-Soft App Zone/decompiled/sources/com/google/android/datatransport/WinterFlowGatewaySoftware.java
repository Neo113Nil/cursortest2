package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowGatewaySoftware extends WinterFlowMicroserviceRefactoring {
    public final WinterFlowFrontendProcess WinterFlowSyntax;

    public WinterFlowGatewaySoftware(WinterFlowFrontendProcess winterFlowFrontendProcess) {
        this.WinterFlowSyntax = winterFlowFrontendProcess;
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceRefactoring
    public final void WinterFlowServiceUtility(Throwable th) {
        Object WinterFlowTestingNode = WinterFlowServerProtocol().WinterFlowTestingNode();
        boolean z = WinterFlowTestingNode instanceof WinterFlowSessionManagerSessionManager;
        WinterFlowFrontendProcess winterFlowFrontendProcess = this.WinterFlowSyntax;
        if (z) {
            winterFlowFrontendProcess.WinterFlowSyntax(WinterFlowPackageProcess.WinterFlowHookDataSource(((WinterFlowSessionManagerSessionManager) WinterFlowTestingNode).WinterFlowRouterStructure));
        } else {
            winterFlowFrontendProcess.WinterFlowSyntax(WinterFlowHandlerWebsocket.WinterFlowFrontendBackend(WinterFlowTestingNode));
        }
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceRefactoring
    public final boolean WinterFlowThreadListener() {
        return false;
    }
}
