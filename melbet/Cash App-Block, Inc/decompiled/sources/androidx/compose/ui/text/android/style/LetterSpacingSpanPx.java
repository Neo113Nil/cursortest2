package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class LetterSpacingSpanPx extends MetricAffectingSpan {
    public final float letterSpacing;

    public LetterSpacingSpanPx(float f) {
        this.letterSpacing = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == RecyclerView.DECELERATION_RATE) {
            return;
        }
        textPaint.setLetterSpacing(this.letterSpacing / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == RecyclerView.DECELERATION_RATE) {
            return;
        }
        textPaint.setLetterSpacing(this.letterSpacing / textScaleX);
    }
}
