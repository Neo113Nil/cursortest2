package com.google.android.datatransport;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxyLayer {
    public static final WinterFlowProxyLayer WinterFlowHookDataSource = new WinterFlowProxyLayer(new WinterFlowRefactoringRequest((WinterFlowWorkerDeserialization) null, (WinterFlowConfigurationException) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 127));
    public final WinterFlowRefactoringRequest WinterFlowRouterStructure;

    public WinterFlowProxyLayer(WinterFlowRefactoringRequest winterFlowRefactoringRequest) {
        this.WinterFlowRouterStructure = winterFlowRefactoringRequest;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WinterFlowProxyLayer) && ((WinterFlowProxyLayer) obj).WinterFlowRouterStructure.equals(this.WinterFlowRouterStructure);
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }

    public final String toString() {
        if (equals(WinterFlowHookDataSource)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        WinterFlowWorkerDeserialization winterFlowWorkerDeserialization = this.WinterFlowRouterStructure.WinterFlowRouterStructure;
        sb.append(winterFlowWorkerDeserialization != null ? winterFlowWorkerDeserialization.toString() : null);
        sb.append(",\nSlide - null,\nShrink - null,\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
