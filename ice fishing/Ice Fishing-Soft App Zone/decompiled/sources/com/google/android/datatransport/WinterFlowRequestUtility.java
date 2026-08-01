package com.google.android.datatransport;

import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowRequestUtility extends WinterFlowViewTesting implements WinterFlowNodeException, WinterFlowJavaFunction {
    public boolean WinterFlowBandwidthObject;
    public WinterFlowListenerPlatform WinterFlowConcurrencyThread;
    public final WinterFlowRequestModule WinterFlowOrchestrationSubsystem = new WinterFlowRequestModule(0, this);
    public WinterFlowScriptProcessor WinterFlowResponseEngine;
    public WinterFlowCacheManagerInvoker WinterFlowServerProtocol;
    public boolean WinterFlowServiceUtility;
    public WinterFlowDatabaseSchemaStructure WinterFlowSingletonPlatform;
    public boolean WinterFlowThreadListener;
    public WinterFlowObjectSession WinterFlowTransactionAgent;

    public static void WinterFlowUIThreadPool(WinterFlowUIMicroservice winterFlowUIMicroservice) {
        WinterFlowBandwidthFramework winterFlowBandwidthFramework;
        WinterFlowUIMicroservice winterFlowUIMicroservice2 = winterFlowUIMicroservice.WinterFlowBatchUI;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowUIMicroservice.WinterFlowVariableBandwidth;
        if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowUIMicroservice2 != null ? winterFlowUIMicroservice2.WinterFlowVariableBandwidth : null, winterFlowSchedulerStructure)) {
            winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowEventEmitterController.WinterFlowTransactionManagerStrategy();
            return;
        }
        WinterFlowWorkerRequest WinterFlowEventEmitterController = winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowEventEmitterController();
        if (WinterFlowEventEmitterController == null || (winterFlowBandwidthFramework = ((WinterFlowValidatorException) WinterFlowEventEmitterController).WinterFlowEventEmitterController) == null) {
            return;
        }
        winterFlowBandwidthFramework.WinterFlowTransactionManagerStrategy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowAPIFrontend(WinterFlowSchedulerStructure winterFlowSchedulerStructure, WinterFlowWorkerInvoker winterFlowWorkerInvoker) {
        char c;
        long j;
        long j2;
        long j3;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure2;
        Object WinterFlowUnitTestResponse;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure3 = this.WinterFlowSingletonPlatform;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (winterFlowDatabaseSchemaStructure3 != null) {
            Object[] objArr = winterFlowDatabaseSchemaStructure3.WinterFlowCacheManagerAgent;
            long[] jArr3 = winterFlowDatabaseSchemaStructure3.WinterFlowRouterStructure;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = (WinterFlowCacheManagerTransactionManager) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource;
                                long[] jArr4 = winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = (WinterFlowSchedulerStructure) ((WinterFlowUICache) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (winterFlowSchedulerStructure2 != null) {
                                                        boolean WinterFlowCacheManagerListener = winterFlowSchedulerStructure2.WinterFlowCacheManagerListener();
                                                        i4 = i8;
                                                        if (WinterFlowCacheManagerListener) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    winterFlowCacheManagerTransactionManager.WinterFlowThreadListener(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
                winterFlowDatabaseSchemaStructure = this.WinterFlowSingletonPlatform;
                if (winterFlowDatabaseSchemaStructure != null) {
                    long[] jArr5 = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c) & j11 & j) != j) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j3) {
                                        int i18 = (i15 << 3) + i17;
                                        if (((WinterFlowCacheManagerTransactionManager) winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent[i18]).WinterFlowUnitTestResponse()) {
                                            winterFlowDatabaseSchemaStructure.WinterFlowServerProtocol(i18);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length3) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
                winterFlowDatabaseSchemaStructure2 = this.WinterFlowSingletonPlatform;
                if (winterFlowDatabaseSchemaStructure2 == null) {
                    winterFlowDatabaseSchemaStructure2 = new WinterFlowDatabaseSchemaStructure();
                    this.WinterFlowSingletonPlatform = winterFlowDatabaseSchemaStructure2;
                }
                WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(winterFlowWorkerInvoker);
                if (WinterFlowUnitTestResponse == null) {
                    WinterFlowUnitTestResponse = new WinterFlowCacheManagerTransactionManager();
                    winterFlowDatabaseSchemaStructure2.WinterFlowThreadListener(winterFlowWorkerInvoker, WinterFlowUnitTestResponse);
                }
                ((WinterFlowCacheManagerTransactionManager) WinterFlowUnitTestResponse).WinterFlowTransactionAgent(new WinterFlowUICache(winterFlowSchedulerStructure));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        winterFlowDatabaseSchemaStructure = this.WinterFlowSingletonPlatform;
        if (winterFlowDatabaseSchemaStructure != null) {
        }
        winterFlowDatabaseSchemaStructure2 = this.WinterFlowSingletonPlatform;
        if (winterFlowDatabaseSchemaStructure2 == null) {
        }
        WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(winterFlowWorkerInvoker);
        if (WinterFlowUnitTestResponse == null) {
        }
        ((WinterFlowCacheManagerTransactionManager) WinterFlowUnitTestResponse).WinterFlowTransactionAgent(new WinterFlowUICache(winterFlowSchedulerStructure));
    }

    public abstract int WinterFlowBandwidth(WinterFlowInheritanceResponse winterFlowInheritanceResponse);

    /* JADX WARN: Multi-variable type inference failed */
    public final void WinterFlowCacheManagerException(WinterFlowCacheManagerInvoker winterFlowCacheManagerInvoker, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure;
        int i;
        char c2;
        long j6;
        WinterFlowRequestUtility WinterFlowResolverListener;
        WinterFlowServiceProviderTransactionManager snapshotObserver;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowSingletonPlatform;
        WinterFlowListenerPlatform winterFlowListenerPlatform = this.WinterFlowConcurrencyThread;
        if (winterFlowListenerPlatform == null) {
            winterFlowListenerPlatform = new WinterFlowListenerPlatform();
            this.WinterFlowConcurrencyThread = winterFlowListenerPlatform;
        }
        WinterFlowListenerPlatform winterFlowListenerPlatform2 = winterFlowListenerPlatform;
        WinterFlowListenerService winterFlowListenerService = WinterFlowRefactoringThreadPool().WinterFlowSingletonPlatform;
        if (winterFlowListenerService != null && (snapshotObserver = ((WinterFlowSyntaxTransactionManager) winterFlowListenerService).getSnapshotObserver()) != null) {
            snapshotObserver.WinterFlowRouterStructure.WinterFlowCacheManagerAgent(winterFlowCacheManagerInvoker, WinterFlowServiceProviderBatch.WinterFlowArrayHelper, new WinterFlowSchedulerGateway(this, j, j2, winterFlowCacheManagerInvoker));
        }
        boolean WinterFlowServiceUtility = WinterFlowServiceUtility();
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = (WinterFlowCacheManagerTransactionManager) winterFlowListenerPlatform2.WinterFlowVariableVersionControl;
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager2 = (WinterFlowCacheManagerTransactionManager) winterFlowListenerPlatform2.WinterFlowTransactionManagerStrategy;
        int i2 = winterFlowListenerPlatform2.WinterFlowRouterStructure;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) winterFlowListenerPlatform2.WinterFlowArrayNetwork)[i3];
            if (b == 3) {
                WinterFlowWorkerInvoker winterFlowWorkerInvoker = ((WinterFlowWorkerInvoker[]) winterFlowListenerPlatform2.WinterFlowHookDataSource)[i3];
                winterFlowWorkerInvoker.getClass();
                winterFlowCacheManagerTransactionManager2.WinterFlowTransactionAgent(winterFlowWorkerInvoker);
            } else if (b != 0 && winterFlowDatabaseSchemaStructure != null) {
                WinterFlowWorkerInvoker winterFlowWorkerInvoker2 = ((WinterFlowWorkerInvoker[]) winterFlowListenerPlatform2.WinterFlowHookDataSource)[i3];
                winterFlowWorkerInvoker2.getClass();
                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager3 = (WinterFlowCacheManagerTransactionManager) winterFlowDatabaseSchemaStructure.WinterFlowTransactionAgent(winterFlowWorkerInvoker2);
                if (winterFlowCacheManagerTransactionManager3 != null) {
                    winterFlowCacheManagerTransactionManager.WinterFlowResponseEngine(winterFlowCacheManagerTransactionManager3);
                }
            }
        }
        int i4 = winterFlowListenerPlatform2.WinterFlowRouterStructure;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) winterFlowListenerPlatform2.WinterFlowArrayNetwork;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                WinterFlowWorkerInvoker[] winterFlowWorkerInvokerArr = (WinterFlowWorkerInvoker[]) winterFlowListenerPlatform2.WinterFlowHookDataSource;
                winterFlowWorkerInvokerArr[i6 - i5] = winterFlowWorkerInvokerArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = winterFlowListenerPlatform2.WinterFlowRouterStructure;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((WinterFlowWorkerInvoker[]) winterFlowListenerPlatform2.WinterFlowHookDataSource)[i8] = null;
        }
        winterFlowListenerPlatform2.WinterFlowRouterStructure -= i5;
        WinterFlowRequestUtility WinterFlowResolverListener2 = WinterFlowResolverListener();
        Object[] objArr = winterFlowCacheManagerTransactionManager2.WinterFlowHookDataSource;
        long[] jArr = winterFlowCacheManagerTransactionManager2.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            WinterFlowWorkerInvoker winterFlowWorkerInvoker3 = (WinterFlowWorkerInvoker) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            WinterFlowRequestUtility winterFlowRequestUtility = WinterFlowResolverListener2 == null ? this : WinterFlowResolverListener2;
                            i = i9;
                            WinterFlowRequestUtility winterFlowRequestUtility2 = winterFlowRequestUtility;
                            while (true) {
                                WinterFlowListenerPlatform winterFlowListenerPlatform3 = winterFlowRequestUtility2.WinterFlowConcurrencyThread;
                                if ((winterFlowListenerPlatform3 == null || WinterFlowProtocolPipeline.WinterFlowFrameworkTransaction((WinterFlowWorkerInvoker[]) winterFlowListenerPlatform3.WinterFlowHookDataSource, winterFlowWorkerInvoker3) < 0) && (WinterFlowResolverListener = winterFlowRequestUtility2.WinterFlowResolverListener()) != null) {
                                    winterFlowRequestUtility2 = WinterFlowResolverListener;
                                }
                            }
                            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure2 = winterFlowRequestUtility2.WinterFlowSingletonPlatform;
                            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager4 = winterFlowDatabaseSchemaStructure2 != null ? (WinterFlowCacheManagerTransactionManager) winterFlowDatabaseSchemaStructure2.WinterFlowTransactionAgent(winterFlowWorkerInvoker3) : null;
                            if (winterFlowCacheManagerTransactionManager4 != null) {
                                winterFlowRequestUtility.WinterFlowClassConsumer(winterFlowCacheManagerTransactionManager4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        winterFlowCacheManagerTransactionManager2.WinterFlowHookDataSource();
        Object[] objArr2 = winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource;
        long[] jArr2 = winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) ((WinterFlowUICache) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (WinterFlowServiceUtility) {
                                winterFlowSchedulerStructure.WinterFlowQueueService(false);
                            } else {
                                winterFlowSchedulerStructure.WinterFlowProxyStructure(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void WinterFlowClassConsumer(WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager) {
        WinterFlowSchedulerStructure winterFlowSchedulerStructure;
        Object[] objArr = winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource;
        long[] jArr = winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) ((WinterFlowUICache) objArr[(i << 3) + i3]).get()) != null) {
                        if (WinterFlowServiceUtility()) {
                            winterFlowSchedulerStructure.WinterFlowQueueService(false);
                        } else {
                            winterFlowSchedulerStructure.WinterFlowProxyStructure(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowNodeException
    public final WinterFlowTransactionPlatform WinterFlowCompilerDataSource(int i, int i2, Map map, WinterFlowObjectSession winterFlowObjectSession, WinterFlowObjectSession winterFlowObjectSession2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            WinterFlowViewUtility.WinterFlowHookDataSource("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new WinterFlowQueryModule(i, i2, map, winterFlowObjectSession, winterFlowObjectSession2, this);
    }

    @Override // com.google.android.datatransport.WinterFlowJavaFunction
    public final void WinterFlowConcurrencyThread(boolean z) {
        WinterFlowRequestUtility WinterFlowResolverListener = WinterFlowResolverListener();
        WinterFlowSchedulerStructure WinterFlowRefactoringThreadPool = WinterFlowResolverListener != null ? WinterFlowResolverListener.WinterFlowRefactoringThreadPool() : null;
        if (WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowRefactoringThreadPool, WinterFlowRefactoringThreadPool())) {
            this.WinterFlowThreadListener = z;
            return;
        }
        if ((WinterFlowRefactoringThreadPool != null ? WinterFlowRefactoringThreadPool.WinterFlowSoftwareEngine.WinterFlowArrayNetwork : null) != WinterFlowTransactionManagerThreadPool.WinterFlowUnitTestResponse) {
            if ((WinterFlowRefactoringThreadPool != null ? WinterFlowRefactoringThreadPool.WinterFlowSoftwareEngine.WinterFlowArrayNetwork : null) != WinterFlowTransactionManagerThreadPool.WinterFlowRouterRouter) {
                return;
            }
        }
        this.WinterFlowThreadListener = z;
    }

    public abstract WinterFlowTransactionPlatform WinterFlowFunctionPipeline();

    public abstract WinterFlowRequestUtility WinterFlowHandlerJSON();

    public abstract WinterFlowAlgorithmHandler WinterFlowHookQuery();

    public abstract boolean WinterFlowModuleService();

    public abstract void WinterFlowProtocolConsumer();

    public abstract WinterFlowSchedulerStructure WinterFlowRefactoringThreadPool();

    public abstract WinterFlowRequestUtility WinterFlowResolverListener();

    @Override // com.google.android.datatransport.WinterFlowNodeException
    public boolean WinterFlowServiceUtility() {
        return false;
    }

    public abstract long WinterFlowSingletonWidget();

    public final int WinterFlowStrategyHook(WinterFlowInheritanceResponse winterFlowInheritanceResponse) {
        int WinterFlowBandwidth;
        if (WinterFlowModuleService() && (WinterFlowBandwidth = WinterFlowBandwidth(winterFlowInheritanceResponse)) != Integer.MIN_VALUE) {
            return WinterFlowBandwidth + ((int) (this.WinterFlowSyntax & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public final WinterFlowScriptProcessor WinterFlowTestingTransactionManager() {
        WinterFlowScriptProcessor winterFlowScriptProcessor = this.WinterFlowResponseEngine;
        if (winterFlowScriptProcessor != null) {
            return winterFlowScriptProcessor;
        }
        WinterFlowScriptProcessor winterFlowScriptProcessor2 = new WinterFlowScriptProcessor(this);
        this.WinterFlowResponseEngine = winterFlowScriptProcessor2;
        return winterFlowScriptProcessor2;
    }

    public final void WinterFlowVersionControlModule(WinterFlowTransactionPlatform winterFlowTransactionPlatform) {
        long j;
        long j2;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowSingletonPlatform;
        if (this.WinterFlowBandwidthObject) {
            return;
        }
        WinterFlowObjectSession WinterFlowArrayNetwork = winterFlowTransactionPlatform.WinterFlowArrayNetwork();
        if (WinterFlowArrayNetwork != null) {
            boolean z = this.WinterFlowTransactionAgent != WinterFlowArrayNetwork;
            if (z || !WinterFlowTestingTransactionManager().WinterFlowVariableVersionControl) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                WinterFlowAlgorithmHandler WinterFlowHookQuery = WinterFlowHookQuery();
                long WinterFlowStrategyTool = WinterFlowQuerySyntax.WinterFlowStrategyTool(WinterFlowHookQuery.WinterFlowCacheManagerAgent(0L));
                long WinterFlowCacheManagerListener = WinterFlowHookQuery.WinterFlowCacheManagerListener();
                j2 = WinterFlowStrategyTool;
                j = WinterFlowCacheManagerListener;
                z = (WinterFlowValidatorTesting.WinterFlowRouterStructure(WinterFlowStrategyTool, WinterFlowTestingTransactionManager().WinterFlowTransactionManagerStrategy) && WinterFlowJavaEntity.WinterFlowRouterStructure(WinterFlowCacheManagerListener, WinterFlowTestingTransactionManager().WinterFlowUnitTestResponse)) ? false : true;
            }
            if (z) {
                WinterFlowCacheManagerInvoker winterFlowCacheManagerInvoker = this.WinterFlowServerProtocol;
                if (winterFlowCacheManagerInvoker != null) {
                    winterFlowCacheManagerInvoker.WinterFlowVariableVersionControl = winterFlowTransactionPlatform;
                } else {
                    winterFlowCacheManagerInvoker = new WinterFlowCacheManagerInvoker(winterFlowTransactionPlatform, this);
                    this.WinterFlowServerProtocol = winterFlowCacheManagerInvoker;
                }
                WinterFlowCacheManagerException(winterFlowCacheManagerInvoker, j2, j);
                this.WinterFlowTransactionAgent = winterFlowTransactionPlatform.WinterFlowArrayNetwork();
                return;
            }
            return;
        }
        if (winterFlowDatabaseSchemaStructure != null) {
            Object[] objArr = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent;
            long[] jArr = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                WinterFlowClassConsumer((WinterFlowCacheManagerTransactionManager) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure();
        }
    }
}
