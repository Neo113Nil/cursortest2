package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererProtocol implements WinterFlowCacheInterface {
    public final /* synthetic */ WinterFlowSoftwareProtocol WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowRendererProtocol(WinterFlowSoftwareProtocol winterFlowSoftwareProtocol, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowSoftwareProtocol;
    }

    @Override // com.google.android.datatransport.WinterFlowCacheInterface
    public final Object WinterFlowRouterRouter(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowSoftwareProtocol winterFlowSoftwareProtocol = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowSoftwareProtocol.setValue(obj);
                break;
            default:
                winterFlowSoftwareProtocol.setValue(obj);
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
