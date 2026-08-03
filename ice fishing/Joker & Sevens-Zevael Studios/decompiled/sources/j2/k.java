package j2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3524a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3525b;

    public k(boolean z10, boolean z11) {
        this.f3524a = z10;
        this.f3525b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f3524a);
        textPaint.setStrikeThruText(this.f3525b);
    }
}
