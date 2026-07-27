package android.content.Context;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterManifestThunderCelestialAurora1686 extends FrostHunterTextInputEditTextSolarForce9640 implements FrostHunterFlowCollectorPhoenixUltra3104 {
    public boolean FrostHunterCameraXTurboCelestialHero5430;
    public final Window FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final FrostHunterCountDownTimerLegendOlympian4078 FrostHunterLintTitanVortexQuantum9911;
    public boolean FrostHunterLooperThreadBetaHyperionMax1000;
    public boolean FrostHunterResourcesTitanHyperVision5823;
    public boolean FrostHunterTextViewDragonStormMega4297;

    public FrostHunterManifestThunderCelestialAurora1686(Context context, Window window) {
        super(context);
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = window;
        this.FrostHunterLintTitanVortexQuantum9911 = FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterOnPreDrawListenerSparkPhantomDelta2895.FrostHunterAlphaAnimationNeoCosmos5761);
        int i = FrostHunterAnimationSetSparkPhantomCelestial7545.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterStrictModePhantomQuantumCelestial6608.FrostHunterConstraintSetCloneMasterUltraRogue2633(this, this);
        FrostHunterAnimationSetSparkPhantomCelestial7545.FrostHunterConstraintSetCloneMasterUltraRogue2633(this, new FrostHunterMediaPlayerVortexVortexBlaze2853(this, 1));
    }

    @Override // android.content.Context.FrostHunterTextInputEditTextSolarForce9640
    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068) {
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(1735448596);
        int i2 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(this) ? 4 : 2) | i;
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 3) != 2)) {
            ((FrostHunterFontFamilyNeoBetaEpic8574) this.FrostHunterLintTitanVortexQuantum9911.getValue()).FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, 0);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterMediaPlayerForcePrime6643(this, i, 5);
        }
    }

    @Override // android.content.Context.FrostHunterFlowCollectorPhoenixUltra3104
    public final FrostHunterServiceInfoAuroraHyperNeo5624 FrostHunterBundlePulseFusionHero2475(View view, FrostHunterServiceInfoAuroraHyperNeo5624 frostHunterServiceInfoAuroraHyperNeo5624) {
        if (!this.FrostHunterResourcesTitanHyperVision5823) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return frostHunterServiceInfoAuroraHyperNeo5624.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXTurboCelestialHero5430(max, max2, max3, max4);
            }
        }
        return frostHunterServiceInfoAuroraHyperNeo5624;
    }

    @Override // android.content.Context.FrostHunterTextInputEditTextSolarForce9640
    public final void FrostHunterLevelListDrawableFusionDragonHero2232(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.FrostHunterLevelListDrawableFusionDragonHero2232(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        int i3 = (mode != Integer.MIN_VALUE || this.FrostHunterCameraXTurboCelestialHero5430 || this.FrostHunterResourcesTitanHyperVision5823 || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i3 - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.FrostHunterResourcesTitanHyperVision5823 || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.FrostHunterCameraXTurboCelestialHero5430) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // android.content.Context.FrostHunterTextInputEditTextSolarForce9640
    public final void FrostHunterLifecycleBlazeGammaElite2889(int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // android.content.Context.FrostHunterTextInputEditTextSolarForce9640
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.FrostHunterLooperThreadBetaHyperionMax1000;
    }
}
