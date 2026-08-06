package defpackage;

/* loaded from: classes.dex */
public final class id0 extends android.text.style.MetricAffectingSpan {
    public final float adDC3e2L;

    public id0(float f) {
        this.adDC3e2L = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setLetterSpacing(this.adDC3e2L);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        textPaint.setLetterSpacing(this.adDC3e2L);
    }
}
