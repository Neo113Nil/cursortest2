package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEncryptionArray implements WinterFlowBatchCacheManager {
    public final boolean WinterFlowVariableVersionControl;

    public WinterFlowEncryptionArray(boolean z) {
        this.WinterFlowVariableVersionControl = z;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchCacheManager
    public final Object getValue() {
        return Boolean.valueOf(this.WinterFlowVariableVersionControl);
    }
}
