package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectTool extends WinterFlowSessionScheduler {
    public final WinterFlowObjectEntity WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowObjectTool(String str, WinterFlowObjectEntity winterFlowObjectEntity) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = winterFlowObjectEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowObjectTool)) {
            return false;
        }
        WinterFlowObjectTool winterFlowObjectTool = (WinterFlowObjectTool) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowObjectTool.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowObjectTool.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        int hashCode = this.WinterFlowRouterStructure.hashCode() * 31;
        WinterFlowObjectEntity winterFlowObjectEntity = this.WinterFlowHookDataSource;
        return (hashCode + (winterFlowObjectEntity != null ? winterFlowObjectEntity.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.WinterFlowRouterStructure + ')';
    }
}
