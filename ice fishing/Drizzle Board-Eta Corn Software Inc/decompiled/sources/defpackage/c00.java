package defpackage;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class c00 {
    public final int MdtA4re8;
    public final TextDirectionHeuristic NCTxEWno;
    public final TextPaint qoPGr6Ce;
    public final int wxUZMvaN;

    public c00(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.qoPGr6Ce = textPaint;
        this.NCTxEWno = textDirectionHeuristic;
        this.MdtA4re8 = i;
        this.wxUZMvaN = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c00)) {
            return false;
        }
        c00 c00Var = (c00) obj;
        int i = c00Var.MdtA4re8;
        TextPaint textPaint = c00Var.qoPGr6Ce;
        if (this.MdtA4re8 != i || this.wxUZMvaN != c00Var.wxUZMvaN) {
            return false;
        }
        TextPaint textPaint2 = this.qoPGr6Ce;
        if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags() || !textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
            return false;
        }
        if (textPaint2.getTypeface() == null) {
            if (textPaint.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
            return false;
        }
        return this.NCTxEWno == c00Var.NCTxEWno;
    }

    public final int hashCode() {
        TextPaint textPaint = this.qoPGr6Ce;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.NCTxEWno, Integer.valueOf(this.MdtA4re8), Integer.valueOf(this.wxUZMvaN));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.qoPGr6Ce;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb3 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb3.append(fontVariationSettings);
            sb.append(sb3.toString());
        }
        sb.append(", textDir=" + this.NCTxEWno);
        sb.append(", breakStrategy=" + this.MdtA4re8);
        sb.append(", hyphenationFrequency=" + this.wxUZMvaN);
        sb.append("}");
        return sb.toString();
    }

    public c00(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.qoPGr6Ce = textPaint;
        textDirection = params.getTextDirection();
        this.NCTxEWno = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.MdtA4re8 = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.wxUZMvaN = hyphenationFrequency;
    }
}
