package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxFramework extends WinterFlowUserManagerController implements WinterFlowProviderStructure, WinterFlowCacheInvoker {
    public boolean WinterFlowBackendCacheManager;
    public final WinterFlowTransactionManagerService WinterFlowBatchUI;
    public boolean WinterFlowResolverController;
    public boolean WinterFlowRouterAdapter;
    public final WinterFlowListenerMechanism WinterFlowSerializerStructure;
    public WinterFlowBackendBatch WinterFlowVariableBandwidth;
    public final WinterFlowRequestController WinterFlowMapperProtocol = new WinterFlowRequestController(0);
    public long WinterFlowConsumerUserManager = -1;

    public WinterFlowSyntaxFramework(WinterFlowBackendBatch winterFlowBackendBatch, WinterFlowTransactionManagerService winterFlowTransactionManagerService, boolean z, WinterFlowListenerMechanism winterFlowListenerMechanism) {
        this.WinterFlowVariableBandwidth = winterFlowBackendBatch;
        this.WinterFlowBatchUI = winterFlowTransactionManagerService;
        this.WinterFlowRouterAdapter = z;
        this.WinterFlowSerializerStructure = winterFlowListenerMechanism;
    }

    public static boolean WinterFlowUserManagerConcurrency(WinterFlowSyntaxFramework winterFlowSyntaxFramework, WinterFlowVersionParser winterFlowVersionParser, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = winterFlowSyntaxFramework.WinterFlowUIPlatform();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long WinterFlowWidgetProcess = winterFlowSyntaxFramework.WinterFlowWidgetProcess(winterFlowVersionParser, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (WinterFlowWidgetProcess >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (WinterFlowWidgetProcess & 4294967295L))) <= 0.5f;
    }

    @Override // com.google.android.datatransport.WinterFlowCacheInvoker
    public final void WinterFlowCacheManagerAgent(long j) {
        int WinterFlowBatchUI;
        long WinterFlowUIPlatform = WinterFlowUIPlatform();
        this.WinterFlowConsumerUserManager = j;
        int ordinal = this.WinterFlowVariableBandwidth.ordinal();
        if (ordinal == 0) {
            WinterFlowBatchUI = WinterFlowManagerRequest.WinterFlowBatchUI((int) (j & 4294967295L), (int) (WinterFlowUIPlatform & 4294967295L));
        } else {
            if (ordinal != 1) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                return;
            }
            WinterFlowBatchUI = WinterFlowManagerRequest.WinterFlowBatchUI((int) (j >> 32), (int) (WinterFlowUIPlatform >> 32));
        }
        if (WinterFlowBatchUI >= 0) {
            return;
        }
        long j2 = !this.WinterFlowRouterAdapter ? this.WinterFlowVariableBandwidth == WinterFlowBackendBatch.WinterFlowVariableVersionControl ? (((int) (WinterFlowUIPlatform & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L : (((int) (WinterFlowUIPlatform >> 32)) - ((int) (j >> 32))) << 32 : 0L;
        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) this.WinterFlowSerializerStructure.WinterFlowRouterStructure();
        if (winterFlowVersionParser == null || this.WinterFlowBackendCacheManager || this.WinterFlowResolverController || !WinterFlowUserManagerConcurrency(this, winterFlowVersionParser, WinterFlowUIPlatform, 0L, 2) || WinterFlowUserManagerConcurrency(this, winterFlowVersionParser, 0L, j2, 1)) {
            return;
        }
        this.WinterFlowResolverController = true;
        WinterFlowServerStack(j2);
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerController
    public final boolean WinterFlowRefactoringThreadPool() {
        return false;
    }

    public final void WinterFlowServerStack(long j) {
        WinterFlowWidgetConcurrency winterFlowWidgetConcurrency = WinterFlowFunctionDatabase.WinterFlowRouterStructure;
        WinterFlowInvokerRuntime winterFlowInvokerRuntime = (WinterFlowInvokerRuntime) WinterFlowEncryptionSubsystem.WinterFlowConcurrencyThread(this, winterFlowWidgetConcurrency);
        if (this.WinterFlowBackendCacheManager) {
            WinterFlowValidatorConsumer.WinterFlowCacheManagerAgent("launchAnimation called when previous animation was running");
        }
        ((WinterFlowInvokerRuntime) WinterFlowEncryptionSubsystem.WinterFlowConcurrencyThread(this, winterFlowWidgetConcurrency)).getClass();
        WinterFlowInvokerRuntime.WinterFlowRouterStructure.getClass();
        WinterFlowCacheRuntime.WinterFlowStrategyTool(WinterFlowModuleService(), null, new WinterFlowServiceProviderRefactoring(this, new WinterFlowJSONRepository(WinterFlowMicroserviceTool.WinterFlowHookDataSource), winterFlowInvokerRuntime, j, null), 1);
    }

    public final long WinterFlowUIPlatform() {
        long j = this.WinterFlowConsumerUserManager;
        if (WinterFlowJavaEntity.WinterFlowRouterStructure(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final float WinterFlowValidatorNetwork(WinterFlowInvokerRuntime winterFlowInvokerRuntime, long j) {
        float f;
        WinterFlowVersionParser winterFlowVersionParser;
        int compare;
        long j2 = this.WinterFlowConsumerUserManager;
        WinterFlowJSON winterFlowJSON = this.WinterFlowMapperProtocol.WinterFlowRouterStructure;
        int i = winterFlowJSON.WinterFlowUnitTestResponse - 1;
        Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
        if (i < objArr.length) {
            winterFlowVersionParser = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                WinterFlowVersionParser winterFlowVersionParser2 = (WinterFlowVersionParser) ((WinterFlowAlgorithmResolver) objArr[i]).WinterFlowRouterStructure.WinterFlowRouterStructure();
                if (winterFlowVersionParser2 != null) {
                    long WinterFlowHookDataSource = winterFlowVersionParser2.WinterFlowHookDataSource();
                    long WinterFlowUserManagerUserManager = WinterFlowServerManager.WinterFlowUserManagerUserManager(WinterFlowUIPlatform());
                    f = 0.0f;
                    int ordinal = this.WinterFlowVariableBandwidth.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Float.intBitsToFloat((int) (WinterFlowHookDataSource & 4294967295L)), Float.intBitsToFloat((int) (WinterFlowUserManagerUserManager & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                            return 0.0f;
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (WinterFlowHookDataSource >> 32)), Float.intBitsToFloat((int) (WinterFlowUserManagerUserManager >> 32)));
                    }
                    if (compare <= 0) {
                        winterFlowVersionParser = winterFlowVersionParser2;
                    } else if (winterFlowVersionParser == null) {
                        winterFlowVersionParser = winterFlowVersionParser2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            winterFlowVersionParser = null;
        }
        if (winterFlowVersionParser == null) {
            WinterFlowVersionParser winterFlowVersionParser3 = this.WinterFlowResolverController ? (WinterFlowVersionParser) this.WinterFlowSerializerStructure.WinterFlowRouterStructure() : null;
            if (winterFlowVersionParser3 == null) {
                return f;
            }
            winterFlowVersionParser = winterFlowVersionParser3;
        }
        long WinterFlowUserManagerUserManager2 = WinterFlowServerManager.WinterFlowUserManagerUserManager(j2);
        int ordinal2 = this.WinterFlowVariableBandwidth.ordinal();
        if (ordinal2 == 0) {
            float f2 = winterFlowVersionParser.WinterFlowHookDataSource;
            return winterFlowInvokerRuntime.WinterFlowRouterStructure(f2 - ((int) (j & 4294967295L)), winterFlowVersionParser.WinterFlowArrayNetwork - f2, Float.intBitsToFloat((int) (WinterFlowUserManagerUserManager2 & 4294967295L)));
        }
        if (ordinal2 == 1) {
            float f3 = winterFlowVersionParser.WinterFlowRouterStructure;
            return winterFlowInvokerRuntime.WinterFlowRouterStructure(f3 - ((int) (j >> 32)), winterFlowVersionParser.WinterFlowCacheManagerAgent - f3, Float.intBitsToFloat((int) (WinterFlowUserManagerUserManager2 >> 32)));
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
        return f;
    }

    public final long WinterFlowWidgetProcess(WinterFlowVersionParser winterFlowVersionParser, long j, long j2) {
        long WinterFlowUserManagerUserManager = WinterFlowServerManager.WinterFlowUserManagerUserManager(j);
        int ordinal = this.WinterFlowVariableBandwidth.ordinal();
        if (ordinal == 0) {
            WinterFlowInvokerRuntime winterFlowInvokerRuntime = (WinterFlowInvokerRuntime) WinterFlowEncryptionSubsystem.WinterFlowConcurrencyThread(this, WinterFlowFunctionDatabase.WinterFlowRouterStructure);
            float f = winterFlowVersionParser.WinterFlowHookDataSource;
            float WinterFlowRouterStructure = winterFlowInvokerRuntime.WinterFlowRouterStructure(f - ((int) (j2 & 4294967295L)), winterFlowVersionParser.WinterFlowArrayNetwork - f, Float.intBitsToFloat((int) (WinterFlowUserManagerUserManager & 4294967295L)));
            return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(WinterFlowRouterStructure) & 4294967295L);
        }
        if (ordinal != 1) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
            return 0L;
        }
        WinterFlowInvokerRuntime winterFlowInvokerRuntime2 = (WinterFlowInvokerRuntime) WinterFlowEncryptionSubsystem.WinterFlowConcurrencyThread(this, WinterFlowFunctionDatabase.WinterFlowRouterStructure);
        float f2 = winterFlowVersionParser.WinterFlowRouterStructure;
        return (Float.floatToRawIntBits(winterFlowInvokerRuntime2.WinterFlowRouterStructure(f2 - ((int) (j2 >> 32)), winterFlowVersionParser.WinterFlowCacheManagerAgent - f2, Float.intBitsToFloat((int) (WinterFlowUserManagerUserManager >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
    }
}
