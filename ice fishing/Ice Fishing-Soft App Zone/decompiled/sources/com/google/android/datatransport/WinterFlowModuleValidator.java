package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModuleValidator {
    public static final /* synthetic */ WinterFlowModuleValidator[] WinterFlowResponseEngine;
    public static final WinterFlowModuleValidator WinterFlowRouterRouter;
    public static final WinterFlowModuleValidator WinterFlowSyntax;
    public static final WinterFlowModuleValidator WinterFlowTransactionManagerStrategy;
    public static final WinterFlowModuleValidator WinterFlowUnitTestResponse;
    public static final WinterFlowModuleValidator WinterFlowVariableVersionControl;

    static {
        WinterFlowModuleValidator winterFlowModuleValidator = new WinterFlowModuleValidator("TopBar", 0);
        WinterFlowVariableVersionControl = winterFlowModuleValidator;
        WinterFlowModuleValidator winterFlowModuleValidator2 = new WinterFlowModuleValidator("MainContent", 1);
        WinterFlowTransactionManagerStrategy = winterFlowModuleValidator2;
        WinterFlowModuleValidator winterFlowModuleValidator3 = new WinterFlowModuleValidator("Snackbar", 2);
        WinterFlowUnitTestResponse = winterFlowModuleValidator3;
        WinterFlowModuleValidator winterFlowModuleValidator4 = new WinterFlowModuleValidator("Fab", 3);
        WinterFlowRouterRouter = winterFlowModuleValidator4;
        WinterFlowModuleValidator winterFlowModuleValidator5 = new WinterFlowModuleValidator("BottomBar", 4);
        WinterFlowSyntax = winterFlowModuleValidator5;
        WinterFlowResponseEngine = new WinterFlowModuleValidator[]{winterFlowModuleValidator, winterFlowModuleValidator2, winterFlowModuleValidator3, winterFlowModuleValidator4, winterFlowModuleValidator5};
    }

    public static WinterFlowModuleValidator valueOf(String str) {
        return (WinterFlowModuleValidator) Enum.valueOf(WinterFlowModuleValidator.class, str);
    }

    public static WinterFlowModuleValidator[] values() {
        return (WinterFlowModuleValidator[]) WinterFlowResponseEngine.clone();
    }
}
