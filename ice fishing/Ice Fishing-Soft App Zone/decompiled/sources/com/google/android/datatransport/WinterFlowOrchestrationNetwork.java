package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowOrchestrationNetwork {
    public static final /* synthetic */ WinterFlowOrchestrationNetwork[] WinterFlowRouterRouter;
    public static final WinterFlowOrchestrationNetwork WinterFlowTransactionManagerStrategy;
    public static final WinterFlowOrchestrationNetwork WinterFlowUnitTestResponse;
    public static final WinterFlowOrchestrationNetwork WinterFlowVariableVersionControl;

    static {
        WinterFlowOrchestrationNetwork winterFlowOrchestrationNetwork = new WinterFlowOrchestrationNetwork("PLAYING", 0);
        WinterFlowVariableVersionControl = winterFlowOrchestrationNetwork;
        WinterFlowOrchestrationNetwork winterFlowOrchestrationNetwork2 = new WinterFlowOrchestrationNetwork("WIN", 1);
        WinterFlowTransactionManagerStrategy = winterFlowOrchestrationNetwork2;
        WinterFlowOrchestrationNetwork winterFlowOrchestrationNetwork3 = new WinterFlowOrchestrationNetwork("LOSE", 2);
        WinterFlowUnitTestResponse = winterFlowOrchestrationNetwork3;
        WinterFlowRouterRouter = new WinterFlowOrchestrationNetwork[]{winterFlowOrchestrationNetwork, winterFlowOrchestrationNetwork2, winterFlowOrchestrationNetwork3};
    }

    public static WinterFlowOrchestrationNetwork valueOf(String str) {
        return (WinterFlowOrchestrationNetwork) Enum.valueOf(WinterFlowOrchestrationNetwork.class, str);
    }

    public static WinterFlowOrchestrationNetwork[] values() {
        return (WinterFlowOrchestrationNetwork[]) WinterFlowRouterRouter.clone();
    }
}
