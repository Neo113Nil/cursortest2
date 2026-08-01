package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowListenerJava {
    public static final /* synthetic */ WinterFlowListenerJava[] WinterFlowRouterRouter;
    public static final WinterFlowListenerJava WinterFlowTransactionManagerStrategy;
    public static final WinterFlowListenerJava WinterFlowUnitTestResponse;
    public static final WinterFlowListenerJava WinterFlowVariableVersionControl;

    static {
        WinterFlowListenerJava winterFlowListenerJava = new WinterFlowListenerJava("COROUTINE_SUSPENDED", 0);
        WinterFlowVariableVersionControl = winterFlowListenerJava;
        WinterFlowListenerJava winterFlowListenerJava2 = new WinterFlowListenerJava("UNDECIDED", 1);
        WinterFlowTransactionManagerStrategy = winterFlowListenerJava2;
        WinterFlowListenerJava winterFlowListenerJava3 = new WinterFlowListenerJava("RESUMED", 2);
        WinterFlowUnitTestResponse = winterFlowListenerJava3;
        WinterFlowRouterRouter = new WinterFlowListenerJava[]{winterFlowListenerJava, winterFlowListenerJava2, winterFlowListenerJava3};
    }

    public static WinterFlowListenerJava valueOf(String str) {
        return (WinterFlowListenerJava) Enum.valueOf(WinterFlowListenerJava.class, str);
    }

    public static WinterFlowListenerJava[] values() {
        return (WinterFlowListenerJava[]) WinterFlowRouterRouter.clone();
    }
}
