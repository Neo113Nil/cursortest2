package i2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3122a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f3123b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3124c;

    /* renamed from: d, reason: collision with root package name */
    public float f3125d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f3126e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f3127f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3128g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f3129h;

    public f(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f3122a = charSequence;
        this.f3123b = textPaint;
        this.f3124c = i10;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f3128g) {
            TextDirectionHeuristic a6 = l.a(this.f3124c);
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f3122a;
            TextPaint textPaint = this.f3123b;
            this.f3127f = i10 >= 33 ? BoringLayout.isBoring(charSequence, textPaint, a6, true, null) : !a6.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f3128g = true;
        }
        return this.f3127f;
    }

    public final CharSequence b() {
        CharacterStyle[] characterStyleArr;
        CharSequence charSequence = this.f3129h;
        if (charSequence == null) {
            charSequence = this.f3122a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (h.c(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                    bc.b h10 = pc.j.h(characterStyleArr);
                    SpannableString spannableString = null;
                    while (h10.hasNext()) {
                        CharacterStyle characterStyle = (CharacterStyle) h10.next();
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence = spannableString;
                    }
                }
            }
            this.f3129h = charSequence;
        }
        return charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (i2.h.c(r2, j2.e.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float c() {
        if (!Float.isNaN(this.f3125d)) {
            return this.f3125d;
        }
        BoringLayout.Metrics a6 = a();
        float f10 = a6 != null ? a6.width : -1;
        TextPaint textPaint = this.f3123b;
        if (f10 < 0.0f) {
            f10 = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (f10 != 0.0f) {
            CharSequence charSequence = this.f3122a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!h.c(spanned, j2.f.class)) {
                }
                f10 += 0.5f;
            }
        }
        this.f3125d = f10;
        return f10;
    }
}
