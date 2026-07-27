package android.content.Context;

import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTextInputLayoutMasterNova2690 extends FrostHunterTextInputEditTextSolarForce9640 {
    public final FrostHunterCountDownTimerLegendOlympian4078 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public boolean FrostHunterLintTitanVortexQuantum9911;

    public FrostHunterTextInputLayoutMasterNova2690(ComponentActivity componentActivity) {
        super(componentActivity);
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterCameraXPixelTurboCosmos9814(null);
    }

    @Override // android.content.Context.FrostHunterTextInputEditTextSolarForce9640
    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068) {
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(420213850);
        int i2 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(this) ? 4 : 2) | i;
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 3) != 2)) {
            FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574 = (FrostHunterFontFamilyNeoBetaEpic8574) this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.getValue();
            if (frostHunterFontFamilyNeoBetaEpic8574 == null) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(-1238798753);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(98586082);
                frostHunterFontFamilyNeoBetaEpic8574.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, 0);
            }
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterMediaPlayerForcePrime6643(this, i, 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return FrostHunterTextInputLayoutMasterNova2690.class.getName();
    }

    @Override // android.content.Context.FrostHunterTextInputEditTextSolarForce9640
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.FrostHunterLintTitanVortexQuantum9911;
    }

    public final void setContent(FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574) {
        this.FrostHunterLintTitanVortexQuantum9911 = true;
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.setValue(frostHunterFontFamilyNeoBetaEpic8574);
        if (isAttachedToWindow()) {
            if (this.FrostHunterKeyframeGammaGamma1197 != null || isAttachedToWindow()) {
                FrostHunterServiceEliteCelestialThunder1757();
            } else {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
