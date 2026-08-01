package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderFunction extends WinterFlowUIQuery {
    public final Runnable WinterFlowUnitTestResponse;

    public WinterFlowServiceProviderFunction(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.WinterFlowUnitTestResponse = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WinterFlowUnitTestResponse.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.WinterFlowUnitTestResponse;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(WinterFlowQuerySyntax.WinterFlowBandwidthObject(runnable));
        sb.append(", ");
        sb.append(this.WinterFlowVariableVersionControl);
        sb.append(", ");
        sb.append(this.WinterFlowTransactionManagerStrategy ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
