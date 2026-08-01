package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheNode implements WinterFlowControllerInvoker {
    public final boolean WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowVariableVersionControl;

    public WinterFlowCacheNode(Object obj, boolean z) {
        this.WinterFlowVariableVersionControl = obj;
        this.WinterFlowTransactionManagerStrategy = z;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerInvoker
    public final boolean WinterFlowHookDataSource() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchCacheManager
    public final Object getValue() {
        return this.WinterFlowVariableVersionControl;
    }
}
