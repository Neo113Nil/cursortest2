package com.google.android.datatransport;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperProcess implements PointerInputEventHandler {
    public final /* synthetic */ WinterFlowThreadPoolGateway WinterFlowArrayNetwork;
    public final /* synthetic */ WinterFlowObjectHandler WinterFlowCacheManagerAgent;
    public final /* synthetic */ WinterFlowWorkerTransaction WinterFlowHookDataSource;
    public final /* synthetic */ WinterFlowObjectLayer WinterFlowRouterStructure;

    public WinterFlowMapperProcess(WinterFlowObjectLayer winterFlowObjectLayer, WinterFlowWorkerTransaction winterFlowWorkerTransaction, WinterFlowObjectHandler winterFlowObjectHandler, WinterFlowThreadPoolGateway winterFlowThreadPoolGateway) {
        this.WinterFlowRouterStructure = winterFlowObjectLayer;
        this.WinterFlowHookDataSource = winterFlowWorkerTransaction;
        this.WinterFlowCacheManagerAgent = winterFlowObjectHandler;
        this.WinterFlowArrayNetwork = winterFlowThreadPoolGateway;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(WinterFlowInheritance winterFlowInheritance, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowObjectLayer winterFlowObjectLayer = this.WinterFlowRouterStructure;
        WinterFlowWorkerTransaction winterFlowWorkerTransaction = this.WinterFlowHookDataSource;
        WinterFlowDeserializationListener winterFlowDeserializationListener = new WinterFlowDeserializationListener(winterFlowObjectLayer, winterFlowWorkerTransaction, this.WinterFlowCacheManagerAgent, this.WinterFlowArrayNetwork);
        WinterFlowAPIVersionControl winterFlowAPIVersionControl = new WinterFlowAPIVersionControl(3, winterFlowObjectLayer, winterFlowWorkerTransaction);
        float f = WinterFlowSessionParser.WinterFlowRouterStructure;
        WinterFlowInterfaceSoftware winterFlowInterfaceSoftware = new WinterFlowInterfaceSoftware(10);
        Object WinterFlowUnitTestResponse = WinterFlowEncryptionSubsystem.WinterFlowUnitTestResponse(winterFlowInheritance, new WinterFlowSessionTool(new WinterFlowDeploymentEngine(8), new WinterFlowXMLArray(winterFlowInterfaceSoftware), winterFlowAPIVersionControl, new WinterFlowDeploymentEngine(7), new WinterFlowCompilerCloud(4, winterFlowDeserializationListener), null), winterFlowTransactionManagerLayer);
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (WinterFlowUnitTestResponse != winterFlowListenerJava) {
            WinterFlowUnitTestResponse = winterFlowAlgorithmSession;
        }
        return WinterFlowUnitTestResponse == winterFlowListenerJava ? WinterFlowUnitTestResponse : winterFlowAlgorithmSession;
    }
}
