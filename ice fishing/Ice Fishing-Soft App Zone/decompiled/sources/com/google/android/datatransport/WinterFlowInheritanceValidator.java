package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInheritanceValidator {
    public final long WinterFlowRouterStructure;

    public static final boolean WinterFlowRouterStructure(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowInheritanceValidator) {
            return this.WinterFlowRouterStructure == ((WinterFlowInheritanceValidator) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        long j = this.WinterFlowRouterStructure;
        return WinterFlowRouterStructure(j, 0L) ? "Unspecified" : WinterFlowRouterStructure(j, 4294967296L) ? "Sp" : WinterFlowRouterStructure(j, 8589934592L) ? "Em" : "Invalid";
    }
}
