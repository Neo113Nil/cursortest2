package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class y30 extends defpackage.h0 {
    public final java.lang.CharSequence ZVVdXbWmyCSK;
    public final android.text.TextPaint w7APNrr0aGRc;

    public y30(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        this.ZVVdXbWmyCSK = charSequence;
        this.w7APNrr0aGRc = textPaint;
    }

    @Override // defpackage.h0
    public final int OVwOqzUGHcCU(int i) {
        int textRunCursor;
        java.lang.CharSequence charSequence = this.ZVVdXbWmyCSK;
        textRunCursor = this.w7APNrr0aGRc.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        return textRunCursor;
    }

    @Override // defpackage.h0
    public final int w6IV1lieBIux(int i) {
        int textRunCursor;
        java.lang.CharSequence charSequence = this.ZVVdXbWmyCSK;
        textRunCursor = this.w7APNrr0aGRc.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        return textRunCursor;
    }
}
