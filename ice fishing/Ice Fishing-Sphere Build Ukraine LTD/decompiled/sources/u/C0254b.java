package u;

import J.k;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254b {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f2995a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f2996b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2997c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2998d;

    public C0254b(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = k.k(textPaint).setBreakStrategy(i2);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i3);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f2995a = textPaint;
        this.f2996b = textDirectionHeuristic;
        this.f2997c = i2;
        this.f2998d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0254b)) {
            return false;
        }
        C0254b c0254b = (C0254b) obj;
        if (this.f2997c == c0254b.f2997c && this.f2998d == c0254b.f2998d) {
            TextPaint textPaint = this.f2995a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = c0254b.f2995a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f2996b == c0254b.f2996b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f2995a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f2996b, Integer.valueOf(this.f2997c), Integer.valueOf(this.f2998d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f2995a;
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
        sb.append(", textDir=" + this.f2996b);
        sb.append(", breakStrategy=" + this.f2997c);
        sb.append(", hyphenationFrequency=" + this.f2998d);
        sb.append("}");
        return sb.toString();
    }

    public C0254b(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f2995a = textPaint;
        textDirection = params.getTextDirection();
        this.f2996b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f2997c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f2998d = hyphenationFrequency;
    }
}
