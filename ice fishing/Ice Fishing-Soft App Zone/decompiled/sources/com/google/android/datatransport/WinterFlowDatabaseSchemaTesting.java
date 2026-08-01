package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseSchemaTesting implements WinterFlowBackendModule {
    public final int WinterFlowVariableVersionControl;

    public WinterFlowDatabaseSchemaTesting(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WinterFlowDatabaseSchemaTesting) && this.WinterFlowVariableVersionControl == ((WinterFlowDatabaseSchemaTesting) obj).WinterFlowVariableVersionControl;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowVariableVersionControl);
    }

    public final String toString() {
        return WinterFlowResolverBackend.WinterFlowServerProtocol(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.WinterFlowVariableVersionControl, ')');
    }
}
