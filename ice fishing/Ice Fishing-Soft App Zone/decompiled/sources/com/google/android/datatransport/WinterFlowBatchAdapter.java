package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBatchAdapter extends RuntimeException {
    public final Throwable WinterFlowTransactionManagerStrategy;
    public final WinterFlowServiceProviderValidator WinterFlowVariableVersionControl;

    public WinterFlowBatchAdapter(WinterFlowServiceProviderValidator winterFlowServiceProviderValidator, Throwable th) {
        super(th);
        this.WinterFlowVariableVersionControl = winterFlowServiceProviderValidator;
        this.WinterFlowTransactionManagerStrategy = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.WinterFlowTransactionManagerStrategy;
    }
}
