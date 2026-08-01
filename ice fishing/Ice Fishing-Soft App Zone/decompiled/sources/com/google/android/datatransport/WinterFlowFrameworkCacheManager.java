package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkCacheManager {
    public static final WinterFlowFrameworkCacheManager WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowFrameworkCacheManager[] WinterFlowUnitTestResponse;
    public static final WinterFlowFrameworkCacheManager WinterFlowVariableVersionControl;

    static {
        WinterFlowFrameworkCacheManager winterFlowFrameworkCacheManager = new WinterFlowFrameworkCacheManager("On", 0);
        WinterFlowVariableVersionControl = winterFlowFrameworkCacheManager;
        WinterFlowFrameworkCacheManager winterFlowFrameworkCacheManager2 = new WinterFlowFrameworkCacheManager("Off", 1);
        WinterFlowTransactionManagerStrategy = winterFlowFrameworkCacheManager2;
        WinterFlowUnitTestResponse = new WinterFlowFrameworkCacheManager[]{winterFlowFrameworkCacheManager, winterFlowFrameworkCacheManager2, new WinterFlowFrameworkCacheManager("Indeterminate", 2)};
    }

    public static WinterFlowFrameworkCacheManager valueOf(String str) {
        return (WinterFlowFrameworkCacheManager) Enum.valueOf(WinterFlowFrameworkCacheManager.class, str);
    }

    public static WinterFlowFrameworkCacheManager[] values() {
        return (WinterFlowFrameworkCacheManager[]) WinterFlowUnitTestResponse.clone();
    }
}
