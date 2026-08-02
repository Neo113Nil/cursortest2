package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.payments.backend.api.OfflineManagerKt;

/* loaded from: classes.dex */
public final class LayoutIntrinsics {
    public BoringLayout.Metrics _boringMetrics;
    public CharSequence _charSequenceForIntrinsicWidth;
    public float _maxIntrinsicWidth = Float.NaN;
    public float _minIntrinsicWidth = Float.NaN;
    public boolean boringMetricsIsInit;
    public final CharSequence charSequence;
    public final int textDirectionHeuristic;
    public final TextPaint textPaint;

    public LayoutIntrinsics(CharSequence charSequence, TextPaint textPaint, int i) {
        this.charSequence = charSequence;
        this.textPaint = textPaint;
        this.textDirectionHeuristic = i;
    }

    public final BoringLayout.Metrics getBoringMetrics() {
        if (!this.boringMetricsIsInit) {
            TextDirectionHeuristic textDirectionHeuristic = TextLayout_androidKt.getTextDirectionHeuristic(this.textDirectionHeuristic);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.charSequence;
            TextPaint textPaint = this.textPaint;
            this._boringMetrics = i >= 33 ? BoringLayoutFactory33.isBoring(charSequence, textPaint, textDirectionHeuristic) : OfflineManagerKt.isBoring(charSequence, textPaint, textDirectionHeuristic);
            this.boringMetricsIsInit = true;
        }
        return this._boringMetrics;
    }

    public final CharSequence getCharSequenceForIntrinsicWidth() {
        CharSequence charSequence = this._charSequenceForIntrinsicWidth;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        CharSequence charSequence2 = this.charSequence;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (StaticLayoutFactory.hasSpan(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this._charSequenceForIntrinsicWidth = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (androidx.compose.ui.text.android.StaticLayoutFactory.hasSpan(r2, androidx.compose.ui.text.android.style.LetterSpacingSpanEm.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float getMaxIntrinsicWidth() {
        if (!Float.isNaN(this._maxIntrinsicWidth)) {
            return this._maxIntrinsicWidth;
        }
        BoringLayout.Metrics boringMetrics = getBoringMetrics();
        float f = boringMetrics != null ? boringMetrics.width : -1;
        TextPaint textPaint = this.textPaint;
        if (f < RecyclerView.DECELERATION_RATE) {
            f = (float) Math.ceil(Layout.getDesiredWidth(getCharSequenceForIntrinsicWidth(), 0, getCharSequenceForIntrinsicWidth().length(), textPaint));
        }
        if (f != RecyclerView.DECELERATION_RATE) {
            CharSequence charSequence = this.charSequence;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!StaticLayoutFactory.hasSpan(spanned, LetterSpacingSpanPx.class)) {
                }
                f += 0.5f;
            }
        }
        this._maxIntrinsicWidth = f;
        return f;
    }
}
