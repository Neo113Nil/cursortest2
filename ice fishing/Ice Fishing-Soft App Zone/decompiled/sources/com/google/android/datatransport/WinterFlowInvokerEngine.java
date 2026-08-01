package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowInvokerEngine implements WinterFlowEventEvent {
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowInvokerEngine(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        WinterFlowQueueHelper winterFlowQueueHelper;
        Object WinterFlowRouterStructure;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Integer.valueOf(((WinterFlowPackageTool) obj2).WinterFlowRouterStructure);
            case 1:
                return Integer.valueOf(((WinterFlowManagerResponse) obj2).WinterFlowRouterStructure);
            case 2:
                WinterFlowOrchestrationPlatform winterFlowOrchestrationPlatform = (WinterFlowOrchestrationPlatform) obj2;
                return winterFlowOrchestrationPlatform != null ? WinterFlowOrchestrationPlatform.WinterFlowRouterStructure(winterFlowOrchestrationPlatform.WinterFlowRouterStructure, WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent) : false ? Boolean.FALSE : WinterFlowUnitTestLibrary.WinterFlowRouterRouter(Float.valueOf(WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent(winterFlowOrchestrationPlatform.WinterFlowRouterStructure)), WinterFlowLoaderHelper.WinterFlowRouterStructure(new WinterFlowInheritanceValidator(WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(winterFlowOrchestrationPlatform.WinterFlowRouterStructure)), WinterFlowLoaderHelper.WinterFlowMapperProtocol, (WinterFlowWebsocketPipeline) obj));
            case 3:
                WinterFlowObjectTool winterFlowObjectTool = (WinterFlowObjectTool) obj2;
                return WinterFlowUnitTestLibrary.WinterFlowRouterRouter(winterFlowObjectTool.WinterFlowRouterStructure, WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowObjectTool.WinterFlowHookDataSource, WinterFlowLoaderHelper.WinterFlowSyntax, (WinterFlowWebsocketPipeline) obj));
            case 4:
                long j = ((WinterFlowInheritanceValidator) obj2).WinterFlowRouterStructure;
                if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(j, 8589934592L)) {
                    return 0;
                }
                if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj2;
                return winterFlowHandlerResolver != null ? WinterFlowHandlerResolver.WinterFlowHookDataSource(winterFlowHandlerResolver.WinterFlowRouterStructure, 9205357640488583168L) : false ? Boolean.FALSE : WinterFlowUnitTestLibrary.WinterFlowRouterRouter(Float.valueOf(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32))), Float.valueOf(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure & 4294967295L))));
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowWebsocketPipeline winterFlowWebsocketPipeline = (WinterFlowWebsocketPipeline) obj;
                WinterFlowVariableTransaction winterFlowVariableTransaction = (WinterFlowVariableTransaction) obj2;
                Object obj3 = winterFlowVariableTransaction.WinterFlowRouterStructure;
                if (obj3 instanceof WinterFlowFrameworkArray) {
                    winterFlowQueueHelper = WinterFlowQueueHelper.WinterFlowVariableVersionControl;
                } else if (obj3 instanceof WinterFlowDebugUtility) {
                    winterFlowQueueHelper = WinterFlowQueueHelper.WinterFlowTransactionManagerStrategy;
                } else if (obj3 instanceof WinterFlowNetworkSystem) {
                    winterFlowQueueHelper = WinterFlowQueueHelper.WinterFlowUnitTestResponse;
                } else if (obj3 instanceof WinterFlowCloudInterface) {
                    winterFlowQueueHelper = WinterFlowQueueHelper.WinterFlowRouterRouter;
                } else if (obj3 instanceof WinterFlowEventModule) {
                    winterFlowQueueHelper = WinterFlowQueueHelper.WinterFlowSyntax;
                } else if (obj3 instanceof WinterFlowObjectTool) {
                    winterFlowQueueHelper = WinterFlowQueueHelper.WinterFlowResponseEngine;
                } else {
                    if (!(obj3 instanceof WinterFlowEventEmitterEngine)) {
                        throw new UnsupportedOperationException();
                    }
                    winterFlowQueueHelper = WinterFlowQueueHelper.WinterFlowTransactionAgent;
                }
                switch (winterFlowQueueHelper.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        obj3.getClass();
                        WinterFlowRouterStructure = WinterFlowLoaderHelper.WinterFlowRouterStructure((WinterFlowFrameworkArray) obj3, WinterFlowLoaderHelper.WinterFlowUnitTestResponse, winterFlowWebsocketPipeline);
                        break;
                    case 1:
                        obj3.getClass();
                        WinterFlowRouterStructure = WinterFlowLoaderHelper.WinterFlowRouterStructure((WinterFlowDebugUtility) obj3, WinterFlowLoaderHelper.WinterFlowRouterRouter, winterFlowWebsocketPipeline);
                        break;
                    case 2:
                        obj3.getClass();
                        WinterFlowRouterStructure = WinterFlowLoaderHelper.WinterFlowRouterStructure((WinterFlowNetworkSystem) obj3, WinterFlowLoaderHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketPipeline);
                        break;
                    case 3:
                        obj3.getClass();
                        WinterFlowRouterStructure = WinterFlowLoaderHelper.WinterFlowRouterStructure((WinterFlowCloudInterface) obj3, WinterFlowLoaderHelper.WinterFlowArrayNetwork, winterFlowWebsocketPipeline);
                        break;
                    case 4:
                        obj3.getClass();
                        WinterFlowRouterStructure = WinterFlowLoaderHelper.WinterFlowRouterStructure((WinterFlowEventModule) obj3, WinterFlowLoaderHelper.WinterFlowVariableVersionControl, winterFlowWebsocketPipeline);
                        break;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        obj3.getClass();
                        WinterFlowRouterStructure = WinterFlowLoaderHelper.WinterFlowRouterStructure((WinterFlowObjectTool) obj3, WinterFlowLoaderHelper.WinterFlowTransactionManagerStrategy, winterFlowWebsocketPipeline);
                        break;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj3.getClass();
                        WinterFlowRouterStructure = ((WinterFlowEventEmitterEngine) obj3).WinterFlowRouterStructure;
                        break;
                    default:
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        return null;
                }
                return WinterFlowUnitTestLibrary.WinterFlowRouterRouter(winterFlowQueueHelper, WinterFlowRouterStructure, Integer.valueOf(winterFlowVariableTransaction.WinterFlowHookDataSource), Integer.valueOf(winterFlowVariableTransaction.WinterFlowCacheManagerAgent), winterFlowVariableTransaction.WinterFlowArrayNetwork);
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowWebsocketPipeline winterFlowWebsocketPipeline2 = (WinterFlowWebsocketPipeline) obj;
                List list = ((WinterFlowRuntimeException) obj2).WinterFlowVariableVersionControl;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(WinterFlowLoaderHelper.WinterFlowRouterStructure((WinterFlowGatewayEngine) list.get(i), WinterFlowLoaderHelper.WinterFlowBackendCacheManager, winterFlowWebsocketPipeline2));
                }
                return arrayList;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return ((WinterFlowGatewayEngine) obj2).WinterFlowRouterStructure.toLanguageTag();
            case 9:
                WinterFlowWebsocketPipeline winterFlowWebsocketPipeline3 = (WinterFlowWebsocketPipeline) obj;
                WinterFlowResponseStructure winterFlowResponseStructure = (WinterFlowResponseStructure) obj2;
                return WinterFlowUnitTestLibrary.WinterFlowRouterRouter(WinterFlowLoaderHelper.WinterFlowRouterStructure(new WinterFlowSerializerAPI(winterFlowResponseStructure.WinterFlowRouterStructure), WinterFlowLoaderHelper.WinterFlowArrayHelper, winterFlowWebsocketPipeline3), WinterFlowLoaderHelper.WinterFlowRouterStructure(new WinterFlowRuntimeJSON(winterFlowResponseStructure.WinterFlowHookDataSource), WinterFlowLoaderHelper.WinterFlowCompilerVariable, winterFlowWebsocketPipeline3), WinterFlowLoaderHelper.WinterFlowRouterStructure(new WinterFlowUserManagerProcess(winterFlowResponseStructure.WinterFlowCacheManagerAgent), WinterFlowLoaderHelper.WinterFlowConfigurationSubsystem, winterFlowWebsocketPipeline3));
            case 10:
                return Float.valueOf(((WinterFlowSerializerAPI) obj2).WinterFlowRouterStructure);
            case 11:
                return Integer.valueOf(((WinterFlowRuntimeJSON) obj2).WinterFlowRouterStructure);
            case 12:
                return Integer.valueOf(((WinterFlowUserManagerProcess) obj2).WinterFlowRouterStructure);
            case 13:
                return ((WinterFlowNetworkSystem) obj2).WinterFlowRouterStructure;
            case 14:
                WinterFlowWebsocketPipeline winterFlowWebsocketPipeline4 = (WinterFlowWebsocketPipeline) obj;
                WinterFlowFrameworkArray winterFlowFrameworkArray = (WinterFlowFrameworkArray) obj2;
                Object WinterFlowRouterStructure2 = WinterFlowLoaderHelper.WinterFlowRouterStructure(new WinterFlowThreadPoolEventEmitter(winterFlowFrameworkArray.WinterFlowRouterStructure), WinterFlowLoaderHelper.WinterFlowConcurrencyThread, winterFlowWebsocketPipeline4);
                Object WinterFlowRouterStructure3 = WinterFlowLoaderHelper.WinterFlowRouterStructure(new WinterFlowRepositorySingleton(winterFlowFrameworkArray.WinterFlowHookDataSource), WinterFlowLoaderHelper.WinterFlowSingletonPlatform, winterFlowWebsocketPipeline4);
                Object WinterFlowRouterStructure4 = WinterFlowLoaderHelper.WinterFlowRouterStructure(new WinterFlowOrchestrationPlatform(winterFlowFrameworkArray.WinterFlowCacheManagerAgent), WinterFlowLoaderHelper.WinterFlowSerializerStructure, winterFlowWebsocketPipeline4);
                WinterFlowHandlerComponent winterFlowHandlerComponent = winterFlowFrameworkArray.WinterFlowArrayNetwork;
                WinterFlowHandlerComponent winterFlowHandlerComponent2 = WinterFlowHandlerComponent.WinterFlowCacheManagerAgent;
                Object WinterFlowRouterStructure5 = WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowHandlerComponent, WinterFlowLoaderHelper.WinterFlowServerProtocol, winterFlowWebsocketPipeline4);
                Object WinterFlowRouterStructure6 = WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowFrameworkArray.WinterFlowVariableVersionControl, WinterFlowUnitTestLibrary.WinterFlowSyntax, winterFlowWebsocketPipeline4);
                WinterFlowResponseStructure winterFlowResponseStructure2 = winterFlowFrameworkArray.WinterFlowTransactionManagerStrategy;
                WinterFlowResponseStructure winterFlowResponseStructure3 = WinterFlowResponseStructure.WinterFlowArrayNetwork;
                return WinterFlowUnitTestLibrary.WinterFlowRouterRouter(WinterFlowRouterStructure2, WinterFlowRouterStructure3, WinterFlowRouterStructure4, WinterFlowRouterStructure5, WinterFlowRouterStructure6, WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowResponseStructure2, WinterFlowLoaderHelper.WinterFlowEventEmitterController, winterFlowWebsocketPipeline4), WinterFlowLoaderHelper.WinterFlowRouterStructure(new WinterFlowDecoratorProtocol(winterFlowFrameworkArray.WinterFlowUnitTestResponse), WinterFlowUnitTestLibrary.WinterFlowTransactionAgent, winterFlowWebsocketPipeline4), WinterFlowLoaderHelper.WinterFlowRouterStructure(new WinterFlowDecoratorDatabaseSchema(winterFlowFrameworkArray.WinterFlowRouterRouter), WinterFlowLoaderHelper.WinterFlowVariableBandwidth, winterFlowWebsocketPipeline4), WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowFrameworkArray.WinterFlowSyntax, WinterFlowUnitTestLibrary.WinterFlowServerProtocol, winterFlowWebsocketPipeline4));
            case 15:
                return ((WinterFlowCloudInterface) obj2).WinterFlowRouterStructure;
            case 16:
                WinterFlowWebsocketPipeline winterFlowWebsocketPipeline5 = (WinterFlowWebsocketPipeline) obj;
                WinterFlowDebugUtility winterFlowDebugUtility = (WinterFlowDebugUtility) obj2;
                WinterFlowInheritanceSubsystem winterFlowInheritanceSubsystem = new WinterFlowInheritanceSubsystem(winterFlowDebugUtility.WinterFlowRouterStructure.WinterFlowArrayNetwork());
                WinterFlowXMLWebsocket winterFlowXMLWebsocket = WinterFlowLoaderHelper.WinterFlowOrchestrationSubsystem;
                Object WinterFlowRouterStructure7 = WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowInheritanceSubsystem, winterFlowXMLWebsocket, winterFlowWebsocketPipeline5);
                WinterFlowOrchestrationPlatform winterFlowOrchestrationPlatform2 = new WinterFlowOrchestrationPlatform(winterFlowDebugUtility.WinterFlowHookDataSource);
                WinterFlowXMLWebsocket winterFlowXMLWebsocket2 = WinterFlowLoaderHelper.WinterFlowSerializerStructure;
                Object WinterFlowRouterStructure8 = WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowOrchestrationPlatform2, winterFlowXMLWebsocket2, winterFlowWebsocketPipeline5);
                WinterFlowObjectHook winterFlowObjectHook = winterFlowDebugUtility.WinterFlowCacheManagerAgent;
                WinterFlowObjectHook winterFlowObjectHook2 = WinterFlowObjectHook.WinterFlowTransactionManagerStrategy;
                Object WinterFlowRouterStructure9 = WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowObjectHook, WinterFlowLoaderHelper.WinterFlowThreadListener, winterFlowWebsocketPipeline5);
                Object WinterFlowRouterStructure10 = WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowDebugUtility.WinterFlowArrayNetwork, WinterFlowLoaderHelper.WinterFlowBatchUI, winterFlowWebsocketPipeline5);
                Object WinterFlowRouterStructure11 = WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowDebugUtility.WinterFlowVariableVersionControl, WinterFlowLoaderHelper.WinterFlowRouterAdapter, winterFlowWebsocketPipeline5);
                String str = winterFlowDebugUtility.WinterFlowUnitTestResponse;
                Object WinterFlowRouterStructure12 = WinterFlowLoaderHelper.WinterFlowRouterStructure(new WinterFlowOrchestrationPlatform(winterFlowDebugUtility.WinterFlowRouterRouter), winterFlowXMLWebsocket2, winterFlowWebsocketPipeline5);
                Object WinterFlowRouterStructure13 = WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowDebugUtility.WinterFlowSyntax, WinterFlowLoaderHelper.WinterFlowServiceUtility, winterFlowWebsocketPipeline5);
                Object WinterFlowRouterStructure14 = WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowDebugUtility.WinterFlowResponseEngine, WinterFlowLoaderHelper.WinterFlowTransactionAgent, winterFlowWebsocketPipeline5);
                WinterFlowRuntimeException winterFlowRuntimeException = winterFlowDebugUtility.WinterFlowTransactionAgent;
                WinterFlowRuntimeException winterFlowRuntimeException2 = WinterFlowRuntimeException.WinterFlowUnitTestResponse;
                Object WinterFlowRouterStructure15 = WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowRuntimeException, WinterFlowLoaderHelper.WinterFlowConsumerUserManager, winterFlowWebsocketPipeline5);
                Object WinterFlowRouterStructure16 = WinterFlowLoaderHelper.WinterFlowRouterStructure(new WinterFlowInheritanceSubsystem(winterFlowDebugUtility.WinterFlowServerProtocol), winterFlowXMLWebsocket, winterFlowWebsocketPipeline5);
                Object WinterFlowRouterStructure17 = WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowDebugUtility.WinterFlowThreadListener, WinterFlowLoaderHelper.WinterFlowResponseEngine, winterFlowWebsocketPipeline5);
                WinterFlowMicroserviceScheduler winterFlowMicroserviceScheduler = winterFlowDebugUtility.WinterFlowServiceUtility;
                WinterFlowMicroserviceScheduler winterFlowMicroserviceScheduler2 = WinterFlowMicroserviceScheduler.WinterFlowArrayNetwork;
                return WinterFlowUnitTestLibrary.WinterFlowRouterRouter(WinterFlowRouterStructure7, WinterFlowRouterStructure8, WinterFlowRouterStructure9, WinterFlowRouterStructure10, WinterFlowRouterStructure11, -1, str, WinterFlowRouterStructure12, WinterFlowRouterStructure13, WinterFlowRouterStructure14, WinterFlowRouterStructure15, WinterFlowRouterStructure16, WinterFlowRouterStructure17, WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowMicroserviceScheduler, WinterFlowLoaderHelper.WinterFlowBandwidthObject, winterFlowWebsocketPipeline5));
            case 17:
                WinterFlowWebsocketPipeline winterFlowWebsocketPipeline6 = (WinterFlowWebsocketPipeline) obj;
                WinterFlowObjectEntity winterFlowObjectEntity = (WinterFlowObjectEntity) obj2;
                WinterFlowDebugUtility winterFlowDebugUtility2 = winterFlowObjectEntity.WinterFlowRouterStructure;
                WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = WinterFlowLoaderHelper.WinterFlowRouterRouter;
                return WinterFlowUnitTestLibrary.WinterFlowRouterRouter(WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowDebugUtility2, winterFlowCacheManagerVersionControl, winterFlowWebsocketPipeline6), WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowObjectEntity.WinterFlowHookDataSource, winterFlowCacheManagerVersionControl, winterFlowWebsocketPipeline6), WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowObjectEntity.WinterFlowCacheManagerAgent, winterFlowCacheManagerVersionControl, winterFlowWebsocketPipeline6), WinterFlowLoaderHelper.WinterFlowRouterStructure(winterFlowObjectEntity.WinterFlowArrayNetwork, winterFlowCacheManagerVersionControl, winterFlowWebsocketPipeline6));
            case 18:
                WinterFlowObjectBackend winterFlowObjectBackend = (WinterFlowObjectBackend) obj2;
                Boolean valueOf = Boolean.valueOf(winterFlowObjectBackend.WinterFlowRouterStructure);
                WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl2 = WinterFlowLoaderHelper.WinterFlowRouterStructure;
                return WinterFlowUnitTestLibrary.WinterFlowRouterRouter(valueOf, WinterFlowLoaderHelper.WinterFlowRouterStructure(new WinterFlowProcessorProcessor(winterFlowObjectBackend.WinterFlowHookDataSource), WinterFlowUnitTestLibrary.WinterFlowResponseEngine, (WinterFlowWebsocketPipeline) obj));
            case 19:
                return Integer.valueOf(((WinterFlowProcessorProcessor) obj2).WinterFlowRouterStructure);
            case 20:
                return Integer.valueOf(((WinterFlowDecoratorProtocol) obj2).WinterFlowRouterStructure);
            case 21:
                WinterFlowPipelineLibrary winterFlowPipelineLibrary = (WinterFlowPipelineLibrary) obj2;
                return WinterFlowUnitTestLibrary.WinterFlowRouterRouter(WinterFlowLoaderHelper.WinterFlowRouterStructure(new WinterFlowBandwidthStrategy(winterFlowPipelineLibrary.WinterFlowRouterStructure), WinterFlowUnitTestLibrary.WinterFlowThreadListener, (WinterFlowWebsocketPipeline) obj), Boolean.valueOf(winterFlowPipelineLibrary.WinterFlowHookDataSource));
            case 22:
                return Integer.valueOf(((WinterFlowBandwidthStrategy) obj2).WinterFlowRouterStructure);
            case 23:
                return Integer.valueOf(((WinterFlowStackQuery) obj2).WinterFlowRouterStructure.WinterFlowRouterRouter());
            case 24:
                WinterFlowStrategyPackage winterFlowStrategyPackage = (WinterFlowStrategyPackage) obj2;
                if (!(winterFlowStrategyPackage instanceof WinterFlowConsumerModule)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? winterFlowStrategyPackage : Integer.valueOf(intValue + 1);
            case 25:
                WinterFlowConsumerModule winterFlowConsumerModule = (WinterFlowConsumerModule) obj;
                WinterFlowStrategyPackage winterFlowStrategyPackage2 = (WinterFlowStrategyPackage) obj2;
                if (winterFlowConsumerModule != null) {
                    return winterFlowConsumerModule;
                }
                if (winterFlowStrategyPackage2 instanceof WinterFlowConsumerModule) {
                    return (WinterFlowConsumerModule) winterFlowStrategyPackage2;
                }
                return null;
            default:
                WinterFlowGatewayInterface winterFlowGatewayInterface = (WinterFlowGatewayInterface) obj;
                WinterFlowStrategyPackage winterFlowStrategyPackage3 = (WinterFlowStrategyPackage) obj2;
                if (winterFlowStrategyPackage3 instanceof WinterFlowConsumerModule) {
                    WinterFlowConsumerModule winterFlowConsumerModule2 = (WinterFlowConsumerModule) winterFlowStrategyPackage3;
                    WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = winterFlowGatewayInterface.WinterFlowRouterStructure;
                    Object WinterFlowCacheManagerAgent = winterFlowConsumerModule2.WinterFlowCacheManagerAgent();
                    Object[] objArr = winterFlowGatewayInterface.WinterFlowHookDataSource;
                    int i2 = winterFlowGatewayInterface.WinterFlowArrayNetwork;
                    objArr[i2] = WinterFlowCacheManagerAgent;
                    WinterFlowConsumerModule[] winterFlowConsumerModuleArr = winterFlowGatewayInterface.WinterFlowCacheManagerAgent;
                    winterFlowGatewayInterface.WinterFlowArrayNetwork = i2 + 1;
                    winterFlowConsumerModuleArr[i2] = winterFlowConsumerModule2;
                }
                return winterFlowGatewayInterface;
        }
    }
}
