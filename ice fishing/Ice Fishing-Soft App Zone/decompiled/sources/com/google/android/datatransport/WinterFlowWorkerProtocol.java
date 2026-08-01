package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWorkerProtocol {
    public static final /* synthetic */ WinterFlowWorkerProtocol[] WinterFlowRouterRouter;
    public static final WinterFlowWorkerProtocol WinterFlowTransactionManagerStrategy;
    public static final WinterFlowWorkerProtocol WinterFlowUnitTestResponse;
    public static final WinterFlowWorkerProtocol WinterFlowVariableVersionControl;

    static {
        WinterFlowWorkerProtocol winterFlowWorkerProtocol = new WinterFlowWorkerProtocol("Yes", 0);
        WinterFlowVariableVersionControl = winterFlowWorkerProtocol;
        WinterFlowWorkerProtocol winterFlowWorkerProtocol2 = new WinterFlowWorkerProtocol("No", 1);
        WinterFlowTransactionManagerStrategy = winterFlowWorkerProtocol2;
        WinterFlowWorkerProtocol winterFlowWorkerProtocol3 = new WinterFlowWorkerProtocol("NotInitialized", 2);
        WinterFlowUnitTestResponse = winterFlowWorkerProtocol3;
        WinterFlowRouterRouter = new WinterFlowWorkerProtocol[]{winterFlowWorkerProtocol, winterFlowWorkerProtocol2, winterFlowWorkerProtocol3};
    }

    public static WinterFlowWorkerProtocol valueOf(String str) {
        return (WinterFlowWorkerProtocol) Enum.valueOf(WinterFlowWorkerProtocol.class, str);
    }

    public static WinterFlowWorkerProtocol[] values() {
        return (WinterFlowWorkerProtocol[]) WinterFlowRouterRouter.clone();
    }
}
