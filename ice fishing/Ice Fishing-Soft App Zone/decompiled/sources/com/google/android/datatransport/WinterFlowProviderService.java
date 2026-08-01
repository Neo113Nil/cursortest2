package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProviderService {
    public final Integer WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowProviderService(int i, WinterFlowConfigurationException winterFlowConfigurationException, Integer num) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowProviderService)) {
            return false;
        }
        WinterFlowProviderService winterFlowProviderService = (WinterFlowProviderService) obj;
        return this.WinterFlowRouterStructure == winterFlowProviderService.WinterFlowRouterStructure && WinterFlowManagerRequest.WinterFlowThreadListener(null, null) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowProviderService.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        int hashCode = ((Integer.hashCode(this.WinterFlowRouterStructure) * 31) + 0) * 31;
        Integer num = this.WinterFlowHookDataSource;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.WinterFlowRouterStructure + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.WinterFlowHookDataSource + ')';
    }
}
