package android.content.Context;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBitmapHyperTurbo8349 extends ReplacementSpan {
    public final FrostHunterSupervisorJobLegendNova9809 FrostHunterFlowMaxDragonHero5809;
    public TextPaint FrostHunterFragmentBetaMegaVortex6025;
    public final Paint.FontMetricsInt FrostHunterCameraXPixelTurboCosmos9814 = new Paint.FontMetricsInt();
    public short FrostHunterAlertDialogAuroraDelta3200 = -1;
    public float FrostHunterKeyframeGammaGamma1197 = 1.0f;

    public FrostHunterBitmapHyperTurbo8349(FrostHunterSupervisorJobLegendNova9809 frostHunterSupervisorJobLegendNova9809) {
        FrostHunterExecutorSolarPhoenix3849.FrostHunterAlertDialogAuroraDelta3200(frostHunterSupervisorJobLegendNova9809, "rasterizer cannot be null");
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterSupervisorJobLegendNova9809;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.FrostHunterFragmentBetaMegaVortex6025;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.FrostHunterFragmentBetaMegaVortex6025 = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.FrostHunterAlertDialogAuroraDelta3200, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        FrostHunterLaunchPulseSpeed9430.FrostHunterAlphaAnimationNeoCosmos5761().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        FrostHunterSupervisorJobLegendNova9809 frostHunterSupervisorJobLegendNova9809 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 = frostHunterSupervisorJobLegendNova9809.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        Typeface typeface = (Typeface) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFragmentBetaMegaVortex6025;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterAlertDialogAuroraDelta3200, frostHunterSupervisorJobLegendNova9809.FrostHunterAlphaAnimationNeoCosmos5761 * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        FrostHunterSupervisorJobLegendNova9809 frostHunterSupervisorJobLegendNova9809 = this.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterKeyframeGammaGamma1197 = abs / (frostHunterSupervisorJobLegendNova9809.FrostHunterConstraintSetCloneMasterUltraRogue2633().FrostHunterAlphaAnimationNeoCosmos5761(14) != 0 ? ((ByteBuffer) r8.FrostHunterKeyframeGammaGamma1197).getShort(r1 + r8.FrostHunterCameraXPixelTurboCosmos9814) : (short) 0);
        FrostHunterInterpolatorAuroraPixel1637 FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterSupervisorJobLegendNova9809.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761(14);
        if (FrostHunterAlphaAnimationNeoCosmos5761 != 0) {
            ((ByteBuffer) FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterKeyframeGammaGamma1197).getShort(FrostHunterAlphaAnimationNeoCosmos5761 + FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterCameraXPixelTurboCosmos9814);
        }
        short s = (short) ((frostHunterSupervisorJobLegendNova9809.FrostHunterConstraintSetCloneMasterUltraRogue2633().FrostHunterAlphaAnimationNeoCosmos5761(12) != 0 ? ((ByteBuffer) r5.FrostHunterKeyframeGammaGamma1197).getShort(r7 + r5.FrostHunterCameraXPixelTurboCosmos9814) : (short) 0) * this.FrostHunterKeyframeGammaGamma1197);
        this.FrostHunterAlertDialogAuroraDelta3200 = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
