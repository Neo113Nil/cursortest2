package android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterResourceMegaPixel4571 {
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761 = true;
    public String[] FrostHunterBundlePulseFusionHero2475;
    public String[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public boolean FrostHunterServiceEliteCelestialThunder1757;

    public final FrostHunterNavigationViewFusionVortexTitanium1543 FrostHunterAlphaAnimationNeoCosmos5761() {
        return new FrostHunterNavigationViewFusionVortexTitanium1543(this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterServiceEliteCelestialThunder1757, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475);
    }

    public final void FrostHunterBundlePulseFusionHero2475(FrostHunterFaceDetectionCosmosDelta7141... frostHunterFaceDetectionCosmosDelta7141Arr) {
        boolean z = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (!z) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(frostHunterFaceDetectionCosmosDelta7141Arr.length);
        for (FrostHunterFaceDetectionCosmosDelta7141 frostHunterFaceDetectionCosmosDelta7141 : frostHunterFaceDetectionCosmosDelta7141Arr) {
            arrayList.add(frostHunterFaceDetectionCosmosDelta7141.FrostHunterCameraXPixelTurboCosmos9814);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.FrostHunterBundlePulseFusionHero2475 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("At least one TLS version is required");
        }
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterModelInputOutputInfernoBlaze5651... frostHunterModelInputOutputInfernoBlaze5651Arr) {
        boolean z = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (!z) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(frostHunterModelInputOutputInfernoBlaze5651Arr.length);
        for (FrostHunterModelInputOutputInfernoBlaze5651 frostHunterModelInputOutputInfernoBlaze5651 : frostHunterModelInputOutputInfernoBlaze5651Arr) {
            arrayList.add(frostHunterModelInputOutputInfernoBlaze5651.FrostHunterAlphaAnimationNeoCosmos5761);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("At least one cipher suite is required");
        }
    }
}
