package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowResponseTool {
    private static final void WinterFlowArrayNetwork(int i) {
        throw new IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
    }

    private static final void WinterFlowCacheManagerAgent(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    public static final void WinterFlowHookDataSource(List list, int i, int i2) {
        if (i > i2) {
            WinterFlowTransactionManagerStrategy(i, i2);
        }
        if (i < 0) {
            WinterFlowArrayNetwork(i);
        }
        if (i2 > list.size()) {
            WinterFlowVariableVersionControl(i2, list.size());
        }
    }

    public static final void WinterFlowRouterStructure(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            WinterFlowCacheManagerAgent(i, size);
        }
    }

    private static final void WinterFlowTransactionManagerStrategy(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }

    private static final void WinterFlowVariableVersionControl(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }
}
