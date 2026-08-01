package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBackendBatch {
    public static final WinterFlowBackendBatch WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowBackendBatch[] WinterFlowUnitTestResponse;
    public static final WinterFlowBackendBatch WinterFlowVariableVersionControl;

    static {
        WinterFlowBackendBatch winterFlowBackendBatch = new WinterFlowBackendBatch("Vertical", 0);
        WinterFlowVariableVersionControl = winterFlowBackendBatch;
        WinterFlowBackendBatch winterFlowBackendBatch2 = new WinterFlowBackendBatch("Horizontal", 1);
        WinterFlowTransactionManagerStrategy = winterFlowBackendBatch2;
        WinterFlowUnitTestResponse = new WinterFlowBackendBatch[]{winterFlowBackendBatch, winterFlowBackendBatch2};
    }

    public static WinterFlowBackendBatch valueOf(String str) {
        return (WinterFlowBackendBatch) Enum.valueOf(WinterFlowBackendBatch.class, str);
    }

    public static WinterFlowBackendBatch[] values() {
        return (WinterFlowBackendBatch[]) WinterFlowUnitTestResponse.clone();
    }
}
