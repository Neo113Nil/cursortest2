package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowModuleRenderer extends WinterFlowDatabaseSchemaPipeline implements WinterFlowObjectUI {
    public final /* synthetic */ WinterFlowSyntaxResolver WinterFlowServerProtocol;
    public final /* synthetic */ WinterFlowJavaSession WinterFlowServiceUtility;
    public final /* synthetic */ WinterFlowUIMicroservice WinterFlowThreadListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowModuleRenderer(WinterFlowSyntaxResolver winterFlowSyntaxResolver, WinterFlowUIMicroservice winterFlowUIMicroservice, WinterFlowJavaSession winterFlowJavaSession) {
        super(0, WinterFlowServerManager.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.WinterFlowServerProtocol = winterFlowSyntaxResolver;
        this.WinterFlowThreadListener = winterFlowUIMicroservice;
        this.WinterFlowServiceUtility = winterFlowJavaSession;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        return WinterFlowSyntaxResolver.WinterFlowValidatorNetwork(this.WinterFlowServerProtocol, this.WinterFlowThreadListener, this.WinterFlowServiceUtility);
    }
}
