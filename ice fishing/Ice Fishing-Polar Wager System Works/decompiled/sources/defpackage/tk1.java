package defpackage;

/* loaded from: classes.dex */
public final class tk1 implements android.text.Spannable {
    public boolean adDC3e2L = false;
    public android.text.Spannable xiZrDbcSW0;

    public tk1(android.text.Spannable spannable) {
        this.xiZrDbcSW0 = spannable;
    }

    public final void IHQe1A4L2xu() {
        android.text.Spannable spannable = this.xiZrDbcSW0;
        if (!this.adDC3e2L) {
            if ((android.os.Build.VERSION.SDK_INT < 28 ? new defpackage.c41(13) : new defpackage.sk1(13)).EXtogiMhuM(spannable)) {
                this.xiZrDbcSW0 = new android.text.SpannableString(spannable);
            }
        }
        this.adDC3e2L = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.xiZrDbcSW0.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream chars() {
        return this.xiZrDbcSW0.chars();
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream codePoints() {
        return this.xiZrDbcSW0.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(java.lang.Object obj) {
        return this.xiZrDbcSW0.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(java.lang.Object obj) {
        return this.xiZrDbcSW0.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(java.lang.Object obj) {
        return this.xiZrDbcSW0.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final java.lang.Object[] getSpans(int i, int i2, java.lang.Class cls) {
        return this.xiZrDbcSW0.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.xiZrDbcSW0.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, java.lang.Class cls) {
        return this.xiZrDbcSW0.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(java.lang.Object obj) {
        IHQe1A4L2xu();
        this.xiZrDbcSW0.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(java.lang.Object obj, int i, int i2, int i3) {
        IHQe1A4L2xu();
        this.xiZrDbcSW0.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return this.xiZrDbcSW0.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.xiZrDbcSW0.toString();
    }
}
