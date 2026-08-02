package androidx.compose.ui.text.android.style;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes3.dex */
public final class TypefaceSpan extends MetricAffectingSpan {
    public final /* synthetic */ int $r8$classId;
    public final Typeface typeface;

    public /* synthetic */ TypefaceSpan(Typeface typeface, int i) {
        this.$r8$classId = i;
        this.typeface = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.$r8$classId;
        Typeface typeface = this.typeface;
        switch (i) {
            case 0:
                textPaint.setTypeface(typeface);
                break;
            default:
                textPaint.getClass();
                textPaint.setTypeface(typeface);
                textPaint.setFlags(textPaint.getFlags() | 128);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.$r8$classId;
        Typeface typeface = this.typeface;
        switch (i) {
            case 0:
                textPaint.setTypeface(typeface);
                break;
            default:
                textPaint.getClass();
                textPaint.setTypeface(typeface);
                textPaint.setFlags(textPaint.getFlags() | 128);
                break;
        }
    }
}
