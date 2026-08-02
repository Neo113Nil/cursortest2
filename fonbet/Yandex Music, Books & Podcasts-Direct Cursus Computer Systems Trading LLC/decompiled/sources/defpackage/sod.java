package defpackage;

import android.text.TextPaint;

/* loaded from: classes.dex */
public final class sod extends zc4 {
    public final CharSequence n;
    public final TextPaint o;

    public sod(CharSequence charSequence, TextPaint textPaint) {
        this.n = charSequence;
        this.o = textPaint;
    }

    @Override // defpackage.zc4
    public final int M(int i) {
        CharSequence charSequence = this.n;
        return this.o.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.zc4
    public final int V(int i) {
        CharSequence charSequence = this.n;
        return this.o.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
