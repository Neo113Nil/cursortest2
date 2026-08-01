package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStackPlatform implements WinterFlowConcurrencyLayer {
    public final WinterFlowConcurrencyLayer WinterFlowVariableVersionControl;

    public WinterFlowStackPlatform(WinterFlowConcurrencyLayer winterFlowConcurrencyLayer) {
        this.WinterFlowVariableVersionControl = winterFlowConcurrencyLayer;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final boolean WinterFlowBackendCacheManager() {
        return this.WinterFlowVariableVersionControl.WinterFlowBackendCacheManager();
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final void WinterFlowCacheManagerAgent() {
        this.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent();
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final boolean WinterFlowConcurrencyThread() {
        return this.WinterFlowVariableVersionControl.WinterFlowConcurrencyThread();
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final void WinterFlowRouterStructure(int i, long j) {
        this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(i, j);
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final void WinterFlowSyntax(String str) {
        str.getClass();
        this.WinterFlowVariableVersionControl.WinterFlowSyntax(str);
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final String WinterFlowVariableVersionControl(int i) {
        return this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl(i);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        WinterFlowConcurrencyLayer winterFlowConcurrencyLayer = this.WinterFlowVariableVersionControl;
        winterFlowConcurrencyLayer.reset();
        winterFlowConcurrencyLayer.WinterFlowCacheManagerAgent();
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final int getColumnCount() {
        return this.WinterFlowVariableVersionControl.getColumnCount();
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final String getColumnName(int i) {
        return this.WinterFlowVariableVersionControl.getColumnName(i);
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final long getLong(int i) {
        return this.WinterFlowVariableVersionControl.getLong(i);
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final boolean isNull(int i) {
        return this.WinterFlowVariableVersionControl.isNull(i);
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final void reset() {
        this.WinterFlowVariableVersionControl.reset();
    }
}
