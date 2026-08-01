package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowProcessorEngine implements WinterFlowObjectSession {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowProcessorEngine(int i, Collection collection) {
        this.WinterFlowVariableVersionControl = 2;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowTransactionManagerStrategy = collection;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowTransactionManagerStrategy;
        int i2 = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowDecoratorSessionManager.WinterFlowSyntax((WinterFlowDecoratorSessionManager) obj, (WinterFlowViewTesting) obj2, 0, -i2);
                return winterFlowAlgorithmSession;
            case 1:
                WinterFlowDecoratorSessionManager.WinterFlowSyntax((WinterFlowDecoratorSessionManager) obj, (WinterFlowViewTesting) obj2, -i2, 0);
                return winterFlowAlgorithmSession;
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ WinterFlowProcessorEngine(WinterFlowViewTesting winterFlowViewTesting, int i, int i2) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowTransactionManagerStrategy = winterFlowViewTesting;
        this.WinterFlowUnitTestResponse = i;
    }
}
