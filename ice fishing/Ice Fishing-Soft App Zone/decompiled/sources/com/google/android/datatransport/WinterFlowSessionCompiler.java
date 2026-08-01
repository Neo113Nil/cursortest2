package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionCompiler extends WinterFlowTestingCloud {
    public final WinterFlowManagerCloud WinterFlowServiceUtility;
    public final WinterFlowQueryJSON WinterFlowThreadListener;

    public WinterFlowSessionCompiler(WinterFlowQueryJSON winterFlowQueryJSON) {
        WinterFlowManagerCloud winterFlowManagerCloud;
        this.WinterFlowThreadListener = winterFlowQueryJSON;
        if (WinterFlowFrameworkMechanism.WinterFlowSyntax(winterFlowQueryJSON)) {
            winterFlowManagerCloud = null;
        } else {
            winterFlowManagerCloud = WinterFlowProviderAgent.WinterFlowRouterStructure();
            WinterFlowManagerCloud.WinterFlowHookDataSource(winterFlowManagerCloud, winterFlowQueryJSON);
        }
        this.WinterFlowServiceUtility = winterFlowManagerCloud;
    }

    @Override // com.google.android.datatransport.WinterFlowTestingCloud
    public final WinterFlowVersionParser WinterFlowRouterAdapter() {
        WinterFlowQueryJSON winterFlowQueryJSON = this.WinterFlowThreadListener;
        return new WinterFlowVersionParser(winterFlowQueryJSON.WinterFlowRouterStructure, winterFlowQueryJSON.WinterFlowHookDataSource, winterFlowQueryJSON.WinterFlowCacheManagerAgent, winterFlowQueryJSON.WinterFlowArrayNetwork);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowSessionCompiler) {
            return this.WinterFlowThreadListener.equals(((WinterFlowSessionCompiler) obj).WinterFlowThreadListener);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowThreadListener.hashCode();
    }
}
