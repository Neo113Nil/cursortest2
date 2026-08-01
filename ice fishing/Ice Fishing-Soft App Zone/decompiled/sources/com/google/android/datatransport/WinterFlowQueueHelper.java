package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueueHelper {
    public static final WinterFlowQueueHelper WinterFlowResponseEngine;
    public static final WinterFlowQueueHelper WinterFlowRouterRouter;
    public static final /* synthetic */ WinterFlowQueueHelper[] WinterFlowServerProtocol;
    public static final WinterFlowQueueHelper WinterFlowSyntax;
    public static final WinterFlowQueueHelper WinterFlowTransactionAgent;
    public static final WinterFlowQueueHelper WinterFlowTransactionManagerStrategy;
    public static final WinterFlowQueueHelper WinterFlowUnitTestResponse;
    public static final WinterFlowQueueHelper WinterFlowVariableVersionControl;

    static {
        WinterFlowQueueHelper winterFlowQueueHelper = new WinterFlowQueueHelper("Paragraph", 0);
        WinterFlowVariableVersionControl = winterFlowQueueHelper;
        WinterFlowQueueHelper winterFlowQueueHelper2 = new WinterFlowQueueHelper("Span", 1);
        WinterFlowTransactionManagerStrategy = winterFlowQueueHelper2;
        WinterFlowQueueHelper winterFlowQueueHelper3 = new WinterFlowQueueHelper("VerbatimTts", 2);
        WinterFlowUnitTestResponse = winterFlowQueueHelper3;
        WinterFlowQueueHelper winterFlowQueueHelper4 = new WinterFlowQueueHelper("Url", 3);
        WinterFlowRouterRouter = winterFlowQueueHelper4;
        WinterFlowQueueHelper winterFlowQueueHelper5 = new WinterFlowQueueHelper("Link", 4);
        WinterFlowSyntax = winterFlowQueueHelper5;
        WinterFlowQueueHelper winterFlowQueueHelper6 = new WinterFlowQueueHelper("Clickable", 5);
        WinterFlowResponseEngine = winterFlowQueueHelper6;
        WinterFlowQueueHelper winterFlowQueueHelper7 = new WinterFlowQueueHelper("String", 6);
        WinterFlowTransactionAgent = winterFlowQueueHelper7;
        WinterFlowServerProtocol = new WinterFlowQueueHelper[]{winterFlowQueueHelper, winterFlowQueueHelper2, winterFlowQueueHelper3, winterFlowQueueHelper4, winterFlowQueueHelper5, winterFlowQueueHelper6, winterFlowQueueHelper7};
    }

    public static WinterFlowQueueHelper valueOf(String str) {
        return (WinterFlowQueueHelper) Enum.valueOf(WinterFlowQueueHelper.class, str);
    }

    public static WinterFlowQueueHelper[] values() {
        return (WinterFlowQueueHelper[]) WinterFlowServerProtocol.clone();
    }
}
