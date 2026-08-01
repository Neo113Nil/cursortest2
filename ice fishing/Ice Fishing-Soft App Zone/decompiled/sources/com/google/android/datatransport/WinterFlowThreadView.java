package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadView extends WinterFlowNodeInheritance implements WinterFlowObjectSession {
    public final /* synthetic */ String WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowHookPlatform WinterFlowSyntax;
    public final /* synthetic */ WinterFlowObjectSession WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowThreadView(WinterFlowHookPlatform winterFlowHookPlatform, String str, WinterFlowObjectSession winterFlowObjectSession, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(1, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = winterFlowHookPlatform;
        this.WinterFlowResponseEngine = str;
        this.WinterFlowTransactionAgent = winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        WinterFlowConcurrencyLayer WinterFlowArrayHelper = this.WinterFlowSyntax.WinterFlowHookDataSource.WinterFlowArrayHelper(this.WinterFlowResponseEngine);
        try {
            Object WinterFlowUnitTestResponse = this.WinterFlowTransactionAgent.WinterFlowUnitTestResponse(WinterFlowArrayHelper);
            WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
            return WinterFlowUnitTestResponse;
        } finally {
        }
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        String str = this.WinterFlowResponseEngine;
        WinterFlowObjectSession winterFlowObjectSession = this.WinterFlowTransactionAgent;
        return new WinterFlowThreadView(this.WinterFlowSyntax, str, winterFlowObjectSession, (WinterFlowTransactionManagerLayer) obj).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
