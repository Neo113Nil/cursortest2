package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectService {
    public static final /* synthetic */ WinterFlowObjectService[] WinterFlowRouterRouter;
    public static final WinterFlowObjectService WinterFlowTransactionManagerStrategy;
    public static final WinterFlowObjectService WinterFlowUnitTestResponse;
    public static final WinterFlowObjectService WinterFlowVariableVersionControl;

    static {
        WinterFlowObjectService winterFlowObjectService = new WinterFlowObjectService("Vertical", 0);
        WinterFlowVariableVersionControl = winterFlowObjectService;
        WinterFlowObjectService winterFlowObjectService2 = new WinterFlowObjectService("Horizontal", 1);
        WinterFlowTransactionManagerStrategy = winterFlowObjectService2;
        WinterFlowObjectService winterFlowObjectService3 = new WinterFlowObjectService("Both", 2);
        WinterFlowUnitTestResponse = winterFlowObjectService3;
        WinterFlowRouterRouter = new WinterFlowObjectService[]{winterFlowObjectService, winterFlowObjectService2, winterFlowObjectService3};
    }

    public static WinterFlowObjectService valueOf(String str) {
        return (WinterFlowObjectService) Enum.valueOf(WinterFlowObjectService.class, str);
    }

    public static WinterFlowObjectService[] values() {
        return (WinterFlowObjectService[]) WinterFlowRouterRouter.clone();
    }
}
