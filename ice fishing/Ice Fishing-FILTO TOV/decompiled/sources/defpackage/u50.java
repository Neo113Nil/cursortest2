package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class u50 {
    public boolean AvO7iQsrTN;
    public BoringLayout.Metrics EljAMC1QTz;
    public final CharSequence GWasM1elztuh;
    public final int X1lG3V04pd;
    public final TextPaint Yi7zF1RB1;
    public CharSequence encWxUiV2;
    public float xqGvceK5x = Float.NaN;
    public float OOA6hdeuvCS = Float.NaN;

    public u50(CharSequence charSequence, TextPaint textPaint, int i) {
        this.GWasM1elztuh = charSequence;
        this.Yi7zF1RB1 = textPaint;
        this.X1lG3V04pd = i;
    }

    public final BoringLayout.Metrics GWasM1elztuh() {
        if (!this.AvO7iQsrTN) {
            TextDirectionHeuristic Yi7zF1RB1 = n81.Yi7zF1RB1(this.X1lG3V04pd);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.GWasM1elztuh;
            TextPaint textPaint = this.Yi7zF1RB1;
            this.EljAMC1QTz = i >= 33 ? BoringLayout.isBoring(charSequence, textPaint, Yi7zF1RB1, true, null) : !Yi7zF1RB1.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.AvO7iQsrTN = true;
        }
        return this.EljAMC1QTz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (defpackage.q70.jivtDDk9H(r2, defpackage.e90.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float X1lG3V04pd() {
        if (!Float.isNaN(this.xqGvceK5x)) {
            return this.xqGvceK5x;
        }
        BoringLayout.Metrics GWasM1elztuh = GWasM1elztuh();
        float f = GWasM1elztuh != null ? GWasM1elztuh.width : -1;
        TextPaint textPaint = this.Yi7zF1RB1;
        if (f < 0.0f) {
            f = (float) Math.ceil(Layout.getDesiredWidth(Yi7zF1RB1(), 0, Yi7zF1RB1().length(), textPaint));
        }
        if (f != 0.0f) {
            CharSequence charSequence = this.GWasM1elztuh;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!q70.jivtDDk9H(spanned, f90.class)) {
                }
                f += 0.5f;
            }
        }
        this.xqGvceK5x = f;
        return f;
    }

    public final CharSequence Yi7zF1RB1() {
        CharSequence charSequence = this.encWxUiV2;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        CharSequence charSequence2 = this.GWasM1elztuh;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (q70.jivtDDk9H(spanned, CharacterStyle.class)) {
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
        this.encWxUiV2 = charSequence2;
        return charSequence2;
    }
}
