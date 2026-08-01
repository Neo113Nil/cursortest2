package com.google.android.datatransport;

import android.content.res.Resources;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowSessionManagerAgent implements WinterFlowObjectSession {
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowSessionManagerAgent(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowVariableTransaction winterFlowVariableTransaction;
        int i;
        int i2;
        long j;
        WinterFlowPipelineLibrary winterFlowPipelineLibrary;
        int i3 = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i3) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                obj.getClass();
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj2 = list.get(i4);
                    WinterFlowGatewayEngine winterFlowGatewayEngine = (WinterFlowManagerRequest.WinterFlowThreadListener(obj2, Boolean.FALSE) || obj2 == null) ? null : (WinterFlowGatewayEngine) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowBackendCacheManager.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj2);
                    winterFlowGatewayEngine.getClass();
                    arrayList.add(winterFlowGatewayEngine);
                }
                return new WinterFlowRuntimeException(arrayList);
            case 1:
                obj.getClass();
                String str = (String) obj;
                Locale forLanguageTag = Locale.forLanguageTag(str);
                if (WinterFlowManagerRequest.WinterFlowThreadListener(forLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new WinterFlowGatewayEngine(forLanguageTag);
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                Object obj3 = list2.get(0);
                String str2 = obj3 != null ? (String) obj3 : null;
                str2.getClass();
                Object obj4 = list2.get(1);
                return new WinterFlowObjectTool(str2, (WinterFlowManagerRequest.WinterFlowThreadListener(obj4, Boolean.FALSE) || obj4 == null) ? null : (WinterFlowObjectEntity) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowSyntax.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj4));
            case 3:
                obj.getClass();
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                float f = WinterFlowSerializerAPI.WinterFlowHookDataSource;
                WinterFlowXMLWebsocket winterFlowXMLWebsocket = WinterFlowLoaderHelper.WinterFlowArrayHelper;
                Boolean bool = Boolean.FALSE;
                WinterFlowManagerRequest.WinterFlowThreadListener(obj5, bool);
                WinterFlowSerializerAPI winterFlowSerializerAPI = obj5 != null ? (WinterFlowSerializerAPI) winterFlowXMLWebsocket.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(obj5) : null;
                winterFlowSerializerAPI.getClass();
                float f2 = winterFlowSerializerAPI.WinterFlowRouterStructure;
                Object obj6 = list3.get(1);
                WinterFlowXMLWebsocket winterFlowXMLWebsocket2 = WinterFlowLoaderHelper.WinterFlowCompilerVariable;
                WinterFlowManagerRequest.WinterFlowThreadListener(obj6, bool);
                WinterFlowRuntimeJSON winterFlowRuntimeJSON = obj6 != null ? (WinterFlowRuntimeJSON) winterFlowXMLWebsocket2.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(obj6) : null;
                winterFlowRuntimeJSON.getClass();
                int i5 = winterFlowRuntimeJSON.WinterFlowRouterStructure;
                Object obj7 = list3.get(2);
                WinterFlowXMLWebsocket winterFlowXMLWebsocket3 = WinterFlowLoaderHelper.WinterFlowConfigurationSubsystem;
                WinterFlowManagerRequest.WinterFlowThreadListener(obj7, bool);
                WinterFlowUserManagerProcess winterFlowUserManagerProcess = obj7 != null ? (WinterFlowUserManagerProcess) winterFlowXMLWebsocket3.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(obj7) : null;
                winterFlowUserManagerProcess.getClass();
                return new WinterFlowResponseStructure(f2, i5, winterFlowUserManagerProcess.WinterFlowRouterStructure);
            case 4:
                obj.getClass();
                float floatValue = ((Float) obj).floatValue();
                WinterFlowSerializerAPI.WinterFlowRouterStructure(floatValue);
                return new WinterFlowSerializerAPI(floatValue);
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                obj.getClass();
                return new WinterFlowRuntimeJSON(((Integer) obj).intValue());
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                obj.getClass();
                List list4 = (List) obj;
                Object obj8 = list4.get(0);
                WinterFlowQueueHelper winterFlowQueueHelper = obj8 != null ? (WinterFlowQueueHelper) obj8 : null;
                winterFlowQueueHelper.getClass();
                Object obj9 = list4.get(2);
                Integer num = obj9 != null ? (Integer) obj9 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj10 = list4.get(3);
                Integer num2 = obj10 != null ? (Integer) obj10 : null;
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj11 = list4.get(4);
                String str3 = obj11 != null ? (String) obj11 : null;
                str3.getClass();
                switch (winterFlowQueueHelper.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Object obj12 = list4.get(1);
                        WinterFlowFrameworkArray winterFlowFrameworkArray = (WinterFlowManagerRequest.WinterFlowThreadListener(obj12, Boolean.FALSE) || obj12 == null) ? null : (WinterFlowFrameworkArray) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowUnitTestResponse.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj12);
                        winterFlowFrameworkArray.getClass();
                        winterFlowVariableTransaction = new WinterFlowVariableTransaction(intValue, intValue2, winterFlowFrameworkArray, str3);
                        break;
                    case 1:
                        Object obj13 = list4.get(1);
                        WinterFlowDebugUtility winterFlowDebugUtility = (WinterFlowManagerRequest.WinterFlowThreadListener(obj13, Boolean.FALSE) || obj13 == null) ? null : (WinterFlowDebugUtility) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowRouterRouter.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj13);
                        winterFlowDebugUtility.getClass();
                        winterFlowVariableTransaction = new WinterFlowVariableTransaction(intValue, intValue2, winterFlowDebugUtility, str3);
                        break;
                    case 2:
                        Object obj14 = list4.get(1);
                        WinterFlowNetworkSystem winterFlowNetworkSystem = (WinterFlowManagerRequest.WinterFlowThreadListener(obj14, Boolean.FALSE) || obj14 == null) ? null : (WinterFlowNetworkSystem) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj14);
                        winterFlowNetworkSystem.getClass();
                        winterFlowVariableTransaction = new WinterFlowVariableTransaction(intValue, intValue2, winterFlowNetworkSystem, str3);
                        break;
                    case 3:
                        Object obj15 = list4.get(1);
                        WinterFlowCloudInterface winterFlowCloudInterface = (WinterFlowManagerRequest.WinterFlowThreadListener(obj15, Boolean.FALSE) || obj15 == null) ? null : (WinterFlowCloudInterface) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowArrayNetwork.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj15);
                        winterFlowCloudInterface.getClass();
                        winterFlowVariableTransaction = new WinterFlowVariableTransaction(intValue, intValue2, winterFlowCloudInterface, str3);
                        break;
                    case 4:
                        Object obj16 = list4.get(1);
                        WinterFlowEventModule winterFlowEventModule = (WinterFlowManagerRequest.WinterFlowThreadListener(obj16, Boolean.FALSE) || obj16 == null) ? null : (WinterFlowEventModule) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj16);
                        winterFlowEventModule.getClass();
                        winterFlowVariableTransaction = new WinterFlowVariableTransaction(intValue, intValue2, winterFlowEventModule, str3);
                        break;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        Object obj17 = list4.get(1);
                        WinterFlowObjectTool winterFlowObjectTool = (WinterFlowManagerRequest.WinterFlowThreadListener(obj17, Boolean.FALSE) || obj17 == null) ? null : (WinterFlowObjectTool) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj17);
                        winterFlowObjectTool.getClass();
                        winterFlowVariableTransaction = new WinterFlowVariableTransaction(intValue, intValue2, winterFlowObjectTool, str3);
                        break;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        Object obj18 = list4.get(1);
                        String str4 = obj18 != null ? (String) obj18 : null;
                        str4.getClass();
                        winterFlowVariableTransaction = new WinterFlowVariableTransaction(intValue, intValue2, new WinterFlowEventEmitterEngine(str4), str3);
                        break;
                    default:
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        return null;
                }
                return winterFlowVariableTransaction;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                obj.getClass();
                return new WinterFlowUserManagerProcess(((Integer) obj).intValue());
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                String str5 = obj != null ? (String) obj : null;
                str5.getClass();
                return new WinterFlowNetworkSystem(str5);
            case 9:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new WinterFlowCloudInterface(str6);
            case 10:
                obj.getClass();
                List list5 = (List) obj;
                Object obj19 = list5.get(0);
                WinterFlowXMLWebsocket winterFlowXMLWebsocket4 = WinterFlowLoaderHelper.WinterFlowConcurrencyThread;
                Boolean bool2 = Boolean.FALSE;
                WinterFlowManagerRequest.WinterFlowThreadListener(obj19, bool2);
                WinterFlowThreadPoolEventEmitter winterFlowThreadPoolEventEmitter = obj19 != null ? (WinterFlowThreadPoolEventEmitter) winterFlowXMLWebsocket4.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(obj19) : null;
                winterFlowThreadPoolEventEmitter.getClass();
                int i6 = winterFlowThreadPoolEventEmitter.WinterFlowRouterStructure;
                Object obj20 = list5.get(1);
                WinterFlowXMLWebsocket winterFlowXMLWebsocket5 = WinterFlowLoaderHelper.WinterFlowSingletonPlatform;
                WinterFlowManagerRequest.WinterFlowThreadListener(obj20, bool2);
                WinterFlowRepositorySingleton winterFlowRepositorySingleton = obj20 != null ? (WinterFlowRepositorySingleton) winterFlowXMLWebsocket5.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(obj20) : null;
                winterFlowRepositorySingleton.getClass();
                int i7 = winterFlowRepositorySingleton.WinterFlowRouterStructure;
                Object obj21 = list5.get(2);
                WinterFlowInheritanceValidator[] winterFlowInheritanceValidatorArr = WinterFlowOrchestrationPlatform.WinterFlowHookDataSource;
                WinterFlowXMLWebsocket winterFlowXMLWebsocket6 = WinterFlowLoaderHelper.WinterFlowSerializerStructure;
                WinterFlowManagerRequest.WinterFlowThreadListener(obj21, bool2);
                WinterFlowOrchestrationPlatform winterFlowOrchestrationPlatform = obj21 != null ? (WinterFlowOrchestrationPlatform) winterFlowXMLWebsocket6.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(obj21) : null;
                winterFlowOrchestrationPlatform.getClass();
                long j2 = winterFlowOrchestrationPlatform.WinterFlowRouterStructure;
                Object obj22 = list5.get(3);
                WinterFlowHandlerComponent winterFlowHandlerComponent = WinterFlowHandlerComponent.WinterFlowCacheManagerAgent;
                WinterFlowHandlerComponent winterFlowHandlerComponent2 = (WinterFlowManagerRequest.WinterFlowThreadListener(obj22, bool2) || obj22 == null) ? null : (WinterFlowHandlerComponent) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowServerProtocol.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj22);
                Object obj23 = list5.get(4);
                WinterFlowObjectBackend winterFlowObjectBackend = (WinterFlowManagerRequest.WinterFlowThreadListener(obj23, bool2) || obj23 == null) ? null : (WinterFlowObjectBackend) ((WinterFlowObjectSession) WinterFlowUnitTestLibrary.WinterFlowSyntax.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj23);
                Object obj24 = list5.get(5);
                WinterFlowResponseStructure winterFlowResponseStructure = WinterFlowResponseStructure.WinterFlowArrayNetwork;
                WinterFlowResponseStructure winterFlowResponseStructure2 = (WinterFlowManagerRequest.WinterFlowThreadListener(obj24, bool2) || obj24 == null) ? null : (WinterFlowResponseStructure) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowEventEmitterController.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj24);
                Object obj25 = list5.get(6);
                WinterFlowDecoratorProtocol winterFlowDecoratorProtocol = (WinterFlowManagerRequest.WinterFlowThreadListener(obj25, bool2) || obj25 == null) ? null : (WinterFlowDecoratorProtocol) ((WinterFlowObjectSession) WinterFlowUnitTestLibrary.WinterFlowTransactionAgent.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj25);
                winterFlowDecoratorProtocol.getClass();
                int i8 = winterFlowDecoratorProtocol.WinterFlowRouterStructure;
                Object obj26 = list5.get(7);
                WinterFlowXMLWebsocket winterFlowXMLWebsocket7 = WinterFlowLoaderHelper.WinterFlowVariableBandwidth;
                WinterFlowManagerRequest.WinterFlowThreadListener(obj26, bool2);
                WinterFlowDecoratorDatabaseSchema winterFlowDecoratorDatabaseSchema = obj26 != null ? (WinterFlowDecoratorDatabaseSchema) winterFlowXMLWebsocket7.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(obj26) : null;
                winterFlowDecoratorDatabaseSchema.getClass();
                int i9 = winterFlowDecoratorDatabaseSchema.WinterFlowRouterStructure;
                Object obj27 = list5.get(8);
                WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = WinterFlowUnitTestLibrary.WinterFlowServerProtocol;
                if (WinterFlowManagerRequest.WinterFlowThreadListener(obj27, bool2) || obj27 == null) {
                    i = i9;
                    i2 = i8;
                    j = j2;
                    winterFlowPipelineLibrary = null;
                } else {
                    i = i9;
                    i2 = i8;
                    j = j2;
                    winterFlowPipelineLibrary = (WinterFlowPipelineLibrary) ((WinterFlowObjectSession) winterFlowCacheManagerVersionControl.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj27);
                }
                return new WinterFlowFrameworkArray(i6, i7, j, winterFlowHandlerComponent2, winterFlowObjectBackend, winterFlowResponseStructure2, i2, i, winterFlowPipelineLibrary);
            case 11:
                obj.getClass();
                List list6 = (List) obj;
                Object obj28 = list6.get(0);
                int i10 = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
                Boolean bool3 = Boolean.FALSE;
                WinterFlowManagerRequest.WinterFlowThreadListener(obj28, bool3);
                WinterFlowInheritanceSubsystem winterFlowInheritanceSubsystem = obj28 != null ? WinterFlowManagerRequest.WinterFlowThreadListener(obj28, Boolean.FALSE) ? new WinterFlowInheritanceSubsystem(WinterFlowInheritanceSubsystem.WinterFlowResponseEngine) : new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowArrayNetwork(((Integer) obj28).intValue())) : null;
                winterFlowInheritanceSubsystem.getClass();
                long j3 = winterFlowInheritanceSubsystem.WinterFlowRouterStructure;
                Object obj29 = list6.get(1);
                WinterFlowInheritanceValidator[] winterFlowInheritanceValidatorArr2 = WinterFlowOrchestrationPlatform.WinterFlowHookDataSource;
                WinterFlowObjectSession winterFlowObjectSession = WinterFlowLoaderHelper.WinterFlowSerializerStructure.WinterFlowTransactionManagerStrategy;
                WinterFlowManagerRequest.WinterFlowThreadListener(obj29, bool3);
                WinterFlowOrchestrationPlatform winterFlowOrchestrationPlatform2 = obj29 != null ? (WinterFlowOrchestrationPlatform) winterFlowObjectSession.WinterFlowUnitTestResponse(obj29) : null;
                winterFlowOrchestrationPlatform2.getClass();
                long j4 = winterFlowOrchestrationPlatform2.WinterFlowRouterStructure;
                Object obj30 = list6.get(2);
                WinterFlowObjectHook winterFlowObjectHook = WinterFlowObjectHook.WinterFlowTransactionManagerStrategy;
                WinterFlowObjectHook winterFlowObjectHook2 = (WinterFlowManagerRequest.WinterFlowThreadListener(obj30, bool3) || obj30 == null) ? null : (WinterFlowObjectHook) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowThreadListener.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj30);
                Object obj31 = list6.get(3);
                WinterFlowPackageTool winterFlowPackageTool = (WinterFlowManagerRequest.WinterFlowThreadListener(obj31, bool3) || obj31 == null) ? null : (WinterFlowPackageTool) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowBatchUI.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj31);
                Object obj32 = list6.get(4);
                WinterFlowManagerResponse winterFlowManagerResponse = (WinterFlowManagerRequest.WinterFlowThreadListener(obj32, bool3) || obj32 == null) ? null : (WinterFlowManagerResponse) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowRouterAdapter.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj32);
                Object obj33 = list6.get(6);
                String str7 = obj33 != null ? (String) obj33 : null;
                Object obj34 = list6.get(7);
                WinterFlowManagerRequest.WinterFlowThreadListener(obj34, bool3);
                WinterFlowOrchestrationPlatform winterFlowOrchestrationPlatform3 = obj34 != null ? (WinterFlowOrchestrationPlatform) winterFlowObjectSession.WinterFlowUnitTestResponse(obj34) : null;
                winterFlowOrchestrationPlatform3.getClass();
                long j5 = winterFlowOrchestrationPlatform3.WinterFlowRouterStructure;
                Object obj35 = list6.get(8);
                WinterFlowEventEmitterThreadPool winterFlowEventEmitterThreadPool = (WinterFlowManagerRequest.WinterFlowThreadListener(obj35, bool3) || obj35 == null) ? null : (WinterFlowEventEmitterThreadPool) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowServiceUtility.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj35);
                Object obj36 = list6.get(9);
                WinterFlowServiceRefactoring winterFlowServiceRefactoring = (WinterFlowManagerRequest.WinterFlowThreadListener(obj36, bool3) || obj36 == null) ? null : (WinterFlowServiceRefactoring) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowTransactionAgent.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj36);
                Object obj37 = list6.get(10);
                WinterFlowRuntimeException winterFlowRuntimeException = WinterFlowRuntimeException.WinterFlowUnitTestResponse;
                WinterFlowRuntimeException winterFlowRuntimeException2 = (WinterFlowManagerRequest.WinterFlowThreadListener(obj37, bool3) || obj37 == null) ? null : (WinterFlowRuntimeException) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowConsumerUserManager.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj37);
                Object obj38 = list6.get(11);
                WinterFlowManagerRequest.WinterFlowThreadListener(obj38, bool3);
                WinterFlowInheritanceSubsystem winterFlowInheritanceSubsystem2 = obj38 != null ? WinterFlowManagerRequest.WinterFlowThreadListener(obj38, Boolean.FALSE) ? new WinterFlowInheritanceSubsystem(WinterFlowInheritanceSubsystem.WinterFlowResponseEngine) : new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowArrayNetwork(((Integer) obj38).intValue())) : null;
                winterFlowInheritanceSubsystem2.getClass();
                long j6 = winterFlowInheritanceSubsystem2.WinterFlowRouterStructure;
                Object obj39 = list6.get(12);
                WinterFlowProcessorProcess winterFlowProcessorProcess = (WinterFlowManagerRequest.WinterFlowThreadListener(obj39, bool3) || obj39 == null) ? null : (WinterFlowProcessorProcess) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowResponseEngine.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj39);
                Object obj40 = list6.get(13);
                WinterFlowMicroserviceScheduler winterFlowMicroserviceScheduler = WinterFlowMicroserviceScheduler.WinterFlowArrayNetwork;
                return new WinterFlowDebugUtility(j3, j4, winterFlowObjectHook2, winterFlowPackageTool, winterFlowManagerResponse, (WinterFlowRendererSystem) null, str7, j5, winterFlowEventEmitterThreadPool, winterFlowServiceRefactoring, winterFlowRuntimeException2, j6, winterFlowProcessorProcess, (WinterFlowManagerRequest.WinterFlowThreadListener(obj40, bool3) || obj40 == null) ? null : (WinterFlowMicroserviceScheduler) ((WinterFlowObjectSession) WinterFlowLoaderHelper.WinterFlowBandwidthObject.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj40), 49184);
            case 12:
                obj.getClass();
                List list7 = (List) obj;
                Object obj41 = list7.get(0);
                Boolean bool4 = obj41 != null ? (Boolean) obj41 : null;
                bool4.getClass();
                boolean booleanValue = bool4.booleanValue();
                Object obj42 = list7.get(1);
                WinterFlowProcessorProcessor winterFlowProcessorProcessor = (WinterFlowManagerRequest.WinterFlowThreadListener(obj42, Boolean.FALSE) || obj42 == null) ? null : (WinterFlowProcessorProcessor) ((WinterFlowObjectSession) WinterFlowUnitTestLibrary.WinterFlowResponseEngine.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj42);
                winterFlowProcessorProcessor.getClass();
                return new WinterFlowObjectBackend(winterFlowProcessorProcessor.WinterFlowRouterStructure, booleanValue);
            case 13:
                obj.getClass();
                return new WinterFlowProcessorProcessor(((Integer) obj).intValue());
            case 14:
                obj.getClass();
                return new WinterFlowDecoratorProtocol(((Integer) obj).intValue());
            case 15:
                obj.getClass();
                List list8 = (List) obj;
                Object obj43 = list8.get(0);
                WinterFlowBandwidthStrategy winterFlowBandwidthStrategy = (WinterFlowManagerRequest.WinterFlowThreadListener(obj43, Boolean.FALSE) || obj43 == null) ? null : (WinterFlowBandwidthStrategy) ((WinterFlowObjectSession) WinterFlowUnitTestLibrary.WinterFlowThreadListener.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj43);
                winterFlowBandwidthStrategy.getClass();
                int i11 = winterFlowBandwidthStrategy.WinterFlowRouterStructure;
                Object obj44 = list8.get(1);
                Boolean bool5 = obj44 != null ? (Boolean) obj44 : null;
                bool5.getClass();
                return new WinterFlowPipelineLibrary(i11, bool5.booleanValue());
            case 16:
                obj.getClass();
                return new WinterFlowBandwidthStrategy(((Integer) obj).intValue());
            case 17:
                return new WinterFlowStackQuery(((Integer) obj).intValue());
            case 18:
                return Boolean.valueOf(!false);
            case 19:
                return Boolean.valueOf(obj == null);
            case 20:
                return winterFlowAlgorithmSession;
            case 21:
                return winterFlowAlgorithmSession;
            case 22:
                WinterFlowNodeSyntax[] winterFlowNodeSyntaxArr = WinterFlowManagerRefactoring.WinterFlowRouterStructure;
                WinterFlowRendererOrchestration winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowThreadListener;
                WinterFlowNodeSyntax winterFlowNodeSyntax = WinterFlowManagerRefactoring.WinterFlowRouterStructure[5];
                ((WinterFlowXMLInterface) obj).WinterFlowRouterStructure(winterFlowRendererOrchestration, Boolean.TRUE);
                return winterFlowAlgorithmSession;
            case 23:
                return winterFlowAlgorithmSession;
            case 24:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 25:
                WinterFlowConcurrencyLayer winterFlowConcurrencyLayer = (WinterFlowConcurrencyLayer) obj;
                winterFlowConcurrencyLayer.getClass();
                return Boolean.valueOf(winterFlowConcurrencyLayer.WinterFlowBackendCacheManager());
            case 26:
                WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice = (WinterFlowCacheManagerMicroservice) obj;
                long j7 = winterFlowCacheManagerMicroservice.WinterFlowTransactionManagerStrategy;
                WinterFlowClassStrategy winterFlowClassStrategy = winterFlowCacheManagerMicroservice.WinterFlowRouterRouter;
                if (winterFlowClassStrategy != null) {
                    winterFlowClassStrategy.WinterFlowCacheManagerAgent(winterFlowCacheManagerMicroservice, WinterFlowSoftwareException.WinterFlowTransactionManagerStrategy, winterFlowCacheManagerMicroservice.WinterFlowUnitTestResponse);
                }
                long j8 = winterFlowCacheManagerMicroservice.WinterFlowTransactionManagerStrategy;
                if (j7 != j8) {
                    WinterFlowCompilerBatch winterFlowCompilerBatch = winterFlowCacheManagerMicroservice.WinterFlowBandwidthObject;
                    if (winterFlowCompilerBatch != null) {
                        if (winterFlowCompilerBatch.WinterFlowRouterStructure > j8) {
                            winterFlowCacheManagerMicroservice.WinterFlowEventEmitterController();
                        } else {
                            winterFlowCompilerBatch.WinterFlowUnitTestResponse = j8;
                            if (winterFlowCompilerBatch.WinterFlowHookDataSource == null) {
                                winterFlowCompilerBatch.WinterFlowRouterRouter = WinterFlowCloudStack.WinterFlowCloudMicroservice((1.0d - winterFlowCompilerBatch.WinterFlowVariableVersionControl.WinterFlowRouterStructure(0)) * winterFlowCacheManagerMicroservice.WinterFlowTransactionManagerStrategy);
                            }
                        }
                    } else if (j8 != 0) {
                        winterFlowCacheManagerMicroservice.WinterFlowCacheManagerListener();
                    }
                }
                return winterFlowAlgorithmSession;
            case 27:
                WinterFlowConcurrencyLayer winterFlowConcurrencyLayer2 = (WinterFlowConcurrencyLayer) obj;
                winterFlowConcurrencyLayer2.getClass();
                WinterFlowRendererDecorator winterFlowRendererDecorator = new WinterFlowRendererDecorator();
                while (winterFlowConcurrencyLayer2.WinterFlowBackendCacheManager()) {
                    winterFlowRendererDecorator.add(Integer.valueOf((int) winterFlowConcurrencyLayer2.getLong(0)));
                }
                return WinterFlowMicroserviceWidget.WinterFlowHookDataSource(winterFlowRendererDecorator);
            case 28:
                return new WinterFlowVariableSubsystem(((Float) obj).floatValue());
            default:
                return new WinterFlowVariableSubsystem(((Integer) obj).intValue());
        }
    }
}
