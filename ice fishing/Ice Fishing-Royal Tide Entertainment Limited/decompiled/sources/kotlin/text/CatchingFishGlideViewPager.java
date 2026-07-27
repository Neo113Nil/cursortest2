package kotlin.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class CatchingFishGlideViewPager implements Spannable {
    public Spannable CatchingFishDaggerWebsocket;
    public boolean CatchingFishReduxKtor = false;

    public CatchingFishGlideViewPager(Spannable spannable) {
        this.CatchingFishDaggerWebsocket = spannable;
    }

    public final void CatchingFishParcelableFAB() {
        Spannable spannable = this.CatchingFishDaggerWebsocket;
        if (!this.CatchingFishReduxKtor) {
            if ((Build.VERSION.SDK_INT < 28 ? new CatchingFishMockkViewRoom() : new CatchingFishGsonFluxJUnit()).CatchingFishReduxKtor(spannable)) {
                this.CatchingFishDaggerWebsocket = new SpannableString(spannable);
            }
        }
        this.CatchingFishReduxKtor = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.CatchingFishDaggerWebsocket.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.CatchingFishDaggerWebsocket.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.CatchingFishDaggerWebsocket.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.CatchingFishDaggerWebsocket.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.CatchingFishDaggerWebsocket.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.CatchingFishDaggerWebsocket.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.CatchingFishDaggerWebsocket.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.CatchingFishDaggerWebsocket.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.CatchingFishDaggerWebsocket.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        CatchingFishParcelableFAB();
        this.CatchingFishDaggerWebsocket.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        CatchingFishParcelableFAB();
        this.CatchingFishDaggerWebsocket.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.CatchingFishDaggerWebsocket.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.CatchingFishDaggerWebsocket.toString();
    }
}
