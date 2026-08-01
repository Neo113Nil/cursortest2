package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloudSubsystem extends WinterFlowDebugFramework implements WinterFlowControllerScript {
    public final /* synthetic */ WinterFlowSessionManagerRequest WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowEventTool WinterFlowSyntax;
    public final /* synthetic */ WinterFlowPackageResolver WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowCloudSubsystem(WinterFlowPackageResolver winterFlowPackageResolver, Object obj, WinterFlowSessionManagerRequest winterFlowSessionManagerRequest, WinterFlowEventTool winterFlowEventTool) {
        super(3);
        this.WinterFlowTransactionManagerStrategy = winterFlowPackageResolver;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowRouterRouter = winterFlowSessionManagerRequest;
        this.WinterFlowSyntax = winterFlowEventTool;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerScript
    public final Object WinterFlowArrayNetwork(Object obj, Object obj2, Object obj3) {
        WinterFlowDeploymentHandler winterFlowDeploymentHandler = (WinterFlowDeploymentHandler) obj;
        WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowDeploymentHandler) : winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowDeploymentHandler) ? 4 : 2;
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(intValue & 1, (intValue & 19) != 18)) {
            WinterFlowPackageResolver winterFlowPackageResolver = this.WinterFlowTransactionManagerStrategy;
            boolean WinterFlowVariableVersionControl = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowPackageResolver);
            Object obj4 = this.WinterFlowUnitTestResponse;
            boolean WinterFlowUnitTestResponse = WinterFlowVariableVersionControl | winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj4);
            WinterFlowSessionManagerRequest winterFlowSessionManagerRequest = this.WinterFlowRouterRouter;
            boolean WinterFlowUnitTestResponse2 = WinterFlowUnitTestResponse | winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowSessionManagerRequest);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
                WinterFlowSyntaxSubsystem = new WinterFlowBandwidthTransaction(winterFlowPackageResolver, obj4, winterFlowSessionManagerRequest, 1);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowSoftwareException.WinterFlowHookDataSource(winterFlowDeploymentHandler, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary);
            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowSessionManagerRequest.WinterFlowArrayNetwork;
            winterFlowDeploymentHandler.getClass();
            winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(obj4, ((WinterFlowPackageEntity) winterFlowDeploymentHandler).WinterFlowRouterStructure);
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
                WinterFlowSyntaxSubsystem2 = new WinterFlowRefactoringJSON();
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
            }
            this.WinterFlowSyntax.WinterFlowTransactionAgent((WinterFlowRefactoringJSON) WinterFlowSyntaxSubsystem2, obj4, winterFlowResolverLibrary, 0);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
