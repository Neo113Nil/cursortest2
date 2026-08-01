package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowParserEngine extends WinterFlowResponseAgent {
    public final WinterFlowCacheException WinterFlowTransactionManagerStrategy;
    public final WinterFlowEventTool WinterFlowUnitTestResponse;

    public WinterFlowParserEngine(WinterFlowCacheException winterFlowCacheException, String str, WinterFlowEventTool winterFlowEventTool) {
        super(winterFlowCacheException, str);
        this.WinterFlowTransactionManagerStrategy = winterFlowCacheException;
        this.WinterFlowUnitTestResponse = winterFlowEventTool;
    }

    @Override // com.google.android.datatransport.WinterFlowResponseAgent
    public final WinterFlowServerLayer WinterFlowHookDataSource() {
        return new WinterFlowDatabaseSchemaFunction(this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse);
    }

    @Override // com.google.android.datatransport.WinterFlowResponseAgent
    public final WinterFlowServerLayer WinterFlowRouterStructure() {
        return (WinterFlowDatabaseSchemaFunction) super.WinterFlowRouterStructure();
    }
}
