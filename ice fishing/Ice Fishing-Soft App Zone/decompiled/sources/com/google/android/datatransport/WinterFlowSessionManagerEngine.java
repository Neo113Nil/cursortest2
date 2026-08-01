package com.google.android.datatransport;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowSessionManagerEngine implements WinterFlowObjectSession {
    public final /* synthetic */ WinterFlowBandwidthCache WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowSessionManagerEngine(WinterFlowBandwidthCache winterFlowBandwidthCache, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowBandwidthCache;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowBandwidthCache winterFlowBandwidthCache = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) obj;
                str.getClass();
                Object obj2 = winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                boolean z = true;
                if (obj2 != null && ((Bundle) obj2).containsKey(str)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                WinterFlowAlgorithmEntity winterFlowAlgorithmEntity = (WinterFlowAlgorithmEntity) obj;
                winterFlowAlgorithmEntity.getClass();
                WinterFlowStrategyService winterFlowStrategyService = ((WinterFlowUnitTestService) winterFlowAlgorithmEntity).WinterFlowVariableBandwidth;
                List list = (List) winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                if (list != null) {
                    list.add(winterFlowStrategyService);
                } else {
                    list = WinterFlowUnitTestLibrary.WinterFlowSyntaxSubsystem(winterFlowStrategyService);
                }
                winterFlowBandwidthCache.WinterFlowVariableVersionControl = list;
                return WinterFlowSoftwareManager.WinterFlowTransactionManagerStrategy;
        }
    }
}
