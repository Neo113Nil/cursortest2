package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class y11 extends CharacterStyle {
    public final int GWasM1elztuh;
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;
    public final float xqGvceK5x;

    public y11(int i, float f, float f2, float f3) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = f;
        this.X1lG3V04pd = f2;
        this.xqGvceK5x = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.xqGvceK5x, this.Yi7zF1RB1, this.X1lG3V04pd, this.GWasM1elztuh);
    }
}
