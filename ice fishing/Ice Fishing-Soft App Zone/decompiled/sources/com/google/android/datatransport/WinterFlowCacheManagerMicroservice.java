package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheManagerMicroservice extends WinterFlowPackageConsumer {
    public Object WinterFlowArrayNetwork;
    public WinterFlowCompilerBatch WinterFlowBandwidthObject;
    public final WinterFlowResolverSubsystem WinterFlowCacheManagerAgent;
    public float WinterFlowConcurrencyThread;
    public final WinterFlowResolverSubsystem WinterFlowHookDataSource;
    public final WinterFlowParserTool WinterFlowOrchestrationSubsystem;
    public WinterFlowEventCloud WinterFlowResponseEngine;
    public WinterFlowClassStrategy WinterFlowRouterRouter;
    public final WinterFlowCompilerHelper WinterFlowServerProtocol;
    public final WinterFlowMicroserviceFunction WinterFlowServiceUtility;
    public final WinterFlowParserTool WinterFlowSingletonPlatform;
    public final WinterFlowObjectHandler WinterFlowSyntax;
    public long WinterFlowThreadListener;
    public final WinterFlowIDEPlatform WinterFlowTransactionAgent;
    public long WinterFlowTransactionManagerStrategy;
    public final WinterFlowAPISystem WinterFlowUnitTestResponse;
    public WinterFlowHandlerInvoker WinterFlowVariableVersionControl;
    public static final WinterFlowVariableSubsystem WinterFlowVariableBandwidth = new WinterFlowVariableSubsystem(0.0f);
    public static final WinterFlowVariableSubsystem WinterFlowBatchUI = new WinterFlowVariableSubsystem(1.0f);

    /* JADX WARN: Type inference failed for: r3v6, types: [com.google.android.datatransport.WinterFlowParserTool] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.google.android.datatransport.WinterFlowParserTool] */
    public WinterFlowCacheManagerMicroservice(WinterFlowLibrarySessionManager winterFlowLibrarySessionManager) {
        super(4);
        this.WinterFlowHookDataSource = WinterFlowDecoratorUI.WinterFlowSerializerStructure(winterFlowLibrarySessionManager);
        this.WinterFlowCacheManagerAgent = WinterFlowDecoratorUI.WinterFlowSerializerStructure(winterFlowLibrarySessionManager);
        this.WinterFlowArrayNetwork = winterFlowLibrarySessionManager;
        this.WinterFlowUnitTestResponse = new WinterFlowAPISystem(20, this);
        this.WinterFlowSyntax = new WinterFlowObjectHandler(0.0f);
        this.WinterFlowTransactionAgent = new WinterFlowIDEPlatform();
        this.WinterFlowServerProtocol = new WinterFlowCompilerHelper();
        this.WinterFlowThreadListener = Long.MIN_VALUE;
        this.WinterFlowServiceUtility = new WinterFlowMicroserviceFunction();
        final int i = 0;
        this.WinterFlowOrchestrationSubsystem = new WinterFlowObjectSession(this) { // from class: com.google.android.datatransport.WinterFlowParserTool
            public final /* synthetic */ WinterFlowCacheManagerMicroservice WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                int i2 = i;
                WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice = this.WinterFlowTransactionManagerStrategy;
                long longValue = ((Long) obj).longValue();
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        winterFlowCacheManagerMicroservice.WinterFlowThreadListener = longValue;
                        break;
                    default:
                        long j = longValue - winterFlowCacheManagerMicroservice.WinterFlowThreadListener;
                        winterFlowCacheManagerMicroservice.WinterFlowThreadListener = longValue;
                        long WinterFlowCloudMicroservice = WinterFlowCloudStack.WinterFlowCloudMicroservice(j / winterFlowCacheManagerMicroservice.WinterFlowConcurrencyThread);
                        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = winterFlowCacheManagerMicroservice.WinterFlowServiceUtility;
                        if (winterFlowMicroserviceFunction.WinterFlowSyntax()) {
                            Object[] objArr = winterFlowMicroserviceFunction.WinterFlowRouterStructure;
                            int i3 = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                WinterFlowCompilerBatch winterFlowCompilerBatch = (WinterFlowCompilerBatch) objArr[i5];
                                WinterFlowCacheManagerMicroservice.WinterFlowCompilerVariable(winterFlowCompilerBatch, WinterFlowCloudMicroservice);
                                winterFlowCompilerBatch.WinterFlowCacheManagerAgent = true;
                            }
                            WinterFlowHandlerInvoker winterFlowHandlerInvoker = winterFlowCacheManagerMicroservice.WinterFlowVariableVersionControl;
                            if (winterFlowHandlerInvoker != null) {
                                winterFlowHandlerInvoker.WinterFlowBandwidthObject();
                            }
                            int i6 = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
                            Object[] objArr2 = winterFlowMicroserviceFunction.WinterFlowRouterStructure;
                            WinterFlowCacheManagerListener WinterFlowArrayHelper = WinterFlowDecoratorUI.WinterFlowArrayHelper(0, i6);
                            int i7 = WinterFlowArrayHelper.WinterFlowVariableVersionControl;
                            int i8 = WinterFlowArrayHelper.WinterFlowTransactionManagerStrategy;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((WinterFlowCompilerBatch) objArr2[i7]).WinterFlowCacheManagerAgent) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            WinterFlowProtocolPipeline.WinterFlowProxyStructure(objArr2, i6 - i4, i6);
                            winterFlowMicroserviceFunction.WinterFlowHookDataSource -= i4;
                        }
                        WinterFlowCompilerBatch winterFlowCompilerBatch2 = winterFlowCacheManagerMicroservice.WinterFlowBandwidthObject;
                        if (winterFlowCompilerBatch2 != null) {
                            winterFlowCompilerBatch2.WinterFlowUnitTestResponse = winterFlowCacheManagerMicroservice.WinterFlowTransactionManagerStrategy;
                            WinterFlowCacheManagerMicroservice.WinterFlowCompilerVariable(winterFlowCompilerBatch2, WinterFlowCloudMicroservice);
                            winterFlowCacheManagerMicroservice.WinterFlowPackageIDE(winterFlowCompilerBatch2.WinterFlowArrayNetwork);
                            if (winterFlowCompilerBatch2.WinterFlowArrayNetwork == 1.0f) {
                                winterFlowCacheManagerMicroservice.WinterFlowBandwidthObject = null;
                            }
                            winterFlowCacheManagerMicroservice.WinterFlowCacheManagerListener();
                            break;
                        }
                        break;
                }
                return winterFlowAlgorithmSession;
            }
        };
        final int i2 = 1;
        this.WinterFlowSingletonPlatform = new WinterFlowObjectSession(this) { // from class: com.google.android.datatransport.WinterFlowParserTool
            public final /* synthetic */ WinterFlowCacheManagerMicroservice WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                int i22 = i2;
                WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice = this.WinterFlowTransactionManagerStrategy;
                long longValue = ((Long) obj).longValue();
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        winterFlowCacheManagerMicroservice.WinterFlowThreadListener = longValue;
                        break;
                    default:
                        long j = longValue - winterFlowCacheManagerMicroservice.WinterFlowThreadListener;
                        winterFlowCacheManagerMicroservice.WinterFlowThreadListener = longValue;
                        long WinterFlowCloudMicroservice = WinterFlowCloudStack.WinterFlowCloudMicroservice(j / winterFlowCacheManagerMicroservice.WinterFlowConcurrencyThread);
                        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = winterFlowCacheManagerMicroservice.WinterFlowServiceUtility;
                        if (winterFlowMicroserviceFunction.WinterFlowSyntax()) {
                            Object[] objArr = winterFlowMicroserviceFunction.WinterFlowRouterStructure;
                            int i3 = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                WinterFlowCompilerBatch winterFlowCompilerBatch = (WinterFlowCompilerBatch) objArr[i5];
                                WinterFlowCacheManagerMicroservice.WinterFlowCompilerVariable(winterFlowCompilerBatch, WinterFlowCloudMicroservice);
                                winterFlowCompilerBatch.WinterFlowCacheManagerAgent = true;
                            }
                            WinterFlowHandlerInvoker winterFlowHandlerInvoker = winterFlowCacheManagerMicroservice.WinterFlowVariableVersionControl;
                            if (winterFlowHandlerInvoker != null) {
                                winterFlowHandlerInvoker.WinterFlowBandwidthObject();
                            }
                            int i6 = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
                            Object[] objArr2 = winterFlowMicroserviceFunction.WinterFlowRouterStructure;
                            WinterFlowCacheManagerListener WinterFlowArrayHelper = WinterFlowDecoratorUI.WinterFlowArrayHelper(0, i6);
                            int i7 = WinterFlowArrayHelper.WinterFlowVariableVersionControl;
                            int i8 = WinterFlowArrayHelper.WinterFlowTransactionManagerStrategy;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((WinterFlowCompilerBatch) objArr2[i7]).WinterFlowCacheManagerAgent) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            WinterFlowProtocolPipeline.WinterFlowProxyStructure(objArr2, i6 - i4, i6);
                            winterFlowMicroserviceFunction.WinterFlowHookDataSource -= i4;
                        }
                        WinterFlowCompilerBatch winterFlowCompilerBatch2 = winterFlowCacheManagerMicroservice.WinterFlowBandwidthObject;
                        if (winterFlowCompilerBatch2 != null) {
                            winterFlowCompilerBatch2.WinterFlowUnitTestResponse = winterFlowCacheManagerMicroservice.WinterFlowTransactionManagerStrategy;
                            WinterFlowCacheManagerMicroservice.WinterFlowCompilerVariable(winterFlowCompilerBatch2, WinterFlowCloudMicroservice);
                            winterFlowCacheManagerMicroservice.WinterFlowPackageIDE(winterFlowCompilerBatch2.WinterFlowArrayNetwork);
                            if (winterFlowCompilerBatch2.WinterFlowArrayNetwork == 1.0f) {
                                winterFlowCacheManagerMicroservice.WinterFlowBandwidthObject = null;
                            }
                            winterFlowCacheManagerMicroservice.WinterFlowCacheManagerListener();
                            break;
                        }
                        break;
                }
                return winterFlowAlgorithmSession;
            }
        };
    }

    public static void WinterFlowCompilerVariable(WinterFlowCompilerBatch winterFlowCompilerBatch, long j) {
        long j2 = winterFlowCompilerBatch.WinterFlowRouterStructure + j;
        winterFlowCompilerBatch.WinterFlowRouterStructure = j2;
        long j3 = winterFlowCompilerBatch.WinterFlowRouterRouter;
        if (j2 >= j3) {
            winterFlowCompilerBatch.WinterFlowArrayNetwork = 1.0f;
            return;
        }
        WinterFlowDecoratorRuntime winterFlowDecoratorRuntime = winterFlowCompilerBatch.WinterFlowHookDataSource;
        WinterFlowVariableSubsystem winterFlowVariableSubsystem = winterFlowCompilerBatch.WinterFlowVariableVersionControl;
        if (winterFlowDecoratorRuntime == null) {
            float f = j2 / j3;
            winterFlowCompilerBatch.WinterFlowArrayNetwork = (f * 1.0f) + ((1.0f - f) * winterFlowVariableSubsystem.WinterFlowRouterStructure(0));
            return;
        }
        WinterFlowVariableSubsystem winterFlowVariableSubsystem2 = winterFlowCompilerBatch.WinterFlowTransactionManagerStrategy;
        if (winterFlowVariableSubsystem2 == null) {
            winterFlowVariableSubsystem2 = WinterFlowVariableBandwidth;
        }
        winterFlowCompilerBatch.WinterFlowArrayNetwork = WinterFlowDecoratorUI.WinterFlowRouterRouter(((WinterFlowVariableSubsystem) winterFlowDecoratorRuntime.WinterFlowSyntax(j2, winterFlowVariableSubsystem, WinterFlowBatchUI, winterFlowVariableSubsystem2)).WinterFlowRouterStructure(0), 0.0f, 1.0f);
    }

    public final void WinterFlowArrayHelper() {
        WinterFlowHandlerInvoker winterFlowHandlerInvoker = this.WinterFlowVariableVersionControl;
        if (winterFlowHandlerInvoker == null) {
            return;
        }
        WinterFlowCompilerBatch winterFlowCompilerBatch = this.WinterFlowBandwidthObject;
        if (winterFlowCompilerBatch == null) {
            if (this.WinterFlowTransactionManagerStrategy > 0) {
                WinterFlowObjectHandler winterFlowObjectHandler = this.WinterFlowSyntax;
                if (winterFlowObjectHandler.WinterFlowRouterRouter() != 1.0f && !WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowCacheManagerAgent.getValue(), this.WinterFlowHookDataSource.getValue())) {
                    WinterFlowCompilerBatch winterFlowCompilerBatch2 = new WinterFlowCompilerBatch();
                    winterFlowCompilerBatch2.WinterFlowArrayNetwork = winterFlowObjectHandler.WinterFlowRouterRouter();
                    long j = this.WinterFlowTransactionManagerStrategy;
                    winterFlowCompilerBatch2.WinterFlowUnitTestResponse = j;
                    winterFlowCompilerBatch2.WinterFlowRouterRouter = WinterFlowCloudStack.WinterFlowCloudMicroservice((1.0d - winterFlowObjectHandler.WinterFlowRouterRouter()) * j);
                    winterFlowCompilerBatch2.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl(winterFlowObjectHandler.WinterFlowRouterRouter(), 0);
                    winterFlowCompilerBatch = winterFlowCompilerBatch2;
                }
            }
            winterFlowCompilerBatch = null;
        }
        if (winterFlowCompilerBatch != null) {
            winterFlowCompilerBatch.WinterFlowUnitTestResponse = this.WinterFlowTransactionManagerStrategy;
            this.WinterFlowServiceUtility.WinterFlowRouterStructure(winterFlowCompilerBatch);
            winterFlowHandlerInvoker.WinterFlowThreadListener(winterFlowCompilerBatch);
        }
        this.WinterFlowBandwidthObject = null;
    }

    public final Object WinterFlowBackendCacheManager(WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        float WinterFlowSingletonPlatform = WinterFlowDecoratorUI.WinterFlowSingletonPlatform(winterFlowOrchestrationCompiler.getContext());
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        if (WinterFlowSingletonPlatform <= 0.0f) {
            WinterFlowEventEmitterController();
            return winterFlowAlgorithmSession;
        }
        this.WinterFlowConcurrencyThread = WinterFlowSingletonPlatform;
        Object WinterFlowRouterStructure = WinterFlowManagerRequest.WinterFlowCompilerVariable(winterFlowOrchestrationCompiler.getContext()).WinterFlowRouterStructure(this.WinterFlowSingletonPlatform, winterFlowOrchestrationCompiler);
        return WinterFlowRouterStructure == WinterFlowListenerJava.WinterFlowVariableVersionControl ? WinterFlowRouterStructure : winterFlowAlgorithmSession;
    }

    public final void WinterFlowCacheManagerListener() {
        WinterFlowHandlerInvoker winterFlowHandlerInvoker = this.WinterFlowVariableVersionControl;
        if (winterFlowHandlerInvoker == null) {
            return;
        }
        winterFlowHandlerInvoker.WinterFlowServerProtocol(WinterFlowCloudStack.WinterFlowCloudMicroservice(this.WinterFlowSyntax.WinterFlowRouterRouter() * ((Number) winterFlowHandlerInvoker.WinterFlowServerProtocol.getValue()).longValue()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (com.google.android.datatransport.WinterFlowManagerRequest.WinterFlowCompilerVariable(r11).WinterFlowRouterStructure(r10.WinterFlowOrchestrationSubsystem, r0) == r9) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowConfigurationSubsystem(WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowWidgetRouter winterFlowWidgetRouter;
        int i;
        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction;
        Object obj;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowWidgetRouter) {
            winterFlowWidgetRouter = (WinterFlowWidgetRouter) winterFlowOrchestrationCompiler;
            int i2 = winterFlowWidgetRouter.WinterFlowResponseEngine;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowWidgetRouter.WinterFlowResponseEngine = i2 - Integer.MIN_VALUE;
                WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = winterFlowWidgetRouter.WinterFlowTransactionManagerStrategy;
                Object obj2 = winterFlowWidgetRouter.WinterFlowRouterRouter;
                i = winterFlowWidgetRouter.WinterFlowResponseEngine;
                winterFlowMicroserviceFunction = this.WinterFlowServiceUtility;
                WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                obj = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                    if (winterFlowMicroserviceFunction.WinterFlowRouterRouter() && this.WinterFlowBandwidthObject == null) {
                        return winterFlowAlgorithmSession;
                    }
                    winterFlowEncryptionMicroservice.getClass();
                    if (WinterFlowDecoratorUI.WinterFlowSingletonPlatform(winterFlowEncryptionMicroservice) == 0.0f) {
                        WinterFlowEventEmitterController();
                        this.WinterFlowThreadListener = Long.MIN_VALUE;
                        return winterFlowAlgorithmSession;
                    }
                    if (this.WinterFlowThreadListener == Long.MIN_VALUE) {
                        winterFlowWidgetRouter.WinterFlowResponseEngine = 1;
                        winterFlowEncryptionMicroservice.getClass();
                    }
                } else {
                    if (i != 1 && i != 2) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                }
                do {
                    if (winterFlowMicroserviceFunction.WinterFlowSyntax() && this.WinterFlowBandwidthObject == null) {
                        this.WinterFlowThreadListener = Long.MIN_VALUE;
                        return winterFlowAlgorithmSession;
                    }
                    winterFlowWidgetRouter.WinterFlowResponseEngine = 2;
                } while (WinterFlowBackendCacheManager(winterFlowWidgetRouter) != obj);
                return obj;
            }
        }
        winterFlowWidgetRouter = new WinterFlowWidgetRouter(this, winterFlowOrchestrationCompiler);
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice2 = winterFlowWidgetRouter.WinterFlowTransactionManagerStrategy;
        Object obj22 = winterFlowWidgetRouter.WinterFlowRouterRouter;
        i = winterFlowWidgetRouter.WinterFlowResponseEngine;
        winterFlowMicroserviceFunction = this.WinterFlowServiceUtility;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        obj = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i != 0) {
        }
        do {
            if (winterFlowMicroserviceFunction.WinterFlowSyntax()) {
            }
            winterFlowWidgetRouter.WinterFlowResponseEngine = 2;
        } while (WinterFlowBackendCacheManager(winterFlowWidgetRouter) != obj);
        return obj;
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final void WinterFlowConsumerUserManager() {
        this.WinterFlowVariableVersionControl = null;
        WinterFlowClassStrategy winterFlowClassStrategy = this.WinterFlowRouterRouter;
        if (winterFlowClassStrategy != null) {
            winterFlowClassStrategy.WinterFlowRouterStructure(this);
        }
    }

    public final void WinterFlowEventEmitterController() {
        WinterFlowHandlerInvoker winterFlowHandlerInvoker = this.WinterFlowVariableVersionControl;
        if (winterFlowHandlerInvoker != null) {
            winterFlowHandlerInvoker.WinterFlowCacheManagerAgent();
        }
        this.WinterFlowServiceUtility.WinterFlowArrayNetwork();
        if (this.WinterFlowBandwidthObject != null) {
            this.WinterFlowBandwidthObject = null;
            WinterFlowPackageIDE(1.0f);
            WinterFlowCacheManagerListener();
        }
    }

    public final void WinterFlowPackageIDE(float f) {
        this.WinterFlowSyntax.WinterFlowSyntax(f);
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final void WinterFlowResolverController(WinterFlowHandlerInvoker winterFlowHandlerInvoker) {
        WinterFlowHandlerInvoker winterFlowHandlerInvoker2 = this.WinterFlowVariableVersionControl;
        if (winterFlowHandlerInvoker2 != null && winterFlowHandlerInvoker != winterFlowHandlerInvoker2) {
            WinterFlowInheritanceWorker.WinterFlowHookDataSource("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.WinterFlowVariableVersionControl + ", new instance: " + winterFlowHandlerInvoker);
        }
        this.WinterFlowVariableVersionControl = winterFlowHandlerInvoker;
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final void WinterFlowRouterAdapter(Object obj) {
        this.WinterFlowCacheManagerAgent.setValue(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r4.WinterFlowArrayNetwork(r0) == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowSoftwareEngine(WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowStrategyModule winterFlowStrategyModule;
        int i;
        Object value;
        Object obj;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowStrategyModule) {
            winterFlowStrategyModule = (WinterFlowStrategyModule) winterFlowOrchestrationCompiler;
            int i2 = winterFlowStrategyModule.WinterFlowTransactionAgent;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowStrategyModule.WinterFlowTransactionAgent = i2 - Integer.MIN_VALUE;
                Object obj2 = winterFlowStrategyModule.WinterFlowSyntax;
                i = winterFlowStrategyModule.WinterFlowTransactionAgent;
                WinterFlowIDEPlatform winterFlowIDEPlatform = this.WinterFlowTransactionAgent;
                WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                    value = this.WinterFlowHookDataSource.getValue();
                    winterFlowStrategyModule.WinterFlowRouterRouter = value;
                    winterFlowStrategyModule.WinterFlowTransactionAgent = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = winterFlowStrategyModule.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                        if (!WinterFlowManagerRequest.WinterFlowThreadListener(obj2, obj)) {
                            this.WinterFlowThreadListener = Long.MIN_VALUE;
                            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                        }
                        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    }
                    Object obj3 = winterFlowStrategyModule.WinterFlowRouterRouter;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                    value = obj3;
                }
                if (!WinterFlowManagerRequest.WinterFlowThreadListener(value, this.WinterFlowArrayNetwork)) {
                    winterFlowIDEPlatform.WinterFlowHookDataSource(null);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
                winterFlowStrategyModule.WinterFlowRouterRouter = value;
                winterFlowStrategyModule.WinterFlowTransactionAgent = 2;
                WinterFlowEventCloud winterFlowEventCloud = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowStrategyModule));
                winterFlowEventCloud.WinterFlowSerializerStructure();
                this.WinterFlowResponseEngine = winterFlowEventCloud;
                winterFlowIDEPlatform.WinterFlowHookDataSource(null);
                Object WinterFlowBatchUI2 = winterFlowEventCloud.WinterFlowBatchUI();
                if (WinterFlowBatchUI2 != winterFlowListenerJava) {
                    obj = value;
                    obj2 = WinterFlowBatchUI2;
                    if (!WinterFlowManagerRequest.WinterFlowThreadListener(obj2, obj)) {
                    }
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
                return winterFlowListenerJava;
            }
        }
        winterFlowStrategyModule = new WinterFlowStrategyModule(this, winterFlowOrchestrationCompiler);
        Object obj22 = winterFlowStrategyModule.WinterFlowSyntax;
        i = winterFlowStrategyModule.WinterFlowTransactionAgent;
        WinterFlowIDEPlatform winterFlowIDEPlatform2 = this.WinterFlowTransactionAgent;
        WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i != 0) {
        }
        if (!WinterFlowManagerRequest.WinterFlowThreadListener(value, this.WinterFlowArrayNetwork)) {
        }
    }

    public final void WinterFlowSoftwareProtocol(WinterFlowClassStrategy winterFlowClassStrategy) {
        WinterFlowExceptionBandwidth winterFlowExceptionBandwidth;
        if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterRouter, winterFlowClassStrategy)) {
            return;
        }
        WinterFlowClassStrategy winterFlowClassStrategy2 = this.WinterFlowRouterRouter;
        if (winterFlowClassStrategy2 != null) {
            winterFlowClassStrategy2.WinterFlowRouterStructure(this);
        }
        WinterFlowClassStrategy winterFlowClassStrategy3 = this.WinterFlowRouterRouter;
        if (winterFlowClassStrategy3 != null && (winterFlowExceptionBandwidth = winterFlowClassStrategy3.WinterFlowRouterRouter) != null) {
            winterFlowExceptionBandwidth.WinterFlowVariableVersionControl();
        }
        this.WinterFlowRouterRouter = winterFlowClassStrategy;
        if (winterFlowClassStrategy != null) {
            winterFlowClassStrategy.WinterFlowArrayNetwork();
        }
        WinterFlowClassStrategy winterFlowClassStrategy4 = this.WinterFlowRouterRouter;
        if (winterFlowClassStrategy4 != null) {
            winterFlowClassStrategy4.WinterFlowCacheManagerAgent(this, WinterFlowSoftwareException.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse);
        }
    }

    public final Object WinterFlowStrategyTool(float f, Object obj, WinterFlowNodeInheritance winterFlowNodeInheritance) {
        if (0.0f > f || f > 1.0f) {
            WinterFlowInheritanceWorker.WinterFlowRouterStructure("Expecting fraction between 0 and 1. Got " + f);
        }
        WinterFlowHandlerInvoker winterFlowHandlerInvoker = this.WinterFlowVariableVersionControl;
        if (winterFlowHandlerInvoker != null) {
            Object WinterFlowRouterStructure = WinterFlowCompilerHelper.WinterFlowRouterStructure(this.WinterFlowServerProtocol, new WinterFlowScriptNode(obj, this.WinterFlowHookDataSource.getValue(), this, winterFlowHandlerInvoker, f, null), winterFlowNodeInheritance);
            if (WinterFlowRouterStructure == WinterFlowListenerJava.WinterFlowVariableVersionControl) {
                return WinterFlowRouterStructure;
            }
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final Object WinterFlowSyntax() {
        return this.WinterFlowCacheManagerAgent.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r3.WinterFlowArrayNetwork(r0) == r6) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowUserManagerUserManager(WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowServiceFramework winterFlowServiceFramework;
        int i;
        WinterFlowListenerJava winterFlowListenerJava;
        Object value;
        Object WinterFlowBatchUI2;
        Object obj;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowServiceFramework) {
            winterFlowServiceFramework = (WinterFlowServiceFramework) winterFlowOrchestrationCompiler;
            int i2 = winterFlowServiceFramework.WinterFlowTransactionAgent;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowServiceFramework.WinterFlowTransactionAgent = i2 - Integer.MIN_VALUE;
                Object obj2 = winterFlowServiceFramework.WinterFlowSyntax;
                i = winterFlowServiceFramework.WinterFlowTransactionAgent;
                WinterFlowIDEPlatform winterFlowIDEPlatform = this.WinterFlowTransactionAgent;
                winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                    value = this.WinterFlowHookDataSource.getValue();
                    winterFlowServiceFramework.WinterFlowRouterRouter = value;
                    winterFlowServiceFramework.WinterFlowTransactionAgent = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = winterFlowServiceFramework.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                        if (!WinterFlowManagerRequest.WinterFlowThreadListener(obj2, obj)) {
                            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        }
                        this.WinterFlowThreadListener = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = winterFlowServiceFramework.WinterFlowRouterRouter;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                    value = obj3;
                }
                winterFlowServiceFramework.WinterFlowRouterRouter = value;
                winterFlowServiceFramework.WinterFlowTransactionAgent = 2;
                WinterFlowEventCloud winterFlowEventCloud = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowServiceFramework));
                winterFlowEventCloud.WinterFlowSerializerStructure();
                this.WinterFlowResponseEngine = winterFlowEventCloud;
                winterFlowIDEPlatform.WinterFlowHookDataSource(null);
                WinterFlowBatchUI2 = winterFlowEventCloud.WinterFlowBatchUI();
                if (WinterFlowBatchUI2 != winterFlowListenerJava) {
                    obj = value;
                    obj2 = WinterFlowBatchUI2;
                    if (!WinterFlowManagerRequest.WinterFlowThreadListener(obj2, obj)) {
                    }
                }
                return winterFlowListenerJava;
            }
        }
        winterFlowServiceFramework = new WinterFlowServiceFramework(this, winterFlowOrchestrationCompiler);
        Object obj22 = winterFlowServiceFramework.WinterFlowSyntax;
        i = winterFlowServiceFramework.WinterFlowTransactionAgent;
        WinterFlowIDEPlatform winterFlowIDEPlatform2 = this.WinterFlowTransactionAgent;
        winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i != 0) {
        }
        winterFlowServiceFramework.WinterFlowRouterRouter = value;
        winterFlowServiceFramework.WinterFlowTransactionAgent = 2;
        WinterFlowEventCloud winterFlowEventCloud2 = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowServiceFramework));
        winterFlowEventCloud2.WinterFlowSerializerStructure();
        this.WinterFlowResponseEngine = winterFlowEventCloud2;
        winterFlowIDEPlatform2.WinterFlowHookDataSource(null);
        WinterFlowBatchUI2 = winterFlowEventCloud2.WinterFlowBatchUI();
        if (WinterFlowBatchUI2 != winterFlowListenerJava) {
        }
        return winterFlowListenerJava;
    }
}
