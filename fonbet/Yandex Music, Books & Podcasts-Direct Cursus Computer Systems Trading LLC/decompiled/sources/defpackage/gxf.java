package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class gxf extends MetricAffectingSpan {
    public final /* synthetic */ int a;
    public final float b;

    public /* synthetic */ gxf(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setLetterSpacing(this.b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setLetterSpacing(this.b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.b);
                break;
        }
    }
}
