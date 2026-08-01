package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConcurrencyDeployment extends WinterFlowVersionControlServer implements Runnable {
    public final long WinterFlowSyntax;

    public WinterFlowConcurrencyDeployment(long j, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        super(winterFlowOrchestrationCompiler, winterFlowOrchestrationCompiler.getContext());
        this.WinterFlowSyntax = j;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerTransaction
    public final String WinterFlowConfiguration() {
        return super.WinterFlowConfiguration() + "(timeMillis=" + this.WinterFlowSyntax + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        WinterFlowManagerRequest.WinterFlowConsumerUserManager(this.WinterFlowUnitTestResponse);
        WinterFlowResolverController(new WinterFlowBatchTransaction("Timed out waiting for " + this.WinterFlowSyntax + " ms", this));
    }
}
