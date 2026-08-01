package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowSessionEntity extends WinterFlowConfigurationSession {
    public final WinterFlowEventProvider WinterFlowRouterRouter;

    public WinterFlowSessionEntity(WinterFlowEventProvider winterFlowEventProvider, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        super(winterFlowEncryptionMicroservice, i, winterFlowDataSourceHandler);
        this.WinterFlowRouterRouter = winterFlowEventProvider;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationSession
    public final Object WinterFlowArrayNetwork(WinterFlowGatewayClass winterFlowGatewayClass, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        Object WinterFlowRouterRouter = WinterFlowRouterRouter(new WinterFlowProcessorLoader(winterFlowGatewayClass), winterFlowTransactionManagerLayer);
        return WinterFlowRouterRouter == WinterFlowListenerJava.WinterFlowVariableVersionControl ? WinterFlowRouterRouter : WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    public abstract Object WinterFlowRouterRouter(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer);

    @Override // com.google.android.datatransport.WinterFlowConfigurationSession, com.google.android.datatransport.WinterFlowEventProvider
    public final Object WinterFlowRouterStructure(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i == -3) {
            WinterFlowEncryptionMicroservice context = winterFlowTransactionManagerLayer.getContext();
            Boolean bool = Boolean.FALSE;
            WinterFlowHandlerTool winterFlowHandlerTool = new WinterFlowHandlerTool(9);
            WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = this.WinterFlowVariableVersionControl;
            WinterFlowEncryptionMicroservice WinterFlowOrchestrationSubsystem = !((Boolean) winterFlowEncryptionMicroservice.WinterFlowServiceUtility(winterFlowHandlerTool, bool)).booleanValue() ? context.WinterFlowOrchestrationSubsystem(winterFlowEncryptionMicroservice) : WinterFlowUnitTestLibrary.WinterFlowRouterAdapter(context, winterFlowEncryptionMicroservice, false);
            if (WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowOrchestrationSubsystem, context)) {
                Object WinterFlowRouterRouter = WinterFlowRouterRouter(winterFlowCacheInterface, winterFlowTransactionManagerLayer);
                if (WinterFlowRouterRouter == winterFlowListenerJava) {
                    return WinterFlowRouterRouter;
                }
            } else {
                WinterFlowCacheUtility winterFlowCacheUtility = WinterFlowCacheUtility.WinterFlowMapperProtocol;
                if (WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowOrchestrationSubsystem.WinterFlowConsumerUserManager(winterFlowCacheUtility), context.WinterFlowConsumerUserManager(winterFlowCacheUtility))) {
                    WinterFlowEncryptionMicroservice context2 = winterFlowTransactionManagerLayer.getContext();
                    if (!(winterFlowCacheInterface instanceof WinterFlowProcessorLoader) && !(winterFlowCacheInterface instanceof WinterFlowSchedulerService)) {
                        winterFlowCacheInterface = new WinterFlowSessionManagerTool(winterFlowCacheInterface, context2);
                    }
                    Object WinterFlowProxyStructure = WinterFlowEncryptionSubsystem.WinterFlowProxyStructure(WinterFlowOrchestrationSubsystem, winterFlowCacheInterface, WinterFlowInvokerComponent.WinterFlowProxyStructure(WinterFlowOrchestrationSubsystem), new WinterFlowModuleStack(this, null, 5), winterFlowTransactionManagerLayer);
                    if (WinterFlowProxyStructure == winterFlowListenerJava) {
                        return WinterFlowProxyStructure;
                    }
                }
            }
            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
        Object WinterFlowRouterStructure = super.WinterFlowRouterStructure(winterFlowCacheInterface, winterFlowTransactionManagerLayer);
        if (WinterFlowRouterStructure == winterFlowListenerJava) {
            return WinterFlowRouterStructure;
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationSession
    public final String toString() {
        return this.WinterFlowRouterRouter + " -> " + super.toString();
    }
}
