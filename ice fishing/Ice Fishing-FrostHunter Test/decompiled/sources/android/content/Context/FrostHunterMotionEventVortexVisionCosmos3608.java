package android.content.Context;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionEventVortexVisionCosmos3608 implements LineHeightSpan {
    public final boolean FrostHunterAlertDialogAuroraDelta3200;
    public final float FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterCameraXTurboCelestialHero5430;
    public final int FrostHunterFlowMaxDragonHero5809;
    public final float FrostHunterFragmentBetaMegaVortex6025;
    public final boolean FrostHunterKeyframeGammaGamma1197;
    public int FrostHunterResourcesTitanHyperVision5823;
    public final boolean FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public int FrostHunterLightSensorForceFusion4241 = Integer.MIN_VALUE;
    public int FrostHunterScaleAnimationStrikeSpark5059 = Integer.MIN_VALUE;
    public int FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = Integer.MIN_VALUE;
    public int FrostHunterLintTitanVortexQuantum9911 = Integer.MIN_VALUE;

    public FrostHunterMotionEventVortexVisionCosmos3608(float f, int i, boolean z, boolean z2, float f2, boolean z3) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = f;
        this.FrostHunterFlowMaxDragonHero5809 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = z;
        this.FrostHunterKeyframeGammaGamma1197 = z2;
        this.FrostHunterFragmentBetaMegaVortex6025 = f2;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = z3;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            FrostHunterRippleDrawableNeoDelta6594.FrostHunterConstraintSetCloneMasterUltraRogue2633("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.FrostHunterFlowMaxDragonHero5809;
        boolean z3 = this.FrostHunterKeyframeGammaGamma1197;
        boolean z4 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (z && z2 && z4 && z3) {
            return;
        }
        if (this.FrostHunterLightSensorForceFusion4241 == Integer.MIN_VALUE) {
            int i7 = i5 - i6;
            int ceil = (int) Math.ceil(this.FrostHunterCameraXPixelTurboCosmos9814);
            int i8 = ceil - i7;
            if (!this.FrostHunterServiceConnectionTurboPhoenixOmega6719 || i8 > 0) {
                float f = this.FrostHunterFragmentBetaMegaVortex6025;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i8 <= 0 ? Math.ceil(i8 * f) : Math.ceil((1.0f - f) * i8));
                int i9 = fontMetricsInt.descent;
                int i10 = ceil2 + i9;
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = i10;
                int i11 = i10 - ceil;
                this.FrostHunterScaleAnimationStrikeSpark5059 = i11;
                if (z4) {
                    i11 = fontMetricsInt.ascent;
                }
                this.FrostHunterLightSensorForceFusion4241 = i11;
                if (z3) {
                    i10 = i9;
                }
                this.FrostHunterLintTitanVortexQuantum9911 = i10;
                this.FrostHunterCameraXTurboCelestialHero5430 = fontMetricsInt.ascent - i11;
                this.FrostHunterResourcesTitanHyperVision5823 = i10 - i9;
            } else {
                int i12 = fontMetricsInt.ascent;
                this.FrostHunterScaleAnimationStrikeSpark5059 = i12;
                int i13 = fontMetricsInt.descent;
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = i13;
                this.FrostHunterLightSensorForceFusion4241 = i12;
                this.FrostHunterLintTitanVortexQuantum9911 = i13;
                this.FrostHunterCameraXTurboCelestialHero5430 = 0;
                this.FrostHunterResourcesTitanHyperVision5823 = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.FrostHunterLightSensorForceFusion4241 : this.FrostHunterScaleAnimationStrikeSpark5059;
        fontMetricsInt.descent = z2 ? this.FrostHunterLintTitanVortexQuantum9911 : this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    }
}
