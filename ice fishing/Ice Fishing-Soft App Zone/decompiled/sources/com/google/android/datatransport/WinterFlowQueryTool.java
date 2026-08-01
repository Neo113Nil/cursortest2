package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowQueryTool {
    public static final int WinterFlowArrayNetwork(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final int WinterFlowCacheManagerAgent(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((WinterFlowDatabaseSchemaHandler) arrayList.get(i4)).WinterFlowRouterStructure;
            if (i5 < 0) {
                i5 += i2;
            }
            int WinterFlowBatchUI = WinterFlowManagerRequest.WinterFlowBatchUI(i5, i);
            if (WinterFlowBatchUI < 0) {
                i3 = i4 + 1;
            } else {
                if (WinterFlowBatchUI <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int WinterFlowHookDataSource(ArrayList arrayList, int i, int i2) {
        int WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent(arrayList, i, i2);
        return WinterFlowCacheManagerAgent >= 0 ? WinterFlowCacheManagerAgent : -(WinterFlowCacheManagerAgent + 1);
    }

    public static final WinterFlowMapperInterface WinterFlowRouterStructure(WinterFlowMapperInterface winterFlowMapperInterface) {
        if (!(winterFlowMapperInterface instanceof WinterFlowMapperInterface)) {
            winterFlowMapperInterface = null;
        }
        if (winterFlowMapperInterface != null) {
            return winterFlowMapperInterface;
        }
        WinterFlowSessionManagerEntity.WinterFlowHookDataSource("Inconsistent composition");
        throw new WinterFlowServerSystem();
    }

    public static final void WinterFlowTransactionManagerStrategy(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final void WinterFlowVariableVersionControl() {
        throw new ConcurrentModificationException();
    }
}
