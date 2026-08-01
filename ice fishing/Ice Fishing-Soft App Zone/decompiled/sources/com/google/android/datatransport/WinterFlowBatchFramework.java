package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowBatchFramework implements WinterFlowObjectUI {
    public final /* synthetic */ WinterFlowUISoftware WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowBatchFramework(WinterFlowUISoftware winterFlowUISoftware, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowUISoftware;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowUISoftware winterFlowUISoftware = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowResponseManager winterFlowResponseManager = (WinterFlowResponseManager) WinterFlowEncryptionSubsystem.WinterFlowConcurrencyThread(winterFlowUISoftware, WinterFlowSingletonProxy.WinterFlowRouterStructure);
                WinterFlowRequestComponent winterFlowRequestComponent = winterFlowUISoftware.WinterFlowConsumerUserManager;
                if (winterFlowResponseManager == null) {
                    if (winterFlowRequestComponent != null) {
                        winterFlowUISoftware.WinterFlowUIPlatform(winterFlowRequestComponent);
                    }
                    winterFlowUISoftware.WinterFlowConsumerUserManager = null;
                } else if (winterFlowRequestComponent == null) {
                    WinterFlowConfigurationModule winterFlowConfigurationModule = new WinterFlowConfigurationModule(12, winterFlowUISoftware);
                    WinterFlowBatchFramework winterFlowBatchFramework = new WinterFlowBatchFramework(winterFlowUISoftware, 1);
                    WinterFlowJSONDecorator winterFlowJSONDecorator = winterFlowUISoftware.WinterFlowRouterAdapter;
                    boolean z = winterFlowUISoftware.WinterFlowSerializerStructure;
                    float f = winterFlowUISoftware.WinterFlowMapperProtocol;
                    WinterFlowManagerService winterFlowManagerService = WinterFlowCompilerValidator.WinterFlowRouterStructure;
                    WinterFlowRequestComponent winterFlowRequestComponent2 = new WinterFlowRequestComponent(winterFlowJSONDecorator, z, f, winterFlowConfigurationModule, winterFlowBatchFramework);
                    winterFlowUISoftware.WinterFlowValidatorNetwork(winterFlowRequestComponent2);
                    winterFlowUISoftware.WinterFlowConsumerUserManager = winterFlowRequestComponent2;
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            default:
                return WinterFlowServerManager.WinterFlowTransactionAgent;
        }
    }
}
