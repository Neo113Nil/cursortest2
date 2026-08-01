package com.google.android.datatransport;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowViewNode {
    public final WinterFlowMicroserviceSubsystem WinterFlowCacheManagerAgent;
    public final byte[] WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowViewNode(String str, byte[] bArr, WinterFlowMicroserviceSubsystem winterFlowMicroserviceSubsystem) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = bArr;
        this.WinterFlowCacheManagerAgent = winterFlowMicroserviceSubsystem;
    }

    public static WinterFlowObjectPackage WinterFlowRouterStructure() {
        WinterFlowObjectPackage winterFlowObjectPackage = new WinterFlowObjectPackage(3, false);
        winterFlowObjectPackage.WinterFlowRouterRouter = WinterFlowMicroserviceSubsystem.WinterFlowVariableVersionControl;
        return winterFlowObjectPackage;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowViewNode) {
            WinterFlowViewNode winterFlowViewNode = (WinterFlowViewNode) obj;
            if (this.WinterFlowRouterStructure.equals(winterFlowViewNode.WinterFlowRouterStructure) && Arrays.equals(this.WinterFlowHookDataSource, winterFlowViewNode.WinterFlowHookDataSource) && this.WinterFlowCacheManagerAgent.equals(winterFlowViewNode.WinterFlowCacheManagerAgent)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowCacheManagerAgent.hashCode() ^ ((((this.WinterFlowRouterStructure.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.WinterFlowHookDataSource)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.WinterFlowHookDataSource;
        return "TransportContext(" + this.WinterFlowRouterStructure + ", " + this.WinterFlowCacheManagerAgent + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
