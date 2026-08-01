package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSingletonManager implements WinterFlowRepositorySubsystem {
    public final /* synthetic */ WinterFlowTransactionManagerStack WinterFlowRouterStructure;

    public WinterFlowSingletonManager(WinterFlowTransactionManagerStack winterFlowTransactionManagerStack) {
        this.WinterFlowRouterStructure = winterFlowTransactionManagerStack;
    }

    @Override // com.google.android.datatransport.WinterFlowRepositorySubsystem
    public final void WinterFlowRouterStructure(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        WinterFlowWidgetInterface winterFlowWidgetInterface = this.WinterFlowRouterStructure.WinterFlowThreadListener;
        winterFlowWidgetInterface.sendMessage(winterFlowWidgetInterface.obtainMessage(1, valueOf));
    }
}
