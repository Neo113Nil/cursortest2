package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseNetwork {
    public static final /* synthetic */ WinterFlowDatabaseNetwork[] WinterFlowResponseEngine;
    public static final WinterFlowDatabaseNetwork WinterFlowRouterRouter;
    public static final WinterFlowDatabaseNetwork WinterFlowSyntax;
    public static final WinterFlowDatabaseNetwork WinterFlowTransactionManagerStrategy;
    public static final WinterFlowDatabaseNetwork WinterFlowUnitTestResponse;
    public static final WinterFlowDatabaseNetwork WinterFlowVariableVersionControl;

    static {
        WinterFlowDatabaseNetwork winterFlowDatabaseNetwork = new WinterFlowDatabaseNetwork("CPU_ACQUIRED", 0);
        WinterFlowVariableVersionControl = winterFlowDatabaseNetwork;
        WinterFlowDatabaseNetwork winterFlowDatabaseNetwork2 = new WinterFlowDatabaseNetwork("BLOCKING", 1);
        WinterFlowTransactionManagerStrategy = winterFlowDatabaseNetwork2;
        WinterFlowDatabaseNetwork winterFlowDatabaseNetwork3 = new WinterFlowDatabaseNetwork("PARKING", 2);
        WinterFlowUnitTestResponse = winterFlowDatabaseNetwork3;
        WinterFlowDatabaseNetwork winterFlowDatabaseNetwork4 = new WinterFlowDatabaseNetwork("DORMANT", 3);
        WinterFlowRouterRouter = winterFlowDatabaseNetwork4;
        WinterFlowDatabaseNetwork winterFlowDatabaseNetwork5 = new WinterFlowDatabaseNetwork("TERMINATED", 4);
        WinterFlowSyntax = winterFlowDatabaseNetwork5;
        WinterFlowResponseEngine = new WinterFlowDatabaseNetwork[]{winterFlowDatabaseNetwork, winterFlowDatabaseNetwork2, winterFlowDatabaseNetwork3, winterFlowDatabaseNetwork4, winterFlowDatabaseNetwork5};
    }

    public static WinterFlowDatabaseNetwork valueOf(String str) {
        return (WinterFlowDatabaseNetwork) Enum.valueOf(WinterFlowDatabaseNetwork.class, str);
    }

    public static WinterFlowDatabaseNetwork[] values() {
        return (WinterFlowDatabaseNetwork[]) WinterFlowResponseEngine.clone();
    }
}
