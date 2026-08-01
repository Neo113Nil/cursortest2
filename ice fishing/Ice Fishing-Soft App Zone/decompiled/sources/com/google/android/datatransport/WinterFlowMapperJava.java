package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperJava extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public Object WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowThreadListener;
    public Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowMapperJava(Object obj, Object obj2, Object obj3, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = obj;
        this.WinterFlowServerProtocol = obj2;
        this.WinterFlowThreadListener = obj3;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowThreadListener;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowMapperJava((WinterFlowJSONDecorator) this.WinterFlowTransactionAgent, (WinterFlowJSONService) this.WinterFlowServerProtocol, (WinterFlowVersionControlView) obj2, winterFlowTransactionManagerLayer, 0);
            case 1:
                WinterFlowMapperJava winterFlowMapperJava = new WinterFlowMapperJava((WinterFlowHandlerInvoker) this.WinterFlowServerProtocol, (WinterFlowThreadPoolGateway) obj2, winterFlowTransactionManagerLayer, 1);
                winterFlowMapperJava.WinterFlowTransactionAgent = obj;
                return winterFlowMapperJava;
            case 2:
                return new WinterFlowMapperJava((WinterFlowSyntaxResolver) this.WinterFlowTransactionAgent, (WinterFlowUIMicroservice) this.WinterFlowServerProtocol, (WinterFlowJavaSession) obj2, winterFlowTransactionManagerLayer, 2);
            case 3:
                WinterFlowMapperJava winterFlowMapperJava2 = new WinterFlowMapperJava((WinterFlowCacheInterface) this.WinterFlowServerProtocol, (WinterFlowConfigurationSession) obj2, winterFlowTransactionManagerLayer, 3);
                winterFlowMapperJava2.WinterFlowTransactionAgent = obj;
                return winterFlowMapperJava2;
            case 4:
                WinterFlowMapperJava winterFlowMapperJava3 = new WinterFlowMapperJava((WinterFlowStrategyResolver) obj2, winterFlowTransactionManagerLayer, 4);
                winterFlowMapperJava3.WinterFlowServerProtocol = obj;
                return winterFlowMapperJava3;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowMapperJava winterFlowMapperJava4 = new WinterFlowMapperJava((WinterFlowStrategyResolver) this.WinterFlowServerProtocol, (WinterFlowEventEvent) obj2, winterFlowTransactionManagerLayer, 5);
                winterFlowMapperJava4.WinterFlowTransactionAgent = obj;
                return winterFlowMapperJava4;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowMapperJava winterFlowMapperJava5 = new WinterFlowMapperJava((WinterFlowSchedulerParser) this.WinterFlowServerProtocol, (WinterFlowEventEvent) obj2, winterFlowTransactionManagerLayer, 6);
                winterFlowMapperJava5.WinterFlowTransactionAgent = obj;
                return winterFlowMapperJava5;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return new WinterFlowMapperJava((WinterFlowSchedulerParser) this.WinterFlowTransactionAgent, (WinterFlowExceptionListener) this.WinterFlowServerProtocol, (WinterFlowEventEvent) obj2, winterFlowTransactionManagerLayer, 7);
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return new WinterFlowMapperJava((WinterFlowJSONDecorator) this.WinterFlowTransactionAgent, (WinterFlowStackUI) this.WinterFlowServerProtocol, (WinterFlowVersionControlView) obj2, winterFlowTransactionManagerLayer, 8);
            case 9:
                return new WinterFlowMapperJava((WinterFlowWorkerThreadPool) obj2, winterFlowTransactionManagerLayer, 9);
            case 10:
                return new WinterFlowMapperJava((WinterFlowJavaOrchestration) this.WinterFlowTransactionAgent, (WinterFlowNetworkFramework) this.WinterFlowServerProtocol, (Long) obj2, winterFlowTransactionManagerLayer, 10);
            case 11:
                return new WinterFlowMapperJava((WinterFlowCacheManagerMicroservice) this.WinterFlowTransactionAgent, (WinterFlowThreadPoolGateway) this.WinterFlowServerProtocol, (WinterFlowObjectHandler) obj2, winterFlowTransactionManagerLayer, 11);
            case 12:
                return new WinterFlowMapperJava((WinterFlowBandwidthCache) this.WinterFlowServerProtocol, (WinterFlowDecoratorServer) obj2, winterFlowTransactionManagerLayer, 12);
            case 13:
                WinterFlowMapperJava winterFlowMapperJava6 = new WinterFlowMapperJava((WinterFlowAdapterSyntax) this.WinterFlowServerProtocol, (WinterFlowPipelineBackend) obj2, winterFlowTransactionManagerLayer, 13);
                winterFlowMapperJava6.WinterFlowTransactionAgent = obj;
                return winterFlowMapperJava6;
            case 14:
                WinterFlowMapperJava winterFlowMapperJava7 = new WinterFlowMapperJava((WinterFlowDebugObject) this.WinterFlowServerProtocol, (WinterFlowTransactionManagerService) obj2, winterFlowTransactionManagerLayer, 14);
                winterFlowMapperJava7.WinterFlowTransactionAgent = obj;
                return winterFlowMapperJava7;
            case 15:
                WinterFlowMapperJava winterFlowMapperJava8 = new WinterFlowMapperJava((WinterFlowTransactionManagerService) this.WinterFlowServerProtocol, (WinterFlowEventEvent) obj2, winterFlowTransactionManagerLayer, 15);
                winterFlowMapperJava8.WinterFlowTransactionAgent = obj;
                return winterFlowMapperJava8;
            case 16:
                WinterFlowMapperJava winterFlowMapperJava9 = new WinterFlowMapperJava((WinterFlowEncryptionMicroservice) this.WinterFlowServerProtocol, (WinterFlowEventProvider) obj2, winterFlowTransactionManagerLayer, 16);
                winterFlowMapperJava9.WinterFlowTransactionAgent = obj;
                return winterFlowMapperJava9;
            case 17:
                return new WinterFlowMapperJava((WinterFlowCacheManagerMicroservice) obj2, winterFlowTransactionManagerLayer, 17);
            default:
                WinterFlowMapperJava winterFlowMapperJava10 = new WinterFlowMapperJava((WinterFlowGatewaySession) obj2, winterFlowTransactionManagerLayer, 18);
                winterFlowMapperJava10.WinterFlowServerProtocol = obj;
                return winterFlowMapperJava10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x018e, code lost:
    
        if (r1.WinterFlowRouterStructure(r2, r28) == r3) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x019f, code lost:
    
        if (com.google.android.datatransport.WinterFlowCacheRuntime.WinterFlowModuleAgent(r2, r5, r28) == r3) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x05ae, code lost:
    
        if (r0 == r4) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0565, code lost:
    
        if ((r6 instanceof com.google.android.datatransport.WinterFlowArrayTool) != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0533, code lost:
    
        if (r6 == r4) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x06de, code lost:
    
        if (r0 == r4) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ad, code lost:
    
        if (r5 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x004b, code lost:
    
        if (r10 == r2) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x034e A[Catch: all -> 0x0321, TryCatch #0 {all -> 0x0321, blocks: (B:203:0x031b, B:205:0x0346, B:207:0x034e, B:208:0x035c, B:216:0x036d, B:218:0x0337, B:222:0x0370, B:226:0x0375, B:227:0x0376, B:234:0x0332, B:210:0x035d, B:212:0x0363), top: B:199:0x030f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06d5  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.datatransport.WinterFlowFrameworkAgent] */
    /* JADX WARN: Type inference failed for: r3v27, types: [com.google.android.datatransport.WinterFlowWorkerThreadPool] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29, types: [com.google.android.datatransport.WinterFlowFrameworkAgent] */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:199:0x0342 -> B:185:0x0346). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        Object obj2;
        WinterFlowCacheInterface winterFlowCacheInterface;
        Object WinterFlowModuleAgent;
        WinterFlowValidatorBandwidth winterFlowValidatorBandwidth;
        WinterFlowCacheInterface winterFlowCacheInterface2;
        WinterFlowValidatorBandwidth winterFlowValidatorBandwidth2;
        WinterFlowThreadPoolServiceProvider winterFlowThreadPoolServiceProvider;
        Object WinterFlowHookDataSource;
        boolean z;
        WinterFlowBandwidthCache winterFlowBandwidthCache;
        Object WinterFlowRouterStructure;
        WinterFlowIDEPlatform winterFlowIDEPlatform;
        WinterFlowRequestProvider winterFlowRequestProvider;
        Object WinterFlowArrayNetwork;
        WinterFlowSerializerComponent winterFlowSerializerComponent;
        ReentrantLock reentrantLock;
        WinterFlowServerSubsystem[] winterFlowServerSubsystemArr;
        boolean z2;
        WinterFlowServerSubsystem winterFlowServerSubsystem;
        WinterFlowSerializerComponent winterFlowSerializerComponent2;
        ReentrantLock reentrantLock2;
        boolean z3;
        ?? r3 = 6;
        char c = 6;
        char c2 = 6;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        switch (this.WinterFlowSyntax) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i = this.WinterFlowResponseEngine;
                if (i == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowJSONDecorator winterFlowJSONDecorator = (WinterFlowJSONDecorator) this.WinterFlowTransactionAgent;
                    WinterFlowJSONService winterFlowJSONService = (WinterFlowJSONService) this.WinterFlowServerProtocol;
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowJSONDecorator.WinterFlowArrayNetwork(winterFlowJSONService, this) == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                WinterFlowVersionControlView winterFlowVersionControlView = (WinterFlowVersionControlView) this.WinterFlowThreadListener;
                if (winterFlowVersionControlView != null) {
                    winterFlowVersionControlView.WinterFlowRouterStructure();
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 1:
                WinterFlowHandlerInvoker winterFlowHandlerInvoker = (WinterFlowHandlerInvoker) this.WinterFlowServerProtocol;
                WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowSoftwareProtocol winterFlowSoftwareProtocol = (WinterFlowSoftwareProtocol) this.WinterFlowTransactionAgent;
                    WinterFlowUserManagerQuery winterFlowUserManagerQuery = new WinterFlowUserManagerQuery(1, new WinterFlowRuntimeMechanism(new WinterFlowRouterEngine(0, winterFlowHandlerInvoker), null));
                    WinterFlowSessionManagerTool winterFlowSessionManagerTool = new WinterFlowSessionManagerTool(winterFlowSoftwareProtocol, winterFlowHandlerInvoker, (WinterFlowThreadPoolGateway) this.WinterFlowThreadListener, 0);
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowUserManagerQuery.WinterFlowRouterStructure(winterFlowSessionManagerTool, this) == winterFlowListenerJava2) {
                        return winterFlowListenerJava2;
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
                WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                WinterFlowSyntaxResolver winterFlowSyntaxResolver = (WinterFlowSyntaxResolver) this.WinterFlowTransactionAgent;
                WinterFlowListenerJava winterFlowListenerJava3 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowSyntaxFramework winterFlowSyntaxFramework = winterFlowSyntaxResolver.WinterFlowVariableBandwidth;
                    WinterFlowModuleRenderer winterFlowModuleRenderer = new WinterFlowModuleRenderer(winterFlowSyntaxResolver, (WinterFlowUIMicroservice) this.WinterFlowServerProtocol, (WinterFlowJavaSession) this.WinterFlowThreadListener);
                    this.WinterFlowResponseEngine = 1;
                    winterFlowSyntaxFramework.getClass();
                    WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) winterFlowModuleRenderer.WinterFlowRouterStructure();
                    if (winterFlowVersionParser != null && !WinterFlowSyntaxFramework.WinterFlowUserManagerConcurrency(winterFlowSyntaxFramework, winterFlowVersionParser, 0L, 0L, 3)) {
                        WinterFlowEventCloud winterFlowEventCloud = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(this));
                        winterFlowEventCloud.WinterFlowSerializerStructure();
                        WinterFlowAlgorithmResolver winterFlowAlgorithmResolver = new WinterFlowAlgorithmResolver(winterFlowModuleRenderer, winterFlowEventCloud);
                        WinterFlowRequestController winterFlowRequestController = winterFlowSyntaxFramework.WinterFlowMapperProtocol;
                        WinterFlowJSON winterFlowJSON = winterFlowRequestController.WinterFlowRouterStructure;
                        WinterFlowVersionParser winterFlowVersionParser2 = (WinterFlowVersionParser) winterFlowModuleRenderer.WinterFlowRouterStructure();
                        if (winterFlowVersionParser2 == null) {
                            winterFlowEventCloud.WinterFlowSyntax(winterFlowAlgorithmSession);
                        } else {
                            winterFlowEventCloud.WinterFlowResolverController(new WinterFlowRouterCompiler(c, winterFlowRequestController, winterFlowAlgorithmResolver));
                            WinterFlowCacheManagerListener WinterFlowArrayHelper = WinterFlowDecoratorUI.WinterFlowArrayHelper(0, winterFlowJSON.WinterFlowUnitTestResponse);
                            int i4 = WinterFlowArrayHelper.WinterFlowVariableVersionControl;
                            int i5 = WinterFlowArrayHelper.WinterFlowTransactionManagerStrategy;
                            if (i4 <= i5) {
                                while (true) {
                                    WinterFlowVersionParser winterFlowVersionParser3 = (WinterFlowVersionParser) ((WinterFlowAlgorithmResolver) winterFlowJSON.WinterFlowVariableVersionControl[i5]).WinterFlowRouterStructure.WinterFlowRouterStructure();
                                    if (winterFlowVersionParser3 != null) {
                                        WinterFlowVersionParser WinterFlowCacheManagerAgent = winterFlowVersionParser2.WinterFlowCacheManagerAgent(winterFlowVersionParser3);
                                        if (WinterFlowCacheManagerAgent.equals(winterFlowVersionParser2)) {
                                            winterFlowJSON.WinterFlowRouterStructure(i5 + 1, winterFlowAlgorithmResolver);
                                        } else if (!WinterFlowCacheManagerAgent.equals(winterFlowVersionParser3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i6 = winterFlowJSON.WinterFlowUnitTestResponse - 1;
                                            if (i6 <= i5) {
                                                while (true) {
                                                    ((WinterFlowAlgorithmResolver) winterFlowJSON.WinterFlowVariableVersionControl[i5]).WinterFlowHookDataSource.WinterFlowResponseEngine(cancellationException);
                                                    if (i6 != i5) {
                                                        i6++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i5 != i4) {
                                        i5--;
                                    }
                                }
                                if (!winterFlowSyntaxFramework.WinterFlowBackendCacheManager) {
                                    winterFlowSyntaxFramework.WinterFlowServerStack(0L);
                                }
                            }
                            winterFlowJSON.WinterFlowRouterStructure(0, winterFlowAlgorithmResolver);
                            if (!winterFlowSyntaxFramework.WinterFlowBackendCacheManager) {
                            }
                        }
                        obj2 = winterFlowEventCloud.WinterFlowBatchUI();
                        break;
                    }
                    obj2 = winterFlowAlgorithmSession;
                    if (obj2 == winterFlowListenerJava3) {
                        return winterFlowListenerJava3;
                    }
                } else {
                    if (i3 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                return winterFlowAlgorithmSession;
            case 3:
                WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                WinterFlowListenerJava winterFlowListenerJava4 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i7 = this.WinterFlowResponseEngine;
                if (i7 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowTransactionAgent;
                    WinterFlowCacheInterface winterFlowCacheInterface3 = (WinterFlowCacheInterface) this.WinterFlowServerProtocol;
                    WinterFlowFrameworkAgent WinterFlowUnitTestResponse = ((WinterFlowConfigurationSession) this.WinterFlowThreadListener).WinterFlowUnitTestResponse(winterFlowAdapterResponse);
                    this.WinterFlowResponseEngine = 1;
                    Object WinterFlowBatchUI = WinterFlowInvokerComponent.WinterFlowBatchUI(winterFlowCacheInterface3, WinterFlowUnitTestResponse, true, this);
                    if (WinterFlowBatchUI != winterFlowListenerJava4) {
                        WinterFlowBatchUI = winterFlowAlgorithmSession2;
                    }
                    if (WinterFlowBatchUI == winterFlowListenerJava4) {
                        return winterFlowListenerJava4;
                    }
                } else {
                    if (i7 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                return winterFlowAlgorithmSession2;
            case 4:
                WinterFlowAlgorithmSession winterFlowAlgorithmSession3 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                WinterFlowStrategyResolver winterFlowStrategyResolver = (WinterFlowStrategyResolver) this.WinterFlowThreadListener;
                WinterFlowListenerJava winterFlowListenerJava5 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i8 = this.WinterFlowResponseEngine;
                if (i8 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowCacheInterface = (WinterFlowCacheInterface) this.WinterFlowServerProtocol;
                    this.WinterFlowServerProtocol = winterFlowCacheInterface;
                    this.WinterFlowResponseEngine = 1;
                    WinterFlowModuleAgent = WinterFlowCacheRuntime.WinterFlowModuleAgent(winterFlowStrategyResolver.WinterFlowUnitTestResponse.WinterFlowRouterRouter(), new WinterFlowRouterThreadPool(winterFlowStrategyResolver, z5 ? 1 : 0, 2), this);
                    break;
                } else if (i8 == 1) {
                    winterFlowCacheInterface = (WinterFlowCacheInterface) this.WinterFlowServerProtocol;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowModuleAgent = obj;
                } else {
                    if (i8 != 2) {
                        if (i8 == 3) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            return winterFlowAlgorithmSession3;
                        }
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    winterFlowValidatorBandwidth2 = (WinterFlowDebugMechanism) this.WinterFlowTransactionAgent;
                    winterFlowCacheInterface2 = (WinterFlowCacheInterface) this.WinterFlowServerProtocol;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowCacheInterface winterFlowCacheInterface4 = winterFlowCacheInterface2;
                    winterFlowValidatorBandwidth = winterFlowValidatorBandwidth2;
                    winterFlowCacheInterface = winterFlowCacheInterface4;
                    int i9 = 0;
                    WinterFlowExceptionIDE winterFlowExceptionIDE = new WinterFlowExceptionIDE(new WinterFlowUserManagerQuery(i9, new WinterFlowResolverSyntax(new WinterFlowResolverSyntax(2, new WinterFlowResolverSyntax(i9, new WinterFlowRouterThreadPool(winterFlowStrategyResolver, z7 ? 1 : 0, i9), winterFlowStrategyResolver.WinterFlowServerProtocol.WinterFlowRouterStructure), new WinterFlowConcurrencyMiddleware(2, null, 0)), new WinterFlowEventDecorator(winterFlowValidatorBandwidth, z6 ? 1 : 0, 1))), new WinterFlowVariableWidget(winterFlowStrategyResolver, (WinterFlowTransactionManagerLayer) null));
                    this.WinterFlowServerProtocol = null;
                    this.WinterFlowTransactionAgent = null;
                    this.WinterFlowResponseEngine = 3;
                    if (!(winterFlowCacheInterface instanceof WinterFlowResponseDebug)) {
                        throw ((WinterFlowResponseDebug) winterFlowCacheInterface).WinterFlowVariableVersionControl;
                    }
                    Object WinterFlowRouterStructure2 = winterFlowExceptionIDE.WinterFlowRouterStructure(winterFlowCacheInterface, this);
                    if (WinterFlowRouterStructure2 != winterFlowListenerJava5) {
                        WinterFlowRouterStructure2 = winterFlowAlgorithmSession3;
                        break;
                    }
                }
                winterFlowValidatorBandwidth = (WinterFlowValidatorBandwidth) WinterFlowModuleAgent;
                if (winterFlowValidatorBandwidth instanceof WinterFlowDebugMechanism) {
                    WinterFlowDebugMechanism winterFlowDebugMechanism = (WinterFlowDebugMechanism) winterFlowValidatorBandwidth;
                    Object obj3 = winterFlowDebugMechanism.WinterFlowHookDataSource;
                    this.WinterFlowServerProtocol = winterFlowCacheInterface;
                    this.WinterFlowTransactionAgent = winterFlowDebugMechanism;
                    this.WinterFlowResponseEngine = 2;
                    if (winterFlowCacheInterface.WinterFlowRouterRouter(obj3, this) != winterFlowListenerJava5) {
                        winterFlowCacheInterface2 = winterFlowCacheInterface;
                        winterFlowValidatorBandwidth2 = winterFlowValidatorBandwidth;
                        WinterFlowCacheInterface winterFlowCacheInterface42 = winterFlowCacheInterface2;
                        winterFlowValidatorBandwidth = winterFlowValidatorBandwidth2;
                        winterFlowCacheInterface = winterFlowCacheInterface42;
                        int i92 = 0;
                        WinterFlowExceptionIDE winterFlowExceptionIDE2 = new WinterFlowExceptionIDE(new WinterFlowUserManagerQuery(i92, new WinterFlowResolverSyntax(new WinterFlowResolverSyntax(2, new WinterFlowResolverSyntax(i92, new WinterFlowRouterThreadPool(winterFlowStrategyResolver, z7 ? 1 : 0, i92), winterFlowStrategyResolver.WinterFlowServerProtocol.WinterFlowRouterStructure), new WinterFlowConcurrencyMiddleware(2, null, 0)), new WinterFlowEventDecorator(winterFlowValidatorBandwidth, z6 ? 1 : 0, 1))), new WinterFlowVariableWidget(winterFlowStrategyResolver, (WinterFlowTransactionManagerLayer) null));
                        this.WinterFlowServerProtocol = null;
                        this.WinterFlowTransactionAgent = null;
                        this.WinterFlowResponseEngine = 3;
                        if (!(winterFlowCacheInterface instanceof WinterFlowResponseDebug)) {
                        }
                    }
                    return winterFlowListenerJava5;
                }
                if (winterFlowValidatorBandwidth instanceof WinterFlowMicroservice) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return null;
                }
                if (!(winterFlowValidatorBandwidth instanceof WinterFlowDecoratorServiceProvider)) {
                    break;
                } else {
                    throw ((WinterFlowDecoratorServiceProvider) winterFlowValidatorBandwidth).WinterFlowHookDataSource;
                }
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowStrategyResolver winterFlowStrategyResolver2 = (WinterFlowStrategyResolver) this.WinterFlowServerProtocol;
                WinterFlowListenerJava winterFlowListenerJava6 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i10 = this.WinterFlowResponseEngine;
                if (i10 != 0) {
                    if (i10 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return obj;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowAdapterResponse winterFlowAdapterResponse2 = (WinterFlowAdapterResponse) this.WinterFlowTransactionAgent;
                WinterFlowXMLPlatform WinterFlowCacheManagerAgent2 = WinterFlowCacheRuntime.WinterFlowCacheManagerAgent();
                WinterFlowCacheManagerMiddleware winterFlowCacheManagerMiddleware = new WinterFlowCacheManagerMiddleware((WinterFlowEventEvent) this.WinterFlowThreadListener, WinterFlowCacheManagerAgent2, winterFlowStrategyResolver2.WinterFlowServerProtocol.WinterFlowHookDataSource(), winterFlowAdapterResponse2.WinterFlowRouterRouter());
                WinterFlowStackProvider winterFlowStackProvider = winterFlowStrategyResolver2.WinterFlowOrchestrationSubsystem;
                Object WinterFlowUnitTestResponse2 = ((WinterFlowWorkerThreadPool) winterFlowStackProvider.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(winterFlowCacheManagerMiddleware);
                if (WinterFlowUnitTestResponse2 instanceof WinterFlowCloudHandler) {
                    Throwable th = ((WinterFlowCloudHandler) WinterFlowUnitTestResponse2).WinterFlowRouterStructure;
                    if (th == null) {
                        throw new WinterFlowResponseStrategy("Channel was closed normally");
                    }
                    throw th;
                }
                if (WinterFlowUnitTestResponse2 instanceof WinterFlowGatewayParser) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Check failed.");
                    return null;
                }
                if (((AtomicInteger) ((WinterFlowJSONDecorator) winterFlowStackProvider.WinterFlowRouterRouter).WinterFlowTransactionManagerStrategy).getAndIncrement() == 0) {
                    WinterFlowCacheRuntime.WinterFlowStrategyTool((WinterFlowAdapterResponse) winterFlowStackProvider.WinterFlowVariableVersionControl, null, new WinterFlowModuleStack(winterFlowStackProvider, z8 ? 1 : 0, 27), 3);
                }
                this.WinterFlowResponseEngine = 1;
                Object WinterFlowVersionControlModule = WinterFlowCacheManagerAgent2.WinterFlowVersionControlModule(this);
                return WinterFlowVersionControlModule == winterFlowListenerJava6 ? winterFlowListenerJava6 : WinterFlowVersionControlModule;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowResolverSubsystem winterFlowResolverSubsystem = (WinterFlowResolverSubsystem) ((WinterFlowSchedulerParser) this.WinterFlowServerProtocol).WinterFlowArrayNetwork;
                WinterFlowListenerJava winterFlowListenerJava7 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i11 = this.WinterFlowResponseEngine;
                try {
                    if (i11 == 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        WinterFlowServiceProviderStructure winterFlowServiceProviderStructure = (WinterFlowServiceProviderStructure) this.WinterFlowTransactionAgent;
                        winterFlowResolverSubsystem.setValue(Boolean.TRUE);
                        WinterFlowEventEvent winterFlowEventEvent = (WinterFlowEventEvent) this.WinterFlowThreadListener;
                        this.WinterFlowResponseEngine = 1;
                        if (winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowServiceProviderStructure, this) == winterFlowListenerJava7) {
                            return winterFlowListenerJava7;
                        }
                    } else {
                        if (i11 != 1) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    }
                    winterFlowResolverSubsystem.setValue(Boolean.FALSE);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                } catch (Throwable th2) {
                    winterFlowResolverSubsystem.setValue(Boolean.FALSE);
                    throw th2;
                }
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowListenerJava winterFlowListenerJava8 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i12 = this.WinterFlowResponseEngine;
                if (i12 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowSchedulerParser winterFlowSchedulerParser = (WinterFlowSchedulerParser) this.WinterFlowTransactionAgent;
                    WinterFlowLibraryDatabaseSchema winterFlowLibraryDatabaseSchema = (WinterFlowLibraryDatabaseSchema) winterFlowSchedulerParser.WinterFlowCacheManagerAgent;
                    WinterFlowRendererAgent winterFlowRendererAgent = (WinterFlowRendererAgent) winterFlowSchedulerParser.WinterFlowHookDataSource;
                    WinterFlowExceptionListener winterFlowExceptionListener = (WinterFlowExceptionListener) this.WinterFlowServerProtocol;
                    WinterFlowMapperJava winterFlowMapperJava = new WinterFlowMapperJava(winterFlowSchedulerParser, (WinterFlowEventEvent) this.WinterFlowThreadListener, z9 ? 1 : 0, c2);
                    this.WinterFlowResponseEngine = 1;
                    winterFlowLibraryDatabaseSchema.getClass();
                    if (WinterFlowEncryptionSubsystem.WinterFlowOrchestrationSubsystem(new WinterFlowVersionFramework(winterFlowExceptionListener, winterFlowLibraryDatabaseSchema, winterFlowMapperJava, winterFlowRendererAgent, null), this) == winterFlowListenerJava8) {
                        return winterFlowListenerJava8;
                    }
                } else {
                    if (i12 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                WinterFlowListenerJava winterFlowListenerJava9 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i13 = this.WinterFlowResponseEngine;
                if (i13 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowJSONDecorator winterFlowJSONDecorator2 = (WinterFlowJSONDecorator) this.WinterFlowTransactionAgent;
                    WinterFlowStackUI winterFlowStackUI = (WinterFlowStackUI) this.WinterFlowServerProtocol;
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowJSONDecorator2.WinterFlowArrayNetwork(winterFlowStackUI, this) == winterFlowListenerJava9) {
                        return winterFlowListenerJava9;
                    }
                } else {
                    if (i13 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                WinterFlowVersionControlView winterFlowVersionControlView2 = (WinterFlowVersionControlView) this.WinterFlowThreadListener;
                if (winterFlowVersionControlView2 != null) {
                    winterFlowVersionControlView2.WinterFlowRouterStructure();
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 9:
                WinterFlowListenerJava winterFlowListenerJava10 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i14 = this.WinterFlowResponseEngine;
                try {
                    if (i14 == 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        r3 = (WinterFlowWorkerThreadPool) this.WinterFlowThreadListener;
                        winterFlowThreadPoolServiceProvider = new WinterFlowThreadPoolServiceProvider(r3);
                        this.WinterFlowTransactionAgent = r3;
                        this.WinterFlowServerProtocol = winterFlowThreadPoolServiceProvider;
                        this.WinterFlowResponseEngine = 1;
                        WinterFlowHookDataSource = winterFlowThreadPoolServiceProvider.WinterFlowHookDataSource(this);
                        r3 = r3;
                        if (WinterFlowHookDataSource == winterFlowListenerJava10) {
                        }
                        if (((Boolean) WinterFlowHookDataSource).booleanValue()) {
                        }
                    } else {
                        if (i14 != 1) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        winterFlowThreadPoolServiceProvider = (WinterFlowThreadPoolServiceProvider) this.WinterFlowServerProtocol;
                        WinterFlowFrameworkAgent winterFlowFrameworkAgent = (WinterFlowFrameworkAgent) this.WinterFlowTransactionAgent;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        WinterFlowHookDataSource = obj;
                        r3 = winterFlowFrameworkAgent;
                        if (((Boolean) WinterFlowHookDataSource).booleanValue()) {
                            WinterFlowDataSourceAlgorithm.WinterFlowHookDataSource.set(false);
                            synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
                                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = WinterFlowVersionProtocol.WinterFlowResponseEngine.WinterFlowRouterRouter;
                                z = winterFlowCacheManagerTransactionManager != null && winterFlowCacheManagerTransactionManager.WinterFlowRouterRouter();
                            }
                            if (z) {
                                WinterFlowVersionProtocol.WinterFlowCacheManagerAgent();
                            }
                            this.WinterFlowTransactionAgent = r3;
                            this.WinterFlowServerProtocol = winterFlowThreadPoolServiceProvider;
                            this.WinterFlowResponseEngine = 1;
                            WinterFlowHookDataSource = winterFlowThreadPoolServiceProvider.WinterFlowHookDataSource(this);
                            r3 = r3;
                            if (WinterFlowHookDataSource == winterFlowListenerJava10) {
                                return winterFlowListenerJava10;
                            }
                            if (((Boolean) WinterFlowHookDataSource).booleanValue()) {
                                r3.WinterFlowArrayNetwork(null);
                                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CancellationException cancellationException2 = th3 instanceof CancellationException ? th3 : null;
                        if (cancellationException2 == null) {
                            cancellationException2 = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException2.initCause(th3);
                        }
                        r3.WinterFlowArrayNetwork(cancellationException2);
                        throw th4;
                    }
                }
                break;
            case 10:
                WinterFlowListenerJava winterFlowListenerJava11 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i15 = this.WinterFlowResponseEngine;
                if (i15 != 0) {
                    if (i15 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return obj;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowConfigurationModule winterFlowConfigurationModule = ((WinterFlowJavaOrchestration) this.WinterFlowTransactionAgent).WinterFlowCacheManagerAgent;
                this.WinterFlowResponseEngine = 1;
                Object WinterFlowCacheManagerAgent3 = winterFlowConfigurationModule.WinterFlowCacheManagerAgent(new WinterFlowExceptionTesting(new WinterFlowJSONUtility((WinterFlowNetworkFramework) this.WinterFlowServerProtocol, (Long) this.WinterFlowThreadListener, null), z10 ? 1 : 0, 1), this);
                return WinterFlowCacheManagerAgent3 == winterFlowListenerJava11 ? winterFlowListenerJava11 : WinterFlowCacheManagerAgent3;
            case 11:
                WinterFlowThreadPoolGateway winterFlowThreadPoolGateway = (WinterFlowThreadPoolGateway) this.WinterFlowServerProtocol;
                WinterFlowListenerJava winterFlowListenerJava12 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i16 = this.WinterFlowResponseEngine;
                if (i16 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    if (((List) winterFlowThreadPoolGateway.getValue()).size() > 1) {
                        WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) ((List) winterFlowThreadPoolGateway.getValue()).get(((List) winterFlowThreadPoolGateway.getValue()).size() - 2);
                        WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice = (WinterFlowCacheManagerMicroservice) this.WinterFlowTransactionAgent;
                        float WinterFlowRouterRouter = ((WinterFlowObjectHandler) this.WinterFlowThreadListener).WinterFlowRouterRouter();
                        this.WinterFlowResponseEngine = 1;
                        if (winterFlowCacheManagerMicroservice.WinterFlowStrategyTool(WinterFlowRouterRouter, winterFlowLibrarySessionManager, this) == winterFlowListenerJava12) {
                            return winterFlowListenerJava12;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 12:
                WinterFlowListenerJava winterFlowListenerJava13 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i17 = this.WinterFlowResponseEngine;
                if (i17 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowBandwidthCache = (WinterFlowBandwidthCache) this.WinterFlowServerProtocol;
                    WinterFlowDecoratorServer winterFlowDecoratorServer = (WinterFlowDecoratorServer) this.WinterFlowThreadListener;
                    this.WinterFlowTransactionAgent = winterFlowBandwidthCache;
                    this.WinterFlowResponseEngine = 1;
                    WinterFlowRouterStructure = winterFlowDecoratorServer.WinterFlowRouterStructure(this);
                    if (WinterFlowRouterStructure == winterFlowListenerJava13) {
                        return winterFlowListenerJava13;
                    }
                } else {
                    if (i17 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowBandwidthCache winterFlowBandwidthCache2 = (WinterFlowBandwidthCache) this.WinterFlowTransactionAgent;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowBandwidthCache = winterFlowBandwidthCache2;
                    WinterFlowRouterStructure = obj;
                }
                winterFlowBandwidthCache.WinterFlowVariableVersionControl = WinterFlowRouterStructure;
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 13:
                WinterFlowListenerJava winterFlowListenerJava14 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i18 = this.WinterFlowResponseEngine;
                if (i18 != 0) {
                    if (i18 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowAdapterResponse winterFlowAdapterResponse3 = (WinterFlowAdapterResponse) this.WinterFlowTransactionAgent;
                WinterFlowAdapterSyntax winterFlowAdapterSyntax = (WinterFlowAdapterSyntax) this.WinterFlowServerProtocol;
                WinterFlowPipelineBackend winterFlowPipelineBackend = (WinterFlowPipelineBackend) this.WinterFlowThreadListener;
                this.WinterFlowResponseEngine = 1;
                winterFlowAdapterSyntax.WinterFlowArrayNetwork(winterFlowAdapterResponse3, winterFlowPipelineBackend, this);
                return winterFlowListenerJava14;
            case 14:
                WinterFlowListenerJava winterFlowListenerJava15 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i19 = this.WinterFlowResponseEngine;
                if (i19 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowRendererClass winterFlowRendererClass = (WinterFlowRendererClass) this.WinterFlowTransactionAgent;
                    WinterFlowDebugObject winterFlowDebugObject = (WinterFlowDebugObject) this.WinterFlowServerProtocol;
                    WinterFlowRouterCompiler winterFlowRouterCompiler = new WinterFlowRouterCompiler(29, winterFlowRendererClass, (WinterFlowTransactionManagerService) this.WinterFlowThreadListener);
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowDebugObject.WinterFlowVariableVersionControl(winterFlowRouterCompiler, this) == winterFlowListenerJava15) {
                        return winterFlowListenerJava15;
                    }
                } else {
                    if (i19 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 15:
                WinterFlowListenerJava winterFlowListenerJava16 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i20 = this.WinterFlowResponseEngine;
                if (i20 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowServiceProviderStructure winterFlowServiceProviderStructure2 = (WinterFlowServiceProviderStructure) this.WinterFlowTransactionAgent;
                    WinterFlowTransactionManagerService winterFlowTransactionManagerService = (WinterFlowTransactionManagerService) this.WinterFlowServerProtocol;
                    winterFlowTransactionManagerService.WinterFlowTransactionAgent = winterFlowServiceProviderStructure2;
                    WinterFlowEventEvent winterFlowEventEvent2 = (WinterFlowEventEvent) this.WinterFlowThreadListener;
                    WinterFlowRendererClass winterFlowRendererClass2 = winterFlowTransactionManagerService.WinterFlowServerProtocol;
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowEventEvent2.WinterFlowVariableVersionControl(winterFlowRendererClass2, this) == winterFlowListenerJava16) {
                        return winterFlowListenerJava16;
                    }
                } else {
                    if (i20 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 16:
                WinterFlowEventProvider winterFlowEventProvider = (WinterFlowEventProvider) this.WinterFlowThreadListener;
                WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = (WinterFlowEncryptionMicroservice) this.WinterFlowServerProtocol;
                WinterFlowListenerJava winterFlowListenerJava17 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i21 = this.WinterFlowResponseEngine;
                if (i21 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowSoftwareProtocol winterFlowSoftwareProtocol2 = (WinterFlowSoftwareProtocol) this.WinterFlowTransactionAgent;
                    if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowEncryptionMicroservice, WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl)) {
                        WinterFlowModuleStack winterFlowModuleStack = new WinterFlowModuleStack(winterFlowEventProvider, winterFlowSoftwareProtocol2, z11 ? 1 : 0, 28);
                        this.WinterFlowResponseEngine = 2;
                        break;
                    } else {
                        WinterFlowRendererProtocol winterFlowRendererProtocol = new WinterFlowRendererProtocol(winterFlowSoftwareProtocol2, 0);
                        this.WinterFlowResponseEngine = 1;
                        break;
                    }
                } else {
                    if (i21 != 1 && i21 != 2) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 17:
                WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice2 = (WinterFlowCacheManagerMicroservice) this.WinterFlowThreadListener;
                WinterFlowListenerJava winterFlowListenerJava18 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i22 = this.WinterFlowResponseEngine;
                if (i22 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowClassStrategy winterFlowClassStrategy = winterFlowCacheManagerMicroservice2.WinterFlowRouterRouter;
                    if (winterFlowClassStrategy != null) {
                        winterFlowClassStrategy.WinterFlowCacheManagerAgent(winterFlowCacheManagerMicroservice2, WinterFlowSoftwareException.WinterFlowTransactionManagerStrategy, winterFlowCacheManagerMicroservice2.WinterFlowUnitTestResponse);
                    }
                    winterFlowIDEPlatform = winterFlowCacheManagerMicroservice2.WinterFlowTransactionAgent;
                    this.WinterFlowTransactionAgent = winterFlowIDEPlatform;
                    this.WinterFlowServerProtocol = winterFlowCacheManagerMicroservice2;
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowIDEPlatform.WinterFlowArrayNetwork(this) == winterFlowListenerJava18) {
                        return winterFlowListenerJava18;
                    }
                } else {
                    if (i22 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    winterFlowCacheManagerMicroservice2 = (WinterFlowCacheManagerMicroservice) this.WinterFlowServerProtocol;
                    WinterFlowIDEPlatform winterFlowIDEPlatform2 = (WinterFlowIDEPlatform) this.WinterFlowTransactionAgent;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowIDEPlatform = winterFlowIDEPlatform2;
                }
                try {
                    winterFlowCacheManagerMicroservice2.WinterFlowArrayNetwork = winterFlowCacheManagerMicroservice2.WinterFlowHookDataSource.getValue();
                    WinterFlowEventCloud winterFlowEventCloud2 = winterFlowCacheManagerMicroservice2.WinterFlowResponseEngine;
                    if (winterFlowEventCloud2 != null) {
                        winterFlowEventCloud2.WinterFlowSyntax(winterFlowCacheManagerMicroservice2.WinterFlowHookDataSource.getValue());
                    }
                    winterFlowCacheManagerMicroservice2.WinterFlowResponseEngine = null;
                    winterFlowIDEPlatform.WinterFlowHookDataSource(null);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                } catch (Throwable th5) {
                    winterFlowIDEPlatform.WinterFlowHookDataSource(null);
                    throw th5;
                }
            default:
                WinterFlowAlgorithmSession winterFlowAlgorithmSession4 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                WinterFlowListenerJava winterFlowListenerJava19 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                int i23 = this.WinterFlowResponseEngine;
                if (i23 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowRequestProvider = (WinterFlowRequestProvider) this.WinterFlowServerProtocol;
                    this.WinterFlowServerProtocol = winterFlowRequestProvider;
                    this.WinterFlowResponseEngine = 1;
                    WinterFlowArrayNetwork = winterFlowRequestProvider.WinterFlowArrayNetwork(this);
                    break;
                } else {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        reentrantLock2 = (ReentrantLock) this.WinterFlowTransactionAgent;
                        winterFlowSerializerComponent2 = (WinterFlowSerializerComponent) this.WinterFlowServerProtocol;
                        try {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            reentrantLock = reentrantLock2;
                            winterFlowSerializerComponent = winterFlowSerializerComponent2;
                            winterFlowSerializerComponent.WinterFlowTransactionManagerStrategy = false;
                            reentrantLock.unlock();
                            return winterFlowAlgorithmSession4;
                        } catch (Throwable th6) {
                            th = th6;
                            z3 = false;
                            try {
                                winterFlowSerializerComponent2.WinterFlowTransactionManagerStrategy = z3;
                                throw th;
                            } catch (Throwable th7) {
                                th = th7;
                                reentrantLock = reentrantLock2;
                                reentrantLock.unlock();
                                throw th;
                            }
                        }
                    }
                    winterFlowRequestProvider = (WinterFlowRequestProvider) this.WinterFlowServerProtocol;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowArrayNetwork = obj;
                }
                if (!((Boolean) WinterFlowArrayNetwork).booleanValue()) {
                    WinterFlowGatewaySession winterFlowGatewaySession = (WinterFlowGatewaySession) this.WinterFlowThreadListener;
                    winterFlowSerializerComponent = winterFlowGatewaySession.WinterFlowRouterRouter;
                    reentrantLock = winterFlowSerializerComponent.WinterFlowVariableVersionControl;
                    reentrantLock.lock();
                    try {
                        winterFlowSerializerComponent.WinterFlowTransactionManagerStrategy = true;
                        ReentrantLock reentrantLock3 = winterFlowSerializerComponent.WinterFlowRouterStructure;
                        reentrantLock3.lock();
                        try {
                            if (winterFlowSerializerComponent.WinterFlowArrayNetwork) {
                                winterFlowSerializerComponent.WinterFlowArrayNetwork = false;
                                int length = winterFlowSerializerComponent.WinterFlowHookDataSource.length;
                                winterFlowServerSubsystemArr = new WinterFlowServerSubsystem[length];
                                int i24 = 0;
                                boolean z12 = false;
                                while (i24 < length) {
                                    boolean z13 = winterFlowSerializerComponent.WinterFlowHookDataSource[i24] > 0 ? true : z4;
                                    boolean[] zArr = winterFlowSerializerComponent.WinterFlowCacheManagerAgent;
                                    if (z13 != zArr[i24]) {
                                        zArr[i24] = z13;
                                        winterFlowServerSubsystem = z13 ? WinterFlowServerSubsystem.WinterFlowTransactionManagerStrategy : WinterFlowServerSubsystem.WinterFlowUnitTestResponse;
                                        z2 = true;
                                    } else {
                                        z2 = z12;
                                        winterFlowServerSubsystem = WinterFlowServerSubsystem.WinterFlowVariableVersionControl;
                                    }
                                    winterFlowServerSubsystemArr[i24] = winterFlowServerSubsystem;
                                    i24++;
                                    z12 = z2;
                                    z4 = false;
                                }
                                break;
                            }
                            winterFlowServerSubsystemArr = null;
                            if (winterFlowServerSubsystemArr != null) {
                                try {
                                    if (winterFlowServerSubsystemArr.length != 0) {
                                        WinterFlowAdapter winterFlowAdapter = WinterFlowAdapter.WinterFlowTransactionManagerStrategy;
                                        WinterFlowOrchestrationStructure winterFlowOrchestrationStructure = new WinterFlowOrchestrationStructure(winterFlowServerSubsystemArr, winterFlowGatewaySession, winterFlowRequestProvider, null);
                                        this.WinterFlowServerProtocol = winterFlowSerializerComponent;
                                        this.WinterFlowTransactionAgent = reentrantLock;
                                        this.WinterFlowResponseEngine = 2;
                                        if (winterFlowRequestProvider.WinterFlowCacheManagerAgent(winterFlowAdapter, winterFlowOrchestrationStructure, this) != winterFlowListenerJava19) {
                                            winterFlowSerializerComponent2 = winterFlowSerializerComponent;
                                            reentrantLock2 = reentrantLock;
                                            reentrantLock = reentrantLock2;
                                            winterFlowSerializerComponent = winterFlowSerializerComponent2;
                                        }
                                        return winterFlowListenerJava19;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    winterFlowSerializerComponent2 = winterFlowSerializerComponent;
                                    reentrantLock2 = reentrantLock;
                                    z3 = false;
                                    winterFlowSerializerComponent2.WinterFlowTransactionManagerStrategy = z3;
                                    throw th;
                                }
                            }
                            winterFlowSerializerComponent.WinterFlowTransactionManagerStrategy = false;
                            reentrantLock.unlock();
                        } finally {
                            reentrantLock3.unlock();
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return winterFlowAlgorithmSession4;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 1:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowSoftwareProtocol) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 2:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 3:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 4:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowCacheInterface) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowServiceProviderStructure) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 9:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 10:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 11:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 12:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 13:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 14:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowRendererClass) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 15:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowServiceProviderStructure) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 16:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowSoftwareProtocol) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 17:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return ((WinterFlowMapperJava) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowRequestProvider) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowMapperJava(Object obj, Object obj2, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowServerProtocol = obj;
        this.WinterFlowThreadListener = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowMapperJava(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowThreadListener = obj;
    }
}
