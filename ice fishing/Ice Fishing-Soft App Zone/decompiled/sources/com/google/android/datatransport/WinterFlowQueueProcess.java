package com.google.android.datatransport;

import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.ColdActivity;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowQueueProcess implements WinterFlowObjectUI {
    public final /* synthetic */ ColdActivity WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowQueueProcess(ColdActivity coldActivity, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = coldActivity;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        ColdActivity coldActivity = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = ColdActivity.WinterFlowUserManagerUserManager;
                return new WinterFlowVersionControlTransactionManager(coldActivity);
            case 1:
                int i3 = ColdActivity.WinterFlowUserManagerUserManager;
                return new RelativeLayout(coldActivity);
            case 2:
                int i4 = ColdActivity.WinterFlowUserManagerUserManager;
                WebView WinterFlowTransactionAgent = ColdActivity.WinterFlowTransactionAgent(coldActivity.WinterFlowServerProtocol());
                WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                if (WinterFlowTransactionAgent == null) {
                    return winterFlowAlgorithmSession;
                }
                if (WinterFlowTransactionAgent.canGoBack()) {
                    WinterFlowTransactionAgent.goBack();
                    return winterFlowAlgorithmSession;
                }
                RelativeLayout WinterFlowServerProtocol = coldActivity.WinterFlowServerProtocol();
                WinterFlowServerProtocol.getClass();
                WinterFlowSoftware winterFlowSoftware = new WinterFlowSoftware(3, WinterFlowServerProtocol);
                if (!winterFlowSoftware.hasNext()) {
                    WinterFlowCompilerMechanism.WinterFlowSyntax("Sequence is empty.");
                    return null;
                }
                if (winterFlowSoftware.next().equals(WinterFlowTransactionAgent)) {
                    coldActivity.finish();
                    return winterFlowAlgorithmSession;
                }
                coldActivity.WinterFlowServerProtocol().removeView(WinterFlowTransactionAgent);
                WinterFlowTransactionAgent.destroy();
                return winterFlowAlgorithmSession;
            default:
                return Float.valueOf(((WinterFlowServerCloud) coldActivity.WinterFlowStrategyTool.WinterFlowVariableVersionControl.getValue()).WinterFlowRouterStructure);
        }
    }
}
