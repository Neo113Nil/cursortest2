package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowBatchNode extends WinterFlowDatabaseSchemaPipeline implements WinterFlowEventEvent {
    public static final WinterFlowBatchNode WinterFlowServerProtocol = new WinterFlowBatchNode(2, WinterFlowCloudStack.class, "max", "max(II)I", 1);

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
