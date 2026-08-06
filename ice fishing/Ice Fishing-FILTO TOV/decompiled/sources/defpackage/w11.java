package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class w11 extends CharacterStyle implements UpdateAppearance {
    public final float EljAMC1QTz;
    public final v11 OOA6hdeuvCS;
    public final fo0 AvO7iQsrTN = z50.WRKkgoJXwDn(new t21(9205357640488583168L));
    public final ml encWxUiV2 = z50.iwATDS1i01k(new o1(18, this));

    public w11(v11 v11Var, float f) {
        this.OOA6hdeuvCS = v11Var;
        this.EljAMC1QTz = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        vc0.HFYAaqMd6(textPaint, this.EljAMC1QTz);
        textPaint.setShader((Shader) this.encWxUiV2.getValue());
    }
}
