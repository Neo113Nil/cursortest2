package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceRouter implements WinterFlowObjectSession {
    public Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowServiceRouter(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        long j;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((List) this.WinterFlowTransactionManagerStrategy).get(((Number) obj).intValue());
                return null;
            case 1:
                ((WinterFlowClassNetwork) this.WinterFlowTransactionManagerStrategy).cancel();
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 2:
                Object obj2 = ((Object[]) this.WinterFlowTransactionManagerStrategy)[((Number) obj).intValue()];
                return null;
            case 3:
                WinterFlowSingletonNode winterFlowSingletonNode = (WinterFlowSingletonNode) obj;
                synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
                    j = WinterFlowVersionProtocol.WinterFlowVariableVersionControl;
                    WinterFlowVersionProtocol.WinterFlowVariableVersionControl = 1 + j;
                }
                return new WinterFlowMiddlewareLayer(j, winterFlowSingletonNode, (WinterFlowObjectSession) this.WinterFlowTransactionManagerStrategy);
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                WinterFlowTransactionManagerArray winterFlowTransactionManagerArray = (WinterFlowTransactionManagerArray) this.WinterFlowTransactionManagerStrategy;
                if (winterFlowTransactionManagerArray != null) {
                    winterFlowTransactionManagerArray.WinterFlowCacheManagerAgent = booleanValue;
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
    }
}
