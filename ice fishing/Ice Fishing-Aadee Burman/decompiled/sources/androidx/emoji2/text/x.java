package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class x implements Spannable {

    /* renamed from: n, reason: collision with root package name */
    public boolean f4811n = false;

    /* renamed from: u, reason: collision with root package name */
    public Spannable f4812u;

    public x(Spannable spannable) {
        this.f4812u = spannable;
    }

    public final void a() {
        Spannable spannable = this.f4812u;
        if (!this.f4811n) {
            if ((Build.VERSION.SDK_INT < 28 ? new E3.e() : new w()).z(spannable)) {
                this.f4812u = new SpannableString(spannable);
            }
        }
        this.f4811n = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f4812u.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f4812u.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f4812u.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f4812u.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f4812u.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f4812u.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i6, Class cls) {
        return this.f4812u.getSpans(i, i6, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4812u.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i6, Class cls) {
        return this.f4812u.nextSpanTransition(i, i6, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f4812u.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i6, int i9) {
        a();
        this.f4812u.setSpan(obj, i, i6, i9);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i6) {
        return this.f4812u.subSequence(i, i6);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4812u.toString();
    }
}
