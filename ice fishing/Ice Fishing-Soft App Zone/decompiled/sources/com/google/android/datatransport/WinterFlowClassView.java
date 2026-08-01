package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowClassView {
    public static final WinterFlowClassView WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowClassView[] WinterFlowUnitTestResponse;
    public static final WinterFlowClassView WinterFlowVariableVersionControl;

    /* JADX INFO: Fake field, exist only in values array */
    WinterFlowClassView EF0;

    static {
        WinterFlowClassView winterFlowClassView = new WinterFlowClassView("AUTOMATIC", 0);
        WinterFlowClassView winterFlowClassView2 = new WinterFlowClassView("TRUNCATE", 1);
        WinterFlowVariableVersionControl = winterFlowClassView2;
        WinterFlowClassView winterFlowClassView3 = new WinterFlowClassView("WRITE_AHEAD_LOGGING", 2);
        WinterFlowTransactionManagerStrategy = winterFlowClassView3;
        WinterFlowUnitTestResponse = new WinterFlowClassView[]{winterFlowClassView, winterFlowClassView2, winterFlowClassView3};
    }

    public static WinterFlowClassView valueOf(String str) {
        return (WinterFlowClassView) Enum.valueOf(WinterFlowClassView.class, str);
    }

    public static WinterFlowClassView[] values() {
        return (WinterFlowClassView[]) WinterFlowUnitTestResponse.clone();
    }
}
