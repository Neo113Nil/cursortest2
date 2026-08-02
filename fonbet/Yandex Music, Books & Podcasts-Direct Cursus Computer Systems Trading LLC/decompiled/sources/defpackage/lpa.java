package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lpa extends CharacterStyle implements UpdateAppearance {
    public final kpa a;

    public lpa(kpa kpaVar) {
        this.a = kpaVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            dbc dbcVar = dbc.a;
            kpa kpaVar = this.a;
            if (Intrinsics.d(kpaVar, dbcVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (kpaVar instanceof amr) {
                textPaint.setStyle(Paint.Style.STROKE);
                amr amrVar = (amr) kpaVar;
                textPaint.setStrokeWidth(amrVar.a);
                textPaint.setStrokeMiter(amrVar.b);
                int i = amrVar.d;
                textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i2 = amrVar.c;
                textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                textPaint.setPathEffect(null);
            }
        }
    }
}
