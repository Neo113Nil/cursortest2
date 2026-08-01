package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUserManagerSystem {
    public static final WinterFlowUserManagerSystem WinterFlowResponseEngine;
    public static final WinterFlowUserManagerSystem WinterFlowRouterRouter;
    public static final WinterFlowUserManagerSystem WinterFlowSyntax;
    public static final /* synthetic */ WinterFlowUserManagerSystem[] WinterFlowTransactionAgent;
    public static final WinterFlowUserManagerSystem WinterFlowTransactionManagerStrategy;
    public static final WinterFlowUserManagerSystem WinterFlowUnitTestResponse;
    public static final WinterFlowUserManagerSystem WinterFlowVariableVersionControl;

    static {
        WinterFlowUserManagerSystem winterFlowUserManagerSystem = new WinterFlowUserManagerSystem("ShutDown", 0);
        WinterFlowVariableVersionControl = winterFlowUserManagerSystem;
        WinterFlowUserManagerSystem winterFlowUserManagerSystem2 = new WinterFlowUserManagerSystem("ShuttingDown", 1);
        WinterFlowTransactionManagerStrategy = winterFlowUserManagerSystem2;
        WinterFlowUserManagerSystem winterFlowUserManagerSystem3 = new WinterFlowUserManagerSystem("Inactive", 2);
        WinterFlowUnitTestResponse = winterFlowUserManagerSystem3;
        WinterFlowUserManagerSystem winterFlowUserManagerSystem4 = new WinterFlowUserManagerSystem("InactivePendingWork", 3);
        WinterFlowRouterRouter = winterFlowUserManagerSystem4;
        WinterFlowUserManagerSystem winterFlowUserManagerSystem5 = new WinterFlowUserManagerSystem("Idle", 4);
        WinterFlowSyntax = winterFlowUserManagerSystem5;
        WinterFlowUserManagerSystem winterFlowUserManagerSystem6 = new WinterFlowUserManagerSystem("PendingWork", 5);
        WinterFlowResponseEngine = winterFlowUserManagerSystem6;
        WinterFlowTransactionAgent = new WinterFlowUserManagerSystem[]{winterFlowUserManagerSystem, winterFlowUserManagerSystem2, winterFlowUserManagerSystem3, winterFlowUserManagerSystem4, winterFlowUserManagerSystem5, winterFlowUserManagerSystem6};
    }

    public static WinterFlowUserManagerSystem valueOf(String str) {
        return (WinterFlowUserManagerSystem) Enum.valueOf(WinterFlowUserManagerSystem.class, str);
    }

    public static WinterFlowUserManagerSystem[] values() {
        return (WinterFlowUserManagerSystem[]) WinterFlowTransactionAgent.clone();
    }
}
