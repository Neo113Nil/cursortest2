package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponseResponse implements WinterFlowUserManagerUserManager {
    public final WinterFlowStrategyManager[] WinterFlowRouterStructure;

    public WinterFlowResponseResponse(WinterFlowStrategyManager... winterFlowStrategyManagerArr) {
        this.WinterFlowRouterStructure = winterFlowStrategyManagerArr;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerUserManager
    public final WinterFlowTransactionVariable WinterFlowCacheManagerAgent(Class cls, WinterFlowServiceProviderThreadPool winterFlowServiceProviderThreadPool) {
        WinterFlowTransactionVariable winterFlowTransactionVariable;
        WinterFlowStrategyManager winterFlowStrategyManager;
        WinterFlowObjectSession winterFlowObjectSession;
        WinterFlowEventEmitterCacheManager WinterFlowRouterStructure = WinterFlowListenerProtocol.WinterFlowRouterStructure(cls);
        WinterFlowStrategyManager[] winterFlowStrategyManagerArr = this.WinterFlowRouterStructure;
        WinterFlowStrategyManager[] winterFlowStrategyManagerArr2 = (WinterFlowStrategyManager[]) Arrays.copyOf(winterFlowStrategyManagerArr, winterFlowStrategyManagerArr.length);
        int length = winterFlowStrategyManagerArr2.length;
        int i = 0;
        while (true) {
            winterFlowTransactionVariable = null;
            if (i >= length) {
                winterFlowStrategyManager = null;
                break;
            }
            winterFlowStrategyManager = winterFlowStrategyManagerArr2[i];
            if (winterFlowStrategyManager.WinterFlowRouterStructure.equals(WinterFlowRouterStructure)) {
                break;
            }
            i++;
        }
        if (winterFlowStrategyManager != null && (winterFlowObjectSession = winterFlowStrategyManager.WinterFlowHookDataSource) != null) {
            winterFlowTransactionVariable = (WinterFlowTransactionVariable) winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowServiceProviderThreadPool);
        }
        if (winterFlowTransactionVariable != null) {
            return winterFlowTransactionVariable;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + WinterFlowRouterStructure.WinterFlowHookDataSource()).toString());
    }
}
