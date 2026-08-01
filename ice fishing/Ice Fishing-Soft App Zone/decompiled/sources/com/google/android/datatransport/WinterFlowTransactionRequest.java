package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionRequest {
    public static final /* synthetic */ WinterFlowTransactionRequest[] WinterFlowRouterRouter;
    public static final WinterFlowTransactionRequest WinterFlowTransactionManagerStrategy;
    public static final WinterFlowTransactionRequest WinterFlowUnitTestResponse;
    public static final WinterFlowTransactionRequest WinterFlowVariableVersionControl;

    static {
        WinterFlowTransactionRequest winterFlowTransactionRequest = new WinterFlowTransactionRequest("PreEnter", 0);
        WinterFlowVariableVersionControl = winterFlowTransactionRequest;
        WinterFlowTransactionRequest winterFlowTransactionRequest2 = new WinterFlowTransactionRequest("Visible", 1);
        WinterFlowTransactionManagerStrategy = winterFlowTransactionRequest2;
        WinterFlowTransactionRequest winterFlowTransactionRequest3 = new WinterFlowTransactionRequest("PostExit", 2);
        WinterFlowUnitTestResponse = winterFlowTransactionRequest3;
        WinterFlowRouterRouter = new WinterFlowTransactionRequest[]{winterFlowTransactionRequest, winterFlowTransactionRequest2, winterFlowTransactionRequest3};
    }

    public static WinterFlowTransactionRequest valueOf(String str) {
        return (WinterFlowTransactionRequest) Enum.valueOf(WinterFlowTransactionRequest.class, str);
    }

    public static WinterFlowTransactionRequest[] values() {
        return (WinterFlowTransactionRequest[]) WinterFlowRouterRouter.clone();
    }
}
