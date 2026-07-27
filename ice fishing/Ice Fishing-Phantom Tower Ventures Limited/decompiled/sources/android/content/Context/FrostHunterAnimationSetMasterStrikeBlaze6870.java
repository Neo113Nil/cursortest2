package android.content.Context;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnimationSetMasterStrikeBlaze6870 extends View {
    public Long FrostHunterAlertDialogAuroraDelta3200;
    public FrostHunterDataBindingAlphaLegendElite3927 FrostHunterCameraXPixelTurboCosmos9814;
    public Boolean FrostHunterFlowMaxDragonHero5809;
    public FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterFragmentBetaMegaVortex6025;
    public FrostHunterFilterAlphaSparkSpeed9857 FrostHunterKeyframeGammaGamma1197;
    public static final int[] FrostHunterServiceConnectionTurboPhoenixOmega6719 = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] FrostHunterLightSensorForceFusion4241 = new int[0];

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.FrostHunterKeyframeGammaGamma1197;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.FrostHunterAlertDialogAuroraDelta3200;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? FrostHunterServiceConnectionTurboPhoenixOmega6719 : FrostHunterLightSensorForceFusion4241;
            FrostHunterDataBindingAlphaLegendElite3927 frostHunterDataBindingAlphaLegendElite3927 = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (frostHunterDataBindingAlphaLegendElite3927 != null) {
                frostHunterDataBindingAlphaLegendElite3927.setState(iArr);
            }
        } else {
            FrostHunterFilterAlphaSparkSpeed9857 frostHunterFilterAlphaSparkSpeed9857 = new FrostHunterFilterAlphaSparkSpeed9857(23, this);
            this.FrostHunterKeyframeGammaGamma1197 = frostHunterFilterAlphaSparkSpeed9857;
            postDelayed(frostHunterFilterAlphaSparkSpeed9857, 50L);
        }
        this.FrostHunterAlertDialogAuroraDelta3200 = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(FrostHunterAnimationSetMasterStrikeBlaze6870 frostHunterAnimationSetMasterStrikeBlaze6870) {
        FrostHunterDataBindingAlphaLegendElite3927 frostHunterDataBindingAlphaLegendElite3927 = frostHunterAnimationSetMasterStrikeBlaze6870.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterDataBindingAlphaLegendElite3927 != null) {
            frostHunterDataBindingAlphaLegendElite3927.setState(FrostHunterLightSensorForceFusion4241);
        }
        frostHunterAnimationSetMasterStrikeBlaze6870.FrostHunterKeyframeGammaGamma1197 = null;
    }

    public final void FrostHunterBundlePulseFusionHero2475() {
        this.FrostHunterFragmentBetaMegaVortex6025 = null;
        FrostHunterFilterAlphaSparkSpeed9857 frostHunterFilterAlphaSparkSpeed9857 = this.FrostHunterKeyframeGammaGamma1197;
        if (frostHunterFilterAlphaSparkSpeed9857 != null) {
            removeCallbacks(frostHunterFilterAlphaSparkSpeed9857);
            FrostHunterFilterAlphaSparkSpeed9857 frostHunterFilterAlphaSparkSpeed98572 = this.FrostHunterKeyframeGammaGamma1197;
            frostHunterFilterAlphaSparkSpeed98572.getClass();
            frostHunterFilterAlphaSparkSpeed98572.run();
        } else {
            FrostHunterDataBindingAlphaLegendElite3927 frostHunterDataBindingAlphaLegendElite3927 = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (frostHunterDataBindingAlphaLegendElite3927 != null) {
                frostHunterDataBindingAlphaLegendElite3927.setState(FrostHunterLightSensorForceFusion4241);
            }
        }
        FrostHunterDataBindingAlphaLegendElite3927 frostHunterDataBindingAlphaLegendElite39272 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterDataBindingAlphaLegendElite39272 == null) {
            return;
        }
        frostHunterDataBindingAlphaLegendElite39272.setVisible(false, false);
        unscheduleDrawable(frostHunterDataBindingAlphaLegendElite39272);
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterAssetManagerPhantomAlphaStrike7339 frostHunterAssetManagerPhantomAlphaStrike7339, boolean z, long j, int i, long j2, float f, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595) {
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == null || !Boolean.valueOf(z).equals(this.FrostHunterFlowMaxDragonHero5809)) {
            FrostHunterDataBindingAlphaLegendElite3927 frostHunterDataBindingAlphaLegendElite3927 = new FrostHunterDataBindingAlphaLegendElite3927(z);
            setBackground(frostHunterDataBindingAlphaLegendElite3927);
            this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterDataBindingAlphaLegendElite3927;
            this.FrostHunterFlowMaxDragonHero5809 = Boolean.valueOf(z);
        }
        FrostHunterDataBindingAlphaLegendElite3927 frostHunterDataBindingAlphaLegendElite39272 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterDataBindingAlphaLegendElite39272.getClass();
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterNotificationGammaBlazePhoenix7595;
        Integer num = frostHunterDataBindingAlphaLegendElite39272.FrostHunterAlertDialogAuroraDelta3200;
        if (num == null || num.intValue() != i) {
            frostHunterDataBindingAlphaLegendElite39272.FrostHunterAlertDialogAuroraDelta3200 = Integer.valueOf(i);
            FrostHunterEventTitanSparkFusion5864.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDataBindingAlphaLegendElite39272, i);
        }
        FrostHunterLifecycleBlazeGammaElite2889(f, j, j2);
        if (z) {
            frostHunterDataBindingAlphaLegendElite39272.setHotspot(Float.intBitsToFloat((int) (frostHunterAssetManagerPhantomAlphaStrike7339.FrostHunterAlphaAnimationNeoCosmos5761 >> 32)), Float.intBitsToFloat((int) (frostHunterAssetManagerPhantomAlphaStrike7339.FrostHunterAlphaAnimationNeoCosmos5761 & 4294967295L)));
        } else {
            frostHunterDataBindingAlphaLegendElite39272.setHotspot(frostHunterDataBindingAlphaLegendElite39272.getBounds().centerX(), frostHunterDataBindingAlphaLegendElite39272.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889(float f, long j, long j2) {
        FrostHunterDataBindingAlphaLegendElite3927 frostHunterDataBindingAlphaLegendElite3927 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterDataBindingAlphaLegendElite3927 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j2, f);
        FrostHunterViewModelScopeLegendAurora8732 frostHunterViewModelScopeLegendAurora8732 = frostHunterDataBindingAlphaLegendElite3927.FrostHunterFlowMaxDragonHero5809;
        if (!(frostHunterViewModelScopeLegendAurora8732 == null ? false : FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475(frostHunterViewModelScopeLegendAurora8732.FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterConstraintSetCloneMasterUltraRogue2633))) {
            frostHunterDataBindingAlphaLegendElite3927.FrostHunterFlowMaxDragonHero5809 = new FrostHunterViewModelScopeLegendAurora8732(FrostHunterConstraintSetCloneMasterUltraRogue2633);
            frostHunterDataBindingAlphaLegendElite3927.setColor(ColorStateList.valueOf(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRemoteConfigThunderShadow4435(FrostHunterConstraintSetCloneMasterUltraRogue2633)));
        }
        Rect rect = new Rect(0, 0, FrostHunterCardViewHyperionAurora3829.FrostHunterColorStateListInflaterNovaQuantum4229(FrostHunterMotionLayoutBlazePhoenix5062.FrostHunterServiceEliteCelestialThunder1757(j)), FrostHunterCardViewHyperionAurora3829.FrostHunterColorStateListInflaterNovaQuantum4229(FrostHunterMotionLayoutBlazePhoenix5062.FrostHunterConstraintSetCloneMasterUltraRogue2633(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        frostHunterDataBindingAlphaLegendElite3927.setBounds(rect);
    }

    public final void FrostHunterServiceEliteCelestialThunder1757() {
        setRippleState(false);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595 = this.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterNotificationGammaBlazePhoenix7595 != null) {
            frostHunterNotificationGammaBlazePhoenix7595.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
