package com.google.android.datatransport;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowVersionProtocol {
    public static WinterFlowSingletonNode WinterFlowArrayNetwork;
    public static final WinterFlowSerializerScheduler WinterFlowResponseEngine;
    public static List WinterFlowRouterRouter;
    public static List WinterFlowSyntax;
    public static final WinterFlowFunctionEncryption WinterFlowTransactionAgent;
    public static final WinterFlowAdapterUnitTest WinterFlowTransactionManagerStrategy;
    public static final WinterFlowBandwidthServer WinterFlowUnitTestResponse;
    public static long WinterFlowVariableVersionControl;
    public static final WinterFlowSessionManagerAgent WinterFlowRouterStructure = new WinterFlowSessionManagerAgent(20);
    public static final WinterFlowObjectPackage WinterFlowHookDataSource = new WinterFlowObjectPackage(25);
    public static final Object WinterFlowCacheManagerAgent = new Object();

    /* JADX WARN: Type inference failed for: r2v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int[], java.io.Serializable] */
    static {
        WinterFlowSingletonNode winterFlowSingletonNode = WinterFlowSingletonNode.WinterFlowSyntax;
        WinterFlowArrayNetwork = winterFlowSingletonNode;
        WinterFlowVariableVersionControl = 2L;
        WinterFlowAdapterUnitTest winterFlowAdapterUnitTest = new WinterFlowAdapterUnitTest();
        winterFlowAdapterUnitTest.WinterFlowCacheManagerAgent = new long[16];
        winterFlowAdapterUnitTest.WinterFlowArrayNetwork = new int[16];
        ?? r2 = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            r2[i] = i2;
            i = i2;
        }
        winterFlowAdapterUnitTest.WinterFlowVariableVersionControl = r2;
        WinterFlowTransactionManagerStrategy = winterFlowAdapterUnitTest;
        WinterFlowBandwidthServer winterFlowBandwidthServer = new WinterFlowBandwidthServer();
        winterFlowBandwidthServer.WinterFlowHookDataSource = new int[16];
        winterFlowBandwidthServer.WinterFlowCacheManagerAgent = new WinterFlowWorkerOrchestration[16];
        WinterFlowUnitTestResponse = winterFlowBandwidthServer;
        WinterFlowDataSourceEngine winterFlowDataSourceEngine = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        WinterFlowRouterRouter = winterFlowDataSourceEngine;
        WinterFlowSyntax = winterFlowDataSourceEngine;
        long j = WinterFlowVariableVersionControl;
        WinterFlowVariableVersionControl = 1 + j;
        WinterFlowSerializerScheduler winterFlowSerializerScheduler = new WinterFlowSerializerScheduler(j, winterFlowSingletonNode, null, new WinterFlowInterfaceSoftware(13));
        WinterFlowArrayNetwork = WinterFlowArrayNetwork.WinterFlowTransactionManagerStrategy(winterFlowSerializerScheduler.WinterFlowHookDataSource);
        WinterFlowResponseEngine = winterFlowSerializerScheduler;
        WinterFlowTransactionAgent = new WinterFlowFunctionEncryption(0);
    }

    public static final void WinterFlowArrayNetwork() {
        WinterFlowBandwidthServer winterFlowBandwidthServer = WinterFlowUnitTestResponse;
        int i = winterFlowBandwidthServer.WinterFlowRouterStructure;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            WinterFlowWorkerOrchestration winterFlowWorkerOrchestration = ((WinterFlowWorkerOrchestration[]) winterFlowBandwidthServer.WinterFlowCacheManagerAgent)[i2];
            Object obj = winterFlowWorkerOrchestration != null ? winterFlowWorkerOrchestration.get() : null;
            if (obj != null && WinterFlowBandwidthObject((WinterFlowOrchestrationTool) obj)) {
                if (i3 != i2) {
                    ((WinterFlowWorkerOrchestration[]) winterFlowBandwidthServer.WinterFlowCacheManagerAgent)[i3] = winterFlowWorkerOrchestration;
                    int[] iArr = (int[]) winterFlowBandwidthServer.WinterFlowHookDataSource;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((WinterFlowWorkerOrchestration[]) winterFlowBandwidthServer.WinterFlowCacheManagerAgent)[i4] = null;
            ((int[]) winterFlowBandwidthServer.WinterFlowHookDataSource)[i4] = 0;
        }
        if (i3 != i) {
            winterFlowBandwidthServer.WinterFlowRouterStructure = i3;
        }
    }

    public static final boolean WinterFlowBandwidthObject(WinterFlowOrchestrationTool winterFlowOrchestrationTool) {
        WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker;
        long j = WinterFlowVariableVersionControl;
        WinterFlowAdapterUnitTest winterFlowAdapterUnitTest = WinterFlowTransactionManagerStrategy;
        if (winterFlowAdapterUnitTest.WinterFlowRouterStructure > 0) {
            j = ((long[]) winterFlowAdapterUnitTest.WinterFlowCacheManagerAgent)[0];
        }
        WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker2 = null;
        WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker3 = null;
        int i = 0;
        for (WinterFlowOrchestrationInvoker WinterFlowRouterStructure2 = winterFlowOrchestrationTool.WinterFlowRouterStructure(); WinterFlowRouterStructure2 != null; WinterFlowRouterStructure2 = WinterFlowRouterStructure2.WinterFlowHookDataSource) {
            long j2 = WinterFlowRouterStructure2.WinterFlowRouterStructure;
            if (j2 != 0) {
                if (WinterFlowManagerRequest.WinterFlowRouterAdapter(j2, j) >= 0) {
                    i++;
                } else if (winterFlowOrchestrationInvoker2 == null) {
                    i++;
                    winterFlowOrchestrationInvoker2 = WinterFlowRouterStructure2;
                } else {
                    if (WinterFlowManagerRequest.WinterFlowRouterAdapter(WinterFlowRouterStructure2.WinterFlowRouterStructure, winterFlowOrchestrationInvoker2.WinterFlowRouterStructure) < 0) {
                        winterFlowOrchestrationInvoker = winterFlowOrchestrationInvoker2;
                        winterFlowOrchestrationInvoker2 = WinterFlowRouterStructure2;
                    } else {
                        winterFlowOrchestrationInvoker = WinterFlowRouterStructure2;
                    }
                    if (winterFlowOrchestrationInvoker3 == null) {
                        winterFlowOrchestrationInvoker3 = winterFlowOrchestrationTool.WinterFlowRouterStructure();
                        WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker4 = winterFlowOrchestrationInvoker3;
                        while (true) {
                            if (winterFlowOrchestrationInvoker3 == null) {
                                winterFlowOrchestrationInvoker3 = winterFlowOrchestrationInvoker4;
                                break;
                            }
                            if (WinterFlowManagerRequest.WinterFlowRouterAdapter(winterFlowOrchestrationInvoker3.WinterFlowRouterStructure, j) >= 0) {
                                break;
                            }
                            if (WinterFlowManagerRequest.WinterFlowRouterAdapter(winterFlowOrchestrationInvoker4.WinterFlowRouterStructure, winterFlowOrchestrationInvoker3.WinterFlowRouterStructure) < 0) {
                                winterFlowOrchestrationInvoker4 = winterFlowOrchestrationInvoker3;
                            }
                            winterFlowOrchestrationInvoker3 = winterFlowOrchestrationInvoker3.WinterFlowHookDataSource;
                        }
                    }
                    winterFlowOrchestrationInvoker2.WinterFlowRouterStructure = 0L;
                    winterFlowOrchestrationInvoker2.WinterFlowRouterStructure(winterFlowOrchestrationInvoker3);
                    winterFlowOrchestrationInvoker2 = winterFlowOrchestrationInvoker;
                }
            }
        }
        return i > 1;
    }

    public static final void WinterFlowBatchUI(int i) {
        WinterFlowAdapterUnitTest winterFlowAdapterUnitTest = WinterFlowTransactionManagerStrategy;
        int i2 = ((int[]) winterFlowAdapterUnitTest.WinterFlowVariableVersionControl)[i];
        winterFlowAdapterUnitTest.WinterFlowRouterRouter(i2, winterFlowAdapterUnitTest.WinterFlowRouterStructure - 1);
        winterFlowAdapterUnitTest.WinterFlowRouterStructure--;
        long[] jArr = (long[]) winterFlowAdapterUnitTest.WinterFlowCacheManagerAgent;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (WinterFlowManagerRequest.WinterFlowRouterAdapter(jArr[i4], j) <= 0) {
                break;
            }
            winterFlowAdapterUnitTest.WinterFlowRouterRouter(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) winterFlowAdapterUnitTest.WinterFlowCacheManagerAgent;
        int i5 = winterFlowAdapterUnitTest.WinterFlowRouterStructure >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < winterFlowAdapterUnitTest.WinterFlowRouterStructure && WinterFlowManagerRequest.WinterFlowRouterAdapter(jArr2[i6], jArr2[i7]) < 0) {
                if (WinterFlowManagerRequest.WinterFlowRouterAdapter(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                winterFlowAdapterUnitTest.WinterFlowRouterRouter(i6, i2);
                i2 = i6;
            } else {
                if (WinterFlowManagerRequest.WinterFlowRouterAdapter(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                winterFlowAdapterUnitTest.WinterFlowRouterRouter(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) winterFlowAdapterUnitTest.WinterFlowVariableVersionControl)[i] = winterFlowAdapterUnitTest.WinterFlowHookDataSource;
        winterFlowAdapterUnitTest.WinterFlowHookDataSource = i;
    }

    public static final void WinterFlowCacheManagerAgent() {
        WinterFlowHookDataSource(WinterFlowRouterStructure);
    }

    public static final void WinterFlowConcurrencyThread() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final Object WinterFlowHookDataSource(WinterFlowObjectSession winterFlowObjectSession) {
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager;
        Object WinterFlowRouterAdapter;
        WinterFlowSerializerScheduler winterFlowSerializerScheduler = WinterFlowResponseEngine;
        synchronized (WinterFlowCacheManagerAgent) {
            try {
                winterFlowCacheManagerTransactionManager = winterFlowSerializerScheduler.WinterFlowRouterRouter;
                if (winterFlowCacheManagerTransactionManager != null) {
                    WinterFlowTransactionAgent.addAndGet(1);
                }
                WinterFlowRouterAdapter = WinterFlowRouterAdapter(winterFlowSerializerScheduler, winterFlowObjectSession);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (winterFlowCacheManagerTransactionManager != null) {
            try {
                List list = WinterFlowRouterRouter;
                WinterFlowRuntimeNetwork winterFlowRuntimeNetwork = new WinterFlowRuntimeNetwork(winterFlowCacheManagerTransactionManager);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((WinterFlowEventEvent) list.get(i)).WinterFlowVariableVersionControl(winterFlowRuntimeNetwork, winterFlowSerializerScheduler);
                }
            } finally {
                WinterFlowTransactionAgent.addAndGet(-1);
            }
        }
        synchronized (WinterFlowCacheManagerAgent) {
            WinterFlowArrayNetwork();
            if (winterFlowCacheManagerTransactionManager != null) {
                Object[] objArr = winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource;
                long[] jArr = winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    WinterFlowOrchestrationSubsystem((WinterFlowOrchestrationTool) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return WinterFlowRouterAdapter;
    }

    public static final WinterFlowOrchestrationInvoker WinterFlowMapperProtocol(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker, WinterFlowOrchestrationTool winterFlowOrchestrationTool, WinterFlowJSONModule winterFlowJSONModule) {
        WinterFlowOrchestrationInvoker WinterFlowSingletonPlatform;
        if (winterFlowJSONModule.WinterFlowTransactionManagerStrategy()) {
            winterFlowJSONModule.WinterFlowServiceUtility(winterFlowOrchestrationTool);
        }
        long WinterFlowUnitTestResponse2 = winterFlowJSONModule.WinterFlowUnitTestResponse();
        WinterFlowOrchestrationInvoker WinterFlowSingletonPlatform2 = WinterFlowSingletonPlatform(winterFlowOrchestrationInvoker, WinterFlowUnitTestResponse2, winterFlowJSONModule.WinterFlowArrayNetwork());
        if (WinterFlowSingletonPlatform2 == null) {
            WinterFlowConcurrencyThread();
            throw null;
        }
        if (WinterFlowSingletonPlatform2.WinterFlowRouterStructure == winterFlowJSONModule.WinterFlowUnitTestResponse()) {
            return WinterFlowSingletonPlatform2;
        }
        synchronized (WinterFlowCacheManagerAgent) {
            WinterFlowSingletonPlatform = WinterFlowSingletonPlatform(winterFlowOrchestrationTool.WinterFlowRouterStructure(), WinterFlowUnitTestResponse2, winterFlowJSONModule.WinterFlowArrayNetwork());
            if (WinterFlowSingletonPlatform == null) {
                WinterFlowConcurrencyThread();
                throw null;
            }
            if (WinterFlowSingletonPlatform.WinterFlowRouterStructure != WinterFlowUnitTestResponse2) {
                WinterFlowOrchestrationInvoker WinterFlowTransactionAgent2 = WinterFlowTransactionAgent(WinterFlowSingletonPlatform, winterFlowOrchestrationTool);
                WinterFlowTransactionAgent2.WinterFlowRouterStructure(WinterFlowSingletonPlatform);
                WinterFlowTransactionAgent2.WinterFlowRouterStructure = winterFlowJSONModule.WinterFlowUnitTestResponse();
                WinterFlowSingletonPlatform = WinterFlowTransactionAgent2;
            }
        }
        if (WinterFlowSingletonPlatform2.WinterFlowRouterStructure != 1) {
            winterFlowJSONModule.WinterFlowServiceUtility(winterFlowOrchestrationTool);
        }
        return WinterFlowSingletonPlatform;
    }

    public static final void WinterFlowOrchestrationSubsystem(WinterFlowOrchestrationTool winterFlowOrchestrationTool) {
        if (WinterFlowBandwidthObject(winterFlowOrchestrationTool)) {
            WinterFlowBandwidthServer winterFlowBandwidthServer = WinterFlowUnitTestResponse;
            int i = winterFlowBandwidthServer.WinterFlowRouterStructure;
            int identityHashCode = System.identityHashCode(winterFlowOrchestrationTool);
            int i2 = -1;
            if (i > 0) {
                int i3 = winterFlowBandwidthServer.WinterFlowRouterStructure - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) winterFlowBandwidthServer.WinterFlowHookDataSource)[i5];
                    if (i6 < identityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > identityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        WinterFlowWorkerOrchestration winterFlowWorkerOrchestration = ((WinterFlowWorkerOrchestration[]) winterFlowBandwidthServer.WinterFlowCacheManagerAgent)[i5];
                        if (winterFlowOrchestrationTool != (winterFlowWorkerOrchestration != null ? winterFlowWorkerOrchestration.get() : null)) {
                            for (int i7 = i5 - 1; -1 < i7 && ((int[]) winterFlowBandwidthServer.WinterFlowHookDataSource)[i7] == identityHashCode; i7--) {
                                WinterFlowWorkerOrchestration winterFlowWorkerOrchestration2 = ((WinterFlowWorkerOrchestration[]) winterFlowBandwidthServer.WinterFlowCacheManagerAgent)[i7];
                                if ((winterFlowWorkerOrchestration2 != null ? winterFlowWorkerOrchestration2.get() : null) == winterFlowOrchestrationTool) {
                                    i2 = i7;
                                    break;
                                }
                            }
                            i5++;
                            int i8 = winterFlowBandwidthServer.WinterFlowRouterStructure;
                            while (true) {
                                if (i5 >= i8) {
                                    i2 = -(winterFlowBandwidthServer.WinterFlowRouterStructure + 1);
                                    break;
                                } else {
                                    if (((int[]) winterFlowBandwidthServer.WinterFlowHookDataSource)[i5] != identityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    WinterFlowWorkerOrchestration winterFlowWorkerOrchestration3 = ((WinterFlowWorkerOrchestration[]) winterFlowBandwidthServer.WinterFlowCacheManagerAgent)[i5];
                                    if ((winterFlowWorkerOrchestration3 != null ? winterFlowWorkerOrchestration3.get() : null) == winterFlowOrchestrationTool) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                        }
                        i2 = i5;
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            WinterFlowWorkerOrchestration[] winterFlowWorkerOrchestrationArr = (WinterFlowWorkerOrchestration[]) winterFlowBandwidthServer.WinterFlowCacheManagerAgent;
            int length = winterFlowWorkerOrchestrationArr.length;
            if (i == length) {
                int i10 = length * 2;
                WinterFlowWorkerOrchestration[] winterFlowWorkerOrchestrationArr2 = new WinterFlowWorkerOrchestration[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(winterFlowWorkerOrchestrationArr, i9, winterFlowWorkerOrchestrationArr2, i11, i - i9);
                System.arraycopy((WinterFlowWorkerOrchestration[]) winterFlowBandwidthServer.WinterFlowCacheManagerAgent, 0, winterFlowWorkerOrchestrationArr2, 0, i9);
                WinterFlowProtocolPipeline.WinterFlowCompilerHandler((int[]) winterFlowBandwidthServer.WinterFlowHookDataSource, iArr, i11, i9, i);
                WinterFlowProtocolPipeline.WinterFlowUIMiddleware((int[]) winterFlowBandwidthServer.WinterFlowHookDataSource, iArr, 0, i9, 6);
                winterFlowBandwidthServer.WinterFlowCacheManagerAgent = winterFlowWorkerOrchestrationArr2;
                winterFlowBandwidthServer.WinterFlowHookDataSource = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(winterFlowWorkerOrchestrationArr, i9, winterFlowWorkerOrchestrationArr, i12, i - i9);
                int[] iArr2 = (int[]) winterFlowBandwidthServer.WinterFlowHookDataSource;
                WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr2, iArr2, i12, i9, i);
            }
            ((WinterFlowWorkerOrchestration[]) winterFlowBandwidthServer.WinterFlowCacheManagerAgent)[i9] = new WinterFlowWorkerOrchestration(winterFlowOrchestrationTool);
            ((int[]) winterFlowBandwidthServer.WinterFlowHookDataSource)[i9] = identityHashCode;
            winterFlowBandwidthServer.WinterFlowRouterStructure++;
        }
    }

    public static final WinterFlowObjectSession WinterFlowResponseEngine(WinterFlowObjectSession winterFlowObjectSession, WinterFlowObjectSession winterFlowObjectSession2) {
        return (winterFlowObjectSession == null || winterFlowObjectSession2 == null || winterFlowObjectSession == winterFlowObjectSession2) ? winterFlowObjectSession == null ? winterFlowObjectSession2 : winterFlowObjectSession : new WinterFlowValidatorGateway(winterFlowObjectSession, winterFlowObjectSession2, 1);
    }

    public static final Object WinterFlowRouterAdapter(WinterFlowSerializerScheduler winterFlowSerializerScheduler, WinterFlowObjectSession winterFlowObjectSession) {
        long j = winterFlowSerializerScheduler.WinterFlowHookDataSource;
        Object WinterFlowUnitTestResponse2 = winterFlowObjectSession.WinterFlowUnitTestResponse(WinterFlowArrayNetwork.WinterFlowCacheManagerAgent(j));
        long j2 = WinterFlowVariableVersionControl;
        WinterFlowVariableVersionControl = 1 + j2;
        WinterFlowSingletonNode WinterFlowCacheManagerAgent2 = WinterFlowArrayNetwork.WinterFlowCacheManagerAgent(j);
        WinterFlowArrayNetwork = WinterFlowCacheManagerAgent2;
        winterFlowSerializerScheduler.WinterFlowHookDataSource = j2;
        winterFlowSerializerScheduler.WinterFlowRouterStructure = WinterFlowCacheManagerAgent2;
        winterFlowSerializerScheduler.WinterFlowUnitTestResponse = 0;
        winterFlowSerializerScheduler.WinterFlowRouterRouter = null;
        winterFlowSerializerScheduler.WinterFlowBandwidthObject();
        WinterFlowArrayNetwork = WinterFlowArrayNetwork.WinterFlowTransactionManagerStrategy(j2);
        return WinterFlowUnitTestResponse2;
    }

    public static final WinterFlowJSONModule WinterFlowRouterRouter() {
        WinterFlowJSONModule winterFlowJSONModule = (WinterFlowJSONModule) WinterFlowHookDataSource.get();
        return winterFlowJSONModule == null ? WinterFlowResponseEngine : winterFlowJSONModule;
    }

    public static final WinterFlowSingletonNode WinterFlowRouterStructure(WinterFlowSingletonNode winterFlowSingletonNode, long j, long j2) {
        while (WinterFlowManagerRequest.WinterFlowRouterAdapter(j, j2) < 0) {
            winterFlowSingletonNode = winterFlowSingletonNode.WinterFlowTransactionManagerStrategy(j);
            j++;
        }
        return winterFlowSingletonNode;
    }

    public static final void WinterFlowSerializerStructure(WinterFlowJSONModule winterFlowJSONModule) {
        long j;
        if (WinterFlowArrayNetwork.WinterFlowArrayNetwork(winterFlowJSONModule.WinterFlowUnitTestResponse())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(winterFlowJSONModule.WinterFlowUnitTestResponse());
        sb.append(", disposed=");
        sb.append(winterFlowJSONModule.WinterFlowCacheManagerAgent);
        sb.append(", applied=");
        WinterFlowSchedulerTesting winterFlowSchedulerTesting = winterFlowJSONModule instanceof WinterFlowSchedulerTesting ? (WinterFlowSchedulerTesting) winterFlowJSONModule : null;
        sb.append(winterFlowSchedulerTesting != null ? Boolean.valueOf(winterFlowSchedulerTesting.WinterFlowThreadListener) : "read-only");
        sb.append(", lowestPin=");
        synchronized (WinterFlowCacheManagerAgent) {
            WinterFlowAdapterUnitTest winterFlowAdapterUnitTest = WinterFlowTransactionManagerStrategy;
            j = winterFlowAdapterUnitTest.WinterFlowRouterStructure > 0 ? ((long[]) winterFlowAdapterUnitTest.WinterFlowCacheManagerAgent)[0] : -1L;
        }
        sb.append(j);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final void WinterFlowServerProtocol(WinterFlowJSONModule winterFlowJSONModule, WinterFlowOrchestrationTool winterFlowOrchestrationTool) {
        winterFlowJSONModule.WinterFlowBatchUI(winterFlowJSONModule.WinterFlowRouterRouter() + 1);
        WinterFlowObjectSession WinterFlowSyntax2 = winterFlowJSONModule.WinterFlowSyntax();
        if (WinterFlowSyntax2 != null) {
            WinterFlowSyntax2.WinterFlowUnitTestResponse(winterFlowOrchestrationTool);
        }
    }

    public static final WinterFlowOrchestrationInvoker WinterFlowServiceUtility(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker, WinterFlowThreadVersionControl winterFlowThreadVersionControl, WinterFlowJSONModule winterFlowJSONModule, WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker2) {
        WinterFlowOrchestrationInvoker WinterFlowTransactionAgent2;
        if (winterFlowJSONModule.WinterFlowTransactionManagerStrategy()) {
            winterFlowJSONModule.WinterFlowServiceUtility(winterFlowThreadVersionControl);
        }
        long WinterFlowUnitTestResponse2 = winterFlowJSONModule.WinterFlowUnitTestResponse();
        if (winterFlowOrchestrationInvoker2.WinterFlowRouterStructure == WinterFlowUnitTestResponse2) {
            return winterFlowOrchestrationInvoker2;
        }
        synchronized (WinterFlowCacheManagerAgent) {
            WinterFlowTransactionAgent2 = WinterFlowTransactionAgent(winterFlowOrchestrationInvoker, winterFlowThreadVersionControl);
        }
        WinterFlowTransactionAgent2.WinterFlowRouterStructure = WinterFlowUnitTestResponse2;
        if (winterFlowOrchestrationInvoker2.WinterFlowRouterStructure != 1) {
            winterFlowJSONModule.WinterFlowServiceUtility(winterFlowThreadVersionControl);
        }
        return WinterFlowTransactionAgent2;
    }

    public static final WinterFlowOrchestrationInvoker WinterFlowSingletonPlatform(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker, long j, WinterFlowSingletonNode winterFlowSingletonNode) {
        WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker2 = null;
        while (winterFlowOrchestrationInvoker != null) {
            long j2 = winterFlowOrchestrationInvoker.WinterFlowRouterStructure;
            if (j2 != 0 && WinterFlowManagerRequest.WinterFlowRouterAdapter(j2, j) <= 0 && !winterFlowSingletonNode.WinterFlowArrayNetwork(j2) && (winterFlowOrchestrationInvoker2 == null || WinterFlowManagerRequest.WinterFlowRouterAdapter(winterFlowOrchestrationInvoker2.WinterFlowRouterStructure, winterFlowOrchestrationInvoker.WinterFlowRouterStructure) < 0)) {
                winterFlowOrchestrationInvoker2 = winterFlowOrchestrationInvoker;
            }
            winterFlowOrchestrationInvoker = winterFlowOrchestrationInvoker.WinterFlowHookDataSource;
        }
        if (winterFlowOrchestrationInvoker2 != null) {
            return winterFlowOrchestrationInvoker2;
        }
        return null;
    }

    public static final WinterFlowObjectSession WinterFlowSyntax(WinterFlowObjectSession winterFlowObjectSession, WinterFlowObjectSession winterFlowObjectSession2, boolean z) {
        if (!z) {
            winterFlowObjectSession2 = null;
        }
        return (winterFlowObjectSession == null || winterFlowObjectSession2 == null || winterFlowObjectSession == winterFlowObjectSession2) ? winterFlowObjectSession == null ? winterFlowObjectSession2 : winterFlowObjectSession : new WinterFlowValidatorGateway(winterFlowObjectSession, winterFlowObjectSession2, 0);
    }

    public static final HashMap WinterFlowThreadListener(long j, WinterFlowSchedulerTesting winterFlowSchedulerTesting, WinterFlowSingletonNode winterFlowSingletonNode) {
        long[] jArr;
        WinterFlowSingletonNode winterFlowSingletonNode2;
        long[] jArr2;
        WinterFlowSingletonNode winterFlowSingletonNode3;
        int i;
        int i2;
        WinterFlowOrchestrationInvoker WinterFlowSingletonPlatform;
        WinterFlowCacheManagerTransactionManager WinterFlowResolverController = winterFlowSchedulerTesting.WinterFlowResolverController();
        if (WinterFlowResolverController != null) {
            long WinterFlowUnitTestResponse2 = winterFlowSchedulerTesting.WinterFlowUnitTestResponse();
            WinterFlowSingletonNode WinterFlowVariableVersionControl2 = winterFlowSchedulerTesting.WinterFlowArrayNetwork().WinterFlowTransactionManagerStrategy(WinterFlowUnitTestResponse2).WinterFlowVariableVersionControl(winterFlowSchedulerTesting.WinterFlowResponseEngine);
            Object[] objArr = WinterFlowResolverController.WinterFlowHookDataSource;
            long[] jArr3 = WinterFlowResolverController.WinterFlowRouterStructure;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                WinterFlowOrchestrationTool winterFlowOrchestrationTool = (WinterFlowOrchestrationTool) objArr[(i3 << 3) + i6];
                                WinterFlowOrchestrationInvoker WinterFlowRouterStructure2 = winterFlowOrchestrationTool.WinterFlowRouterStructure();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                WinterFlowOrchestrationInvoker WinterFlowSingletonPlatform2 = WinterFlowSingletonPlatform(WinterFlowRouterStructure2, j, winterFlowSingletonNode);
                                if (WinterFlowSingletonPlatform2 == null || (WinterFlowSingletonPlatform = WinterFlowSingletonPlatform(WinterFlowRouterStructure2, WinterFlowUnitTestResponse2, WinterFlowVariableVersionControl2)) == null || WinterFlowSingletonPlatform2.equals(WinterFlowSingletonPlatform)) {
                                    winterFlowSingletonNode3 = WinterFlowVariableVersionControl2;
                                } else {
                                    winterFlowSingletonNode3 = WinterFlowVariableVersionControl2;
                                    WinterFlowOrchestrationInvoker WinterFlowSingletonPlatform3 = WinterFlowSingletonPlatform(WinterFlowRouterStructure2, WinterFlowUnitTestResponse2, winterFlowSchedulerTesting.WinterFlowArrayNetwork());
                                    if (WinterFlowSingletonPlatform3 == null) {
                                        WinterFlowConcurrencyThread();
                                        throw null;
                                    }
                                    WinterFlowOrchestrationInvoker WinterFlowArrayNetwork2 = winterFlowOrchestrationTool.WinterFlowArrayNetwork(WinterFlowSingletonPlatform, WinterFlowSingletonPlatform2, WinterFlowSingletonPlatform3);
                                    if (WinterFlowArrayNetwork2 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(WinterFlowSingletonPlatform2, WinterFlowArrayNetwork2);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                winterFlowSingletonNode3 = WinterFlowVariableVersionControl2;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            WinterFlowVariableVersionControl2 = winterFlowSingletonNode3;
                        }
                        jArr = jArr3;
                        winterFlowSingletonNode2 = WinterFlowVariableVersionControl2;
                        if (i5 != i4) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        winterFlowSingletonNode2 = WinterFlowVariableVersionControl2;
                    }
                    if (i3 == length) {
                        return hashMap;
                    }
                    i3++;
                    jArr3 = jArr;
                    WinterFlowVariableVersionControl2 = winterFlowSingletonNode2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final WinterFlowOrchestrationInvoker WinterFlowTransactionAgent(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker, WinterFlowOrchestrationTool winterFlowOrchestrationTool) {
        WinterFlowOrchestrationInvoker WinterFlowRouterStructure2 = winterFlowOrchestrationTool.WinterFlowRouterStructure();
        long j = WinterFlowVariableVersionControl;
        WinterFlowAdapterUnitTest winterFlowAdapterUnitTest = WinterFlowTransactionManagerStrategy;
        if (winterFlowAdapterUnitTest.WinterFlowRouterStructure > 0) {
            j = ((long[]) winterFlowAdapterUnitTest.WinterFlowCacheManagerAgent)[0];
        }
        long j2 = j - 1;
        WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker2 = null;
        WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker3 = null;
        while (true) {
            if (WinterFlowRouterStructure2 == null) {
                break;
            }
            long j3 = WinterFlowRouterStructure2.WinterFlowRouterStructure;
            if (j3 == 0) {
                break;
            }
            if (j3 != 0 && WinterFlowManagerRequest.WinterFlowRouterAdapter(j3, j2) <= 0 && !WinterFlowSingletonNode.WinterFlowSyntax.WinterFlowArrayNetwork(j3)) {
                if (winterFlowOrchestrationInvoker3 == null) {
                    winterFlowOrchestrationInvoker3 = WinterFlowRouterStructure2;
                } else if (WinterFlowManagerRequest.WinterFlowRouterAdapter(WinterFlowRouterStructure2.WinterFlowRouterStructure, winterFlowOrchestrationInvoker3.WinterFlowRouterStructure) >= 0) {
                    winterFlowOrchestrationInvoker2 = winterFlowOrchestrationInvoker3;
                }
            }
            WinterFlowRouterStructure2 = WinterFlowRouterStructure2.WinterFlowHookDataSource;
        }
        if (winterFlowOrchestrationInvoker2 != null) {
            winterFlowOrchestrationInvoker2.WinterFlowRouterStructure = Long.MAX_VALUE;
            return winterFlowOrchestrationInvoker2;
        }
        WinterFlowOrchestrationInvoker WinterFlowHookDataSource2 = winterFlowOrchestrationInvoker.WinterFlowHookDataSource(Long.MAX_VALUE);
        WinterFlowHookDataSource2.WinterFlowHookDataSource = winterFlowOrchestrationTool.WinterFlowRouterStructure();
        winterFlowOrchestrationTool.WinterFlowCacheManagerAgent(WinterFlowHookDataSource2);
        return WinterFlowHookDataSource2;
    }

    public static final WinterFlowOrchestrationInvoker WinterFlowTransactionManagerStrategy(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker) {
        WinterFlowOrchestrationInvoker WinterFlowSingletonPlatform;
        WinterFlowJSONModule WinterFlowRouterRouter2 = WinterFlowRouterRouter();
        WinterFlowOrchestrationInvoker WinterFlowSingletonPlatform2 = WinterFlowSingletonPlatform(winterFlowOrchestrationInvoker, WinterFlowRouterRouter2.WinterFlowUnitTestResponse(), WinterFlowRouterRouter2.WinterFlowArrayNetwork());
        if (WinterFlowSingletonPlatform2 != null) {
            return WinterFlowSingletonPlatform2;
        }
        synchronized (WinterFlowCacheManagerAgent) {
            WinterFlowJSONModule WinterFlowRouterRouter3 = WinterFlowRouterRouter();
            WinterFlowSingletonPlatform = WinterFlowSingletonPlatform(winterFlowOrchestrationInvoker, WinterFlowRouterRouter3.WinterFlowUnitTestResponse(), WinterFlowRouterRouter3.WinterFlowArrayNetwork());
        }
        if (WinterFlowSingletonPlatform != null) {
            return WinterFlowSingletonPlatform;
        }
        WinterFlowConcurrencyThread();
        throw null;
    }

    public static final WinterFlowOrchestrationInvoker WinterFlowUnitTestResponse(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker, WinterFlowJSONModule winterFlowJSONModule) {
        WinterFlowOrchestrationInvoker WinterFlowSingletonPlatform;
        WinterFlowOrchestrationInvoker WinterFlowSingletonPlatform2 = WinterFlowSingletonPlatform(winterFlowOrchestrationInvoker, winterFlowJSONModule.WinterFlowUnitTestResponse(), winterFlowJSONModule.WinterFlowArrayNetwork());
        if (WinterFlowSingletonPlatform2 != null) {
            return WinterFlowSingletonPlatform2;
        }
        synchronized (WinterFlowCacheManagerAgent) {
            WinterFlowSingletonPlatform = WinterFlowSingletonPlatform(winterFlowOrchestrationInvoker, winterFlowJSONModule.WinterFlowUnitTestResponse(), winterFlowJSONModule.WinterFlowArrayNetwork());
        }
        if (WinterFlowSingletonPlatform != null) {
            return WinterFlowSingletonPlatform;
        }
        WinterFlowConcurrencyThread();
        throw null;
    }

    public static final WinterFlowOrchestrationInvoker WinterFlowVariableBandwidth(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker, WinterFlowOrchestrationTool winterFlowOrchestrationTool) {
        WinterFlowOrchestrationInvoker WinterFlowSingletonPlatform;
        WinterFlowJSONModule WinterFlowRouterRouter2 = WinterFlowRouterRouter();
        WinterFlowObjectSession WinterFlowVariableVersionControl2 = WinterFlowRouterRouter2.WinterFlowVariableVersionControl();
        if (WinterFlowVariableVersionControl2 != null) {
            WinterFlowVariableVersionControl2.WinterFlowUnitTestResponse(winterFlowOrchestrationTool);
        }
        WinterFlowOrchestrationInvoker WinterFlowSingletonPlatform2 = WinterFlowSingletonPlatform(winterFlowOrchestrationInvoker, WinterFlowRouterRouter2.WinterFlowUnitTestResponse(), WinterFlowRouterRouter2.WinterFlowArrayNetwork());
        if (WinterFlowSingletonPlatform2 != null) {
            return WinterFlowSingletonPlatform2;
        }
        synchronized (WinterFlowCacheManagerAgent) {
            WinterFlowJSONModule WinterFlowRouterRouter3 = WinterFlowRouterRouter();
            WinterFlowOrchestrationInvoker WinterFlowRouterStructure2 = winterFlowOrchestrationTool.WinterFlowRouterStructure();
            WinterFlowRouterStructure2.getClass();
            WinterFlowSingletonPlatform = WinterFlowSingletonPlatform(WinterFlowRouterStructure2, WinterFlowRouterRouter3.WinterFlowUnitTestResponse(), WinterFlowRouterRouter3.WinterFlowArrayNetwork());
            if (WinterFlowSingletonPlatform == null) {
                WinterFlowConcurrencyThread();
                throw null;
            }
        }
        return WinterFlowSingletonPlatform;
    }

    public static final WinterFlowJSONModule WinterFlowVariableVersionControl(WinterFlowJSONModule winterFlowJSONModule, WinterFlowObjectSession winterFlowObjectSession, boolean z) {
        boolean z2 = winterFlowJSONModule instanceof WinterFlowSchedulerTesting;
        if (z2 || winterFlowJSONModule == null) {
            return new WinterFlowRefactoringTool(z2 ? (WinterFlowSchedulerTesting) winterFlowJSONModule : null, winterFlowObjectSession, null, false, z);
        }
        return new WinterFlowUnitTestHelper(winterFlowJSONModule, winterFlowObjectSession, false, z);
    }
}
