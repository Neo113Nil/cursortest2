package defpackage;

/* loaded from: classes.dex */
public final class ba0 {
    public boolean AARZUJiTa;
    public java.lang.CharSequence EXtogiMhuM;
    public final java.lang.CharSequence IHQe1A4L2xu;
    public final android.text.TextPaint oh6vYeIP;
    public final int r1MBDhnF;
    public android.text.BoringLayout.Metrics xiZrDbcSW0;
    public float F7NU4MC0GW = Float.NaN;
    public float adDC3e2L = Float.NaN;

    public ba0(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i) {
        this.IHQe1A4L2xu = charSequence;
        this.oh6vYeIP = textPaint;
        this.r1MBDhnF = i;
    }

    public final android.text.BoringLayout.Metrics IHQe1A4L2xu() {
        if (!this.AARZUJiTa) {
            android.text.TextDirectionHeuristic oh6vYeIP = defpackage.sf1.oh6vYeIP(this.r1MBDhnF);
            int i = android.os.Build.VERSION.SDK_INT;
            java.lang.CharSequence charSequence = this.IHQe1A4L2xu;
            android.text.TextPaint textPaint = this.oh6vYeIP;
            this.xiZrDbcSW0 = i >= 33 ? android.text.BoringLayout.isBoring(charSequence, textPaint, oh6vYeIP, true, null) : !oh6vYeIP.isRtl(charSequence, 0, charSequence.length()) ? android.text.BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.AARZUJiTa = true;
        }
        return this.xiZrDbcSW0;
    }

    public final java.lang.CharSequence oh6vYeIP() {
        java.lang.CharSequence charSequence = this.EXtogiMhuM;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        java.lang.CharSequence charSequence2 = this.IHQe1A4L2xu;
        if (charSequence2 instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence2;
            if (defpackage.f70.G3OKOH3wZRC(spanned, android.text.style.CharacterStyle.class)) {
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
        this.EXtogiMhuM = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (defpackage.f70.G3OKOH3wZRC(r2, defpackage.id0.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float r1MBDhnF() {
        if (!java.lang.Float.isNaN(this.F7NU4MC0GW)) {
            return this.F7NU4MC0GW;
        }
        android.text.BoringLayout.Metrics IHQe1A4L2xu = IHQe1A4L2xu();
        float f = IHQe1A4L2xu != null ? IHQe1A4L2xu.width : -1;
        android.text.TextPaint textPaint = this.oh6vYeIP;
        if (f < 0.0f) {
            f = (float) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(oh6vYeIP(), 0, oh6vYeIP().length(), textPaint));
        }
        if (f != 0.0f) {
            java.lang.CharSequence charSequence = this.IHQe1A4L2xu;
            if (charSequence instanceof android.text.Spanned) {
                android.text.Spanned spanned = (android.text.Spanned) charSequence;
                if (!defpackage.f70.G3OKOH3wZRC(spanned, defpackage.jd0.class)) {
                }
                f += 0.5f;
            }
        }
        this.F7NU4MC0GW = f;
        return f;
    }
}
