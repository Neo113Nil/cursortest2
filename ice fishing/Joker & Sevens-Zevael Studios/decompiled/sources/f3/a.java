package f3;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.onesignal.common.m;
import java.util.Objects;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f2308a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f2309b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2310c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2311d;

    public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = m.g(textPaint).setBreakStrategy(i10);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i11);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f2308a = textPaint;
        this.f2309b = textDirectionHeuristic;
        this.f2310c = i10;
        this.f2311d = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2310c != aVar.f2310c || this.f2311d != aVar.f2311d) {
            return false;
        }
        TextPaint textPaint = this.f2308a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = aVar.f2308a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f2309b == aVar.f2309b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f2308a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f2309b, Integer.valueOf(this.f2310c), Integer.valueOf(this.f2311d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f2308a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f2309b);
        sb.append(", breakStrategy=" + this.f2310c);
        sb.append(", hyphenationFrequency=" + this.f2311d);
        sb.append("}");
        return sb.toString();
    }

    public a(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f2308a = textPaint;
        textDirection = params.getTextDirection();
        this.f2309b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f2310c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f2311d = hyphenationFrequency;
    }
}
