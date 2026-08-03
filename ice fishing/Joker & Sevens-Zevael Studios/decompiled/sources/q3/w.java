package q3;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w implements Spannable {

    /* renamed from: g, reason: collision with root package name */
    public boolean f5801g = false;

    /* renamed from: h, reason: collision with root package name */
    public Spannable f5802h;

    public w(Spannable spannable) {
        this.f5802h = spannable;
    }

    public final void a() {
        Spannable spannable = this.f5802h;
        if (!this.f5801g) {
            if ((Build.VERSION.SDK_INT < 28 ? new u7.d() : new v()).k(spannable)) {
                this.f5802h = new SpannableString(spannable);
            }
        }
        this.f5801g = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f5802h.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f5802h.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f5802h.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f5802h.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f5802h.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f5802h.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.f5802h.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5802h.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f5802h.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f5802h.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f5802h.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f5802h.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f5802h.toString();
    }
}
