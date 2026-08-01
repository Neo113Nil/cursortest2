package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSoftwareProxy {
    public static final /* synthetic */ WinterFlowSoftwareProxy[] WinterFlowRouterRouter;
    public static final WinterFlowSoftwareProxy WinterFlowTransactionManagerStrategy;
    public static final WinterFlowSoftwareProxy WinterFlowUnitTestResponse;
    public static final WinterFlowSoftwareProxy WinterFlowVariableVersionControl;

    static {
        WinterFlowSoftwareProxy winterFlowSoftwareProxy = new WinterFlowSoftwareProxy("IsPlacedInLookahead", 0);
        WinterFlowVariableVersionControl = winterFlowSoftwareProxy;
        WinterFlowSoftwareProxy winterFlowSoftwareProxy2 = new WinterFlowSoftwareProxy("IsPlacedInApproach", 1);
        WinterFlowTransactionManagerStrategy = winterFlowSoftwareProxy2;
        WinterFlowSoftwareProxy winterFlowSoftwareProxy3 = new WinterFlowSoftwareProxy("IsNotPlaced", 2);
        WinterFlowUnitTestResponse = winterFlowSoftwareProxy3;
        WinterFlowRouterRouter = new WinterFlowSoftwareProxy[]{winterFlowSoftwareProxy, winterFlowSoftwareProxy2, winterFlowSoftwareProxy3};
    }

    public static WinterFlowSoftwareProxy valueOf(String str) {
        return (WinterFlowSoftwareProxy) Enum.valueOf(WinterFlowSoftwareProxy.class, str);
    }

    public static WinterFlowSoftwareProxy[] values() {
        return (WinterFlowSoftwareProxy[]) WinterFlowRouterRouter.clone();
    }
}
