package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServerProxy {
    public static final WinterFlowServerProxy WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowServerProxy[] WinterFlowUnitTestResponse;
    public static final WinterFlowServerProxy WinterFlowVariableVersionControl;

    static {
        WinterFlowServerProxy winterFlowServerProxy = new WinterFlowServerProxy("SHOW_ORIGINAL", 0);
        WinterFlowVariableVersionControl = winterFlowServerProxy;
        WinterFlowServerProxy winterFlowServerProxy2 = new WinterFlowServerProxy("SHOW_TRANSLATED", 1);
        WinterFlowTransactionManagerStrategy = winterFlowServerProxy2;
        WinterFlowUnitTestResponse = new WinterFlowServerProxy[]{winterFlowServerProxy, winterFlowServerProxy2};
    }

    public static WinterFlowServerProxy valueOf(String str) {
        return (WinterFlowServerProxy) Enum.valueOf(WinterFlowServerProxy.class, str);
    }

    public static WinterFlowServerProxy[] values() {
        return (WinterFlowServerProxy[]) WinterFlowUnitTestResponse.clone();
    }
}
