package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class b81 extends CharacterStyle {
    public final boolean GWasM1elztuh;
    public final boolean Yi7zF1RB1;

    public b81(boolean z, boolean z2) {
        this.GWasM1elztuh = z;
        this.Yi7zF1RB1 = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.GWasM1elztuh);
        textPaint.setStrikeThruText(this.Yi7zF1RB1);
    }
}
