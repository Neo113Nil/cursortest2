package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUserManagerFunction extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowDebugVersion WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowDataSourceConsumer WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowUserManagerFunction(WinterFlowDataSourceConsumer winterFlowDataSourceConsumer, WinterFlowDebugVersion winterFlowDebugVersion, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = winterFlowDataSourceConsumer;
        this.WinterFlowServerProtocol = winterFlowDebugVersion;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowDebugVersion winterFlowDebugVersion = this.WinterFlowServerProtocol;
        WinterFlowDataSourceConsumer winterFlowDataSourceConsumer = this.WinterFlowTransactionAgent;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowUserManagerFunction(winterFlowDataSourceConsumer, winterFlowDebugVersion, winterFlowTransactionManagerLayer, 0);
            case 1:
                return new WinterFlowUserManagerFunction(winterFlowDataSourceConsumer, winterFlowDebugVersion, winterFlowTransactionManagerLayer, 1);
            case 2:
                return new WinterFlowUserManagerFunction(winterFlowDataSourceConsumer, winterFlowDebugVersion, winterFlowTransactionManagerLayer, 2);
            default:
                return new WinterFlowUserManagerFunction(winterFlowDataSourceConsumer, winterFlowDebugVersion, winterFlowTransactionManagerLayer, 3);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowDebugVersion winterFlowDebugVersion = this.WinterFlowServerProtocol;
        WinterFlowDataSourceConsumer winterFlowDataSourceConsumer = this.WinterFlowTransactionAgent;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowJSONDecorator winterFlowJSONDecorator = winterFlowDataSourceConsumer.WinterFlowRouterAdapter;
                    if (winterFlowJSONDecorator != null) {
                        WinterFlowJSONService winterFlowJSONService = new WinterFlowJSONService(winterFlowDebugVersion);
                        this.WinterFlowResponseEngine = 1;
                        if (winterFlowJSONDecorator.WinterFlowArrayNetwork(winterFlowJSONService, this) == winterFlowListenerJava) {
                            break;
                        }
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
                    WinterFlowJSONDecorator winterFlowJSONDecorator2 = winterFlowDataSourceConsumer.WinterFlowRouterAdapter;
                    if (winterFlowJSONDecorator2 != null) {
                        WinterFlowJSONService winterFlowJSONService2 = new WinterFlowJSONService(winterFlowDebugVersion);
                        this.WinterFlowResponseEngine = 1;
                        if (winterFlowJSONDecorator2.WinterFlowArrayNetwork(winterFlowJSONService2, this) == winterFlowListenerJava) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                break;
            case 2:
                int i4 = this.WinterFlowResponseEngine;
                if (i4 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowJSONDecorator winterFlowJSONDecorator3 = winterFlowDataSourceConsumer.WinterFlowRouterAdapter;
                    if (winterFlowJSONDecorator3 != null) {
                        this.WinterFlowResponseEngine = 1;
                        if (winterFlowJSONDecorator3.WinterFlowArrayNetwork(winterFlowDebugVersion, this) == winterFlowListenerJava) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                break;
            default:
                int i5 = this.WinterFlowResponseEngine;
                if (i5 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowJSONDecorator winterFlowJSONDecorator4 = winterFlowDataSourceConsumer.WinterFlowRouterAdapter;
                    if (winterFlowJSONDecorator4 != null) {
                        WinterFlowHookServiceProvider winterFlowHookServiceProvider = new WinterFlowHookServiceProvider(winterFlowDebugVersion);
                        this.WinterFlowResponseEngine = 1;
                        if (winterFlowJSONDecorator4.WinterFlowArrayNetwork(winterFlowHookServiceProvider, this) == winterFlowListenerJava) {
                            break;
                        }
                    }
                } else if (i5 != 1) {
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
        return ((WinterFlowUserManagerFunction) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowAdapterResponse)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
    }
}
