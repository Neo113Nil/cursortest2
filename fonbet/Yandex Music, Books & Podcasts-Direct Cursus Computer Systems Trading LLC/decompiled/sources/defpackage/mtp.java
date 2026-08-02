package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes.dex */
public final class mtp extends CharacterStyle implements UpdateAppearance {
    public final ltp a;
    public final float b;
    public final x6k c = szf.g0(new nmq(9205357640488583168L));
    public final zx7 d = szf.U(new kgk(18, this));

    public mtp(ltp ltpVar, float f) {
        this.a = ltpVar;
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        lxe.A(textPaint, this.b);
        textPaint.setShader((Shader) this.d.getValue());
    }
}
