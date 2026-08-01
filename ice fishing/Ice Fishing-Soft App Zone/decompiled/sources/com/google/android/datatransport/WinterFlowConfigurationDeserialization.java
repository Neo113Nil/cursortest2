package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConfigurationDeserialization {
    public final String WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowConfigurationDeserialization(String str, String str2) {
        this.WinterFlowRouterStructure = str;
        if (str2 != null) {
            this.WinterFlowHookDataSource = str2;
        } else {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowConfigurationDeserialization)) {
            return false;
        }
        WinterFlowConfigurationDeserialization winterFlowConfigurationDeserialization = (WinterFlowConfigurationDeserialization) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowConfigurationDeserialization.WinterFlowRouterStructure) && this.WinterFlowHookDataSource.equals(winterFlowConfigurationDeserialization.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.hashCode() ^ ((this.WinterFlowRouterStructure.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.WinterFlowRouterStructure + ", version=" + this.WinterFlowHookDataSource + "}";
    }
}
