package com.google.android.datatransport;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInvokerOrchestration {
    public final WinterFlowRefactoringRequest WinterFlowRouterStructure;
    public static final WinterFlowInvokerOrchestration WinterFlowHookDataSource = new WinterFlowInvokerOrchestration(new WinterFlowRefactoringRequest((WinterFlowWorkerDeserialization) null, (WinterFlowConfigurationException) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 127));
    public static final WinterFlowInvokerOrchestration WinterFlowCacheManagerAgent = new WinterFlowInvokerOrchestration(new WinterFlowRefactoringRequest((WinterFlowWorkerDeserialization) (0 == true ? 1 : 0), (WinterFlowConfigurationException) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 95));

    public WinterFlowInvokerOrchestration(WinterFlowRefactoringRequest winterFlowRefactoringRequest) {
        this.WinterFlowRouterStructure = winterFlowRefactoringRequest;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WinterFlowInvokerOrchestration) && ((WinterFlowInvokerOrchestration) obj).WinterFlowRouterStructure.equals(this.WinterFlowRouterStructure);
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }

    public final String toString() {
        if (equals(WinterFlowHookDataSource)) {
            return "ExitTransition.None";
        }
        if (equals(WinterFlowCacheManagerAgent)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        WinterFlowRefactoringRequest winterFlowRefactoringRequest = this.WinterFlowRouterStructure;
        WinterFlowWorkerDeserialization winterFlowWorkerDeserialization = winterFlowRefactoringRequest.WinterFlowRouterStructure;
        sb.append(winterFlowWorkerDeserialization != null ? winterFlowWorkerDeserialization.toString() : null);
        sb.append(",\nSlide - null,\nShrink - null,\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(winterFlowRefactoringRequest.WinterFlowHookDataSource);
        return sb.toString();
    }
}
