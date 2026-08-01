package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowResponseFrontend implements WinterFlowObjectSession {
    public final /* synthetic */ WinterFlowViewTesting WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowResponseFrontend(WinterFlowViewTesting winterFlowViewTesting, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowViewTesting;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowViewTesting winterFlowViewTesting = this.WinterFlowTransactionManagerStrategy;
        WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager = (WinterFlowDecoratorSessionManager) obj;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowDecoratorSessionManager.WinterFlowConcurrencyThread(winterFlowDecoratorSessionManager, winterFlowViewTesting, 0, 0);
                break;
            case 1:
                WinterFlowDecoratorSessionManager.WinterFlowSyntax(winterFlowDecoratorSessionManager, winterFlowViewTesting, 0, 0);
                break;
            case 2:
                WinterFlowDecoratorSessionManager.WinterFlowConcurrencyThread(winterFlowDecoratorSessionManager, winterFlowViewTesting, 0, 0);
                break;
            default:
                WinterFlowDecoratorSessionManager.WinterFlowSyntax(winterFlowDecoratorSessionManager, winterFlowViewTesting, 0, 0);
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
