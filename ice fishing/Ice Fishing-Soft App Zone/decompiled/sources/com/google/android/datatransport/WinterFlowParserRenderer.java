package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowParserRenderer {
    public static final WinterFlowParserRenderer WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowParserRenderer[] WinterFlowUnitTestResponse;
    public static final WinterFlowParserRenderer WinterFlowVariableVersionControl;

    static {
        WinterFlowParserRenderer winterFlowParserRenderer = new WinterFlowParserRenderer("BoundReached", 0);
        WinterFlowVariableVersionControl = winterFlowParserRenderer;
        WinterFlowParserRenderer winterFlowParserRenderer2 = new WinterFlowParserRenderer("Finished", 1);
        WinterFlowTransactionManagerStrategy = winterFlowParserRenderer2;
        WinterFlowUnitTestResponse = new WinterFlowParserRenderer[]{winterFlowParserRenderer, winterFlowParserRenderer2};
    }

    public static WinterFlowParserRenderer valueOf(String str) {
        return (WinterFlowParserRenderer) Enum.valueOf(WinterFlowParserRenderer.class, str);
    }

    public static WinterFlowParserRenderer[] values() {
        return (WinterFlowParserRenderer[]) WinterFlowUnitTestResponse.clone();
    }
}
