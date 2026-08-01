package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBackendLayer extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowEventEvent WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowThreadPoolGateway WinterFlowThreadListener;
    public /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowBackendLayer(WinterFlowEventEvent winterFlowEventEvent, WinterFlowThreadPoolGateway winterFlowThreadPoolGateway, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowServerProtocol = winterFlowEventEvent;
        this.WinterFlowThreadListener = winterFlowThreadPoolGateway;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        switch (this.WinterFlowSyntax) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowBackendLayer winterFlowBackendLayer = new WinterFlowBackendLayer(this.WinterFlowServerProtocol, this.WinterFlowThreadListener, winterFlowTransactionManagerLayer, 0);
                winterFlowBackendLayer.WinterFlowTransactionAgent = obj;
                return winterFlowBackendLayer;
            default:
                WinterFlowBackendLayer winterFlowBackendLayer2 = new WinterFlowBackendLayer(this.WinterFlowServerProtocol, this.WinterFlowThreadListener, winterFlowTransactionManagerLayer, 1);
                winterFlowBackendLayer2.WinterFlowTransactionAgent = obj;
                return winterFlowBackendLayer2;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowThreadPoolGateway winterFlowThreadPoolGateway = this.WinterFlowThreadListener;
        WinterFlowEventEvent winterFlowEventEvent = this.WinterFlowServerProtocol;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowSoftwareProtocol winterFlowSoftwareProtocol = new WinterFlowSoftwareProtocol(winterFlowThreadPoolGateway, ((WinterFlowAdapterResponse) this.WinterFlowTransactionAgent).WinterFlowRouterRouter());
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowSoftwareProtocol, this) == winterFlowListenerJava) {
                        break;
                    }
                } else if (i2 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                break;
            default:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowSoftwareProtocol winterFlowSoftwareProtocol2 = new WinterFlowSoftwareProtocol(winterFlowThreadPoolGateway, ((WinterFlowAdapterResponse) this.WinterFlowTransactionAgent).WinterFlowRouterRouter());
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowSoftwareProtocol2, this) == winterFlowListenerJava) {
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
        return ((WinterFlowBackendLayer) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowAdapterResponse)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
    }
}
