package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUIInvoker extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowBandwidthCache WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowUIInvoker(WinterFlowBandwidthCache winterFlowBandwidthCache, int i) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowBandwidthCache;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        boolean z;
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowBandwidthCache winterFlowBandwidthCache = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowBandwidthCache.WinterFlowVariableVersionControl = (WinterFlowDeploymentWidget) obj;
                return Boolean.TRUE;
            default:
                WinterFlowLibraryDeployment winterFlowLibraryDeployment = (WinterFlowAlgorithmEntity) obj;
                if (((WinterFlowUserManagerController) winterFlowLibraryDeployment).WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                    winterFlowBandwidthCache.WinterFlowVariableVersionControl = winterFlowLibraryDeployment;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
