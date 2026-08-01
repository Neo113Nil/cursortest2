package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderHelper implements WinterFlowTransactionManagerLayer {
    public static final WinterFlowServiceProviderHelper WinterFlowTransactionManagerStrategy = new WinterFlowServiceProviderHelper(0);
    public static final WinterFlowServiceProviderHelper WinterFlowUnitTestResponse = new WinterFlowServiceProviderHelper(1);
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowServiceProviderHelper(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final void WinterFlowSyntax(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final WinterFlowEncryptionMicroservice getContext() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl;
        }
    }

    public String toString() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void WinterFlowRouterStructure(Object obj) {
    }
}
