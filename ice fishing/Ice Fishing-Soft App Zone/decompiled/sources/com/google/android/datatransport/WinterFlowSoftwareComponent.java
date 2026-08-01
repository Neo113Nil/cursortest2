package com.google.android.datatransport;

import android.os.Build;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSoftwareComponent {
    public final DisplayCutout WinterFlowRouterStructure;

    public WinterFlowSoftwareComponent(DisplayCutout displayCutout) {
        this.WinterFlowRouterStructure = displayCutout;
    }

    public final WinterFlowVariableDataSource WinterFlowRouterStructure() {
        return Build.VERSION.SDK_INT >= 30 ? WinterFlowVariableDataSource.WinterFlowCacheManagerAgent(WinterFlowDebugPlatform.WinterFlowVariableVersionControl(this.WinterFlowRouterStructure)) : WinterFlowVariableDataSource.WinterFlowVariableVersionControl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WinterFlowSoftwareComponent.class != obj.getClass()) {
            return false;
        }
        return this.WinterFlowRouterStructure.equals(((WinterFlowSoftwareComponent) obj).WinterFlowRouterStructure);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.WinterFlowRouterStructure.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.WinterFlowRouterStructure + "}";
    }
}
