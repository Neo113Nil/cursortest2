package com.google.android.datatransport;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.db.AppDatabase_Impl;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMiddlewareVariable extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public Object WinterFlowServerProtocol;
    public final /* synthetic */ Object WinterFlowServiceUtility;
    public final /* synthetic */ int WinterFlowSyntax;
    public /* synthetic */ Object WinterFlowThreadListener;
    public Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowMiddlewareVariable(Object obj, Object obj2, Object obj3, Object obj4, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = obj;
        this.WinterFlowServerProtocol = obj2;
        this.WinterFlowThreadListener = obj3;
        this.WinterFlowServiceUtility = obj4;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowServiceUtility;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowMiddlewareVariable((WinterFlowXMLDebug) this.WinterFlowTransactionAgent, (ScrollCaptureSession) this.WinterFlowServerProtocol, (Rect) this.WinterFlowThreadListener, (Consumer) obj2, winterFlowTransactionManagerLayer, 0);
            case 1:
                WinterFlowMiddlewareVariable winterFlowMiddlewareVariable = new WinterFlowMiddlewareVariable((WinterFlowEventProvider) this.WinterFlowServerProtocol, (WinterFlowHandlerPlatform) this.WinterFlowThreadListener, (Float) obj2, winterFlowTransactionManagerLayer, 1);
                winterFlowMiddlewareVariable.WinterFlowTransactionAgent = obj;
                return winterFlowMiddlewareVariable;
            case 2:
                return new WinterFlowMiddlewareVariable((WinterFlowLibraryAdapter) this.WinterFlowTransactionAgent, (WinterFlowEventProvider) this.WinterFlowServerProtocol, (WinterFlowHandlerPlatform) this.WinterFlowThreadListener, (Float) obj2, winterFlowTransactionManagerLayer, 2);
            case 3:
                WinterFlowMiddlewareVariable winterFlowMiddlewareVariable2 = new WinterFlowMiddlewareVariable((WinterFlowCacheManagerMicroservice) this.WinterFlowServerProtocol, (WinterFlowLibrarySessionManager) this.WinterFlowThreadListener, (WinterFlowHandlerInvoker) obj2, winterFlowTransactionManagerLayer, 3);
                winterFlowMiddlewareVariable2.WinterFlowTransactionAgent = obj;
                return winterFlowMiddlewareVariable2;
            case 4:
                WinterFlowMiddlewareVariable winterFlowMiddlewareVariable3 = new WinterFlowMiddlewareVariable((WinterFlowCloudFramework) this.WinterFlowServerProtocol, (WinterFlowEventCloud) this.WinterFlowThreadListener, (WinterFlowModuleStack) obj2, winterFlowTransactionManagerLayer, 4);
                winterFlowMiddlewareVariable3.WinterFlowTransactionAgent = obj;
                return winterFlowMiddlewareVariable3;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowMiddlewareVariable winterFlowMiddlewareVariable4 = new WinterFlowMiddlewareVariable((WinterFlowDebugLibrary) obj2, winterFlowTransactionManagerLayer);
                winterFlowMiddlewareVariable4.WinterFlowThreadListener = obj;
                return winterFlowMiddlewareVariable4;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowMiddlewareVariable winterFlowMiddlewareVariable5 = new WinterFlowMiddlewareVariable((WinterFlowGatewaySession) this.WinterFlowServerProtocol, (int[]) this.WinterFlowThreadListener, (String[]) obj2, winterFlowTransactionManagerLayer, 6);
                winterFlowMiddlewareVariable5.WinterFlowTransactionAgent = obj;
                return winterFlowMiddlewareVariable5;
            default:
                return new WinterFlowMiddlewareVariable((WinterFlowBandwidthCache) this.WinterFlowTransactionAgent, (WinterFlowBackendService) this.WinterFlowServerProtocol, (WinterFlowDecoratorVersion) this.WinterFlowThreadListener, (WinterFlowIDEUserManager) obj2, winterFlowTransactionManagerLayer, 7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x02a0, code lost:
    
        if (r0 == r14) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02da, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02d7, code lost:
    
        if (com.google.android.datatransport.WinterFlowDecoratorUI.WinterFlowArrayNetwork(r1, 0.0f, r3, r3, r24, 4) == r14) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0334, code lost:
    
        if (r8.WinterFlowRouterStructure(r9, r24) == r0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0314, code lost:
    
        if (r8.WinterFlowRouterStructure(r9, r24) == r0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x032b, code lost:
    
        if (com.google.android.datatransport.WinterFlowQuerySyntax.WinterFlowTransactionAgent(r3, r5, r24) == r0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0370, code lost:
    
        if (com.google.android.datatransport.WinterFlowSoftwareException.WinterFlowMapperProtocol(r1, r7, r24) == r0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0110, code lost:
    
        if (r9 == r0) goto L65;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0152 A[Catch: all -> 0x0164, TryCatch #2 {all -> 0x0164, blocks: (B:43:0x014e, B:45:0x0152, B:47:0x0160, B:49:0x0166, B:53:0x016b, B:55:0x016f), top: B:42:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
    /* JADX WARN: Type inference failed for: r2v24, types: [com.google.android.datatransport.WinterFlowDecoratorVersion] */
    /* JADX WARN: Type inference failed for: r2v25, types: [com.google.android.datatransport.WinterFlowDecoratorVersion] */
    /* JADX WARN: Type inference failed for: r2v27, types: [com.google.android.datatransport.WinterFlowDatabaseUtility] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x01e8 -> B:101:0x01b5). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        Object WinterFlowRouterStructure;
        Object WinterFlowModuleAgent;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer;
        WinterFlowAdapterResponse winterFlowAdapterResponse;
        WinterFlowDebugLibrary winterFlowDebugLibrary;
        Object obj2;
        WinterFlowAdapterResponse winterFlowAdapterResponse2;
        WinterFlowTransactionManagerService winterFlowTransactionManagerService;
        WinterFlowCacheInterface winterFlowCacheInterface;
        ReentrantLock reentrantLock;
        long j;
        boolean z;
        Object WinterFlowThreadListener;
        WinterFlowCacheInterface winterFlowCacheInterface2;
        WinterFlowSerializerComponent winterFlowSerializerComponent;
        boolean z2;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer2 = null;
        switch (this.WinterFlowSyntax) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i = this.WinterFlowResponseEngine;
                if (i == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowXMLDebug winterFlowXMLDebug = (WinterFlowXMLDebug) this.WinterFlowTransactionAgent;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.WinterFlowServerProtocol;
                    Rect rect = (Rect) this.WinterFlowThreadListener;
                    WinterFlowLibraryInterface winterFlowLibraryInterface = new WinterFlowLibraryInterface(rect.left, rect.top, rect.right, rect.bottom);
                    this.WinterFlowResponseEngine = 1;
                    WinterFlowRouterStructure = winterFlowXMLDebug.WinterFlowRouterStructure(scrollCaptureSession, winterFlowLibraryInterface, this);
                    if (WinterFlowRouterStructure == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowRouterStructure = obj;
                }
                ((Consumer) this.WinterFlowServiceUtility).accept(WinterFlowProtocolNetwork.WinterFlowResponseEngine((WinterFlowLibraryInterface) WinterFlowRouterStructure));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 1:
                WinterFlowHandlerPlatform winterFlowHandlerPlatform = (WinterFlowHandlerPlatform) this.WinterFlowThreadListener;
                WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    int ordinal = ((WinterFlowTransactionManagerXML) this.WinterFlowTransactionAgent).ordinal();
                    if (ordinal == 0) {
                        WinterFlowEventProvider winterFlowEventProvider = (WinterFlowEventProvider) this.WinterFlowServerProtocol;
                        this.WinterFlowResponseEngine = 1;
                        if (winterFlowEventProvider.WinterFlowRouterStructure(winterFlowHandlerPlatform, this) == winterFlowListenerJava2) {
                            return winterFlowListenerJava2;
                        }
                    } else if (ordinal != 1) {
                        if (ordinal != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                            return null;
                        }
                        Float f = (Float) this.WinterFlowServiceUtility;
                        if (f == WinterFlowHandlerWebsocket.WinterFlowSingletonPlatform) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        winterFlowHandlerPlatform.WinterFlowTransactionAgent(null, f);
                    }
                } else {
                    if (i2 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 2:
                WinterFlowEventProvider winterFlowEventProvider2 = (WinterFlowEventProvider) this.WinterFlowServerProtocol;
                WinterFlowHandlerPlatform winterFlowHandlerPlatform2 = (WinterFlowHandlerPlatform) this.WinterFlowThreadListener;
                WinterFlowListenerJava winterFlowListenerJava3 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i3 = this.WinterFlowResponseEngine;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            this.WinterFlowResponseEngine = 3;
                            break;
                        } else if (i3 != 3 && i3 != 4) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowLibraryAdapter winterFlowLibraryAdapter = (WinterFlowLibraryAdapter) this.WinterFlowTransactionAgent;
                if (winterFlowLibraryAdapter == WinterFlowDeserializationEntity.WinterFlowRouterStructure) {
                    this.WinterFlowResponseEngine = 1;
                    break;
                } else {
                    WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer3 = null;
                    if (winterFlowLibraryAdapter == WinterFlowDeserializationEntity.WinterFlowHookDataSource) {
                        WinterFlowParserClass WinterFlowUnitTestResponse = winterFlowHandlerPlatform2.WinterFlowUnitTestResponse();
                        WinterFlowJavaAPI winterFlowJavaAPI = new WinterFlowJavaAPI(2, null);
                        this.WinterFlowResponseEngine = 2;
                        break;
                    } else {
                        WinterFlowParserClass WinterFlowUnitTestResponse2 = winterFlowHandlerPlatform2.WinterFlowUnitTestResponse();
                        WinterFlowVariableAdapter winterFlowVariableAdapter = new WinterFlowVariableAdapter(winterFlowLibraryAdapter, null);
                        int i4 = WinterFlowDeploymentPlatform.WinterFlowRouterStructure;
                        WinterFlowEventProvider WinterFlowOrchestrationSubsystem = WinterFlowServerManager.WinterFlowOrchestrationSubsystem(WinterFlowServerManager.WinterFlowOrchestrationSubsystem(new WinterFlowResolverSyntax(new WinterFlowResponseVersionControl(winterFlowVariableAdapter, WinterFlowUnitTestResponse2, WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl, -2, WinterFlowDataSourceHandler.WinterFlowVariableVersionControl), new WinterFlowConcurrencyMiddleware(2, null, 2))));
                        WinterFlowMiddlewareVariable winterFlowMiddlewareVariable = new WinterFlowMiddlewareVariable(winterFlowEventProvider2, winterFlowHandlerPlatform2, (Float) this.WinterFlowServiceUtility, winterFlowTransactionManagerLayer3, 1);
                        this.WinterFlowResponseEngine = 4;
                        break;
                    }
                }
                return winterFlowListenerJava3;
            case 3:
                WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) this.WinterFlowThreadListener;
                WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice = (WinterFlowCacheManagerMicroservice) this.WinterFlowServerProtocol;
                WinterFlowListenerJava winterFlowListenerJava4 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i5 = this.WinterFlowResponseEngine;
                if (i5 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowAdapterResponse winterFlowAdapterResponse3 = (WinterFlowAdapterResponse) this.WinterFlowTransactionAgent;
                    WinterFlowResolverSubsystem winterFlowResolverSubsystem = winterFlowCacheManagerMicroservice.WinterFlowCacheManagerAgent;
                    WinterFlowObjectHandler winterFlowObjectHandler = winterFlowCacheManagerMicroservice.WinterFlowSyntax;
                    WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer4 = null;
                    if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowResolverSubsystem.getValue(), winterFlowLibrarySessionManager)) {
                        long longValue = ((Number) ((WinterFlowHandlerInvoker) this.WinterFlowServiceUtility).WinterFlowServerProtocol.getValue()).longValue() / 1000000;
                        float WinterFlowRouterRouter = winterFlowObjectHandler.WinterFlowRouterRouter();
                        WinterFlowManagerService WinterFlowCompilerDataSource = WinterFlowUnitTestLibrary.WinterFlowCompilerDataSource((int) (winterFlowObjectHandler.WinterFlowRouterRouter() * longValue), 6, null);
                        WinterFlowConsumerVersionControl winterFlowConsumerVersionControl = new WinterFlowConsumerVersionControl(winterFlowAdapterResponse3, winterFlowCacheManagerMicroservice, winterFlowLibrarySessionManager, 6);
                        this.WinterFlowResponseEngine = 2;
                        break;
                    } else {
                        this.WinterFlowResponseEngine = 1;
                        WinterFlowHandlerInvoker winterFlowHandlerInvoker = winterFlowCacheManagerMicroservice.WinterFlowVariableVersionControl;
                        if (winterFlowHandlerInvoker == null || (r0 = WinterFlowCompilerHelper.WinterFlowRouterStructure(winterFlowCacheManagerMicroservice.WinterFlowServerProtocol, new WinterFlowStackManager(winterFlowHandlerInvoker, winterFlowCacheManagerMicroservice, winterFlowLibrarySessionManager, winterFlowTransactionManagerLayer4, 0), this)) != winterFlowListenerJava4) {
                            Object obj3 = winterFlowAlgorithmSession;
                            break;
                        }
                    }
                } else {
                    if (i5 != 1 && i5 != 2) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                return winterFlowAlgorithmSession;
            case 4:
                WinterFlowListenerJava winterFlowListenerJava5 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i6 = this.WinterFlowResponseEngine;
                if (i6 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowStrategyPackage WinterFlowConsumerUserManager = ((WinterFlowAdapterResponse) this.WinterFlowTransactionAgent).WinterFlowRouterRouter().WinterFlowConsumerUserManager(WinterFlowCacheUtility.WinterFlowMapperProtocol);
                    WinterFlowConsumerUserManager.getClass();
                    WinterFlowUnitTestRouter winterFlowUnitTestRouter = (WinterFlowUnitTestRouter) WinterFlowConsumerUserManager;
                    WinterFlowCloudFramework winterFlowCloudFramework = (WinterFlowCloudFramework) this.WinterFlowServerProtocol;
                    WinterFlowEncryptionMicroservice WinterFlowArrayHelper = WinterFlowTestingCloud.WinterFlowArrayHelper(winterFlowUnitTestRouter, new WinterFlowUIBackend(winterFlowUnitTestRouter));
                    WinterFlowEncryptionMicroservice WinterFlowOrchestrationSubsystem2 = WinterFlowArrayHelper.WinterFlowOrchestrationSubsystem(new WinterFlowConsumerModule(WinterFlowArrayHelper, winterFlowCloudFramework.WinterFlowRouterRouter));
                    WinterFlowEventCloud winterFlowEventCloud = (WinterFlowEventCloud) this.WinterFlowThreadListener;
                    WinterFlowModuleStack winterFlowModuleStack = (WinterFlowModuleStack) this.WinterFlowServiceUtility;
                    this.WinterFlowTransactionAgent = winterFlowEventCloud;
                    this.WinterFlowResponseEngine = 1;
                    WinterFlowModuleAgent = WinterFlowCacheRuntime.WinterFlowModuleAgent(WinterFlowOrchestrationSubsystem2, winterFlowModuleStack, this);
                    if (WinterFlowModuleAgent == winterFlowListenerJava5) {
                        return winterFlowListenerJava5;
                    }
                    winterFlowTransactionManagerLayer = winterFlowEventCloud;
                } else {
                    if (i6 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    winterFlowTransactionManagerLayer = (WinterFlowTransactionManagerLayer) this.WinterFlowTransactionAgent;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowModuleAgent = obj;
                }
                winterFlowTransactionManagerLayer.WinterFlowSyntax(WinterFlowModuleAgent);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowDebugLibrary winterFlowDebugLibrary2 = (WinterFlowDebugLibrary) this.WinterFlowServiceUtility;
                WinterFlowListenerJava winterFlowListenerJava6 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i7 = this.WinterFlowResponseEngine;
                try {
                    if (i7 == 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowThreadListener;
                    } else {
                        if (i7 == 1) {
                            winterFlowTransactionManagerService = (WinterFlowTransactionManagerService) this.WinterFlowServerProtocol;
                            WinterFlowDebugLibrary winterFlowDebugLibrary3 = (WinterFlowDebugLibrary) this.WinterFlowTransactionAgent;
                            WinterFlowAdapterResponse winterFlowAdapterResponse4 = (WinterFlowAdapterResponse) this.WinterFlowThreadListener;
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            winterFlowDebugLibrary = winterFlowDebugLibrary3;
                            winterFlowAdapterResponse2 = winterFlowAdapterResponse4;
                            obj2 = obj;
                            this.WinterFlowThreadListener = winterFlowAdapterResponse2;
                            this.WinterFlowTransactionAgent = null;
                            this.WinterFlowServerProtocol = null;
                            this.WinterFlowResponseEngine = 2;
                            if (winterFlowDebugLibrary.WinterFlowCacheManagerAgent(winterFlowTransactionManagerService, (WinterFlowAdapterUtility) obj2, this) != winterFlowListenerJava6) {
                                winterFlowAdapterResponse = winterFlowAdapterResponse2;
                            }
                            return winterFlowListenerJava6;
                        }
                        if (i7 != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowThreadListener;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    }
                    if (!WinterFlowInvokerComponent.WinterFlowSoftwareProtocol(winterFlowAdapterResponse.WinterFlowRouterRouter())) {
                        winterFlowDebugLibrary2.WinterFlowUnitTestResponse = null;
                        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    }
                    WinterFlowTransactionManagerService winterFlowTransactionManagerService2 = winterFlowDebugLibrary2.WinterFlowRouterStructure;
                    WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = winterFlowDebugLibrary2.WinterFlowTransactionManagerStrategy;
                    this.WinterFlowThreadListener = winterFlowAdapterResponse;
                    this.WinterFlowTransactionAgent = winterFlowDebugLibrary2;
                    this.WinterFlowServerProtocol = winterFlowTransactionManagerService2;
                    this.WinterFlowResponseEngine = 1;
                    obj2 = winterFlowWorkerThreadPool.WinterFlowVariableVersionControl(this);
                    if (obj2 == winterFlowListenerJava6) {
                        return winterFlowListenerJava6;
                    }
                    winterFlowAdapterResponse2 = winterFlowAdapterResponse;
                    winterFlowTransactionManagerService = winterFlowTransactionManagerService2;
                    winterFlowDebugLibrary = winterFlowDebugLibrary2;
                    this.WinterFlowThreadListener = winterFlowAdapterResponse2;
                    this.WinterFlowTransactionAgent = null;
                    this.WinterFlowServerProtocol = null;
                    this.WinterFlowResponseEngine = 2;
                    if (winterFlowDebugLibrary.WinterFlowCacheManagerAgent(winterFlowTransactionManagerService, (WinterFlowAdapterUtility) obj2, this) != winterFlowListenerJava6) {
                    }
                    return winterFlowListenerJava6;
                } catch (Throwable th) {
                    winterFlowDebugLibrary2.WinterFlowUnitTestResponse = null;
                    throw th;
                }
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                int[] iArr = (int[]) this.WinterFlowThreadListener;
                WinterFlowGatewaySession winterFlowGatewaySession = (WinterFlowGatewaySession) this.WinterFlowServerProtocol;
                WinterFlowListenerJava winterFlowListenerJava7 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i8 = this.WinterFlowResponseEngine;
                if (i8 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowCacheInterface = (WinterFlowCacheInterface) this.WinterFlowTransactionAgent;
                    WinterFlowSerializerComponent winterFlowSerializerComponent2 = winterFlowGatewaySession.WinterFlowRouterRouter;
                    reentrantLock = winterFlowSerializerComponent2.WinterFlowRouterStructure;
                    reentrantLock.lock();
                    try {
                        boolean z3 = false;
                        for (int i9 : iArr) {
                            long[] jArr = winterFlowSerializerComponent2.WinterFlowHookDataSource;
                            long j2 = jArr[i9];
                            jArr[i9] = j2 + 1;
                            if (j2 == 0) {
                                winterFlowSerializerComponent2.WinterFlowArrayNetwork = true;
                                z3 = true;
                            }
                        }
                        j = 1;
                        if (!z3 && !winterFlowSerializerComponent2.WinterFlowArrayNetwork) {
                            if (!winterFlowSerializerComponent2.WinterFlowTransactionManagerStrategy) {
                                z = false;
                                reentrantLock.unlock();
                                if (z) {
                                    AppDatabase_Impl appDatabase_Impl = winterFlowGatewaySession.WinterFlowRouterStructure;
                                    this.WinterFlowTransactionAgent = winterFlowCacheInterface;
                                    this.WinterFlowResponseEngine = 1;
                                    WinterFlowThreadListener = WinterFlowQuerySyntax.WinterFlowThreadListener(appDatabase_Impl, false, this);
                                    break;
                                }
                                WinterFlowBandwidthCache winterFlowBandwidthCache = new WinterFlowBandwidthCache();
                                WinterFlowHandlerStructure winterFlowHandlerStructure = winterFlowGatewaySession.WinterFlowSyntax;
                                WinterFlowValidatorParser winterFlowValidatorParser = new WinterFlowValidatorParser(winterFlowBandwidthCache, winterFlowCacheInterface, (String[]) this.WinterFlowServiceUtility, iArr);
                                this.WinterFlowTransactionAgent = null;
                                this.WinterFlowResponseEngine = 3;
                                winterFlowHandlerStructure.WinterFlowRouterStructure(winterFlowValidatorParser, this);
                                return winterFlowListenerJava7;
                            }
                        }
                        z = true;
                        reentrantLock.unlock();
                        if (z) {
                        }
                        WinterFlowBandwidthCache winterFlowBandwidthCache2 = new WinterFlowBandwidthCache();
                        WinterFlowHandlerStructure winterFlowHandlerStructure2 = winterFlowGatewaySession.WinterFlowSyntax;
                        WinterFlowValidatorParser winterFlowValidatorParser2 = new WinterFlowValidatorParser(winterFlowBandwidthCache2, winterFlowCacheInterface, (String[]) this.WinterFlowServiceUtility, iArr);
                        this.WinterFlowTransactionAgent = null;
                        this.WinterFlowResponseEngine = 3;
                        winterFlowHandlerStructure2.WinterFlowRouterStructure(winterFlowValidatorParser2, this);
                        return winterFlowListenerJava7;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        try {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            throw new WinterFlowServerSystem();
                        } catch (Throwable th3) {
                            th = th3;
                            j = 1;
                            winterFlowSerializerComponent = winterFlowGatewaySession.WinterFlowRouterRouter;
                            iArr.getClass();
                            reentrantLock = winterFlowSerializerComponent.WinterFlowRouterStructure;
                            reentrantLock.lock();
                            try {
                                z2 = false;
                                while (r12 < r3) {
                                }
                                if (!z2) {
                                    boolean z4 = winterFlowSerializerComponent.WinterFlowTransactionManagerStrategy;
                                }
                                reentrantLock.unlock();
                                throw th;
                            } finally {
                                reentrantLock.unlock();
                            }
                        }
                    }
                    winterFlowCacheInterface2 = (WinterFlowCacheInterface) this.WinterFlowTransactionAgent;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    j = 1;
                    winterFlowCacheInterface = winterFlowCacheInterface2;
                    try {
                        WinterFlowBandwidthCache winterFlowBandwidthCache22 = new WinterFlowBandwidthCache();
                        WinterFlowHandlerStructure winterFlowHandlerStructure22 = winterFlowGatewaySession.WinterFlowSyntax;
                        WinterFlowValidatorParser winterFlowValidatorParser22 = new WinterFlowValidatorParser(winterFlowBandwidthCache22, winterFlowCacheInterface, (String[]) this.WinterFlowServiceUtility, iArr);
                        this.WinterFlowTransactionAgent = null;
                        this.WinterFlowResponseEngine = 3;
                        winterFlowHandlerStructure22.WinterFlowRouterStructure(winterFlowValidatorParser22, this);
                        return winterFlowListenerJava7;
                    } catch (Throwable th4) {
                        th = th4;
                        winterFlowSerializerComponent = winterFlowGatewaySession.WinterFlowRouterRouter;
                        iArr.getClass();
                        reentrantLock = winterFlowSerializerComponent.WinterFlowRouterStructure;
                        reentrantLock.lock();
                        z2 = false;
                        for (int i10 : iArr) {
                            long[] jArr2 = winterFlowSerializerComponent.WinterFlowHookDataSource;
                            long j3 = jArr2[i10];
                            jArr2[i10] = j3 - j;
                            if (j3 == j) {
                                winterFlowSerializerComponent.WinterFlowArrayNetwork = true;
                                z2 = true;
                            }
                        }
                        if (!z2 && !winterFlowSerializerComponent.WinterFlowArrayNetwork) {
                            boolean z42 = winterFlowSerializerComponent.WinterFlowTransactionManagerStrategy;
                        }
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                winterFlowCacheInterface = (WinterFlowCacheInterface) this.WinterFlowTransactionAgent;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowThreadListener = obj;
                j = 1;
                WinterFlowGatewayWorker winterFlowGatewayWorker = new WinterFlowGatewayWorker(winterFlowGatewaySession, winterFlowTransactionManagerLayer2, 13);
                this.WinterFlowTransactionAgent = winterFlowCacheInterface;
                this.WinterFlowResponseEngine = 2;
                if (WinterFlowCacheRuntime.WinterFlowModuleAgent((WinterFlowEncryptionMicroservice) WinterFlowThreadListener, winterFlowGatewayWorker, this) != winterFlowListenerJava7) {
                    winterFlowCacheInterface2 = winterFlowCacheInterface;
                    winterFlowCacheInterface = winterFlowCacheInterface2;
                    WinterFlowBandwidthCache winterFlowBandwidthCache222 = new WinterFlowBandwidthCache();
                    WinterFlowHandlerStructure winterFlowHandlerStructure222 = winterFlowGatewaySession.WinterFlowSyntax;
                    WinterFlowValidatorParser winterFlowValidatorParser222 = new WinterFlowValidatorParser(winterFlowBandwidthCache222, winterFlowCacheInterface, (String[]) this.WinterFlowServiceUtility, iArr);
                    this.WinterFlowTransactionAgent = null;
                    this.WinterFlowResponseEngine = 3;
                    winterFlowHandlerStructure222.WinterFlowRouterStructure(winterFlowValidatorParser222, this);
                }
                return winterFlowListenerJava7;
            default:
                WinterFlowIDEUserManager winterFlowIDEUserManager = (WinterFlowIDEUserManager) this.WinterFlowServiceUtility;
                ?? r2 = (WinterFlowDecoratorVersion) this.WinterFlowThreadListener;
                WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                WinterFlowBackendService winterFlowBackendService = (WinterFlowBackendService) this.WinterFlowServerProtocol;
                WinterFlowListenerJava winterFlowListenerJava8 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i11 = this.WinterFlowResponseEngine;
                try {
                    if (i11 == 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        WinterFlowProcessorAgent winterFlowProcessorAgent = (WinterFlowProcessorAgent) ((WinterFlowBandwidthCache) this.WinterFlowTransactionAgent).WinterFlowVariableVersionControl;
                        if (winterFlowProcessorAgent != null) {
                            winterFlowProcessorAgent.WinterFlowTransactionManagerStrategy = WinterFlowEncryptionSubsystem.WinterFlowHookDataSource(winterFlowBackendService.WinterFlowResolverController);
                        }
                        this.WinterFlowResponseEngine = 1;
                        WinterFlowAdapterSyntax winterFlowAdapterSyntax = new WinterFlowAdapterSyntax(winterFlowBackendService, null);
                        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = this.WinterFlowTransactionManagerStrategy;
                        winterFlowEncryptionMicroservice.getClass();
                        Object WinterFlowModuleAgent2 = WinterFlowCacheRuntime.WinterFlowModuleAgent(winterFlowBackendService.WinterFlowRouterStructure, new WinterFlowRuntimeMechanism(winterFlowBackendService, winterFlowAdapterSyntax, WinterFlowManagerRequest.WinterFlowCompilerVariable(winterFlowEncryptionMicroservice), (WinterFlowTransactionManagerLayer) null, 1), this);
                        if (WinterFlowModuleAgent2 != winterFlowListenerJava8) {
                            WinterFlowModuleAgent2 = winterFlowAlgorithmSession2;
                        }
                        if (WinterFlowModuleAgent2 != winterFlowListenerJava8) {
                            WinterFlowModuleAgent2 = winterFlowAlgorithmSession2;
                        }
                        if (WinterFlowModuleAgent2 == winterFlowListenerJava8) {
                            return winterFlowListenerJava8;
                        }
                    } else {
                        if (i11 != 1) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    }
                    return winterFlowAlgorithmSession2;
                } finally {
                    r2.WinterFlowUnitTestResponse().WinterFlowTransactionManagerStrategy(winterFlowIDEUserManager);
                }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowMiddlewareVariable) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 1:
                return ((WinterFlowMiddlewareVariable) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowTransactionManagerXML) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 2:
                return ((WinterFlowMiddlewareVariable) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 3:
                return ((WinterFlowMiddlewareVariable) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 4:
                return ((WinterFlowMiddlewareVariable) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return ((WinterFlowMiddlewareVariable) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                ((WinterFlowMiddlewareVariable) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowCacheInterface) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                return WinterFlowListenerJava.WinterFlowVariableVersionControl;
            default:
                return ((WinterFlowMiddlewareVariable) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowMiddlewareVariable(Object obj, Object obj2, Object obj3, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowServerProtocol = obj;
        this.WinterFlowThreadListener = obj2;
        this.WinterFlowServiceUtility = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowMiddlewareVariable(WinterFlowDebugLibrary winterFlowDebugLibrary, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = 5;
        this.WinterFlowServiceUtility = winterFlowDebugLibrary;
    }
}
