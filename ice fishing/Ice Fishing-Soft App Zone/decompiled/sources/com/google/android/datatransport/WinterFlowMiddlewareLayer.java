package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMiddlewareLayer extends WinterFlowJSONModule {
    public int WinterFlowTransactionManagerStrategy;
    public final WinterFlowObjectSession WinterFlowVariableVersionControl;

    public WinterFlowMiddlewareLayer(long j, WinterFlowSingletonNode winterFlowSingletonNode, WinterFlowObjectSession winterFlowObjectSession) {
        super(j, winterFlowSingletonNode);
        this.WinterFlowVariableVersionControl = winterFlowObjectSession;
        this.WinterFlowTransactionManagerStrategy = 1;
    }

    @Override // com.google.android.datatransport.WinterFlowJSONModule
    public final void WinterFlowCacheManagerAgent() {
        if (this.WinterFlowCacheManagerAgent) {
            return;
        }
        WinterFlowServerProtocol();
        this.WinterFlowCacheManagerAgent = true;
        synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
            WinterFlowBandwidthObject();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowJSONModule
    public final WinterFlowJSONModule WinterFlowRouterAdapter(WinterFlowObjectSession winterFlowObjectSession) {
        WinterFlowVersionProtocol.WinterFlowSerializerStructure(this);
        return new WinterFlowParserPipeline(this.WinterFlowHookDataSource, this.WinterFlowRouterStructure, WinterFlowVersionProtocol.WinterFlowSyntax(winterFlowObjectSession, this.WinterFlowVariableVersionControl, true), this);
    }

    @Override // com.google.android.datatransport.WinterFlowJSONModule
    public final void WinterFlowServerProtocol() {
        int i = this.WinterFlowTransactionManagerStrategy - 1;
        this.WinterFlowTransactionManagerStrategy = i;
        if (i == 0) {
            WinterFlowRouterStructure();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowJSONModule
    public final void WinterFlowServiceUtility(WinterFlowOrchestrationTool winterFlowOrchestrationTool) {
        WinterFlowSessionManagerAgent winterFlowSessionManagerAgent = WinterFlowVersionProtocol.WinterFlowRouterStructure;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // com.google.android.datatransport.WinterFlowJSONModule
    public final WinterFlowObjectSession WinterFlowSyntax() {
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowJSONModule
    public final void WinterFlowTransactionAgent() {
        this.WinterFlowTransactionManagerStrategy++;
    }

    @Override // com.google.android.datatransport.WinterFlowJSONModule
    public final boolean WinterFlowTransactionManagerStrategy() {
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowJSONModule
    public final WinterFlowObjectSession WinterFlowVariableVersionControl() {
        return this.WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowJSONModule
    public final void WinterFlowThreadListener() {
    }
}
