package android.content.Context;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterClipboardManagerGammaFusionMaster6787 extends ReplacementSpan {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public Paint.FontMetricsInt FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;
    public boolean FrostHunterKeyframeGammaGamma1197;

    public final Paint.FontMetricsInt FrostHunterAlphaAnimationNeoCosmos5761() {
        Paint.FontMetricsInt fontMetricsInt = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("fontMetrics");
        throw null;
    }

    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (!this.FrostHunterKeyframeGammaGamma1197) {
            FrostHunterRippleDrawableNeoDelta6594.FrostHunterConstraintSetCloneMasterUltraRogue2633("PlaceholderSpan is not laid out yet.");
        }
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.FrostHunterKeyframeGammaGamma1197 = true;
        paint.getTextSize();
        this.FrostHunterCameraXPixelTurboCosmos9814 = paint.getFontMetricsInt();
        if (FrostHunterAlphaAnimationNeoCosmos5761().descent <= FrostHunterAlphaAnimationNeoCosmos5761().ascent) {
            FrostHunterRippleDrawableNeoDelta6594.FrostHunterAlphaAnimationNeoCosmos5761("Invalid fontMetrics: line height can not be negative.");
        }
        this.FrostHunterFlowMaxDragonHero5809 = (int) Math.ceil(0.0d);
        this.FrostHunterAlertDialogAuroraDelta3200 = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = FrostHunterAlphaAnimationNeoCosmos5761().ascent;
            fontMetricsInt.descent = FrostHunterAlphaAnimationNeoCosmos5761().descent;
            fontMetricsInt.leading = FrostHunterAlphaAnimationNeoCosmos5761().leading;
            if (fontMetricsInt.ascent > (-FrostHunterConstraintSetCloneMasterUltraRogue2633())) {
                fontMetricsInt.ascent = -FrostHunterConstraintSetCloneMasterUltraRogue2633();
            }
            fontMetricsInt.top = Math.min(FrostHunterAlphaAnimationNeoCosmos5761().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(FrostHunterAlphaAnimationNeoCosmos5761().bottom, fontMetricsInt.descent);
        }
        if (!this.FrostHunterKeyframeGammaGamma1197) {
            FrostHunterRippleDrawableNeoDelta6594.FrostHunterConstraintSetCloneMasterUltraRogue2633("PlaceholderSpan is not laid out yet.");
        }
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
