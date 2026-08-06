package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ks1 implements android.text.Spannable {
    public boolean WDYagTQQm9ns = false;
    public android.text.Spannable oh71FJcDz6S2;

    public ks1(android.text.Spannable spannable) {
        this.oh71FJcDz6S2 = spannable;
    }

    public final void ZpBGe2uQfcn8() {
        android.text.Spannable spannable = this.oh71FJcDz6S2;
        if (!this.WDYagTQQm9ns) {
            if ((android.os.Build.VERSION.SDK_INT < 28 ? new defpackage.l21(23) : new defpackage.js1(23)).GE9mJIPrb8gP(spannable)) {
                this.oh71FJcDz6S2 = new android.text.SpannableString(spannable);
            }
        }
        this.WDYagTQQm9ns = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.oh71FJcDz6S2.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream chars() {
        return this.oh71FJcDz6S2.chars();
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream codePoints() {
        return this.oh71FJcDz6S2.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(java.lang.Object obj) {
        return this.oh71FJcDz6S2.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(java.lang.Object obj) {
        return this.oh71FJcDz6S2.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(java.lang.Object obj) {
        return this.oh71FJcDz6S2.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final java.lang.Object[] getSpans(int i, int i2, java.lang.Class cls) {
        return this.oh71FJcDz6S2.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.oh71FJcDz6S2.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, java.lang.Class cls) {
        return this.oh71FJcDz6S2.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(java.lang.Object obj) {
        ZpBGe2uQfcn8();
        this.oh71FJcDz6S2.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(java.lang.Object obj, int i, int i2, int i3) {
        ZpBGe2uQfcn8();
        this.oh71FJcDz6S2.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return this.oh71FJcDz6S2.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.oh71FJcDz6S2.toString();
    }
}
