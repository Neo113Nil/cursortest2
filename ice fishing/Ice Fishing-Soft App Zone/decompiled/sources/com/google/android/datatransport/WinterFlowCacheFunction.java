package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheFunction {
    public static final /* synthetic */ WinterFlowCacheFunction[] WinterFlowRouterRouter;
    public static final WinterFlowCacheFunction WinterFlowTransactionManagerStrategy;
    public static final WinterFlowCacheFunction WinterFlowUnitTestResponse;
    public static final WinterFlowCacheFunction WinterFlowVariableVersionControl;

    static {
        WinterFlowCacheFunction winterFlowCacheFunction = new WinterFlowCacheFunction("NETWORK_UNMETERED", 0);
        WinterFlowVariableVersionControl = winterFlowCacheFunction;
        WinterFlowCacheFunction winterFlowCacheFunction2 = new WinterFlowCacheFunction("DEVICE_IDLE", 1);
        WinterFlowTransactionManagerStrategy = winterFlowCacheFunction2;
        WinterFlowCacheFunction winterFlowCacheFunction3 = new WinterFlowCacheFunction("DEVICE_CHARGING", 2);
        WinterFlowUnitTestResponse = winterFlowCacheFunction3;
        WinterFlowRouterRouter = new WinterFlowCacheFunction[]{winterFlowCacheFunction, winterFlowCacheFunction2, winterFlowCacheFunction3};
    }

    public static WinterFlowCacheFunction valueOf(String str) {
        return (WinterFlowCacheFunction) Enum.valueOf(WinterFlowCacheFunction.class, str);
    }

    public static WinterFlowCacheFunction[] values() {
        return (WinterFlowCacheFunction[]) WinterFlowRouterRouter.clone();
    }
}
