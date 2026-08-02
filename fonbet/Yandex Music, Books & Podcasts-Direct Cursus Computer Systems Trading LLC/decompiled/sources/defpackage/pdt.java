package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes3.dex */
public final class pdt extends MetricAffectingSpan {
    public final /* synthetic */ int a;
    public final Typeface b;

    public /* synthetic */ pdt(Typeface typeface, int i) {
        this.a = i;
        this.b = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface(this.b);
                break;
            default:
                textPaint.setTypeface(this.b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface(this.b);
                break;
            default:
                textPaint.setTypeface(this.b);
                break;
        }
    }
}
