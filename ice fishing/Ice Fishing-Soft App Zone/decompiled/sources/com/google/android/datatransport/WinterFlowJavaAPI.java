package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJavaAPI extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public /* synthetic */ int WinterFlowSyntax;

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowJavaAPI winterFlowJavaAPI = new WinterFlowJavaAPI(2, winterFlowTransactionManagerLayer);
        winterFlowJavaAPI.WinterFlowSyntax = ((Number) obj).intValue();
        return winterFlowJavaAPI;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        return Boolean.valueOf(this.WinterFlowSyntax > 0);
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowJavaAPI) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, Integer.valueOf(((Number) obj).intValue()))).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
