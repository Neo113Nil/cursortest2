package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowConfigurationSession implements WinterFlowConsumerProcess {
    public final int WinterFlowTransactionManagerStrategy;
    public final WinterFlowDataSourceHandler WinterFlowUnitTestResponse;
    public final WinterFlowEncryptionMicroservice WinterFlowVariableVersionControl;

    public WinterFlowConfigurationSession(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        this.WinterFlowVariableVersionControl = winterFlowEncryptionMicroservice;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowDataSourceHandler;
    }

    public abstract Object WinterFlowArrayNetwork(WinterFlowGatewayClass winterFlowGatewayClass, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer);

    public String WinterFlowCacheManagerAgent() {
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowConsumerProcess
    public final WinterFlowEventProvider WinterFlowHookDataSource(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice2 = this.WinterFlowVariableVersionControl;
        WinterFlowEncryptionMicroservice WinterFlowOrchestrationSubsystem = winterFlowEncryptionMicroservice.WinterFlowOrchestrationSubsystem(winterFlowEncryptionMicroservice2);
        WinterFlowDataSourceHandler winterFlowDataSourceHandler2 = WinterFlowDataSourceHandler.WinterFlowVariableVersionControl;
        WinterFlowDataSourceHandler winterFlowDataSourceHandler3 = this.WinterFlowUnitTestResponse;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (winterFlowDataSourceHandler == winterFlowDataSourceHandler2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            winterFlowDataSourceHandler = winterFlowDataSourceHandler3;
        }
        return (WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowOrchestrationSubsystem, winterFlowEncryptionMicroservice2) && i == i2 && winterFlowDataSourceHandler == winterFlowDataSourceHandler3) ? this : WinterFlowVariableVersionControl(WinterFlowOrchestrationSubsystem, i, winterFlowDataSourceHandler);
    }

    @Override // com.google.android.datatransport.WinterFlowEventProvider
    public Object WinterFlowRouterStructure(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        Object WinterFlowOrchestrationSubsystem = WinterFlowEncryptionSubsystem.WinterFlowOrchestrationSubsystem(new WinterFlowMapperJava(winterFlowCacheInterface, this, null, 3), winterFlowTransactionManagerLayer);
        return WinterFlowOrchestrationSubsystem == WinterFlowListenerJava.WinterFlowVariableVersionControl ? WinterFlowOrchestrationSubsystem : WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    public WinterFlowEventProvider WinterFlowTransactionManagerStrategy() {
        return null;
    }

    public WinterFlowFrameworkAgent WinterFlowUnitTestResponse(WinterFlowAdapterResponse winterFlowAdapterResponse) {
        int i = this.WinterFlowTransactionManagerStrategy;
        if (i == -3) {
            i = -2;
        }
        WinterFlowEventEvent winterFlowModuleStack = new WinterFlowModuleStack(this, null, 4);
        WinterFlowWorkerThreadPool WinterFlowRouterStructure = WinterFlowHandlerWebsocket.WinterFlowRouterStructure(i, 4, this.WinterFlowUnitTestResponse);
        WinterFlowEncryptionMicroservice WinterFlowRouterAdapter = WinterFlowUnitTestLibrary.WinterFlowRouterAdapter(winterFlowAdapterResponse.WinterFlowRouterRouter(), this.WinterFlowVariableVersionControl, true);
        WinterFlowCacheDecorator winterFlowCacheDecorator = WinterFlowInheritanceUtility.WinterFlowRouterStructure;
        if (WinterFlowRouterAdapter != winterFlowCacheDecorator && WinterFlowRouterAdapter.WinterFlowConsumerUserManager(WinterFlowCacheUtility.WinterFlowMapperProtocol) == null) {
            WinterFlowRouterAdapter = WinterFlowRouterAdapter.WinterFlowOrchestrationSubsystem(winterFlowCacheDecorator);
        }
        WinterFlowGatewayClass winterFlowGatewayClass = new WinterFlowGatewayClass(WinterFlowRouterAdapter, WinterFlowRouterStructure);
        winterFlowGatewayClass.WinterFlowStrategyHook(WinterFlowModuleProxy.WinterFlowUnitTestResponse, winterFlowGatewayClass, winterFlowModuleStack);
        return winterFlowGatewayClass;
    }

    public abstract WinterFlowConfigurationSession WinterFlowVariableVersionControl(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler);

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent();
        if (WinterFlowCacheManagerAgent != null) {
            arrayList.add(WinterFlowCacheManagerAgent);
        }
        WinterFlowEventEmitterPackage winterFlowEventEmitterPackage = WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl;
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = this.WinterFlowVariableVersionControl;
        if (winterFlowEncryptionMicroservice != winterFlowEventEmitterPackage) {
            arrayList.add("context=" + winterFlowEncryptionMicroservice);
        }
        int i = this.WinterFlowTransactionManagerStrategy;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        WinterFlowDataSourceHandler winterFlowDataSourceHandler = WinterFlowDataSourceHandler.WinterFlowVariableVersionControl;
        WinterFlowDataSourceHandler winterFlowDataSourceHandler2 = this.WinterFlowUnitTestResponse;
        if (winterFlowDataSourceHandler2 != winterFlowDataSourceHandler) {
            arrayList.add("onBufferOverflow=" + winterFlowDataSourceHandler2);
        }
        return getClass().getSimpleName() + '[' + WinterFlowSerializerUtility.WinterFlowHookQuery(arrayList, ", ", null, null, null, 62) + ']';
    }
}
