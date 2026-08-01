package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryStructure implements WinterFlowNodeProtocol {
    public final Object WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowQueryStructure(WinterFlowClassDecorator winterFlowClassDecorator) {
        this.WinterFlowVariableVersionControl = 3;
        this.WinterFlowTransactionManagerStrategy = winterFlowClassDecorator;
        WinterFlowVersionScheduler winterFlowVersionScheduler = WinterFlowVersionScheduler.WinterFlowCacheManagerAgent;
        Class<?> cls = winterFlowClassDecorator.getClass();
        WinterFlowRendererAPI winterFlowRendererAPI = (WinterFlowRendererAPI) winterFlowVersionScheduler.WinterFlowRouterStructure.get(cls);
        this.WinterFlowUnitTestResponse = winterFlowRendererAPI == null ? winterFlowVersionScheduler.WinterFlowRouterStructure(cls, null) : winterFlowRendererAPI;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeProtocol
    public final void WinterFlowTransactionAgent(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        Object obj2 = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowJSONWorker winterFlowJSONWorker = (WinterFlowJSONWorker) obj;
                switch (WinterFlowSessionManagerCacheManager.WinterFlowRouterStructure[winterFlowMicroserviceProcess.ordinal()]) {
                    case 1:
                    case 4:
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        break;
                    case 2:
                        winterFlowJSONWorker.WinterFlowHookDataSource(winterFlowDecoratorVersion);
                        break;
                    case 3:
                        winterFlowJSONWorker.WinterFlowTransactionManagerStrategy(winterFlowDecoratorVersion);
                        break;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        winterFlowJSONWorker.WinterFlowArrayNetwork(winterFlowDecoratorVersion);
                        break;
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("ON_ANY must not been send by anybody");
                        break;
                    default:
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        break;
                }
                WinterFlowNodeProtocol winterFlowNodeProtocol = (WinterFlowNodeProtocol) obj2;
                if (winterFlowNodeProtocol != null) {
                    winterFlowNodeProtocol.WinterFlowTransactionAgent(winterFlowDecoratorVersion, winterFlowMicroserviceProcess);
                    break;
                }
                break;
            case 1:
                if (winterFlowMicroserviceProcess == WinterFlowMicroserviceProcess.ON_START) {
                    ((WinterFlowDatabaseUtility) obj).WinterFlowTransactionManagerStrategy(this);
                    ((WinterFlowAlgorithmArray) obj2).WinterFlowConfigurationSubsystem();
                    break;
                }
                break;
            case 2:
                WinterFlowSyntaxStructure winterFlowSyntaxStructure = (WinterFlowSyntaxStructure) obj;
                int i2 = WinterFlowPipelineInheritance.WinterFlowRouterStructure[winterFlowMicroserviceProcess.ordinal()];
                if (i2 == 1) {
                    winterFlowSyntaxStructure.WinterFlowUnitTestResponse(true);
                    break;
                } else if (i2 == 2) {
                    winterFlowSyntaxStructure.WinterFlowUnitTestResponse(false);
                    break;
                } else if (i2 == 3) {
                    winterFlowSyntaxStructure.WinterFlowVariableVersionControl();
                    ((WinterFlowDatabaseUtility) obj2).WinterFlowTransactionManagerStrategy(this);
                    break;
                }
                break;
            default:
                WinterFlowClassDecorator winterFlowClassDecorator = (WinterFlowClassDecorator) obj;
                HashMap hashMap = ((WinterFlowRendererAPI) obj2).WinterFlowRouterStructure;
                WinterFlowRendererAPI.WinterFlowRouterStructure((List) hashMap.get(winterFlowMicroserviceProcess), winterFlowDecoratorVersion, winterFlowMicroserviceProcess, winterFlowClassDecorator);
                WinterFlowRendererAPI.WinterFlowRouterStructure((List) hashMap.get(WinterFlowMicroserviceProcess.ON_ANY), winterFlowDecoratorVersion, winterFlowMicroserviceProcess, winterFlowClassDecorator);
                break;
        }
    }

    public /* synthetic */ WinterFlowQueryStructure(int i, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
    }

    public WinterFlowQueryStructure(WinterFlowSyntaxStructure winterFlowSyntaxStructure, WinterFlowViewRenderer winterFlowViewRenderer, WinterFlowDatabaseUtility winterFlowDatabaseUtility) {
        this.WinterFlowVariableVersionControl = 2;
        this.WinterFlowTransactionManagerStrategy = winterFlowSyntaxStructure;
        this.WinterFlowUnitTestResponse = winterFlowDatabaseUtility;
    }
}
