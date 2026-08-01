package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProtocolCache {
    public static final /* synthetic */ WinterFlowProtocolCache[] WinterFlowRouterRouter;
    public static final WinterFlowProtocolCache WinterFlowTransactionManagerStrategy;
    public static final WinterFlowProtocolCache WinterFlowUnitTestResponse;
    public static final WinterFlowProtocolCache WinterFlowVariableVersionControl;

    static {
        WinterFlowProtocolCache winterFlowProtocolCache = new WinterFlowProtocolCache("Active", 0);
        WinterFlowVariableVersionControl = winterFlowProtocolCache;
        WinterFlowProtocolCache winterFlowProtocolCache2 = new WinterFlowProtocolCache("ActiveParent", 1);
        WinterFlowTransactionManagerStrategy = winterFlowProtocolCache2;
        WinterFlowProtocolCache winterFlowProtocolCache3 = new WinterFlowProtocolCache("Captured", 2);
        WinterFlowProtocolCache winterFlowProtocolCache4 = new WinterFlowProtocolCache("Inactive", 3);
        WinterFlowUnitTestResponse = winterFlowProtocolCache4;
        WinterFlowRouterRouter = new WinterFlowProtocolCache[]{winterFlowProtocolCache, winterFlowProtocolCache2, winterFlowProtocolCache3, winterFlowProtocolCache4};
    }

    public static WinterFlowProtocolCache valueOf(String str) {
        return (WinterFlowProtocolCache) Enum.valueOf(WinterFlowProtocolCache.class, str);
    }

    public static WinterFlowProtocolCache[] values() {
        return (WinterFlowProtocolCache[]) WinterFlowRouterRouter.clone();
    }

    public final boolean WinterFlowRouterStructure() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                return false;
            }
        }
        return true;
    }
}
