package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWidgetNetwork implements WinterFlowEncryptionIDE {
    public final boolean WinterFlowVariableVersionControl;

    public WinterFlowWidgetNetwork(boolean z) {
        this.WinterFlowVariableVersionControl = z;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionIDE
    public final WinterFlowFrontendAPI WinterFlowArrayNetwork() {
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionIDE
    public final boolean WinterFlowHookDataSource() {
        return this.WinterFlowVariableVersionControl;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.WinterFlowVariableVersionControl ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
