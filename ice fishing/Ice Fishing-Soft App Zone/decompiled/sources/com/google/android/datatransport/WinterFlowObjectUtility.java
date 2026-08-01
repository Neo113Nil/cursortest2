package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectUtility implements WinterFlowDatabaseGateway {
    public final WinterFlowThreadProtocol WinterFlowArrayNetwork;
    public final WinterFlowCacheManagerVersionControl WinterFlowCacheManagerAgent;
    public final WinterFlowDatabaseSchemaTesting WinterFlowHookDataSource;
    public final WinterFlowEventWorker WinterFlowRouterStructure;
    public final WinterFlowCompilerCloud WinterFlowTransactionManagerStrategy;
    public final WinterFlowConfigurationModule WinterFlowVariableVersionControl;

    public WinterFlowObjectUtility(WinterFlowEventWorker winterFlowEventWorker, WinterFlowDatabaseSchemaTesting winterFlowDatabaseSchemaTesting) {
        WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = WinterFlowValidatorModule.WinterFlowRouterStructure;
        WinterFlowThreadProtocol winterFlowThreadProtocol = new WinterFlowThreadProtocol(WinterFlowValidatorModule.WinterFlowHookDataSource);
        WinterFlowConfigurationModule winterFlowConfigurationModule = new WinterFlowConfigurationModule(25);
        this.WinterFlowRouterStructure = winterFlowEventWorker;
        this.WinterFlowHookDataSource = winterFlowDatabaseSchemaTesting;
        this.WinterFlowCacheManagerAgent = winterFlowCacheManagerVersionControl;
        this.WinterFlowArrayNetwork = winterFlowThreadProtocol;
        this.WinterFlowVariableVersionControl = winterFlowConfigurationModule;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowCompilerCloud(5, this);
    }

    public final WinterFlowControllerInvoker WinterFlowHookDataSource(WinterFlowRendererSystem winterFlowRendererSystem, WinterFlowObjectHook winterFlowObjectHook, int i, int i2) {
        int i3 = this.WinterFlowHookDataSource.WinterFlowVariableVersionControl;
        return WinterFlowRouterStructure(new WinterFlowMapperParser(winterFlowRendererSystem, (i3 == 0 || i3 == Integer.MAX_VALUE) ? winterFlowObjectHook : new WinterFlowObjectHook(WinterFlowDecoratorUI.WinterFlowSyntax(winterFlowObjectHook.WinterFlowVariableVersionControl + i3, 1, 1000)), i, i2, null));
    }

    public final WinterFlowControllerInvoker WinterFlowRouterStructure(WinterFlowMapperParser winterFlowMapperParser) {
        WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = this.WinterFlowCacheManagerAgent;
        WinterFlowRouterCompiler winterFlowRouterCompiler = new WinterFlowRouterCompiler(10, this, winterFlowMapperParser);
        synchronized (((WinterFlowAlgorithmDebug) winterFlowCacheManagerVersionControl.WinterFlowTransactionManagerStrategy)) {
            WinterFlowControllerInvoker winterFlowControllerInvoker = (WinterFlowControllerInvoker) ((WinterFlowThreadNode) winterFlowCacheManagerVersionControl.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(winterFlowMapperParser);
            if (winterFlowControllerInvoker != null) {
                if (winterFlowControllerInvoker.WinterFlowHookDataSource()) {
                    return winterFlowControllerInvoker;
                }
            }
            try {
                WinterFlowControllerInvoker winterFlowControllerInvoker2 = (WinterFlowControllerInvoker) winterFlowRouterCompiler.WinterFlowUnitTestResponse(new WinterFlowDataSourceVersionControl(5, winterFlowCacheManagerVersionControl, winterFlowMapperParser));
                synchronized (((WinterFlowAlgorithmDebug) winterFlowCacheManagerVersionControl.WinterFlowTransactionManagerStrategy)) {
                    if (((WinterFlowThreadNode) winterFlowCacheManagerVersionControl.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(winterFlowMapperParser) == null && winterFlowControllerInvoker2.WinterFlowHookDataSource()) {
                        ((WinterFlowThreadNode) winterFlowCacheManagerVersionControl.WinterFlowUnitTestResponse).WinterFlowArrayNetwork(winterFlowMapperParser, winterFlowControllerInvoker2);
                    }
                }
                return winterFlowControllerInvoker2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
