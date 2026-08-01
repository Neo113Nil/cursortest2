package com.google.android.datatransport;

import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUnitTestFrontend extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowCloudMicroservice WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowConfigurationSubsystem WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowUnitTestFrontend(WinterFlowConfigurationSubsystem winterFlowConfigurationSubsystem, WinterFlowCloudMicroservice winterFlowCloudMicroservice, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = winterFlowConfigurationSubsystem;
        this.WinterFlowServerProtocol = winterFlowCloudMicroservice;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        switch (this.WinterFlowSyntax) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowUnitTestFrontend(this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, winterFlowTransactionManagerLayer, 0);
            default:
                return new WinterFlowUnitTestFrontend(this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, winterFlowTransactionManagerLayer, 1);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowCloudMicroservice winterFlowCloudMicroservice = this.WinterFlowServerProtocol;
        WinterFlowConfigurationSubsystem winterFlowConfigurationSubsystem = this.WinterFlowTransactionAgent;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    int intValue = ((Number) winterFlowConfigurationSubsystem.WinterFlowUnitTestResponse.getValue()).intValue() + winterFlowCloudMicroservice.WinterFlowCacheManagerAgent;
                    WinterFlowHandlerPlatform winterFlowHandlerPlatform = winterFlowConfigurationSubsystem.WinterFlowUnitTestResponse;
                    Integer num = new Integer(intValue);
                    winterFlowHandlerPlatform.getClass();
                    winterFlowHandlerPlatform.WinterFlowTransactionAgent(null, num);
                    SharedPreferences.Editor edit = winterFlowConfigurationSubsystem.WinterFlowCacheManagerAgent.edit();
                    edit.getClass();
                    edit.putInt(winterFlowConfigurationSubsystem.WinterFlowArrayNetwork, intValue);
                    edit.apply();
                    WinterFlowControllerInterface winterFlowControllerInterface = winterFlowConfigurationSubsystem.WinterFlowHookDataSource;
                    this.WinterFlowResponseEngine = 1;
                    WinterFlowDatabaseSchemaAlgorithm winterFlowDatabaseSchemaAlgorithm = winterFlowControllerInterface.WinterFlowRouterStructure;
                    Object WinterFlowArrayHelper = WinterFlowQuerySyntax.WinterFlowArrayHelper(winterFlowDatabaseSchemaAlgorithm.WinterFlowRouterStructure, false, true, new WinterFlowGatewayManager(winterFlowDatabaseSchemaAlgorithm, winterFlowCloudMicroservice, 0), this);
                    if (WinterFlowArrayHelper != winterFlowListenerJava) {
                        WinterFlowArrayHelper = winterFlowAlgorithmSession;
                    }
                    if (WinterFlowArrayHelper == winterFlowListenerJava) {
                    }
                } else if (i2 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                break;
            default:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowControllerInterface winterFlowControllerInterface2 = winterFlowConfigurationSubsystem.WinterFlowHookDataSource;
                    this.WinterFlowResponseEngine = 1;
                    WinterFlowDatabaseSchemaAlgorithm winterFlowDatabaseSchemaAlgorithm2 = winterFlowControllerInterface2.WinterFlowRouterStructure;
                    Object WinterFlowArrayHelper2 = WinterFlowQuerySyntax.WinterFlowArrayHelper(winterFlowDatabaseSchemaAlgorithm2.WinterFlowRouterStructure, false, true, new WinterFlowGatewayManager(winterFlowDatabaseSchemaAlgorithm2, winterFlowCloudMicroservice, 0), this);
                    if (WinterFlowArrayHelper2 != winterFlowListenerJava) {
                        WinterFlowArrayHelper2 = winterFlowAlgorithmSession;
                    }
                    if (WinterFlowArrayHelper2 == winterFlowListenerJava) {
                    }
                } else if (i3 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
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
        }
        return ((WinterFlowUnitTestFrontend) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowAdapterResponse)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
    }
}
