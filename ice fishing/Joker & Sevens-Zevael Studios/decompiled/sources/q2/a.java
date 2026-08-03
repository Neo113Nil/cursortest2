package q2;

import ac.d;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import h1.c;
import h1.f;
import h1.g;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: g, reason: collision with root package name */
    public final c f5744g;

    public a(c cVar) {
        this.f5744g = cVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            f fVar = f.f2601b;
            c cVar = this.f5744g;
            if (j.a(cVar, fVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(cVar instanceof g)) {
                throw new d();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            g gVar = (g) cVar;
            textPaint.setStrokeWidth(gVar.f2602b);
            textPaint.setStrokeMiter(gVar.f2603c);
            int i10 = gVar.f2605e;
            textPaint.setStrokeJoin(i10 == 0 ? Paint.Join.MITER : i10 == 1 ? Paint.Join.ROUND : i10 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i11 = gVar.f2604d;
            textPaint.setStrokeCap(i11 == 0 ? Paint.Cap.BUTT : i11 == 1 ? Paint.Cap.ROUND : i11 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
