package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModuleAgent {
    public static final WinterFlowModuleAgent WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowModuleAgent[] WinterFlowUnitTestResponse;
    public static final WinterFlowModuleAgent WinterFlowVariableVersionControl;

    static {
        WinterFlowModuleAgent winterFlowModuleAgent = new WinterFlowModuleAgent("Ltr", 0);
        WinterFlowVariableVersionControl = winterFlowModuleAgent;
        WinterFlowModuleAgent winterFlowModuleAgent2 = new WinterFlowModuleAgent("Rtl", 1);
        WinterFlowTransactionManagerStrategy = winterFlowModuleAgent2;
        WinterFlowUnitTestResponse = new WinterFlowModuleAgent[]{winterFlowModuleAgent, winterFlowModuleAgent2};
    }

    public static WinterFlowModuleAgent valueOf(String str) {
        return (WinterFlowModuleAgent) Enum.valueOf(WinterFlowModuleAgent.class, str);
    }

    public static WinterFlowModuleAgent[] values() {
        return (WinterFlowModuleAgent[]) WinterFlowUnitTestResponse.clone();
    }
}
