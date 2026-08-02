package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class x implements Spannable {

    /* renamed from: n, reason: collision with root package name */
    public boolean f4779n = false;

    /* renamed from: u, reason: collision with root package name */
    public Spannable f4780u;

    public x(Spannable spannable) {
        this.f4780u = spannable;
    }

    public final void a() {
        Spannable spannable = this.f4780u;
        if (!this.f4779n) {
            if ((Build.VERSION.SDK_INT < 28 ? new O2.i(13) : new w(13)).n(spannable)) {
                this.f4780u = new SpannableString(spannable);
            }
        }
        this.f4779n = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f4780u.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f4780u.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f4780u.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f4780u.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f4780u.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f4780u.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i4, Class cls) {
        return this.f4780u.getSpans(i, i4, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4780u.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i4, Class cls) {
        return this.f4780u.nextSpanTransition(i, i4, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f4780u.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i4, int i6) {
        a();
        this.f4780u.setSpan(obj, i, i4, i6);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i4) {
        return this.f4780u.subSequence(i, i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4780u.toString();
    }
}
