package com.google.android.datatransport;

import androidx.activity.ComponentActivity;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.LogLevel;
import com.android.installreferrer.api.InstallReferrerClient;
import java.net.URI;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowGatewayWorker extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ int WinterFlowSyntax;
    public /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowGatewayWorker(WinterFlowNetworkSession winterFlowNetworkSession, int i, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = 7;
        this.WinterFlowTransactionAgent = winterFlowNetworkSession;
        this.WinterFlowResponseEngine = i;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = 2;
        switch (this.WinterFlowSyntax) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowGatewayWorker((WinterFlowConfigurationSubsystem) this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, 0);
            case 1:
                return new WinterFlowGatewayWorker((WinterFlowConfigurationNetwork) this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, 1);
            case 2:
                return new WinterFlowGatewayWorker((WinterFlowDeploymentMechanism) this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, i);
            case 3:
                return new WinterFlowGatewayWorker((WinterFlowCacheManagerAgent) this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, 3);
            case 4:
                return new WinterFlowGatewayWorker((WinterFlowObjectLayer) this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, 4);
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return new WinterFlowGatewayWorker((WinterFlowJavaOrchestration) this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, 5);
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return new WinterFlowGatewayWorker((WinterFlowAlgorithmArray) this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, 6);
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return new WinterFlowGatewayWorker((WinterFlowNetworkSession) this.WinterFlowTransactionAgent, this.WinterFlowResponseEngine, winterFlowTransactionManagerLayer);
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return new WinterFlowGatewayWorker((WinterFlowRouterOrchestration) this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, 8);
            case 9:
                WinterFlowGatewayWorker winterFlowGatewayWorker = new WinterFlowGatewayWorker(i, winterFlowTransactionManagerLayer);
                winterFlowGatewayWorker.WinterFlowTransactionAgent = obj;
                return winterFlowGatewayWorker;
            case 10:
                return new WinterFlowGatewayWorker((WinterFlowEventFramework) this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, 10);
            case 11:
                return new WinterFlowGatewayWorker((WinterFlowCacheManagerMicroservice) this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, 11);
            case 12:
                return new WinterFlowGatewayWorker((WinterFlowDatabaseEntity) this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, 12);
            default:
                return new WinterFlowGatewayWorker((WinterFlowGatewaySession) this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer, 13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x02c8, code lost:
    
        if (r2 != r7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f8, code lost:
    
        if (r0 == r7) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        int intValue;
        Object WinterFlowServerProtocol;
        WinterFlowAdapterResponse winterFlowAdapterResponse;
        Object WinterFlowVariableVersionControl;
        int i = this.WinterFlowSyntax;
        int i2 = 23;
        int i3 = 2;
        int i4 = 0;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        int i5 = 1;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i6 = this.WinterFlowResponseEngine;
                if (i6 != 0) {
                    if (i6 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return winterFlowAlgorithmSession;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowConfigurationSubsystem winterFlowConfigurationSubsystem = (WinterFlowConfigurationSubsystem) this.WinterFlowTransactionAgent;
                WinterFlowManagerConsumer winterFlowManagerConsumer = winterFlowConfigurationSubsystem.WinterFlowHookDataSource.WinterFlowHookDataSource;
                WinterFlowEventDecorator winterFlowEventDecorator = new WinterFlowEventDecorator(winterFlowConfigurationSubsystem, winterFlowTransactionManagerLayer, i4);
                this.WinterFlowResponseEngine = 1;
                return WinterFlowSoftwareException.WinterFlowMapperProtocol(winterFlowManagerConsumer, winterFlowEventDecorator, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
            case 1:
                int i7 = this.WinterFlowResponseEngine;
                if (i7 != 0) {
                    if (i7 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return winterFlowAlgorithmSession;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowTransactionInterface winterFlowTransactionInterface = new WinterFlowTransactionInterface();
                WinterFlowTransactionInterface winterFlowTransactionInterface2 = new WinterFlowTransactionInterface();
                WinterFlowTransactionInterface winterFlowTransactionInterface3 = new WinterFlowTransactionInterface();
                WinterFlowConfigurationNetwork winterFlowConfigurationNetwork = (WinterFlowConfigurationNetwork) this.WinterFlowTransactionAgent;
                WinterFlowCacheManagerNode winterFlowCacheManagerNode = (WinterFlowCacheManagerNode) winterFlowConfigurationNetwork.WinterFlowVariableBandwidth.WinterFlowTransactionManagerStrategy;
                WinterFlowValidatorParser winterFlowValidatorParser = new WinterFlowValidatorParser(winterFlowTransactionInterface, winterFlowTransactionInterface2, winterFlowTransactionInterface3, winterFlowConfigurationNetwork, 1);
                this.WinterFlowResponseEngine = 1;
                WinterFlowCacheManagerNode.WinterFlowTransactionAgent(winterFlowCacheManagerNode, winterFlowValidatorParser, this);
                return winterFlowListenerJava;
            case 2:
                int i8 = this.WinterFlowResponseEngine;
                if (i8 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowDeploymentMechanism winterFlowDeploymentMechanism = (WinterFlowDeploymentMechanism) this.WinterFlowTransactionAgent;
                    this.WinterFlowResponseEngine = 1;
                    return WinterFlowHandlerWebsocket.WinterFlowTransactionAgent(winterFlowDeploymentMechanism, null, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i8 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i9 = this.WinterFlowResponseEngine;
                if (i9 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowCacheManagerAgent winterFlowCacheManagerAgent = (WinterFlowCacheManagerAgent) this.WinterFlowTransactionAgent;
                    this.WinterFlowResponseEngine = 1;
                    return winterFlowCacheManagerAgent.WinterFlowRouterStructure(this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i9 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                WinterFlowObjectLayer winterFlowObjectLayer = (WinterFlowObjectLayer) this.WinterFlowTransactionAgent;
                int i10 = this.WinterFlowResponseEngine;
                if (i10 != 0) {
                    if (i10 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowHandlerPlatform winterFlowHandlerPlatform = winterFlowObjectLayer.WinterFlowServiceUtility;
                    winterFlowHandlerPlatform.WinterFlowTransactionAgent(null, new Integer(((Number) winterFlowHandlerPlatform.getValue()).intValue() - 1));
                    WinterFlowHandlerPlatform winterFlowHandlerPlatform2 = winterFlowObjectLayer.WinterFlowServiceUtility;
                    WinterFlowHandlerPlatform winterFlowHandlerPlatform3 = winterFlowObjectLayer.WinterFlowRouterRouter;
                    intValue = ((Number) winterFlowHandlerPlatform2.getValue()).intValue();
                    WinterFlowOrchestrationNetwork winterFlowOrchestrationNetwork = WinterFlowOrchestrationNetwork.WinterFlowVariableVersionControl;
                    if (intValue > 0 || winterFlowHandlerPlatform3.getValue() != winterFlowOrchestrationNetwork) {
                        if (((Number) winterFlowObjectLayer.WinterFlowServiceUtility.getValue()).intValue() <= 0 && winterFlowHandlerPlatform3.getValue() == winterFlowOrchestrationNetwork) {
                            winterFlowObjectLayer.WinterFlowVariableVersionControl(false);
                            return winterFlowAlgorithmSession;
                        }
                    }
                    WinterFlowAlgorithmDebug winterFlowAlgorithmDebug = WinterFlowAlgorithmProtocol.WinterFlowVariableVersionControl;
                    long WinterFlowModuleAgent = WinterFlowSoftwareException.WinterFlowModuleAgent(1000, WinterFlowCacheManagerSystem.MILLISECONDS);
                    this.WinterFlowResponseEngine = 1;
                    Object WinterFlowSerializerStructure = WinterFlowManagerRequest.WinterFlowSerializerStructure(WinterFlowManagerRequest.WinterFlowUIMiddleware(WinterFlowModuleAgent), this);
                    if (WinterFlowSerializerStructure != winterFlowListenerJava) {
                    }
                    if (winterFlowAlgorithmSession == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                    WinterFlowHandlerPlatform winterFlowHandlerPlatform4 = winterFlowObjectLayer.WinterFlowServiceUtility;
                    winterFlowHandlerPlatform4.WinterFlowTransactionAgent(null, new Integer(((Number) winterFlowHandlerPlatform4.getValue()).intValue() - 1));
                    WinterFlowHandlerPlatform winterFlowHandlerPlatform22 = winterFlowObjectLayer.WinterFlowServiceUtility;
                    WinterFlowHandlerPlatform winterFlowHandlerPlatform32 = winterFlowObjectLayer.WinterFlowRouterRouter;
                    intValue = ((Number) winterFlowHandlerPlatform22.getValue()).intValue();
                    WinterFlowOrchestrationNetwork winterFlowOrchestrationNetwork2 = WinterFlowOrchestrationNetwork.WinterFlowVariableVersionControl;
                    if (intValue > 0) {
                    }
                    return ((Number) winterFlowObjectLayer.WinterFlowServiceUtility.getValue()).intValue() <= 0 ? winterFlowAlgorithmSession : winterFlowAlgorithmSession;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowHandlerPlatform winterFlowHandlerPlatform222 = winterFlowObjectLayer.WinterFlowServiceUtility;
                WinterFlowHandlerPlatform winterFlowHandlerPlatform322 = winterFlowObjectLayer.WinterFlowRouterRouter;
                intValue = ((Number) winterFlowHandlerPlatform222.getValue()).intValue();
                WinterFlowOrchestrationNetwork winterFlowOrchestrationNetwork22 = WinterFlowOrchestrationNetwork.WinterFlowVariableVersionControl;
                if (intValue > 0) {
                }
                if (((Number) winterFlowObjectLayer.WinterFlowServiceUtility.getValue()).intValue() <= 0) {
                }
                break;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                int i11 = this.WinterFlowResponseEngine;
                if (i11 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowEventProvider WinterFlowVariableVersionControl2 = ((WinterFlowUserManager) ((WinterFlowJavaOrchestration) this.WinterFlowTransactionAgent).WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl();
                    this.WinterFlowResponseEngine = 1;
                    WinterFlowServerProtocol = WinterFlowQuerySyntax.WinterFlowServerProtocol(WinterFlowVariableVersionControl2, this);
                    if (WinterFlowServerProtocol == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i11 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowServerProtocol = obj;
                }
                WinterFlowDataSourceSerializer winterFlowDataSourceSerializer = (WinterFlowDataSourceSerializer) WinterFlowServerProtocol;
                return winterFlowDataSourceSerializer != null ? winterFlowDataSourceSerializer.WinterFlowRouterStructure() : WinterFlowFrontendNode.WinterFlowVariableVersionControl;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                int i12 = this.WinterFlowResponseEngine;
                if (i12 != 0) {
                    if (i12 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return winterFlowAlgorithmSession;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowFunctionSubsystem winterFlowFunctionSubsystem = (WinterFlowFunctionSubsystem) ((WinterFlowAlgorithmArray) this.WinterFlowTransactionAgent).WinterFlowUnitTestResponse;
                Float f = new Float(0.0f);
                WinterFlowSerializerProcess WinterFlowQueueService = WinterFlowUnitTestLibrary.WinterFlowQueueService(1, new Float(0.5f));
                this.WinterFlowResponseEngine = 1;
                return WinterFlowDecoratorUI.WinterFlowVariableVersionControl(winterFlowFunctionSubsystem, f, WinterFlowQueueService, new WinterFlowSessionManagerAgent(i2), this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowNetworkSession winterFlowNetworkSession = (WinterFlowNetworkSession) this.WinterFlowTransactionAgent;
                int i13 = this.WinterFlowResponseEngine;
                WinterFlowRepositoryFramework winterFlowRepositoryFramework = winterFlowNetworkSession.WinterFlowVariableVersionControl;
                if (((WinterFlowVersionControlModule) winterFlowRepositoryFramework.WinterFlowHookDataSource).WinterFlowRouterRouter() != i13 || ((WinterFlowVersionControlModule) winterFlowRepositoryFramework.WinterFlowCacheManagerAgent).WinterFlowRouterRouter() != 0) {
                    WinterFlowJSONProxy winterFlowJSONProxy = winterFlowNetworkSession.WinterFlowServiceUtility;
                    winterFlowJSONProxy.WinterFlowArrayNetwork();
                    winterFlowJSONProxy.WinterFlowHookDataSource = null;
                }
                winterFlowRepositoryFramework.WinterFlowHookDataSource(i13, 0);
                winterFlowRepositoryFramework.WinterFlowArrayNetwork = null;
                WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowNetworkSession.WinterFlowTransactionAgent;
                if (winterFlowSchedulerStructure != null) {
                    winterFlowSchedulerStructure.WinterFlowTransactionAgent();
                }
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                int i14 = this.WinterFlowResponseEngine;
                if (i14 != 0) {
                    if (i14 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return obj;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = ((WinterFlowRouterOrchestration) this.WinterFlowTransactionAgent).WinterFlowUnitTestResponse;
                this.WinterFlowResponseEngine = 1;
                Object WinterFlowOrchestrationSubsystem = WinterFlowEncryptionSubsystem.WinterFlowOrchestrationSubsystem(new WinterFlowModuleStack(winterFlowWorkerThreadPool, winterFlowTransactionManagerLayer, 20), this);
                return WinterFlowOrchestrationSubsystem == winterFlowListenerJava ? winterFlowListenerJava : WinterFlowOrchestrationSubsystem;
            case 9:
                int i15 = this.WinterFlowResponseEngine;
                if (i15 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowTransactionAgent;
                } else {
                    if (i15 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowTransactionAgent;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                while (WinterFlowInvokerComponent.WinterFlowSoftwareProtocol(winterFlowAdapterResponse.WinterFlowRouterRouter())) {
                    WinterFlowSessionJava winterFlowSessionJava = new WinterFlowSessionJava(5);
                    this.WinterFlowTransactionAgent = winterFlowAdapterResponse;
                    this.WinterFlowResponseEngine = 1;
                    WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = this.WinterFlowTransactionManagerStrategy;
                    winterFlowEncryptionMicroservice.getClass();
                    if (WinterFlowManagerRequest.WinterFlowCompilerVariable(winterFlowEncryptionMicroservice).WinterFlowRouterStructure(winterFlowSessionJava, this) == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                }
                return winterFlowAlgorithmSession;
            case 10:
                WinterFlowEventFramework winterFlowEventFramework = (WinterFlowEventFramework) this.WinterFlowTransactionAgent;
                int i16 = this.WinterFlowResponseEngine;
                if (i16 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowRequestHandler winterFlowRequestHandler = winterFlowEventFramework.WinterFlowHookDataSource;
                    ComponentActivity componentActivity = winterFlowEventFramework.WinterFlowRouterStructure;
                    WinterFlowRendererNode winterFlowRendererNode = winterFlowEventFramework.WinterFlowTransactionManagerStrategy;
                    if (((CharSequence) winterFlowRequestHandler.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.getValue()).length() == 0) {
                        ((AdjustConfig) winterFlowRendererNode.getValue()).setLogLevel(LogLevel.VERBOSE);
                        Adjust.initSdk((AdjustConfig) winterFlowRendererNode.getValue());
                        WinterFlowObjectPackage winterFlowObjectPackage = new WinterFlowObjectPackage(16);
                        winterFlowObjectPackage.WinterFlowHookDataSource(new WinterFlowDatabaseScheduler(componentActivity, i4));
                        winterFlowObjectPackage.WinterFlowHookDataSource(new WinterFlowDatabaseScheduler(componentActivity, i5));
                        winterFlowObjectPackage.WinterFlowHookDataSource(new WinterFlowCompilerInterface(i3));
                        winterFlowObjectPackage.WinterFlowHookDataSource(new WinterFlowCompilerInterface(i5));
                        winterFlowObjectPackage.WinterFlowHookDataSource(new WinterFlowCompilerInterface(i4));
                        String str = winterFlowEventFramework.WinterFlowVariableVersionControl;
                        this.WinterFlowResponseEngine = 1;
                        WinterFlowVariableVersionControl = winterFlowObjectPackage.WinterFlowVariableVersionControl(str, this);
                        break;
                    } else {
                        WinterFlowRequestHandler winterFlowRequestHandler2 = winterFlowEventFramework.WinterFlowHookDataSource;
                        this.WinterFlowResponseEngine = 2;
                        if (winterFlowRequestHandler2.WinterFlowVariableVersionControl.WinterFlowRouterRouter(WinterFlowSerializerLibrary.WinterFlowVariableVersionControl, this) != winterFlowListenerJava) {
                            return winterFlowAlgorithmSession;
                        }
                    }
                    return winterFlowListenerJava;
                }
                if (i16 != 1) {
                    if (i16 == 2) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return winterFlowAlgorithmSession;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowVariableVersionControl = obj;
                String str2 = (String) WinterFlowVariableVersionControl;
                WinterFlowPackageResponse winterFlowPackageResponse = (WinterFlowPackageResponse) winterFlowEventFramework.WinterFlowUnitTestResponse.getValue();
                URI uri = new URI(winterFlowEventFramework.WinterFlowArrayNetwork);
                winterFlowPackageResponse.getClass();
                winterFlowPackageResponse.WinterFlowRouterStructure = uri;
                str2.getClass();
                winterFlowPackageResponse.WinterFlowHookDataSource = str2;
                WinterFlowCompilerCloud winterFlowCompilerCloud = new WinterFlowCompilerCloud(i2, winterFlowEventFramework);
                URI uri2 = winterFlowPackageResponse.WinterFlowRouterStructure;
                if (uri2 == null) {
                    WinterFlowManagerRequest.WinterFlowCloudMicroservice("uri");
                    throw null;
                }
                WinterFlowObjectManager winterFlowObjectManager = new WinterFlowObjectManager(winterFlowPackageResponse, winterFlowCompilerCloud, uri2);
                winterFlowPackageResponse.WinterFlowCacheManagerAgent = winterFlowObjectManager;
                if (winterFlowObjectManager.WinterFlowConcurrencyThread != null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("WebSocketClient objects are not reuseable");
                    return null;
                }
                Thread thread = new Thread(winterFlowObjectManager);
                winterFlowObjectManager.WinterFlowConcurrencyThread = thread;
                thread.setDaemon(false);
                winterFlowObjectManager.WinterFlowConcurrencyThread.setName("WebSocketConnectReadThread-" + winterFlowObjectManager.WinterFlowConcurrencyThread.getId());
                winterFlowObjectManager.WinterFlowConcurrencyThread.start();
                return winterFlowAlgorithmSession;
            case 11:
                int i17 = this.WinterFlowResponseEngine;
                if (i17 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice = (WinterFlowCacheManagerMicroservice) this.WinterFlowTransactionAgent;
                    this.WinterFlowResponseEngine = 1;
                    return winterFlowCacheManagerMicroservice.WinterFlowConfigurationSubsystem(this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i17 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                WinterFlowDatabaseEntity winterFlowDatabaseEntity = (WinterFlowDatabaseEntity) this.WinterFlowTransactionAgent;
                int i18 = this.WinterFlowResponseEngine;
                if (i18 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    PointerInputEventHandler pointerInputEventHandler = winterFlowDatabaseEntity.WinterFlowRouterAdapter;
                    this.WinterFlowResponseEngine = 2;
                    return pointerInputEventHandler.invoke(winterFlowDatabaseEntity, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i18 == 1 || i18 == 2) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i19 = this.WinterFlowResponseEngine;
                if (i19 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowGatewaySession winterFlowGatewaySession = (WinterFlowGatewaySession) this.WinterFlowTransactionAgent;
                    this.WinterFlowResponseEngine = 1;
                    return winterFlowGatewaySession.WinterFlowVariableVersionControl(this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i19 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 1:
                return ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 2:
                return ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 3:
                return ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 4:
                return ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowServiceProviderStructure) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 9:
                return ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 10:
                return ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 11:
                return ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 12:
                return ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return ((WinterFlowGatewayWorker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowGatewayWorker(int i, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(i, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowGatewayWorker(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = obj;
    }
}
