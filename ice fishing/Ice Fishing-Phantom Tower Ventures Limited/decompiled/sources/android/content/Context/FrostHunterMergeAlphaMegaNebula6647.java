package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMergeAlphaMegaNebula6647 implements Iterator, FrostHunterContextBlazePrimeMax4967 {
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;
    public final Object FrostHunterKeyframeGammaGamma1197;

    public FrostHunterMergeAlphaMegaNebula6647(FrostHunterNotificationManagerThunderSpectra3606 frostHunterNotificationManagerThunderSpectra3606) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 1;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterNotificationManagerThunderSpectra3606;
        this.FrostHunterFlowMaxDragonHero5809 = -1;
        this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterLooperThreadStormCyberElite6638.FrostHunterAlertDialogAuroraDelta3200(new FrostHunterBarrierAuroraStorm3613(frostHunterNotificationManagerThunderSpectra3606, this, null));
    }

    public void FrostHunterAlphaAnimationNeoCosmos5761() {
        Object FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterThemeOverlayNovaXMaster6614 frostHunterThemeOverlayNovaXMaster6614 = (FrostHunterThemeOverlayNovaXMaster6614) this.FrostHunterKeyframeGammaGamma1197;
        if (i == -2) {
            FrostHunterAlphaAnimationNeoCosmos5761 = ((FrostHunterNotificationGammaBlazePhoenix7595) frostHunterThemeOverlayNovaXMaster6614.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterConstraintSetCloneMasterUltraRogue2633();
        } else {
            FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473 = (FrostHunterCombineLegendMegaPrime5473) frostHunterThemeOverlayNovaXMaster6614.FrostHunterBundlePulseFusionHero2475;
            Object obj = this.FrostHunterAlertDialogAuroraDelta3200;
            obj.getClass();
            FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterCombineLegendMegaPrime5473.FrostHunterAlphaAnimationNeoCosmos5761(obj);
        }
        this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterAlphaAnimationNeoCosmos5761 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.FrostHunterFlowMaxDragonHero5809 < 0) {
                    FrostHunterAlphaAnimationNeoCosmos5761();
                }
                return this.FrostHunterFlowMaxDragonHero5809 == 1;
            case 1:
                return ((FrostHunterMotionScenePixelMega1338) this.FrostHunterAlertDialogAuroraDelta3200).hasNext();
            default:
                return this.FrostHunterFlowMaxDragonHero5809 < ((Map) this.FrostHunterKeyframeGammaGamma1197).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.FrostHunterFlowMaxDragonHero5809 < 0) {
                    FrostHunterAlphaAnimationNeoCosmos5761();
                }
                if (this.FrostHunterFlowMaxDragonHero5809 == 0) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
                    return null;
                }
                Object obj2 = this.FrostHunterAlertDialogAuroraDelta3200;
                obj2.getClass();
                this.FrostHunterFlowMaxDragonHero5809 = -1;
                return obj2;
            case 1:
                return ((FrostHunterMotionScenePixelMega1338) this.FrostHunterAlertDialogAuroraDelta3200).next();
            default:
                if (hasNext()) {
                    obj = this.FrostHunterAlertDialogAuroraDelta3200;
                    this.FrostHunterFlowMaxDragonHero5809++;
                    Object obj3 = ((Map) this.FrostHunterKeyframeGammaGamma1197).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.FrostHunterAlertDialogAuroraDelta3200 = ((FrostHunterDrawableOmegaAlpha9484) obj3).FrostHunterConstraintSetCloneMasterUltraRogue2633;
                } else {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.FrostHunterFlowMaxDragonHero5809;
                if (i != -1) {
                    ((FrostHunterNotificationManagerThunderSpectra3606) this.FrostHunterKeyframeGammaGamma1197).FrostHunterFlowMaxDragonHero5809.FrostHunterFragmentBetaMegaVortex6025(i);
                    this.FrostHunterFlowMaxDragonHero5809 = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public FrostHunterMergeAlphaMegaNebula6647(FrostHunterThemeOverlayNovaXMaster6614 frostHunterThemeOverlayNovaXMaster6614) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 0;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterThemeOverlayNovaXMaster6614;
        this.FrostHunterFlowMaxDragonHero5809 = -2;
    }

    public FrostHunterMergeAlphaMegaNebula6647(Object obj, Map map) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 2;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj;
        this.FrostHunterKeyframeGammaGamma1197 = map;
    }
}
