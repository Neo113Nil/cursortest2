package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseSchemaStrategy {
    public final WinterFlowBandwidthServer WinterFlowRouterStructure;

    public WinterFlowDatabaseSchemaStrategy(WinterFlowObjectSession winterFlowObjectSession) {
        WinterFlowBandwidthServer winterFlowBandwidthServer = new WinterFlowBandwidthServer();
        winterFlowBandwidthServer.WinterFlowHookDataSource = new WinterFlowJSON(new WinterFlowModuleSyntax[16]);
        this.WinterFlowRouterStructure = winterFlowBandwidthServer;
        winterFlowObjectSession.WinterFlowUnitTestResponse(this);
    }

    public final void WinterFlowRouterStructure(int i, WinterFlowAlgorithmServer winterFlowAlgorithmServer, WinterFlowObjectSession winterFlowObjectSession, WinterFlowEventTool winterFlowEventTool) {
        WinterFlowObjectPackage winterFlowObjectPackage = new WinterFlowObjectPackage(winterFlowAlgorithmServer, winterFlowObjectSession, winterFlowEventTool, 14);
        WinterFlowBandwidthServer winterFlowBandwidthServer = this.WinterFlowRouterStructure;
        winterFlowBandwidthServer.getClass();
        if (i < 0) {
            WinterFlowValidatorConsumer.WinterFlowRouterStructure("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        WinterFlowModuleSyntax winterFlowModuleSyntax = new WinterFlowModuleSyntax(winterFlowBandwidthServer.WinterFlowRouterStructure, i, winterFlowObjectPackage);
        winterFlowBandwidthServer.WinterFlowRouterStructure += i;
        ((WinterFlowJSON) winterFlowBandwidthServer.WinterFlowHookDataSource).WinterFlowHookDataSource(winterFlowModuleSyntax);
    }
}
