package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxyMechanism {
    public static final /* synthetic */ WinterFlowProxyMechanism[] WinterFlowRouterRouter;
    public static final WinterFlowProxyMechanism WinterFlowTransactionManagerStrategy;
    public static final WinterFlowProxyMechanism WinterFlowUnitTestResponse;
    public static final WinterFlowProxyMechanism WinterFlowVariableVersionControl;

    static {
        WinterFlowProxyMechanism winterFlowProxyMechanism = new WinterFlowProxyMechanism("None", 0);
        WinterFlowVariableVersionControl = winterFlowProxyMechanism;
        WinterFlowProxyMechanism winterFlowProxyMechanism2 = new WinterFlowProxyMechanism("Cancelled", 1);
        WinterFlowTransactionManagerStrategy = winterFlowProxyMechanism2;
        WinterFlowProxyMechanism winterFlowProxyMechanism3 = new WinterFlowProxyMechanism("Redirected", 2);
        WinterFlowUnitTestResponse = winterFlowProxyMechanism3;
        WinterFlowRouterRouter = new WinterFlowProxyMechanism[]{winterFlowProxyMechanism, winterFlowProxyMechanism2, winterFlowProxyMechanism3, new WinterFlowProxyMechanism("RedirectCancelled", 3)};
    }

    public static WinterFlowProxyMechanism valueOf(String str) {
        return (WinterFlowProxyMechanism) Enum.valueOf(WinterFlowProxyMechanism.class, str);
    }

    public static WinterFlowProxyMechanism[] values() {
        return (WinterFlowProxyMechanism[]) WinterFlowRouterRouter.clone();
    }
}
