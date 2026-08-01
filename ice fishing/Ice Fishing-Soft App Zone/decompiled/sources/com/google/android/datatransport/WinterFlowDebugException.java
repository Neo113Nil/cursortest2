package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDebugException {
    public static final /* synthetic */ WinterFlowDebugException[] WinterFlowResponseEngine;
    public static final WinterFlowDebugException WinterFlowRouterRouter;
    public static final WinterFlowDebugException WinterFlowSyntax;
    public static final WinterFlowDebugException WinterFlowTransactionManagerStrategy;
    public static final WinterFlowDebugException WinterFlowUnitTestResponse;
    public static final WinterFlowDebugException WinterFlowVariableVersionControl;

    static {
        WinterFlowDebugException winterFlowDebugException = new WinterFlowDebugException("END", 0);
        WinterFlowVariableVersionControl = winterFlowDebugException;
        WinterFlowDebugException winterFlowDebugException2 = new WinterFlowDebugException("ROLLBACK", 1);
        WinterFlowTransactionManagerStrategy = winterFlowDebugException2;
        WinterFlowDebugException winterFlowDebugException3 = new WinterFlowDebugException("BEGIN_EXCLUSIVE", 2);
        WinterFlowUnitTestResponse = winterFlowDebugException3;
        WinterFlowDebugException winterFlowDebugException4 = new WinterFlowDebugException("BEGIN_IMMEDIATE", 3);
        WinterFlowRouterRouter = winterFlowDebugException4;
        WinterFlowDebugException winterFlowDebugException5 = new WinterFlowDebugException("BEGIN_DEFERRED", 4);
        WinterFlowSyntax = winterFlowDebugException5;
        WinterFlowResponseEngine = new WinterFlowDebugException[]{winterFlowDebugException, winterFlowDebugException2, winterFlowDebugException3, winterFlowDebugException4, winterFlowDebugException5};
    }

    public static WinterFlowDebugException valueOf(String str) {
        return (WinterFlowDebugException) Enum.valueOf(WinterFlowDebugException.class, str);
    }

    public static WinterFlowDebugException[] values() {
        return (WinterFlowDebugException[]) WinterFlowResponseEngine.clone();
    }
}
