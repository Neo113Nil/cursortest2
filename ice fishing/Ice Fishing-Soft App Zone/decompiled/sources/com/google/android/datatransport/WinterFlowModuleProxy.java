package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModuleProxy {
    public static final WinterFlowModuleProxy WinterFlowRouterRouter;
    public static final /* synthetic */ WinterFlowModuleProxy[] WinterFlowSyntax;
    public static final WinterFlowModuleProxy WinterFlowTransactionManagerStrategy;
    public static final WinterFlowModuleProxy WinterFlowUnitTestResponse;
    public static final WinterFlowModuleProxy WinterFlowVariableVersionControl;

    static {
        WinterFlowModuleProxy winterFlowModuleProxy = new WinterFlowModuleProxy("DEFAULT", 0);
        WinterFlowVariableVersionControl = winterFlowModuleProxy;
        WinterFlowModuleProxy winterFlowModuleProxy2 = new WinterFlowModuleProxy("LAZY", 1);
        WinterFlowTransactionManagerStrategy = winterFlowModuleProxy2;
        WinterFlowModuleProxy winterFlowModuleProxy3 = new WinterFlowModuleProxy("ATOMIC", 2);
        WinterFlowUnitTestResponse = winterFlowModuleProxy3;
        WinterFlowModuleProxy winterFlowModuleProxy4 = new WinterFlowModuleProxy("UNDISPATCHED", 3);
        WinterFlowRouterRouter = winterFlowModuleProxy4;
        WinterFlowSyntax = new WinterFlowModuleProxy[]{winterFlowModuleProxy, winterFlowModuleProxy2, winterFlowModuleProxy3, winterFlowModuleProxy4};
    }

    public static WinterFlowModuleProxy valueOf(String str) {
        return (WinterFlowModuleProxy) Enum.valueOf(WinterFlowModuleProxy.class, str);
    }

    public static WinterFlowModuleProxy[] values() {
        return (WinterFlowModuleProxy[]) WinterFlowSyntax.clone();
    }
}
