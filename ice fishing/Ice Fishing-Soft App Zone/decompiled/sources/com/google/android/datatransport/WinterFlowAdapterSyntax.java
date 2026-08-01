package com.google.android.datatransport;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAdapterSyntax extends WinterFlowNodeInheritance implements WinterFlowControllerScript {
    public Set WinterFlowBandwidthObject;
    public int WinterFlowConcurrencyThread;
    public WinterFlowCacheManagerTransactionManager WinterFlowOrchestrationSubsystem;
    public List WinterFlowResponseEngine;
    public WinterFlowCacheManagerTransactionManager WinterFlowServerProtocol;
    public WinterFlowCacheManagerTransactionManager WinterFlowServiceUtility;
    public /* synthetic */ WinterFlowPipelineBackend WinterFlowSingletonPlatform;
    public List WinterFlowSyntax;
    public WinterFlowCacheManagerTransactionManager WinterFlowThreadListener;
    public List WinterFlowTransactionAgent;
    public final /* synthetic */ WinterFlowBackendService WinterFlowVariableBandwidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowAdapterSyntax(WinterFlowBackendService winterFlowBackendService, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(3, winterFlowTransactionManagerLayer);
        this.WinterFlowVariableBandwidth = winterFlowBackendService;
    }

    public static final void WinterFlowOrchestrationSubsystem(WinterFlowBackendService winterFlowBackendService, List list, List list2, List list3, WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager, WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager2, WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager3, WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager4) {
        char c;
        long j;
        long j2;
        synchronized (winterFlowBackendService.WinterFlowCacheManagerAgent) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    WinterFlowTransactionBackend winterFlowTransactionBackend = (WinterFlowTransactionBackend) list3.get(i);
                    winterFlowTransactionBackend.WinterFlowRouterStructure();
                    winterFlowBackendService.WinterFlowTestingNode(winterFlowTransactionBackend);
                }
                list3.clear();
                Object[] objArr = winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource;
                long[] jArr = winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    WinterFlowTransactionBackend winterFlowTransactionBackend2 = (WinterFlowTransactionBackend) objArr[(i2 << 3) + i4];
                                    winterFlowTransactionBackend2.WinterFlowRouterStructure();
                                    winterFlowBackendService.WinterFlowTestingNode(winterFlowTransactionBackend2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource();
                Object[] objArr2 = winterFlowCacheManagerTransactionManager2.WinterFlowHookDataSource;
                long[] jArr2 = winterFlowCacheManagerTransactionManager2.WinterFlowRouterStructure;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((WinterFlowTransactionBackend) objArr2[(i5 << 3) + i7]).WinterFlowUnitTestResponse();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                winterFlowCacheManagerTransactionManager2.WinterFlowHookDataSource();
                winterFlowCacheManagerTransactionManager3.WinterFlowHookDataSource();
                Object[] objArr3 = winterFlowCacheManagerTransactionManager4.WinterFlowHookDataSource;
                long[] jArr3 = winterFlowCacheManagerTransactionManager4.WinterFlowRouterStructure;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    WinterFlowTransactionBackend winterFlowTransactionBackend3 = (WinterFlowTransactionBackend) objArr3[(i8 << 3) + i10];
                                    winterFlowTransactionBackend3.WinterFlowRouterStructure();
                                    winterFlowBackendService.WinterFlowTestingNode(winterFlowTransactionBackend3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                winterFlowCacheManagerTransactionManager4.WinterFlowHookDataSource();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void WinterFlowSingletonPlatform(List list, WinterFlowBackendService winterFlowBackendService) {
        list.clear();
        synchronized (winterFlowBackendService.WinterFlowCacheManagerAgent) {
            try {
                ArrayList arrayList = winterFlowBackendService.WinterFlowTransactionAgent;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((WinterFlowDebugService) arrayList.get(i));
                }
                winterFlowBackendService.WinterFlowTransactionAgent.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowControllerScript
    public final Object WinterFlowArrayNetwork(Object obj, Object obj2, Object obj3) {
        WinterFlowAdapterSyntax winterFlowAdapterSyntax = new WinterFlowAdapterSyntax(this.WinterFlowVariableBandwidth, (WinterFlowTransactionManagerLayer) obj3);
        winterFlowAdapterSyntax.WinterFlowSingletonPlatform = (WinterFlowPipelineBackend) obj2;
        winterFlowAdapterSyntax.WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
        return WinterFlowListenerJava.WinterFlowVariableVersionControl;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0126 -> B:6:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01dc -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowPipelineBackend winterFlowPipelineBackend;
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager;
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager2;
        List list;
        Set set;
        final List list2;
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager3;
        List list3;
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager4;
        final List list4;
        final WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager5;
        final List list5;
        final WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager6;
        WinterFlowBackendService winterFlowBackendService;
        WinterFlowBackendService winterFlowBackendService2;
        Object obj2;
        WinterFlowEventCloud winterFlowEventCloud;
        WinterFlowListenerJava winterFlowListenerJava;
        WinterFlowPipelineBackend winterFlowPipelineBackend2;
        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction;
        WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        int i = this.WinterFlowConcurrencyThread;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            winterFlowPipelineBackend = this.WinterFlowSingletonPlatform;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager7 = WinterFlowLoaderSessionManager.WinterFlowRouterStructure;
            winterFlowCacheManagerTransactionManager = new WinterFlowCacheManagerTransactionManager();
            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager8 = new WinterFlowCacheManagerTransactionManager();
            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager9 = new WinterFlowCacheManagerTransactionManager();
            WinterFlowRuntimeNetwork winterFlowRuntimeNetwork = new WinterFlowRuntimeNetwork(winterFlowCacheManagerTransactionManager9);
            winterFlowCacheManagerTransactionManager2 = new WinterFlowCacheManagerTransactionManager();
            list = arrayList;
            set = winterFlowRuntimeNetwork;
            list2 = arrayList2;
            winterFlowCacheManagerTransactionManager3 = winterFlowCacheManagerTransactionManager9;
            list3 = arrayList3;
            winterFlowCacheManagerTransactionManager4 = winterFlowCacheManagerTransactionManager8;
            winterFlowBackendService2 = this.WinterFlowVariableBandwidth;
            WinterFlowHandlerPlatform winterFlowHandlerPlatform = WinterFlowBackendService.WinterFlowBackendCacheManager;
            synchronized (winterFlowBackendService2.WinterFlowCacheManagerAgent) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager10 = this.WinterFlowOrchestrationSubsystem;
                set = this.WinterFlowBandwidthObject;
                winterFlowCacheManagerTransactionManager3 = this.WinterFlowServiceUtility;
                winterFlowCacheManagerTransactionManager4 = this.WinterFlowThreadListener;
                winterFlowCacheManagerTransactionManager = this.WinterFlowServerProtocol;
                list3 = this.WinterFlowTransactionAgent;
                list2 = this.WinterFlowResponseEngine;
                list = this.WinterFlowSyntax;
                WinterFlowPipelineBackend winterFlowPipelineBackend3 = this.WinterFlowSingletonPlatform;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                winterFlowCacheManagerTransactionManager2 = winterFlowCacheManagerTransactionManager10;
                winterFlowPipelineBackend = winterFlowPipelineBackend3;
                WinterFlowBackendService winterFlowBackendService3 = this.WinterFlowVariableBandwidth;
                WinterFlowHandlerPlatform winterFlowHandlerPlatform2 = WinterFlowBackendService.WinterFlowBackendCacheManager;
                synchronized (winterFlowBackendService3.WinterFlowCacheManagerAgent) {
                    try {
                        if (winterFlowBackendService3.WinterFlowServerProtocol.WinterFlowResponseEngine()) {
                            WinterFlowMicroserviceFunction WinterFlowHookDataSource = WinterFlowRouterStrategy.WinterFlowHookDataSource(winterFlowBackendService3.WinterFlowServerProtocol);
                            winterFlowBackendService3.WinterFlowServerProtocol.WinterFlowRouterStructure();
                            WinterFlowAlgorithmArray winterFlowAlgorithmArray = winterFlowBackendService3.WinterFlowThreadListener;
                            ((WinterFlowDatabaseSchemaStructure) winterFlowAlgorithmArray.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure();
                            ((WinterFlowDatabaseSchemaStructure) winterFlowAlgorithmArray.WinterFlowUnitTestResponse).WinterFlowRouterStructure();
                            winterFlowBackendService3.WinterFlowBandwidthObject.WinterFlowRouterStructure();
                            winterFlowMicroserviceFunction = new WinterFlowMicroserviceFunction(WinterFlowHookDataSource.WinterFlowHookDataSource);
                            Object[] objArr = WinterFlowHookDataSource.WinterFlowRouterStructure;
                            int i4 = WinterFlowHookDataSource.WinterFlowHookDataSource;
                            winterFlowListenerJava = winterFlowListenerJava2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                WinterFlowDebugService winterFlowDebugService = (WinterFlowDebugService) objArr[i5];
                                winterFlowMicroserviceFunction.WinterFlowRouterStructure(new WinterFlowServerPlatform(winterFlowDebugService, winterFlowBackendService3.WinterFlowServiceUtility.WinterFlowUnitTestResponse(winterFlowDebugService)));
                                i5 = i6 + 1;
                                winterFlowPipelineBackend = winterFlowPipelineBackend;
                                objArr = objArr;
                            }
                            winterFlowPipelineBackend2 = winterFlowPipelineBackend;
                            winterFlowBackendService3.WinterFlowServiceUtility.WinterFlowRouterStructure();
                        } else {
                            winterFlowListenerJava = winterFlowListenerJava2;
                            winterFlowPipelineBackend2 = winterFlowPipelineBackend;
                            winterFlowMicroserviceFunction = WinterFlowEventMicroservice.WinterFlowHookDataSource;
                            winterFlowMicroserviceFunction.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = winterFlowMicroserviceFunction.WinterFlowRouterStructure;
                int i7 = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
                for (int i8 = 0; i8 < i7; i8++) {
                    WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) objArr2[i8];
                }
                WinterFlowObjectPackage winterFlowObjectPackage = this.WinterFlowVariableBandwidth.WinterFlowHookDataSource;
                ((WinterFlowFunctionEncryption) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).set(0);
                ((WinterFlowRequestEngine) winterFlowObjectPackage.WinterFlowUnitTestResponse).WinterFlowRouterRouter(new WinterFlowSessionJava(4));
                winterFlowListenerJava2 = winterFlowListenerJava;
                winterFlowPipelineBackend = winterFlowPipelineBackend2;
                i2 = 2;
                i3 = 1;
                winterFlowBackendService2 = this.WinterFlowVariableBandwidth;
                WinterFlowHandlerPlatform winterFlowHandlerPlatform3 = WinterFlowBackendService.WinterFlowBackendCacheManager;
                synchronized (winterFlowBackendService2.WinterFlowCacheManagerAgent) {
                }
                WinterFlowBackendService winterFlowBackendService4 = this.WinterFlowVariableBandwidth;
                this.WinterFlowSingletonPlatform = winterFlowPipelineBackend;
                this.WinterFlowSyntax = list;
                this.WinterFlowResponseEngine = list2;
                this.WinterFlowTransactionAgent = list3;
                this.WinterFlowServerProtocol = winterFlowCacheManagerTransactionManager;
                this.WinterFlowThreadListener = winterFlowCacheManagerTransactionManager4;
                this.WinterFlowServiceUtility = winterFlowCacheManagerTransactionManager3;
                this.WinterFlowBandwidthObject = set;
                this.WinterFlowOrchestrationSubsystem = winterFlowCacheManagerTransactionManager2;
                this.WinterFlowConcurrencyThread = i3;
                if (winterFlowBackendService4.WinterFlowCompilerVariable()) {
                    obj2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                } else {
                    WinterFlowEventCloud winterFlowEventCloud2 = new WinterFlowEventCloud(i3, WinterFlowCloudStack.WinterFlowCompilerVariable(this));
                    winterFlowEventCloud2.WinterFlowSerializerStructure();
                    synchronized (winterFlowBackendService4.WinterFlowCacheManagerAgent) {
                        if (winterFlowBackendService4.WinterFlowCompilerVariable()) {
                            winterFlowEventCloud = winterFlowEventCloud2;
                        } else {
                            winterFlowBackendService4.WinterFlowSingletonPlatform = winterFlowEventCloud2;
                            winterFlowEventCloud = null;
                        }
                    }
                    if (winterFlowEventCloud != null) {
                        winterFlowEventCloud.WinterFlowSyntax(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                    }
                    obj2 = winterFlowEventCloud2.WinterFlowBatchUI();
                    if (obj2 != WinterFlowListenerJava.WinterFlowVariableVersionControl) {
                        obj2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    }
                }
                if (obj2 != winterFlowListenerJava2) {
                    List list6 = list;
                    winterFlowCacheManagerTransactionManager5 = winterFlowCacheManagerTransactionManager;
                    winterFlowCacheManagerTransactionManager6 = winterFlowCacheManagerTransactionManager2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager11 = winterFlowCacheManagerTransactionManager4;
                    final WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager12 = winterFlowCacheManagerTransactionManager3;
                    winterFlowBackendService = this.WinterFlowVariableBandwidth;
                    WinterFlowHandlerPlatform winterFlowHandlerPlatform4 = WinterFlowBackendService.WinterFlowBackendCacheManager;
                    if (winterFlowBackendService.WinterFlowSyntaxSubsystem()) {
                        List list7 = list4;
                        winterFlowCacheManagerTransactionManager2 = winterFlowCacheManagerTransactionManager6;
                        winterFlowCacheManagerTransactionManager = winterFlowCacheManagerTransactionManager5;
                        list = list5;
                        list3 = list7;
                        winterFlowCacheManagerTransactionManager3 = winterFlowCacheManagerTransactionManager12;
                        winterFlowCacheManagerTransactionManager4 = winterFlowCacheManagerTransactionManager11;
                        set = set2;
                        winterFlowBackendService2 = this.WinterFlowVariableBandwidth;
                        WinterFlowHandlerPlatform winterFlowHandlerPlatform32 = WinterFlowBackendService.WinterFlowBackendCacheManager;
                        synchronized (winterFlowBackendService2.WinterFlowCacheManagerAgent) {
                        }
                    } else {
                        final WinterFlowBackendService winterFlowBackendService5 = this.WinterFlowVariableBandwidth;
                        WinterFlowObjectSession winterFlowObjectSession = new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowWorkerSyntax
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.datatransport.WinterFlowObjectSession
                            public final Object WinterFlowUnitTestResponse(Object obj3) {
                                boolean WinterFlowBackendCacheManager;
                                WinterFlowAlgorithmSession winterFlowAlgorithmSession;
                                Object[] objArr3;
                                boolean z;
                                WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                                WinterFlowBackendService winterFlowBackendService6 = WinterFlowBackendService.this;
                                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager13 = winterFlowCacheManagerTransactionManager12;
                                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager14 = winterFlowCacheManagerTransactionManager6;
                                List list8 = list5;
                                List list9 = list2;
                                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager15 = winterFlowCacheManagerTransactionManager5;
                                List list10 = list4;
                                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager16 = winterFlowCacheManagerTransactionManager11;
                                Set set3 = set2;
                                long longValue = ((Long) obj3).longValue();
                                WinterFlowHandlerPlatform winterFlowHandlerPlatform5 = WinterFlowBackendService.WinterFlowBackendCacheManager;
                                synchronized (winterFlowBackendService6.WinterFlowCacheManagerAgent) {
                                    WinterFlowBackendCacheManager = winterFlowBackendService6.WinterFlowBackendCacheManager();
                                }
                                boolean z2 = 0;
                                if (WinterFlowBackendCacheManager) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        ((WinterFlowRequestEngine) winterFlowBackendService6.WinterFlowRouterStructure.WinterFlowUnitTestResponse).WinterFlowRouterRouter(new WinterFlowMiddlewareLibrary(0, longValue));
                                        synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
                                            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager17 = WinterFlowVersionProtocol.WinterFlowResponseEngine.WinterFlowRouterRouter;
                                            if (winterFlowCacheManagerTransactionManager17 != null) {
                                                z = winterFlowCacheManagerTransactionManager17.WinterFlowRouterRouter();
                                            }
                                        }
                                        if (z) {
                                            WinterFlowVersionProtocol.WinterFlowCacheManagerAgent();
                                        }
                                    } finally {
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    winterFlowBackendService6.WinterFlowSyntaxSubsystem();
                                    synchronized (winterFlowBackendService6.WinterFlowCacheManagerAgent) {
                                        try {
                                            WinterFlowJSON winterFlowJSON = winterFlowBackendService6.WinterFlowSyntax;
                                            Object[] objArr4 = winterFlowJSON.WinterFlowVariableVersionControl;
                                            int i9 = winterFlowJSON.WinterFlowUnitTestResponse;
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                list8.add((WinterFlowTransactionBackend) objArr4[i10]);
                                            }
                                            winterFlowBackendService6.WinterFlowSyntax.WinterFlowUnitTestResponse();
                                        } finally {
                                        }
                                    }
                                    winterFlowCacheManagerTransactionManager13.WinterFlowHookDataSource();
                                    winterFlowCacheManagerTransactionManager14.WinterFlowHookDataSource();
                                    while (true) {
                                        if (list8.isEmpty() && list9.isEmpty()) {
                                            break;
                                        }
                                        winterFlowAlgorithmSession = winterFlowAlgorithmSession2;
                                        try {
                                            int size = list8.size();
                                            for (int i11 = 0; i11 < size; i11++) {
                                                WinterFlowTransactionBackend winterFlowTransactionBackend = (WinterFlowTransactionBackend) list8.get(i11);
                                                WinterFlowTransactionBackend WinterFlowUserManagerUserManager = winterFlowBackendService6.WinterFlowUserManagerUserManager(winterFlowTransactionBackend, winterFlowCacheManagerTransactionManager13);
                                                if (WinterFlowUserManagerUserManager != null) {
                                                    list10.add(WinterFlowUserManagerUserManager);
                                                }
                                                winterFlowCacheManagerTransactionManager14.WinterFlowRouterStructure(winterFlowTransactionBackend);
                                            }
                                            list8.clear();
                                            if (winterFlowCacheManagerTransactionManager13.WinterFlowRouterRouter() || winterFlowBackendService6.WinterFlowSyntax.WinterFlowUnitTestResponse != 0) {
                                                synchronized (winterFlowBackendService6.WinterFlowCacheManagerAgent) {
                                                    try {
                                                        List WinterFlowConfigurationSubsystem = winterFlowBackendService6.WinterFlowConfigurationSubsystem();
                                                        int size2 = WinterFlowConfigurationSubsystem.size();
                                                        for (int i12 = 0; i12 < size2; i12++) {
                                                            WinterFlowTransactionBackend winterFlowTransactionBackend2 = (WinterFlowTransactionBackend) WinterFlowConfigurationSubsystem.get(i12);
                                                            if (!winterFlowCacheManagerTransactionManager14.WinterFlowCacheManagerAgent(winterFlowTransactionBackend2) && winterFlowTransactionBackend2.WinterFlowSerializerStructure(set3)) {
                                                                list8.add(winterFlowTransactionBackend2);
                                                            }
                                                        }
                                                        WinterFlowJSON winterFlowJSON2 = winterFlowBackendService6.WinterFlowSyntax;
                                                        int i13 = winterFlowJSON2.WinterFlowUnitTestResponse;
                                                        int i14 = 0;
                                                        int i15 = 0;
                                                        while (true) {
                                                            objArr3 = winterFlowJSON2.WinterFlowVariableVersionControl;
                                                            if (i14 >= i13) {
                                                                break;
                                                            }
                                                            WinterFlowTransactionBackend winterFlowTransactionBackend3 = (WinterFlowTransactionBackend) objArr3[i14];
                                                            if (!winterFlowCacheManagerTransactionManager14.WinterFlowCacheManagerAgent(winterFlowTransactionBackend3) && !list8.contains(winterFlowTransactionBackend3)) {
                                                                list8.add(winterFlowTransactionBackend3);
                                                                i15++;
                                                            } else if (i15 > 0) {
                                                                Object[] objArr5 = winterFlowJSON2.WinterFlowVariableVersionControl;
                                                                objArr5[i14 - i15] = objArr5[i14];
                                                            }
                                                            i14++;
                                                        }
                                                        int i16 = i13 - i15;
                                                        Arrays.fill(objArr3, i16, i13, (Object) null);
                                                        winterFlowJSON2.WinterFlowUnitTestResponse = i16;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list8.isEmpty()) {
                                                try {
                                                    WinterFlowAdapterSyntax.WinterFlowSingletonPlatform(list9, winterFlowBackendService6);
                                                    while (!list9.isEmpty()) {
                                                        List WinterFlowSoftwareProtocol = winterFlowBackendService6.WinterFlowSoftwareProtocol(list9, winterFlowCacheManagerTransactionManager13);
                                                        winterFlowCacheManagerTransactionManager15.getClass();
                                                        Iterator it = WinterFlowSoftwareProtocol.iterator();
                                                        while (it.hasNext()) {
                                                            winterFlowCacheManagerTransactionManager15.WinterFlowTransactionAgent(it.next());
                                                        }
                                                        WinterFlowAdapterSyntax.WinterFlowSingletonPlatform(list9, winterFlowBackendService6);
                                                    }
                                                } catch (Throwable th2) {
                                                    winterFlowBackendService6.WinterFlowSoftwareEngine(th2, null);
                                                    WinterFlowAdapterSyntax.WinterFlowOrchestrationSubsystem(winterFlowBackendService6, list8, list9, list10, winterFlowCacheManagerTransactionManager15, winterFlowCacheManagerTransactionManager16, winterFlowCacheManagerTransactionManager13, winterFlowCacheManagerTransactionManager14);
                                                    return winterFlowAlgorithmSession;
                                                }
                                            }
                                            winterFlowAlgorithmSession2 = winterFlowAlgorithmSession;
                                            z2 = 0;
                                        } catch (Throwable th3) {
                                            try {
                                                winterFlowBackendService6.WinterFlowSoftwareEngine(th3, null);
                                                WinterFlowAdapterSyntax.WinterFlowOrchestrationSubsystem(winterFlowBackendService6, list8, list9, list10, winterFlowCacheManagerTransactionManager15, winterFlowCacheManagerTransactionManager16, winterFlowCacheManagerTransactionManager13, winterFlowCacheManagerTransactionManager14);
                                                list8.clear();
                                                return winterFlowAlgorithmSession;
                                            } catch (Throwable th4) {
                                                list8.clear();
                                                throw th4;
                                            }
                                        }
                                    }
                                    WinterFlowJSONModule WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
                                    WinterFlowJSONModule winterFlowRefactoringTool = WinterFlowRouterRouter instanceof WinterFlowSchedulerTesting ? new WinterFlowRefactoringTool((WinterFlowSchedulerTesting) WinterFlowRouterRouter, null, null, true, false) : new WinterFlowUnitTestHelper(WinterFlowRouterRouter, null, true, z2);
                                    try {
                                        WinterFlowJSONModule WinterFlowResponseEngine = winterFlowRefactoringTool.WinterFlowResponseEngine();
                                        try {
                                            if (!list10.isEmpty()) {
                                                try {
                                                    int size3 = list10.size();
                                                    for (int i17 = z2; i17 < size3; i17++) {
                                                        winterFlowCacheManagerTransactionManager16.WinterFlowRouterStructure((WinterFlowTransactionBackend) list10.get(i17));
                                                    }
                                                    int size4 = list10.size();
                                                    for (int i18 = z2; i18 < size4; i18++) {
                                                        ((WinterFlowTransactionBackend) list10.get(i18)).WinterFlowArrayNetwork();
                                                    }
                                                } catch (Throwable th5) {
                                                    try {
                                                        winterFlowBackendService6.WinterFlowSoftwareEngine(th5, null);
                                                        WinterFlowAdapterSyntax.WinterFlowOrchestrationSubsystem(winterFlowBackendService6, list8, list9, list10, winterFlowCacheManagerTransactionManager15, winterFlowCacheManagerTransactionManager16, winterFlowCacheManagerTransactionManager13, winterFlowCacheManagerTransactionManager14);
                                                        Trace.endSection();
                                                        return winterFlowAlgorithmSession2;
                                                    } finally {
                                                        list10.clear();
                                                    }
                                                }
                                            }
                                            if (winterFlowCacheManagerTransactionManager15.WinterFlowRouterRouter()) {
                                                try {
                                                    winterFlowCacheManagerTransactionManager16.WinterFlowResponseEngine(winterFlowCacheManagerTransactionManager15);
                                                    Object[] objArr6 = winterFlowCacheManagerTransactionManager15.WinterFlowHookDataSource;
                                                    long[] jArr = winterFlowCacheManagerTransactionManager15.WinterFlowRouterStructure;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i19 = 0;
                                                        while (true) {
                                                            long j = jArr[i19];
                                                            Object[] objArr7 = objArr6;
                                                            winterFlowAlgorithmSession = winterFlowAlgorithmSession2;
                                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i20 = 8 - ((~(i19 - length)) >>> 31);
                                                                for (int i21 = 0; i21 < i20; i21++) {
                                                                    if ((j & 255) < 128) {
                                                                        try {
                                                                            ((WinterFlowTransactionBackend) objArr7[(i19 << 3) + i21]).WinterFlowTransactionManagerStrategy();
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            try {
                                                                                winterFlowBackendService6.WinterFlowSoftwareEngine(th, null);
                                                                                WinterFlowAdapterSyntax.WinterFlowOrchestrationSubsystem(winterFlowBackendService6, list8, list9, list10, winterFlowCacheManagerTransactionManager15, winterFlowCacheManagerTransactionManager16, winterFlowCacheManagerTransactionManager13, winterFlowCacheManagerTransactionManager14);
                                                                                return winterFlowAlgorithmSession;
                                                                            } finally {
                                                                                winterFlowCacheManagerTransactionManager15.WinterFlowHookDataSource();
                                                                            }
                                                                        }
                                                                    }
                                                                    j >>= 8;
                                                                }
                                                                if (i20 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i19 == length) {
                                                                break;
                                                            }
                                                            i19++;
                                                            winterFlowAlgorithmSession2 = winterFlowAlgorithmSession;
                                                            objArr6 = objArr7;
                                                        }
                                                    } else {
                                                        winterFlowAlgorithmSession = winterFlowAlgorithmSession2;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    winterFlowAlgorithmSession = winterFlowAlgorithmSession2;
                                                }
                                            } else {
                                                winterFlowAlgorithmSession = winterFlowAlgorithmSession2;
                                            }
                                            if (winterFlowCacheManagerTransactionManager16.WinterFlowRouterRouter()) {
                                                try {
                                                    Object[] objArr8 = winterFlowCacheManagerTransactionManager16.WinterFlowHookDataSource;
                                                    long[] jArr2 = winterFlowCacheManagerTransactionManager16.WinterFlowRouterStructure;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i22 = 0;
                                                        while (true) {
                                                            long j2 = jArr2[i22];
                                                            Object[] objArr9 = objArr8;
                                                            long[] jArr3 = jArr2;
                                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                                                for (int i24 = 0; i24 < i23; i24++) {
                                                                    if ((j2 & 255) < 128) {
                                                                        ((WinterFlowTransactionBackend) objArr9[(i22 << 3) + i24]).WinterFlowUnitTestResponse();
                                                                    }
                                                                    j2 >>= 8;
                                                                }
                                                                if (i23 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i22 == length2) {
                                                                break;
                                                            }
                                                            i22++;
                                                            objArr8 = objArr9;
                                                            jArr2 = jArr3;
                                                        }
                                                    }
                                                } catch (Throwable th8) {
                                                    try {
                                                        winterFlowBackendService6.WinterFlowSoftwareEngine(th8, null);
                                                        WinterFlowAdapterSyntax.WinterFlowOrchestrationSubsystem(winterFlowBackendService6, list8, list9, list10, winterFlowCacheManagerTransactionManager15, winterFlowCacheManagerTransactionManager16, winterFlowCacheManagerTransactionManager13, winterFlowCacheManagerTransactionManager14);
                                                        WinterFlowJSONModule.WinterFlowConcurrencyThread(WinterFlowResponseEngine);
                                                        return winterFlowAlgorithmSession;
                                                    } finally {
                                                        winterFlowCacheManagerTransactionManager16.WinterFlowHookDataSource();
                                                    }
                                                }
                                            }
                                            winterFlowRefactoringTool.WinterFlowCacheManagerAgent();
                                            synchronized (winterFlowBackendService6.WinterFlowCacheManagerAgent) {
                                                if (winterFlowBackendService6.WinterFlowConsumerUserManager() != null) {
                                                    WinterFlowSessionManagerEntity.WinterFlowRouterStructure("unexpected to get continuation here");
                                                }
                                            }
                                            WinterFlowVersionProtocol.WinterFlowRouterRouter().WinterFlowThreadListener();
                                            winterFlowCacheManagerTransactionManager14.WinterFlowHookDataSource();
                                            winterFlowCacheManagerTransactionManager13.WinterFlowHookDataSource();
                                            winterFlowBackendService6.WinterFlowConcurrencyThread = null;
                                            return winterFlowAlgorithmSession;
                                        } finally {
                                            WinterFlowJSONModule.WinterFlowConcurrencyThread(WinterFlowResponseEngine);
                                        }
                                    } finally {
                                        winterFlowRefactoringTool.WinterFlowCacheManagerAgent();
                                    }
                                } finally {
                                }
                            }
                        };
                        this.WinterFlowSingletonPlatform = winterFlowPipelineBackend;
                        this.WinterFlowSyntax = list5;
                        this.WinterFlowResponseEngine = list2;
                        this.WinterFlowTransactionAgent = list4;
                        this.WinterFlowServerProtocol = winterFlowCacheManagerTransactionManager5;
                        this.WinterFlowThreadListener = winterFlowCacheManagerTransactionManager11;
                        this.WinterFlowServiceUtility = winterFlowCacheManagerTransactionManager12;
                        this.WinterFlowBandwidthObject = set2;
                        this.WinterFlowOrchestrationSubsystem = winterFlowCacheManagerTransactionManager6;
                        this.WinterFlowConcurrencyThread = i2;
                        if (winterFlowPipelineBackend.WinterFlowRouterStructure(winterFlowObjectSession, this) != winterFlowListenerJava2) {
                            List list8 = list4;
                            winterFlowCacheManagerTransactionManager2 = winterFlowCacheManagerTransactionManager6;
                            winterFlowCacheManagerTransactionManager = winterFlowCacheManagerTransactionManager5;
                            list = list5;
                            list3 = list8;
                            winterFlowCacheManagerTransactionManager3 = winterFlowCacheManagerTransactionManager12;
                            winterFlowCacheManagerTransactionManager4 = winterFlowCacheManagerTransactionManager11;
                            set = set2;
                            WinterFlowBackendService winterFlowBackendService32 = this.WinterFlowVariableBandwidth;
                            WinterFlowHandlerPlatform winterFlowHandlerPlatform22 = WinterFlowBackendService.WinterFlowBackendCacheManager;
                            synchronized (winterFlowBackendService32.WinterFlowCacheManagerAgent) {
                            }
                        }
                    }
                }
                return winterFlowListenerJava2;
            }
            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager13 = this.WinterFlowOrchestrationSubsystem;
            set = this.WinterFlowBandwidthObject;
            winterFlowCacheManagerTransactionManager3 = this.WinterFlowServiceUtility;
            winterFlowCacheManagerTransactionManager4 = this.WinterFlowThreadListener;
            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager14 = this.WinterFlowServerProtocol;
            List list9 = this.WinterFlowTransactionAgent;
            list2 = this.WinterFlowResponseEngine;
            List list10 = this.WinterFlowSyntax;
            WinterFlowPipelineBackend winterFlowPipelineBackend4 = this.WinterFlowSingletonPlatform;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            winterFlowCacheManagerTransactionManager6 = winterFlowCacheManagerTransactionManager13;
            winterFlowPipelineBackend = winterFlowPipelineBackend4;
            list4 = list9;
            list5 = list10;
            winterFlowCacheManagerTransactionManager5 = winterFlowCacheManagerTransactionManager14;
            final Set set22 = set;
            final WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager112 = winterFlowCacheManagerTransactionManager4;
            final WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager122 = winterFlowCacheManagerTransactionManager3;
            winterFlowBackendService = this.WinterFlowVariableBandwidth;
            WinterFlowHandlerPlatform winterFlowHandlerPlatform42 = WinterFlowBackendService.WinterFlowBackendCacheManager;
            if (winterFlowBackendService.WinterFlowSyntaxSubsystem()) {
            }
        }
    }
}
