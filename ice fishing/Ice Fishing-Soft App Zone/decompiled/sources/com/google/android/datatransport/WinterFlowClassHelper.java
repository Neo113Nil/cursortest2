package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowClassHelper {
    public final int WinterFlowHookDataSource;
    public final List WinterFlowRouterStructure;

    public WinterFlowClassHelper(int i, List list) {
        this.WinterFlowRouterStructure = list;
        this.WinterFlowHookDataSource = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder WinterFlowThreadListener = WinterFlowResolverBackend.WinterFlowThreadListener("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '");
        WinterFlowThreadListener.append(new WinterFlowCacheManagerListener(0, list.size() - 1, 1));
        WinterFlowThreadListener.append("'.");
        throw new IllegalArgumentException(WinterFlowThreadListener.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WinterFlowClassHelper.class != obj.getClass()) {
            return false;
        }
        WinterFlowClassHelper winterFlowClassHelper = (WinterFlowClassHelper) obj;
        return this.WinterFlowHookDataSource == winterFlowClassHelper.WinterFlowHookDataSource && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowClassHelper.WinterFlowRouterStructure);
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode() + (this.WinterFlowHookDataSource * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.WinterFlowHookDataSource + ", mergedHistory=" + this.WinterFlowRouterStructure + ')';
    }

    public WinterFlowClassHelper() {
        this(-1, WinterFlowDataSourceEngine.WinterFlowVariableVersionControl);
    }
}
