package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jg0 extends android.text.style.MetricAffectingSpan {
    public final float WDYagTQQm9ns;

    public jg0(float f) {
        this.WDYagTQQm9ns = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setLetterSpacing(this.WDYagTQQm9ns);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        textPaint.setLetterSpacing(this.WDYagTQQm9ns);
    }
}
