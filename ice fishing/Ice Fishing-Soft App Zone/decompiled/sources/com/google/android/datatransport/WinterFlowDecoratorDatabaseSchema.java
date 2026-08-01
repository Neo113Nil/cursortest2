package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDecoratorDatabaseSchema {
    public final int WinterFlowRouterStructure;

    public static String WinterFlowRouterStructure(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowDecoratorDatabaseSchema) {
            return this.WinterFlowRouterStructure == ((WinterFlowDecoratorDatabaseSchema) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        return WinterFlowRouterStructure(this.WinterFlowRouterStructure);
    }
}
