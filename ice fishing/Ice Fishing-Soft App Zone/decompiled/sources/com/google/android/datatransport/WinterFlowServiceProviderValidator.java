package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderValidator {
    public static final /* synthetic */ WinterFlowServiceProviderValidator[] WinterFlowResponseEngine;
    public static final WinterFlowServiceProviderValidator WinterFlowRouterRouter;
    public static final WinterFlowServiceProviderValidator WinterFlowSyntax;
    public static final WinterFlowServiceProviderValidator WinterFlowTransactionManagerStrategy;
    public static final WinterFlowServiceProviderValidator WinterFlowUnitTestResponse;
    public static final WinterFlowServiceProviderValidator WinterFlowVariableVersionControl;

    static {
        WinterFlowServiceProviderValidator winterFlowServiceProviderValidator = new WinterFlowServiceProviderValidator("ON_CONFIGURE", 0);
        WinterFlowVariableVersionControl = winterFlowServiceProviderValidator;
        WinterFlowServiceProviderValidator winterFlowServiceProviderValidator2 = new WinterFlowServiceProviderValidator("ON_CREATE", 1);
        WinterFlowTransactionManagerStrategy = winterFlowServiceProviderValidator2;
        WinterFlowServiceProviderValidator winterFlowServiceProviderValidator3 = new WinterFlowServiceProviderValidator("ON_UPGRADE", 2);
        WinterFlowUnitTestResponse = winterFlowServiceProviderValidator3;
        WinterFlowServiceProviderValidator winterFlowServiceProviderValidator4 = new WinterFlowServiceProviderValidator("ON_DOWNGRADE", 3);
        WinterFlowRouterRouter = winterFlowServiceProviderValidator4;
        WinterFlowServiceProviderValidator winterFlowServiceProviderValidator5 = new WinterFlowServiceProviderValidator("ON_OPEN", 4);
        WinterFlowSyntax = winterFlowServiceProviderValidator5;
        WinterFlowResponseEngine = new WinterFlowServiceProviderValidator[]{winterFlowServiceProviderValidator, winterFlowServiceProviderValidator2, winterFlowServiceProviderValidator3, winterFlowServiceProviderValidator4, winterFlowServiceProviderValidator5};
    }

    public static WinterFlowServiceProviderValidator valueOf(String str) {
        return (WinterFlowServiceProviderValidator) Enum.valueOf(WinterFlowServiceProviderValidator.class, str);
    }

    public static WinterFlowServiceProviderValidator[] values() {
        return (WinterFlowServiceProviderValidator[]) WinterFlowResponseEngine.clone();
    }
}
