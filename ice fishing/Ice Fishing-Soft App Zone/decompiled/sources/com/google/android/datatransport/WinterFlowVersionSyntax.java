package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionSyntax {
    public final Object WinterFlowHookDataSource;
    public final Integer WinterFlowRouterStructure;

    public WinterFlowVersionSyntax(Integer num, Object obj) {
        this.WinterFlowRouterStructure = num;
        this.WinterFlowHookDataSource = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowVersionSyntax)) {
            return false;
        }
        WinterFlowVersionSyntax winterFlowVersionSyntax = (WinterFlowVersionSyntax) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowVersionSyntax.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowVersionSyntax.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        int hashCode = this.WinterFlowRouterStructure.hashCode() * 31;
        Object obj = this.WinterFlowHookDataSource;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.WinterFlowRouterStructure + ", right=" + this.WinterFlowHookDataSource + ')';
    }
}
