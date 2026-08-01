package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConsumerListener implements WinterFlowBackendServer {
    public WinterFlowAlgorithmModule WinterFlowArrayNetwork;
    public WinterFlowAlgorithmModule WinterFlowCacheManagerAgent;
    public WinterFlowAlgorithmModule WinterFlowHookDataSource;
    public WinterFlowObjectSession WinterFlowResponseEngine;
    public WinterFlowAlgorithmModule WinterFlowRouterRouter;
    public boolean WinterFlowRouterStructure;
    public WinterFlowVersionParser WinterFlowServerProtocol;
    public WinterFlowAlgorithmModule WinterFlowSyntax;
    public WinterFlowObjectSession WinterFlowTransactionAgent;
    public WinterFlowAlgorithmModule WinterFlowTransactionManagerStrategy;
    public WinterFlowAlgorithmModule WinterFlowUnitTestResponse;
    public WinterFlowAlgorithmModule WinterFlowVariableVersionControl;

    @Override // com.google.android.datatransport.WinterFlowBackendServer
    public final void WinterFlowArrayNetwork(WinterFlowDatabaseSchemaLibrary winterFlowDatabaseSchemaLibrary) {
        this.WinterFlowTransactionAgent = winterFlowDatabaseSchemaLibrary;
    }

    @Override // com.google.android.datatransport.WinterFlowBackendServer
    public final void WinterFlowCacheManagerAgent(WinterFlowDatabaseSchemaLibrary winterFlowDatabaseSchemaLibrary) {
        this.WinterFlowResponseEngine = winterFlowDatabaseSchemaLibrary;
    }

    @Override // com.google.android.datatransport.WinterFlowBackendServer
    public final void WinterFlowHookDataSource(boolean z) {
        this.WinterFlowRouterStructure = z;
    }

    @Override // com.google.android.datatransport.WinterFlowBackendServer
    public final boolean WinterFlowRouterStructure() {
        return this.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowBackendServer
    public final void WinterFlowVariableVersionControl(WinterFlowVersionParser winterFlowVersionParser) {
        this.WinterFlowServerProtocol = winterFlowVersionParser;
    }
}
