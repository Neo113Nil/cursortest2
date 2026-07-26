package android.content.Context;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFlipAnimationSpectraOmegaOmega1311 {
    public final float FrostHunterAlertDialogAuroraDelta3200;
    public final TextPaint FrostHunterAlphaAnimationNeoCosmos5761;
    public final boolean FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final TextUtils.TruncateAt FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final float FrostHunterFlowMaxDragonHero5809;
    public final Paint.FontMetricsInt FrostHunterFragmentBetaMegaVortex6025;
    public final boolean FrostHunterKeyframeGammaGamma1197;
    public final int FrostHunterLevelListDrawableFusionDragonHero2232;
    public final Layout FrostHunterLifecycleBlazeGammaElite2889;
    public final FrostHunterMotionEventVortexVisionCosmos3608[] FrostHunterLightSensorForceFusion4241;
    public final int FrostHunterRemoteConfigSpeedSpeed8566;
    public final Rect FrostHunterScaleAnimationStrikeSpark5059 = new Rect();
    public final int FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final boolean FrostHunterServiceEliteCelestialThunder1757;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0246 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterFlipAnimationSpectraOmegaOmega1311(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, FrostHunterKaptDeltaCelestialPhoenix4341 frostHunterKaptDeltaCelestialPhoenix4341) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout FrostHunterServiceEliteCelestialThunder1757;
        char c;
        boolean z2;
        int i10;
        int i11;
        long j;
        FrostHunterMotionEventVortexVisionCosmos3608[] frostHunterMotionEventVortexVisionCosmos3608Arr;
        long j2;
        int i12;
        Layout layout;
        int i13;
        boolean z3;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = textPaint;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = truncateAt;
        this.FrostHunterBundlePulseFusionHero2475 = z;
        int length = charSequence.length();
        TextDirectionHeuristic FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAnimatedVectorDrawableUltraPulse9884.FrostHunterAlphaAnimationNeoCosmos5761(i2);
        Layout.Alignment alignment = FrostHunterActivityMegaBlazeHero5288.FrostHunterAlphaAnimationNeoCosmos5761;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : FrostHunterActivityMegaBlazeHero5288.FrostHunterConstraintSetCloneMasterUltraRogue2633 : FrostHunterActivityMegaBlazeHero5288.FrostHunterAlphaAnimationNeoCosmos5761 : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, FrostHunterPaintUltraMaster4514.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterKaptDeltaCelestialPhoenix4341.FrostHunterAlphaAnimationNeoCosmos5761();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (FrostHunterAlphaAnimationNeoCosmos57612 == null || frostHunterKaptDeltaCelestialPhoenix4341.FrostHunterBundlePulseFusionHero2475() > f || z4) {
                this.FrostHunterKeyframeGammaGamma1197 = false;
                i9 = i3;
                textDirectionHeuristic = FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterServiceEliteCelestialThunder1757 = FrostHunterLiveDataEpicNeoPrime2305.FrostHunterServiceEliteCelestialThunder1757(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.FrostHunterKeyframeGammaGamma1197 = true;
                if (ceil < 0) {
                    FrostHunterRippleDrawableNeoDelta6594.FrostHunterAlphaAnimationNeoCosmos5761("negative width");
                }
                if (ceil < 0) {
                    FrostHunterRippleDrawableNeoDelta6594.FrostHunterAlphaAnimationNeoCosmos5761("negative ellipsized width");
                }
                FrostHunterServiceEliteCelestialThunder1757 = Build.VERSION.SDK_INT >= 33 ? FrostHunterOnItemLongClickListenerNovaDragon3849.FrostHunterFlowMaxDragonHero5809(charSequence, textPaint, ceil, alignment2, FrostHunterAlphaAnimationNeoCosmos57612, z, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, FrostHunterAlphaAnimationNeoCosmos57612, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = FrostHunterAlphaAnimationNeoCosmos5761;
            }
            this.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterServiceEliteCelestialThunder1757;
            Trace.endSection();
            int min = Math.min(FrostHunterServiceEliteCelestialThunder1757.getLineCount(), i9);
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = min;
            int i14 = min - 1;
            this.FrostHunterServiceEliteCelestialThunder1757 = min >= i9 && (FrostHunterServiceEliteCelestialThunder1757.getEllipsisCount(i14) > 0 || FrostHunterServiceEliteCelestialThunder1757.getLineEnd(i14) != charSequence.length());
            long j3 = FrostHunterAnimatedVectorDrawableUltraPulse9884.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            long j4 = 4294967295L;
            if (z) {
                c = ' ';
                z2 = true;
                i10 = 33;
            } else if (this.FrostHunterKeyframeGammaGamma1197) {
                BoringLayout boringLayout = (BoringLayout) FrostHunterServiceEliteCelestialThunder1757;
                i10 = 33;
                if (Build.VERSION.SDK_INT >= 33) {
                    z3 = boringLayout.isFallbackLineSpacingEnabled();
                    if (!z3) {
                        TextPaint paint = FrostHunterServiceEliteCelestialThunder1757.getPaint();
                        CharSequence text = FrostHunterServiceEliteCelestialThunder1757.getText();
                        i11 = 0;
                        Rect FrostHunterServiceInfoHyperionSparkMax9966 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterServiceInfoHyperionSparkMax9966(paint, text, FrostHunterServiceEliteCelestialThunder1757.getLineStart(0), FrostHunterServiceEliteCelestialThunder1757.getLineEnd(0));
                        int lineAscent = FrostHunterServiceEliteCelestialThunder1757.getLineAscent(0);
                        c = ' ';
                        int i15 = FrostHunterServiceInfoHyperionSparkMax9966.top;
                        int topPadding = i15 < lineAscent ? lineAscent - i15 : FrostHunterServiceEliteCelestialThunder1757.getTopPadding();
                        z2 = true;
                        FrostHunterServiceInfoHyperionSparkMax9966 = min != 1 ? FrostHunterTransitionGammaTitanSpeed7178.FrostHunterServiceInfoHyperionSparkMax9966(paint, text, FrostHunterServiceEliteCelestialThunder1757.getLineStart(i14), FrostHunterServiceEliteCelestialThunder1757.getLineEnd(i14)) : FrostHunterServiceInfoHyperionSparkMax9966;
                        int lineDescent = FrostHunterServiceEliteCelestialThunder1757.getLineDescent(i14);
                        int i16 = FrostHunterServiceInfoHyperionSparkMax9966.bottom;
                        int bottomPadding = i16 > lineDescent ? i16 - lineDescent : FrostHunterServiceEliteCelestialThunder1757.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            j = (bottomPadding & 4294967295L) | (topPadding << 32);
                            Paint.FontMetricsInt fontMetricsInt = null;
                            if (FrostHunterServiceEliteCelestialThunder1757.getText() instanceof Spanned) {
                                CharSequence text2 = FrostHunterServiceEliteCelestialThunder1757.getText();
                                text2.getClass();
                                if (FrostHunterChipNovaPhantomElite7665.FrostHunterRemoteConfigSpeedSpeed8566((Spanned) text2, FrostHunterMotionEventVortexVisionCosmos3608.class) || FrostHunterServiceEliteCelestialThunder1757.getText().length() <= 0) {
                                    CharSequence text3 = FrostHunterServiceEliteCelestialThunder1757.getText();
                                    text3.getClass();
                                    frostHunterMotionEventVortexVisionCosmos3608Arr = (FrostHunterMotionEventVortexVisionCosmos3608[]) ((Spanned) text3).getSpans(i11, FrostHunterServiceEliteCelestialThunder1757.getText().length(), FrostHunterMotionEventVortexVisionCosmos3608.class);
                                    this.FrostHunterLightSensorForceFusion4241 = frostHunterMotionEventVortexVisionCosmos3608Arr;
                                    if (frostHunterMotionEventVortexVisionCosmos3608Arr == null) {
                                        int length2 = frostHunterMotionEventVortexVisionCosmos3608Arr.length;
                                        int i17 = i11;
                                        int i18 = i17;
                                        int i19 = i18;
                                        while (i17 < length2) {
                                            boolean z5 = z2;
                                            FrostHunterMotionEventVortexVisionCosmos3608 frostHunterMotionEventVortexVisionCosmos3608 = frostHunterMotionEventVortexVisionCosmos3608Arr[i17];
                                            long j5 = j4;
                                            int i20 = frostHunterMotionEventVortexVisionCosmos3608.FrostHunterCameraXTurboCelestialHero5430;
                                            i18 = i20 < 0 ? Math.max(i18, Math.abs(i20)) : i18;
                                            int i21 = frostHunterMotionEventVortexVisionCosmos3608.FrostHunterResourcesTitanHyperVision5823;
                                            if (i21 < 0) {
                                                i19 = Math.max(i18, Math.abs(i21));
                                            }
                                            i17++;
                                            j4 = j5;
                                            z2 = z5;
                                        }
                                        j2 = j4;
                                        j3 = (i18 == 0 && i19 == 0) ? FrostHunterAnimatedVectorDrawableUltraPulse9884.FrostHunterConstraintSetCloneMasterUltraRogue2633 : (i18 << c) | (i19 & j2);
                                    } else {
                                        j2 = 4294967295L;
                                    }
                                    this.FrostHunterRemoteConfigSpeedSpeed8566 = Math.max((int) (j >> c), (int) (j3 >> c));
                                    this.FrostHunterCameraXPixelTurboCosmos9814 = Math.max((int) (j & j2), (int) (j3 & j2));
                                    TextPaint textPaint2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                                    FrostHunterMotionEventVortexVisionCosmos3608[] frostHunterMotionEventVortexVisionCosmos3608Arr2 = this.FrostHunterLightSensorForceFusion4241;
                                    i12 = this.FrostHunterLevelListDrawableFusionDragonHero2232 - 1;
                                    layout = this.FrostHunterLifecycleBlazeGammaElite2889;
                                    if (layout.getLineStart(i12) == layout.getLineEnd(i12) || frostHunterMotionEventVortexVisionCosmos3608Arr2 == null || frostHunterMotionEventVortexVisionCosmos3608Arr2.length == 0) {
                                        i13 = i11;
                                    } else {
                                        SpannableString spannableString = new SpannableString("\u200b");
                                        if (frostHunterMotionEventVortexVisionCosmos3608Arr2.length == 0) {
                                            throw new NoSuchElementException("Array is empty.");
                                        }
                                        FrostHunterMotionEventVortexVisionCosmos3608 frostHunterMotionEventVortexVisionCosmos36082 = frostHunterMotionEventVortexVisionCosmos3608Arr2[i11];
                                        spannableString.setSpan(new FrostHunterMotionEventVortexVisionCosmos3608(frostHunterMotionEventVortexVisionCosmos36082.FrostHunterCameraXPixelTurboCosmos9814, spannableString.length(), (i12 == 0 || !frostHunterMotionEventVortexVisionCosmos36082.FrostHunterKeyframeGammaGamma1197) ? frostHunterMotionEventVortexVisionCosmos36082.FrostHunterKeyframeGammaGamma1197 : i11, frostHunterMotionEventVortexVisionCosmos36082.FrostHunterKeyframeGammaGamma1197, frostHunterMotionEventVortexVisionCosmos36082.FrostHunterFragmentBetaMegaVortex6025, frostHunterMotionEventVortexVisionCosmos36082.FrostHunterServiceConnectionTurboPhoenixOmega6719), i11, spannableString.length(), i10);
                                        i13 = i11;
                                        StaticLayout FrostHunterServiceEliteCelestialThunder17572 = FrostHunterLiveDataEpicNeoPrime2305.FrostHunterServiceEliteCelestialThunder1757(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, FrostHunterLiveDataScopeVisionPulse1554.FrostHunterAlphaAnimationNeoCosmos5761, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.FrostHunterBundlePulseFusionHero2475, 0, 0, 0, 0);
                                        fontMetricsInt = new Paint.FontMetricsInt();
                                        fontMetricsInt.ascent = FrostHunterServiceEliteCelestialThunder17572.getLineAscent(i13);
                                        fontMetricsInt.descent = FrostHunterServiceEliteCelestialThunder17572.getLineDescent(i13);
                                        fontMetricsInt.top = FrostHunterServiceEliteCelestialThunder17572.getLineTop(i13);
                                        fontMetricsInt.bottom = FrostHunterServiceEliteCelestialThunder17572.getLineBottom(i13);
                                    }
                                    this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (FrostHunterServiceEliteCelestialThunder1757(i14) - FrostHunterLevelListDrawableFusionDragonHero2232(i14))) : i13;
                                    this.FrostHunterFragmentBetaMegaVortex6025 = fontMetricsInt;
                                    Layout layout2 = this.FrostHunterLifecycleBlazeGammaElite2889;
                                    this.FrostHunterFlowMaxDragonHero5809 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterCameraXTurboCelestialHero5430(layout2, i14, layout2.getPaint());
                                    Layout layout3 = this.FrostHunterLifecycleBlazeGammaElite2889;
                                    this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterResourcesTitanHyperVision5823(layout3, i14, layout3.getPaint());
                                }
                            }
                            frostHunterMotionEventVortexVisionCosmos3608Arr = null;
                            this.FrostHunterLightSensorForceFusion4241 = frostHunterMotionEventVortexVisionCosmos3608Arr;
                            if (frostHunterMotionEventVortexVisionCosmos3608Arr == null) {
                            }
                            this.FrostHunterRemoteConfigSpeedSpeed8566 = Math.max((int) (j >> c), (int) (j3 >> c));
                            this.FrostHunterCameraXPixelTurboCosmos9814 = Math.max((int) (j & j2), (int) (j3 & j2));
                            TextPaint textPaint22 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                            FrostHunterMotionEventVortexVisionCosmos3608[] frostHunterMotionEventVortexVisionCosmos3608Arr22 = this.FrostHunterLightSensorForceFusion4241;
                            i12 = this.FrostHunterLevelListDrawableFusionDragonHero2232 - 1;
                            layout = this.FrostHunterLifecycleBlazeGammaElite2889;
                            if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
                            }
                            i13 = i11;
                            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (FrostHunterServiceEliteCelestialThunder1757(i14) - FrostHunterLevelListDrawableFusionDragonHero2232(i14))) : i13;
                            this.FrostHunterFragmentBetaMegaVortex6025 = fontMetricsInt;
                            Layout layout22 = this.FrostHunterLifecycleBlazeGammaElite2889;
                            this.FrostHunterFlowMaxDragonHero5809 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterCameraXTurboCelestialHero5430(layout22, i14, layout22.getPaint());
                            Layout layout32 = this.FrostHunterLifecycleBlazeGammaElite2889;
                            this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterResourcesTitanHyperVision5823(layout32, i14, layout32.getPaint());
                        }
                        j = j3;
                        Paint.FontMetricsInt fontMetricsInt2 = null;
                        if (FrostHunterServiceEliteCelestialThunder1757.getText() instanceof Spanned) {
                        }
                        frostHunterMotionEventVortexVisionCosmos3608Arr = null;
                        this.FrostHunterLightSensorForceFusion4241 = frostHunterMotionEventVortexVisionCosmos3608Arr;
                        if (frostHunterMotionEventVortexVisionCosmos3608Arr == null) {
                        }
                        this.FrostHunterRemoteConfigSpeedSpeed8566 = Math.max((int) (j >> c), (int) (j3 >> c));
                        this.FrostHunterCameraXPixelTurboCosmos9814 = Math.max((int) (j & j2), (int) (j3 & j2));
                        TextPaint textPaint222 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                        FrostHunterMotionEventVortexVisionCosmos3608[] frostHunterMotionEventVortexVisionCosmos3608Arr222 = this.FrostHunterLightSensorForceFusion4241;
                        i12 = this.FrostHunterLevelListDrawableFusionDragonHero2232 - 1;
                        layout = this.FrostHunterLifecycleBlazeGammaElite2889;
                        if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
                        }
                        i13 = i11;
                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = fontMetricsInt2 != null ? fontMetricsInt2.bottom - ((int) (FrostHunterServiceEliteCelestialThunder1757(i14) - FrostHunterLevelListDrawableFusionDragonHero2232(i14))) : i13;
                        this.FrostHunterFragmentBetaMegaVortex6025 = fontMetricsInt2;
                        Layout layout222 = this.FrostHunterLifecycleBlazeGammaElite2889;
                        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterCameraXTurboCelestialHero5430(layout222, i14, layout222.getPaint());
                        Layout layout322 = this.FrostHunterLifecycleBlazeGammaElite2889;
                        this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterResourcesTitanHyperVision5823(layout322, i14, layout322.getPaint());
                    }
                    c = ' ';
                    z2 = true;
                }
                z3 = false;
                if (!z3) {
                }
            } else {
                i10 = 33;
                StaticLayout staticLayout = (StaticLayout) FrostHunterServiceEliteCelestialThunder1757;
                int i22 = Build.VERSION.SDK_INT;
                if (i22 >= 33) {
                    z3 = staticLayout.isFallbackLineSpacingEnabled();
                } else {
                    if (i22 >= 28) {
                        z3 = true;
                    }
                    z3 = false;
                }
                if (!z3) {
                }
            }
            i11 = 0;
            j = j3;
            Paint.FontMetricsInt fontMetricsInt22 = null;
            if (FrostHunterServiceEliteCelestialThunder1757.getText() instanceof Spanned) {
            }
            frostHunterMotionEventVortexVisionCosmos3608Arr = null;
            this.FrostHunterLightSensorForceFusion4241 = frostHunterMotionEventVortexVisionCosmos3608Arr;
            if (frostHunterMotionEventVortexVisionCosmos3608Arr == null) {
            }
            this.FrostHunterRemoteConfigSpeedSpeed8566 = Math.max((int) (j >> c), (int) (j3 >> c));
            this.FrostHunterCameraXPixelTurboCosmos9814 = Math.max((int) (j & j2), (int) (j3 & j2));
            TextPaint textPaint2222 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterMotionEventVortexVisionCosmos3608[] frostHunterMotionEventVortexVisionCosmos3608Arr2222 = this.FrostHunterLightSensorForceFusion4241;
            i12 = this.FrostHunterLevelListDrawableFusionDragonHero2232 - 1;
            layout = this.FrostHunterLifecycleBlazeGammaElite2889;
            if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
            }
            i13 = i11;
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = fontMetricsInt22 != null ? fontMetricsInt22.bottom - ((int) (FrostHunterServiceEliteCelestialThunder1757(i14) - FrostHunterLevelListDrawableFusionDragonHero2232(i14))) : i13;
            this.FrostHunterFragmentBetaMegaVortex6025 = fontMetricsInt22;
            Layout layout2222 = this.FrostHunterLifecycleBlazeGammaElite2889;
            this.FrostHunterFlowMaxDragonHero5809 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterCameraXTurboCelestialHero5430(layout2222, i14, layout2222.getPaint());
            Layout layout3222 = this.FrostHunterLifecycleBlazeGammaElite2889;
            this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterResourcesTitanHyperVision5823(layout3222, i14, layout3222.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        boolean z = this.FrostHunterServiceEliteCelestialThunder1757;
        Layout layout = this.FrostHunterLifecycleBlazeGammaElite2889;
        return (z ? layout.getLineBottom(this.FrostHunterLevelListDrawableFusionDragonHero2232 - 1) : layout.getHeight()) + this.FrostHunterRemoteConfigSpeedSpeed8566 + this.FrostHunterCameraXPixelTurboCosmos9814 + this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
    }

    public final float FrostHunterBundlePulseFusionHero2475(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.FrostHunterRemoteConfigSpeedSpeed8566 + ((i != this.FrostHunterLevelListDrawableFusionDragonHero2232 + (-1) || (fontMetricsInt = this.FrostHunterFragmentBetaMegaVortex6025) == null) ? this.FrostHunterLifecycleBlazeGammaElite2889.getLineBaseline(i) : FrostHunterLevelListDrawableFusionDragonHero2232(i) - fontMetricsInt.ascent);
    }

    public final float FrostHunterCameraXPixelTurboCosmos9814(int i, boolean z) {
        return (this.FrostHunterLifecycleBlazeGammaElite2889.getLineForOffset(i) == this.FrostHunterLevelListDrawableFusionDragonHero2232 + (-1) ? this.FrostHunterFlowMaxDragonHero5809 + this.FrostHunterAlertDialogAuroraDelta3200 : 0.0f) + FrostHunterConstraintSetCloneMasterUltraRogue2633().FrostHunterTextViewDragonStormMega4297(i, false, z);
    }

    public final FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike7658 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (frostHunterOnItemLongClickListenerRogueDeltaStrike7658 != null) {
            return frostHunterOnItemLongClickListenerRogueDeltaStrike7658;
        }
        FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike76582 = new FrostHunterOnItemLongClickListenerRogueDeltaStrike7658();
        frostHunterOnItemLongClickListenerRogueDeltaStrike76582.FrostHunterAlertDialogAuroraDelta3200 = this.FrostHunterLifecycleBlazeGammaElite2889;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int FrostHunterDialogFragmentTurboPhoenixDragon7627 = FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterDialogFragmentTurboPhoenixDragon7627(((Layout) frostHunterOnItemLongClickListenerRogueDeltaStrike76582.FrostHunterAlertDialogAuroraDelta3200).getText(), '\n', i, 4);
            i = FrostHunterDialogFragmentTurboPhoenixDragon7627 < 0 ? ((Layout) frostHunterOnItemLongClickListenerRogueDeltaStrike76582.FrostHunterAlertDialogAuroraDelta3200).getText().length() : FrostHunterDialogFragmentTurboPhoenixDragon7627 + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) frostHunterOnItemLongClickListenerRogueDeltaStrike76582.FrostHunterAlertDialogAuroraDelta3200).getText().length());
        frostHunterOnItemLongClickListenerRogueDeltaStrike76582.FrostHunterCameraXPixelTurboCosmos9814 = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        frostHunterOnItemLongClickListenerRogueDeltaStrike76582.FrostHunterFlowMaxDragonHero5809 = arrayList2;
        frostHunterOnItemLongClickListenerRogueDeltaStrike76582.FrostHunterKeyframeGammaGamma1197 = new boolean[((ArrayList) frostHunterOnItemLongClickListenerRogueDeltaStrike76582.FrostHunterCameraXPixelTurboCosmos9814).size()];
        ((ArrayList) frostHunterOnItemLongClickListenerRogueDeltaStrike76582.FrostHunterCameraXPixelTurboCosmos9814).size();
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterOnItemLongClickListenerRogueDeltaStrike76582;
        return frostHunterOnItemLongClickListenerRogueDeltaStrike76582;
    }

    public final float FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        return this.FrostHunterLifecycleBlazeGammaElite2889.getLineTop(i) + (i == 0 ? 0 : this.FrostHunterRemoteConfigSpeedSpeed8566);
    }

    public final int FrostHunterLifecycleBlazeGammaElite2889(int i) {
        FrostHunterAdapterHeroTitan7326 frostHunterAdapterHeroTitan7326 = FrostHunterAnimatedVectorDrawableUltraPulse9884.FrostHunterAlphaAnimationNeoCosmos5761;
        Layout layout = this.FrostHunterLifecycleBlazeGammaElite2889;
        return (layout.getEllipsisCount(i) <= 0 || this.FrostHunterConstraintSetCloneMasterUltraRogue2633 != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float FrostHunterRemoteConfigSpeedSpeed8566(int i, boolean z) {
        return (this.FrostHunterLifecycleBlazeGammaElite2889.getLineForOffset(i) == this.FrostHunterLevelListDrawableFusionDragonHero2232 - 1 ? this.FrostHunterFlowMaxDragonHero5809 + this.FrostHunterAlertDialogAuroraDelta3200 : 0.0f) + FrostHunterConstraintSetCloneMasterUltraRogue2633().FrostHunterTextViewDragonStormMega4297(i, true, z);
    }

    public final float FrostHunterServiceEliteCelestialThunder1757(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        int i3 = i2 - 1;
        Layout layout = this.FrostHunterLifecycleBlazeGammaElite2889;
        if (i != i3 || (fontMetricsInt = this.FrostHunterFragmentBetaMegaVortex6025) == null) {
            return this.FrostHunterRemoteConfigSpeedSpeed8566 + layout.getLineBottom(i) + (i == i2 + (-1) ? this.FrostHunterCameraXPixelTurboCosmos9814 : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }
}
