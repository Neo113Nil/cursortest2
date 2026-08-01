package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowListenerMechanism implements WinterFlowObjectUI {
    public final /* synthetic */ WinterFlowConcurrencyThread WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowListenerMechanism(WinterFlowConcurrencyThread winterFlowConcurrencyThread, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowConcurrencyThread;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowConcurrencyThread winterFlowConcurrencyThread = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(winterFlowConcurrencyThread.WinterFlowSingletonPlatform);
            default:
                WinterFlowDeploymentWidget winterFlowDeploymentWidget = winterFlowConcurrencyThread.WinterFlowConfiguration;
                if (!winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                    return null;
                }
                WinterFlowProtocolCache WinterFlowEncryptionAdapter = winterFlowDeploymentWidget.WinterFlowEncryptionAdapter();
                int ordinal = WinterFlowEncryptionAdapter.ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3) {
                        return null;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                    return null;
                }
                if (WinterFlowEncryptionAdapter.WinterFlowRouterStructure()) {
                    return winterFlowDeploymentWidget.WinterFlowServerStack(null);
                }
                WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy = ((WinterFlowHookMechanism) ((WinterFlowSyntaxTransactionManager) WinterFlowCloudStack.WinterFlowTestingNode(winterFlowDeploymentWidget)).getFocusOwner()).WinterFlowTransactionManagerStrategy();
                if (WinterFlowTransactionManagerStrategy != null) {
                    return WinterFlowTransactionManagerStrategy.WinterFlowServerStack(WinterFlowCloudStack.WinterFlowSoftwareEngine(winterFlowDeploymentWidget));
                }
                return null;
        }
    }
}
