package com.google.android.datatransport;

import android.view.ViewStructure;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProviderSubsystem extends WinterFlowDebugFramework implements WinterFlowVersionEngine {
    public final /* synthetic */ ViewStructure WinterFlowTransactionManagerStrategy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowProviderSubsystem(ViewStructure viewStructure) {
        super(4);
        this.WinterFlowTransactionManagerStrategy = viewStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionEngine
    public final Object WinterFlowTransactionAgent(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue() - intValue2;
        this.WinterFlowTransactionManagerStrategy.setDimens(intValue, intValue2, 0, 0, intValue3 - intValue, intValue4);
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
