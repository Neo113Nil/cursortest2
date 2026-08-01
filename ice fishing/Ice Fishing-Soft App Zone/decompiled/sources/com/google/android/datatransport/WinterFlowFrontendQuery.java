package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrontendQuery extends WinterFlowSoftwareSubsystem {
    public WinterFlowProxyValidator WinterFlowResponseEngine;
    public final WinterFlowResolverSubsystem WinterFlowRouterRouter;
    public float WinterFlowSyntax;
    public final WinterFlowScriptHandler WinterFlowUnitTestResponse;
    public final WinterFlowResolverSubsystem WinterFlowVariableVersionControl = WinterFlowDecoratorUI.WinterFlowSerializerStructure(new WinterFlowModuleBandwidth(0));
    public final WinterFlowResolverSubsystem WinterFlowTransactionManagerStrategy = WinterFlowDecoratorUI.WinterFlowSerializerStructure(Boolean.FALSE);

    public WinterFlowFrontendQuery(WinterFlowMicroserviceHandler winterFlowMicroserviceHandler) {
        WinterFlowScriptHandler winterFlowScriptHandler = new WinterFlowScriptHandler(winterFlowMicroserviceHandler);
        winterFlowScriptHandler.WinterFlowVariableVersionControl = new WinterFlowRouterEngine(15, this);
        this.WinterFlowUnitTestResponse = winterFlowScriptHandler;
        this.WinterFlowRouterRouter = new WinterFlowResolverSubsystem(WinterFlowAlgorithmSession.WinterFlowRouterStructure, WinterFlowSessionManagerProcess.WinterFlowRouterAdapter);
        this.WinterFlowSyntax = 1.0f;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareSubsystem
    public final long WinterFlowArrayNetwork() {
        return ((WinterFlowModuleBandwidth) this.WinterFlowVariableVersionControl.getValue()).WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareSubsystem
    public final void WinterFlowHookDataSource(WinterFlowProxyValidator winterFlowProxyValidator) {
        this.WinterFlowResponseEngine = winterFlowProxyValidator;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareSubsystem
    public final void WinterFlowRouterStructure(float f) {
        this.WinterFlowSyntax = f;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareSubsystem
    public final void WinterFlowVariableVersionControl(WinterFlowParserUserManager winterFlowParserUserManager) {
        WinterFlowProxyValidator winterFlowProxyValidator = this.WinterFlowResponseEngine;
        WinterFlowScriptHandler winterFlowScriptHandler = this.WinterFlowUnitTestResponse;
        if (winterFlowProxyValidator == null) {
            winterFlowProxyValidator = (WinterFlowProxyValidator) winterFlowScriptHandler.WinterFlowTransactionManagerStrategy.getValue();
        }
        if (((Boolean) this.WinterFlowTransactionManagerStrategy.getValue()).booleanValue() && winterFlowParserUserManager.getLayoutDirection() == WinterFlowCacheManagerConfiguration.WinterFlowTransactionManagerStrategy) {
            long WinterFlowCompilerHandler = winterFlowParserUserManager.WinterFlowCompilerHandler();
            WinterFlowObjectPackage WinterFlowSerializerStructure = winterFlowParserUserManager.WinterFlowSerializerStructure();
            long WinterFlowThreadListener = WinterFlowSerializerStructure.WinterFlowThreadListener();
            WinterFlowSerializerStructure.WinterFlowTransactionAgent().WinterFlowTransactionAgent();
            try {
                ((WinterFlowConfigurationModule) WinterFlowSerializerStructure.WinterFlowTransactionManagerStrategy).WinterFlowConcurrencyThread(-1.0f, 1.0f, WinterFlowCompilerHandler);
                winterFlowScriptHandler.WinterFlowVariableVersionControl(winterFlowParserUserManager, this.WinterFlowSyntax, winterFlowProxyValidator);
            } finally {
                WinterFlowSerializerStructure.WinterFlowTransactionAgent().WinterFlowResponseEngine();
                WinterFlowSerializerStructure.WinterFlowArrayHelper(WinterFlowThreadListener);
            }
        } else {
            winterFlowScriptHandler.WinterFlowVariableVersionControl(winterFlowParserUserManager, this.WinterFlowSyntax, winterFlowProxyValidator);
        }
        this.WinterFlowRouterRouter.getValue();
    }
}
