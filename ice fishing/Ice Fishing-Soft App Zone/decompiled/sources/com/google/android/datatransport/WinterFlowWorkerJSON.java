package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWorkerJSON extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public /* synthetic */ Object WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax = 0;
    public final /* synthetic */ Object WinterFlowThreadListener;
    public float WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowWorkerJSON(float f, WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice, WinterFlowLibrarySessionManager winterFlowLibrarySessionManager, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = f;
        this.WinterFlowServerProtocol = winterFlowCacheManagerMicroservice;
        this.WinterFlowThreadListener = winterFlowLibrarySessionManager;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowThreadListener;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowWorkerJSON(this.WinterFlowTransactionAgent, (WinterFlowCacheManagerMicroservice) this.WinterFlowServerProtocol, (WinterFlowLibrarySessionManager) obj2, winterFlowTransactionManagerLayer);
            case 1:
                return new WinterFlowWorkerJSON((WinterFlowRepositoryFramework) this.WinterFlowServerProtocol, this.WinterFlowTransactionAgent, (WinterFlowModuleSingleton) obj2, winterFlowTransactionManagerLayer);
            default:
                WinterFlowWorkerJSON winterFlowWorkerJSON = new WinterFlowWorkerJSON((WinterFlowHandlerInvoker) obj2, winterFlowTransactionManagerLayer);
                winterFlowWorkerJSON.WinterFlowServerProtocol = obj;
                return winterFlowWorkerJSON;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b6, code lost:
    
        if (r0.WinterFlowStrategyTool(r7, r0.WinterFlowHookDataSource.getValue(), r11) == r4) goto L50;
     */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        Object WinterFlowRouterStructure;
        final float WinterFlowSingletonPlatform;
        WinterFlowAdapterResponse winterFlowAdapterResponse;
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowThreadListener;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice = (WinterFlowCacheManagerMicroservice) this.WinterFlowServerProtocol;
                float f = this.WinterFlowTransactionAgent;
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    if (f > 0.0f) {
                        this.WinterFlowResponseEngine = 1;
                        break;
                    }
                } else if (i2 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                } else if (i2 != 2) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                if (f == 0.0f) {
                    WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) obj2;
                    this.WinterFlowResponseEngine = 2;
                    WinterFlowHandlerInvoker winterFlowHandlerInvoker = winterFlowCacheManagerMicroservice.WinterFlowVariableVersionControl;
                    if (winterFlowHandlerInvoker == null || ((WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowCacheManagerMicroservice.WinterFlowCacheManagerAgent.getValue(), winterFlowLibrarySessionManager) && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowCacheManagerMicroservice.WinterFlowHookDataSource.getValue(), winterFlowLibrarySessionManager)) || (WinterFlowRouterStructure = WinterFlowCompilerHelper.WinterFlowRouterStructure(winterFlowCacheManagerMicroservice.WinterFlowServerProtocol, new WinterFlowStackManager(winterFlowCacheManagerMicroservice, winterFlowLibrarySessionManager, winterFlowHandlerInvoker, null), this)) != winterFlowListenerJava)) {
                        WinterFlowRouterStructure = winterFlowAlgorithmSession;
                    }
                    if (WinterFlowRouterStructure != winterFlowListenerJava) {
                    }
                    break;
                }
                break;
            case 1:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    if (WinterFlowRendererRefactoring.WinterFlowRouterStructure((WinterFlowRendererRefactoring) ((WinterFlowRepositoryFramework) this.WinterFlowServerProtocol).WinterFlowCacheManagerAgent, new Float(this.WinterFlowTransactionAgent), (WinterFlowModuleSingleton) obj2, this) == winterFlowListenerJava) {
                        break;
                    }
                } else if (i3 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                break;
            default:
                int i4 = this.WinterFlowResponseEngine;
                if (i4 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowAdapterResponse winterFlowAdapterResponse2 = (WinterFlowAdapterResponse) this.WinterFlowServerProtocol;
                    WinterFlowSingletonPlatform = WinterFlowDecoratorUI.WinterFlowSingletonPlatform(winterFlowAdapterResponse2.WinterFlowRouterRouter());
                    winterFlowAdapterResponse = winterFlowAdapterResponse2;
                } else if (i4 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowSingletonPlatform = this.WinterFlowTransactionAgent;
                    winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowServerProtocol;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                while (WinterFlowEncryptionSubsystem.WinterFlowCacheManagerListener(winterFlowAdapterResponse)) {
                    final WinterFlowHandlerInvoker winterFlowHandlerInvoker2 = (WinterFlowHandlerInvoker) obj2;
                    WinterFlowObjectSession winterFlowObjectSession = new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowSingletonWidget
                        @Override // com.google.android.datatransport.WinterFlowObjectSession
                        public final Object WinterFlowUnitTestResponse(Object obj3) {
                            long longValue = ((Long) obj3).longValue();
                            WinterFlowHandlerInvoker winterFlowHandlerInvoker3 = WinterFlowHandlerInvoker.this;
                            boolean WinterFlowUnitTestResponse = winterFlowHandlerInvoker3.WinterFlowUnitTestResponse();
                            WinterFlowSchedulerConfiguration winterFlowSchedulerConfiguration = winterFlowHandlerInvoker3.WinterFlowUnitTestResponse;
                            if (!WinterFlowUnitTestResponse) {
                                if (winterFlowSchedulerConfiguration.WinterFlowRouterRouter() == Long.MIN_VALUE) {
                                    winterFlowSchedulerConfiguration.WinterFlowSyntax(longValue);
                                    ((WinterFlowResolverSubsystem) winterFlowHandlerInvoker3.WinterFlowRouterStructure.WinterFlowRouterStructure).setValue(Boolean.TRUE);
                                }
                                long WinterFlowRouterRouter = longValue - winterFlowSchedulerConfiguration.WinterFlowRouterRouter();
                                float f2 = WinterFlowSingletonPlatform;
                                if (f2 != 0.0f) {
                                    WinterFlowRouterRouter = WinterFlowCloudStack.WinterFlowCloudMicroservice(WinterFlowRouterRouter / f2);
                                }
                                winterFlowHandlerInvoker3.WinterFlowServiceUtility(WinterFlowRouterRouter);
                                winterFlowHandlerInvoker3.WinterFlowRouterRouter(WinterFlowRouterRouter, f2 == 0.0f);
                            }
                            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        }
                    };
                    this.WinterFlowServerProtocol = winterFlowAdapterResponse;
                    this.WinterFlowTransactionAgent = WinterFlowSingletonPlatform;
                    this.WinterFlowResponseEngine = 1;
                    WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = this.WinterFlowTransactionManagerStrategy;
                    winterFlowEncryptionMicroservice.getClass();
                    if (WinterFlowManagerRequest.WinterFlowCompilerVariable(winterFlowEncryptionMicroservice).WinterFlowRouterStructure(winterFlowObjectSession, this) == winterFlowListenerJava) {
                        break;
                    }
                }
                break;
        }
        return winterFlowListenerJava;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) obj;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = (WinterFlowTransactionManagerLayer) obj2;
        switch (i) {
        }
        return ((WinterFlowWorkerJSON) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowAdapterResponse)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowWorkerJSON(WinterFlowRepositoryFramework winterFlowRepositoryFramework, float f, WinterFlowModuleSingleton winterFlowModuleSingleton, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowServerProtocol = winterFlowRepositoryFramework;
        this.WinterFlowTransactionAgent = f;
        this.WinterFlowThreadListener = winterFlowModuleSingleton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowWorkerJSON(WinterFlowHandlerInvoker winterFlowHandlerInvoker, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowThreadListener = winterFlowHandlerInvoker;
    }
}
