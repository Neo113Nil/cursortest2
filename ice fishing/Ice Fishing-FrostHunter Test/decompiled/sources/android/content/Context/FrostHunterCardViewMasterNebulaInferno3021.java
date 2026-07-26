package android.content.Context;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCardViewMasterNebulaInferno3021 extends FrostHunterCoroutineThunderPhantomStrike2330 implements FrostHunterCombineLegendMegaPrime5473 {
    public final /* synthetic */ FrostHunterTransformDeltaHyper9616 FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterFlowMaxDragonHero5809;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrostHunterCardViewMasterNebulaInferno3021(FrostHunterTransformDeltaHyper9616 frostHunterTransformDeltaHyper9616, int i) {
        super(1);
        this.FrostHunterFlowMaxDragonHero5809 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterTransformDeltaHyper9616;
    }

    @Override // android.content.Context.FrostHunterCombineLegendMegaPrime5473
    public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        int i = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterTransformDeltaHyper9616 frostHunterTransformDeltaHyper9616 = this.FrostHunterAlertDialogAuroraDelta3200;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterCoroutineScopeNebulaCelestial2839 frostHunterCoroutineScopeNebulaCelestial2839 = (FrostHunterCoroutineScopeNebulaCelestial2839) obj;
                View FrostHunterFlowMaxDragonHero5809 = FrostHunterBannerAdTitanVisionDragon3523.FrostHunterFlowMaxDragonHero5809(frostHunterTransformDeltaHyper9616);
                if (!FrostHunterFlowMaxDragonHero5809.isFocused() && !FrostHunterFlowMaxDragonHero5809.hasFocus()) {
                    if (!FrostHunterBindingAdapterSpeedNeo6677.FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterFlowMaxDragonHero5809, FrostHunterBindingAdapterSpeedNeo6677.FrostHunterFCMDeltaQuantumHero8364(frostHunterCoroutineScopeNebulaCelestial2839.FrostHunterAlphaAnimationNeoCosmos5761), FrostHunterBannerAdTitanVisionDragon3523.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPermissionInfoAlphaDelta6279(frostHunterTransformDeltaHyper9616).getFocusOwner(), FrostHunterVectorDrawableForceMax1351.FrostHunterCardViewSpectraCyber7714(frostHunterTransformDeltaHyper9616), FrostHunterFlowMaxDragonHero5809))) {
                        frostHunterCoroutineScopeNebulaCelestial2839.FrostHunterConstraintSetCloneMasterUltraRogue2633 = true;
                        break;
                    }
                }
                break;
            default:
                FrostHunterCoroutineScopeNebulaCelestial2839 frostHunterCoroutineScopeNebulaCelestial28392 = (FrostHunterCoroutineScopeNebulaCelestial2839) obj;
                View FrostHunterFlowMaxDragonHero58092 = FrostHunterBannerAdTitanVisionDragon3523.FrostHunterFlowMaxDragonHero5809(frostHunterTransformDeltaHyper9616);
                if (FrostHunterFlowMaxDragonHero58092.hasFocus()) {
                    FrostHunterGroupRogueCosmos5144 focusOwner = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPermissionInfoAlphaDelta6279(frostHunterTransformDeltaHyper9616).getFocusOwner();
                    View FrostHunterCardViewSpectraCyber7714 = FrostHunterVectorDrawableForceMax1351.FrostHunterCardViewSpectraCyber7714(frostHunterTransformDeltaHyper9616);
                    if (FrostHunterFlowMaxDragonHero58092 instanceof ViewGroup) {
                        Rect FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterBannerAdTitanVisionDragon3523.FrostHunterCameraXPixelTurboCosmos9814(focusOwner, FrostHunterCardViewSpectraCyber7714, FrostHunterFlowMaxDragonHero58092);
                        Integer FrostHunterFCMDeltaQuantumHero8364 = FrostHunterBindingAdapterSpeedNeo6677.FrostHunterFCMDeltaQuantumHero8364(frostHunterCoroutineScopeNebulaCelestial28392.FrostHunterAlphaAnimationNeoCosmos5761);
                        int intValue = FrostHunterFCMDeltaQuantumHero8364 != null ? FrostHunterFCMDeltaQuantumHero8364.intValue() : 130;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = frostHunterTransformDeltaHyper9616.FrostHunterMotionSceneAuroraMega2271;
                        View findNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) FrostHunterCardViewSpectraCyber7714, view, intValue) : focusFinder.findNextFocusFromRect((ViewGroup) FrostHunterCardViewSpectraCyber7714, FrostHunterCameraXPixelTurboCosmos9814, intValue);
                        if (findNextFocus != null && FrostHunterBannerAdTitanVisionDragon3523.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterFlowMaxDragonHero58092, findNextFocus)) {
                            findNextFocus.requestFocus(intValue, FrostHunterCameraXPixelTurboCosmos9814);
                            frostHunterCoroutineScopeNebulaCelestial28392.FrostHunterConstraintSetCloneMasterUltraRogue2633 = true;
                            break;
                        } else if (!FrostHunterCardViewSpectraCyber7714.requestFocus()) {
                            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("host view did not take focus");
                        }
                    } else if (!FrostHunterCardViewSpectraCyber7714.requestFocus()) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("host view did not take focus");
                    }
                    break;
                }
                break;
        }
        return frostHunterLinearLayoutSolarHero7990;
    }
}
