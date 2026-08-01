package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloudHelper {
    public final WinterFlowDebugDatabaseSchema WinterFlowHookDataSource;
    public final WinterFlowRepositoryBandwidth WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowCloudHelper(WinterFlowRepositoryBandwidth winterFlowRepositoryBandwidth, WinterFlowDebugDatabaseSchema winterFlowDebugDatabaseSchema) {
        this.WinterFlowRouterStructure = winterFlowRepositoryBandwidth;
        this.WinterFlowHookDataSource = winterFlowDebugDatabaseSchema;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowCloudHelper)) {
            return false;
        }
        WinterFlowCloudHelper winterFlowCloudHelper = (WinterFlowCloudHelper) obj;
        return WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowRouterStructure, winterFlowCloudHelper.WinterFlowRouterStructure) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowHookDataSource, winterFlowCloudHelper.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.WinterFlowRouterStructure, this.WinterFlowHookDataSource});
    }

    public final String toString() {
        WinterFlowAlgorithmArray winterFlowAlgorithmArray = new WinterFlowAlgorithmArray(this);
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowRouterStructure, "key");
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowHookDataSource, "feature");
        return winterFlowAlgorithmArray.toString();
    }
}
