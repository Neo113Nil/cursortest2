package V;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class z implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1256a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f1257b;

    public z(Spannable spannable) {
        this.f1257b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f1257b;
        if (!this.f1256a) {
            if ((Build.VERSION.SDK_INT < 28 ? new S0.e(12) : new y(12)).k(spannable)) {
                this.f1257b = new SpannableString(spannable);
            }
        }
        this.f1256a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f1257b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1257b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1257b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1257b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1257b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1257b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f1257b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1257b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f1257b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f1257b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.f1257b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f1257b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1257b.toString();
    }
}
