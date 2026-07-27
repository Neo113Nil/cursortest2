package android.content.Context;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGeocoderNovaXNeoDelta7802 extends FrostHunterAnimationSetHyperionAurora2108 implements RandomAccess {
    public final int FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterAnimationSetHyperionAurora2108 FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterGeocoderNovaXNeoDelta7802(FrostHunterAnimationSetHyperionAurora2108 frostHunterAnimationSetHyperionAurora2108, int i, int i2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterAnimationSetHyperionAurora2108;
        this.FrostHunterFlowMaxDragonHero5809 = i;
        FrostHunterCanvasInfernoVortex4700.FrostHunterCardViewSpectraCyber7714(i, i2, frostHunterAnimationSetHyperionAurora2108.FrostHunterAlphaAnimationNeoCosmos5761());
        this.FrostHunterAlertDialogAuroraDelta3200 = i2 - i;
    }

    @Override // android.content.Context.FrostHunterHandlerThreadNovaXStorm1704
    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i < 0 || i >= i2) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.FrostHunterCameraXPixelTurboCosmos9814.get(this.FrostHunterFlowMaxDragonHero5809 + i);
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.List
    public final List subList(int i, int i2) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterCardViewSpectraCyber7714(i, i2, this.FrostHunterAlertDialogAuroraDelta3200);
        int i3 = this.FrostHunterFlowMaxDragonHero5809;
        return new FrostHunterGeocoderNovaXNeoDelta7802(this.FrostHunterCameraXPixelTurboCosmos9814, i + i3, i3 + i2);
    }
}
