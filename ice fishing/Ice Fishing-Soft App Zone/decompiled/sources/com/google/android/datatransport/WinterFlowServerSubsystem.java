package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServerSubsystem {
    public static final /* synthetic */ WinterFlowServerSubsystem[] WinterFlowRouterRouter;
    public static final WinterFlowServerSubsystem WinterFlowTransactionManagerStrategy;
    public static final WinterFlowServerSubsystem WinterFlowUnitTestResponse;
    public static final WinterFlowServerSubsystem WinterFlowVariableVersionControl;

    static {
        WinterFlowServerSubsystem winterFlowServerSubsystem = new WinterFlowServerSubsystem("NO_OP", 0);
        WinterFlowVariableVersionControl = winterFlowServerSubsystem;
        WinterFlowServerSubsystem winterFlowServerSubsystem2 = new WinterFlowServerSubsystem("ADD", 1);
        WinterFlowTransactionManagerStrategy = winterFlowServerSubsystem2;
        WinterFlowServerSubsystem winterFlowServerSubsystem3 = new WinterFlowServerSubsystem("REMOVE", 2);
        WinterFlowUnitTestResponse = winterFlowServerSubsystem3;
        WinterFlowRouterRouter = new WinterFlowServerSubsystem[]{winterFlowServerSubsystem, winterFlowServerSubsystem2, winterFlowServerSubsystem3};
    }

    public static WinterFlowServerSubsystem valueOf(String str) {
        return (WinterFlowServerSubsystem) Enum.valueOf(WinterFlowServerSubsystem.class, str);
    }

    public static WinterFlowServerSubsystem[] values() {
        return (WinterFlowServerSubsystem[]) WinterFlowRouterRouter.clone();
    }
}
