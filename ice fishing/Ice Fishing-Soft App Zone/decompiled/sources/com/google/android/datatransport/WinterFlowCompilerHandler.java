package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowCompilerHandler {
    public static final WinterFlowInvokerPackage[] WinterFlowHookDataSource;
    public static final WinterFlowViewSoftware WinterFlowRouterStructure;

    static {
        WinterFlowViewSoftware winterFlowViewSoftware = new WinterFlowViewSoftware(8);
        WinterFlowInvokerPackage.WinterFlowRouterStructure.getClass();
        WinterFlowSoftwareDatabase winterFlowSoftwareDatabase = WinterFlowPipelineQuery.WinterFlowUnitTestResponse;
        winterFlowViewSoftware.WinterFlowRouterRouter(1, winterFlowSoftwareDatabase);
        WinterFlowSoftwareDatabase winterFlowSoftwareDatabase2 = WinterFlowPipelineQuery.WinterFlowTransactionManagerStrategy;
        winterFlowViewSoftware.WinterFlowRouterRouter(2, winterFlowSoftwareDatabase2);
        WinterFlowSoftwareDatabase winterFlowSoftwareDatabase3 = WinterFlowPipelineQuery.WinterFlowHookDataSource;
        winterFlowViewSoftware.WinterFlowRouterRouter(4, winterFlowSoftwareDatabase3);
        WinterFlowSoftwareDatabase winterFlowSoftwareDatabase4 = WinterFlowPipelineQuery.WinterFlowArrayNetwork;
        winterFlowViewSoftware.WinterFlowRouterRouter(8, winterFlowSoftwareDatabase4);
        WinterFlowSoftwareDatabase winterFlowSoftwareDatabase5 = WinterFlowPipelineQuery.WinterFlowRouterRouter;
        winterFlowViewSoftware.WinterFlowRouterRouter(16, winterFlowSoftwareDatabase5);
        WinterFlowSoftwareDatabase winterFlowSoftwareDatabase6 = WinterFlowPipelineQuery.WinterFlowVariableVersionControl;
        winterFlowViewSoftware.WinterFlowRouterRouter(32, winterFlowSoftwareDatabase6);
        WinterFlowSoftwareDatabase winterFlowSoftwareDatabase7 = WinterFlowPipelineQuery.WinterFlowSyntax;
        winterFlowViewSoftware.WinterFlowRouterRouter(64, winterFlowSoftwareDatabase7);
        WinterFlowSoftwareDatabase winterFlowSoftwareDatabase8 = WinterFlowPipelineQuery.WinterFlowCacheManagerAgent;
        winterFlowViewSoftware.WinterFlowRouterRouter(128, winterFlowSoftwareDatabase8);
        WinterFlowRouterStructure = winterFlowViewSoftware;
        WinterFlowHookDataSource = new WinterFlowInvokerPackage[]{winterFlowSoftwareDatabase, winterFlowSoftwareDatabase2, winterFlowSoftwareDatabase3, winterFlowSoftwareDatabase7, winterFlowSoftwareDatabase5, winterFlowSoftwareDatabase6, winterFlowSoftwareDatabase4, WinterFlowPipelineQuery.WinterFlowResponseEngine, winterFlowSoftwareDatabase8};
    }

    public static final void WinterFlowRouterStructure(WinterFlowScriptProcessor winterFlowScriptProcessor, WinterFlowThreadListener winterFlowThreadListener, long j, int i, int i2) {
        if (WinterFlowPackageProcess.WinterFlowArrayNetwork(j, -1L)) {
            return;
        }
        winterFlowScriptProcessor.WinterFlowRouterStructure(winterFlowThreadListener.WinterFlowHookDataSource, (int) ((j >>> 48) & 65535));
        winterFlowScriptProcessor.WinterFlowRouterStructure(winterFlowThreadListener.WinterFlowCacheManagerAgent, (int) ((j >>> 32) & 65535));
        winterFlowScriptProcessor.WinterFlowRouterStructure(winterFlowThreadListener.WinterFlowArrayNetwork, i - ((int) ((j >>> 16) & 65535)));
        winterFlowScriptProcessor.WinterFlowRouterStructure(winterFlowThreadListener.WinterFlowVariableVersionControl, i2 - ((int) (j & 65535)));
    }
}
