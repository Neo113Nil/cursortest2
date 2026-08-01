package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowExceptionListener {
    public static final WinterFlowExceptionListener WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowExceptionListener[] WinterFlowUnitTestResponse;
    public static final WinterFlowExceptionListener WinterFlowVariableVersionControl;

    static {
        WinterFlowExceptionListener winterFlowExceptionListener = new WinterFlowExceptionListener("Default", 0);
        WinterFlowVariableVersionControl = winterFlowExceptionListener;
        WinterFlowExceptionListener winterFlowExceptionListener2 = new WinterFlowExceptionListener("UserInput", 1);
        WinterFlowTransactionManagerStrategy = winterFlowExceptionListener2;
        WinterFlowUnitTestResponse = new WinterFlowExceptionListener[]{winterFlowExceptionListener, winterFlowExceptionListener2, new WinterFlowExceptionListener("PreventUserInput", 2)};
    }

    public static WinterFlowExceptionListener valueOf(String str) {
        return (WinterFlowExceptionListener) Enum.valueOf(WinterFlowExceptionListener.class, str);
    }

    public static WinterFlowExceptionListener[] values() {
        return (WinterFlowExceptionListener[]) WinterFlowUnitTestResponse.clone();
    }
}
