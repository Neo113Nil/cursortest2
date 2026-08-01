package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRequestScheduler implements Comparable {
    public final float WinterFlowVariableVersionControl;

    public static String WinterFlowCacheManagerAgent(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean WinterFlowHookDataSource(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static int WinterFlowRouterStructure(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return WinterFlowRouterStructure(this.WinterFlowVariableVersionControl, ((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowRequestScheduler) {
            return Float.compare(this.WinterFlowVariableVersionControl, ((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowVariableVersionControl);
    }

    public final String toString() {
        return WinterFlowCacheManagerAgent(this.WinterFlowVariableVersionControl);
    }
}
