package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBackendInvoker {
    public final ArrayList WinterFlowArrayNetwork;
    public int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final ArrayList WinterFlowRouterStructure;
    public final WinterFlowRendererNode WinterFlowTransactionManagerStrategy;
    public final WinterFlowViewSoftware WinterFlowVariableVersionControl;

    public WinterFlowBackendInvoker(int i, ArrayList arrayList) {
        this.WinterFlowRouterStructure = arrayList;
        this.WinterFlowHookDataSource = i;
        if (i < 0) {
            WinterFlowResponseCloud.WinterFlowRouterStructure("Invalid start index");
        }
        this.WinterFlowArrayNetwork = new ArrayList();
        WinterFlowViewSoftware winterFlowViewSoftware = new WinterFlowViewSoftware();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            WinterFlowNodeConcurrency winterFlowNodeConcurrency = (WinterFlowNodeConcurrency) this.WinterFlowRouterStructure.get(i3);
            int i4 = winterFlowNodeConcurrency.WinterFlowCacheManagerAgent;
            int i5 = winterFlowNodeConcurrency.WinterFlowArrayNetwork;
            winterFlowViewSoftware.WinterFlowRouterRouter(i4, new WinterFlowBandwidthPlatform(i3, i2, i5));
            i2 += i5;
        }
        this.WinterFlowVariableVersionControl = winterFlowViewSoftware;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowRendererNode(new WinterFlowUserManagerDatabase(2, this));
    }

    public final boolean WinterFlowRouterStructure(int i, int i2) {
        WinterFlowBandwidthPlatform winterFlowBandwidthPlatform;
        int i3;
        int i4;
        WinterFlowViewSoftware winterFlowViewSoftware = this.WinterFlowVariableVersionControl;
        WinterFlowBandwidthPlatform winterFlowBandwidthPlatform2 = (WinterFlowBandwidthPlatform) winterFlowViewSoftware.WinterFlowHookDataSource(i);
        if (winterFlowBandwidthPlatform2 == null) {
            return false;
        }
        int i5 = winterFlowBandwidthPlatform2.WinterFlowHookDataSource;
        int i6 = i2 - winterFlowBandwidthPlatform2.WinterFlowCacheManagerAgent;
        winterFlowBandwidthPlatform2.WinterFlowCacheManagerAgent = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = winterFlowViewSoftware.WinterFlowCacheManagerAgent;
        long[] jArr = winterFlowViewSoftware.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (winterFlowBandwidthPlatform = (WinterFlowBandwidthPlatform) objArr[(i7 << 3) + i9]).WinterFlowHookDataSource) >= i5 && winterFlowBandwidthPlatform != winterFlowBandwidthPlatform2 && (i4 = i3 + i6) >= 0) {
                        winterFlowBandwidthPlatform.WinterFlowHookDataSource = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
