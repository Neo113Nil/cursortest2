package android.content.Context;

import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterZoomStateThunderAlpha6999 extends FrostHunterLocationListenerEpicShadowOlympian6477 implements Iterator {
    public final /* synthetic */ FrostHunterDisplayMetricsPhoenixFusionPhantom6054 FrostHunterAlertDialogAuroraDelta3200;
    public FrostHunterViewModelScopeMasterAlphaNovaX8234 FrostHunterCameraXPixelTurboCosmos9814;
    public boolean FrostHunterFlowMaxDragonHero5809 = true;

    public FrostHunterZoomStateThunderAlpha6999(FrostHunterDisplayMetricsPhoenixFusionPhantom6054 frostHunterDisplayMetricsPhoenixFusionPhantom6054) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterDisplayMetricsPhoenixFusionPhantom6054;
    }

    @Override // android.content.Context.FrostHunterLocationListenerEpicShadowOlympian6477
    public final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX8234) {
        FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX82342 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterViewModelScopeMasterAlphaNovaX8234 == frostHunterViewModelScopeMasterAlphaNovaX82342) {
            FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX82343 = frostHunterViewModelScopeMasterAlphaNovaX82342.FrostHunterKeyframeGammaGamma1197;
            this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterViewModelScopeMasterAlphaNovaX82343;
            this.FrostHunterFlowMaxDragonHero5809 = frostHunterViewModelScopeMasterAlphaNovaX82343 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.FrostHunterFlowMaxDragonHero5809) {
            return this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterCameraXPixelTurboCosmos9814 != null;
        }
        FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX8234 = this.FrostHunterCameraXPixelTurboCosmos9814;
        return (frostHunterViewModelScopeMasterAlphaNovaX8234 == null || frostHunterViewModelScopeMasterAlphaNovaX8234.FrostHunterAlertDialogAuroraDelta3200 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.FrostHunterFlowMaxDragonHero5809) {
            this.FrostHunterFlowMaxDragonHero5809 = false;
            this.FrostHunterCameraXPixelTurboCosmos9814 = this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterCameraXPixelTurboCosmos9814;
        } else {
            FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX8234 = this.FrostHunterCameraXPixelTurboCosmos9814;
            this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterViewModelScopeMasterAlphaNovaX8234 != null ? frostHunterViewModelScopeMasterAlphaNovaX8234.FrostHunterAlertDialogAuroraDelta3200 : null;
        }
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }
}
