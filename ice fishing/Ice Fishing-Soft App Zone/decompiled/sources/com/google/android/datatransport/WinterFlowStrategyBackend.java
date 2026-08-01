package com.google.android.datatransport;

import com.icewinter.flow.winter.icecatch.R;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStrategyBackend {
    public final WinterFlowAlgorithmIDE WinterFlowHookDataSource;
    public final WinterFlowObjectHook WinterFlowRouterStructure;

    public WinterFlowStrategyBackend(WinterFlowObjectHook winterFlowObjectHook, WinterFlowAlgorithmIDE winterFlowAlgorithmIDE) {
        this.WinterFlowRouterStructure = winterFlowObjectHook;
        this.WinterFlowHookDataSource = winterFlowAlgorithmIDE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowStrategyBackend)) {
            return false;
        }
        WinterFlowStrategyBackend winterFlowStrategyBackend = (WinterFlowStrategyBackend) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowStrategyBackend.WinterFlowRouterStructure) && this.WinterFlowHookDataSource.equals(winterFlowStrategyBackend.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.WinterFlowRouterStructure.hashCode() + WinterFlowResolverBackend.WinterFlowArrayNetwork(0, WinterFlowResolverBackend.WinterFlowArrayNetwork(0, ((R.font.winter_app_font * 31) + this.WinterFlowRouterStructure.WinterFlowVariableVersionControl) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder WinterFlowThreadListener = WinterFlowResolverBackend.WinterFlowThreadListener("ResourceFont(resId=", R.font.winter_app_font, ", weight=");
        WinterFlowThreadListener.append(this.WinterFlowRouterStructure);
        WinterFlowThreadListener.append(", style=");
        WinterFlowThreadListener.append((Object) "Normal");
        WinterFlowThreadListener.append(", loadingStrategy=Blocking)");
        return WinterFlowThreadListener.toString();
    }
}
