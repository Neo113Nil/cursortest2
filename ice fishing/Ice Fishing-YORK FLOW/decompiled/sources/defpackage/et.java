package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class et extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public final defpackage.dt WDYagTQQm9ns;

    public et(defpackage.dt dtVar) {
        this.WDYagTQQm9ns = dtVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        if (textPaint != null) {
            defpackage.yw ywVar = defpackage.yw.ZpBGe2uQfcn8;
            defpackage.dt dtVar = this.WDYagTQQm9ns;
            if (defpackage.ma0.QiMR8OkAhezm(dtVar, ywVar)) {
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                return;
            }
            if (!(dtVar instanceof defpackage.bh1)) {
                defpackage.h7.T1fB7bDYiVJQ();
                return;
            }
            textPaint.setStyle(android.graphics.Paint.Style.STROKE);
            defpackage.bh1 bh1Var = (defpackage.bh1) dtVar;
            textPaint.setStrokeWidth(bh1Var.ZpBGe2uQfcn8);
            textPaint.setStrokeMiter(bh1Var.giKS3J6vZuNy);
            int i = bh1Var.JhCgjQRTAOCT;
            textPaint.setStrokeJoin(i == 0 ? android.graphics.Paint.Join.MITER : i == 1 ? android.graphics.Paint.Join.ROUND : i == 2 ? android.graphics.Paint.Join.BEVEL : android.graphics.Paint.Join.MITER);
            int i2 = bh1Var.fWTAfUmVKrZq;
            textPaint.setStrokeCap(i2 == 0 ? android.graphics.Paint.Cap.BUTT : i2 == 1 ? android.graphics.Paint.Cap.ROUND : i2 == 2 ? android.graphics.Paint.Cap.SQUARE : android.graphics.Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
