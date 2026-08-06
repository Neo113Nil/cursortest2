package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yz extends android.text.style.MetricAffectingSpan {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ yz(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((java.lang.String) obj);
                break;
            default:
                textPaint.setTypeface((android.graphics.Typeface) obj);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((java.lang.String) obj);
                break;
            default:
                textPaint.setTypeface((android.graphics.Typeface) obj);
                break;
        }
    }
}
