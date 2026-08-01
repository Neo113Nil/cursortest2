package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProviderProcess implements WinterFlowVersionService {
    public final float[] WinterFlowHookDataSource;
    public final float[] WinterFlowRouterStructure;

    public WinterFlowProviderProcess(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Array lengths must match and be nonzero");
            throw null;
        }
        this.WinterFlowRouterStructure = fArr;
        this.WinterFlowHookDataSource = fArr2;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionService
    public final float WinterFlowHookDataSource(float f) {
        return WinterFlowInvokerComponent.WinterFlowCompilerHandler(f, this.WinterFlowRouterStructure, this.WinterFlowHookDataSource);
    }

    @Override // com.google.android.datatransport.WinterFlowVersionService
    public final float WinterFlowRouterStructure(float f) {
        return WinterFlowInvokerComponent.WinterFlowCompilerHandler(f, this.WinterFlowHookDataSource, this.WinterFlowRouterStructure);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WinterFlowProviderProcess)) {
            return false;
        }
        WinterFlowProviderProcess winterFlowProviderProcess = (WinterFlowProviderProcess) obj;
        return Arrays.equals(this.WinterFlowRouterStructure, winterFlowProviderProcess.WinterFlowRouterStructure) && Arrays.equals(this.WinterFlowHookDataSource, winterFlowProviderProcess.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.WinterFlowHookDataSource) + (Arrays.hashCode(this.WinterFlowRouterStructure) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.WinterFlowRouterStructure);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.WinterFlowHookDataSource);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
