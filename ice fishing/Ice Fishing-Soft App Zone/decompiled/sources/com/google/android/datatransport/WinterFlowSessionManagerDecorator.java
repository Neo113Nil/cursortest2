package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionManagerDecorator {
    public static final /* synthetic */ WinterFlowSessionManagerDecorator[] WinterFlowRouterRouter;
    public static final WinterFlowSessionManagerDecorator WinterFlowTransactionManagerStrategy;
    public static final WinterFlowSessionManagerDecorator WinterFlowUnitTestResponse;
    public static final WinterFlowSessionManagerDecorator WinterFlowVariableVersionControl;

    static {
        WinterFlowSessionManagerDecorator winterFlowSessionManagerDecorator = new WinterFlowSessionManagerDecorator("Yes", 0);
        WinterFlowVariableVersionControl = winterFlowSessionManagerDecorator;
        WinterFlowSessionManagerDecorator winterFlowSessionManagerDecorator2 = new WinterFlowSessionManagerDecorator("No", 1);
        WinterFlowTransactionManagerStrategy = winterFlowSessionManagerDecorator2;
        WinterFlowSessionManagerDecorator winterFlowSessionManagerDecorator3 = new WinterFlowSessionManagerDecorator("NotInitialized", 2);
        WinterFlowUnitTestResponse = winterFlowSessionManagerDecorator3;
        WinterFlowRouterRouter = new WinterFlowSessionManagerDecorator[]{winterFlowSessionManagerDecorator, winterFlowSessionManagerDecorator2, winterFlowSessionManagerDecorator3};
    }

    public static WinterFlowSessionManagerDecorator valueOf(String str) {
        return (WinterFlowSessionManagerDecorator) Enum.valueOf(WinterFlowSessionManagerDecorator.class, str);
    }

    public static WinterFlowSessionManagerDecorator[] values() {
        return (WinterFlowSessionManagerDecorator[]) WinterFlowRouterRouter.clone();
    }
}
