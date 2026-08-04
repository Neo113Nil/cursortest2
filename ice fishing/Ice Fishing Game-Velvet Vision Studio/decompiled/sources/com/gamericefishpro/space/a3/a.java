package com.gamericefishpro.space.a3;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.gamericefishpro.space.oh.k;
import com.gamericefishpro.space.q1.f;
import com.gamericefishpro.space.q1.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {
    public final com.gamericefishpro.space.q1.c d;

    public a(com.gamericefishpro.space.q1.c cVar) {
        this.d = cVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            f fVar = f.b;
            com.gamericefishpro.space.q1.c cVar = this.d;
            if (Intrinsics.a(cVar, fVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(cVar instanceof g)) {
                throw new k();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            g gVar = (g) cVar;
            textPaint.setStrokeWidth(gVar.b);
            textPaint.setStrokeMiter(gVar.c);
            int i = gVar.e;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = gVar.d;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}
