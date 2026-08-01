package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponseServiceProvider {
    public final Integer WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowResponseServiceProvider(int i, Integer num) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowResponseServiceProvider)) {
            return false;
        }
        WinterFlowResponseServiceProvider winterFlowResponseServiceProvider = (WinterFlowResponseServiceProvider) obj;
        return this.WinterFlowRouterStructure == winterFlowResponseServiceProvider.WinterFlowRouterStructure && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowResponseServiceProvider.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.WinterFlowRouterStructure) * 31;
        Integer num = this.WinterFlowHookDataSource;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.WinterFlowRouterStructure + ", dataOffset=" + this.WinterFlowHookDataSource + ')';
    }
}
