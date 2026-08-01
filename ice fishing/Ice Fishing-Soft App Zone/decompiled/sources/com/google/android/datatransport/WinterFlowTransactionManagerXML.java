package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionManagerXML {
    public static final /* synthetic */ WinterFlowTransactionManagerXML[] WinterFlowRouterRouter;
    public static final WinterFlowTransactionManagerXML WinterFlowTransactionManagerStrategy;
    public static final WinterFlowTransactionManagerXML WinterFlowUnitTestResponse;
    public static final WinterFlowTransactionManagerXML WinterFlowVariableVersionControl;

    static {
        WinterFlowTransactionManagerXML winterFlowTransactionManagerXML = new WinterFlowTransactionManagerXML("START", 0);
        WinterFlowVariableVersionControl = winterFlowTransactionManagerXML;
        WinterFlowTransactionManagerXML winterFlowTransactionManagerXML2 = new WinterFlowTransactionManagerXML("STOP", 1);
        WinterFlowTransactionManagerStrategy = winterFlowTransactionManagerXML2;
        WinterFlowTransactionManagerXML winterFlowTransactionManagerXML3 = new WinterFlowTransactionManagerXML("STOP_AND_RESET_REPLAY_CACHE", 2);
        WinterFlowUnitTestResponse = winterFlowTransactionManagerXML3;
        WinterFlowRouterRouter = new WinterFlowTransactionManagerXML[]{winterFlowTransactionManagerXML, winterFlowTransactionManagerXML2, winterFlowTransactionManagerXML3};
    }

    public static WinterFlowTransactionManagerXML valueOf(String str) {
        return (WinterFlowTransactionManagerXML) Enum.valueOf(WinterFlowTransactionManagerXML.class, str);
    }

    public static WinterFlowTransactionManagerXML[] values() {
        return (WinterFlowTransactionManagerXML[]) WinterFlowRouterRouter.clone();
    }
}
