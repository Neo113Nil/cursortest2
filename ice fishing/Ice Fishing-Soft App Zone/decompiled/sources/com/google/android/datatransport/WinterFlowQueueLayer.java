package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueueLayer extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ Object WinterFlowResponseEngine;
    public final /* synthetic */ int WinterFlowSyntax;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowQueueLayer(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowResponseEngine = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowResponseEngine;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowQueueLayer((WinterFlowDataSourceConsumer) obj2, winterFlowTransactionManagerLayer, 0);
            case 1:
                return new WinterFlowQueueLayer((WinterFlowDataSourceConsumer) obj2, winterFlowTransactionManagerLayer, 1);
            default:
                return new WinterFlowQueueLayer((WinterFlowObjectUI) obj2, winterFlowTransactionManagerLayer, 2);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowResponseEngine;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowDataSourceConsumer winterFlowDataSourceConsumer = (WinterFlowDataSourceConsumer) obj2;
                if (winterFlowDataSourceConsumer.WinterFlowConfigurationSubsystem == null) {
                    WinterFlowUserManagerWorker winterFlowUserManagerWorker = new WinterFlowUserManagerWorker();
                    WinterFlowJSONDecorator winterFlowJSONDecorator = winterFlowDataSourceConsumer.WinterFlowRouterAdapter;
                    if (winterFlowJSONDecorator != null) {
                        WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowDataSourceConsumer.WinterFlowModuleService(), null, new WinterFlowModuleStack(winterFlowJSONDecorator, winterFlowUserManagerWorker, null, 0), 3);
                    }
                    winterFlowDataSourceConsumer.WinterFlowConfigurationSubsystem = winterFlowUserManagerWorker;
                    break;
                }
                break;
            case 1:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowDataSourceConsumer winterFlowDataSourceConsumer2 = (WinterFlowDataSourceConsumer) obj2;
                WinterFlowUserManagerWorker winterFlowUserManagerWorker2 = winterFlowDataSourceConsumer2.WinterFlowConfigurationSubsystem;
                if (winterFlowUserManagerWorker2 != null) {
                    WinterFlowBandwidthModule winterFlowBandwidthModule = new WinterFlowBandwidthModule(winterFlowUserManagerWorker2);
                    WinterFlowJSONDecorator winterFlowJSONDecorator2 = winterFlowDataSourceConsumer2.WinterFlowRouterAdapter;
                    if (winterFlowJSONDecorator2 != null) {
                        WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowDataSourceConsumer2.WinterFlowModuleService(), null, new WinterFlowModuleStack(winterFlowJSONDecorator2, winterFlowBandwidthModule, null, 1), 3);
                    }
                    winterFlowDataSourceConsumer2.WinterFlowConfigurationSubsystem = null;
                    break;
                }
                break;
            default:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                ((WinterFlowObjectUI) obj2).WinterFlowRouterStructure();
                break;
        }
        return winterFlowAlgorithmSession;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) obj;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = (WinterFlowTransactionManagerLayer) obj2;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowQueueLayer) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowAdapterResponse)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                break;
            case 1:
                ((WinterFlowQueueLayer) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowAdapterResponse)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                break;
            default:
                ((WinterFlowQueueLayer) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowAdapterResponse)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
