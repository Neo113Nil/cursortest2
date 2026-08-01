package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConfigurationTool extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ ArrayList WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowConfigurationTool(int i, ArrayList arrayList) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = arrayList;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        ArrayList arrayList = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager = (WinterFlowDecoratorSessionManager) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    WinterFlowDecoratorSessionManager.WinterFlowConcurrencyThread(winterFlowDecoratorSessionManager, (WinterFlowViewTesting) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager2 = (WinterFlowDecoratorSessionManager) obj;
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    WinterFlowDecoratorSessionManager.WinterFlowSyntax(winterFlowDecoratorSessionManager2, (WinterFlowViewTesting) arrayList.get(i3), 0, 0);
                }
                break;
            default:
                WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager3 = (WinterFlowDecoratorSessionManager) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    WinterFlowDecoratorSessionManager.WinterFlowVariableBandwidth(winterFlowDecoratorSessionManager3, (WinterFlowViewTesting) arrayList.get(i4), 0, 0);
                }
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
