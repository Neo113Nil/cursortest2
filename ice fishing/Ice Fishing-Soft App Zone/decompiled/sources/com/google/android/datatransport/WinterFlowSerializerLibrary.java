package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSerializerLibrary {
    public static final WinterFlowSerializerLibrary WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowSerializerLibrary[] WinterFlowUnitTestResponse;
    public static final WinterFlowSerializerLibrary WinterFlowVariableVersionControl;

    static {
        WinterFlowSerializerLibrary winterFlowSerializerLibrary = new WinterFlowSerializerLibrary("Successfully", 0);
        WinterFlowVariableVersionControl = winterFlowSerializerLibrary;
        WinterFlowSerializerLibrary winterFlowSerializerLibrary2 = new WinterFlowSerializerLibrary("Failure", 1);
        WinterFlowTransactionManagerStrategy = winterFlowSerializerLibrary2;
        WinterFlowUnitTestResponse = new WinterFlowSerializerLibrary[]{winterFlowSerializerLibrary, winterFlowSerializerLibrary2};
    }

    public static WinterFlowSerializerLibrary valueOf(String str) {
        return (WinterFlowSerializerLibrary) Enum.valueOf(WinterFlowSerializerLibrary.class, str);
    }

    public static WinterFlowSerializerLibrary[] values() {
        return (WinterFlowSerializerLibrary[]) WinterFlowUnitTestResponse.clone();
    }
}
