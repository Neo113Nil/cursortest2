package com.google.android.datatransport;

import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.RunningActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModuleStack extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ Object WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowModuleStack(Object obj, Object obj2, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = obj;
        this.WinterFlowServerProtocol = obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowServerProtocol;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowModuleStack((WinterFlowJSONDecorator) this.WinterFlowTransactionAgent, (WinterFlowUserManagerWorker) obj2, winterFlowTransactionManagerLayer, 0);
            case 1:
                return new WinterFlowModuleStack((WinterFlowJSONDecorator) this.WinterFlowTransactionAgent, (WinterFlowBandwidthModule) obj2, winterFlowTransactionManagerLayer, 1);
            case 2:
                return new WinterFlowModuleStack((WinterFlowDebugUnitTest) this.WinterFlowTransactionAgent, (WinterFlowVersionParser) obj2, winterFlowTransactionManagerLayer, 2);
            case 3:
                return new WinterFlowModuleStack((WinterFlowSyntaxResolver) this.WinterFlowTransactionAgent, (WinterFlowRouterHelper) obj2, winterFlowTransactionManagerLayer, 3);
            case 4:
                WinterFlowModuleStack winterFlowModuleStack = new WinterFlowModuleStack((WinterFlowConfigurationSession) obj2, winterFlowTransactionManagerLayer, 4);
                winterFlowModuleStack.WinterFlowTransactionAgent = obj;
                return winterFlowModuleStack;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowModuleStack winterFlowModuleStack2 = new WinterFlowModuleStack((WinterFlowSessionEntity) obj2, winterFlowTransactionManagerLayer, 5);
                winterFlowModuleStack2.WinterFlowTransactionAgent = obj;
                return winterFlowModuleStack2;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return new WinterFlowModuleStack((WinterFlowDataSourceResolver) obj2, winterFlowTransactionManagerLayer, 6);
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return new WinterFlowModuleStack((WinterFlowXMLDebug) this.WinterFlowTransactionAgent, (Runnable) obj2, winterFlowTransactionManagerLayer, 7);
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return new WinterFlowModuleStack((WinterFlowEventEvent) this.WinterFlowTransactionAgent, (WinterFlowClassNode) obj2, winterFlowTransactionManagerLayer, 8);
            case 9:
                return new WinterFlowModuleStack((WinterFlowEventEvent) this.WinterFlowTransactionAgent, (WinterFlowBandwidthCache) obj2, winterFlowTransactionManagerLayer, 9);
            case 10:
                WinterFlowModuleStack winterFlowModuleStack3 = new WinterFlowModuleStack((List) obj2, winterFlowTransactionManagerLayer, 10);
                winterFlowModuleStack3.WinterFlowTransactionAgent = obj;
                return winterFlowModuleStack3;
            case 11:
                return new WinterFlowModuleStack((WinterFlowEventEvent) this.WinterFlowTransactionAgent, (WinterFlowDebugMechanism) obj2, winterFlowTransactionManagerLayer, 11);
            case 12:
                WinterFlowModuleStack winterFlowModuleStack4 = new WinterFlowModuleStack((WinterFlowStrategyResolver) obj2, winterFlowTransactionManagerLayer, 12);
                winterFlowModuleStack4.WinterFlowTransactionAgent = obj;
                return winterFlowModuleStack4;
            case 13:
                return new WinterFlowModuleStack((WinterFlowObjectLayer) this.WinterFlowTransactionAgent, (WinterFlowWorkerTransaction) obj2, winterFlowTransactionManagerLayer, 13);
            case 14:
                return new WinterFlowModuleStack((WinterFlowJavaOrchestration) this.WinterFlowTransactionAgent, (WinterFlowObjectSession) obj2, winterFlowTransactionManagerLayer, 14);
            case 15:
                return new WinterFlowModuleStack((WinterFlowJavaOrchestration) this.WinterFlowTransactionAgent, (WinterFlowNetworkFramework) obj2, winterFlowTransactionManagerLayer, 15);
            case 16:
                return new WinterFlowModuleStack((String) this.WinterFlowTransactionAgent, (WinterFlowRequestHandler) obj2, winterFlowTransactionManagerLayer, 16);
            case 17:
                return new WinterFlowModuleStack((WinterFlowHookView) this.WinterFlowTransactionAgent, (WinterFlowProcessorAgent) obj2, winterFlowTransactionManagerLayer, 17);
            case 18:
                WinterFlowModuleStack winterFlowModuleStack5 = new WinterFlowModuleStack((WinterFlowRouterOrchestration) obj2, winterFlowTransactionManagerLayer, 18);
                winterFlowModuleStack5.WinterFlowTransactionAgent = obj;
                return winterFlowModuleStack5;
            case 19:
                return new WinterFlowModuleStack((WinterFlowProtocolAgent) this.WinterFlowTransactionAgent, (WinterFlowEventEvent) obj2, winterFlowTransactionManagerLayer, 19);
            case 20:
                WinterFlowModuleStack winterFlowModuleStack6 = new WinterFlowModuleStack((WinterFlowWorkerThreadPool) obj2, winterFlowTransactionManagerLayer, 20);
                winterFlowModuleStack6.WinterFlowTransactionAgent = obj;
                return winterFlowModuleStack6;
            case 21:
                return new WinterFlowModuleStack((WinterFlowEventEvent) this.WinterFlowTransactionAgent, (WinterFlowHookPlatform) obj2, winterFlowTransactionManagerLayer, 21);
            case 22:
                WinterFlowModuleStack winterFlowModuleStack7 = new WinterFlowModuleStack((WinterFlowRequestComponent) obj2, winterFlowTransactionManagerLayer, 22);
                winterFlowModuleStack7.WinterFlowTransactionAgent = obj;
                return winterFlowModuleStack7;
            case 23:
                WinterFlowModuleStack winterFlowModuleStack8 = new WinterFlowModuleStack((WinterFlowObjectSession) obj2, winterFlowTransactionManagerLayer, 23);
                winterFlowModuleStack8.WinterFlowTransactionAgent = obj;
                return winterFlowModuleStack8;
            case 24:
                return new WinterFlowModuleStack((WinterFlowRequestHandler) this.WinterFlowTransactionAgent, (RunningActivity) obj2, winterFlowTransactionManagerLayer, 24);
            case 25:
                return new WinterFlowModuleStack((WinterFlowSerializerLayer) this.WinterFlowTransactionAgent, (RunningActivity) obj2, winterFlowTransactionManagerLayer, 25);
            case 26:
                return new WinterFlowModuleStack((WinterFlowResponsePackage) this.WinterFlowTransactionAgent, (WinterFlowConcurrencyThread) obj2, winterFlowTransactionManagerLayer, 26);
            case 27:
                return new WinterFlowModuleStack((WinterFlowStackProvider) obj2, winterFlowTransactionManagerLayer, 27);
            case 28:
                return new WinterFlowModuleStack((WinterFlowEventProvider) this.WinterFlowTransactionAgent, (WinterFlowSoftwareProtocol) obj2, winterFlowTransactionManagerLayer, 28);
            default:
                return new WinterFlowModuleStack((WinterFlowRepositoryFramework) this.WinterFlowTransactionAgent, (WinterFlowModuleSingleton) obj2, winterFlowTransactionManagerLayer, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x02ea, code lost:
    
        if (r1.WinterFlowArrayNetwork(r2, r3, r4, r5, r20) != r11) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (r1 != r11) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        if (r0.WinterFlowVariableVersionControl(r1, r20) == r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v42, types: [com.google.android.datatransport.WinterFlowConsumerBandwidth] */
    /* JADX WARN: Type inference failed for: r1v44, types: [com.google.android.datatransport.WinterFlowConsumerBandwidth] */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x02ea -> B:138:0x02b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00be -> B:27:0x00c2). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowInterfaceProcessor winterFlowInterfaceProcessor;
        Object WinterFlowCacheManagerAgent;
        Object WinterFlowServerProtocol;
        Object value;
        WinterFlowAdapterResponse winterFlowAdapterResponse;
        Object obj2;
        Object WinterFlowVariableVersionControl;
        Object obj3;
        WinterFlowModuleStack winterFlowModuleStack;
        int i = this.WinterFlowSyntax;
        ?? r1 = 3;
        char c = 3;
        int i2 = 4;
        int i3 = 2;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj4 = this.WinterFlowServerProtocol;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        int i4 = 1;
        WinterFlowPipelineObject winterFlowPipelineObject = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i5 = this.WinterFlowResponseEngine;
                if (i5 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    return ((WinterFlowJSONDecorator) this.WinterFlowTransactionAgent).WinterFlowArrayNetwork((WinterFlowUserManagerWorker) obj4, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i5 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i6 = this.WinterFlowResponseEngine;
                if (i6 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    return ((WinterFlowJSONDecorator) this.WinterFlowTransactionAgent).WinterFlowArrayNetwork((WinterFlowBandwidthModule) obj4, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i6 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
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
                WinterFlowDebugUnitTest winterFlowDebugUnitTest = (WinterFlowDebugUnitTest) this.WinterFlowTransactionAgent;
                WinterFlowRouterEngine winterFlowRouterEngine = new WinterFlowRouterEngine(true ? 1 : 0, (WinterFlowVersionParser) obj4);
                this.WinterFlowResponseEngine = 1;
                return WinterFlowHandlerWebsocket.WinterFlowTransactionAgent(winterFlowDebugUnitTest, winterFlowRouterEngine, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
            case 3:
                int i8 = this.WinterFlowResponseEngine;
                if (i8 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    return WinterFlowHandlerWebsocket.WinterFlowTransactionAgent((WinterFlowSyntaxResolver) this.WinterFlowTransactionAgent, (WinterFlowRouterHelper) obj4, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i8 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                int i9 = this.WinterFlowResponseEngine;
                if (i9 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowGatewayClass winterFlowGatewayClass = (WinterFlowGatewayClass) this.WinterFlowTransactionAgent;
                    this.WinterFlowResponseEngine = 1;
                    return ((WinterFlowConfigurationSession) obj4).WinterFlowArrayNetwork(winterFlowGatewayClass, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i9 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                int i10 = this.WinterFlowResponseEngine;
                if (i10 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowCacheInterface winterFlowCacheInterface = (WinterFlowCacheInterface) this.WinterFlowTransactionAgent;
                    this.WinterFlowResponseEngine = 1;
                    return ((WinterFlowSessionEntity) obj4).WinterFlowRouterRouter(winterFlowCacheInterface, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i10 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowDataSourceResolver winterFlowDataSourceResolver = (WinterFlowDataSourceResolver) obj4;
                int i11 = this.WinterFlowResponseEngine;
                if (i11 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    if (!winterFlowDataSourceResolver.WinterFlowArrayNetwork()) {
                        return winterFlowAlgorithmSession;
                    }
                    winterFlowInterfaceProcessor = new WinterFlowInterfaceProcessor();
                    WinterFlowEventEvent winterFlowEventEvent = winterFlowDataSourceResolver.WinterFlowArrayNetwork;
                    WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = winterFlowDataSourceResolver.WinterFlowVariableVersionControl;
                    winterFlowWorkerThreadPool.getClass();
                    WinterFlowExceptionIDE winterFlowExceptionIDE = new WinterFlowExceptionIDE(new WinterFlowServerSerializer(winterFlowWorkerThreadPool, true ? 1 : 0), new WinterFlowTransactionHandler(winterFlowInterfaceProcessor, null));
                    this.WinterFlowTransactionAgent = winterFlowInterfaceProcessor;
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowExceptionIDE, this) == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i11 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    winterFlowInterfaceProcessor = (WinterFlowInterfaceProcessor) this.WinterFlowTransactionAgent;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                if (winterFlowInterfaceProcessor.WinterFlowVariableVersionControl) {
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("You must collect the progress flow");
                return null;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowXMLDebug winterFlowXMLDebug = (WinterFlowXMLDebug) this.WinterFlowTransactionAgent;
                int i12 = this.WinterFlowResponseEngine;
                if (i12 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowWidgetRepository winterFlowWidgetRepository = winterFlowXMLDebug.WinterFlowTransactionManagerStrategy;
                    this.WinterFlowResponseEngine = 1;
                    Object WinterFlowRouterStructure = winterFlowWidgetRepository.WinterFlowRouterStructure(0.0f - winterFlowWidgetRepository.WinterFlowCacheManagerAgent, this);
                    if (WinterFlowRouterStructure != winterFlowListenerJava) {
                        WinterFlowRouterStructure = winterFlowAlgorithmSession;
                    }
                    if (WinterFlowRouterStructure == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i12 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                winterFlowXMLDebug.WinterFlowCacheManagerAgent.WinterFlowRouterStructure.setValue(Boolean.FALSE);
                ((Runnable) obj4).run();
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                int i13 = this.WinterFlowResponseEngine;
                if (i13 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    Object WinterFlowVariableVersionControl2 = ((WinterFlowEventEvent) this.WinterFlowTransactionAgent).WinterFlowVariableVersionControl((WinterFlowClassNode) obj4, this);
                    return WinterFlowVariableVersionControl2 == winterFlowListenerJava ? winterFlowListenerJava : WinterFlowVariableVersionControl2;
                }
                if (i13 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return obj;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
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
                WinterFlowEventEvent winterFlowEventEvent2 = (WinterFlowEventEvent) this.WinterFlowTransactionAgent;
                Object obj5 = ((WinterFlowBandwidthCache) obj4).WinterFlowVariableVersionControl;
                this.WinterFlowResponseEngine = 1;
                Object WinterFlowVariableVersionControl3 = winterFlowEventEvent2.WinterFlowVariableVersionControl(obj5, this);
                return WinterFlowVariableVersionControl3 == winterFlowListenerJava ? winterFlowListenerJava : WinterFlowVariableVersionControl3;
            case 10:
                int i15 = this.WinterFlowResponseEngine;
                if (i15 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowConsumerMechanism winterFlowConsumerMechanism = (WinterFlowConsumerMechanism) this.WinterFlowTransactionAgent;
                    this.WinterFlowResponseEngine = 1;
                    return WinterFlowQuerySyntax.WinterFlowTransactionManagerStrategy.WinterFlowServiceUtility((List) obj4, winterFlowConsumerMechanism, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i15 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                int i16 = this.WinterFlowResponseEngine;
                if (i16 != 0) {
                    if (i16 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return obj;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowEventEvent winterFlowEventEvent3 = (WinterFlowEventEvent) this.WinterFlowTransactionAgent;
                Object obj6 = ((WinterFlowDebugMechanism) obj4).WinterFlowHookDataSource;
                this.WinterFlowResponseEngine = 1;
                Object WinterFlowVariableVersionControl4 = winterFlowEventEvent3.WinterFlowVariableVersionControl(obj6, this);
                return WinterFlowVariableVersionControl4 == winterFlowListenerJava ? winterFlowListenerJava : WinterFlowVariableVersionControl4;
            case 12:
                int i17 = this.WinterFlowResponseEngine;
                if (i17 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowCacheManagerMiddleware winterFlowCacheManagerMiddleware = (WinterFlowCacheManagerMiddleware) this.WinterFlowTransactionAgent;
                    this.WinterFlowResponseEngine = 1;
                    return ((WinterFlowStrategyResolver) obj4).WinterFlowArrayNetwork(winterFlowCacheManagerMiddleware, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i17 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                WinterFlowWorkerTransaction winterFlowWorkerTransaction = (WinterFlowWorkerTransaction) obj4;
                WinterFlowObjectLayer winterFlowObjectLayer = (WinterFlowObjectLayer) this.WinterFlowTransactionAgent;
                int i18 = this.WinterFlowResponseEngine;
                if (i18 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowControllerInterface winterFlowControllerInterface = winterFlowObjectLayer.WinterFlowHookDataSource;
                    WinterFlowCloudMicroservice winterFlowCloudMicroservice = new WinterFlowCloudMicroservice(winterFlowWorkerTransaction.WinterFlowUnitTestResponse, winterFlowWorkerTransaction.WinterFlowCacheManagerAgent, 0L, winterFlowWorkerTransaction.WinterFlowHookDataSource);
                    this.WinterFlowResponseEngine = 1;
                    WinterFlowDatabaseSchemaAlgorithm winterFlowDatabaseSchemaAlgorithm = winterFlowControllerInterface.WinterFlowRouterStructure;
                    Object WinterFlowArrayHelper = WinterFlowQuerySyntax.WinterFlowArrayHelper(winterFlowDatabaseSchemaAlgorithm.WinterFlowRouterStructure, false, true, new WinterFlowGatewayManager(winterFlowDatabaseSchemaAlgorithm, winterFlowCloudMicroservice, true ? 1 : 0), this);
                    if (WinterFlowArrayHelper != winterFlowListenerJava) {
                        WinterFlowArrayHelper = winterFlowAlgorithmSession;
                    }
                    if (WinterFlowArrayHelper == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i18 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                WinterFlowHandlerPlatform winterFlowHandlerPlatform = winterFlowObjectLayer.WinterFlowServerProtocol;
                WinterFlowHandlerPlatform winterFlowHandlerPlatform2 = winterFlowObjectLayer.WinterFlowSingletonPlatform;
                int intValue = ((Number) winterFlowHandlerPlatform.getValue()).intValue() + winterFlowWorkerTransaction.WinterFlowTransactionManagerStrategy;
                WinterFlowHandlerPlatform winterFlowHandlerPlatform3 = winterFlowObjectLayer.WinterFlowServerProtocol;
                Integer num = new Integer(intValue);
                winterFlowHandlerPlatform3.getClass();
                winterFlowHandlerPlatform3.WinterFlowTransactionAgent(null, num);
                SharedPreferences.Editor edit = winterFlowObjectLayer.WinterFlowCacheManagerAgent.edit();
                edit.getClass();
                edit.putInt(winterFlowObjectLayer.WinterFlowVariableVersionControl, intValue);
                edit.apply();
                winterFlowHandlerPlatform2.WinterFlowTransactionAgent(null, new Integer(((Number) winterFlowHandlerPlatform2.getValue()).intValue() + 1));
                if (((Number) winterFlowHandlerPlatform2.getValue()).intValue() >= ((Number) winterFlowObjectLayer.WinterFlowOrchestrationSubsystem.getValue()).intValue()) {
                    winterFlowObjectLayer.WinterFlowVariableVersionControl(true);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowHandlerPlatform winterFlowHandlerPlatform4 = winterFlowObjectLayer.WinterFlowBatchUI;
                Iterable<WinterFlowWorkerTransaction> iterable = (Iterable) winterFlowHandlerPlatform4.getValue();
                ArrayList arrayList = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(iterable, 10));
                for (WinterFlowWorkerTransaction winterFlowWorkerTransaction2 : iterable) {
                    long j = winterFlowWorkerTransaction2.WinterFlowRouterStructure;
                    long j2 = winterFlowWorkerTransaction.WinterFlowRouterStructure;
                    if (j == j2) {
                        winterFlowWorkerTransaction2 = winterFlowObjectLayer.WinterFlowTransactionManagerStrategy(j2 + 100);
                    }
                    arrayList.add(winterFlowWorkerTransaction2);
                }
                winterFlowHandlerPlatform4.WinterFlowTransactionAgent(null, arrayList);
                return winterFlowAlgorithmSession;
            case 14:
                WinterFlowJavaOrchestration winterFlowJavaOrchestration = (WinterFlowJavaOrchestration) this.WinterFlowTransactionAgent;
                ThreadLocal threadLocal = winterFlowJavaOrchestration.WinterFlowHookDataSource;
                int i19 = this.WinterFlowResponseEngine;
                try {
                    if (i19 != 0) {
                        if (i19 != 1) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        WinterFlowCacheManagerAgent = obj;
                        return (WinterFlowDataSourceSerializer) WinterFlowCacheManagerAgent;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    Object obj7 = threadLocal.get();
                    Boolean bool = Boolean.TRUE;
                    if (WinterFlowManagerRequest.WinterFlowThreadListener(obj7, bool)) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        return null;
                    }
                    threadLocal.set(bool);
                    WinterFlowConfigurationModule winterFlowConfigurationModule = winterFlowJavaOrchestration.WinterFlowCacheManagerAgent;
                    WinterFlowEncryptionHelper winterFlowEncryptionHelper = new WinterFlowEncryptionHelper((WinterFlowObjectSession) obj4, (WinterFlowTransactionManagerLayer) null);
                    this.WinterFlowResponseEngine = 1;
                    WinterFlowCacheManagerAgent = winterFlowConfigurationModule.WinterFlowCacheManagerAgent(new WinterFlowExceptionTesting(winterFlowEncryptionHelper, winterFlowPipelineObject, i4), this);
                    if (WinterFlowCacheManagerAgent == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                    return (WinterFlowDataSourceSerializer) WinterFlowCacheManagerAgent;
                } finally {
                    threadLocal.set(Boolean.FALSE);
                }
                threadLocal.set(Boolean.FALSE);
            case 15:
                int i20 = this.WinterFlowResponseEngine;
                if (i20 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowEventProvider WinterFlowVariableVersionControl5 = ((WinterFlowUserManager) ((WinterFlowJavaOrchestration) this.WinterFlowTransactionAgent).WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl();
                    this.WinterFlowResponseEngine = 1;
                    WinterFlowServerProtocol = WinterFlowQuerySyntax.WinterFlowServerProtocol(WinterFlowVariableVersionControl5, this);
                    if (WinterFlowServerProtocol == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i20 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowServerProtocol = obj;
                }
                WinterFlowDataSourceSerializer winterFlowDataSourceSerializer = (WinterFlowDataSourceSerializer) WinterFlowServerProtocol;
                if (winterFlowDataSourceSerializer != null) {
                    Object obj8 = winterFlowDataSourceSerializer.WinterFlowRouterStructure.get((WinterFlowNetworkFramework) obj4);
                    if (obj8 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj8;
                        obj8 = Arrays.copyOf(bArr, bArr.length);
                    }
                    Object obj9 = obj8;
                    if (obj9 != null) {
                        return obj9;
                    }
                }
                return -1L;
            case 16:
                WinterFlowRequestHandler winterFlowRequestHandler = (WinterFlowRequestHandler) obj4;
                WinterFlowCacheManagerNode winterFlowCacheManagerNode = winterFlowRequestHandler.WinterFlowVariableVersionControl;
                String str = (String) this.WinterFlowTransactionAgent;
                int i21 = this.WinterFlowResponseEngine;
                if (i21 != 0) {
                    if (i21 == 1 || i21 == 2) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return winterFlowAlgorithmSession;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                if (WinterFlowFrameworkStrategy.WinterFlowArrayHelper(str)) {
                    this.WinterFlowResponseEngine = 2;
                    if (winterFlowCacheManagerNode.WinterFlowRouterRouter(WinterFlowSerializerLibrary.WinterFlowTransactionManagerStrategy, this) != winterFlowListenerJava) {
                        return winterFlowAlgorithmSession;
                    }
                } else {
                    SharedPreferences.Editor edit2 = winterFlowRequestHandler.WinterFlowHookDataSource.edit();
                    edit2.getClass();
                    edit2.putString("user_secure_data", str);
                    edit2.apply();
                    WinterFlowHandlerPlatform winterFlowHandlerPlatform5 = winterFlowRequestHandler.WinterFlowCacheManagerAgent;
                    do {
                        value = winterFlowHandlerPlatform5.getValue();
                    } while (!winterFlowHandlerPlatform5.WinterFlowSyntax(value, str));
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowCacheManagerNode.WinterFlowRouterRouter(WinterFlowSerializerLibrary.WinterFlowVariableVersionControl, this) != winterFlowListenerJava) {
                        return winterFlowAlgorithmSession;
                    }
                }
                return winterFlowListenerJava;
            case 17:
                int i22 = this.WinterFlowResponseEngine;
                if (i22 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowHookView winterFlowHookView = (WinterFlowHookView) this.WinterFlowTransactionAgent;
                    WinterFlowCloudComponent winterFlowCloudComponent = new WinterFlowCloudComponent(c, (WinterFlowProcessorAgent) obj4);
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowHookView.WinterFlowRouterStructure(winterFlowCloudComponent, this) == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i22 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                throw new WinterFlowServerSystem();
            case 18:
                WinterFlowRouterOrchestration winterFlowRouterOrchestration = (WinterFlowRouterOrchestration) obj4;
                int i23 = this.WinterFlowResponseEngine;
                try {
                    if (i23 == 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowTransactionAgent;
                    } else if (i23 == 1) {
                        winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowTransactionAgent;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        obj2 = obj;
                        WinterFlowIDEVariable winterFlowIDEVariable = (WinterFlowIDEVariable) obj2;
                        float WinterFlowSingletonPlatform = winterFlowRouterOrchestration.WinterFlowCacheManagerAgent.WinterFlowSingletonPlatform(6.0f);
                        float WinterFlowSingletonPlatform2 = winterFlowRouterOrchestration.WinterFlowCacheManagerAgent.WinterFlowSingletonPlatform(1.0f);
                        WinterFlowTransactionManagerService winterFlowTransactionManagerService = winterFlowRouterOrchestration.WinterFlowRouterStructure;
                        this.WinterFlowTransactionAgent = winterFlowAdapterResponse;
                        this.WinterFlowResponseEngine = 2;
                        break;
                    } else {
                        if (i23 != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowTransactionAgent;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    }
                    if (!WinterFlowInvokerComponent.WinterFlowSoftwareProtocol(winterFlowAdapterResponse.WinterFlowRouterRouter())) {
                        return winterFlowAlgorithmSession;
                    }
                    WinterFlowWorkerThreadPool winterFlowWorkerThreadPool2 = winterFlowRouterOrchestration.WinterFlowUnitTestResponse;
                    this.WinterFlowTransactionAgent = winterFlowAdapterResponse;
                    this.WinterFlowResponseEngine = 1;
                    obj2 = winterFlowWorkerThreadPool2.WinterFlowVariableVersionControl(this);
                    if (obj2 == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                    WinterFlowIDEVariable winterFlowIDEVariable2 = (WinterFlowIDEVariable) obj2;
                    float WinterFlowSingletonPlatform3 = winterFlowRouterOrchestration.WinterFlowCacheManagerAgent.WinterFlowSingletonPlatform(6.0f);
                    float WinterFlowSingletonPlatform22 = winterFlowRouterOrchestration.WinterFlowCacheManagerAgent.WinterFlowSingletonPlatform(1.0f);
                    WinterFlowTransactionManagerService winterFlowTransactionManagerService2 = winterFlowRouterOrchestration.WinterFlowRouterStructure;
                    this.WinterFlowTransactionAgent = winterFlowAdapterResponse;
                    this.WinterFlowResponseEngine = 2;
                } finally {
                    winterFlowRouterOrchestration.WinterFlowRouterRouter = null;
                }
            case 19:
                int i24 = this.WinterFlowResponseEngine;
                if (i24 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    return ((WinterFlowProtocolAgent) this.WinterFlowTransactionAgent).WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy(WinterFlowExceptionListener.WinterFlowTransactionManagerStrategy, (WinterFlowEventEvent) obj4, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i24 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                int i25 = this.WinterFlowResponseEngine;
                try {
                    if (i25 == 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        WinterFlowPipelineObject WinterFlowStrategyTool = WinterFlowCacheRuntime.WinterFlowStrategyTool((WinterFlowAdapterResponse) this.WinterFlowTransactionAgent, null, new WinterFlowGatewayWorker(i3, winterFlowPipelineObject), 3);
                        this.WinterFlowTransactionAgent = WinterFlowStrategyTool;
                        this.WinterFlowResponseEngine = 1;
                        WinterFlowVariableVersionControl = ((WinterFlowWorkerThreadPool) obj4).WinterFlowVariableVersionControl(this);
                        r1 = WinterFlowStrategyTool;
                        if (WinterFlowVariableVersionControl == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                    } else {
                        if (i25 != 1) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) this.WinterFlowTransactionAgent;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        WinterFlowVariableVersionControl = obj;
                        r1 = winterFlowConsumerBandwidth;
                    }
                    r1.WinterFlowArrayNetwork(null);
                    return WinterFlowVariableVersionControl;
                } catch (Throwable th) {
                    r1.WinterFlowArrayNetwork(null);
                    throw th;
                }
            case 21:
                int i26 = this.WinterFlowResponseEngine;
                if (i26 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    Object WinterFlowVariableVersionControl6 = ((WinterFlowEventEvent) this.WinterFlowTransactionAgent).WinterFlowVariableVersionControl((WinterFlowHookPlatform) obj4, this);
                    return WinterFlowVariableVersionControl6 == winterFlowListenerJava ? winterFlowListenerJava : WinterFlowVariableVersionControl6;
                }
                if (i26 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return obj;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                int i27 = this.WinterFlowResponseEngine;
                if (i27 != 0) {
                    if (i27 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return winterFlowAlgorithmSession;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowAdapterResponse winterFlowAdapterResponse2 = (WinterFlowAdapterResponse) this.WinterFlowTransactionAgent;
                WinterFlowRequestComponent winterFlowRequestComponent = (WinterFlowRequestComponent) obj4;
                WinterFlowCacheManagerNode winterFlowCacheManagerNode2 = (WinterFlowCacheManagerNode) winterFlowRequestComponent.WinterFlowVariableBandwidth.WinterFlowTransactionManagerStrategy;
                WinterFlowEncryptionEngine winterFlowEncryptionEngine = new WinterFlowEncryptionEngine(i2, winterFlowRequestComponent, winterFlowAdapterResponse2);
                this.WinterFlowResponseEngine = 1;
                WinterFlowCacheManagerNode.WinterFlowTransactionAgent(winterFlowCacheManagerNode2, winterFlowEncryptionEngine, this);
                return winterFlowListenerJava;
            case 23:
                int i28 = this.WinterFlowResponseEngine;
                if (i28 != 0) {
                    if (i28 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return obj;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                if (((WinterFlowAdapterResponse) this.WinterFlowTransactionAgent).WinterFlowRouterRouter().WinterFlowConsumerUserManager(WinterFlowUIBackend.WinterFlowTransactionManagerStrategy) == null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Expected a TransactionElement in the CoroutineContext but none was found.");
                    return null;
                }
                this.WinterFlowResponseEngine = 1;
                Object WinterFlowUnitTestResponse = ((WinterFlowObjectSession) obj4).WinterFlowUnitTestResponse(this);
                return WinterFlowUnitTestResponse == winterFlowListenerJava ? winterFlowListenerJava : WinterFlowUnitTestResponse;
            case 24:
                int i29 = this.WinterFlowResponseEngine;
                if (i29 != 0) {
                    if (i29 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    throw new WinterFlowServerSystem();
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowRuntimeProtocol winterFlowRuntimeProtocol = ((WinterFlowRequestHandler) this.WinterFlowTransactionAgent).WinterFlowTransactionManagerStrategy;
                WinterFlowCloudComponent winterFlowCloudComponent2 = new WinterFlowCloudComponent(i2, (RunningActivity) obj4);
                this.WinterFlowResponseEngine = 1;
                winterFlowRuntimeProtocol.WinterFlowVariableVersionControl.WinterFlowRouterStructure(winterFlowCloudComponent2, this);
                return winterFlowListenerJava;
            case 25:
                int i30 = this.WinterFlowResponseEngine;
                if (i30 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowAlgorithmDebug winterFlowAlgorithmDebug = WinterFlowAlgorithmProtocol.WinterFlowVariableVersionControl;
                    long WinterFlowModuleAgent = WinterFlowSoftwareException.WinterFlowModuleAgent(500, WinterFlowCacheManagerSystem.MILLISECONDS);
                    this.WinterFlowResponseEngine = 1;
                    Object WinterFlowSerializerStructure = WinterFlowManagerRequest.WinterFlowSerializerStructure(WinterFlowManagerRequest.WinterFlowUIMiddleware(WinterFlowModuleAgent), this);
                    if (WinterFlowSerializerStructure != winterFlowListenerJava) {
                        WinterFlowSerializerStructure = winterFlowAlgorithmSession;
                    }
                    if (WinterFlowSerializerStructure == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i30 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                WinterFlowSerializerLayer winterFlowSerializerLayer = (WinterFlowSerializerLayer) this.WinterFlowTransactionAgent;
                String WinterFlowHookQuery = WinterFlowSerializerUtility.WinterFlowHookQuery(((RunningActivity) obj4).WinterFlowEventEmitterController, "", null, null, null, 62);
                WinterFlowControllerModule winterFlowControllerModule = winterFlowSerializerLayer.WinterFlowOrchestrationSubsystem.WinterFlowRouterStructure;
                if (winterFlowControllerModule != null) {
                    winterFlowControllerModule.WinterFlowSessionManagerInterface(WinterFlowHookQuery);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Launcher has not been initialized");
                return winterFlowAlgorithmSession;
            case 26:
                int i31 = this.WinterFlowResponseEngine;
                if (i31 != 0) {
                    if (i31 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return winterFlowAlgorithmSession;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowResponsePackage winterFlowResponsePackage = (WinterFlowResponsePackage) this.WinterFlowTransactionAgent;
                float f = winterFlowResponsePackage.WinterFlowHookDataSource ? -1.0f : 1.0f;
                WinterFlowTransactionManagerService winterFlowTransactionManagerService3 = ((WinterFlowConcurrencyThread) obj4).WinterFlowCacheTool;
                long j3 = winterFlowResponsePackage.WinterFlowRouterStructure;
                float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) * f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f;
                long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L;
                this.WinterFlowResponseEngine = 1;
                return winterFlowTransactionManagerService3.WinterFlowHookDataSource(floatToRawIntBits2 | (floatToRawIntBits << 32), false, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
            case 27:
                WinterFlowStackProvider winterFlowStackProvider = (WinterFlowStackProvider) obj4;
                int i32 = this.WinterFlowResponseEngine;
                if (i32 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    if (((AtomicInteger) ((WinterFlowJSONDecorator) winterFlowStackProvider.WinterFlowRouterRouter).WinterFlowTransactionManagerStrategy).get() <= 0) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Check failed.");
                    }
                    WinterFlowInvokerComponent.WinterFlowRouterAdapter(((WinterFlowAdapterResponse) winterFlowStackProvider.WinterFlowVariableVersionControl).WinterFlowRouterRouter());
                    winterFlowModuleStack = (WinterFlowModuleStack) winterFlowStackProvider.WinterFlowTransactionManagerStrategy;
                    WinterFlowWorkerThreadPool winterFlowWorkerThreadPool3 = (WinterFlowWorkerThreadPool) winterFlowStackProvider.WinterFlowUnitTestResponse;
                    this.WinterFlowTransactionAgent = winterFlowModuleStack;
                    this.WinterFlowResponseEngine = 1;
                    obj3 = winterFlowWorkerThreadPool3.WinterFlowVariableVersionControl(this);
                } else if (i32 == 1) {
                    winterFlowModuleStack = (WinterFlowModuleStack) this.WinterFlowTransactionAgent;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    obj3 = obj;
                    this.WinterFlowTransactionAgent = null;
                    this.WinterFlowResponseEngine = 2;
                    break;
                } else if (i32 == 2) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    if (((AtomicInteger) ((WinterFlowJSONDecorator) winterFlowStackProvider.WinterFlowRouterRouter).WinterFlowTransactionManagerStrategy).decrementAndGet() == 0) {
                        return winterFlowAlgorithmSession;
                    }
                    WinterFlowInvokerComponent.WinterFlowRouterAdapter(((WinterFlowAdapterResponse) winterFlowStackProvider.WinterFlowVariableVersionControl).WinterFlowRouterRouter());
                    winterFlowModuleStack = (WinterFlowModuleStack) winterFlowStackProvider.WinterFlowTransactionManagerStrategy;
                    WinterFlowWorkerThreadPool winterFlowWorkerThreadPool32 = (WinterFlowWorkerThreadPool) winterFlowStackProvider.WinterFlowUnitTestResponse;
                    this.WinterFlowTransactionAgent = winterFlowModuleStack;
                    this.WinterFlowResponseEngine = 1;
                    obj3 = winterFlowWorkerThreadPool32.WinterFlowVariableVersionControl(this);
                    break;
                } else {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 28:
                int i33 = this.WinterFlowResponseEngine;
                if (i33 != 0) {
                    if (i33 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return winterFlowAlgorithmSession;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowEventProvider winterFlowEventProvider = (WinterFlowEventProvider) this.WinterFlowTransactionAgent;
                WinterFlowRendererProtocol winterFlowRendererProtocol = new WinterFlowRendererProtocol((WinterFlowSoftwareProtocol) obj4, 1);
                this.WinterFlowResponseEngine = 1;
                return winterFlowEventProvider.WinterFlowRouterStructure(winterFlowRendererProtocol, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
            default:
                int i34 = this.WinterFlowResponseEngine;
                if (i34 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    return WinterFlowRendererRefactoring.WinterFlowRouterStructure((WinterFlowRendererRefactoring) ((WinterFlowRepositoryFramework) this.WinterFlowTransactionAgent).WinterFlowCacheManagerAgent, new Float(0.0f), (WinterFlowModuleSingleton) obj4, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i34 == 1) {
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
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 1:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 2:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 3:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 4:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowGatewayClass) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowCacheInterface) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 9:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 10:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowConsumerMechanism) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 11:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 12:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowCacheManagerMiddleware) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 13:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 14:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 15:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 16:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 17:
                ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                return winterFlowListenerJava;
            case 18:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 19:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 20:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 21:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 22:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 23:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 24:
                ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                return winterFlowListenerJava;
            case 25:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 26:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 27:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 28:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return ((WinterFlowModuleStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowModuleStack(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowServerProtocol = obj;
    }
}
