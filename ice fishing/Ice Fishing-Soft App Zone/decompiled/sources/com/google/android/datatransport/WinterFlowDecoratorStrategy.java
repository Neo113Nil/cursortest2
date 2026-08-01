package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDecoratorStrategy {
    public final WinterFlowOrchestrationIDE WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowDecoratorStrategy(String str, WinterFlowOrchestrationIDE winterFlowOrchestrationIDE) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = winterFlowOrchestrationIDE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowDecoratorStrategy)) {
            return false;
        }
        WinterFlowDecoratorStrategy winterFlowDecoratorStrategy = (WinterFlowDecoratorStrategy) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowDecoratorStrategy.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowDecoratorStrategy.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        String str = this.WinterFlowRouterStructure;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        WinterFlowOrchestrationIDE winterFlowOrchestrationIDE = this.WinterFlowHookDataSource;
        return hashCode + (winterFlowOrchestrationIDE != null ? winterFlowOrchestrationIDE.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.WinterFlowRouterStructure + ", action=" + this.WinterFlowHookDataSource + ')';
    }
}
