package j2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f3520a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3521b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3522c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3523d;

    public j(int i10, float f10, float f11, float f12) {
        this.f3520a = i10;
        this.f3521b = f10;
        this.f3522c = f11;
        this.f3523d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f3523d, this.f3521b, this.f3522c, this.f3520a);
    }
}
