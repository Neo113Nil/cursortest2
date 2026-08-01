package com.google.android.datatransport;

import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectUserManager implements WinterFlowEncryptionComponent, WinterFlowRefactoringServer {
    public final WinterFlowRefactoringServer WinterFlowTransactionManagerStrategy;
    public final WinterFlowCacheManagerTransactionManager WinterFlowUnitTestResponse;
    public final WinterFlowParserSystem WinterFlowVariableVersionControl;

    public WinterFlowObjectUserManager(WinterFlowEncryptionComponent winterFlowEncryptionComponent, Map map, WinterFlowRefactoringServer winterFlowRefactoringServer) {
        WinterFlowCompilerCloud winterFlowCompilerCloud = new WinterFlowCompilerCloud(12, winterFlowEncryptionComponent);
        WinterFlowPipelineHelper winterFlowPipelineHelper = WinterFlowModuleEngine.WinterFlowRouterStructure;
        this.WinterFlowVariableVersionControl = new WinterFlowParserSystem(map, winterFlowCompilerCloud);
        this.WinterFlowTransactionManagerStrategy = winterFlowRefactoringServer;
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = WinterFlowLoaderSessionManager.WinterFlowRouterStructure;
        this.WinterFlowUnitTestResponse = new WinterFlowCacheManagerTransactionManager();
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final WinterFlowLoaderHook WinterFlowArrayNetwork(String str, WinterFlowObjectUI winterFlowObjectUI) {
        return this.WinterFlowVariableVersionControl.WinterFlowArrayNetwork(str, winterFlowObjectUI);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final boolean WinterFlowCacheManagerAgent(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowRefactoringServer
    public final void WinterFlowHookDataSource(Object obj, WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        int i2;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-858296452);
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
            this.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource(obj, winterFlowEventTool, winterFlowResolverLibrary, i2 & 126);
            boolean WinterFlowUnitTestResponse = winterFlowResolverLibrary.WinterFlowUnitTestResponse(this) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                WinterFlowSyntaxSubsystem = new WinterFlowRouterCompiler(15, this, obj);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowSoftwareException.WinterFlowHookDataSource(obj, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowRefactoring((WinterFlowRefactoringServer) this, obj, winterFlowEventTool, i, 2);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowRefactoringServer
    public final void WinterFlowRouterStructure(Object obj) {
        this.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final Object WinterFlowTransactionManagerStrategy(String str) {
        return this.WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy(str);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final Map WinterFlowVariableVersionControl() {
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = this.WinterFlowUnitTestResponse;
        Object[] objArr = winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource;
        long[] jArr = winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl();
    }
}
