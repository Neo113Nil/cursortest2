package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerListener {
    public static final WinterFlowCompilerListener WinterFlowRouterRouter;
    public static final /* synthetic */ WinterFlowCompilerListener[] WinterFlowSyntax;
    public static final WinterFlowCompilerListener WinterFlowTransactionManagerStrategy;
    public static final WinterFlowCompilerListener WinterFlowUnitTestResponse;
    public static final WinterFlowCompilerListener WinterFlowVariableVersionControl;

    static {
        WinterFlowCompilerListener winterFlowCompilerListener = new WinterFlowCompilerListener("LookaheadMeasurement", 0);
        WinterFlowVariableVersionControl = winterFlowCompilerListener;
        WinterFlowCompilerListener winterFlowCompilerListener2 = new WinterFlowCompilerListener("LookaheadPlacement", 1);
        WinterFlowTransactionManagerStrategy = winterFlowCompilerListener2;
        WinterFlowCompilerListener winterFlowCompilerListener3 = new WinterFlowCompilerListener("Measurement", 2);
        WinterFlowUnitTestResponse = winterFlowCompilerListener3;
        WinterFlowCompilerListener winterFlowCompilerListener4 = new WinterFlowCompilerListener("Placement", 3);
        WinterFlowRouterRouter = winterFlowCompilerListener4;
        WinterFlowSyntax = new WinterFlowCompilerListener[]{winterFlowCompilerListener, winterFlowCompilerListener2, winterFlowCompilerListener3, winterFlowCompilerListener4};
    }

    public static WinterFlowCompilerListener valueOf(String str) {
        return (WinterFlowCompilerListener) Enum.valueOf(WinterFlowCompilerListener.class, str);
    }

    public static WinterFlowCompilerListener[] values() {
        return (WinterFlowCompilerListener[]) WinterFlowSyntax.clone();
    }
}
