package com.google.android.datatransport;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRefactoringRequest {
    public final Map WinterFlowCacheManagerAgent;
    public final boolean WinterFlowHookDataSource;
    public final WinterFlowWorkerDeserialization WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowRefactoringRequest(WinterFlowWorkerDeserialization winterFlowWorkerDeserialization, WinterFlowConfigurationException winterFlowConfigurationException, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : winterFlowWorkerDeserialization, (i & 8) != 0 ? null : winterFlowConfigurationException, (i & 32) == 0, (i & 64) != 0 ? WinterFlowFrontendNode.WinterFlowVariableVersionControl : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowRefactoringRequest)) {
            return false;
        }
        WinterFlowRefactoringRequest winterFlowRefactoringRequest = (WinterFlowRefactoringRequest) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowRefactoringRequest.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(null, null) && this.WinterFlowHookDataSource == winterFlowRefactoringRequest.WinterFlowHookDataSource && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowCacheManagerAgent, winterFlowRefactoringRequest.WinterFlowCacheManagerAgent);
    }

    public final int hashCode() {
        WinterFlowWorkerDeserialization winterFlowWorkerDeserialization = this.WinterFlowRouterStructure;
        return this.WinterFlowCacheManagerAgent.hashCode() + WinterFlowSingletonMapper.WinterFlowRouterStructure((((winterFlowWorkerDeserialization == null ? 0 : winterFlowWorkerDeserialization.hashCode()) * 29791) + 0) * 961, 31, this.WinterFlowHookDataSource);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.WinterFlowRouterStructure + ", slide=null, changeSize=null, scale=" + ((Object) null) + ", veil=null, hold=" + this.WinterFlowHookDataSource + ", effectsMap=" + this.WinterFlowCacheManagerAgent + ')';
    }

    public WinterFlowRefactoringRequest(WinterFlowWorkerDeserialization winterFlowWorkerDeserialization, WinterFlowConfigurationException winterFlowConfigurationException, boolean z, Map map) {
        this.WinterFlowRouterStructure = winterFlowWorkerDeserialization;
        this.WinterFlowHookDataSource = z;
        this.WinterFlowCacheManagerAgent = map;
    }
}
