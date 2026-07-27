package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSharedElementEliteMaster1810 implements Iterator, FrostHunterContextBlazePrimeMax4967 {
    public boolean FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ Object FrostHunterFragmentBetaMegaVortex6025;
    public final /* synthetic */ int FrostHunterKeyframeGammaGamma1197;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrostHunterSharedElementEliteMaster1810(FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544, int i) {
        this(frostHunterViewPager2SpectraForceVortex4544.FrostHunterAlertDialogAuroraDelta3200);
        this.FrostHunterKeyframeGammaGamma1197 = i;
        switch (i) {
            case 1:
                this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterViewPager2SpectraForceVortex4544;
                this(frostHunterViewPager2SpectraForceVortex4544.FrostHunterAlertDialogAuroraDelta3200);
                break;
            default:
                this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterViewPager2SpectraForceVortex4544;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.FrostHunterFlowMaxDragonHero5809 < this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object FrostHunterLifecycleBlazeGammaElite2889;
        if (!hasNext()) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return null;
        }
        int i = this.FrostHunterFlowMaxDragonHero5809;
        int i2 = this.FrostHunterKeyframeGammaGamma1197;
        Object obj = this.FrostHunterFragmentBetaMegaVortex6025;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterLifecycleBlazeGammaElite2889 = ((FrostHunterViewPager2SpectraForceVortex4544) obj).FrostHunterLifecycleBlazeGammaElite2889(i);
                break;
            case 1:
                FrostHunterLifecycleBlazeGammaElite2889 = ((FrostHunterViewPager2SpectraForceVortex4544) obj).FrostHunterCameraXPixelTurboCosmos9814(i);
                break;
            default:
                FrostHunterLifecycleBlazeGammaElite2889 = ((FrostHunterEditTextPhoenixMaster1089) obj).FrostHunterFlowMaxDragonHero5809[i];
                break;
        }
        this.FrostHunterFlowMaxDragonHero5809++;
        this.FrostHunterAlertDialogAuroraDelta3200 = true;
        return FrostHunterLifecycleBlazeGammaElite2889;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.FrostHunterAlertDialogAuroraDelta3200) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Call next() before removing an element.");
            return;
        }
        int i = this.FrostHunterFlowMaxDragonHero5809 - 1;
        this.FrostHunterFlowMaxDragonHero5809 = i;
        int i2 = this.FrostHunterKeyframeGammaGamma1197;
        Object obj = this.FrostHunterFragmentBetaMegaVortex6025;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((FrostHunterViewPager2SpectraForceVortex4544) obj).FrostHunterLevelListDrawableFusionDragonHero2232(i);
                break;
            case 1:
                ((FrostHunterViewPager2SpectraForceVortex4544) obj).FrostHunterLevelListDrawableFusionDragonHero2232(i);
                break;
            default:
                ((FrostHunterEditTextPhoenixMaster1089) obj).FrostHunterAlphaAnimationNeoCosmos5761(i);
                break;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814--;
        this.FrostHunterAlertDialogAuroraDelta3200 = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrostHunterSharedElementEliteMaster1810(FrostHunterEditTextPhoenixMaster1089 frostHunterEditTextPhoenixMaster1089) {
        this(frostHunterEditTextPhoenixMaster1089.FrostHunterAlertDialogAuroraDelta3200);
        this.FrostHunterKeyframeGammaGamma1197 = 2;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterEditTextPhoenixMaster1089;
    }

    public FrostHunterSharedElementEliteMaster1810(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }
}
