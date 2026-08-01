package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheManagerConfiguration {
    public static final WinterFlowCacheManagerConfiguration WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowCacheManagerConfiguration[] WinterFlowUnitTestResponse;
    public static final WinterFlowCacheManagerConfiguration WinterFlowVariableVersionControl;

    static {
        WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration = new WinterFlowCacheManagerConfiguration("Ltr", 0);
        WinterFlowVariableVersionControl = winterFlowCacheManagerConfiguration;
        WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration2 = new WinterFlowCacheManagerConfiguration("Rtl", 1);
        WinterFlowTransactionManagerStrategy = winterFlowCacheManagerConfiguration2;
        WinterFlowUnitTestResponse = new WinterFlowCacheManagerConfiguration[]{winterFlowCacheManagerConfiguration, winterFlowCacheManagerConfiguration2};
    }

    public static WinterFlowCacheManagerConfiguration valueOf(String str) {
        return (WinterFlowCacheManagerConfiguration) Enum.valueOf(WinterFlowCacheManagerConfiguration.class, str);
    }

    public static WinterFlowCacheManagerConfiguration[] values() {
        return (WinterFlowCacheManagerConfiguration[]) WinterFlowUnitTestResponse.clone();
    }
}
