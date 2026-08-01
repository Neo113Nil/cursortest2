package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererRuntime implements WinterFlowBatchCacheManager {
    public int WinterFlowTransactionManagerStrategy;
    public final WinterFlowResolverSubsystem WinterFlowVariableVersionControl;

    public WinterFlowRendererRuntime(int i) {
        int i2 = (i / 30) * 30;
        this.WinterFlowVariableVersionControl = new WinterFlowResolverSubsystem(WinterFlowDecoratorUI.WinterFlowArrayHelper(Math.max(i2 - 100, 0), i2 + 130), WinterFlowSessionManagerProcess.WinterFlowResolverController);
        this.WinterFlowTransactionManagerStrategy = i;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchCacheManager
    public final Object getValue() {
        return (WinterFlowCacheManagerListener) this.WinterFlowVariableVersionControl.getValue();
    }
}
