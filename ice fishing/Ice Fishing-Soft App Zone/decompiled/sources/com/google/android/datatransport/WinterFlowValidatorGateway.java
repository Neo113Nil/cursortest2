package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowValidatorGateway implements WinterFlowObjectSession {
    public final /* synthetic */ WinterFlowObjectSession WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowObjectSession WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowValidatorGateway(WinterFlowObjectSession winterFlowObjectSession, WinterFlowObjectSession winterFlowObjectSession2, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowObjectSession;
        this.WinterFlowUnitTestResponse = winterFlowObjectSession2;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowObjectSession winterFlowObjectSession = this.WinterFlowUnitTestResponse;
        WinterFlowObjectSession winterFlowObjectSession2 = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowObjectSession2.WinterFlowUnitTestResponse(obj);
                winterFlowObjectSession.WinterFlowUnitTestResponse(obj);
                break;
            default:
                winterFlowObjectSession2.WinterFlowUnitTestResponse(obj);
                winterFlowObjectSession.WinterFlowUnitTestResponse(obj);
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
