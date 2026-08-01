package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowUserManagerFramework implements Runnable {
    public final /* synthetic */ WinterFlowObjectUI WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowUserManagerFramework(int i, WinterFlowObjectUI winterFlowObjectUI) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowObjectUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowObjectUI winterFlowObjectUI = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowObjectUI.WinterFlowRouterStructure();
                break;
            case 1:
                winterFlowObjectUI.WinterFlowRouterStructure();
                break;
            case 2:
                winterFlowObjectUI.WinterFlowRouterStructure();
                break;
            default:
                winterFlowObjectUI.WinterFlowRouterStructure();
                break;
        }
    }
}
