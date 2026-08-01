package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxJava extends WinterFlowOrchestrationInvoker {
    public int WinterFlowArrayNetwork;
    public WinterFlowParserThread WinterFlowCacheManagerAgent;
    public int WinterFlowVariableVersionControl;

    public WinterFlowSyntaxJava(long j, WinterFlowParserThread winterFlowParserThread) {
        super(j);
        this.WinterFlowCacheManagerAgent = winterFlowParserThread;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationInvoker
    public final WinterFlowOrchestrationInvoker WinterFlowHookDataSource(long j) {
        return new WinterFlowSyntaxJava(j, this.WinterFlowCacheManagerAgent);
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationInvoker
    public final void WinterFlowRouterStructure(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker) {
        synchronized (WinterFlowServerManager.WinterFlowServerProtocol) {
            winterFlowOrchestrationInvoker.getClass();
            this.WinterFlowCacheManagerAgent = ((WinterFlowSyntaxJava) winterFlowOrchestrationInvoker).WinterFlowCacheManagerAgent;
            this.WinterFlowArrayNetwork = ((WinterFlowSyntaxJava) winterFlowOrchestrationInvoker).WinterFlowArrayNetwork;
            this.WinterFlowVariableVersionControl = ((WinterFlowSyntaxJava) winterFlowOrchestrationInvoker).WinterFlowVariableVersionControl;
        }
    }
}
