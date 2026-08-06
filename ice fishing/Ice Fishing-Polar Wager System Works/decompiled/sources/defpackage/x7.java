package defpackage;

/* loaded from: classes.dex */
public final class x7 extends android.text.style.MetricAffectingSpan {
    public final /* synthetic */ int adDC3e2L;
    public final float xiZrDbcSW0;

    public /* synthetic */ x7(float f, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        int i = this.adDC3e2L;
        float f = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        int i = this.adDC3e2L;
        float f = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }
}
