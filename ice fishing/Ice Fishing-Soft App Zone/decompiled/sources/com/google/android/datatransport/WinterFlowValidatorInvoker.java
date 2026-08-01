package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorInvoker extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowSyntaxResolver WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowJavaSession WinterFlowServerProtocol;
    public /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ WinterFlowRouterHelper WinterFlowThreadListener;
    public final /* synthetic */ WinterFlowUIMicroservice WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowValidatorInvoker(WinterFlowSyntaxResolver winterFlowSyntaxResolver, WinterFlowUIMicroservice winterFlowUIMicroservice, WinterFlowJavaSession winterFlowJavaSession, WinterFlowRouterHelper winterFlowRouterHelper, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowResponseEngine = winterFlowSyntaxResolver;
        this.WinterFlowTransactionAgent = winterFlowUIMicroservice;
        this.WinterFlowServerProtocol = winterFlowJavaSession;
        this.WinterFlowThreadListener = winterFlowRouterHelper;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowValidatorInvoker winterFlowValidatorInvoker = new WinterFlowValidatorInvoker(this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, winterFlowTransactionManagerLayer);
        winterFlowValidatorInvoker.WinterFlowSyntax = obj;
        return winterFlowValidatorInvoker;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowSyntax;
        WinterFlowJavaSession winterFlowJavaSession = this.WinterFlowServerProtocol;
        WinterFlowSyntaxResolver winterFlowSyntaxResolver = this.WinterFlowResponseEngine;
        WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowAdapterResponse, null, new WinterFlowMapperJava(winterFlowSyntaxResolver, this.WinterFlowTransactionAgent, winterFlowJavaSession, null, 2), 3);
        return WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowAdapterResponse, null, new WinterFlowModuleStack(winterFlowSyntaxResolver, this.WinterFlowThreadListener, null, 3), 3);
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowValidatorInvoker) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
