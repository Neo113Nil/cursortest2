package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class af0 implements Spannable {
    public Spannable MdtA4re8;
    public boolean NCTxEWno = false;

    public af0(Spannable spannable) {
        this.MdtA4re8 = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.MdtA4re8.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.MdtA4re8.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.MdtA4re8.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.MdtA4re8.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.MdtA4re8.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.MdtA4re8.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.MdtA4re8.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.MdtA4re8.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.MdtA4re8.nextSpanTransition(i, i2, cls);
    }

    public final void qoPGr6Ce() {
        Spannable spannable = this.MdtA4re8;
        if (!this.NCTxEWno) {
            if ((Build.VERSION.SDK_INT < 28 ? new k00(15) : new ze0(15)).MdtA4re8(spannable)) {
                this.MdtA4re8 = new SpannableString(spannable);
            }
        }
        this.NCTxEWno = true;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        qoPGr6Ce();
        this.MdtA4re8.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        qoPGr6Ce();
        this.MdtA4re8.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.MdtA4re8.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.MdtA4re8.toString();
    }
}
