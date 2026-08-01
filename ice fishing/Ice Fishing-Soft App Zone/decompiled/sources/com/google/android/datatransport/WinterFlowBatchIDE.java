package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBatchIDE {
    public WinterFlowSoftwareUserManager WinterFlowRouterStructure = null;
    public WinterFlowHookInterface WinterFlowHookDataSource = null;
    public WinterFlowCacheThread WinterFlowCacheManagerAgent = null;
    public WinterFlowManagerCloud WinterFlowArrayNetwork = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowBatchIDE)) {
            return false;
        }
        WinterFlowBatchIDE winterFlowBatchIDE = (WinterFlowBatchIDE) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowBatchIDE.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowBatchIDE.WinterFlowHookDataSource) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowCacheManagerAgent, winterFlowBatchIDE.WinterFlowCacheManagerAgent) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowArrayNetwork, winterFlowBatchIDE.WinterFlowArrayNetwork);
    }

    public final int hashCode() {
        WinterFlowSoftwareUserManager winterFlowSoftwareUserManager = this.WinterFlowRouterStructure;
        int hashCode = (winterFlowSoftwareUserManager == null ? 0 : winterFlowSoftwareUserManager.hashCode()) * 31;
        WinterFlowHookInterface winterFlowHookInterface = this.WinterFlowHookDataSource;
        int hashCode2 = (hashCode + (winterFlowHookInterface == null ? 0 : winterFlowHookInterface.hashCode())) * 31;
        WinterFlowCacheThread winterFlowCacheThread = this.WinterFlowCacheManagerAgent;
        int hashCode3 = (hashCode2 + (winterFlowCacheThread == null ? 0 : winterFlowCacheThread.hashCode())) * 31;
        WinterFlowManagerCloud winterFlowManagerCloud = this.WinterFlowArrayNetwork;
        return hashCode3 + (winterFlowManagerCloud != null ? winterFlowManagerCloud.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.WinterFlowRouterStructure + ", canvas=" + this.WinterFlowHookDataSource + ", canvasDrawScope=" + this.WinterFlowCacheManagerAgent + ", borderPath=" + this.WinterFlowArrayNetwork + ')';
    }
}
