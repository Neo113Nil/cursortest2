package android.content.Context;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterContentObserverPrimeBlazeSpectra7811 implements Iterator {
    public Iterator FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterCameraXPixelTurboCosmos9814 = -1;
    public boolean FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ FrostHunterLifecycleCameraControllerGammaFusionShadow8317 FrostHunterKeyframeGammaGamma1197;

    public FrostHunterContentObserverPrimeBlazeSpectra7811(FrostHunterLifecycleCameraControllerGammaFusionShadow8317 frostHunterLifecycleCameraControllerGammaFusionShadow8317) {
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterLifecycleCameraControllerGammaFusionShadow8317;
    }

    public final Iterator FrostHunterAlphaAnimationNeoCosmos5761() {
        if (this.FrostHunterAlertDialogAuroraDelta3200 == null) {
            this.FrostHunterAlertDialogAuroraDelta3200 = this.FrostHunterKeyframeGammaGamma1197.FrostHunterFlowMaxDragonHero5809.entrySet().iterator();
        }
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814 + 1;
        FrostHunterLifecycleCameraControllerGammaFusionShadow8317 frostHunterLifecycleCameraControllerGammaFusionShadow8317 = this.FrostHunterKeyframeGammaGamma1197;
        return i < frostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterCameraXPixelTurboCosmos9814.size() || (!frostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterFlowMaxDragonHero5809.isEmpty() && FrostHunterAlphaAnimationNeoCosmos5761().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.FrostHunterFlowMaxDragonHero5809 = true;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814 + 1;
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        FrostHunterLifecycleCameraControllerGammaFusionShadow8317 frostHunterLifecycleCameraControllerGammaFusionShadow8317 = this.FrostHunterKeyframeGammaGamma1197;
        return i < frostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterCameraXPixelTurboCosmos9814.size() ? (Map.Entry) frostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterCameraXPixelTurboCosmos9814.get(this.FrostHunterCameraXPixelTurboCosmos9814) : (Map.Entry) FrostHunterAlphaAnimationNeoCosmos5761().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.FrostHunterFlowMaxDragonHero5809) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("remove() was called before next()");
            return;
        }
        this.FrostHunterFlowMaxDragonHero5809 = false;
        int i = FrostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        FrostHunterLifecycleCameraControllerGammaFusionShadow8317 frostHunterLifecycleCameraControllerGammaFusionShadow8317 = this.FrostHunterKeyframeGammaGamma1197;
        frostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        if (this.FrostHunterCameraXPixelTurboCosmos9814 >= frostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterCameraXPixelTurboCosmos9814.size()) {
            FrostHunterAlphaAnimationNeoCosmos5761().remove();
            return;
        }
        int i2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        this.FrostHunterCameraXPixelTurboCosmos9814 = i2 - 1;
        frostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterCameraXPixelTurboCosmos9814(i2);
    }
}
