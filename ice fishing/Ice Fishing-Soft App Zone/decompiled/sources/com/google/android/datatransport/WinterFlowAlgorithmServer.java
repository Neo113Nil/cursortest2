package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAlgorithmServer implements WinterFlowObjectSession {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowAlgorithmServer(int i, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        long j;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowInterfaceSoftware) this.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse(((List) this.WinterFlowUnitTestResponse).get(((Number) obj).intValue()));
            case 1:
                WinterFlowSingletonNode winterFlowSingletonNode = (WinterFlowSingletonNode) obj;
                synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
                    j = WinterFlowVersionProtocol.WinterFlowVariableVersionControl;
                    WinterFlowVersionProtocol.WinterFlowVariableVersionControl = 1 + j;
                }
                return new WinterFlowSchedulerTesting(j, winterFlowSingletonNode, (WinterFlowObjectSession) this.WinterFlowTransactionManagerStrategy, (WinterFlowObjectSession) this.WinterFlowUnitTestResponse);
            default:
                WinterFlowViewSystem winterFlowViewSystem = (WinterFlowViewSystem) this.WinterFlowTransactionManagerStrategy;
                Object obj2 = winterFlowViewSystem.WinterFlowHookDataSource;
                WinterFlowEventCloud winterFlowEventCloud = (WinterFlowEventCloud) this.WinterFlowUnitTestResponse;
                synchronized (obj2) {
                    ((ArrayList) winterFlowViewSystem.WinterFlowCacheManagerAgent).remove(winterFlowEventCloud);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
    }
}
