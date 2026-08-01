package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowSessionManagerSystem implements WinterFlowEventEvent {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowSessionManagerSystem(int i, int i2, Object obj) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0143, code lost:
    
        if (r4 == null) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014a  */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object[], java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.Collection] */
    @Override // com.google.android.datatransport.WinterFlowEventEvent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        WinterFlowEncryptionComponent winterFlowEncryptionComponent;
        char c;
        char c2;
        ArrayList arrayList;
        char c3 = 7;
        WinterFlowAPIVersion winterFlowAPIVersion = null;
        r13 = null;
        r13 = null;
        r13 = null;
        WinterFlowInvokerPlatform winterFlowInvokerPlatform = null;
        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = null;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowValidator winterFlowValidator = (WinterFlowValidator) this.WinterFlowTransactionManagerStrategy;
                ((Integer) obj).getClass();
                if (obj2 instanceof WinterFlowNodeBandwidth) {
                    WinterFlowNodeBandwidth winterFlowNodeBandwidth = (WinterFlowNodeBandwidth) obj2;
                    WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = winterFlowValidator.WinterFlowRouterRouter;
                    if (winterFlowCacheManagerTransactionManager == null) {
                        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager2 = WinterFlowLoaderSessionManager.WinterFlowRouterStructure;
                        winterFlowCacheManagerTransactionManager = new WinterFlowCacheManagerTransactionManager();
                        winterFlowValidator.WinterFlowRouterRouter = winterFlowCacheManagerTransactionManager;
                    }
                    winterFlowCacheManagerTransactionManager.WinterFlowTransactionAgent(winterFlowNodeBandwidth);
                    winterFlowValidator.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource(winterFlowNodeBandwidth);
                }
                if (obj2 instanceof WinterFlowFrontendHandler) {
                    winterFlowValidator.WinterFlowVariableVersionControl((WinterFlowFrontendHandler) obj2);
                }
                if (obj2 instanceof WinterFlowStackEngine) {
                    ((WinterFlowStackEngine) obj2).WinterFlowCacheManagerAgent();
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 1:
                ((Integer) obj2).getClass();
                WinterFlowSoftwareException.WinterFlowRouterStructure((WinterFlowJavaSubsystem) this.WinterFlowTransactionManagerStrategy, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(1));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 2:
                WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj;
                int intValue = ((Integer) obj2).intValue();
                if (winterFlowResolverLibrary.WinterFlowFrontendBackend(intValue & 1, (intValue & 3) != 2)) {
                    throw null;
                }
                winterFlowResolverLibrary.WinterFlowQueueService();
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 3:
                ((Integer) obj2).getClass();
                WinterFlowTestingCloud.WinterFlowHookDataSource((WinterFlowEventTool) this.WinterFlowTransactionManagerStrategy, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(7));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 4:
                WinterFlowWebsocketPipeline winterFlowWebsocketPipeline = (WinterFlowWebsocketPipeline) obj;
                List list = (List) ((WinterFlowHandlerTool) this.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl(winterFlowWebsocketPipeline, obj2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (obj3 != null && (winterFlowEncryptionComponent = winterFlowWebsocketPipeline.WinterFlowTransactionManagerStrategy) != null && !winterFlowEncryptionComponent.WinterFlowCacheManagerAgent(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowHookHelper winterFlowHookHelper = (WinterFlowHookHelper) this.WinterFlowTransactionManagerStrategy;
                Set set = (Set) obj;
                synchronized (winterFlowHookHelper.WinterFlowRouterStructure) {
                    try {
                        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowHookHelper.WinterFlowHookDataSource;
                        WinterFlowRouterCompiler winterFlowRouterCompiler = new WinterFlowRouterCompiler(18, set, winterFlowHookHelper);
                        WinterFlowUnitTestLibrary.WinterFlowTransactionAgent(1, winterFlowRouterCompiler);
                        Object[] objArr = winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource;
                        long[] jArr = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((j & 255) < 128) {
                                            winterFlowRouterCompiler.WinterFlowUnitTestResponse(objArr[(i2 << 3) + i4]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i3 != 8) {
                                    }
                                }
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        }
                        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager3 = winterFlowHookHelper.WinterFlowArrayNetwork;
                        Object[] objArr2 = winterFlowCacheManagerTransactionManager3.WinterFlowHookDataSource;
                        long[] jArr2 = winterFlowCacheManagerTransactionManager3.WinterFlowRouterStructure;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j2 = jArr2[i5];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((j2 & 255) < 128) {
                                            ((WinterFlowInvokerPlatform) objArr2[(i5 << 3) + i7]).WinterFlowUnitTestResponse(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i6 != 8) {
                                    }
                                }
                                if (i5 != length2) {
                                    i5++;
                                }
                            }
                        }
                        winterFlowHookHelper.WinterFlowArrayNetwork.WinterFlowHookDataSource();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowBackendService winterFlowBackendService = (WinterFlowBackendService) this.WinterFlowTransactionManagerStrategy;
                Set set2 = (Set) obj;
                synchronized (winterFlowBackendService.WinterFlowCacheManagerAgent) {
                    try {
                        if (((WinterFlowUserManagerSystem) winterFlowBackendService.WinterFlowRouterAdapter.getValue()).compareTo(WinterFlowUserManagerSystem.WinterFlowSyntax) >= 0) {
                            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager4 = winterFlowBackendService.WinterFlowRouterRouter;
                            if (set2 instanceof WinterFlowRuntimeNetwork) {
                                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager5 = ((WinterFlowRuntimeNetwork) set2).WinterFlowVariableVersionControl;
                                Object[] objArr3 = winterFlowCacheManagerTransactionManager5.WinterFlowHookDataSource;
                                long[] jArr3 = winterFlowCacheManagerTransactionManager5.WinterFlowRouterStructure;
                                int length3 = jArr3.length - 2;
                                if (length3 >= 0) {
                                    int i8 = 0;
                                    while (true) {
                                        long j3 = jArr3[i8];
                                        if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                                            int i10 = 0;
                                            while (i10 < i9) {
                                                if ((j3 & 255) < 128) {
                                                    Object obj4 = objArr3[(i8 << 3) + i10];
                                                    c2 = c3;
                                                    if (!(obj4 instanceof WinterFlowThreadVersionControl) || ((WinterFlowThreadVersionControl) obj4).WinterFlowTransactionManagerStrategy(1)) {
                                                        winterFlowCacheManagerTransactionManager4.WinterFlowRouterStructure(obj4);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j3 >>= 8;
                                                i10++;
                                                c3 = c2;
                                            }
                                            c = c3;
                                            if (i9 == 8) {
                                            }
                                        } else {
                                            c = c3;
                                        }
                                        if (i8 != length3) {
                                            i8++;
                                            c3 = c;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set2) {
                                    if (!(obj5 instanceof WinterFlowThreadVersionControl) || ((WinterFlowThreadVersionControl) obj5).WinterFlowTransactionManagerStrategy(1)) {
                                        winterFlowCacheManagerTransactionManager4.WinterFlowRouterStructure(obj5);
                                    }
                                }
                            }
                            winterFlowAPIVersion = winterFlowBackendService.WinterFlowConsumerUserManager();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (winterFlowAPIVersion != null) {
                    ((WinterFlowEventCloud) winterFlowAPIVersion).WinterFlowSyntax(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowAlgorithmProcess winterFlowAlgorithmProcess = (WinterFlowAlgorithmProcess) this.WinterFlowTransactionManagerStrategy;
                int intValue2 = ((Integer) obj).intValue();
                WinterFlowStrategyPackage winterFlowStrategyPackage = (WinterFlowStrategyPackage) obj2;
                WinterFlowRendererProvider key = winterFlowStrategyPackage.getKey();
                WinterFlowStrategyPackage WinterFlowConsumerUserManager = winterFlowAlgorithmProcess.WinterFlowSyntax.WinterFlowConsumerUserManager(key);
                if (key != WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth) {
                    if (winterFlowStrategyPackage != WinterFlowConsumerUserManager) {
                        intValue2 = Integer.MIN_VALUE;
                    }
                    intValue2++;
                } else {
                    WinterFlowConsumerBandwidth winterFlowConsumerBandwidth2 = (WinterFlowConsumerBandwidth) WinterFlowConsumerUserManager;
                    WinterFlowConsumerBandwidth winterFlowConsumerBandwidth3 = (WinterFlowConsumerBandwidth) winterFlowStrategyPackage;
                    while (winterFlowConsumerBandwidth3 != null) {
                        if (winterFlowConsumerBandwidth3 != winterFlowConsumerBandwidth2 && (winterFlowConsumerBandwidth3 instanceof WinterFlowVersionControlServer)) {
                            WinterFlowServerNode winterFlowServerNode = (WinterFlowServerNode) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile((WinterFlowVersionControlServer) winterFlowConsumerBandwidth3, WinterFlowControllerTransaction.WinterFlowVariableVersionControl);
                            winterFlowConsumerBandwidth3 = winterFlowServerNode != null ? winterFlowServerNode.getParent() : null;
                        } else {
                            winterFlowConsumerBandwidth = winterFlowConsumerBandwidth3;
                            if (winterFlowConsumerBandwidth == winterFlowConsumerBandwidth2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + winterFlowConsumerBandwidth + ", expected child of " + winterFlowConsumerBandwidth2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (winterFlowConsumerBandwidth == winterFlowConsumerBandwidth2) {
                    }
                }
                return Integer.valueOf(intValue2);
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                WinterFlowConcurrencyThread winterFlowConcurrencyThread = (WinterFlowConcurrencyThread) this.WinterFlowTransactionManagerStrategy;
                WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowConcurrencyThread.WinterFlowModuleService(), null, new WinterFlowCompilerStack(winterFlowConcurrencyThread, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 9:
                WinterFlowMapperBackend winterFlowMapperBackend = (WinterFlowMapperBackend) this.WinterFlowTransactionManagerStrategy;
                Set set3 = (Set) obj;
                synchronized (winterFlowMapperBackend.WinterFlowRouterStructure) {
                    try {
                        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager6 = winterFlowMapperBackend.WinterFlowArrayNetwork;
                        if (winterFlowCacheManagerTransactionManager6 != null) {
                            Object[] objArr4 = winterFlowCacheManagerTransactionManager6.WinterFlowHookDataSource;
                            long[] jArr4 = winterFlowCacheManagerTransactionManager6.WinterFlowRouterStructure;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j4 = jArr4[i11];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length4)) >>> 31);
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < i12) {
                                                if ((j4 & 255) >= 128 || !set3.contains(objArr4[(i11 << 3) + i13])) {
                                                    j4 >>= 8;
                                                    i13++;
                                                } else {
                                                    winterFlowInvokerPlatform = winterFlowMapperBackend.WinterFlowTransactionManagerStrategy;
                                                }
                                            } else if (i12 != 8) {
                                            }
                                        }
                                    }
                                    if (i11 != length4) {
                                        i11++;
                                    }
                                }
                            }
                        } else if (WinterFlowSerializerUtility.WinterFlowVersionControlModule(set3, winterFlowMapperBackend.WinterFlowHookDataSource)) {
                            winterFlowInvokerPlatform = winterFlowMapperBackend.WinterFlowTransactionManagerStrategy;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (winterFlowInvokerPlatform != null) {
                    winterFlowInvokerPlatform.WinterFlowUnitTestResponse(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 10:
                WinterFlowClassStrategy winterFlowClassStrategy = (WinterFlowClassStrategy) this.WinterFlowTransactionManagerStrategy;
                Set set4 = (Set) obj;
                AtomicReference atomicReference = winterFlowClassStrategy.WinterFlowHookDataSource;
                while (true) {
                    Object obj6 = atomicReference.get();
                    if (obj6 == null) {
                        arrayList = set4;
                    } else if (obj6 instanceof Set) {
                        arrayList = WinterFlowUnitTestLibrary.WinterFlowPackageIDE(new Set[]{obj6, set4});
                    } else {
                        if (!(obj6 instanceof List)) {
                            WinterFlowSessionManagerEntity.WinterFlowHookDataSource("Unexpected notification");
                            throw new WinterFlowServerSystem();
                        }
                        arrayList = WinterFlowSerializerUtility.WinterFlowResolverListener((Collection) obj6, WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener(set4));
                    }
                    while (!atomicReference.compareAndSet(obj6, arrayList)) {
                        if (atomicReference.get() != obj6) {
                            break;
                        }
                    }
                    if (winterFlowClassStrategy.WinterFlowHookDataSource()) {
                        winterFlowClassStrategy.WinterFlowRouterStructure.WinterFlowUnitTestResponse(new WinterFlowAPISystem(23, winterFlowClassStrategy));
                    }
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    break;
                }
            default:
                ((WinterFlowObjectSession) this.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse(obj);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
    }

    public /* synthetic */ WinterFlowSessionManagerSystem(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }
}
