package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadPoolProtocol extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowDebugVersion WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowJSONDecorator WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowThreadPoolProtocol(WinterFlowDebugVersion winterFlowDebugVersion, WinterFlowJSONDecorator winterFlowJSONDecorator, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = 0;
        this.WinterFlowServerProtocol = winterFlowDebugVersion;
        this.WinterFlowTransactionAgent = winterFlowJSONDecorator;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowDebugVersion winterFlowDebugVersion = this.WinterFlowServerProtocol;
        WinterFlowJSONDecorator winterFlowJSONDecorator = this.WinterFlowTransactionAgent;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowThreadPoolProtocol(winterFlowDebugVersion, winterFlowJSONDecorator, winterFlowTransactionManagerLayer);
            case 1:
                return new WinterFlowThreadPoolProtocol(winterFlowJSONDecorator, winterFlowDebugVersion, winterFlowTransactionManagerLayer, 1);
            default:
                return new WinterFlowThreadPoolProtocol(winterFlowJSONDecorator, winterFlowDebugVersion, winterFlowTransactionManagerLayer, 2);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowDebugVersion winterFlowDebugVersion = this.WinterFlowServerProtocol;
        WinterFlowJSONDecorator winterFlowJSONDecorator = this.WinterFlowTransactionAgent;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowHookServiceProvider winterFlowHookServiceProvider = new WinterFlowHookServiceProvider(winterFlowDebugVersion);
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowJSONDecorator.WinterFlowArrayNetwork(winterFlowHookServiceProvider, this) == winterFlowListenerJava) {
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
            case 1:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowJSONDecorator.WinterFlowArrayNetwork(winterFlowDebugVersion, this) == winterFlowListenerJava) {
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
            default:
                int i4 = this.WinterFlowResponseEngine;
                if (i4 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowJSONDecorator.WinterFlowArrayNetwork(winterFlowDebugVersion, this) == winterFlowListenerJava) {
                        break;
                    }
                } else if (i4 != 1) {
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
        return ((WinterFlowThreadPoolProtocol) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowAdapterResponse)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowThreadPoolProtocol(WinterFlowJSONDecorator winterFlowJSONDecorator, WinterFlowDebugVersion winterFlowDebugVersion, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = winterFlowJSONDecorator;
        this.WinterFlowServerProtocol = winterFlowDebugVersion;
    }
}
