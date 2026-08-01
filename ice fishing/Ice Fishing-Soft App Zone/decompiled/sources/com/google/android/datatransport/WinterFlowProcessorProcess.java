package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProcessorProcess {
    public final int WinterFlowRouterStructure;
    public static final WinterFlowProcessorProcess WinterFlowHookDataSource = new WinterFlowProcessorProcess(0);
    public static final WinterFlowProcessorProcess WinterFlowCacheManagerAgent = new WinterFlowProcessorProcess(1);

    public WinterFlowProcessorProcess(int i) {
        this.WinterFlowRouterStructure = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowProcessorProcess) {
            return this.WinterFlowRouterStructure == ((WinterFlowProcessorProcess) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure;
    }

    public final String toString() {
        int i = this.WinterFlowRouterStructure;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + WinterFlowBackendTool.WinterFlowRouterStructure(arrayList, ", ", null, 62) + ']';
    }
}
