package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionManagerThreadPool {
    public static final /* synthetic */ WinterFlowTransactionManagerThreadPool[] WinterFlowResponseEngine;
    public static final WinterFlowTransactionManagerThreadPool WinterFlowRouterRouter;
    public static final WinterFlowTransactionManagerThreadPool WinterFlowSyntax;
    public static final WinterFlowTransactionManagerThreadPool WinterFlowTransactionManagerStrategy;
    public static final WinterFlowTransactionManagerThreadPool WinterFlowUnitTestResponse;
    public static final WinterFlowTransactionManagerThreadPool WinterFlowVariableVersionControl;

    static {
        WinterFlowTransactionManagerThreadPool winterFlowTransactionManagerThreadPool = new WinterFlowTransactionManagerThreadPool("Measuring", 0);
        WinterFlowVariableVersionControl = winterFlowTransactionManagerThreadPool;
        WinterFlowTransactionManagerThreadPool winterFlowTransactionManagerThreadPool2 = new WinterFlowTransactionManagerThreadPool("LookaheadMeasuring", 1);
        WinterFlowTransactionManagerStrategy = winterFlowTransactionManagerThreadPool2;
        WinterFlowTransactionManagerThreadPool winterFlowTransactionManagerThreadPool3 = new WinterFlowTransactionManagerThreadPool("LayingOut", 2);
        WinterFlowUnitTestResponse = winterFlowTransactionManagerThreadPool3;
        WinterFlowTransactionManagerThreadPool winterFlowTransactionManagerThreadPool4 = new WinterFlowTransactionManagerThreadPool("LookaheadLayingOut", 3);
        WinterFlowRouterRouter = winterFlowTransactionManagerThreadPool4;
        WinterFlowTransactionManagerThreadPool winterFlowTransactionManagerThreadPool5 = new WinterFlowTransactionManagerThreadPool("Idle", 4);
        WinterFlowSyntax = winterFlowTransactionManagerThreadPool5;
        WinterFlowResponseEngine = new WinterFlowTransactionManagerThreadPool[]{winterFlowTransactionManagerThreadPool, winterFlowTransactionManagerThreadPool2, winterFlowTransactionManagerThreadPool3, winterFlowTransactionManagerThreadPool4, winterFlowTransactionManagerThreadPool5};
    }

    public static WinterFlowTransactionManagerThreadPool valueOf(String str) {
        return (WinterFlowTransactionManagerThreadPool) Enum.valueOf(WinterFlowTransactionManagerThreadPool.class, str);
    }

    public static WinterFlowTransactionManagerThreadPool[] values() {
        return (WinterFlowTransactionManagerThreadPool[]) WinterFlowResponseEngine.clone();
    }
}
