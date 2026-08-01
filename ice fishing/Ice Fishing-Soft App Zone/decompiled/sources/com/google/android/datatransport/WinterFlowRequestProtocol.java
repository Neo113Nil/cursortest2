package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRequestProtocol extends WinterFlowAlgorithmAPI {
    public final /* synthetic */ WinterFlowEventEvent WinterFlowHookDataSource;
    public final /* synthetic */ WinterFlowSessionUI WinterFlowRouterStructure;

    public WinterFlowRequestProtocol(WinterFlowSessionUI winterFlowSessionUI, WinterFlowEventEvent winterFlowEventEvent) {
        this.WinterFlowRouterStructure = winterFlowSessionUI;
        this.WinterFlowHookDataSource = winterFlowEventEvent;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerModule
    public final WinterFlowTransactionPlatform WinterFlowArrayNetwork(WinterFlowNodeException winterFlowNodeException, List list, long j) {
        WinterFlowSessionUI winterFlowSessionUI = this.WinterFlowRouterStructure;
        WinterFlowModuleTransaction winterFlowModuleTransaction = winterFlowSessionUI.WinterFlowServerProtocol;
        winterFlowModuleTransaction.WinterFlowVariableVersionControl = winterFlowNodeException.getLayoutDirection();
        winterFlowModuleTransaction.WinterFlowTransactionManagerStrategy = winterFlowNodeException.WinterFlowHookDataSource();
        winterFlowModuleTransaction.WinterFlowUnitTestResponse = winterFlowNodeException.WinterFlowRouterRouter();
        boolean WinterFlowServiceUtility = winterFlowNodeException.WinterFlowServiceUtility();
        WinterFlowEventEvent winterFlowEventEvent = this.WinterFlowHookDataSource;
        if (WinterFlowServiceUtility || winterFlowSessionUI.WinterFlowVariableVersionControl.WinterFlowServerProtocol == null) {
            winterFlowSessionUI.WinterFlowRouterRouter = 0;
            WinterFlowTransactionPlatform winterFlowTransactionPlatform = (WinterFlowTransactionPlatform) winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowModuleTransaction, new WinterFlowHandlerConsumer(j));
            return new WinterFlowScriptEntity(winterFlowTransactionPlatform, winterFlowSessionUI, winterFlowSessionUI.WinterFlowRouterRouter, winterFlowTransactionPlatform, 1);
        }
        winterFlowSessionUI.WinterFlowSyntax = 0;
        WinterFlowTransactionPlatform winterFlowTransactionPlatform2 = (WinterFlowTransactionPlatform) winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowSessionUI.WinterFlowThreadListener, new WinterFlowHandlerConsumer(j));
        return new WinterFlowScriptEntity(winterFlowTransactionPlatform2, winterFlowSessionUI, winterFlowSessionUI.WinterFlowSyntax, winterFlowTransactionPlatform2, 0);
    }
}
