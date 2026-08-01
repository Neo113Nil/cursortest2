package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowSchedulerFrontend {
    public static final float[] WinterFlowRouterStructure;

    static {
        long[] jArr = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
        int WinterFlowArrayNetwork = WinterFlowDatabaseSchemaUtility.WinterFlowArrayNetwork(0);
        int max = WinterFlowArrayNetwork > 0 ? Math.max(7, WinterFlowDatabaseSchemaUtility.WinterFlowCacheManagerAgent(WinterFlowArrayNetwork)) : 0;
        if (max != 0) {
            int i = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i];
            Arrays.fill(jArr2, 0, i, -9187201950435737472L);
            jArr = jArr2;
        }
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[max];
        WinterFlowRouterStructure = new float[0];
    }
}
