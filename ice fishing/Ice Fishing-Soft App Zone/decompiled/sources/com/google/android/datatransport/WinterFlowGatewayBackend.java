package com.google.android.datatransport;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowGatewayBackend extends WinterFlowDebugFramework implements WinterFlowVersionEngine {
    public final /* synthetic */ WinterFlowHookThreadPool WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowGatewayBackend(WinterFlowHookThreadPool winterFlowHookThreadPool, int i) {
        super(4);
        this.WinterFlowTransactionManagerStrategy = winterFlowHookThreadPool;
        this.WinterFlowUnitTestResponse = i;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionEngine
    public final Object WinterFlowTransactionAgent(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        WinterFlowHookThreadPool winterFlowHookThreadPool = this.WinterFlowTransactionManagerStrategy;
        WinterFlowJSONDecorator winterFlowJSONDecorator = winterFlowHookThreadPool.WinterFlowVariableVersionControl;
        ((AutofillManager) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy).notifyViewEntered(winterFlowHookThreadPool.WinterFlowUnitTestResponse, this.WinterFlowUnitTestResponse, new Rect(intValue, intValue2, intValue3, intValue4));
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
