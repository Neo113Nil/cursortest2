package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHandlerJSON extends WinterFlowTransactionVariable {
    public final WinterFlowViewSoftware WinterFlowHookDataSource;

    public WinterFlowHandlerJSON() {
        WinterFlowViewSoftware winterFlowViewSoftware = WinterFlowVersionControlAgent.WinterFlowRouterStructure;
        this.WinterFlowHookDataSource = new WinterFlowViewSoftware();
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionVariable
    public final void WinterFlowArrayNetwork() {
        WinterFlowViewSoftware winterFlowViewSoftware = this.WinterFlowHookDataSource;
        int[] iArr = winterFlowViewSoftware.WinterFlowHookDataSource;
        Object[] objArr = winterFlowViewSoftware.WinterFlowCacheManagerAgent;
        long[] jArr = winterFlowViewSoftware.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = (WinterFlowMicroserviceFunction) objArr[i4];
                        Object[] objArr2 = winterFlowMicroserviceFunction.WinterFlowRouterStructure;
                        int i6 = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
                        for (int i7 = 0; i7 < i6; i7++) {
                            WinterFlowEventEmitterNetwork winterFlowEventEmitterNetwork = (WinterFlowEventEmitterNetwork) objArr2[i7];
                            WinterFlowClassNetwork winterFlowClassNetwork = winterFlowEventEmitterNetwork.WinterFlowArrayNetwork;
                            if (winterFlowClassNetwork != null) {
                                winterFlowClassNetwork.cancel();
                            }
                            winterFlowEventEmitterNetwork.WinterFlowArrayNetwork = null;
                            WinterFlowDeploymentBandwidth winterFlowDeploymentBandwidth = (WinterFlowDeploymentBandwidth) winterFlowEventEmitterNetwork.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy;
                            winterFlowDeploymentBandwidth.WinterFlowTransactionManagerStrategy = true;
                            winterFlowDeploymentBandwidth.WinterFlowVariableVersionControl = false;
                            winterFlowDeploymentBandwidth.WinterFlowRouterStructure();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
