package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrontendCache {
    public final String WinterFlowRouterStructure;

    public WinterFlowFrontendCache(String str) {
        if (str != null) {
            this.WinterFlowRouterStructure = str;
        } else {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowFrontendCache)) {
            return false;
        }
        return this.WinterFlowRouterStructure.equals(((WinterFlowFrontendCache) obj).WinterFlowRouterStructure);
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Encoding{name=\"" + this.WinterFlowRouterStructure + "\"}";
    }
}
