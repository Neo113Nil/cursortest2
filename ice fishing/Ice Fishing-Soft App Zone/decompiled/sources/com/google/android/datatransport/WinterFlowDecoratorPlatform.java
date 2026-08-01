package com.google.android.datatransport;

import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDecoratorPlatform implements WinterFlowRefactoringServer {
    public static final WinterFlowCacheManagerVersionControl WinterFlowSyntax = new WinterFlowCacheManagerVersionControl(1, new WinterFlowHandlerTool(15), new WinterFlowSessionJava(9));
    public final WinterFlowCompilerCloud WinterFlowRouterRouter;
    public final WinterFlowDatabaseSchemaStructure WinterFlowTransactionManagerStrategy;
    public WinterFlowEncryptionComponent WinterFlowUnitTestResponse;
    public final Map WinterFlowVariableVersionControl;

    public WinterFlowDecoratorPlatform(Map map) {
        this.WinterFlowVariableVersionControl = map;
        long[] jArr = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowDatabaseSchemaStructure();
        this.WinterFlowRouterRouter = new WinterFlowCompilerCloud(24, this);
    }

    @Override // com.google.android.datatransport.WinterFlowRefactoringServer
    public final void WinterFlowHookDataSource(Object obj, WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        int i2;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(533563200);
        if ((i & 6) == 0) {
            i2 = (winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventTool) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(this) ? 256 : 128;
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 147) != 146)) {
            winterFlowResolverLibrary.WinterFlowOrchestrationConfiguration(obj);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
                WinterFlowCompilerCloud winterFlowCompilerCloud = this.WinterFlowRouterRouter;
                if (!((Boolean) winterFlowCompilerCloud.WinterFlowUnitTestResponse(obj)).booleanValue()) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterAdapter("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.WinterFlowVariableVersionControl.get(obj);
                WinterFlowPipelineHelper winterFlowPipelineHelper = WinterFlowModuleEngine.WinterFlowRouterStructure;
                WinterFlowTransactionManagerEventEmitter winterFlowTransactionManagerEventEmitter = new WinterFlowTransactionManagerEventEmitter(new WinterFlowParserSystem(map, winterFlowCompilerCloud));
                winterFlowResolverLibrary.WinterFlowArrayFramework(winterFlowTransactionManagerEventEmitter);
                WinterFlowSyntaxSubsystem = winterFlowTransactionManagerEventEmitter;
            }
            WinterFlowTransactionManagerEventEmitter winterFlowTransactionManagerEventEmitter2 = (WinterFlowTransactionManagerEventEmitter) WinterFlowSyntaxSubsystem;
            WinterFlowHandlerWebsocket.WinterFlowCacheManagerAgent(new WinterFlowRepositoryWorker[]{WinterFlowModuleEngine.WinterFlowRouterStructure.WinterFlowRouterStructure(winterFlowTransactionManagerEventEmitter2), WinterFlowDatabaseLayer.WinterFlowRouterStructure.WinterFlowRouterStructure(winterFlowTransactionManagerEventEmitter2)}, winterFlowEventTool, winterFlowResolverLibrary, (i2 & 112) | 8);
            boolean WinterFlowUnitTestResponse = winterFlowResolverLibrary.WinterFlowUnitTestResponse(this) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowTransactionManagerEventEmitter2);
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse || WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
                WinterFlowSyntaxSubsystem2 = new WinterFlowUserManagerModule(this, obj, winterFlowTransactionManagerEventEmitter2, 5);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
            }
            WinterFlowSoftwareException.WinterFlowHookDataSource(WinterFlowAlgorithmSession.WinterFlowRouterStructure, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem2, winterFlowResolverLibrary);
            if (winterFlowResolverLibrary.WinterFlowConsumerUserManager && winterFlowResolverLibrary.WinterFlowPackageIDE.WinterFlowSyntax == winterFlowResolverLibrary.WinterFlowBackendCacheManager) {
                winterFlowResolverLibrary.WinterFlowBackendCacheManager = -1;
                winterFlowResolverLibrary.WinterFlowConsumerUserManager = false;
            }
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowRefactoring((WinterFlowRefactoringServer) this, obj, winterFlowEventTool, i, 4);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowRefactoringServer
    public final void WinterFlowRouterStructure(Object obj) {
        if (this.WinterFlowTransactionManagerStrategy.WinterFlowTransactionAgent(obj) == null) {
            this.WinterFlowVariableVersionControl.remove(obj);
        }
    }
}
