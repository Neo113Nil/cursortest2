package com.google.android.datatransport;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJavaSession extends WinterFlowDebugFramework implements WinterFlowObjectUI {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowJavaSession(int i, Object obj, Object obj2) {
        super(0);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowRouterRouter = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        boolean dispatchKeyEvent;
        WinterFlowProcessorSystem winterFlowProcessorSystem;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure;
        WinterFlowVersionParser winterFlowVersionParser;
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj = this.WinterFlowRouterRouter;
        Object obj2 = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                return Boolean.valueOf(dispatchKeyEvent);
            case 1:
                WinterFlowBackendEventEmitter winterFlowBackendEventEmitter = (WinterFlowBackendEventEmitter) obj;
                WinterFlowWebsocketTransactionManager winterFlowWebsocketTransactionManager = (WinterFlowWebsocketTransactionManager) obj2;
                WinterFlowExceptionPlatform winterFlowExceptionPlatform = winterFlowWebsocketTransactionManager.WinterFlowSyntax;
                WinterFlowExceptionPlatform winterFlowExceptionPlatform2 = winterFlowWebsocketTransactionManager.WinterFlowResponseEngine;
                Float f = winterFlowWebsocketTransactionManager.WinterFlowUnitTestResponse;
                Float f2 = winterFlowWebsocketTransactionManager.WinterFlowRouterRouter;
                float floatValue = (winterFlowExceptionPlatform == null || f == null) ? 0.0f : ((Number) winterFlowExceptionPlatform.WinterFlowRouterStructure.WinterFlowRouterStructure()).floatValue() - f.floatValue();
                float floatValue2 = (winterFlowExceptionPlatform2 == null || f2 == null) ? 0.0f : ((Number) winterFlowExceptionPlatform2.WinterFlowRouterStructure.WinterFlowRouterStructure()).floatValue() - f2.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int WinterFlowBatchUI = winterFlowBackendEventEmitter.WinterFlowBatchUI(winterFlowWebsocketTransactionManager.WinterFlowVariableVersionControl);
                    WinterFlowArrayModule winterFlowArrayModule = (WinterFlowArrayModule) winterFlowBackendEventEmitter.WinterFlowServerProtocol().WinterFlowHookDataSource(winterFlowBackendEventEmitter.WinterFlowBandwidthObject);
                    if (winterFlowArrayModule != null) {
                        try {
                            WinterFlowFrameworkDataSource winterFlowFrameworkDataSource = winterFlowBackendEventEmitter.WinterFlowConcurrencyThread;
                            if (winterFlowFrameworkDataSource != null) {
                                winterFlowFrameworkDataSource.WinterFlowRouterStructure.setBoundsInScreen(winterFlowBackendEventEmitter.WinterFlowArrayNetwork(winterFlowArrayModule));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    WinterFlowArrayModule winterFlowArrayModule2 = (WinterFlowArrayModule) winterFlowBackendEventEmitter.WinterFlowServerProtocol().WinterFlowHookDataSource(winterFlowBackendEventEmitter.WinterFlowOrchestrationSubsystem);
                    if (winterFlowArrayModule2 != null) {
                        try {
                            WinterFlowFrameworkDataSource winterFlowFrameworkDataSource2 = winterFlowBackendEventEmitter.WinterFlowSingletonPlatform;
                            if (winterFlowFrameworkDataSource2 != null) {
                                winterFlowFrameworkDataSource2.WinterFlowRouterStructure.setBoundsInScreen(winterFlowBackendEventEmitter.WinterFlowArrayNetwork(winterFlowArrayModule2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    winterFlowBackendEventEmitter.WinterFlowRouterRouter.invalidate();
                    WinterFlowArrayModule winterFlowArrayModule3 = (WinterFlowArrayModule) winterFlowBackendEventEmitter.WinterFlowServerProtocol().WinterFlowHookDataSource(WinterFlowBatchUI);
                    if (winterFlowArrayModule3 != null && (winterFlowProcessorSystem = winterFlowArrayModule3.WinterFlowRouterStructure) != null && (winterFlowSchedulerStructure = winterFlowProcessorSystem.WinterFlowCacheManagerAgent) != null) {
                        if (winterFlowExceptionPlatform != null) {
                            winterFlowBackendEventEmitter.WinterFlowBatchUI.WinterFlowRouterRouter(WinterFlowBatchUI, winterFlowExceptionPlatform);
                        }
                        if (winterFlowExceptionPlatform2 != null) {
                            winterFlowBackendEventEmitter.WinterFlowRouterAdapter.WinterFlowRouterRouter(WinterFlowBatchUI, winterFlowExceptionPlatform2);
                        }
                        winterFlowBackendEventEmitter.WinterFlowOrchestrationSubsystem(winterFlowSchedulerStructure);
                    }
                }
                if (winterFlowExceptionPlatform != null) {
                    winterFlowWebsocketTransactionManager.WinterFlowUnitTestResponse = (Float) winterFlowExceptionPlatform.WinterFlowRouterStructure.WinterFlowRouterStructure();
                }
                if (winterFlowExceptionPlatform2 != null) {
                    winterFlowWebsocketTransactionManager.WinterFlowRouterRouter = (Float) winterFlowExceptionPlatform2.WinterFlowRouterStructure.WinterFlowRouterStructure();
                }
                return winterFlowAlgorithmSession;
            case 2:
                WinterFlowObjectUI winterFlowObjectUI = (WinterFlowObjectUI) obj2;
                if (winterFlowObjectUI != null && (winterFlowVersionParser = (WinterFlowVersionParser) winterFlowObjectUI.WinterFlowRouterStructure()) != null) {
                    return winterFlowVersionParser;
                }
                WinterFlowUIMicroservice winterFlowUIMicroservice = (WinterFlowUIMicroservice) obj;
                if (!winterFlowUIMicroservice.WinterFlowInheritanceJava().WinterFlowSingletonPlatform) {
                    winterFlowUIMicroservice = null;
                }
                if (winterFlowUIMicroservice != null) {
                    return WinterFlowHookProcessor.WinterFlowHookDataSource(0L, WinterFlowServerManager.WinterFlowUserManagerUserManager(winterFlowUIMicroservice.WinterFlowUnitTestResponse));
                }
                return null;
            case 3:
                ((WinterFlowTestingObject) obj2).WinterFlowRouterAdapter.WinterFlowUnitTestResponse((WinterFlowBackendQuery) obj);
                return winterFlowAlgorithmSession;
            case 4:
                ((WinterFlowBandwidthCache) obj2).WinterFlowVariableVersionControl = WinterFlowEncryptionSubsystem.WinterFlowConcurrencyThread((WinterFlowProviderWidget) obj, WinterFlowService.WinterFlowRouterStructure);
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                ((WinterFlowBandwidthCache) obj2).WinterFlowVariableVersionControl = ((WinterFlowDeploymentWidget) obj).WinterFlowUserManagerConcurrency();
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                ((WinterFlowParserVersionControl) obj2).WinterFlowArrayNetwork((WinterFlowUserManagerController) obj);
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowExceptionStrategy winterFlowExceptionStrategy = ((WinterFlowSchedulerStructure) obj2).WinterFlowUserManagerUserManager;
                WinterFlowBandwidthCache winterFlowBandwidthCache = (WinterFlowBandwidthCache) obj;
                if ((winterFlowExceptionStrategy.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 8) != 0) {
                    for (WinterFlowUserManagerController winterFlowUserManagerController = winterFlowExceptionStrategy.WinterFlowVariableVersionControl; winterFlowUserManagerController != null; winterFlowUserManagerController = winterFlowUserManagerController.WinterFlowSyntax) {
                        if ((winterFlowUserManagerController.WinterFlowUnitTestResponse & 8) != 0) {
                            WinterFlowTestingEntity winterFlowTestingEntity = winterFlowUserManagerController;
                            ?? r6 = 0;
                            while (winterFlowTestingEntity != 0) {
                                if (winterFlowTestingEntity instanceof WinterFlowHandlerThread) {
                                    WinterFlowHandlerThread winterFlowHandlerThread = (WinterFlowHandlerThread) winterFlowTestingEntity;
                                    if (winterFlowHandlerThread.WinterFlowModuleAgent()) {
                                        WinterFlowDecoratorBackend winterFlowDecoratorBackend = new WinterFlowDecoratorBackend();
                                        winterFlowBandwidthCache.WinterFlowVariableVersionControl = winterFlowDecoratorBackend;
                                        winterFlowDecoratorBackend.WinterFlowRouterRouter = true;
                                    }
                                    if (winterFlowHandlerThread.WinterFlowSessionManagerInterface()) {
                                        ((WinterFlowDecoratorBackend) winterFlowBandwidthCache.WinterFlowVariableVersionControl).WinterFlowUnitTestResponse = true;
                                    }
                                    winterFlowHandlerThread.WinterFlowSyntax((WinterFlowXMLInterface) winterFlowBandwidthCache.WinterFlowVariableVersionControl);
                                } else if ((winterFlowTestingEntity.WinterFlowUnitTestResponse & 8) != 0 && (winterFlowTestingEntity instanceof WinterFlowTestingEntity)) {
                                    WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowTestingEntity.WinterFlowBatchUI;
                                    int i2 = 0;
                                    winterFlowTestingEntity = winterFlowTestingEntity;
                                    r6 = r6;
                                    while (winterFlowUserManagerController2 != null) {
                                        if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 8) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                winterFlowTestingEntity = winterFlowUserManagerController2;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                }
                                                if (winterFlowTestingEntity != 0) {
                                                    r6.WinterFlowHookDataSource(winterFlowTestingEntity);
                                                    winterFlowTestingEntity = 0;
                                                }
                                                r6.WinterFlowHookDataSource(winterFlowUserManagerController2);
                                            }
                                        }
                                        winterFlowUserManagerController2 = winterFlowUserManagerController2.WinterFlowResponseEngine;
                                        winterFlowTestingEntity = winterFlowTestingEntity;
                                        r6 = r6;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                winterFlowTestingEntity = WinterFlowCloudStack.WinterFlowPackageIDE(r6);
                            }
                        }
                    }
                }
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                WinterFlowPipelineVariable winterFlowPipelineVariable = WinterFlowUIMicroservice.WinterFlowQueueService;
                ((WinterFlowObjectSession) obj2).WinterFlowUnitTestResponse(winterFlowPipelineVariable);
                WinterFlowUIMicroservice winterFlowUIMicroservice2 = (WinterFlowUIMicroservice) obj;
                boolean WinterFlowThreadListener = WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowUIMicroservice2.WinterFlowSoftwareProtocol, winterFlowPipelineVariable.WinterFlowServiceUtility);
                boolean z = winterFlowUIMicroservice2.WinterFlowUserManagerUserManager;
                boolean z2 = winterFlowPipelineVariable.WinterFlowBandwidthObject;
                boolean z3 = z != z2;
                if (!WinterFlowThreadListener || z3) {
                    winterFlowUIMicroservice2.WinterFlowSoftwareProtocol = winterFlowPipelineVariable.WinterFlowServiceUtility;
                    winterFlowUIMicroservice2.WinterFlowUserManagerUserManager = z2;
                    if (winterFlowUIMicroservice2.WinterFlowSoftwareEngine && (z3 || (z2 && !WinterFlowThreadListener))) {
                        winterFlowUIMicroservice2.WinterFlowVariableBandwidth.WinterFlowConfigurationSubsystem();
                    }
                }
                winterFlowUIMicroservice2.WinterFlowSoftwareEngine = true;
                winterFlowPipelineVariable.WinterFlowBatchUI = winterFlowPipelineVariable.WinterFlowServiceUtility.WinterFlowRouterStructure(winterFlowPipelineVariable.WinterFlowOrchestrationSubsystem, winterFlowPipelineVariable.WinterFlowSingletonPlatform, winterFlowPipelineVariable.WinterFlowConcurrencyThread);
                return winterFlowAlgorithmSession;
            case 9:
                return new File(((Context) obj2).getApplicationContext().getFilesDir(), "datastore/".concat(((WinterFlowAlgorithmNode) obj).WinterFlowRouterStructure.concat(".preferences_pb")));
            default:
                SharedPreferences sharedPreferences = ((Context) obj2).getSharedPreferences((String) obj, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }
}
