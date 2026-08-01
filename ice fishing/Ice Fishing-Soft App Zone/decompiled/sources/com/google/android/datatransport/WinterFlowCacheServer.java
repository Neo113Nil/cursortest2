package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheServer {
    public WinterFlowNodeProtocol WinterFlowHookDataSource;
    public WinterFlowDatabaseProtocol WinterFlowRouterStructure;

    public final void WinterFlowRouterStructure(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
        WinterFlowDatabaseProtocol WinterFlowRouterStructure = winterFlowMicroserviceProcess.WinterFlowRouterStructure();
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol = this.WinterFlowRouterStructure;
        if (WinterFlowRouterStructure.compareTo(winterFlowDatabaseProtocol) < 0) {
            winterFlowDatabaseProtocol = WinterFlowRouterStructure;
        }
        this.WinterFlowRouterStructure = winterFlowDatabaseProtocol;
        this.WinterFlowHookDataSource.WinterFlowTransactionAgent(winterFlowDecoratorVersion, winterFlowMicroserviceProcess);
        this.WinterFlowRouterStructure = WinterFlowRouterStructure;
    }
}
