package defpackage;

/* loaded from: classes.dex */
public final class yr extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public final defpackage.w70 adDC3e2L;

    public yr(defpackage.w70 w70Var) {
        this.adDC3e2L = w70Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        if (textPaint != null) {
            defpackage.nv nvVar = defpackage.nv.WLpAkxCo;
            defpackage.w70 w70Var = this.adDC3e2L;
            if (defpackage.x70.QoRHpC4k(w70Var, nvVar)) {
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                return;
            }
            if (!(w70Var instanceof defpackage.zc1)) {
                defpackage.db.F7NU4MC0GW();
                return;
            }
            textPaint.setStyle(android.graphics.Paint.Style.STROKE);
            textPaint.setStrokeWidth(((defpackage.zc1) w70Var).WLpAkxCo);
            textPaint.setStrokeMiter(4.0f);
            textPaint.setStrokeJoin(android.graphics.Paint.Join.MITER);
            textPaint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
