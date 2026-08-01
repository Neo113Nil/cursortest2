package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRouterHandler {
    public static final WinterFlowRouterHandler WinterFlowRouterRouter;
    public static final /* synthetic */ WinterFlowRouterHandler[] WinterFlowSyntax;
    public static final WinterFlowRouterHandler WinterFlowTransactionManagerStrategy;
    public static final WinterFlowRouterHandler WinterFlowUnitTestResponse;
    public static final WinterFlowRouterHandler WinterFlowVariableVersionControl;

    static {
        WinterFlowRouterHandler winterFlowRouterHandler = new WinterFlowRouterHandler("IGNORED", 0);
        WinterFlowVariableVersionControl = winterFlowRouterHandler;
        WinterFlowRouterHandler winterFlowRouterHandler2 = new WinterFlowRouterHandler("SCHEDULED", 1);
        WinterFlowTransactionManagerStrategy = winterFlowRouterHandler2;
        WinterFlowRouterHandler winterFlowRouterHandler3 = new WinterFlowRouterHandler("DEFERRED", 2);
        WinterFlowUnitTestResponse = winterFlowRouterHandler3;
        WinterFlowRouterHandler winterFlowRouterHandler4 = new WinterFlowRouterHandler("IMMINENT", 3);
        WinterFlowRouterRouter = winterFlowRouterHandler4;
        WinterFlowSyntax = new WinterFlowRouterHandler[]{winterFlowRouterHandler, winterFlowRouterHandler2, winterFlowRouterHandler3, winterFlowRouterHandler4};
    }

    public static WinterFlowRouterHandler valueOf(String str) {
        return (WinterFlowRouterHandler) Enum.valueOf(WinterFlowRouterHandler.class, str);
    }

    public static WinterFlowRouterHandler[] values() {
        return (WinterFlowRouterHandler[]) WinterFlowSyntax.clone();
    }
}
