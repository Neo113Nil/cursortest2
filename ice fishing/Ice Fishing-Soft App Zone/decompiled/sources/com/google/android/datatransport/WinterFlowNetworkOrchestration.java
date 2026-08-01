package com.google.android.datatransport;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.R;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNetworkOrchestration extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ Object WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowNetworkOrchestration(Object obj, Object obj2, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
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
                return new WinterFlowNetworkOrchestration((WinterFlowGatewaySession) this.WinterFlowTransactionAgent, (WinterFlowObjectUI) obj2, winterFlowTransactionManagerLayer, 0);
            case 1:
                WinterFlowNetworkOrchestration winterFlowNetworkOrchestration = new WinterFlowNetworkOrchestration((WinterFlowCacheInterface) obj2, winterFlowTransactionManagerLayer);
                winterFlowNetworkOrchestration.WinterFlowTransactionAgent = obj;
                return winterFlowNetworkOrchestration;
            default:
                return new WinterFlowNetworkOrchestration((WinterFlowBackendService) this.WinterFlowTransactionAgent, (View) obj2, winterFlowTransactionManagerLayer, 2);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        Object obj2 = this.WinterFlowServerProtocol;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowObjectUI winterFlowObjectUI = (WinterFlowObjectUI) obj2;
                int i2 = this.WinterFlowResponseEngine;
                try {
                    if (i2 == 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        WinterFlowGatewaySession winterFlowGatewaySession = (WinterFlowGatewaySession) this.WinterFlowTransactionAgent;
                        this.WinterFlowResponseEngine = 1;
                        obj = winterFlowGatewaySession.WinterFlowHookDataSource(this);
                        if (obj == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                    } else {
                        if (i2 != 1) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    }
                    return winterFlowAlgorithmSession;
                } finally {
                    winterFlowObjectUI.WinterFlowRouterStructure();
                }
            case 1:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    Object obj3 = this.WinterFlowTransactionAgent;
                    this.WinterFlowResponseEngine = 1;
                    if (((WinterFlowCacheInterface) obj2).WinterFlowRouterRouter(obj3, this) == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i3 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                return winterFlowAlgorithmSession;
            default:
                WinterFlowBackendService winterFlowBackendService = (WinterFlowBackendService) this.WinterFlowTransactionAgent;
                View view = (View) obj2;
                int i4 = this.WinterFlowResponseEngine;
                try {
                    if (i4 == 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        this.WinterFlowResponseEngine = 1;
                        Object WinterFlowTransactionAgent = WinterFlowQuerySyntax.WinterFlowTransactionAgent(winterFlowBackendService.WinterFlowRouterAdapter, new WinterFlowConcurrencyMiddleware(2, null, 1), this);
                        if (WinterFlowTransactionAgent != winterFlowListenerJava) {
                            WinterFlowTransactionAgent = winterFlowAlgorithmSession;
                        }
                        if (WinterFlowTransactionAgent == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                    } else {
                        if (i4 != 1) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    }
                    if (WinterFlowDeserializationSystem.WinterFlowRouterStructure(view) == winterFlowBackendService) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                    return winterFlowAlgorithmSession;
                } finally {
                    if (WinterFlowDeserializationSystem.WinterFlowRouterStructure(view) == winterFlowBackendService) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowNetworkOrchestration) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 1:
                return ((WinterFlowNetworkOrchestration) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return ((WinterFlowNetworkOrchestration) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowNetworkOrchestration(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = 1;
        this.WinterFlowServerProtocol = winterFlowCacheInterface;
    }
}
