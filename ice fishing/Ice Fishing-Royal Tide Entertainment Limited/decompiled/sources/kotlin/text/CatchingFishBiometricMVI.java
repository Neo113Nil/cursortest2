package kotlin.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishBiometricMVI {
    public final int CatchingFishCoroutine;
    public final TextPaint CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public final TextDirectionHeuristic CatchingFishSnackbar;

    public CatchingFishBiometricMVI(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = CatchingFishJetpackCompose.CatchingFishLayout(textPaint).setBreakStrategy(i);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.CatchingFishParcelableFAB = textPaint;
        this.CatchingFishSnackbar = textDirectionHeuristic;
        this.CatchingFishCoroutine = i;
        this.CatchingFishReduxKtor = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishBiometricMVI)) {
            return false;
        }
        CatchingFishBiometricMVI catchingFishBiometricMVI = (CatchingFishBiometricMVI) obj;
        int i = catchingFishBiometricMVI.CatchingFishCoroutine;
        TextPaint textPaint = catchingFishBiometricMVI.CatchingFishParcelableFAB;
        if (this.CatchingFishCoroutine != i || this.CatchingFishReduxKtor != catchingFishBiometricMVI.CatchingFishReduxKtor) {
            return false;
        }
        TextPaint textPaint2 = this.CatchingFishParcelableFAB;
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
        return this.CatchingFishSnackbar == catchingFishBiometricMVI.CatchingFishSnackbar;
    }

    public final int hashCode() {
        TextPaint textPaint = this.CatchingFishParcelableFAB;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.CatchingFishSnackbar, Integer.valueOf(this.CatchingFishCoroutine), Integer.valueOf(this.CatchingFishReduxKtor));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.CatchingFishParcelableFAB;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        int i = Build.VERSION.SDK_INT;
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            StringBuilder sb3 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb3.append(fontVariationSettings);
            sb.append(sb3.toString());
        }
        sb.append(", textDir=" + this.CatchingFishSnackbar);
        sb.append(", breakStrategy=" + this.CatchingFishCoroutine);
        sb.append(", hyphenationFrequency=" + this.CatchingFishReduxKtor);
        sb.append("}");
        return sb.toString();
    }

    public CatchingFishBiometricMVI(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.CatchingFishParcelableFAB = textPaint;
        textDirection = params.getTextDirection();
        this.CatchingFishSnackbar = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.CatchingFishCoroutine = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.CatchingFishReduxKtor = hyphenationFrequency;
    }
}
