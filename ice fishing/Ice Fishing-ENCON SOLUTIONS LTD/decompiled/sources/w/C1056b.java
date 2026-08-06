package w;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1056b {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f8509a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f8510b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8511c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8512d;

    public C1056b(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = AbstractC1055a.e(textPaint).setBreakStrategy(i2);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i3);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f8509a = textPaint;
        this.f8510b = textDirectionHeuristic;
        this.f8511c = i2;
        this.f8512d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1056b)) {
            return false;
        }
        C1056b c1056b = (C1056b) obj;
        if (this.f8511c == c1056b.f8511c && this.f8512d == c1056b.f8512d) {
            TextPaint textPaint = this.f8509a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = c1056b.f8509a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f8510b == c1056b.f8510b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f8509a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f8510b, Integer.valueOf(this.f8511c), Integer.valueOf(this.f8512d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f8509a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i2 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i2 >= 26) {
            StringBuilder sb3 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb3.append(fontVariationSettings);
            sb.append(sb3.toString());
        }
        sb.append(", textDir=" + this.f8510b);
        sb.append(", breakStrategy=" + this.f8511c);
        sb.append(", hyphenationFrequency=" + this.f8512d);
        sb.append("}");
        return sb.toString();
    }

    public C1056b(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f8509a = textPaint;
        textDirection = params.getTextDirection();
        this.f8510b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f8511c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f8512d = hyphenationFrequency;
    }
}
