package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yc1 extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public final defpackage.xc1 WDYagTQQm9ns;
    public final float oh71FJcDz6S2;
    public final defpackage.pw0 QiMR8OkAhezm = defpackage.w60.hH0RRJrNssvh(new defpackage.ae1(9205357640488583168L));
    public final defpackage.qp P05cfTpS5W5L = defpackage.w60.WmetiUbpKU9I(new defpackage.jc1(2, this));

    public yc1(defpackage.xc1 xc1Var, float f) {
        this.WDYagTQQm9ns = xc1Var;
        this.oh71FJcDz6S2 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        defpackage.h0.fhbmYuu9J3cT(textPaint, this.oh71FJcDz6S2);
        textPaint.setShader((android.graphics.Shader) this.P05cfTpS5W5L.getValue());
    }
}
