package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.ParagraphStyle;

/* loaded from: classes3.dex */
public final class xu2 extends MetricAffectingSpan implements ParagraphStyle {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    public /* synthetic */ xu2(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.baselineShift -= this.b;
                break;
            default:
                textPaint.setTextSize(this.b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                if (this.c == 0) {
                    textPaint.baselineShift -= this.b;
                    break;
                }
                break;
            default:
                int i = this.b;
                int i2 = this.c;
                if (i2 != 0) {
                    if (i2 >= textPaint.getTextSize()) {
                        textPaint.setTextScaleX(i / textPaint.getTextSize());
                        break;
                    } else {
                        textPaint.setTextScaleX(i / i2);
                        textPaint.setTextSize(i2);
                        break;
                    }
                } else {
                    textPaint.setTextSize(i);
                    break;
                }
        }
    }
}
