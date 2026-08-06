package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class io extends CharacterStyle implements UpdateAppearance {
    public final qj OOA6hdeuvCS;

    public io(qj qjVar) {
        this.OOA6hdeuvCS = qjVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            sr srVar = sr.Mjvvu5DE;
            qj qjVar = this.OOA6hdeuvCS;
            if (o30.rQPn8YBR(qjVar, srVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(qjVar instanceof j61)) {
                o4.xqGvceK5x();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            j61 j61Var = (j61) qjVar;
            textPaint.setStrokeWidth(j61Var.Mjvvu5DE);
            textPaint.setStrokeMiter(j61Var.mE4lRynR);
            int i = j61Var.Y6hRI1cF8;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = j61Var.jivtDDk9H;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
