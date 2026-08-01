package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectBackend {
    public final int WinterFlowHookDataSource;
    public final boolean WinterFlowRouterStructure;

    public WinterFlowObjectBackend() {
        this.WinterFlowRouterStructure = false;
        this.WinterFlowHookDataSource = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowObjectBackend)) {
            return false;
        }
        WinterFlowObjectBackend winterFlowObjectBackend = (WinterFlowObjectBackend) obj;
        return this.WinterFlowRouterStructure == winterFlowObjectBackend.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowObjectBackend.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowHookDataSource) + (Boolean.hashCode(this.WinterFlowRouterStructure) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.WinterFlowRouterStructure + ", emojiSupportMatch=" + ((Object) WinterFlowProcessorProcessor.WinterFlowRouterStructure(this.WinterFlowHookDataSource)) + ')';
    }

    public WinterFlowObjectBackend(int i, boolean z) {
        this.WinterFlowRouterStructure = z;
        this.WinterFlowHookDataSource = i;
    }
}
