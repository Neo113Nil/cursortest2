package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceRefactoring {
    public static final WinterFlowServiceRefactoring WinterFlowCacheManagerAgent = new WinterFlowServiceRefactoring(1.0f, 0.0f);
    public final float WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowServiceRefactoring(float f, float f2) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowServiceRefactoring)) {
            return false;
        }
        WinterFlowServiceRefactoring winterFlowServiceRefactoring = (WinterFlowServiceRefactoring) obj;
        return this.WinterFlowRouterStructure == winterFlowServiceRefactoring.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowServiceRefactoring.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowHookDataSource) + (Float.hashCode(this.WinterFlowRouterStructure) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", skewX=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowHookDataSource, ')');
    }
}
