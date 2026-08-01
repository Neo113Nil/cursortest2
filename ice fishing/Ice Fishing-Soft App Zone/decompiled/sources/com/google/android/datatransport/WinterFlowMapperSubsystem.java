package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperSubsystem {
    public static final /* synthetic */ WinterFlowMapperSubsystem[] WinterFlowRouterRouter;
    public static final WinterFlowMapperSubsystem WinterFlowTransactionManagerStrategy;
    public static final WinterFlowMapperSubsystem WinterFlowUnitTestResponse;
    public static final WinterFlowMapperSubsystem WinterFlowVariableVersionControl;

    static {
        WinterFlowMapperSubsystem winterFlowMapperSubsystem = new WinterFlowMapperSubsystem("InMeasureBlock", 0);
        WinterFlowVariableVersionControl = winterFlowMapperSubsystem;
        WinterFlowMapperSubsystem winterFlowMapperSubsystem2 = new WinterFlowMapperSubsystem("InLayoutBlock", 1);
        WinterFlowTransactionManagerStrategy = winterFlowMapperSubsystem2;
        WinterFlowMapperSubsystem winterFlowMapperSubsystem3 = new WinterFlowMapperSubsystem("NotUsed", 2);
        WinterFlowUnitTestResponse = winterFlowMapperSubsystem3;
        WinterFlowRouterRouter = new WinterFlowMapperSubsystem[]{winterFlowMapperSubsystem, winterFlowMapperSubsystem2, winterFlowMapperSubsystem3};
    }

    public static WinterFlowMapperSubsystem valueOf(String str) {
        return (WinterFlowMapperSubsystem) Enum.valueOf(WinterFlowMapperSubsystem.class, str);
    }

    public static WinterFlowMapperSubsystem[] values() {
        return (WinterFlowMapperSubsystem[]) WinterFlowRouterRouter.clone();
    }
}
