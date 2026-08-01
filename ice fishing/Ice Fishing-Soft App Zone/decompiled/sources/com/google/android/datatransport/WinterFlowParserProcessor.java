package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowParserProcessor {
    public static final WinterFlowParserProcessor WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowParserProcessor[] WinterFlowUnitTestResponse;
    public static final WinterFlowParserProcessor WinterFlowVariableVersionControl;

    static {
        WinterFlowParserProcessor winterFlowParserProcessor = new WinterFlowParserProcessor("Lsq2", 0);
        WinterFlowVariableVersionControl = winterFlowParserProcessor;
        WinterFlowParserProcessor winterFlowParserProcessor2 = new WinterFlowParserProcessor("Impulse", 1);
        WinterFlowTransactionManagerStrategy = winterFlowParserProcessor2;
        WinterFlowUnitTestResponse = new WinterFlowParserProcessor[]{winterFlowParserProcessor, winterFlowParserProcessor2};
    }

    public static WinterFlowParserProcessor valueOf(String str) {
        return (WinterFlowParserProcessor) Enum.valueOf(WinterFlowParserProcessor.class, str);
    }

    public static WinterFlowParserProcessor[] values() {
        return (WinterFlowParserProcessor[]) WinterFlowUnitTestResponse.clone();
    }
}
