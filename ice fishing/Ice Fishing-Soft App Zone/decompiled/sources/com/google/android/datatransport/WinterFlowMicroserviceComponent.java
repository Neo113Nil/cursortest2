package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMicroserviceComponent implements WinterFlowVersionService {
    public final float WinterFlowRouterStructure;

    public WinterFlowMicroserviceComponent(float f) {
        this.WinterFlowRouterStructure = f;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionService
    public final float WinterFlowHookDataSource(float f) {
        return f * this.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionService
    public final float WinterFlowRouterStructure(float f) {
        return f / this.WinterFlowRouterStructure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WinterFlowMicroserviceComponent) && Float.compare(this.WinterFlowRouterStructure, ((WinterFlowMicroserviceComponent) obj).WinterFlowRouterStructure) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(new StringBuilder("LinearFontScaleConverter(fontScale="), this.WinterFlowRouterStructure, ')');
    }
}
