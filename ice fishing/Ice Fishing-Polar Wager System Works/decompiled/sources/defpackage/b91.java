package defpackage;

/* loaded from: classes.dex */
public final class b91 extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public final defpackage.qt0 AARZUJiTa = defpackage.c80.nBH8hAHy(new defpackage.z91(9205357640488583168L));
    public final defpackage.yn EXtogiMhuM = defpackage.c80.QoRHpC4k(new defpackage.e3(20, this));
    public final defpackage.a91 adDC3e2L;
    public final float xiZrDbcSW0;

    public b91(defpackage.a91 a91Var, float f) {
        this.adDC3e2L = a91Var;
        this.xiZrDbcSW0 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        defpackage.h1.mAr5m2L7gYDP(textPaint, this.xiZrDbcSW0);
        textPaint.setShader((android.graphics.Shader) this.EXtogiMhuM.getValue());
    }
}
