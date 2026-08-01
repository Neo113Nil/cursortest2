package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMicroserviceUtility extends WinterFlowCompilerNode {
    public final Runnable WinterFlowUnitTestResponse;

    public WinterFlowMicroserviceUtility(Runnable runnable, long j) {
        super(j);
        this.WinterFlowUnitTestResponse = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WinterFlowUnitTestResponse.run();
    }

    @Override // com.google.android.datatransport.WinterFlowCompilerNode
    public final String toString() {
        return super.toString() + this.WinterFlowUnitTestResponse;
    }
}
