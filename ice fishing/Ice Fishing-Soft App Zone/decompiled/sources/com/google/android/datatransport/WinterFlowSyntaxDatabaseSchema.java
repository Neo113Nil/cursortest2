package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowSyntaxDatabaseSchema extends WinterFlowDatabaseSchemaPipeline implements WinterFlowEventEvent {
    public static final WinterFlowSyntaxDatabaseSchema WinterFlowServerProtocol = new WinterFlowSyntaxDatabaseSchema(2, WinterFlowEventRouter.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = WinterFlowEventRouter.WinterFlowRouterStructure;
        return new WinterFlowRepository(((Number) obj).longValue(), (WinterFlowRepository) obj2, 0);
    }
}
