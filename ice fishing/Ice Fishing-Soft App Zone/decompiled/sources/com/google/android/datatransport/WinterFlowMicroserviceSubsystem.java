package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMicroserviceSubsystem {
    public static final /* synthetic */ WinterFlowMicroserviceSubsystem[] WinterFlowRouterRouter;
    public static final WinterFlowMicroserviceSubsystem WinterFlowTransactionManagerStrategy;
    public static final WinterFlowMicroserviceSubsystem WinterFlowUnitTestResponse;
    public static final WinterFlowMicroserviceSubsystem WinterFlowVariableVersionControl;

    static {
        WinterFlowMicroserviceSubsystem winterFlowMicroserviceSubsystem = new WinterFlowMicroserviceSubsystem("DEFAULT", 0);
        WinterFlowVariableVersionControl = winterFlowMicroserviceSubsystem;
        WinterFlowMicroserviceSubsystem winterFlowMicroserviceSubsystem2 = new WinterFlowMicroserviceSubsystem("VERY_LOW", 1);
        WinterFlowTransactionManagerStrategy = winterFlowMicroserviceSubsystem2;
        WinterFlowMicroserviceSubsystem winterFlowMicroserviceSubsystem3 = new WinterFlowMicroserviceSubsystem("HIGHEST", 2);
        WinterFlowUnitTestResponse = winterFlowMicroserviceSubsystem3;
        WinterFlowRouterRouter = new WinterFlowMicroserviceSubsystem[]{winterFlowMicroserviceSubsystem, winterFlowMicroserviceSubsystem2, winterFlowMicroserviceSubsystem3};
    }

    public static WinterFlowMicroserviceSubsystem valueOf(String str) {
        return (WinterFlowMicroserviceSubsystem) Enum.valueOf(WinterFlowMicroserviceSubsystem.class, str);
    }

    public static WinterFlowMicroserviceSubsystem[] values() {
        return (WinterFlowMicroserviceSubsystem[]) WinterFlowRouterRouter.clone();
    }
}
