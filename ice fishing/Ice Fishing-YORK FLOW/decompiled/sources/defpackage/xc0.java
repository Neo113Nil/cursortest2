package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xc0 {
    public java.lang.CharSequence P05cfTpS5W5L;
    public boolean QiMR8OkAhezm;
    public final java.lang.CharSequence ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final android.text.TextPaint giKS3J6vZuNy;
    public android.text.BoringLayout.Metrics oh71FJcDz6S2;
    public float JhCgjQRTAOCT = Float.NaN;
    public float WDYagTQQm9ns = Float.NaN;

    public xc0(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i) {
        this.ZpBGe2uQfcn8 = charSequence;
        this.giKS3J6vZuNy = textPaint;
        this.fWTAfUmVKrZq = i;
    }

    public final android.text.BoringLayout.Metrics ZpBGe2uQfcn8() {
        if (!this.QiMR8OkAhezm) {
            android.text.TextDirectionHeuristic giKS3J6vZuNy = defpackage.dn1.giKS3J6vZuNy(this.fWTAfUmVKrZq);
            int i = android.os.Build.VERSION.SDK_INT;
            java.lang.CharSequence charSequence = this.ZpBGe2uQfcn8;
            android.text.TextPaint textPaint = this.giKS3J6vZuNy;
            this.oh71FJcDz6S2 = i >= 33 ? android.text.BoringLayout.isBoring(charSequence, textPaint, giKS3J6vZuNy, true, null) : !giKS3J6vZuNy.isRtl(charSequence, 0, charSequence.length()) ? android.text.BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.QiMR8OkAhezm = true;
        }
        return this.oh71FJcDz6S2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (defpackage.t80.VFeft99leXEK(r2, defpackage.jg0.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float fWTAfUmVKrZq() {
        if (!java.lang.Float.isNaN(this.JhCgjQRTAOCT)) {
            return this.JhCgjQRTAOCT;
        }
        android.text.BoringLayout.Metrics ZpBGe2uQfcn8 = ZpBGe2uQfcn8();
        float f = ZpBGe2uQfcn8 != null ? ZpBGe2uQfcn8.width : -1;
        android.text.TextPaint textPaint = this.giKS3J6vZuNy;
        if (f < 0.0f) {
            f = (float) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(giKS3J6vZuNy(), 0, giKS3J6vZuNy().length(), textPaint));
        }
        if (f != 0.0f) {
            java.lang.CharSequence charSequence = this.ZpBGe2uQfcn8;
            if (charSequence instanceof android.text.Spanned) {
                android.text.Spanned spanned = (android.text.Spanned) charSequence;
                if (!defpackage.t80.VFeft99leXEK(spanned, defpackage.kg0.class)) {
                }
                f += 0.5f;
            }
        }
        this.JhCgjQRTAOCT = f;
        return f;
    }

    public final java.lang.CharSequence giKS3J6vZuNy() {
        java.lang.CharSequence charSequence = this.P05cfTpS5W5L;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        java.lang.CharSequence charSequence2 = this.ZpBGe2uQfcn8;
        if (charSequence2 instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence2;
            if (defpackage.t80.VFeft99leXEK(spanned, android.text.style.CharacterStyle.class)) {
                android.text.style.CharacterStyle[] characterStyleArr = (android.text.style.CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), android.text.style.CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    android.text.SpannableString spannableString = null;
                    for (android.text.style.CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof android.text.style.MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new android.text.SpannableString(charSequence2);
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
        this.P05cfTpS5W5L = charSequence2;
        return charSequence2;
    }
}
