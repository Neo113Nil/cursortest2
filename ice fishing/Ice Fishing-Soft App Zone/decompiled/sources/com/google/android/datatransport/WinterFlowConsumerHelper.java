package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConsumerHelper extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowConsumerHelper(int i, int i2) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = i;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        int i2 = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(((WinterFlowDeploymentWidget) obj).WinterFlowSoftwareServiceProvider(i2));
            case 1:
                return Boolean.valueOf(((WinterFlowDeploymentWidget) obj).WinterFlowSoftwareServiceProvider(i2));
            case 2:
                return Boolean.valueOf(((WinterFlowDeploymentWidget) obj).WinterFlowSoftwareServiceProvider(i2));
            default:
                return Boolean.valueOf(((WinterFlowDeploymentWidget) obj).WinterFlowValidatorNetwork(i2));
        }
    }
}
