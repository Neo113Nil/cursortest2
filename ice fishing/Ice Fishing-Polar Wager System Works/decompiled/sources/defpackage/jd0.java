package defpackage;

/* loaded from: classes.dex */
public final class jd0 extends android.text.style.MetricAffectingSpan {
    public final float adDC3e2L;

    public jd0(float f) {
        this.adDC3e2L = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.adDC3e2L / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.adDC3e2L / textScaleX);
    }
}
