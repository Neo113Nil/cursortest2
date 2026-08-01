package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDatabaseSchemaUtility {
    public static final long[] WinterFlowRouterStructure = {-9187201950435737345L, -1};

    static {
        new WinterFlowDatabaseSchemaStructure(0);
    }

    public static final int WinterFlowArrayNetwork(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }

    public static final int WinterFlowCacheManagerAgent(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int WinterFlowHookDataSource(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int WinterFlowRouterStructure(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }
}
