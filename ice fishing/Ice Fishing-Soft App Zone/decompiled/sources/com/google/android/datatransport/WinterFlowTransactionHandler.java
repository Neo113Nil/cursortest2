package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionHandler extends WinterFlowNodeInheritance implements WinterFlowControllerScript {
    public final /* synthetic */ WinterFlowInterfaceProcessor WinterFlowSyntax;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowTransactionHandler(WinterFlowInterfaceProcessor winterFlowInterfaceProcessor, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(3, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = winterFlowInterfaceProcessor;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerScript
    public final Object WinterFlowArrayNetwork(Object obj, Object obj2, Object obj3) {
        WinterFlowTransactionHandler winterFlowTransactionHandler = new WinterFlowTransactionHandler(this.WinterFlowSyntax, (WinterFlowTransactionManagerLayer) obj3);
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        winterFlowTransactionHandler.WinterFlowServiceUtility(winterFlowAlgorithmSession);
        return winterFlowAlgorithmSession;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        this.WinterFlowSyntax.WinterFlowVariableVersionControl = true;
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
