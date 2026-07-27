package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGestureDetectorPhantomForceAurora5134 implements Iterator {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ int FrostHunterFragmentBetaMegaVortex6025;
    public final /* synthetic */ FrostHunterGradientDrawablePrimeUltraNeo5802 FrostHunterKeyframeGammaGamma1197;
    public final /* synthetic */ FrostHunterGradientDrawablePrimeUltraNeo5802 FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterGestureDetectorPhantomForceAurora5134(FrostHunterGradientDrawablePrimeUltraNeo5802 frostHunterGradientDrawablePrimeUltraNeo5802, int i) {
        this.FrostHunterFragmentBetaMegaVortex6025 = i;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterGradientDrawablePrimeUltraNeo5802;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterGradientDrawablePrimeUltraNeo5802;
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterFragmentBetaMegaVortex6025;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterGradientDrawablePrimeUltraNeo5802.isEmpty() ? -1 : 0;
        this.FrostHunterAlertDialogAuroraDelta3200 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.FrostHunterFlowMaxDragonHero5809 >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        FrostHunterGradientDrawablePrimeUltraNeo5802 frostHunterGradientDrawablePrimeUltraNeo5802 = this.FrostHunterKeyframeGammaGamma1197;
        if (frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterFragmentBetaMegaVortex6025 != this.FrostHunterCameraXPixelTurboCosmos9814) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
            return null;
        }
        if (!hasNext()) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return null;
        }
        int i = this.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterAlertDialogAuroraDelta3200 = i;
        int i2 = this.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterGradientDrawablePrimeUltraNeo5802 frostHunterGradientDrawablePrimeUltraNeo58022 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                obj = frostHunterGradientDrawablePrimeUltraNeo58022.FrostHunterFlowMaxDragonHero5809()[i];
                break;
            case 1:
                obj = new FrostHunterViewPager2DragonMaxEclipse7493(frostHunterGradientDrawablePrimeUltraNeo58022, i);
                break;
            default:
                obj = frostHunterGradientDrawablePrimeUltraNeo58022.FrostHunterAlertDialogAuroraDelta3200()[i];
                break;
        }
        int i3 = this.FrostHunterFlowMaxDragonHero5809 + 1;
        if (i3 >= frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            i3 = -1;
        }
        this.FrostHunterFlowMaxDragonHero5809 = i3;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        FrostHunterGradientDrawablePrimeUltraNeo5802 frostHunterGradientDrawablePrimeUltraNeo5802 = this.FrostHunterKeyframeGammaGamma1197;
        if (frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterFragmentBetaMegaVortex6025 != this.FrostHunterCameraXPixelTurboCosmos9814) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
            return;
        }
        FrostHunterCanvasInfernoVortex4700.FrostHunterViewPhantomNeo1634("no calls to next() since the last call to remove()", this.FrostHunterAlertDialogAuroraDelta3200 >= 0);
        this.FrostHunterCameraXPixelTurboCosmos9814 += 32;
        frostHunterGradientDrawablePrimeUltraNeo5802.remove(frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterFlowMaxDragonHero5809()[this.FrostHunterAlertDialogAuroraDelta3200]);
        this.FrostHunterFlowMaxDragonHero5809--;
        this.FrostHunterAlertDialogAuroraDelta3200 = -1;
    }
}
