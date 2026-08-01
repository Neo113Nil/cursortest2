package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAdapter {
    public static final WinterFlowAdapter WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowAdapter[] WinterFlowUnitTestResponse;
    public static final WinterFlowAdapter WinterFlowVariableVersionControl;

    static {
        WinterFlowAdapter winterFlowAdapter = new WinterFlowAdapter("DEFERRED", 0);
        WinterFlowVariableVersionControl = winterFlowAdapter;
        WinterFlowAdapter winterFlowAdapter2 = new WinterFlowAdapter("IMMEDIATE", 1);
        WinterFlowTransactionManagerStrategy = winterFlowAdapter2;
        WinterFlowUnitTestResponse = new WinterFlowAdapter[]{winterFlowAdapter, winterFlowAdapter2, new WinterFlowAdapter("EXCLUSIVE", 2)};
    }

    public static WinterFlowAdapter valueOf(String str) {
        return (WinterFlowAdapter) Enum.valueOf(WinterFlowAdapter.class, str);
    }

    public static WinterFlowAdapter[] values() {
        return (WinterFlowAdapter[]) WinterFlowUnitTestResponse.clone();
    }
}
