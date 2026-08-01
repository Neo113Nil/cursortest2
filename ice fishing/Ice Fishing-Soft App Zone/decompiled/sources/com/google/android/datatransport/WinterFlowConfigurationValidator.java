package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConfigurationValidator {
    public static final WinterFlowConfigurationValidator WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowConfigurationValidator[] WinterFlowUnitTestResponse;
    public static final WinterFlowConfigurationValidator WinterFlowVariableVersionControl;

    static {
        WinterFlowConfigurationValidator winterFlowConfigurationValidator = new WinterFlowConfigurationValidator("VIEW_APPEAR", 0);
        WinterFlowVariableVersionControl = winterFlowConfigurationValidator;
        WinterFlowConfigurationValidator winterFlowConfigurationValidator2 = new WinterFlowConfigurationValidator("VIEW_DISAPPEAR", 1);
        WinterFlowTransactionManagerStrategy = winterFlowConfigurationValidator2;
        WinterFlowUnitTestResponse = new WinterFlowConfigurationValidator[]{winterFlowConfigurationValidator, winterFlowConfigurationValidator2};
    }

    public static WinterFlowConfigurationValidator valueOf(String str) {
        return (WinterFlowConfigurationValidator) Enum.valueOf(WinterFlowConfigurationValidator.class, str);
    }

    public static WinterFlowConfigurationValidator[] values() {
        return (WinterFlowConfigurationValidator[]) WinterFlowUnitTestResponse.clone();
    }
}
