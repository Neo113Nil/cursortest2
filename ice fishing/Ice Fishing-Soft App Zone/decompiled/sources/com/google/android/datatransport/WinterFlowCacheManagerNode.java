package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowCacheManagerNode extends WinterFlowWorkerSession implements WinterFlowServiceWebsocket, WinterFlowCacheInterface, WinterFlowEventProvider, WinterFlowConsumerProcess {
    public int WinterFlowBandwidthObject;
    public int WinterFlowOrchestrationSubsystem;
    public final int WinterFlowResponseEngine;
    public Object[] WinterFlowServerProtocol;
    public long WinterFlowServiceUtility;
    public final int WinterFlowSyntax;
    public long WinterFlowThreadListener;
    public final WinterFlowDataSourceHandler WinterFlowTransactionAgent;

    public WinterFlowCacheManagerNode(int i, int i2, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        this.WinterFlowSyntax = i;
        this.WinterFlowResponseEngine = i2;
        this.WinterFlowTransactionAgent = winterFlowDataSourceHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0076, B:21:0x0080, B:30:0x0093, B:33:0x009a, B:34:0x009e, B:36:0x009f, B:42:0x0047), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.datatransport.WinterFlowWorkerSession] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.datatransport.WinterFlowCacheManagerNode] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.datatransport.WinterFlowCacheInterface] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.google.android.datatransport.WinterFlowTestingAgent] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.google.android.datatransport.WinterFlowStrategyBatch] */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.google.android.datatransport.WinterFlowStrategyBatch] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ad -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void WinterFlowTransactionAgent(WinterFlowCacheManagerNode winterFlowCacheManagerNode, WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowTransactionConcurrency winterFlowTransactionConcurrency;
        int i;
        ?? r4;
        WinterFlowCacheInterface winterFlowCacheInterface2;
        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth;
        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth2;
        WinterFlowCacheInterface winterFlowCacheInterface3;
        Object WinterFlowBatchUI;
        WinterFlowJSONDecorator winterFlowJSONDecorator;
        WinterFlowListenerJava winterFlowListenerJava;
        WinterFlowStrategyBatch winterFlowStrategyBatch;
        try {
            try {
                if (winterFlowTransactionManagerLayer instanceof WinterFlowTransactionConcurrency) {
                    winterFlowTransactionConcurrency = (WinterFlowTransactionConcurrency) winterFlowTransactionManagerLayer;
                    int i2 = winterFlowTransactionConcurrency.WinterFlowServiceUtility;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        winterFlowTransactionConcurrency.WinterFlowServiceUtility = i2 - Integer.MIN_VALUE;
                        Object obj = winterFlowTransactionConcurrency.WinterFlowServerProtocol;
                        i = winterFlowTransactionConcurrency.WinterFlowServiceUtility;
                        if (i != 0) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            winterFlowCacheInterface2 = winterFlowCacheInterface;
                            winterFlowCacheInterface = (WinterFlowStrategyBatch) winterFlowCacheManagerNode.WinterFlowCacheManagerAgent();
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    winterFlowConsumerBandwidth2 = winterFlowTransactionConcurrency.WinterFlowTransactionAgent;
                                    WinterFlowStrategyBatch winterFlowStrategyBatch2 = winterFlowTransactionConcurrency.WinterFlowResponseEngine;
                                    winterFlowCacheInterface3 = winterFlowTransactionConcurrency.WinterFlowSyntax;
                                    WinterFlowCacheManagerNode winterFlowCacheManagerNode2 = winterFlowTransactionConcurrency.WinterFlowRouterRouter;
                                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                                    r4 = winterFlowCacheManagerNode2;
                                    winterFlowCacheInterface = winterFlowStrategyBatch2;
                                    do {
                                        WinterFlowBatchUI = r4.WinterFlowBatchUI(winterFlowCacheInterface);
                                        winterFlowJSONDecorator = WinterFlowHandlerWebsocket.WinterFlowSingletonPlatform;
                                        winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                                        if (WinterFlowBatchUI == winterFlowJSONDecorator) {
                                        }
                                    } while (r4.WinterFlowSyntax(winterFlowCacheInterface, winterFlowTransactionConcurrency) != winterFlowListenerJava);
                                    return;
                                }
                                if (i != 3) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                    return;
                                }
                                winterFlowConsumerBandwidth2 = winterFlowTransactionConcurrency.WinterFlowTransactionAgent;
                                WinterFlowStrategyBatch winterFlowStrategyBatch3 = winterFlowTransactionConcurrency.WinterFlowResponseEngine;
                                winterFlowCacheInterface3 = winterFlowTransactionConcurrency.WinterFlowSyntax;
                                WinterFlowCacheManagerNode winterFlowCacheManagerNode3 = winterFlowTransactionConcurrency.WinterFlowRouterRouter;
                                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                                WinterFlowCacheManagerNode winterFlowCacheManagerNode4 = winterFlowCacheManagerNode3;
                                WinterFlowStrategyBatch winterFlowStrategyBatch4 = winterFlowStrategyBatch3;
                                winterFlowCacheInterface2 = winterFlowCacheInterface3;
                                winterFlowConsumerBandwidth = winterFlowConsumerBandwidth2;
                                winterFlowCacheManagerNode = winterFlowCacheManagerNode4;
                                winterFlowStrategyBatch = winterFlowStrategyBatch4;
                                r4 = winterFlowCacheManagerNode;
                                winterFlowConsumerBandwidth2 = winterFlowConsumerBandwidth;
                                winterFlowCacheInterface3 = winterFlowCacheInterface2;
                                winterFlowCacheInterface = winterFlowStrategyBatch;
                                do {
                                    WinterFlowBatchUI = r4.WinterFlowBatchUI(winterFlowCacheInterface);
                                    winterFlowJSONDecorator = WinterFlowHandlerWebsocket.WinterFlowSingletonPlatform;
                                    winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                                    if (WinterFlowBatchUI == winterFlowJSONDecorator) {
                                        if (winterFlowConsumerBandwidth2 != null && !winterFlowConsumerBandwidth2.WinterFlowHookDataSource()) {
                                            throw winterFlowConsumerBandwidth2.WinterFlowBandwidthObject();
                                        }
                                        winterFlowTransactionConcurrency.WinterFlowRouterRouter = r4;
                                        winterFlowTransactionConcurrency.WinterFlowSyntax = winterFlowCacheInterface3;
                                        winterFlowTransactionConcurrency.WinterFlowResponseEngine = winterFlowCacheInterface;
                                        winterFlowTransactionConcurrency.WinterFlowTransactionAgent = winterFlowConsumerBandwidth2;
                                        winterFlowTransactionConcurrency.WinterFlowServiceUtility = 3;
                                        winterFlowCacheManagerNode4 = r4;
                                        winterFlowStrategyBatch4 = winterFlowCacheInterface;
                                        if (winterFlowCacheInterface3.WinterFlowRouterRouter(WinterFlowBatchUI, winterFlowTransactionConcurrency) == winterFlowListenerJava) {
                                            return;
                                        }
                                        winterFlowCacheInterface2 = winterFlowCacheInterface3;
                                        winterFlowConsumerBandwidth = winterFlowConsumerBandwidth2;
                                        winterFlowCacheManagerNode = winterFlowCacheManagerNode4;
                                        winterFlowStrategyBatch = winterFlowStrategyBatch4;
                                        r4 = winterFlowCacheManagerNode;
                                        winterFlowConsumerBandwidth2 = winterFlowConsumerBandwidth;
                                        winterFlowCacheInterface3 = winterFlowCacheInterface2;
                                        winterFlowCacheInterface = winterFlowStrategyBatch;
                                        WinterFlowBatchUI = r4.WinterFlowBatchUI(winterFlowCacheInterface);
                                        winterFlowJSONDecorator = WinterFlowHandlerWebsocket.WinterFlowSingletonPlatform;
                                        winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                                        if (WinterFlowBatchUI == winterFlowJSONDecorator) {
                                            winterFlowTransactionConcurrency.WinterFlowRouterRouter = r4;
                                            winterFlowTransactionConcurrency.WinterFlowSyntax = winterFlowCacheInterface3;
                                            winterFlowTransactionConcurrency.WinterFlowResponseEngine = winterFlowCacheInterface;
                                            winterFlowTransactionConcurrency.WinterFlowTransactionAgent = winterFlowConsumerBandwidth2;
                                            winterFlowTransactionConcurrency.WinterFlowServiceUtility = 2;
                                        }
                                    }
                                } while (r4.WinterFlowSyntax(winterFlowCacheInterface, winterFlowTransactionConcurrency) != winterFlowListenerJava);
                                return;
                            }
                            winterFlowCacheInterface = winterFlowTransactionConcurrency.WinterFlowResponseEngine;
                            WinterFlowCacheInterface winterFlowCacheInterface4 = winterFlowTransactionConcurrency.WinterFlowSyntax;
                            WinterFlowCacheManagerNode winterFlowCacheManagerNode5 = winterFlowTransactionConcurrency.WinterFlowRouterRouter;
                            try {
                                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                                winterFlowCacheInterface2 = winterFlowCacheInterface4;
                                winterFlowCacheManagerNode = winterFlowCacheManagerNode5;
                                winterFlowCacheInterface = winterFlowCacheInterface;
                            } catch (Throwable th) {
                                th = th;
                                r4 = winterFlowCacheManagerNode5;
                                r4.WinterFlowTransactionManagerStrategy(winterFlowCacheInterface);
                                throw th;
                            }
                        }
                        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = winterFlowTransactionConcurrency.WinterFlowTransactionManagerStrategy;
                        winterFlowEncryptionMicroservice.getClass();
                        winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
                        winterFlowStrategyBatch = winterFlowCacheInterface;
                        r4 = winterFlowCacheManagerNode;
                        winterFlowConsumerBandwidth2 = winterFlowConsumerBandwidth;
                        winterFlowCacheInterface3 = winterFlowCacheInterface2;
                        winterFlowCacheInterface = winterFlowStrategyBatch;
                        do {
                            WinterFlowBatchUI = r4.WinterFlowBatchUI(winterFlowCacheInterface);
                            winterFlowJSONDecorator = WinterFlowHandlerWebsocket.WinterFlowSingletonPlatform;
                            winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                            if (WinterFlowBatchUI == winterFlowJSONDecorator) {
                            }
                        } while (r4.WinterFlowSyntax(winterFlowCacheInterface, winterFlowTransactionConcurrency) != winterFlowListenerJava);
                        return;
                    }
                }
                WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice2 = winterFlowTransactionConcurrency.WinterFlowTransactionManagerStrategy;
                winterFlowEncryptionMicroservice2.getClass();
                winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) winterFlowEncryptionMicroservice2.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
                winterFlowStrategyBatch = winterFlowCacheInterface;
                r4 = winterFlowCacheManagerNode;
                winterFlowConsumerBandwidth2 = winterFlowConsumerBandwidth;
                winterFlowCacheInterface3 = winterFlowCacheInterface2;
                winterFlowCacheInterface = winterFlowStrategyBatch;
                do {
                    WinterFlowBatchUI = r4.WinterFlowBatchUI(winterFlowCacheInterface);
                    winterFlowJSONDecorator = WinterFlowHandlerWebsocket.WinterFlowSingletonPlatform;
                    winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (WinterFlowBatchUI == winterFlowJSONDecorator) {
                    }
                } while (r4.WinterFlowSyntax(winterFlowCacheInterface, winterFlowTransactionConcurrency) != winterFlowListenerJava);
                return;
            } catch (Throwable th2) {
                r4 = winterFlowCacheManagerNode;
                th = th2;
                r4.WinterFlowTransactionManagerStrategy(winterFlowCacheInterface);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        winterFlowTransactionConcurrency = new WinterFlowTransactionConcurrency(winterFlowCacheManagerNode, winterFlowTransactionManagerLayer);
        Object obj2 = winterFlowTransactionConcurrency.WinterFlowServerProtocol;
        i = winterFlowTransactionConcurrency.WinterFlowServiceUtility;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerSession
    public final WinterFlowTestingAgent WinterFlowArrayNetwork() {
        WinterFlowStrategyBatch winterFlowStrategyBatch = new WinterFlowStrategyBatch();
        winterFlowStrategyBatch.WinterFlowRouterStructure = -1L;
        return winterFlowStrategyBatch;
    }

    public final long WinterFlowBandwidthObject() {
        return Math.min(this.WinterFlowServiceUtility, this.WinterFlowThreadListener);
    }

    public final Object WinterFlowBatchUI(WinterFlowStrategyBatch winterFlowStrategyBatch) {
        Object obj;
        WinterFlowTransactionManagerLayer[] winterFlowTransactionManagerLayerArr = WinterFlowEncryptionSubsystem.WinterFlowRouterStructure;
        synchronized (this) {
            try {
                long WinterFlowVariableBandwidth = WinterFlowVariableBandwidth(winterFlowStrategyBatch);
                if (WinterFlowVariableBandwidth < 0) {
                    obj = WinterFlowHandlerWebsocket.WinterFlowSingletonPlatform;
                } else {
                    long j = winterFlowStrategyBatch.WinterFlowRouterStructure;
                    Object[] objArr = this.WinterFlowServerProtocol;
                    objArr.getClass();
                    Object obj2 = objArr[((int) WinterFlowVariableBandwidth) & (objArr.length - 1)];
                    if (obj2 instanceof WinterFlowEncryptionScheduler) {
                        obj2 = ((WinterFlowEncryptionScheduler) obj2).WinterFlowUnitTestResponse;
                    }
                    winterFlowStrategyBatch.WinterFlowRouterStructure = WinterFlowVariableBandwidth + 1;
                    Object obj3 = obj2;
                    winterFlowTransactionManagerLayerArr = WinterFlowSerializerStructure(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer : winterFlowTransactionManagerLayerArr) {
            if (winterFlowTransactionManagerLayer != null) {
                winterFlowTransactionManagerLayer.WinterFlowSyntax(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
            }
        }
        return obj;
    }

    public final boolean WinterFlowConcurrencyThread(Object obj) {
        int i;
        boolean z;
        WinterFlowTransactionManagerLayer[] winterFlowTransactionManagerLayerArr = WinterFlowEncryptionSubsystem.WinterFlowRouterStructure;
        synchronized (this) {
            if (WinterFlowSingletonPlatform(obj)) {
                winterFlowTransactionManagerLayerArr = WinterFlowServiceUtility(winterFlowTransactionManagerLayerArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer : winterFlowTransactionManagerLayerArr) {
            if (winterFlowTransactionManagerLayer != null) {
                winterFlowTransactionManagerLayer.WinterFlowSyntax(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
            }
        }
        return z;
    }

    @Override // com.google.android.datatransport.WinterFlowConsumerProcess
    public final WinterFlowEventProvider WinterFlowHookDataSource(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        return WinterFlowHandlerWebsocket.WinterFlowBatchUI(this, winterFlowEncryptionMicroservice, i, winterFlowDataSourceHandler);
    }

    public final Object[] WinterFlowOrchestrationSubsystem(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.WinterFlowServerProtocol = objArr2;
        if (objArr != null) {
            long WinterFlowBandwidthObject = WinterFlowBandwidthObject();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + WinterFlowBandwidthObject;
                WinterFlowHandlerWebsocket.WinterFlowSyntaxSubsystem(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final void WinterFlowResponseEngine() {
        if (this.WinterFlowResponseEngine != 0 || this.WinterFlowOrchestrationSubsystem > 1) {
            Object[] objArr = this.WinterFlowServerProtocol;
            objArr.getClass();
            while (this.WinterFlowOrchestrationSubsystem > 0) {
                long WinterFlowBandwidthObject = WinterFlowBandwidthObject();
                int i = this.WinterFlowBandwidthObject;
                int i2 = this.WinterFlowOrchestrationSubsystem;
                if (objArr[((int) ((WinterFlowBandwidthObject + (i + i2)) - 1)) & (objArr.length - 1)] != WinterFlowHandlerWebsocket.WinterFlowSingletonPlatform) {
                    return;
                }
                this.WinterFlowOrchestrationSubsystem = i2 - 1;
                WinterFlowHandlerWebsocket.WinterFlowSyntaxSubsystem(objArr, WinterFlowBandwidthObject() + this.WinterFlowBandwidthObject + this.WinterFlowOrchestrationSubsystem, null);
            }
        }
    }

    public final void WinterFlowRouterAdapter(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long WinterFlowBandwidthObject = WinterFlowBandwidthObject(); WinterFlowBandwidthObject < min; WinterFlowBandwidthObject++) {
            Object[] objArr = this.WinterFlowServerProtocol;
            objArr.getClass();
            WinterFlowHandlerWebsocket.WinterFlowSyntaxSubsystem(objArr, WinterFlowBandwidthObject, null);
        }
        this.WinterFlowThreadListener = j;
        this.WinterFlowServiceUtility = j2;
        this.WinterFlowBandwidthObject = (int) (j3 - min);
        this.WinterFlowOrchestrationSubsystem = (int) (j4 - j3);
    }

    @Override // com.google.android.datatransport.WinterFlowCacheInterface
    public final Object WinterFlowRouterRouter(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowCacheManagerNode winterFlowCacheManagerNode;
        Throwable th;
        WinterFlowTransactionManagerLayer[] WinterFlowServiceUtility;
        WinterFlowEncryptionScheduler winterFlowEncryptionScheduler;
        if (WinterFlowConcurrencyThread(obj)) {
            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
        WinterFlowEventCloud winterFlowEventCloud = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowTransactionManagerLayer));
        winterFlowEventCloud.WinterFlowSerializerStructure();
        WinterFlowTransactionManagerLayer[] winterFlowTransactionManagerLayerArr = WinterFlowEncryptionSubsystem.WinterFlowRouterStructure;
        synchronized (this) {
            try {
                if (WinterFlowSingletonPlatform(obj)) {
                    try {
                        winterFlowEventCloud.WinterFlowSyntax(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                        WinterFlowServiceUtility = WinterFlowServiceUtility(winterFlowTransactionManagerLayerArr);
                        winterFlowEncryptionScheduler = null;
                        winterFlowCacheManagerNode = this;
                    } catch (Throwable th2) {
                        th = th2;
                        winterFlowCacheManagerNode = this;
                        throw th;
                    }
                } else {
                    try {
                        winterFlowCacheManagerNode = this;
                        try {
                            WinterFlowEncryptionScheduler winterFlowEncryptionScheduler2 = new WinterFlowEncryptionScheduler(winterFlowCacheManagerNode, WinterFlowBandwidthObject() + this.WinterFlowBandwidthObject + this.WinterFlowOrchestrationSubsystem, obj, winterFlowEventCloud);
                            winterFlowCacheManagerNode.WinterFlowThreadListener(winterFlowEncryptionScheduler2);
                            winterFlowCacheManagerNode.WinterFlowOrchestrationSubsystem++;
                            if (winterFlowCacheManagerNode.WinterFlowResponseEngine == 0) {
                                winterFlowTransactionManagerLayerArr = winterFlowCacheManagerNode.WinterFlowServiceUtility(winterFlowTransactionManagerLayerArr);
                            }
                            WinterFlowServiceUtility = winterFlowTransactionManagerLayerArr;
                            winterFlowEncryptionScheduler = winterFlowEncryptionScheduler2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        winterFlowCacheManagerNode = this;
                        th = th4;
                        throw th;
                    }
                }
                if (winterFlowEncryptionScheduler != null) {
                    winterFlowEventCloud.WinterFlowConsumerUserManager(new WinterFlowProxyStructure(2, winterFlowEncryptionScheduler));
                }
                for (WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer2 : WinterFlowServiceUtility) {
                    if (winterFlowTransactionManagerLayer2 != null) {
                        winterFlowTransactionManagerLayer2.WinterFlowSyntax(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                    }
                }
                Object WinterFlowBatchUI = winterFlowEventCloud.WinterFlowBatchUI();
                WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                if (WinterFlowBatchUI != winterFlowListenerJava) {
                    WinterFlowBatchUI = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
                return WinterFlowBatchUI == winterFlowListenerJava ? WinterFlowBatchUI : WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            } catch (Throwable th5) {
                th = th5;
                winterFlowCacheManagerNode = this;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventProvider
    public final Object WinterFlowRouterStructure(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowTransactionAgent(this, winterFlowCacheInterface, winterFlowTransactionManagerLayer);
        return WinterFlowListenerJava.WinterFlowVariableVersionControl;
    }

    public final WinterFlowTransactionManagerLayer[] WinterFlowSerializerStructure(long j) {
        long j2;
        long j3;
        long j4;
        WinterFlowTransactionManagerLayer[] winterFlowTransactionManagerLayerArr;
        WinterFlowTransactionManagerLayer[] winterFlowTransactionManagerLayerArr2;
        WinterFlowTestingAgent[] winterFlowTestingAgentArr;
        WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowHandlerWebsocket.WinterFlowSingletonPlatform;
        WinterFlowTransactionManagerLayer[] winterFlowTransactionManagerLayerArr3 = WinterFlowEncryptionSubsystem.WinterFlowRouterStructure;
        if (j <= this.WinterFlowServiceUtility) {
            long WinterFlowBandwidthObject = WinterFlowBandwidthObject();
            long j5 = this.WinterFlowBandwidthObject + WinterFlowBandwidthObject;
            int i = this.WinterFlowResponseEngine;
            if (i == 0 && this.WinterFlowOrchestrationSubsystem > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.WinterFlowTransactionManagerStrategy != 0 && (winterFlowTestingAgentArr = this.WinterFlowVariableVersionControl) != null) {
                for (WinterFlowTestingAgent winterFlowTestingAgent : winterFlowTestingAgentArr) {
                    if (winterFlowTestingAgent != null) {
                        long j6 = ((WinterFlowStrategyBatch) winterFlowTestingAgent).WinterFlowRouterStructure;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.WinterFlowServiceUtility) {
                long WinterFlowBandwidthObject2 = WinterFlowBandwidthObject() + this.WinterFlowBandwidthObject;
                int i3 = this.WinterFlowTransactionManagerStrategy;
                int i4 = this.WinterFlowOrchestrationSubsystem;
                if (i3 > 0) {
                    j2 = 1;
                    i4 = Math.min(i4, i - ((int) (WinterFlowBandwidthObject2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = this.WinterFlowOrchestrationSubsystem + WinterFlowBandwidthObject2;
                if (i4 > 0) {
                    Object[] objArr = this.WinterFlowServerProtocol;
                    objArr.getClass();
                    j3 = WinterFlowBandwidthObject;
                    WinterFlowTransactionManagerLayer[] winterFlowTransactionManagerLayerArr4 = new WinterFlowTransactionManagerLayer[i4];
                    long j8 = WinterFlowBandwidthObject2;
                    while (true) {
                        if (WinterFlowBandwidthObject2 >= j7) {
                            winterFlowTransactionManagerLayerArr2 = winterFlowTransactionManagerLayerArr4;
                            j4 = j5;
                            break;
                        }
                        winterFlowTransactionManagerLayerArr2 = winterFlowTransactionManagerLayerArr4;
                        Object obj = objArr[((int) WinterFlowBandwidthObject2) & (objArr.length - 1)];
                        if (obj != winterFlowJSONDecorator) {
                            obj.getClass();
                            WinterFlowEncryptionScheduler winterFlowEncryptionScheduler = (WinterFlowEncryptionScheduler) obj;
                            j4 = j5;
                            int i5 = i2 + 1;
                            winterFlowTransactionManagerLayerArr2[i2] = winterFlowEncryptionScheduler.WinterFlowRouterRouter;
                            WinterFlowHandlerWebsocket.WinterFlowSyntaxSubsystem(objArr, WinterFlowBandwidthObject2, winterFlowJSONDecorator);
                            WinterFlowHandlerWebsocket.WinterFlowSyntaxSubsystem(objArr, j8, winterFlowEncryptionScheduler.WinterFlowUnitTestResponse);
                            j8 += j2;
                            if (i5 >= i4) {
                                break;
                            }
                            i2 = i5;
                        } else {
                            j4 = j5;
                        }
                        WinterFlowBandwidthObject2 += j2;
                        winterFlowTransactionManagerLayerArr4 = winterFlowTransactionManagerLayerArr2;
                        j5 = j4;
                    }
                    WinterFlowBandwidthObject2 = j8;
                    winterFlowTransactionManagerLayerArr = winterFlowTransactionManagerLayerArr2;
                } else {
                    j3 = WinterFlowBandwidthObject;
                    j4 = j5;
                    winterFlowTransactionManagerLayerArr = winterFlowTransactionManagerLayerArr3;
                }
                int i6 = (int) (WinterFlowBandwidthObject2 - j3);
                long j9 = this.WinterFlowTransactionManagerStrategy == 0 ? WinterFlowBandwidthObject2 : j4;
                long max = Math.max(this.WinterFlowThreadListener, WinterFlowBandwidthObject2 - Math.min(this.WinterFlowSyntax, i6));
                if (i == 0 && max < j7) {
                    Object[] objArr2 = this.WinterFlowServerProtocol;
                    objArr2.getClass();
                    if (WinterFlowManagerRequest.WinterFlowThreadListener(objArr2[((int) max) & (objArr2.length - 1)], winterFlowJSONDecorator)) {
                        WinterFlowBandwidthObject2 += j2;
                        max += j2;
                    }
                }
                WinterFlowRouterAdapter(max, j9, WinterFlowBandwidthObject2, j7);
                WinterFlowResponseEngine();
                return winterFlowTransactionManagerLayerArr.length == 0 ? winterFlowTransactionManagerLayerArr : WinterFlowServiceUtility(winterFlowTransactionManagerLayerArr);
            }
        }
        return winterFlowTransactionManagerLayerArr3;
    }

    public final void WinterFlowServerProtocol() {
        WinterFlowTestingAgent[] winterFlowTestingAgentArr;
        Object[] objArr = this.WinterFlowServerProtocol;
        objArr.getClass();
        WinterFlowHandlerWebsocket.WinterFlowSyntaxSubsystem(objArr, WinterFlowBandwidthObject(), null);
        this.WinterFlowBandwidthObject--;
        long WinterFlowBandwidthObject = WinterFlowBandwidthObject() + 1;
        if (this.WinterFlowThreadListener < WinterFlowBandwidthObject) {
            this.WinterFlowThreadListener = WinterFlowBandwidthObject;
        }
        if (this.WinterFlowServiceUtility < WinterFlowBandwidthObject) {
            if (this.WinterFlowTransactionManagerStrategy != 0 && (winterFlowTestingAgentArr = this.WinterFlowVariableVersionControl) != null) {
                for (WinterFlowTestingAgent winterFlowTestingAgent : winterFlowTestingAgentArr) {
                    if (winterFlowTestingAgent != null) {
                        WinterFlowStrategyBatch winterFlowStrategyBatch = (WinterFlowStrategyBatch) winterFlowTestingAgent;
                        long j = winterFlowStrategyBatch.WinterFlowRouterStructure;
                        if (j >= 0 && j < WinterFlowBandwidthObject) {
                            winterFlowStrategyBatch.WinterFlowRouterStructure = WinterFlowBandwidthObject;
                        }
                    }
                }
            }
            this.WinterFlowServiceUtility = WinterFlowBandwidthObject;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WinterFlowTransactionManagerLayer[] WinterFlowServiceUtility(WinterFlowTransactionManagerLayer[] winterFlowTransactionManagerLayerArr) {
        WinterFlowTestingAgent[] winterFlowTestingAgentArr;
        WinterFlowStrategyBatch winterFlowStrategyBatch;
        WinterFlowEventCloud winterFlowEventCloud;
        int length = winterFlowTransactionManagerLayerArr.length;
        if (this.WinterFlowTransactionManagerStrategy != 0 && (winterFlowTestingAgentArr = this.WinterFlowVariableVersionControl) != null) {
            int length2 = winterFlowTestingAgentArr.length;
            int i = 0;
            winterFlowTransactionManagerLayerArr = winterFlowTransactionManagerLayerArr;
            while (i < length2) {
                WinterFlowTestingAgent winterFlowTestingAgent = winterFlowTestingAgentArr[i];
                if (winterFlowTestingAgent != null && (winterFlowEventCloud = (winterFlowStrategyBatch = (WinterFlowStrategyBatch) winterFlowTestingAgent).WinterFlowHookDataSource) != null && WinterFlowVariableBandwidth(winterFlowStrategyBatch) >= 0) {
                    int length3 = winterFlowTransactionManagerLayerArr.length;
                    winterFlowTransactionManagerLayerArr = winterFlowTransactionManagerLayerArr;
                    if (length >= length3) {
                        winterFlowTransactionManagerLayerArr = Arrays.copyOf(winterFlowTransactionManagerLayerArr, Math.max(2, winterFlowTransactionManagerLayerArr.length * 2));
                    }
                    winterFlowTransactionManagerLayerArr[length] = winterFlowEventCloud;
                    winterFlowStrategyBatch.WinterFlowHookDataSource = null;
                    length++;
                }
                i++;
                winterFlowTransactionManagerLayerArr = winterFlowTransactionManagerLayerArr;
            }
        }
        return winterFlowTransactionManagerLayerArr;
    }

    public final boolean WinterFlowSingletonPlatform(Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        int i2 = this.WinterFlowSyntax;
        if (i != 0) {
            int i3 = this.WinterFlowBandwidthObject;
            int i4 = this.WinterFlowResponseEngine;
            if (i3 >= i4 && this.WinterFlowServiceUtility <= this.WinterFlowThreadListener) {
                int ordinal = this.WinterFlowTransactionAgent.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        return false;
                    }
                }
            }
            WinterFlowThreadListener(obj);
            int i5 = this.WinterFlowBandwidthObject + 1;
            this.WinterFlowBandwidthObject = i5;
            if (i5 > i4) {
                WinterFlowServerProtocol();
            }
            long WinterFlowBandwidthObject = WinterFlowBandwidthObject() + this.WinterFlowBandwidthObject;
            long j = this.WinterFlowThreadListener;
            if (((int) (WinterFlowBandwidthObject - j)) > i2) {
                WinterFlowRouterAdapter(1 + j, this.WinterFlowServiceUtility, WinterFlowBandwidthObject() + this.WinterFlowBandwidthObject, WinterFlowBandwidthObject() + this.WinterFlowBandwidthObject + this.WinterFlowOrchestrationSubsystem);
            }
        } else if (i2 != 0) {
            WinterFlowThreadListener(obj);
            int i6 = this.WinterFlowBandwidthObject + 1;
            this.WinterFlowBandwidthObject = i6;
            if (i6 > i2) {
                WinterFlowServerProtocol();
            }
            this.WinterFlowServiceUtility = WinterFlowBandwidthObject() + this.WinterFlowBandwidthObject;
            return true;
        }
        return true;
    }

    public final Object WinterFlowSyntax(WinterFlowStrategyBatch winterFlowStrategyBatch, WinterFlowTransactionConcurrency winterFlowTransactionConcurrency) {
        WinterFlowEventCloud winterFlowEventCloud = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowTransactionConcurrency));
        winterFlowEventCloud.WinterFlowSerializerStructure();
        synchronized (this) {
            try {
                if (WinterFlowVariableBandwidth(winterFlowStrategyBatch) < 0) {
                    winterFlowStrategyBatch.WinterFlowHookDataSource = winterFlowEventCloud;
                } else {
                    winterFlowEventCloud.WinterFlowSyntax(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object WinterFlowBatchUI = winterFlowEventCloud.WinterFlowBatchUI();
        return WinterFlowBatchUI == WinterFlowListenerJava.WinterFlowVariableVersionControl ? WinterFlowBatchUI : WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    public final void WinterFlowThreadListener(Object obj) {
        int i = this.WinterFlowBandwidthObject + this.WinterFlowOrchestrationSubsystem;
        Object[] objArr = this.WinterFlowServerProtocol;
        if (objArr == null) {
            objArr = WinterFlowOrchestrationSubsystem(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = WinterFlowOrchestrationSubsystem(objArr, i, objArr.length * 2);
        }
        WinterFlowHandlerWebsocket.WinterFlowSyntaxSubsystem(objArr, WinterFlowBandwidthObject() + i, obj);
    }

    public final long WinterFlowVariableBandwidth(WinterFlowStrategyBatch winterFlowStrategyBatch) {
        long j = winterFlowStrategyBatch.WinterFlowRouterStructure;
        if (j >= WinterFlowBandwidthObject() + this.WinterFlowBandwidthObject && (this.WinterFlowResponseEngine > 0 || j > WinterFlowBandwidthObject() || this.WinterFlowOrchestrationSubsystem == 0)) {
            return -1L;
        }
        return j;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerSession
    public final WinterFlowTestingAgent[] WinterFlowVariableVersionControl() {
        return new WinterFlowStrategyBatch[2];
    }
}
