package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDataSourceHandler {
    public static final /* synthetic */ WinterFlowDataSourceHandler[] WinterFlowRouterRouter;
    public static final WinterFlowDataSourceHandler WinterFlowTransactionManagerStrategy;
    public static final WinterFlowDataSourceHandler WinterFlowUnitTestResponse;
    public static final WinterFlowDataSourceHandler WinterFlowVariableVersionControl;

    static {
        WinterFlowDataSourceHandler winterFlowDataSourceHandler = new WinterFlowDataSourceHandler("SUSPEND", 0);
        WinterFlowVariableVersionControl = winterFlowDataSourceHandler;
        WinterFlowDataSourceHandler winterFlowDataSourceHandler2 = new WinterFlowDataSourceHandler("DROP_OLDEST", 1);
        WinterFlowTransactionManagerStrategy = winterFlowDataSourceHandler2;
        WinterFlowDataSourceHandler winterFlowDataSourceHandler3 = new WinterFlowDataSourceHandler("DROP_LATEST", 2);
        WinterFlowUnitTestResponse = winterFlowDataSourceHandler3;
        WinterFlowRouterRouter = new WinterFlowDataSourceHandler[]{winterFlowDataSourceHandler, winterFlowDataSourceHandler2, winterFlowDataSourceHandler3};
    }

    public static WinterFlowDataSourceHandler valueOf(String str) {
        return (WinterFlowDataSourceHandler) Enum.valueOf(WinterFlowDataSourceHandler.class, str);
    }

    public static WinterFlowDataSourceHandler[] values() {
        return (WinterFlowDataSourceHandler[]) WinterFlowRouterRouter.clone();
    }
}
