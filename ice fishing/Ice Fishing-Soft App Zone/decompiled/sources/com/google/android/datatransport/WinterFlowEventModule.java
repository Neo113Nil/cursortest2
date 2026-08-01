package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEventModule extends WinterFlowSessionScheduler {
    public final WinterFlowObjectEntity WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowEventModule(String str, WinterFlowObjectEntity winterFlowObjectEntity) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = winterFlowObjectEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowEventModule)) {
            return false;
        }
        WinterFlowEventModule winterFlowEventModule = (WinterFlowEventModule) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowEventModule.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowEventModule.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        int hashCode = this.WinterFlowRouterStructure.hashCode() * 31;
        WinterFlowObjectEntity winterFlowObjectEntity = this.WinterFlowHookDataSource;
        return (hashCode + (winterFlowObjectEntity != null ? winterFlowObjectEntity.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.WinterFlowRouterStructure + ')';
    }
}
